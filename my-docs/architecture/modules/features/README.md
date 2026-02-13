# Features Layer (特性功能层)

> **代码路径**: `my-docs/architecture/modules/features/`
> **核心标签**: `#features` `#sharding` `#encrypt`
> **相关模块**: [modules/kernel/](../kernel/)

---

## 📋 目录

- [层概述](#层概述)
- [模块列表](#模块列表)
- [核心功能](#核心功能)

---

## 🏗️ 层概述

**特性功能层 (Features Layer)** 实现ShardingSphere的数据增强功能。

**定位**:
- 提供可插拔的特性模块
- 实现数据分片、加密、脱敏等能力
- 满足企业级数据治理需求

**设计原则**:
- 插件化架构
- 按需加载
- 互不干扰

---

## 📦 模块列表

| 模块 | 文件 | 描述 | 标签 |
|------|------|------|------|
| **Sharding** | [sharding.md](./sharding.md) | 数据分片 | #sharding #distributed |
| **Encrypt** | [encrypt.md](./encrypt.md) | 数据加密 | #encrypt #security |
| **Read/Write Splitting** | [readwrite-splitting.md](./readwrite-splitting.md) | 读写分离 | #readwrite #performance |
| **Mask** | [mask.md](./mask.md) | 数据脱敏 | #mask #privacy |
| **Shadow** | [shadow.md](./shadow.md) | 影子库 | #shadow #testing |
| **Broadcast** | [broadcast.md](./broadcast.md) | 广播表 | #broadcast #sync |

---

## 🎯 核心功能

### 数据增强能力

- **分片**: 水平扩展数据
- **加密**: 保护敏感数据
- **读写分离**: 提升查询性能
- **脱敏**: 隐私保护
- **影子库**: 测试隔离
- **广播**: 数据同步

---

## 🔗 相关文档

- [overview/proposal.md](../../overview/proposal.md) - 架构总览
- [reference/terminology.md](../../reference/terminology.md) - 术语索引

---

**文档结束**
