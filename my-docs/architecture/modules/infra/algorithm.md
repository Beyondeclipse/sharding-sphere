# Algorithm Library (算法库)

> **代码路径**: `infra/algorithm/`
> **核心标签**: `#algorithm` `#sharding`
> **相关模块**: [spi.md](./spi.md), [route.md](./route.md)

---

## 📋 目录

- [模块概述](#模块概述)
- [分片算法](#分片算法)
- [其他算法](#其他算法)
- [使用示例](#使用示例)

---

## 🎯 模块概述

**算法库** 提供ShardingSphere各种核心算法的实现。

**核心职责**:
- 分片算法实现
- 负载均衡算法实现
- 主键生成算法实现

---

## ⚙️ 分片算法

### 1. 标准分片算法 (Standard Sharding)

基于单一分片键的分片。

```java
public class StandardShardingAlgorithm<T extends Comparable<?>> 
    implements ShardingAlgorithm<T> {
    
    @Override
    public String doSharding(Collection<String> targetNames, T shardingValue) {
        // 计算分片
    }
}
```

**内置实现**:
- `ModShardingAlgorithm`: 取模分片
- `HashModShardingAlgorithm`: 哈希取模分片
- `InlineShardingAlgorithm`: 内联表达式分片

### 2. 复合分片算法 (Complex Sharding)

基于多个分片键的分片。

```java
public class ComplexShardingAlgorithm implements ShardingAlgorithm<ShardingValue> {
    
    @Override
    public String doSharding(Collection<String> targetNames, ShardingValue shardingValue) {
        // 多键分片计算
    }
}
```

### 3. Hint分片算法 (Hint Sharding)

基于Hint强制分片。

```java
public class HintShardingAlgorithm implements ShardingAlgorithm<ShardingValue> {
    
    @Override
    public String doSharding(Collection<String> targetNames, ShardingValue shardingValue) {
        // Hint强制路由
    }
}
```

---

## 🔧 其他算法

### 负载均衡算法

| 算法 | 说明 |
|------|------|
| `RoundRobinLoadBalanceAlgorithm` | 轮询 |
| `RandomLoadBalanceAlgorithm` | 随机 |
| `WeightLoadBalanceAlgorithm` | 权重 |

### 主键生成算法

| 算法 | 说明 |
|------|------|
| `SnowflakeKeyGenerateAlgorithm` | 雪花算法 |
| `UUIDKeyGenerateAlgorithm` | UUID |

### 脱敏算法

| 算法 | 说明 |
|------|------|
| `MaskAlgorithm` | 通用脱敏 |
| `PhoneMaskAlgorithm` | 手机号脱敏 |
| `EmailMaskAlgorithm` | 邮箱脱敏 |

---

## 📝 使用示例

### 使用分片算法

```java
// 配置分片规则
ShardingRuleConfiguration ruleConfig = new ShardingRuleConfiguration();
ruleConfig.setDefaultShardingStrategy(
    StandardShardingStrategyConfiguration.builder()
        .shardingColumn("user_id")
        .shardingAlgorithmName("MOD")
        .build()
);

// 注册算法
Map<String, ShardingAlgorithm> algorithms = new HashMap<>();
algorithms.put("MOD", new ModShardingAlgorithm(2));

// 创建分片规则
ShardingRule rule = new ShardingRule(ruleConfig, dataSources);

// 执行分片
String targetTable = rule.doSharding("t_order", 123L);
```

### 自定义算法

```java
public class MyCustomShardingAlgorithm implements StandardShardingAlgorithm<Long> {
    
    @Override
    public String doSharding(Collection<String> targetNames, Long shardingValue) {
        // 自定义分片逻辑
        return "t_order_" + (shardingValue % targetNames.size());
    }
}
```

---

## 🔗 相关文档

- [spi.md](./spi.md) - SPI机制
- [route.md](./route.md) - 路由引擎

---

**文档结束**
