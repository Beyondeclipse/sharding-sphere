# Encrypt (数据加密)

> **代码路径**: `features/encrypt/`
> **核心标签**: `#encrypt` `#security` `#cipher`
> **相关模块**: [sharding.md](./sharding.md), [mask.md](./mask.md)

---

## 📋 目录

- [模块概述](#模块概述)
- [核心功能](#核心功能)
- [加密类型](#加密类型)
- [核心接口](#核心接口)

---

## 🎯 模块概述

**数据加密** 负责对敏感数据进行加密存储，实现透明加密。

**核心职责**:
- 列级数据加密
- 密文存储
- 透明查询

---

## ⚙️ 核心功能

### 1. 透明加密

```
应用视角: SELECT password FROM t_user WHERE id = 1
实际执行: SELECT password_cipher FROM t_user_cipher WHERE id = 1
结果返回: password = '123456' (解密后)
```

### 2. 加密算法支持

- AES
- RSA
- SM4 (国密)

### 3. 列类型

| 列类型 | 说明 |
|--------|------|
| 密文列 | 存储加密后的数据 |
| 明文列 | 存储原始数据（可选） |
| 辅助查询列 | 用于辅助查询 |

---

## 🔌 核心接口

```java
public interface EncryptRule {
    
    /**
     * 加密
     */
    Object encrypt(String columnName, Object plaintext);
    
    /**
     * 解密
     */
    Object decrypt(String columnName, Object ciphertext);
    
    /**
     * 判断是否加密列
     */
    boolean isEncryptColumn(String columnName);
}

public interface EncryptAlgorithm {
    
    /**
     * 加密
     */
    String encrypt(String plaintext);
    
    /**
     * 解密
     */
    String decrypt(String ciphertext);
}
```

---

## 📝 使用示例

```java
// 配置加密规则
EncryptRuleConfiguration config = new EncryptRuleConfiguration();
config.addColumn(
    "password",
    ColumnEncryptRuleConfiguration.builder()
        .cipherColumn("password_cipher")
        .encryptAlgorithm(new AESEncryptAlgorithm("key"))
        .build()
);

// 创建加密规则
EncryptRule rule = new EncryptRule(config, Collections.emptyMap());

// 加密
String cipher = rule.encrypt("password", "123456");

// 解密
String plain = rule.decrypt("password", cipher);
```

---

## 🔗 相关文档

- [sharding.md](./sharding.md) - 数据分片
- [mask.md](./mask.md) - 数据脱敏

---

**文档结束**
