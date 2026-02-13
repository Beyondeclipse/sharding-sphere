# SPI Mechanism (SPI机制)

> **代码路径**: `infra/spi/`
> **核心标签**: `#spi` `#extension` `#plugin`
> **相关模块**: [overview/design-principles.md](../../overview/design-principles.md)

---

## 📋 目录

- [模块概述](#模块概述)
- [SPI核心概念](#spi核心概念)
- [SPI加载器](#spi加载器)
- [使用示例](#使用示例)

---

## 🎯 模块概述

**SPI (Service Provider Interface)** 机制是ShardingSphere实现可插拔架构的核心。

**核心职责**:
- 定义扩展接口
- 动态加载实现
- 插件化管理

---

## 🔌 SPI核心概念

### 1. SPI接口定义

```java
@SPI
public interface ShardingAlgorithm {
    /**
     * 执行分片
     */
    String doSharding(Collection<String> targetNames, Comparable<?> value);
}
```

### 2. SPI实现定义

在 `META-INF/services` 目录下创建文件:

```
META-INF/services/org.apache.shardingsphere.infra.algorithm.ShardingAlgorithm
```

文件内容:
```
org.apache.shardingsphere.infra.algorithm.core.standard.StandardShardingAlgorithm
```

### 3. SPI注解

| 注解 | 说明 |
|------|------|
| `@SPI` | 标记为SPI接口 |
| `@Singleton` | 标记为单例 |

---

## ⚙️ SPI加载器

### TypedSPILoader

类型化SPI加载器。

```java
// 加载SPI实现
ShardingAlgorithm algorithm = TypedSPILoader.getService(
    ShardingAlgorithm.class, 
    "STANDARD"  // 实现名称
);
```

### DatabaseTypedSPILoader

数据库类型SPI加载器。

```java
// 按数据库类型加载
SQLParserEngine engine = DatabaseTypedSPILoader.getService(
    SQLParserEngine.class,
    DatabaseType.MySQL
);
```

### SPILoader

通用SPI加载器。

```java
// 加载所有实现
Collection<ShardingAlgorithm> algorithms = SPILoader.getService(
    ShardingAlgorithm.class
).getInstances();
```

---

## 📝 使用示例

### 定义SPI接口

```java
@SPI
public interface MyCustomAlgorithm {
    /**
     * 执行自定义算法
     */
    Result execute(Input input);
}
```

### 实现SPI

```java
public class MyCustomAlgorithmImpl implements MyCustomAlgorithm {
    
    @Override
    public Result execute(Input input) {
        // 实现逻辑
        return new Result();
    }
}
```

### 注册SPI

创建 `META-INF/services/org.apache.shardingsphere.example.MyCustomAlgorithm`:

```
org.apache.shardingsphere.example.MyCustomAlgorithmImpl
```

### 使用SPI

```java
MyCustomAlgorithm algorithm = TypedSPILoader.getService(
    MyCustomAlgorithm.class,
    "MY_CUSTOM"
);
Result result = algorithm.execute(input);
```

---

## 📋 扩展点列表

| 扩展点 | SPI接口 | 说明 |
|--------|---------|------|
| 分片算法 | `ShardingAlgorithm` | 数据分片策略 |
| 加密算法 | `EncryptAlgorithm` | 数据加密/解密 |
| 负载均衡 | `LoadBalanceAlgorithm` | 读请求负载均衡 |
| 主键生成 | `KeyGenerateAlgorithm` | 分布式主键生成 |
| 脱敏算法 | `MaskAlgorithm` | 数据脱敏策略 |
| 分布式事务 | `TransactionAlgorithm` | 分布式事务协调 |

---

## 🔗 相关文档

- [overview/design-principles.md](../../overview/design-principles.md) - 设计原则
- [reference/terminology.md](../../reference/terminology.md) - 术语索引

---

**文档结束**
