# Route Engine (路由引擎)

> **代码路径**: `infra/route/`
> **核心标签**: `#route` `#routing` `#infrastructure`
> **相关模块**: [SQL Parser](./parser.md) | [Rewrite Engine](./rewrite.md) | [Execute Engine](./executor.md)

---

## 📋 模块概述

**职责**: 基于规则和上下文将SQL路由到目标数据源

**核心能力**:
- 标准路由：基于分片条件的精确路由
- 广播路由：广播到所有数据源
- Hint路由：强制路由指定数据源
- 复合路由：组合多种路由策略

---

## 🎯 核心接口

### RouteEngine

**位置**: `infra/route/engine/RouteEngine.java`

```java
public interface RouteEngine {
    /**
     * 路由SQL
     *
     * @param routeContext 路由上下文
     * @return 路由结果
     */
    RouteResult route(RouteContext routeContext);
}
```

**实现类**:
- `StandardRouteEngine`: 标准路由引擎
- `BroadcastRouteEngine`: 广播路由引擎
- `HintRouteEngine`: Hint路由引擎
- `CompositeRouteEngine`: 复合路由引擎

---

### RouteContext

**位置**: `infra/route/context/RouteContext.java`

```java
public interface RouteContext {
    /**
     * 获取SQL语句
     */
    SQLStatement getSqlStatement();

    /**
     * 获取参数
     */
    List<Object> getParameters();

    /**
     * 获取分片规则
     */
    ShardingRule getShardingRule();
}
```

---

### RouteResult

**位置**: `infra/route/result/RouteResult.java`

```java
public final class RouteResult {
    /**
     * 数据源列表
     */
    private final Collection<String> dataSources;

    /**
     * 实际表映射
     * key: 数据源名称
     * value: 实际表名称列表
     */
    private final Map<String, Collection<String>> actualTables;

    /**
     * 路由单元列表
     */
    private final Collection<RoutingUnit> routingUnits;

    // 添加路由单元
    public void addRouteUnit(String dataSource, String actualTable) {
        dataSources.add(dataSource);
        actualTables.computeIfAbsent(dataSource, k -> new HashSet<>())
                    .add(actualTable);
    }
}
```

---

## 🔄 路由流程

### 完整路由流程

```
┌─────────────────────────────────────────────────────────────┐
│                     路由引擎工作流程                          │
├─────────────────────────────────────────────────────────────┤
│                                                             │
│  SQL输入: SELECT * FROM t_order WHERE user_id = 123        │
│                                                             │
│  步骤1: 条件提取                                             │
│  ├─ 提取路由条件: user_id = 123                              │
│  └─ 解析为 ShardingCondition                                │
│                                                             │
│  步骤2: 规则匹配                                             │
│  ├─ 查找分片规则: t_order 的分片策略                          │
│  ├─ 匹配算法: ModShardingAlgorithm(modulo: 2)              │
│  └─ 确定分片列: user_id                                      │
│                                                             │
│  步骤3: 算法执行                                             │
│  ├─ 计算分片值: 123 % 2 = 1                                 │
│  └─ 得到数据源: ds1                                         │
│                                                             │
│  步骤4: 路由构建                                             │
│  ├─ 创建 RouteResult                                        │
│  ├─ 添加数据源: ds1                                         │
│  ├─ 添加实际表: ds1.t_order_1                               │
│  └─ 构建路由单元                                             │
│                                                             │
│  输出: RouteResult {dataSources: [ds1], tables: [t_order_1]}│
│                                                             │
└─────────────────────────────────────────────────────────────┘
```

---

## 🔧 核心实现

### StandardRouteEngine

**位置**: `infra/route/engine/StandardRouteEngine.java`

```java
public final class StandardRouteEngine implements RouteEngine {

    @Override
    public RouteResult route(final RouteContext routeContext) {
        // 1. 提取路由条件
        ShardingConditions conditions = extractShardingConditions(routeContext);

        // 2. 匹配分片规则
        ShardingRule rule = routeContext.getShardingRule();
        ShardingStrategy strategy = rule.getShardingStrategy();

        // 3. 执行路由
        RouteResult routeResult = new RouteResult();
        for (ShardingCondition condition : conditions) {
            // 计算路由
            Collection<String> dataSources = strategy.route(condition);

            // 构建路由结果
            for (String dataSource : dataSources) {
                String actualTable = getActualTable(rule, condition);
                routeResult.addRouteUnit(dataSource, actualTable);
            }
        }

        return routeResult;
    }
}
```

---

### BroadcastRouteEngine

**位置**: `infra/route/engine/BroadcastRouteEngine.java`

```java
public final class BroadcastRouteEngine implements RouteEngine {

    @Override
    public RouteResult route(final RouteContext routeContext) {
        RouteResult routeResult = new RouteResult();

        // 获取所有数据源
        Collection<String> allDataSources = getAllDataSources(routeContext);

        // 广播到所有数据源
        for (String dataSource : allDataSources) {
            routeResult.addRouteUnit(dataSource, routeContext.getTableName());
        }

        return routeResult;
    }
}
```

---

### HintRouteEngine

**位置**: `infra/route/engine/HintRouteEngine.java`

