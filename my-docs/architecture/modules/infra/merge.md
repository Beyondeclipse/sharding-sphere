# Merge Engine (合并引擎)

> **代码路径**: `infra/merge/`
> **核心标签**: `#merge` `#aggregation` `#result`
> **相关模块**: [executor.md](./executor.md)

---

## 📋 目录

- [模块概述](#模块概述)
- [合并类型](#合并类型)
- [合并器类型](#合并器类型)
- [核心接口](#核心接口)
- [使用示例](#使用示例)

---

## 🎯 模块概述

**合并引擎 (Merge Engine)** 负责将多数据源返回的结果集进行合并。

**核心职责**:
- 结果集收集
- 排序合并
- 分组合并
- 聚合计算

---

## 🔄 合并类型

### 1. 流式合并 (Stream Merge)

边读取边合并，内存占用低。

```
ds0 ─→ [读取] ─┐
ds1 ─→ [读取] ─┼─→ 排序输出
ds2 ─→ [读取] ─┘
```

**优点**:
- 内存占用低
- 适合大数据集

**适用场景**:
- ORDER BY
- 大结果集

### 2. 内存合并 (Memory Merge)

全部加载后合并。

```
ds0 ─→ [全部加载] ─┐
ds1 ─→ [全部加载] ─┼─→ 内存排序 → 输出
ds2 ─→ [全部加载] ─┘
```

**优点**:
- 支持复杂排序
- 灵活度高

**适用场景**:
- 复杂聚合
- 多维度排序

### 3. 装饰合并 (Decorator Merge)

对结果集进行装饰处理。

---

## 🔧 合并器类型

| 合并器 | 说明 |
|--------|------|
| `OrderByMergeUnit` | 排序合并 |
| `GroupByMergeUnit` | 分组合并 |
| `AggregationMergeUnit` | 聚合合并 |
| `LimitMergeUnit` | 分页合并 |
| `StreamMergeUnit` | 流式合并 |
| `MemoryMergeUnit` | 内存合并 |

---

## 🔌 核心接口

```java
public interface MergeEngine {
    
    /**
     * 合并结果集
     */
    MergedResult merge(ListSets, SQL<ResultSet> resultStatement statement);
}

public interface MergeUnit {
    
    /**
     * 获取下一条记录
     */
    boolean next();
    
    /**
     * 获取当前记录
     */
    Object getCurrent();
}
```

### 核心类

| 类名 | 职责 |
|------|------|
| `StreamMergedResult` | 流式合并结果 |
| `MemoryMergedResult` | 内存合并结果 |
| `OrderByMergeEngine` | 排序合并引擎 |
| `GroupByMergeEngine` | 分组合并引擎 |
| `AggregationMergeEngine` | 聚合合并引擎 |

---

## 📝 使用示例

### 流式合并

```java
// 创建流式合并器
StreamMergedResult result = new StreamMergedResult(resultSets, orderByItem);

// 逐条获取
while (result.next()) {
    Object row = result.getCurrent();
    // 处理结果
}
```

### 内存合并

```java
// 创建内存合并器
MemoryMergedResult result = new MemoryMergedResult(resultSets, groupByColumns);

// 排序
result.sort();

// 获取所有结果
List<Object> rows = result.getRows();
```

---

## 🔗 相关文档

- [executor.md](./executor.md) - 执行引擎
- [reference/data-flow.md](../../reference/data-flow.md) - 数据流详解

---

**文档结束**
