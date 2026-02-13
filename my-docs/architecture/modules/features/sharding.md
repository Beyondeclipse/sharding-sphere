# Sharding (数据分片)

> **代码路径**: `features/sharding/`
> **核心标签**: `#sharding` `#distributed` `#features`
> **相关模块**: [Route Engine](../infra/route.md) | [Encrypt](./encrypt.md) | [Read/Write Splitting](./readwrite-splitting.md)

---

## 📋 特性概述

**职责**: 将数据水平拆分到多个数据源，实现数据库的水平扩展

**核心能力**:
- 分库分表：支持分库、分表、分库+分表
- 分片算法：标准、复合、Hint、Inline等
- 分布式主键：雪花算法、UUID等
- 广播表：全局表配置
- 绑定表：关联表优化

---

## 🎯 核心概念

### 分片架构

```
┌─────────────────────────────────────────────────────────────┐
│                    分片架构示意图                             │
├─────────────────────────────────────────────────────────────┤
│                                                             │
│  逻辑表: t_order                                            │
│                                                             │
│  实际表:                                                    │
│  ┌─────────────────┐  ┌─────────────────┐                 │
│  │     ds0         │  │     ds1         │                 │
│  ├─────────────────┤  ├─────────────────┤                 │
│  │ t_order_0       │  │ t_order_0       │                 │
│  │ t_order_1       │  │ t_order_1       │                 │
│  └─────────────────┘  └─────────────────┘                 │
│                                                             │
│  分片策略:                                                  │
│  - 分库: user_id % 2 → ds0/ds1                             │
│  - 分表: order_id % 2 → t_order_0/t_order_1                │
│                                                             │
└─────────────────────────────────────────────────────────────┘
```

---

### 核心术语

| 术语 | 英文 | 定义 | 示例 |
|------|------|------|------|
| **逻辑表** | Logic Table | 分片的逻辑表名 | `t_order` |
| **实际表** | Actual Table | 物理表名 | `ds0.t_order_0` |
| **分片键** | Sharding Key | 用于分片的列 | `user_id`, `order_id` |
| **分片算法** | Sharding Algorithm | 分片计算算法 | `ModShardingAlgorithm` |
| **分片策略** | Sharding Strategy | 分片规则组合 | `StandardShardingStrategy` |
| **广播表** | Broadcast Table | 全量同步的表 | `t_dict` |
| **绑定表** | Binding Table | 分片规则一致的表组 | `t_order`, `t_order_item` |

---

## 🎯 核心接口

### ShardingRule

**位置**: `features/sharding/api/config/ShardingRule.java`

```java
public interface ShardingRule {
    /**
     * 获取表规则
     */
    ShardingTableRule getTableRule(TableName tableName);

    /**
     * 获取分片算法
     */
    ShardingAlgorithm getShardingAlgorithm(String algorithmName);

    /**
     * 获取分片策略
     */
    ShardingStrategy getShardingStrategy(TableName tableName);
}
```

---

### ShardingAlgorithm

**位置**: `features/sharding/api/sharding/ShardingAlgorithm.java`

```java
public interface ShardingAlgorithm<T extends ShardingCondition> {
    /**
     * 执行分片
     *
     * @param shardingValue 分片值
     * @return 目标数据源或表名集合
     */
    Collection<String> doSharding(ShardingValue<T> shardingValue);
}
```

**实现类型**:
- `StandardShardingAlgorithm`: 标准分片算法
- `ComplexShardingAlgorithm`: 复合分片算法
- `HintShardingAlgorithm`: Hint分片算法
- `InlineShardingAlgorithm`: Inline表达式分片算法

---

### ShardingStrategy

**位置**: `features/sharding/api/strategy/ShardingStrategy.java`

```java
public interface ShardingStrategy {
    /**
     * 获取分片列
     */
    Collection<String> getShardingColumns();

    /**
     * 执行路由
     */
    Collection<String> route(ShardingCondition condition);
}
```

**实现类型**:
- `StandardShardingStrategy`: 标准分片策略（单列）
- `ComplexShardingStrategy`: 复合分片策略（多列）
- `InlineShardingStrategy`: Inline分片策略
- `HintShardingStrategy`: Hint分片策略

---

## 🔧 分片算法

### 1. 标准分片算法

**适用场景**: 单分片列

