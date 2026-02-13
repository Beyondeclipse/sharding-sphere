# Kernel Layer (核心内核层)

> **代码路径**: `my-docs/architecture/modules/kernel/`
> **核心标签**: `#kernel` `#core` `#pipeline`
> **相关模块**: [modules/infra/](../infra/), [modules/features/](../features/)

---

## 📋 目录

- [层概述](#层概述)
- [模块列表](#模块列表)
- [核心功能](#核心功能)

---

## 🏗️ 层概述

**核心内核层 (Kernel Layer)** 是ShardingSphere的核心处理层，实现SQL处理的核心流程。

**定位**:
- 编排SQL处理流水线
- 管理元数据和状态
- 提供事务和权限控制

**设计原则**:
- 流程标准化
- 职责单一化
- 可编排化

---

## 📦 模块列表

| 模块 | 文件 | 描述 | 标签 |
|------|------|------|------|
| **Metadata** | [metadata.md](./metadata.md) | 元数据管理 | #metadata #schema |
| **Transaction** | [transaction.md](./transaction.md) | 事务管理 | #transaction #acid |
| **Session** | [session.md](./session.md) | 会话管理 | #session #state |
| **Authority** | [authority.md](./authority.md) | 权限管理 | #authority #security |

---

## 🎯 核心功能

### SQL处理流水线

```
SQL → Parse → Route → Rewrite → Execute → Merge → Result
```

### 元数据管理

- 表结构元数据
- 规则元数据
- 数据源元数据

### 状态管理

- 会话状态
- 事务状态
- 连接状态

---

## 🔗 相关文档

- [overview/proposal.md](../../overview/proposal.md) - 架构总览
- [reference/terminology.md](../../reference/terminology.md) - 术语索引
- [reference/data-flow.md](../../reference/data-flow.md) - 数据流详解

---

**文档结束**
