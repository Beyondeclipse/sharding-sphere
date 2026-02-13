# Session Manager (会话管理)

> **代码路径**: `kernel/session/`
> **核心标签**: `#session` `#connection` `#state`
> **相关模块**: [transaction.md](./transaction.md), [authority.md](./authority.md)

---

## 📋 目录

- [模块概述](#模块概述)
- [核心功能](#核心功能)
- [核心接口](#核心接口)

---

## 🎯 模块概述

**会话管理器** 负责管理数据库会话状态。

**核心职责**:
- 连接会话管理
- 上下文状态管理
- 资源生命周期管理

---

## ⚙️ 核心功能

### 1. 连接管理

```java
Session {
    Connection getConnection();
    void releaseConnection(Connection conn);
}
```

### 2. 上下文管理

- 全局上下文
- 事务上下文
- 变量上下文

### 3. 资源管理

- 连接池
- 语句缓存

---

## 🔌 核心接口

```java
public interface SessionManager {
    
    /**
     * 获取会话
     */
    Session getSession();
    
    /**
     * 添加连接
     */
    void addConnection(Connection connection);
    
    /**
     * 关闭会话
     */
    void close();
}
```

---

## 🔗 相关文档

- [transaction.md](./transaction.md) - 事务管理
- [authority.md](./authority.md) - 权限管理

---

**文档结束**