```java
public final class HintRouteEngine implements RouteEngine {

    @Override
    public RouteResult route(final RouteContext routeContext) {
        // 从Hint获取强制路由信息
        HintManager hintManager = HintManager.getInstance();
        String dataSource = hintManager.getDataSourceName();

        RouteResult routeResult = new RouteResult();
        routeResult.addRouteUnit(dataSource, routeContext.getTableName());

        return routeResult;
    }
}
```

---

## 📊 路由类型对比

| 路由类型 | 触发条件 | 路由结果 | 性能 | 使用场景 |
|---------|---------|---------|------|---------|
| **标准路由** | 分片列条件 | 单/多数据源 | 高 | 常规查询 |
| **广播路由** | 广播表操作 | 所有数据源 | 中 | 字典表、配置表 |
| **Hint路由** | Hint指定 | 指定数据源 | 高 | 强制路由、调试 |
| **复合路由** | 多分片列 | 精确数据源 | 中 | 复杂分片场景 |

---

## 🎨 使用示例

### 示例1：标准路由

```java
// 配置分片规则
ShardingRuleConfiguration ruleConfig = new ShardingRuleConfigurationBuilder()
    .addTableRule(new TableRuleConfigurationBuilder()
        .logicTable("t_order")
        .actualDataNodes("ds${0..1}.t_order_${0..1}")
        .databaseShardingStrategy(new StandardShardingStrategyConfiguration(
            "user_id",
            "mod"
        ))
        .build())
    .addShardingAlgorithm("mod", new ModShardingAlgorithm(2))
    .build();

// 创建路由引擎
RouteEngine routeEngine = new StandardRouteEngine(ruleConfig);

// 执行路由
RouteContext context = new RouteContext(
    parseSQL("SELECT * FROM t_order WHERE user_id = 123"),
    Collections.emptyList()
);
RouteResult result = routeEngine.route(context);

// 结果: dataSources = [ds1], tables = [t_order_1]
```

---

### 示例2：广播路由

```java
// 配置广播表
BroadcastTableRule broadcastRule = new BroadcastTableRule("t_dict");

// 创建路由引擎
RouteEngine routeEngine = new BroadcastRouteEngine(broadcastRule);

// 执行路由
RouteContext context = new RouteContext(
    parseSQL("SELECT * FROM t_dict"),
    Collections.emptyList()
);
RouteResult result = routeEngine.route(context);

// 结果: dataSources = [ds0, ds1, ds2, ...], tables = [t_dict]
```

---

### 示例3：Hint路由

```java
// 设置Hint
HintManager hintManager = HintManager.getInstance();
hintManager.setDataSourceName("ds1");

// 创建路由引擎
RouteEngine routeEngine = new HintRouteEngine();

// 执行路由
RouteContext context = new RouteContext(
    parseSQL("SELECT * FROM t_order"),
    Collections.emptyList()
);
RouteResult result = routeEngine.route(context);

// 结果: dataSources = [ds1], tables = [t_order]
```

---

## ⚡ 性能优化

### 1. 路由缓存

```java
public final class RouteCache {
    private final LoadingCache<RouteCacheKey, RouteResult> cache;

    public RouteCache() {
        this.cache = CacheBuilder.newBuilder()
            .maximumSize(10000)
            .expireAfterWrite(1, TimeUnit.HOURS)
            .build(new CacheLoader<RouteCacheKey, RouteResult>() {
                @Override
                public RouteResult load(RouteCacheKey key) {
                    return doRoute(key);
                }
            });
    }
}
```

---

### 2. 批量路由

```java
public final class BatchRouter {
    public List<RouteResult> batchRoute(final List<RouteContext> contexts) {
        // 批量计算路由，避免重复计算
        Map<ShardingCondition, RouteResult> routeCache = new HashMap<>();
        List<RouteResult> results = new ArrayList<>();

        for (RouteContext context : contexts) {
            ShardingCondition condition = extractCondition(context);
            RouteResult result = routeCache.computeIfAbsent(
                condition,
                this::doRoute
            );
            results.add(result);
        }

        return results;
    }
}
```

---

## 🔍 调试技巧

### 查看路由结果

```java
// 启用SQL日志
Configuration config = Configuration.builder()
    .sqlShow(true)
    .build();

// 路由结果会打印在日志中
// Example:
// Rule Type: sharding
// Actual SQL: ds1 ::: SELECT * FROM t_order_1 WHERE user_id = 123
```

---

## 📚 相关文档

- **上游模块**: [SQL Parser](./parser.md) - 提供SQLStatement
- **下游模块**: [Rewrite Engine](./rewrite.md) - 使用RouteResult
- **相关特性**: [Sharding](../features/sharding.md) - 分片规则配置
- **数据流**: [Data Flow](../../reference/data-flow.md#phase-2-路由规划) - 路由在数据流中的位置

---

## 🏷️ 标签索引

- `#route`: 路由相关
- `#routing`: 路由策略
- `#infrastructure`: 基础设施层
- `#sharding`: 分片相关
- `#performance`: 性能优化
- `#cache`: 缓存机制

---

## 📊 类索引

查看 [.ai-index.yaml](../../.ai-index.yaml) 中的 `class_index` 部分：

- `RouteEngine`
- `RouteContext`
- `RouteResult`
- `StandardRouteEngine`
- `BroadcastRouteEngine`
- `HintRouteEngine`

---

**返回**: [文档导航](../../README.md) | **上一章**: [SQL Parser](./parser.md) | **下一章**: [Rewrite Engine](./rewrite.md)
