# Shadow (影子库)

> **代码路径**: `features/shadow/`
> **核心标签**: `#shadow` `#testing` `#production`
> **相关模块**: [sharding.md](./sharding.md)

---

## 📋 目录

- [模块概述](#模块概述)
- [核心功能](#核心功能)
- [核心接口](#核心接口)

---

## 🎯 模块概述

**影子库** 用于测试环境，通过将测试流量路由到影子库实现数据隔离。

**核心职责**:
- 测试数据隔离
- 影子表路由
- 压测数据标记

---

## ⚙️ 核心功能

### 1. 影子库路由

```
生产请求 → ds_prod.t_order
测试请求 → ds_shadow.t_order (影子库)
```

### 2. 影子表

- 标记为影子表
- 路由到影子库

### 3. Hint标记

```
通过Hint标记测试请求
Hint: sharding-sphere-shadow=true
```

---

## 🔌 核心接口

```java
public interface ShadowRule {
    
    /**
     * 判断是否影子表
     */
    boolean isShadowTable(String tableName);
    
    /**
     * 获取影子数据源
     */
    String getShadowDataSource(String originalDataSource);
}
```

---

## 🔗 相关文档

- [sharding.md](./sharding.md) - 数据分片

---

**文档结束**
