# ShardingSphere-Proxy

> **代码路径**: `proxy/`
> **核心标签**: `#proxy` `#server` `#database-proxy`
> **相关模块**: [jdbc.md](./jdbc.md), [distsql.md](./distsql.md)

---

## 📋 目录

- [模块概述](#模块概述)
- [核心特性](#核心特性)
- [部署方式](#部署方式)

---

## 🎯 模块概述

**ShardingSphere-Proxy** 是独立部署的数据库代理服务器。

**定位**:
- 独立进程部署
- 多语言支持
- 集中化管理

---

## ⚙️ 核心特性

### 1. 部署形态

```
┌─────────┐
│  App 1  │ ── MySQL Protocol ──┐
│  App 2  │ ── MySQL Protocol ──┤
│  App 3  │ ── MySQL Protocol ──┼──▶ ┌──────────────┐
└─────────┘                      │  │ ShardingSphere│
                                 │  │    Proxy     │
                                 │  └────┬─────────┘
                                 │       │
                                 │       ▼
                                 │  ┌──────────────┐
                                 └──│   Database   │
                                    └──────────────┘
```

### 2. 核心优势

- **多语言**: 支持任意MySQL/PG客户端
- **集中管理**: 统一配置和运维
- **企业级**: 适合统一数据访问

### 3. 协议支持

- MySQL Protocol
- PostgreSQL Protocol

---

## 🚀 部署方式

### 1. 启动Proxy

```bash
bin/start.sh
```

### 2. 配置

编辑 `conf/server.yaml`:

```yaml
rules:
  - !SHARDING
    tables:
      t_order:
        actualDataNodes: ds_${0..1}.t_order_${0..1}
        databaseStrategy:
          standard:
            shardingColumn: user_id
            shardingAlgorithmName: mod
```

### 3. 连接

```
host: localhost
port: 3307
username: root
password: 
```

---

## 🔗 相关文档

- [jdbc.md](./jdbc.md) - JDBC驱动
- [distsql.md](./distsql.md) - DistSQL

---

**文档结束**
