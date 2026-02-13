# ShardingSphere 设计原则

> **代码路径**: `my-docs/architecture/overview/`
> **核心标签**: `#design` `#principles` `#solid`
> **相关模块**: [overview/proposal.md](./proposal.md)

---

## 📋 目录

- [核心设计原则](#核心设计原则)
- [架构原则](#架构原则)
- [代码组织原则](#代码组织原则)
- [扩展性原则](#扩展性原则)

---

## 🏗️ 核心设计原则

### 1. SOLID原则

ShardingSphere全面遵循SOLID原则，确保代码的高内聚、低耦合：

#### 1.1 单一职责 (Single Responsibility Principle)

**定义**: 每个类、模块只负责一项功能。

**应用**:
- `RouteEngine` 只负责路由决策
- `RewriteEngine` 只负责SQL重写
- `ExecutorEngine` 只负责SQL执行
- 每个Feature模块独立实现特定功能

#### 1.2 开闭原则 (Open-Closed Principle)

**定义**: 对扩展开放，对修改关闭。

**应用**:
- 通过SPI机制扩展新功能，无需修改核心代码
- 新增分片算法只需实现 `ShardingAlgorithm` 接口
- 新增加密算法只需实现 `EncryptAlgorithm` 接口

```java
// 扩展示例：新增分片算法
public class MyCustomShardingAlgorithm implements StandardShardingAlgorithm<Long> {
    @Override
    public String doSharding(Collection<String> availableTargetNames, Long shardingValue) {
        // 自定义分片逻辑
        return "t_order_" + (shardingValue % availableTargetNames.size());
    }
}
```

#### 1.3 里氏替换 (Liskov Substitution Principle)

**定义**: 子类可以替换父类而不影响程序正确性。

**应用**:
- SPI实现可以相互替换
- `ShardingAlgorithm` 的所有实现可以相互替换
- `RouteEngine` 的不同路由策略可以相互替换

#### 1.4 接口隔离 (Interface Segregation Principle)

**定义**: 使用多个专门的接口比使用单一的总接口更好。

**应用**:
- 分离 `ShardingRule` 和 `EncryptRule`
- 分离读操作和写操作接口
- 分离不同数据库的方言接口

```java
// 专门的接口
public interface ShardingAlgorithm {
    Comparable<?> doSharding(Collection<String> availableTargetNames, Comparable<?> shardingValue);
}

public interface EncryptAlgorithm {
    Object encrypt(Object plaintext);
    Object decrypt(Object ciphertext);
}
```

#### 1.5 依赖倒置 (Dependency Inversion Principle)

**定义**: 依赖抽象而非具体实现。

**应用**:
- 依赖接口 `RouteEngine` 而非具体实现
- 依赖SPI加载器而非直接实例化
- 使用依赖注入管理组件生命周期

```java
// 依赖抽象
public class ShardingRouter {
    private final RouteEngine routeEngine;
    
    public ShardingRouter(RouteEngine routeEngine) {
        this.routeEngine = routeEngine;  // 依赖抽象
    }
}
```

---

### 2. DRY原则 (Don't Repeat Yourself)

**定义**: 不要重复你自己，避免代码重复。

**应用**:

#### 2.1 提取公共逻辑

```
infra/common/          # 公共工具类
infra/parser/         # SQL解析公共能力
infra/route/          # 路由公共能力
```

#### 2.2 复用基础能力

- SQL解析能力复用
- 路由决策复用
- 重写逻辑复用
- 配置构建复用

---

### 3. YAGNI原则 (You Aren't Gonna Need It)

**定义**: 不预先实现不需要的功能。

**应用**:

- 按需加载功能模块
- SPI按需扩展
- 避免过度设计
- 保持架构简洁

---

### 4. KISS原则 (Keep It Simple, Stupid)

**定义**: 保持简单，避免不必要的复杂性。

**应用**:

- 简洁的接口设计
- 清晰的处理流程
- 易于理解的代码逻辑

---

## 🏛️ 架构原则

### 1. 微内核架构

**核心思想**: 内核精简，功能通过SPI扩展。

```
┌─────────────────────────────────────────────┐
│              ShardingSphere                  │
├─────────────────────────────────────────────┤
│                                             │
│  ┌─────────────────────────────────────┐   │
│  │           Kernel (内核)              │   │
│  │   - 元数据管理                        │   │
│  │   - 会话管理                          │   │
│  │   - 基础流程编排                      │   │
│  └─────────────────────────────────────┘   │
│            ↑                        ↑       │
│            │ SPI扩展            SPI扩展      │
│            ↓                        ↓       │
│  ┌─────────────────────────────────────┐   │
│  │         Feature (功能层)             │   │
│  │   - 分片    - 加密   - 读写分离      │   │
│  │   - 脱敏    - 影子库 - 流量治理      │   │
│  └─────────────────────────────────────┘   │
│                                             │
└─────────────────────────────────────────────┘
```

### 2. 3层可插拔架构

**核心思想**: Feature层、Kernel层、Infra层完全解耦。

```
┌─────────────────────────────────────────────┐
│         Application Layer (应用层)           │
│     JDBC / Proxy / DistSQL / Spring         │
└─────────────────────────────────────────────┘
                      │
                      ▼
┌─────────────────────────────────────────────┐
│        Feature Layer (功能层)                │
│   分片 / 加密 / 读写分离 / 脱敏 / 影子库    │
└─────────────────────────────────────────────┘
                      │
                      ▼
┌─────────────────────────────────────────────┐
│         Kernel Layer (内核层)                │
│   元数据 / 路由 / 重写 / 执行 / 合并         │
└─────────────────────────────────────────────┘
                      │
                      ▼
┌─────────────────────────────────────────────┐
│    Infrastructure Layer (基础设施层)          │
│   SQL解析 / SPI加载 / 方言 / 表达式          │
└─────────────────────────────────────────────┘
```

### 3. 无状态设计

**核心思想**: 支持水平扩展，无状态部署。

- Kernel层无状态
- Proxy支持集群部署
- 状态存储在外部（配置中心、数据库）

---

## 🔧 代码组织原则

### 1. 模块划分

```
shardingsphere/
├── infra/              # 基础设施层
│   ├── parser/        # SQL解析
│   ├── route/         # 路由
│   ├── rewrite/       # 重写
│   ├── executor/      # 执行
│   ├── merge/         # 合并
│   └── spi/           # SPI机制
├── kernel/            # 核心内核层
│   ├── metadata/      # 元数据
│   ├── transaction/   # 事务
│   └── session/       # 会话
├── features/          # 特性功能层
│   ├── sharding/      # 数据分片
│   ├── encrypt/       # 数据加密
│   └── readwrite-splitting/  # 读写分离
├── jdbc/              # JDBC驱动
├── proxy/             # Proxy服务器
└── parser/            # SQL解析器
```

### 2. 包结构规范

```
# 按功能组织
org.apache.shardingsphere
├── infra/
│   ├── parser/
│   │   ├── api/           # API接口
│   │   ├── core/          # 核心实现
│   │   └── dialect/       # 方言适配
│   └── route/
│       ├── api/
│       └── core/
├── kernel/
│   └── ...
└── features/
    └── ...
```

### 3. 命名规范

| 类型 | 命名规范 | 示例 |
|------|---------|------|
| 类名 | UpperCamelCase | `ShardingEngine`, `RouteEngine` |
| 接口名 | UpperCamelCase +able | `ShardingAlgorithm`, `RouteEngine` |
| 方法名 | lowerCamelCase | `doSharding`, `route` |
| 常量 | UPPER_SNAKE_CASE | `MAX_POOL_SIZE` |
| 包名 | lowercase | `org.apache.shardingsphere.infra` |

---

## 🔌 扩展性原则

### 1. SPI扩展机制

**核心**: 通过Service Provider Interface实现功能扩展。

```java
// 定义SPI接口
@SPI
public interface ShardingAlgorithm {
    String doSharding(Collection<String> targetNames, Comparable<?> value);
}

// 使用SPI
ShardingAlgorithm algorithm = TypedSPILoader.getService(
    ShardingAlgorithm.class, 
    "MOD"  // 加载MOD分片算法
);
```

### 2. 扩展点列表

| 扩展点 | 接口 | 说明 |
|--------|------|------|
| 分片算法 | `ShardingAlgorithm` | 数据分片策略 |
| 加密算法 | `EncryptAlgorithm` | 数据加密/解密 |
| 负载均衡 | `LoadBalanceAlgorithm` | 读请求负载均衡 |
| 主键生成 | `KeyGenerateAlgorithm` | 分布式主键生成 |
| 脱敏算法 | `MaskAlgorithm` | 数据脱敏策略 |
| 分布式事务 | `TransactionAlgorithm` | 分布式事务协调 |

### 3. 插件化架构

**核心**: 按需加载，灵活组合。

- 只加载使用的Feature模块
- Feature之间相互独立
- 通过配置启用/禁用

---

## 📊 质量保障

### 1. 代码质量

- **Checkstyle**: 代码风格检查
- **Spotless**: 代码格式化
- **PMD**: 代码静态分析
- **FindBugs**: 潜在bug检测

### 2. 测试覆盖

- **单元测试**: 每个类必须有对应测试
- **集成测试**: 模块间交互测试
- **性能测试**: 基准性能测试

### 3. 持续集成

- **GitHub Actions**: 自动构建
- **Jacoco**: 代码覆盖率检查
- **SonarQube**: 代码质量分析

---

**文档结束**
