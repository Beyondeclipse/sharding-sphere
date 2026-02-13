# Executor Engine (执行引擎)

> **代码路径**: `infra/executor/`, `kernel/data-pipeline/executor/`
> **核心标签**: `#executor` `#execute` `#sql`
> **相关模块**: [route.md](./route.md), [rewrite.md](./rewrite.md), [merge.md](./merge.md)

---

## 📋 目录

- [模块概述](#模块概述)
- [执行模式](#执行模式)
- [执行器类型](#执行器类型)
- [核心接口](#核心接口)
- [使用示例](#使用示例)

---

## 🎯 模块概述

**执行引擎 (Executor Engine)** 负责将SQL发送到物理数据库执行并收集结果。

**核心职责**:
- SQL执行
- 结果收集
- 连接管理
- 事务控制

---

## ⚙️ 执行模式

### 1. 串行执行 (Serial Execution)

按顺序执行各数据源。

```
ds0 → ds1 → ds2 → 结果
```

**适用场景**: 
- 数据量小
- 简单查询

### 2. 并行执行 (Parallel Execution)

并发执行多个数据源。

```
ds0 ─┐
ds1 ─┼─→ 结果合并
ds2 ─┘
```

**适用场景**:
- 大数据量
- 高性能要求

### 3. 流式执行 (Stream Execution)

流式处理结果集。

```
ds0 ─→ Stream → 结果
ds1 ─→ Stream → 结果
```

**适用场景**:
- 超大数据集
- 内存敏感场景

---

## 🔧 执行器类型

| 执行器 | 说明 |
|--------|------|
| `JDBCExecutor` | JDBC执行器 |
| `BatchExecutor` | 批量执行器 |
| `PreparedStatementExecutor` | 预编译执行器 |
| `ParallelExecutor` | 并行执行器 |
| `StreamExecutor` | 流式执行器 |

---

## 🔌 核心接口

```java
public interface ExecuteEngine {
    
    /**
     * 执行SQL
     */
    ExecuteResult execute(ExecutionContext context);
    
    /**
     * 批量执行SQL
     */
    ExecuteResult executeBatch(ExecutionContext context);
}

public interface Executor {
    
    /**
     * 执行单元
     */
    Result execute(ExecuteUnit unit);
}
```

### 核心类

| 类名 | 职责 |
|------|------|
| `JDBCExecutor` | JDBC执行实现 |
| `ExecutionGroup` | 执行组管理 |
| `ExecutionContext` | 执行上下文 |
| `ExecuteUnit` | 执行单元 |

---

## 📝 使用示例

### 基本执行

```java
// 创建执行上下文
ExecutionContext context = new ExecutionContext();
context.setSQL("SELECT * FROM t_order_1 WHERE user_id = ?");
context.setParameters(params);
context.setRouteResult(routeResult);

// 执行
ExecuteEngine executor = new JDBCExecutor();
ExecuteResult result = executor.execute(context);

// 获取结果
ResultSet resultSet = result.getResultSet();
```

### 并行执行

```java
// 创建并行执行器
ParallelExecutor executor = new ParallelExecutor(executorService);

// 设置执行组
List<ExecutionGroup<JDBCExecutionUnit>> executionGroups = createExecutionGroups(routeResult);

// 并行执行
ExecuteResult result = executor.execute(executionGroups);
```

---

## 🔗 相关文档

- [route.md](./route.md) - 路由引擎
- [rewrite.md](./rewrite.md) - 重写引擎
- [merge.md](./merge.md) - 合并引擎
- [reference/data-flow.md](../../reference/data-flow.md) - 数据流详解

---

**文档结束**