**代码示例**:
```java
public final class ModShardingAlgorithm implements StandardShardingAlgorithm<Long> {
    private final int shardingCount;

    public ModShardingAlgorithm(final int shardingCount) {
        this.shardingCount = shardingCount;
    }

    @Override
    public String doSharding(final Long value) {
        return String.valueOf(value % shardingCount);
    }
}
```

**配置示例**:
```yaml
shardingAlgorithms:
  mod:
    type: MOD
    props:
      sharding-count: 2
```

---

### 2. 复合分片算法

**适用场景**: 多分片列

**代码示例**:
```java
public final class ComplexModShardingAlgorithm implements ComplexShardingAlgorithm {
    @Override
    public Collection<String> doSharding(final Collection<ShardingValue> shardingValues) {
        // 多列组合计算
        Long userId = getValue(shardingValues, "user_id");
        Long orderId = getValue(shardingValues, "order_id");

        String dataSource = "ds" + (userId % 2);
        String table = "t_order_" + (orderId % 4);

        return Collections.singleton(dataSource + "." + table);
    }
}
```

---

### 3. Inline分片算法

**适用场景**: 简单表达式

**配置示例**:
```yaml
shardingAlgorithms:
  inline:
    type: INLINE
    props:
      algorithm-expression: ds${user_id % 2}
```

---

### 4. Hint分片算法

**适用场景**: 强制路由

**代码示例**:
```java
// 设置Hint
HintManager hintManager = HintManager.getInstance();
hintManager.addDatabaseShardingValue("t_order", "ds1");
hintManager.addTableShardingValue("t_order", "t_order_1");

// 执行SQL
String sql = "SELECT * FROM t_order";
// 路由到: ds1.t_order_1
```

---

## 📊 分片策略对比

| 策略类型 | 分片列数 | 配置复杂度 | 性能 | 适用场景 |
|---------|---------|----------|------|---------|
| **标准分片** | 1 | 低 | 高 | 简单分片场景 |
| **复合分片** | 多 | 中 | 中 | 复杂分片场景 |
| **Inline分片** | 1 | 低 | 高 | 简单表达式 |
| **Hint分片** | 任意 | 低 | 高 | 强制路由 |

---

## 🎨 使用示例

### 完整配置示例

```yaml
# 数据源配置
dataSources:
  ds0: !!com.zaxxer.hikari.HikariDataSource
    driverClassName: com.mysql.jdbc.Driver
    jdbcUrl: jdbc:mysql://localhost:3306/ds0
    username: root
    password:
  ds1: !!com.zaxxer.hikari.HikariDataSource
    driverClassName: com.mysql.jdbc.Driver
    jdbcUrl: jdbc:mysql://localhost:3306/ds1
    username: root
    password:

# 分片规则配置
rules:
  - !SHARDING
    tables:
      t_order:
        actualDataNodes: ds${0..1}.t_order_${0..1}
        databaseStrategy:
          standard:
            shardingColumn: user_id
            shardingAlgorithmName: mod_db
        tableStrategy:
          standard:
            shardingColumn: order_id
            shardingAlgorithmName: mod_table

    shardingAlgorithms:
      mod_db:
        type: MOD
        props:
          sharding-count: 2
      mod_table:
        type: MOD
        props:
          sharding-count: 2

    # 广播表
    broadcastTables:
      - t_dict

    # 绑定表
    bindingTables:
      - t_order,t_order_item
```

---

### Java API示例

```java
// 创建数据源配置
DataSource dataSource0 = createDataSource("ds0");
DataSource dataSource1 = createDataSource("ds1");

// 创建分片规则配置
ShardingRuleConfiguration ruleConfig = new ShardingRuleConfigurationBuilder()
    // 配置t_order表
    .addTableRule(new TableRuleConfigurationBuilder()
        .logicTable("t_order")
        .actualDataNodes("ds${0..1}.t_order_${0..1}")
        .databaseShardingStrategy(new StandardShardingStrategyConfiguration(
            "user_id",
            "mod_db"
        ))
        .tableShardingStrategy(new StandardShardingStrategyConfiguration(
            "order_id",
            "mod_table"
        ))
        .build())
    // 配置分片算法
    .addShardingAlgorithm("mod_db", new ModShardingAlgorithm(2))
    .addShardingAlgorithm("mod_table", new ModShardingAlgorithm(2))
    // 配置广播表
    .broadcastTables("t_dict")
    // 配置绑定表
    .bindingTableGroups("t_order, t_order_item")
    .build();

// 创建ShardingSphere数据源
ShardingSphereDataSource dataSource = ShardingSphereDataSourceFactory.createDataSource(
    createDataSourceMap(),
    Collections.singleton(ruleConfig),
    new Properties()
);
```

