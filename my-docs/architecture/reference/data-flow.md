# ShardingSphere 数据流详解

> **代码路径**: `my-docs/architecture/reference/`
> **核心标签**: `#dataflow` `#pipeline` `#sql`
> **相关模块**: [modules/infra/parser.md](../modules/infra/parser.md), [modules/infra/route.md](../modules/infra/route.md), [modules/infra/rewrite.md](../modules/infra/rewrite.md), [modules/infra/executor.md](../modules/infra/executor.md), [modules/infra/merge.md](../modules/infra/merge.md)

---

## 📋 目录

- [完整数据流图](#完整数据流图)
- [SQL处理流水线](#sql处理流水线)
- [详细请求处理流程](#详细请求处理流程)
- [数据流优化策略](#数据流优化策略)

---

## 🌊 完整数据流图

```
┌─────────────────────────────────────────────────────────────────────┐
│                       应用层                                        │
│                     Client Application                              │
│                    (ORM / JDBC / SQL)                              │
└─────────────────────────────────────────────────────────────────────┘
                              │
                              ▼
┌─────────────────────────────────────────────────────────────────────┐
│                   接入层 (JDBC / Proxy)                             │
│  ┌──────────────────────────────────────────────────────┐         │
│  │ Connection Pool & Session Management                  │         │
│  └──────────────────────────────────────────────────────┘         │
└─────────────────────────────────────────────────────────────────────┘
                              │
                              ▼
┌─────────────────────────────────────────────────────────────────────┐
│                   SQL解析层                                         │
│  ┌──────────┐    ┌──────────┐    ┌──────────┐                     │
│  │  Parse   │───▶│  Route   │───▶│ Rewrite  │                     │
│  │  SQL→AST │    │  路由规划│    │ SQL重写  │                     │
│  └──────────┘    └──────────┘    └──────────┘                     │
└─────────────────────────────────────────────────────────────────────┘
                              │
                              ▼
┌─────────────────────────────────────────────────────────────────────┐
│                   执行层                                             │
│  ┌──────────────────────────────────────────────────────┐         │
│  │  Execution Engine (Serial / Parallel / Stream)        │         │
│  └──────────────────────────────────────────────────────┘         │
└─────────────────────────────────────────────────────────────────────┘
                              │
                              ▼
┌─────────────────────────────────────────────────────────────────────┐
│                   合并层                                             │
│  ┌──────────────────────────────────────────────────────┐         │
│  │  Merge Engine (Sort / Group / Aggregate / Stream)    │         │
│  └──────────────────────────────────────────────────────┘         │
└─────────────────────────────────────────────────────────────────────┘
                              │
                              ▼
┌─────────────────────────────────────────────────────────────────────┐
│                   物理数据库层                                       │
│  ┌────────┐  ┌────────┐  ┌────────┐  ┌────────┐                    │
│  │  ds0   │  │  ds1   │  │  ds2   │  │  ...   │                    │
│  └────────┘  └────────┘  └────────┘  └────────┘                    │
└─────────────────────────────────────────────────────────────────────┘
```

---

## ⚙️ SQL处理流水线

### 🔄 完整流水线

```
┌───────────────────────────────────────────────────────────────────┐
│                    SQL处理流水线                                    │
├───────────────────────────────────────────────────────────────────┤
│                                                                   │
│  SQL输入                                                           │
│    │                                                              │
│    ├─▶ [词法分析] SQL → Tokens                                    │
│    │   Tokens: [SELECT, *, FROM, t_order, WHERE, user_id, =, 123]│
│    │                                                              │
│    ├─▶ [语法分析] Tokens → AST                                    │
│    │   AST:                                                       │
│    │   └── SelectStatement                                       │
│    │       ├── columns: [*]                                      │
│    │       ├── table: [t_order]                                   │
│    │       └── where: [user_id = 123]                            │
│    │                                                              │
│    ├─▶ [语义分析] AST → SQLStatement                             │
│    │   SQLStatement: SelectStatement对象                          │
│    │                                                              │
│    ├─▶ [路由规划] SQLStatement → RouteResult                    │
│    │   提取路由条件: user_id = 123                               │
│    │   匹配规则: t_order.table_strategy.sharding-column = user_id│
│    │   算法: user_id % 2                                         │
│    │   执行算法: 123 % 2 = 1                                     │
│    │   路由结果: ds1                                             │
│    │                                                              │
│    ├─▶ [SQL重写] SQLStatement, RouteResult → RewrittenSQL        │
│    │   表名重写: t_order → t_order_1                             │
│    │   列名重写: password → password_encrypt (如有加密)           │
│    │   Output SQL: SELECT * FROM t_order_1 WHERE user_id = 123 │
│    │                                                              │
│    ├─▶ [SQL执行] RewrittenSQL → ExecuteResult                    │
│    │   执行数据源: ds1                                           │
│    │   收集结果: [ResultSet]                                     │
│    │                                                              │
│    ├─▶ [结果合并] [ResultSet] → MergedResultSet                 │
│    │   合并类型: StreamMerge / MemoryMerge                        │
│    │   合并算法: OrderBy / GroupBy / Aggregate / Limit            │
│    │                                                              │
│    └─▶ [结果返回] MergedResultSet → Application                  │
│       应用获取最终结果                                             │
│                                                                   │
└───────────────────────────────────────────────────────────────────┘
```

---

## 📝 详细请求处理流程

### Phase 1: SQL解析 (Parse)

#### 输入
```
SQL: SELECT * FROM t_order WHERE user_id = 123
```

#### 步骤详解

**1.1 词法分析 (Lexical Analysis)**

```
SQL文本 → [Lexer] → Tokens

Input:  SELECT * FROM t_order WHERE user_id = 123
Output:
  [
    SELECT,     // 关键字
    *,          // 通配符
    FROM,       // 关键字
    t_order,    // 标识符
    WHERE,      // 关键字
    user_id,    // 标识符
    =,          // 操作符
    123         // 字面量
  ]
```

**核心代码**:
```java
public final class Lexer {
    public List<Token> scan(String sql) {
        List<Token> tokens = new ArrayList<>();
        Scanner scanner = new Scanner(sql);

        while (scanner.hasNext()) {
            String token = scanner.next();
            tokens.add(createToken(token));
        }

        return tokens;
    }
}
```

---

**1.2 语法分析 (Syntax Analysis)**

```
Tokens → [Parser] → AST

Input:
  [SELECT, *, FROM, t_order, WHERE, user_id, =, 123]

Output: AST (Abstract Syntax Tree)
  SelectStatement
  ├── columns: [WildcardColumn]
  ├── from: SimpleTableSegment(t_order)
  └── where: BinaryOperationExpression
      ├── left: ColumnSegment(user_id)
      ├── operator: ComparisonOperator(=)
      └── right: LiteralExpression(123)
```

**核心代码**:
```java
public final class Parser {
    public ParseTree parse(List<Token> tokens) {
        // 基于ANTLR语法规则解析
        SQLLexer lexer = new SQLLexer(CharStreams.fromString(sql));
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        SQLParser parser = new SQLParser(tokenStream);
        return parser.selectStatement();
    }
}
```

---

**1.3 语义分析 (Semantic Analysis)**

```
AST → [Visitor] → SQLStatement

Input:
  SelectStatement AST

Output:
  SelectStatement {
    columns: [WildcardColumn],
    from: SimpleTableSegment(name: t_order),
    where: BinaryOperationExpression(
        left: ColumnSegment(name: user_id),
        operator: ComparisonOperator(=),
        right: LiteralExpression(value: 123)
    )
  }
```

**核心代码**:
```java
public final class SQLVisitor extends SQLBaseVisitor<SQLStatement> {
    @Override
    public SQLStatement visitSelectStatement(SQLParser.SelectStatementContext ctx) {
        SelectStatement statement = new SelectStatement();
        statement.setColumns(visitColumns(ctx.columns()));
        statement.setFrom(visitTable(ctx.from()));
        statement.setWhere(visitWhere(ctx.where()));
        return statement;
    }
}
```

---

**特性影响**:
- 方言适配：不同数据库语法差异
- 预处理：提取可路由条件
- 优化标记：标记可优化点

---

### Phase 2: 路由规划 (Route)

#### 输入
```
SQLStatement: SELECT * FROM t_order WHERE user_id = 123
```

#### 步骤详解

**2.1 条件提取 (Condition Extraction)**

```
SQLStatement → 提取路由条件

Input:
  WHERE user_id = 123

Output:
  ShardingCondition {
    columnName: user_id,
    operator: =,
    value: 123
  }
```

**核心代码**:
```java
public final class ConditionExtractor {
    public ShardingCondition extract(WhereSegment whereSegment) {
        if (whereSegment instanceof BinaryOperationExpression) {
            BinaryOperationExpression expression = (BinaryOperationExpression) whereSegment;
            return new ShardingCondition(
                expression.getLeft().getColumnName(),
                expression.getOperator(),
                expression.getRight().getValue()
            );
        }
        return null;
    }
}
```

---

**2.2 规则匹配 (Rule Matching)**

```
ShardingCondition → 匹配分片规则

Input:
  ShardingCondition: user_id = 123

匹配规则:
  ShardingRule {
    tables: [
      {
        logicTable: t_order,
        actualDataNodes: ds${0..1}.t_order_${0..1},
        databaseShardingStrategy: {
          shardingColumn: user_id,
          shardingAlgorithm: mod
        }
      }
    ]
  }

Output:
  MatchedRule {
    strategy: StandardShardingStrategy,
    algorithm: ModShardingAlgorithm(modulo: 2)
  }
```

**核心代码**:
```java
public final class RuleMatcher {
    public ShardingTableRule matchTableRule(TableName tableName) {
        return shardingRule.getTables().stream()
            .filter(rule -> rule.getLogicTable().equals(tableName))
            .findFirst()
            .orElse(null);
    }

    public ShardingStrategy matchShardingStrategy(ShardingCondition condition) {
        ShardingTableRule tableRule = matchTableRule(condition.getTableName());
        return tableRule.getDatabaseShardingStrategy();
    }
}
```

---

**2.3 算法执行 (Algorithm Execution)**

```
ShardingCondition + ShardingAlgorithm → 执行分片算法

Input:
  ShardingCondition: user_id = 123
  ShardingAlgorithm: ModShardingAlgorithm(modulo: 2)

执行:
  123 % 2 = 1

Output:
  ShardingValue: 1
```

**核心代码**:
```java
public final class ModShardingAlgorithm implements StandardShardingAlgorithm<Long> {
    private final int shardingCount;

    @Override
    public String doSharding(Long value) {
        return "ds" + (value % shardingCount);
    }
}
```

---

**2.4 路由构建 (Route Building)**

```
ShardingValue → 构建路由结果

Input:
  ShardingValue: 1
  Table: t_order

Output:
  RouteResult {
    dataSources: [ds1],
    tables: [ds1.t_order],
    routingUnits: [
      {
        dataSource: ds1,
        tables: [t_order_1]
      }
    ]
  }
```

**核心代码**:
```java
public final class RouteResult {
    private Collection<String> dataSources;
    private Map<String, Collection<String>> actualTables;

    public void addRouteUnit(String dataSource, String actualTable) {
        dataSources.add(dataSource);
        actualTables.computeIfAbsent(dataSource, k -> new HashSet<>())
                    .add(actualTable);
    }
}
```

---

**特性影响**:
- 分片策略：基于列值或Hint
- 读写分离：主从路由
- 影子库：测试环境路由

---

### Phase 3: SQL重写 (Rewrite)

#### 输入
```
SQLStatement: SELECT * FROM t_order WHERE user_id = 123
RouteResult: ds1.t_order_1
```

#### 步骤详解

**3.1 表名重写 (Table Name Rewriting)**

```
Logic Table → Actual Table

Input:
  Logic Table: t_order
  RouteResult: ds1.t_order_1

Output:
  Actual Table: t_order_1
```

**核心代码**:
```java
public final class TableNameRewriter implements SegmentRewriter {
    @Override
    public boolean isRewrite(SQLSegment segment) {
        return segment instanceof TableSegment;
    }

    @Override
    public void rewrite(SQLSegment segment, RouteResult routeResult) {
        TableSegment tableSegment = (TableSegment) segment;
        String actualTableName = routeResult.getActualTableName(tableSegment.getTableName());
        tableSegment.setTableName(actualTableName);
    }
}
```

---

**3.2 列名重写 (Column Name Rewriting)**

```
Plain Column → Encrypted Column

Input:
  Plain Column: password
  Encrypt Rule: password → password_encrypt

Output:
  Encrypted Column: password_encrypt
```

**核心代码**:
```java
public final class ColumnNameRewriter implements TokenRewriter {
    @Override
    public boolean isRewrite(String token, SQLStatement sqlStatement) {
        EncryptRule encryptRule = sqlStatement.getContext().getEncryptRule();
        return encryptRule.isEncryptedColumn(token);
    }

    @Override
    public String rewrite(String token, SQLStatement sqlStatement) {
        EncryptRule encryptRule = sqlStatement.getContext().getEncryptRule();
        return encryptRule.getCipherColumnName(token);
    }
}
```

---

**3.3 条件重写 (Condition Rewriting)**

```
添加分片键条件（如需要）

Input:
  WHERE user_id = 123

Output:
  WHERE user_id = 123  (可能添加额外条件)
```

---

**3.4 SQL构建 (SQL Building)**

```
Rewritten Components → SQL Text

Input:
  SELECT * FROM t_order_1 WHERE user_id = 123

Output:
  "SELECT * FROM t_order_1 WHERE user_id = 123"
```

**核心代码**:
```java
public final class SQLBuilder {
    public String toSQL(SQLStatement statement, RouteResult routeResult) {
        SQLRewriteContext context = new SQLRewriteContext(statement, routeResult);

        // 添加重写器
        context.addTokenRewriter(new ColumnNameRewriter());
        context.addSegmentRewriter(new TableNameRewriter());
        context.addSegmentRewriter(new WhereClauseRewriter());

        // 构建SQL
        return context.toSQL();
    }
}
```

---

**特性影响**:
- 分片重写：表名、列名
- 加密重写：加密列
- 脱敏重写：脱敏列

---

### Phase 4: SQL执行 (Execute)

#### 输入
```
SQL: SELECT * FROM t_order_1 WHERE user_id = 123
RouteResult: ds1.t_order_1
```

#### 步骤详解

**4.1 执行模式选择 (Execution Mode Selection)**

```
选择执行模式:
- 串行执行 (Serial): 按顺序执行各数据源
- 并行执行 (Parallel): 并发执行多数据源
- 流式执行 (Stream): 流式处理结果集

Input:
  RouteResult: ds1 (单数据源)

Output:
  ExecutionMode: Serial (串行)
```

---

**4.2 执行器创建 (Executor Creation)**

```
创建执行器:
- JDBCExecutor: JDBC执行器
- BatchExecutor: 批量执行器
- PreparedStatementExecutor: 预编译执行器

Input:
  DataSource: ds1
  SQL: SELECT * FROM t_order_1 WHERE user_id = 123

Output:
  PreparedStatement: prepared statement
```

**核心代码**:
```java
public final class JDBCExecutor implements ExecuteEngine {
    @Override
    public ExecuteResult execute(ExecutionContext context) {
        // 获取数据源
        DataSource dataSource = getDataSource(context.getDataSourceName());

        // 创建连接
        Connection connection = dataSource.getConnection();

        // 创建PreparedStatement
        PreparedStatement preparedStatement = connection.prepareStatement(context.getSQL());

        // 设置参数
        setParameters(preparedStatement, context.getParameters());

        // 执行查询
        ResultSet resultSet = preparedStatement.executeQuery();

        // 返回结果
        return new ExecuteResult(resultSet);
    }
}
```

---

**4.3 执行SQL (SQL Execution)**

```
执行数据源: ds1

Input:
  SQL: SELECT * FROM t_order_1 WHERE user_id = 123

Output:
  ResultSet from ds1
```

---

**4.4 结果收集 (Result Collection)**

```
收集执行结果

Input:
  ResultSet from ds1

Output:
  ExecuteResult {
    queryResults: [ResultSet],
    updateCount: 0
  }
```

**核心代码**:
```java
public final class ExecuteResult {
    private List<ResultSet> queryResults;
    private int updateCount;

    public void addResultSet(ResultSet resultSet) {
        queryResults.add(resultSet);
    }
}
```

---

**特性影响**:
- 并行执行：多数据源并发
- 流式执行：大结果集优化
- 事务：分布式事务协调

---

### Phase 5: 结果合并 (Merge)

#### 输入
```
[ResultSet from ds1, ResultSet from ds2, ...]
```

#### 步骤详解

**5.1 结果集收集 (Result Set Collection)**

```
收集各数据源结果

Input:
  [
    ResultSet from ds1,
    ResultSet from ds2,
    ...
  ]

Output:
  MergedResult {
    resultSets: [ResultSet]
  }
```

---

**5.2 合并类型判断 (Merge Type Judgment)**

```
判断合并类型:
- 排序合并 (OrderBy): 有ORDER BY
- 分组合并 (GroupBy): 有GROUP BY
- 聚合合并 (Aggregation): 有聚合函数
- 流式合并 (Stream): 边读取边合并
- 内存合并 (Memory): 全部加载后合并

Input:
  SQL: SELECT * FROM t_order_1 ORDER BY create_time

Output:
  MergeType: OrderByMerge (排序合并)
```

---

**5.3 执行合并 (Execute Merge)**

```
合并算法: StreamMerge / MemoryMerge

Input:
  ResultSets: [ResultSet from ds1, ResultSet from ds2]
  MergeType: OrderByMerge

Output:
  MergedResultSet (已排序)
```

**流式合并示例**:
```java
public final class StreamMergedResult implements MergedResult {
    private final PriorityQueue<ResultQueueEntry> queue;

    public StreamMergedResult(List<ResultSet> resultSets, OrderByItem orderByItem) {
        this.queue = new PriorityQueue<>(Comparator.comparing(entry -> entry.getValue()));
        initQueue(resultSets);
    }

    private void initQueue(List<ResultSet> resultSets) {
        for (int i = 0; i < resultSets.size(); i++) {
            ResultSet resultSet = resultSets.get(i);
            if (resultSet.next()) {
                queue.offer(new ResultQueueEntry(i, resultSet));
            }
        }
    }

    @Override
    public boolean next() {
        if (!queue.isEmpty()) {
            currentEntry = queue.poll();
            return true;
        }
        return false;
    }
}
```

**内存合并示例**:
```java
public final class MemoryMergedResult implements MergedResult {
    private final List<Object[]> rows;

    public MemoryMergedResult(List<ResultSet> resultSets) {
        this.rows = new ArrayList<>();
        for (ResultSet resultSet : resultSets) {
            while (resultSet.next()) {
                Object[] row = extractRow(resultSet);
                rows.add(row);
            }
        }
        sortRows();
    }

    private void sortRows() {
        // 排序逻辑
        Collections.sort(rows, comparator);
    }
}
```

---

**5.4 返回结果 (Return Result)**

```
MergedResultSet → Application

Input:
  MergedResultSet

Output:
  Application接收最终结果
```

---

**特性影响**:
- 排序合并：ORDER BY
- 分组合并：GROUP BY
- 聚合合并：SUM/COUNT等

---

## 🚀 数据流优化策略

### 1. SQL解析优化

**缓存机制**:
- SQL解析结果缓存
- AST缓存
- 避免重复解析

```java
public final class SQLParserCache {
    private final LoadingCache<String, SQLStatement> sqlCache;

    public SQLParserCache() {
        this.sqlCache = CacheBuilder.newBuilder()
            .maximumSize(10000)
            .expireAfterWrite(1, TimeUnit.HOURS)
            .build(new CacheLoader<String, SQLStatement>() {
                @Override
                public SQLStatement load(String sql) {
                    return parser.parse(sql);
                }
            });
    }

    public SQLStatement parse(String sql) {
        return sqlCache.getUnchecked(sql);
    }
}
```

---

### 2. 路由优化

**批量路由**:
```java
public final class BatchRouter {
    public List<RouteResult> batchRoute(List<RouteContext> contexts) {
        // 批量计算路由，减少重复计算
        Map<ShardingCondition, RouteResult> routeCache = new HashMap<>();
        List<RouteResult> results = new ArrayList<>();

        for (RouteContext context : contexts) {
            ShardingCondition condition = context.getShardingCondition();
            RouteResult result = routeCache.computeIfAbsent(condition, this::doRoute);
            results.add(result);
        }

        return results;
    }
}
```

---

### 3. 执行优化

**并行执行**:
```java
public final class ParallelExecutor implements ExecuteEngine {
    private final ExecutorService executorService;

    @Override
    public ExecuteResult execute(ExecutionContext context) {
        List<Future<ExecuteResult>> futures = new ArrayList<>();

        // 并发执行各数据源
        for (ExecutionUnit unit : context.getExecutionUnits()) {
            Future<ExecuteResult> future = executorService.submit(() -> {
                return executeUnit(unit);
            });
            futures.add(future);
        }

        // 收集结果
        List<ExecuteResult> results = new ArrayList<>();
        for (Future<ExecuteResult> future : futures) {
            results.add(future.get());
        }

        return new ExecuteResult(results);
    }
}
```

**流式执行**:
```java
public final class StreamExecutor implements ExecuteEngine {
    @Override
    public Stream<Object> streamExecute(ExecutionContext context) {
        return executionGroups.stream()
            .flatMap(group -> executeGroup(group).stream())
            .flatMap(this::processResultSet);
    }
}
```

---

### 4. 合并优化

**流式合并**:
- 边读取边合并
- 减少内存占用
- 支持大结果集

**内存合并**:
- 全部加载后合并
- 支持复杂排序
- 结果集归并

---

**文档结束**
