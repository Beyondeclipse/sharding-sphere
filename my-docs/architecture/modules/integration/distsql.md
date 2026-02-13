# DistSQL (分布式SQL)

> **代码路径**: `shardingsphere-distsql/`
> **核心标签**: `#distsql` `#management` `#sql`
> **相关模块**: [jdbc.md](./jdbc.md), [proxy.md](./proxy.md)

---

## 📋 目录

- [模块概述](#模块概述)
- [语法类型](#语法类型)
- [使用示例](#使用示例)

---

## 🎯 模块概述

**DistSQL** 是ShardingSphere特有的分布式SQL语言，用于配置和管理。

**定位**:
- 配置管理
- 规则管理
- 资源管理

---

## ⚙️ 语法类型

### 1. 资源管理

```sql
-- 创建数据源
CREATE DATABASE datasource_0 (
    URL="jdbc:mysql://localhost:3306/ds_0",
    USER="root",
    PASSWORD="password"
);

-- 删除数据源
DROP DATABASE datasource_0;
```

### 2. 规则管理

```sql
-- 创建分片规则
CREATE SHARDING TABLE RULE t_order (
    DATABASES_STRATEGY=(strategy=standard, sharding_column=user_id, sharding_algorithm=mod),
    TABLES_STRATEGY=(strategy=standard, sharding_column=order_id, sharding_algorithm=mod)
);

-- 创建读写分离规则
CREATE READWRITE_SPLITTING RULE (
    READ_RESOURCE=replica_1,
    PROPERTIES(...)
);

-- 删除规则
DROP SHARDING TABLE RULE t_order;
```

### 3. 查询

```sql
-- 查询分片规则
SHOW SHARDING TABLE RULES;

-- 查询数据源
SHOW DATASOURCES;
```

---

## 📝 使用示例

### 通过Proxy执行

```bash
mysql -h localhost -P 3307 -u root -e "SHOW SHARDING TABLE RULES"
```

### 通过JDBC执行

```java
Connection conn = dataSource.getConnection();
Statement stmt = conn.createStatement();
ResultSet rs = stmt.executeQuery("SHOW SHARDING TABLE RULES");
```

---

## 🔗 相关文档

- [jdbc.md](./jdbc.md) - JDBC驱动
- [proxy.md](./proxy.md) - Proxy服务器

---

**文档结束**