---

## 🚀 分布式主键

### 雪花算法

```java
// 配置雪花算法
KeyGenerateConfiguration keyConfig = new KeyGenerateConfigurationBuilder()
    .column("order_id")
    .algorithm(new SnowflakeKeyGenerateAlgorithm())
    .build();

// 使用
String sql = "INSERT INTO t_order (user_id, amount) VALUES (?, ?)";
// order_id自动生成，无需手动设置
```

---

## 💡 高级特性

### 1. 广播表

**用途**: 全量同步的字典表、配置表

```yaml
broadcastTables:
  - t_dict
  - t_config
```

**特点**:
- 写操作广播到所有数据源
- 读操作随机选择一个数据源
- 避免跨库JOIN

---

### 2. 绑定表

**用途**: 分片规则一致的表组

```yaml
bindingTables:
  - t_order,t_order_item
```

**优势**:
- 避免笛卡尔积
- 提升关联查询性能

**示例**:
```
SELECT * FROM t_order o
JOIN t_order_item i ON o.order_id = i.order_id
WHERE o.user_id = 123

路由结果:
- ds0.t_order_0 JOIN ds0.t_order_item_0
- ds1.t_order_1 JOIN ds1.t_order_item_1
(避免跨库JOIN)
```

---

## ⚡ 性能优化

### 1. 分片键索引

```sql
-- 在分片列上创建索引
CREATE INDEX idx_user_id ON t_order_0(user_id);
CREATE INDEX idx_user_id ON t_order_1(user_id);
```

---

### 2. 路由缓存

```yaml
props:
  sql-show: true          # 显示SQL
  check-table-metadata-enabled: true  # 检查元数据
```

---

### 3. 批量操作

```java
// 批量插入
try (Connection conn = dataSource.getConnection();
     PreparedStatement ps = conn.prepareStatement(
         "INSERT INTO t_order (user_id, amount) VALUES (?, ?)"
     )) {

    for (Order order : orders) {
        ps.setLong(1, order.getUserId());
        ps.setBigDecimal(2, order.getAmount());
        ps.addBatch();
    }

    ps.executeBatch();  // 批量执行
}
```

---

## 🔍 调试技巧

### 查看路由结果

```yaml
props:
  sql-show: true
```

日志输出:
```
Logic SQL: SELECT * FROM t_order WHERE user_id = 123
Actual SQL: ds1 ::: SELECT * FROM t_order_1 WHERE user_id = 123
```

---

### 分析路由策略

```java
// 获取路由结果
RouteResult routeResult = routeEngine.route(context);

// 打印路由信息
System.out.println("DataSources: " + routeResult.getDataSources());
System.out.println("Actual Tables: " + routeResult.getActualTables());
```

---

## 🐛 常见问题

### Q1: 路由不正确？

**检查项**:
1. 分片算法配置是否正确
2. 分片列是否匹配
3. 分片键值是否在范围内

---

### Q2: 跨库JOIN性能差？

**解决方案**:
1. 使用绑定表
2. 避免跨库关联
3. 应用层组装数据

---

### Q3: 数据倾斜？

**原因**:
- 分片键分布不均
- 分片算法不合理

**解决方案**:
- 选择合适的分片键
- 使用范围分片或复合分片
- 调整分片数量

---

## 📚 相关文档

- **基础模块**: [Route Engine](../infra/route.md) - 路由实现
- **相关特性**: [Read/Write Splitting](./readwrite-splitting.md) - 读写分离
- **数据流**: [Data Flow](../../reference/data-flow.md) - 完整流程
- **术语**: [Terminology](../../reference/terminology.md#分片术语) - 分片术语

---

## 🏷️ 标签索引

- `#sharding`: 分片相关
- `#distributed`: 分布式
- `#features`: 特性层
- `#route`: 路由相关
- `#performance`: 性能优化
- `#algorithm`: 分片算法

---

## 📊 类索引

查看 [.ai-index.yaml](../../.ai-index.yaml) 中的 `class_index` 部分：

- `ShardingRule`
- `ShardingAlgorithm`
- `ShardingStrategy`
- `ShardingValue`
- `ShardingCondition`

---

**返回**: [文档导航](../../README.md) | **特性层**: [Features 总览](./README.md) | **下一特性**: [Encrypt](./encrypt.md)
