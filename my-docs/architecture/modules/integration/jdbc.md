# ShardingSphere-JDBC

> **代码路径**: `jdbc/`
> **核心标签**: `#jdbc` `#driver` `#client`
> **相关模块**: [proxy.md](./proxy.md), [distsql.md](./distsql.md)

---

## 📋 目录

- [模块概述](#模块概述)
- [核心特性](#核心特性)
- [使用方式](#使用方式)

---

## 🎯 模块概述

**ShardingSphere-JDBC** 是轻量级JDBC驱动，以JAR包形式提供服务端能力。

**定位**:
- 客户端直连
- 高性能
- 零外部部署

---

## ⚙️ 核心特性

### 1. 部署形态

```
┌─────────┐
│  App    │
│  JAR    │
└────┬────┘
     │ JDBC
     ▼
┌──────────────┐
│ ShardingSphere│
│   JDBC       │
│  (Driver)    │
└────┬─────────┘
     │ 
     ▼
┌──────────────┐
│   Database   │
└──────────────┘
```

### 2. 核心优势

- **高性能**: 零网络跳转
- **低开销**: 直接数据库连接
- **零部署**: JAR包即用

### 3. 兼容性

- 兼容所有ORM框架
- 标准JDBC接口

---

## 📝 使用方式

### 1. 引入依赖

```xml
<dependency>
    <groupId>org.apache.shardingsphere</groupId>
    <artifactId>shardingsphere-jdbc-core</artifactId>
    <version>5.5.3</version>
</dependency>
```

### 2. 配置数据源

```java
Map<String, DataSource> dataSourceMap = createDataSources();

// 创建规则配置
ShardingRuleConfiguration ruleConfig = new ShardingRuleConfiguration();
ruleConfig.getTables().add(...);

// 创建ShardingSphere数据源
DataSource dataSource = ShardingSphereDataSourceFactory.createDataSource(
    dataSourceMap, 
    Collections.singleton(ruleConfig), 
    props
);

// 使用数据源
Connection conn = dataSource.getConnection();
```

---

## 🔗 相关文档

- [proxy.md](./proxy.md) - Proxy服务器
- [distsql.md](./distsql.md) - DistSQL

---

**文档结束**
