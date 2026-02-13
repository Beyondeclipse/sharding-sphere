# Read/Write Splitting (读写分离)

> **代码路径**: `features/readwrite-splitting/`
> **核心标签**: `#readwrite` `#replica` `#load-balance`
> **相关模块**: [sharding.md](./sharding.md)

---

## 📋 目录

- [模块概述](#模块概述)
- [核心功能](#核心功能)
- [负载均衡策略](#负载均衡策略)
- [核心接口](#核心接口)

---

## 🎯 模块概述

**读写分离** 将读请求路由到从库，写请求路由到主库，提升查询性能。

**核心职责**:
- 读/写分离路由
- 从库负载均衡
- 主从同步感知

---

## ⚙️ 核心功能

### 1. 读写分离

```
写请求 → Master (ds0)
        SELECT * FROM t_order WHERE id = 1
        
读请求 → Replica (ds1) / Replica (ds2)
        SELECT * FROM t_order WHERE id = 1
```

### 2. 负载均衡

- 轮询
- 随机
- 权重

### 3. 故障转移

- 主库故障转移
- 从库故障忽略

---

## 🔧 负载均衡策略

| 策略 | 说明 |
|------|------|
| `RoundRobinLoadBalanceAlgorithm` | 轮询 |
| `RandomLoadBalanceAlgorithm` | 随机 |
| `WeightLoadBalanceAlgorithm` | 权重 |

---

## 🔌 核心接口

```java
public interface ReadWriteSplittingRule {
    
    /**
     * 获取数据源
     */
    String getDataSource(String sql);
    
    /**
     * 判断是否为写SQL
     */
    boolean isWriteSQL(String sql);
}

public interface LoadBalanceAlgorithm {
    
    /**
     * 选择数据源
     */
    String select(String name, Collection<String> targetNames);
}
```

---

## 🔗 相关文档

- [sharding.md](./sharding.md) - 数据分片

---

**文档结束**
