# API Reference (API参考)

> **代码路径**: `my-docs/architecture/reference/`
> **核心标签**: `#api` `#reference`
> **相关模块**: [modules/infra/](../modules/infra/), [modules/kernel/](../modules/kernel/)

---

## 📋 目录

- [核心API](#核心api)
- [Infra层API](#infra层api)
- [Kernel层API](#kernel层api)
- [Features层API](#features层api)

---

## 🎯 核心API

### ShardingSphereDataSourceFactory

```java
public final class ShardingSphereDataSourceFactory {
    
    /**
     * 创建数据源
     */
    public static DataSource createDataSource(
            Map<String, DataSource> dataSourceMap,
            Collection<RuleConfiguration> ruleConfigs,
            Properties props);
}
```

### ShardingSphereRule

```java
public interface ShardingSphereRule {
    
    /**
     * 获取数据源
     */
    DataSource getDataSource();
    
    /**
     * 判断是否需要分片
     */
    boolean isSharding();
}
```

---

## 🏗️ Infra层API

### SQLParserEngine

```java
public final class SQLParserEngine {
    
    public SQLParserEngine(DatabaseType databaseType, SQLParserMode mode);
    
    public SQLStatement parse(String sql, boolean useCache);
}
```

### RouteEngine

```java
public interface RouteEngine {
    
    RouteResult route(RouteContext routeContext);
}
```

### RewriteEngine

```java
public interface RewriteEngine {
    
    SQLRewriteContext rewrite(SQLStatement statement, RouteResult routeResult);
}
```

---

## 🏛️ Kernel层API

### MetaDataManager

```java
public interface MetaDataManager {
    
    TableMetaData getTableMetaData(String databaseName, String tableName);
    
    void refresh(RefreshMode refreshMode);
}
```

### TransactionManager

```java
public interface TransactionManager {
    
    void begin();
    
    void commit();
    
    void rollback();
    
    TransactionStatus getStatus();
}
```

---

## ⚙️ Features层API

### ShardingRule

```java
public final class ShardingRule implements ShardingSphereRule {
    
    public String doSharding(String tableName, ShardingValue shardingValue);
    
    public Collection<String> getDataSourceNames(String tableName);
}
```

### EncryptRule

```java
public interface EncryptRule {
    
    Object encrypt(String columnName, Object plaintext);
    
    Object decrypt(String columnName, Object ciphertext);
}
```

---

## 🔗 相关文档

- [terminology.md](./terminology.md) - 术语索引
- [data-flow.md](./data-flow.md) - 数据流详解

---

**文档结束**
