# Metadata Manager (元数据管理)

> **代码路径**: `kernel/metadata/`
> **核心标签**: `#metadata` `#schema` `#catalog`
> **相关模块**: [session.md](./session.md)

---

## 📋 目录

- [模块概述](#模块概述)
- [核心功能](#核心功能)
- [元数据类型](#元数据类型)
- [核心接口](#核心接口)

---

## 🎯 模块概述

**元数据管理器** 负责管理数据库元数据和规则元数据。

**核心职责**:
- 表结构元数据存储
- 规则元数据管理
- 元数据缓存与刷新

---

## ⚙️ 核心功能

### 1. 表结构元数据

```java
TableMetaData {
    String name;              // 表名
    List<ColumnMetaData> columns;  // 列信息
    Map<String, IndexMetaData> indexes;  // 索引
    // ...
}
```

### 2. 规则元数据

- 分片规则
- 加密规则
- 读写分离规则

### 3. 数据源元数据

- 数据源配置
- 连接信息

---

## 📦 元数据类型

| 类型 | 说明 |
|------|------|
| `TableMetaData` | 表结构元数据 |
| `ViewMetaData` | 视图元数据 |
| `RuleMetaData` | 规则元数据 |
| `DataSourceMetaData` | 数据源元数据 |

---

## 🔌 核心接口

```java
public interface MetaDataManager {
    
    /**
     * 获取表元数据
     */
    TableMetaData getTableMetaData(String tableName);
    
    /**
     * 刷新元数据
     */
    void refresh(RefreshMode mode);
    
    /**
     * 创建表
     */
    void createTable(TableMetaData metaData);
}
```

---

## 🔗 相关文档

- [session.md](./session.md) - 会话管理
- [reference/terminology.md](../../reference/terminology.md) - 术语索引

---

**文档结束**
