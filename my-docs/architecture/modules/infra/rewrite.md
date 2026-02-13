# Rewrite Engine (重写引擎)

> **代码路径**: `infra/rewrite/`, `kernel/data-pipeline/rewrite/`
> **核心标签**: `#rewrite` `#sql` `#rewriting`
> **相关模块**: [parser.md](./parser.md), [route.md](./route.md), [executor.md](./executor.md)

---

## 📋 目录

- [模块概述](#模块概述)
- [核心功能](#核心功能)
- [重写类型](#重写类型)
- [核心接口](#核心接口)
- [使用示例](#使用示例)

---

## 🎯 模块概述

**重写引擎 (Rewrite Engine)** 负责将SQL重写为适配分片、加密等特性的目标SQL。

**核心职责**:
- 表名重写：将逻辑表名重写为实际表名
- 列名重写：将明文列名重写为密文列名（加密场景）
- 条件重写：添加分片键条件
- SQL构建：将重写后的片段构建为完整SQL

---

## ⚙️ 核心功能

### 1. 表名重写

```
Logic Table → Actual Table

Input:
  Logic Table: t_order
  RouteResult: ds1.t_order_1

Output:
  Actual Table: t_order_1
```

### 2. 列名重写

```
Plain Column → Encrypted Column

Input:
  Plain Column: password
  Encrypt Rule: password → password_encrypt

Output:
  Encrypted Column: password_encrypt
```

### 3. 条件重写

- 添加分片键条件
- 优化查询条件

### 4. SQL构建

- Token拼接
- SQL片段组装

---

## 🔄 重写类型

### 1. Token重写

- 标识符重写
- 关键字重写

### 2. Segment重写

- 表名片段重写
- 列名片段重写
- WHERE条件重写

### 3. SQLBuilder重写

- SQL组装
- 语法补全

---

## 🔌 核心接口

```java
public interface SegmentRewriter {
    /**
     * 判断是否需要重写
     */
    boolean isRewrite(SQLSegment segment);
    
    /**
     * 执行重写
     */
    void rewrite(SQLSegment segment, RouteResult routeResult);
}

public interface TokenRewriter {
    /**
     * 判断是否需要重写
     */
    boolean isRewrite(String token, SQLStatement sqlStatement);
    
    /**
     * 执行重写
     */
    String rewrite(String token, SQLStatement sqlStatement);
}
```

### 核心类

| 类名 | 职责 |
|------|------|
| `SQLRewriteEngine` | 重写引擎入口 |
| `SQLRewriteContext` | 重写上下文 |
| `TableNameRewriter` | 表名重写器 |
| `ColumnNameRewriter` | 列名重写器 |
| `WhereClauseRewriter` | WHERE子句重写器 |
| `SQLBuilder` | SQL构建器 |

---

## 📝 使用示例

### 基本使用

```java
// 创建重写上下文
SQLRewriteContext context = new SQLRewriteContext(statement, routeResult);

// 添加重写器
context.addTokenRewriter(new ColumnNameRewriter());
context.addSegmentRewriter(new TableNameRewriter());
context.addSegmentRewriter(new WhereClauseRewriter());

// 执行重写
context.rewrite();

// 获取重写后的SQL
String rewrittenSQL = context.toSQL();
```

### 自定义重写器

```java
public class CustomRewriter implements SegmentRewriter {
    
    @Override
    public boolean isRewrite(SQLSegment segment) {
        return segment instanceof CustomSegment;
    }
    
    @Override
    public void rewrite(SQLSegment segment, RouteResult routeResult) {
        CustomSegment customSegment = (CustomSegment) segment;
        // 自定义重写逻辑
    }
}
```

---

## 🔗 相关文档

- [parser.md](./parser.md) - SQL解析器
- [route.md](./route.md) - 路由引擎
- [executor.md](./executor.md) - 执行引擎
- [reference/data-flow.md](../../reference/data-flow.md) - 数据流详解

---

**文档结束**
