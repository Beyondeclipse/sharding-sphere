# Transaction Manager (事务管理)

> **代码路径**: `kernel/transaction/`
> **核心标签**: `#transaction` `#acid` `#xa`
> **相关模块**: [session.md](./session.md)

---

## 📋 目录

- [模块概述](#模块概述)
- [事务类型](#事务类型)
- [核心接口](#核心接口)

---

## 🎯 模块概述

**事务管理器** 负责管理分布式事务和本地事务。

**核心职责**:
- 事务生命周期管理
- 分布式事务协调
- 事务隔离级别控制

---

## 🔄 事务类型

### 1. 本地事务

单数据源事务。

```java
LocalTransaction {
    // 单数据源事务
}
```

### 2. XA事务

两阶段提交事务。

```
Prepare Phase:
  App → TM → XA Resource 1 (Prepare)
  App → TM → XA Resource 2 (Prepare)

Commit Phase:
  App → TM → XA Resource 1 (Commit)
  App → TM → XA Resource 2 (Commit)
```

### 3. BASE柔性事务

最终一致性事务。

---

## 🔌 核心接口

```java
public interface TransactionManager {
    
    /**
     * 开始事务
     */
    void begin();
    
    /**
     * 提交事务
     */
    void commit();
    
    /**
     * 回滚事务
     */
    void rollback();
    
    /**
     * 获取事务状态
     */
    TransactionStatus getStatus();
}
```

---

## 🔗 相关文档

- [session.md](./session.md) - 会话管理
- [reference/terminology.md](../../reference/terminology.md) - 术语索引

---

**文档结束**
