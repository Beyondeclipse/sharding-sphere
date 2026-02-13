# Mask (数据脱敏)

> **代码路径**: `features/mask/`
> **核心标签**: `#mask` `#privacy` `#sensitive`
> **相关模块**: [encrypt.md](./encrypt.md)

---

## 📋 目录

- [模块概述](#模块概述)
- [核心功能](#核心功能)
- [脱敏类型](#脱敏类型)
- [核心接口](#核心接口)

---

## 🎯 模块概述

**数据脱敏** 在查询时对敏感数据进行脱敏处理，保护用户隐私。

**核心职责**:
- 查询结果脱敏
- 敏感数据识别
- 隐私保护

---

## ⚙️ 核心功能

### 1. 查询脱敏

```
原始结果: 13812345678
脱敏结果: 138****5678
```

### 2. 脱敏规则

| 脱敏类型 | 示例 | 结果 |
|----------|------|------|
| 手机号 | 13812345678 | 138****5678 |
| 邮箱 | test@example.com | te**@******* |
| 身份证 | 110101199001011234 | 110***********1234 |
| 银行卡 | 6222021234567890 | 6222 **** **** 7890 |

---

## 🔌 核心接口

```java
public interface MaskRule {
    
    /**
     * 脱敏
     */
    Object mask(String columnName, Object value);
    
    /**
     * 判断是否需要脱敏
     */
    boolean isMaskColumn(String columnName);
}

public interface MaskAlgorithm {
    
    /**
     * 脱敏
     */
    String mask(String value);
}
```

---

## 🔗 相关文档

- [encrypt.md](./encrypt.md) - 数据加密

---

**文档结束**
