# Infrastructure Layer (基础设施层)

> **代码路径**: `my-docs/architecture/modules/infra/`
> **核心标签**: `#infrastructure` `#infra` `#foundation`
> **相关模块**: [modules/kernel/](../kernel/), [modules/features/](../features/)

---

## 📋 目录

- [层概述](#层概述)
- [模块列表](#模块列表)
- [核心功能](#核心功能)

---

## 🏗️ 层概述

**基础设施层 (Infrastructure Layer)** 是ShardingSphere的底层支撑，提供SQL处理、数据转换、扩展机制等核心能力。

**定位**: 
- 为Kernel层提供基础能力
- 实现通用工具组件
- 屏蔽底层技术细节

**设计原则**:
- 高内聚、低耦合
- 可复用、可扩展
- 稳定、高效

---

## 📦 模块列表

| 模块 | 文件 | 描述 | 标签 |
|------|------|------|------|
| **Parser** | [parser.md](./parser.md) | SQL解析器，将SQL文本解析为AST | #parser #sql |
| **Route** | [route.md](./route.md) | 路由引擎，SQL路由决策 | #route #routing |
| **Rewrite** | [rewrite.md](./rewrite.md) | 重写引擎，SQL重写适配 | #rewrite #sql |
| **Executor** | [executor.md](./executor.md) | 执行引擎，SQL执行 | #executor #execute |
| **Merge** | [merge.md](./merge.md) | 合并引擎，结果集合并 | #merge #aggregation |
| **SPI** | [spi.md](./spi.md) | SPI加载机制 | #spi #extension |
| **Algorithm** | [algorithm.md](./algorithm.md) | 算法库 | #algorithm |
| **Expr** | [expr.md](./expr.md) | 表达式引擎 | #expression #evaluation |

---

## 🎯 核心功能

### SQL处理流水线

```
SQL输入 → [Parser] → AST → [Route] → 路由结果 → [Rewrite] → 重写SQL → [Executor] → 执行结果 → [Merge] → 最终结果
```

### 扩展机制

- SPI接口定义
- 动态加载
- 插件化架构

---

## 🔗 相关文档

- [overview/proposal.md](../../overview/proposal.md) - 架构总览
- [overview/design-principles.md](../../overview/design-principles.md) - 设计原则
- [reference/terminology.md](../../reference/terminology.md) - 术语索引
- [reference/data-flow.md](../../reference/data-flow.md) - 数据流详解

---

**文档结束**
