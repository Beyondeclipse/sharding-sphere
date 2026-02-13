# Design Patterns (设计模式)

> **代码路径**: `my-docs/architecture/reference/`
> **核心标签**: `#design-pattern `#oop`
> **相关模块` `#pattern`**: [modules/infra/](../modules/infra/)

---

## 📋 目录

- [策略模式](#策略模式)
- [工厂模式](#工厂模式)
- [建造者模式](#建造者模式)
- [访客模式](#访客模式)
- [责任链模式](#责任链模式)

---

## 🎯 策略模式 (Strategy Pattern)

### 应用场景

分片算法、加密算法等

### 代码示例

```java
// 策略接口
public interface ShardingAlgorithm {
    String doSharding(Collection<String> targetNames, Comparable<?> value);
}

// 具体策略
public class ModShardingAlgorithm implements ShardingAlgorithm {
    @Override
    public String doSharding(Collection<String> targetNames, Comparable<?> value) {
        return "t_order_" + (value.hashCode() % targetNames.size());
    }
}

// 使用策略
ShardingAlgorithm algorithm = new ModShardingAlgorithm();
String result = algorithm.doSharding(targets, value);
```

---

## 🏭 工厂模式 (Factory Pattern)

### 应用场景

SQL解析器、执行器创建

### 代码示例

```java
public final class SQLParserEngineFactory {
    
    public static SQLParserEngine getSQLParserEngine(DatabaseType databaseType) {
        return new SQLParserEngine(databaseType, SQLParserMode.STANDARD);
    }
}

// 使用工厂
SQLParserEngine engine = SQLParserEngineFactory.getSQLParserEngine(DatabaseType.MySQL);
```

---

## 🏗️ 建造者模式 (Builder Pattern)

### 应用场景

配置构建、规则构建

### 代码示例

```java
ShardingRuleConfiguration config = ShardingRuleConfigurationBuilder.builder()
    .tableRule(TableRuleConfigurationBuilder.builder()
        .logicTable("t_order")
        .actualDataNodes("ds${0..1}.t_order${0..1}")
        .build())
    .defaultDatabaseStrategy(DefaultDatabaseStrategyConfiguration.builder()
        .shardingColumn("user_id")
        .shardingAlgorithmName("MOD")
        .build())
    .build();
```

---

## 👤 访客模式 (Visitor Pattern)

### 应用场景

AST遍历和处理

### 代码示例

```java
public class SQLVisitor extends SQLBaseVisitor<SQLStatement> {
    
    @Override
    public SQLStatement visitSelectStatement(SelectStatementContext ctx) {
        SelectStatement statement = new SelectStatement();
        statement.setColumns(visitColumns(ctx.columns()));
        statement.setFrom(visitTable(ctx.from()));
        return statement;
    }
}

// 使用访客
SQLVisitor visitor = new SQLVisitor();
SQLStatement statement = visitor.visit(ast);
```

---

## 🔗 责任链模式 (Chain of Responsibility)

### 应用场景

SQL处理流水线

### 代码示例

```java
public class SQLRewriteContext {
    
    private final List<SegmentRewriter> rewriters = new ArrayList<>();
    
    public void addRewriter(SegmentRewriter rewriter) {
        rewriters.add(rewriter);
    }
    
    public void rewrite() {
        for (SegmentRewriter rewriter : rewriters) {
            rewriter.rewrite(segment, routeResult);
        }
    }
}
```

---

## 🔗 相关文档

- [overview/design-principles.md](../overview/design-principles.md) - 设计原则

---

**文档结束**
