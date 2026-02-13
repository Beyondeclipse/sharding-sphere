# ShardingSphere 技术术语索引

> **代码路径**: `my-docs/architecture/reference/`
> **核心标签**: `#terminology` `#index` `#ai`
> **相关模块**: [overview/proposal.md](../overview/proposal.md)

---

## 📋 目录

- [使用指南](#使用指南)
- [模块术语](#模块术语)
- [功能特性术语](#功能特性术语)
- [架构术语](#架构术语)
- [数据流术语](#数据流术语)
- [性能术语](#性能术语)
- [配置术语](#配置术语)
- [标签索引](#标签索引)

---

## 📖 使用指南

### 🎯 术语查找

本术语索引采用模块化组织，支持以下查找方式：

| 查找方式 | 说明 |
|---------|------|
| **按模块** | 根据功能模块查找术语 |
| **按标签** | 根据标签分类查找术语 |
| **按字母** | 按英文首字母查找 |
| **全文搜索** | Ctrl+F 搜索术语 |

### 🤖 AI系统使用

AI系统可以通过以下方式使用本术语索引：

```python
# 示例：AI系统查询术语
def query_term(term_name):
    """
    查询术语定义

    Args:
        term_name: 术语名称（中文或英文）

    Returns:
        术语定义、相关标签、文件路径
    """
    # 查询逻辑...
    pass
```

**标签使用**:
- `#architecture`: 架构相关术语
- `#sharding`: 分片相关术语
- `#sql`: SQL处理相关术语
- `#route`: 路由相关术语
- `#merge`: 合并相关术语
- `#performance`: 性能相关术语
- `#security`: 安全相关术语

---

## 🏗️ 模块术语

### 核心模块

| 术语 | 英文 | 定义 | 相关标签 | 文件路径 |
|-----|------|------|---------|---------|
| **分片引擎** | Sharding Engine | 负责数据分片和路由的核心引擎 | #sharding #route | [modules/features/sharding.md](../modules/features/sharding.md) |
| **路由引擎** | Route Engine | 基于规则将SQL路由到目标数据源 | #route #kernel | [modules/infra/route.md](../modules/infra/route.md) |
| **重写引擎** | Rewrite Engine | 对SQL进行重写以适配分片、加密等特性 | #rewrite #kernel | [modules/infra/rewrite.md](../modules/infra/rewrite.md) |
| **执行引擎** | Execute Engine | 执行SQL并收集结果 | #executor #kernel | [modules/infra/executor.md](../modules/infra/executor.md) |
| **合并引擎** | Merge Engine | 合并多数据源结果集 | #merge #kernel | [modules/infra/merge.md](../modules/infra/merge.md) |
| **SQL解析器** | SQL Parser | 将SQL文本解析为AST | #parser #sql | [modules/infra/parser.md](../modules/infra/parser.md) |
| **SPI加载器** | SPI Loader | 加载SPI扩展实例 | #spi #extension | [modules/infra/spi.md](../modules/infra/spi.md) |
| **方言引擎** | Dialect Engine | 处理不同数据库语法差异 | #dialect #sql | `jdbc-dialect/` |
| **元数据管理器** | Metadata Manager | 管理数据库元数据和规则元数据 | #metadata #schema | [modules/kernel/metadata.md](../modules/kernel/metadata.md) |
| **会话管理器** | Session Manager | 管理数据库会话状态 | #session #state | [modules/kernel/session.md](../modules/kernel/session.md) |
| **权限管理器** | Authority Manager | 管理用户权限和访问控制 | #authority #security | [modules/kernel/authority.md](../modules/kernel/authority.md) |
| **事务管理器** | Transaction Manager | 管理分布式事务和本地事务 | #transaction #acid | [modules/kernel/transaction.md](../modules/kernel/transaction.md) |
| **表达式引擎** | Expression Engine | 计算SQL表达式和分片表达式 | #expression #evaluation | [modules/infra/expr.md](../modules/infra/expr.md) |
| **连接池** | Connection Pool | 管理数据库连接池 | #pool #connection | `infra/data-source-pool/` |

### 应用集成模块

| 术语 | 英文 | 定义 | 相关标签 | 文件路径 |
|-----|------|------|---------|---------|
| **JDBC驱动** | JDBC Driver | ShardingSphere提供的增强型JDBC驱动 | #jdbc #driver | [modules/integration/jdbc.md](../modules/integration/jdbc.md) |
| **Proxy服务器** | Proxy Server | 独立部署的数据库代理服务器 | #proxy #server | [modules/integration/proxy.md](../modules/integration/proxy.md) |
| **DistSQL** | Distributed SQL | 分布式SQL控制台，提供SQL管理能力 | #distsql #management | [modules/integration/distsql.md](../modules/integration/distsql.md) |

---

## 🎯 功能特性术语

| 术语 | 英文 | 定义 | 相关标签 | 文件路径 |
|-----|------|------|---------|---------|
| **数据分片** | Data Sharding | 将数据水平拆分到多个数据源 | #sharding #distributed | [modules/features/sharding.md](../modules/features/sharding.md) |
| **读写分离** | Read/Write Splitting | 读请求路由到从库，写请求路由到主库 | #readwrite #performance | [modules/features/readwrite-splitting.md](../modules/features/readwrite-splitting.md) |
| **数据加密** | Data Encryption | 对敏感数据进行加密存储 | #encrypt #security | [modules/features/encrypt.md](../modules/features/encrypt.md) |
| **数据脱敏** | Data Masking | 查询时对敏感数据进行脱敏 | #mask #privacy | [modules/features/mask.md](../modules/features/mask.md) |
| **影子库** | Shadow Database | 测试环境使用影子库进行数据隔离 | #shadow #testing | [modules/features/shadow.md](../modules/features/shadow.md) |
| **流量治理** | Traffic Governance | 熔断、限流等流量控制能力 | #traffic #governance | `features/traffic/` |
| **广播表** | Broadcast Table | 广播到所有数据源的表 | #broadcast #sync | [modules/features/broadcast.md](../modules/features/broadcast.md) |
| **绑定表** | Binding Table | 分片规则一致的一组表，避免笛卡尔积 | #sharding #binding | [modules/features/sharding.md](../modules/features/sharding.md) |

---

## 🏛️ 架构术语

| 术语 | 英文 | 定义 | 相关标签 |
|-----|------|------|---------|
| **Database Plus** | Database Plus | 构建在异构数据库之上的标准化和生态系统 | #core #philosophy |
| **微内核架构** | Micro-kernel Architecture | 内核精简，功能通过SPI扩展 | #architecture #pluggable |
| **3层可插拔** | 3-Layer Pluggable | Feature层、Kernel层、Infra层完全解耦 | #architecture #pluggable |
| **双访问架构** | Dual-Access Architecture | JDBC和Proxy两种访问方式 | #architecture #deployment |
| **SPI扩展点** | SPI Extension Point | 通过SPI机制扩展功能 | #spi #extension |
| **分布式SQL** | Distributed SQL | DistSQL，分布式SQL控制台 | #distsql #management |
| **配置中心** | Config Center | 存储和管理配置（ZooKeeper/Etcd等） | #config #registry |
| **服务发现** | Service Discovery | 动态发现服务实例 | #registry #discovery |
| **负载均衡** | Load Balancing | 将请求分发到多个服务实例 | #performance #balance |

---

## 🌊 数据流术语

| 术语 | 英文 | 定义 | 相关标签 |
|-----|------|------|---------|
| **SQL解析** | SQL Parsing | 将SQL文本转换为AST | #sql #parse |
| **SQL路由** | SQL Routing | 根据规则路由到目标数据源 | #sql #route |
| **SQL重写** | SQL Rewriting | 重写SQL以适配特性 | #sql #rewrite |
| **SQL执行** | SQL Execution | 执行SQL并收集结果 | #sql #execute |
| **结果合并** | Result Merging | 合并多数据源结果 | #sql #merge |
| **AST** | Abstract Syntax Tree | 抽象语法树，SQL解析的中间表示 | #sql #ast |
| **分片算法** | Sharding Algorithm | 分片计算算法 | #sharding #algorithm |
| **标准分片** | Standard Sharding | 基于分片列值的标准分片算法 | #sharding #algorithm |
| **复合分片** | Complex Sharding | 基于多个分片列的复合分片算法 | #sharding #algorithm |
| **Hint分片** | Hint Sharding | 基于Hint的强制分片算法 | #sharding #algorithm |
| **广播路由** | Broadcast Routing | 广播到所有数据源的路由方式 | #route #broadcast |
| **Hint路由** | Hint Routing | 强制路由指定数据源的路由方式 | #route #hint |
| **条件路由** | Conditional Routing | 基于SQL条件的智能路由 | #route #conditional |
| **Token重写** | Token Rewriting | 对SQL Token进行重写 | #rewrite #token |
| **片段重写** | Segment Rewriting | 对SQL片段进行重写 | #rewrite #segment |
| **SQL构建器** | SQL Builder | 构建重写后的SQL | #rewrite #builder |
| **并行执行** | Parallel Execution | 并发执行多数据源 | #performance #parallel |
| **串行执行** | Serial Execution | 按顺序执行各数据源 | #performance #serial |
| **流式执行** | Stream Execution | 流式处理结果集 | #performance #stream |
| **流式合并** | Stream Merge | 边读取边合并，内存占用低 | #performance #merge |
| **内存合并** | Memory Merge | 全部加载后合并，支持复杂排序 | #performance #merge |
| **排序合并** | OrderBy Merge | 支持ORDER BY的合并 | #merge #sort |
| **分组合并** | GroupBy Merge | 支持GROUP BY的合并 | #merge #group |
| **聚合合并** | Aggregation Merge | 支持聚合函数（SUM/COUNT等）的合并 | #merge #aggregation |
| **分页合并** | Limit Merge | 支持LIMIT的合并 | #merge #pagination |

---

## ⚡ 性能术语

| 术语 | 英文 | 定义 | 相关标签 |
|-----|------|------|---------|
| **并行执行** | Parallel Execution | 并发执行多数据源 | #performance #parallel |
| **流式合并** | Stream Merge | 边读取边合并，内存占用低 | #performance #merge |
| **内存合并** | Memory Merge | 全部加载后合并，支持复杂排序 | #performance #merge |
| **连接池** | Connection Pool | 数据库连接池，复用数据库连接 | #performance #pool |
| **结果集缓存** | Result Cache | 缓存查询结果，提升重复查询性能 | #performance #cache |
| **路由缓存** | Route Cache | 缓存路由结果，避免重复计算 | #performance #cache |
| **SQL解析缓存** | SQL Parse Cache | 缓存SQL解析结果 | #performance #cache |
| **预编译语句** | Prepared Statement | 预编译SQL语句，提升执行性能 | #performance #prepared |
| **批量执行** | Batch Execution | 批量执行SQL，减少网络开销 | #performance #batch |
| **异步执行** | Asynchronous Execution | 异步执行SQL，提升吞吐量 | #performance #async |
| **索引提示** | Index Hint | 强制使用指定索引 | #performance #hint |
| **读写分离** | Read/Write Splitting | 读请求路由到从库，提升查询性能 | #readwrite #performance |

---

## ⚙️ 配置术语

| 术语 | 英文 | 定义 | 相关标签 |
|-----|------|------|---------|
| **分片规则** | Sharding Rule | 定义分片策略和算法 | #config #sharding |
| **加密规则** | Encrypt Rule | 定义加密列和算法 | #config #encrypt |
| **读写分离规则** | Read/Write Splitting Rule | 定义主从配置 | #config #readwrite |
| **脱敏规则** | Mask Rule | 定义脱敏列和算法 | #config #mask |
| **数据源配置** | DataSource Config | 定义数据源连接信息 | #config #datasource |
| **配置中心** | Config Center | 存储和管理配置 | #config #registry |
| **动态配置** | Dynamic Config | 运行时动态更新配置 | #config #dynamic |
| **YAML配置** | YAML Config | 使用YAML格式的配置文件 | #config #yaml |
| **Spring配置** | Spring Config | 使用Spring集成的配置方式 | #config #spring |
| **DistSQL配置** | DistSQL Config | 使用DistSQL进行配置管理 | #config #distsql |
| **分片列** | Sharding Column | 用于分片的列 | #sharding #column |
| **分片键** | Sharding Key | 分片列的值 | #sharding #key |
| **分片策略** | Sharding Strategy | 定义如何进行分片 | #sharding #strategy |
| **实际数据节点** | Actual Data Nodes | 实际的物理表或数据源 | #sharding #nodes |
| **逻辑表** | Logic Table | 逻辑表名 | #sharding #logic-table |
| **实际表** | Actual Table | 实际物理表名 | #sharding #actual-table |
| **加密列** | Encrypt Column | 需要加密的列 | #encrypt #column |
| **密文列** | Cipher Column | 存储加密数据的列 | #encrypt #cipher |
| **明文列** | Plain Column | 存储明文数据的列（辅助查询） | #encrypt #plain |
| **辅助查询列** | Assisted Query Column | 辅助查询的列 | #encrypt #assisted |
| **主数据源** | Primary DataSource | 写操作的数据源 | #readwrite #primary |
| **从数据源** | Replica DataSource | 读操作的数据源 | #readwrite #replica |
| **负载均衡算法** | Load Balance Algorithm | 读请求负载均衡算法 | #readwrite #load-balance |

---

## 🏷️ 标签索引

### 架构标签 (Architecture)

| 标签 | 说明 | 使用场景 |
|------|------|---------|
| `#architecture` | 架构相关 | 整体架构、设计原则 |
| `#pluggable` | 可插拔 | SPI、扩展机制 |
| `#distributed` | 分布式 | 分片、读写分离 |
| `#kernel` | 内核相关 | Kernel层模块 |
| `#infrastructure` | 基础设施 | Infra层模块 |
| `#features` | 功能特性 | Feature层模块 |

### 模块标签 (Module)

| 标签 | 说明 | 使用场景 |
|------|------|---------|
| `#sharding` | 分片模块 | 数据分片、路由 |
| `#encrypt` | 加密模块 | 数据加密、脱敏 |
| `#readwrite` | 读写分离 | 主从路由、负载均衡 |
| `#mask` | 脱敏模块 | 数据脱敏 |
| `#shadow` | 影子库 | 测试环境 |
| `#broadcast` | 广播模块 | 广播表 |
| `#traffic` | 流量治理 | 熔断、限流 |

### 功能标签 (Function)

| 标签 | 说明 | 使用场景 |
|------|------|---------|
| `#sql` | SQL处理 | 解析、路由、重写 |
| `#route` | 路由 | 路由算法、策略 |
| `#rewrite` | 重写 | SQL重写 |
| `#merge` | 合并 | 结果集合并 |
| `#parse` | 解析 | SQL解析 |
| `#execute` | 执行 | SQL执行 |
| `#cache` | 缓存 | 各种缓存机制 |

### 性能标签 (Performance)

| 标签 | 说明 | 使用场景 |
|------|------|---------|
| `#performance` | 性能 | 性能优化、测试 |
| `#parallel` | 并行 | 并行执行、并发 |
| `#stream` | 流式 | 流式处理 |
| `#async` | 异步 | 异步执行 |

### 安全标签 (Security)

| 标签 | 说明 | 使用场景 |
|------|------|---------|
| `#security` | 安全 | 加密、脱敏、权限 |
| `#audit` | 审计 | 操作审计、日志 |
| `#authority` | 权限 | 访问控制 |
| `#privacy` | 隐私 | 数据隐私保护 |

### 数据库标签 (Database)

| 标签 | 说明 | 使用场景 |
|------|------|---------|
| `#mysql` | MySQL数据库 | MySQL相关 |
| `#postgresql` | PostgreSQL数据库 | PostgreSQL相关 |
| `#oracle` | Oracle数据库 | Oracle相关 |
| `#sqlserver` | SQLServer数据库 | SQLServer相关 |
| `#opengauss` | openGauss数据库 | openGauss相关 |

### 其他标签 (Other)

| 标签 | 说明 | 使用场景 |
|------|------|---------|
| `#spi` | SPI机制 | SPI扩展 |
| `#dialect` | 方言 | 数据库方言 |
| `#expression` | 表达式 | 表达式求值 |
| `#metadata` | 元数据 | 元数据管理 |
| `#session` | 会话 | 会话管理 |
| `#transaction` | 事务 | 事务管理 |
| `#config` | 配置 | 配置管理 |
| `#registry` | 注册中心 | 配置中心、服务发现 |

---

## 🔍 术语映射表

### 中文 → 英文映射

| 中文 | 英文 |
|------|------|
| 分片引擎 | Sharding Engine |
| 路由引擎 | Route Engine |
| 重写引擎 | Rewrite Engine |
| 执行引擎 | Execute Engine |
| 合并引擎 | Merge Engine |
| SQL解析器 | SQL Parser |
| 数据分片 | Data Sharding |
| 读写分离 | Read/Write Splitting |
| 数据加密 | Data Encryption |
| 数据脱敏 | Data Masking |
| 影子库 | Shadow Database |
| 流量治理 | Traffic Governance |
| 抽象语法树 | Abstract Syntax Tree (AST) |
| 服务提供接口 | Service Provider Interface (SPI) |
| 分布式SQL | Distributed SQL (DistSQL) |

### 英文 → 中文映射

| English | 中文 |
|---------|------|
| Sharding Engine | 分片引擎 |
| Route Engine | 路由引擎 |
| Rewrite Engine | 重写引擎 |
| Execute Engine | 执行引擎 |
| Merge Engine | 合并引擎 |
| SQL Parser | SQL解析器 |
| Data Sharding | 数据分片 |
| Read/Write Splitting | 读写分离 |
| Data Encryption | 数据加密 |
| Data Masking | 数据脱敏 |
| Shadow Database | 影子库 |
| Traffic Governance | 流量治理 |
| Abstract Syntax Tree | 抽象语法树 |
| Service Provider Interface | 服务提供接口 |
| Distributed SQL | 分布式SQL |

---

## 📊 术语统计

- **模块术语**: 14 个
- **功能特性术语**: 8 个
- **架构术语**: 9 个
- **数据流术语**: 28 个
- **性能术语**: 12 个
- **配置术语**: 21 个
- **总计**: 92 个

---

**文档结束**
