# Authority Manager (权限管理)

> **代码路径**: `kernel/authority/`
> **核心标签**: `#authority` `#security` `#permission`
> **相关模块**: [session.md](./session.md)

---

## 📋 目录

- [模块概述](#模块概述)
- [核心功能](#核心功能)
- [核心接口](#核心接口)

---

## 🎯 模块概述

**权限管理器** 负责管理用户权限和访问控制。

**核心职责**:
- 用户认证
- 资源授权
- 操作审计

---

## ⚙️ 核心功能

### 1. 用户认证

```java
Authenticator {
    boolean authenticate(Credential credential);
}
```

### 2. 资源授权

```java
Authorizer {
    boolean isAuthorized(Principal principal, Resource resource);
}
```

### 3. 权限模型

- 用户-角色-权限
- 白名单/黑名单

---

## 🔌 核心接口

```java
public interface AuthorityManager {
    
    /**
     * 权限检查
     */
    boolean checkPermission(Principal principal, Permission permission);
    
    /**
     * 获取用户信息
     */
    User getUser(String username);
}
```

---

## 🔗 相关文档

- [session.md](./session.md) - 会话管理
- [reference/terminology.md](../../reference/terminology.md) - 术语索引

---

**文档结束**
