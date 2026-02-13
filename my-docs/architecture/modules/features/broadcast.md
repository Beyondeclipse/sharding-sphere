# Broadcast (广播表)

> **代码路径**: `features/broadcast/`
> **核心标签**: `#broadcast` `#sync` `#replication`
> **相关模块**: [sharding.md](./sharding.md)

---

## 📋 目录

- [模块概述](#模块概述)
- [核心功能](#核心功能)
- [核心接口](#核心接口)

---

## 🎯 模块概述

**广播表** 将表广播到所有数据源，实现数据同步。

**核心职责**:
- 表广播
- 数据同步
- 跨库查询

---

## ⚙️ 核心功能

### 1. 表广播

```
广播表: t_dict
ds0: t_dict ✓
ds1: t_dict ✓
ds2: t_dict ✓
```

### 2. 使用场景

- 字典表
- 配置表
- 枚举表

### 3. 路由策略

- 广播到所有数据源
- 任意数据源可查询

---

## 🔌 核心接口

```java
public interface BroadcastRule {
    
    /**
     * 判断是否广播表
     */
    boolean isBroadcastTable(String tableName);
    
    /**
     * 获取所有数据源
     */
    Collection<String> getAllDataSources();
}
```

---

## 🔗 相关文档

- [sharding.md](./sharding.md) - 数据分片

---

**文档结束**
