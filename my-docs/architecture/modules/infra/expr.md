# Expression Engine (表达式引擎)

> **代码路径**: `infra/expr/`
> **核心标签**: `#expression` `#evaluation` `#script`
> **相关模块**: [parser.md](./parser.md)

---

## 📋 目录

- [模块概述](#模块概述)
- [表达式类型](#表达式类型)
- [核心接口](#核心接口)
- [使用示例](#使用示例)

---

## 🎯 模块概述

**表达式引擎** 负责计算SQL表达式和分片表达式。

**核心职责**:
- SQL表达式求值
- 分片表达式计算
- 动态表达式支持

---

## 🔄 表达式类型

### 1. 算术表达式

```sql
amount * price
price - discount + tax
```

### 2. 比较表达式

```sql
user_id = 123
age > 18
name LIKE '%test%'
```

### 3. 逻辑表达式

```sql
status = 'ACTIVE' AND type = 'VIP'
is_deleted = 0 OR is_admin = 1
```

### 4. 函数表达式

```sql
SUM(amount)
COUNT(*)
AVG(price)
CONCAT(first_name, last_name)
```

---

## 🔌 核心接口

```java
public interface ExpressionEvaluator {
    
    /**
     * 求值
     */
    Object evaluate(Expression expression, EvaluationContext context);
}

public interface ExpressionParser {
    
    /**
     * 解析表达式
     */
    Expression parse(String expressionString);
}
```

### 核心类

| 类名 | 职责 |
|------|------|
| `ExpressionEngine` | 表达式引擎入口 |
| `ExpressionEvaluator` | 表达式求值器 |
| `ExpressionParser` | 表达式解析器 |
| `GroovyExpressionEvaluator` | Groovy表达式求值 |

---

## 📝 使用示例

### 基本求值

```java
// 解析表达式
ExpressionParser parser = new ExpressionParser();
Expression expr = parser.parse("amount * price");

// 创建求值上下文
EvaluationContext context = new EvaluationContext();
context.setValue("amount", 100);
context.setValue("price", 9.9);

// 求值
ExpressionEvaluator evaluator = new ExpressionEngine();
Object result = evaluator.evaluate(expr, context);
// result = 990
```

### 分片表达式

```java
// 计算分片值
String shardingExpr = "user_id % 2";
ExpressionParser parser = new ExpressionParser();
Expression expression = parser.parse(shardingExpr);

EvaluationContext context = new EvaluationContext();
context.setValue("user_id", 123);

Object shardingValue = evaluator.evaluate(expression, context);
// shardingValue = 1
```

---

## 🔗 相关文档

- [parser.md](./parser.md) - SQL解析器
- [algorithm.md](./algorithm.md) - 算法库

---

**文档结束**
