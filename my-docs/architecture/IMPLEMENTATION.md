# 文档结构实施建议

> **文档版本**: v1.0
> **创建日期**: 2026-02-13
> **目标**: 优化AI定位和人类阅读体验

---

## 📊 当前状态

### 已创建的文档

```
my-docs/architecture/
│
├── .ai-index.yaml              ✅ AI索引文件（已完成）
├── README.md                   ✅ 导航中心（已完成）
│
├── modules/
│   ├── infra/
│   │   └── route.md            ✅ 路由引擎示例（已完成）
│   └── features/
│       └── sharding.md         ✅ 分片特性示例（已完成）
│
└── openspec/changes/           # 之前的文档（需迁移）
    └── shardingsphere-architecture-proposal/
        ├── proposal.md
        ├── architecture-detail.md
        ├── module-reference.md
        ├── data-flow.md
        └── terminology.md
```

---

## 🎯 目标结构

### 完整文档结构（25个文档）

```
my-docs/architecture/
│
├── .ai-index.yaml              # AI索引（核心）
├── README.md                   # 导航中心
│
├── overview/                   # 总览文档（2个）
│   ├── proposal.md             # 架构提案
│   └── design-principles.md   # 设计原则
│
├── modules/                    # 模块文档（21个）
│   │
│   ├── infra/                 # 基础设施层（8个）
│   │   ├── README.md          # infra总览
│   │   ├── parser.md          ✅ (待创建)
│   │   ├── route.md           ✅ (已完成)
│   │   ├── rewrite.md         # 待创建
│   │   ├── executor.md        # 待创建
│   │   ├── merge.md           # 待创建
│   │   ├── spi.md             # 待创建
│   │   └── expr.md            # 待创建
│   │
│   ├── kernel/                # 核心内核层（4个）
│   │   ├── README.md          # kernel总览
│   │   ├── metadata.md        # 待创建
│   │   ├── transaction.md     # 待创建
│   │   └── session.md         # 待创建
│   │
│   ├── features/              # 特性功能层（6个）
│   │   ├── README.md          # features总览
│   │   ├── sharding.md        ✅ (已完成)
│   │   ├── encrypt.md         # 待创建
│   │   ├── readwrite-splitting.md  # 待创建
│   │   ├── mask.md            # 待创建
│   │   └── shadow.md          # 待创建
│   │
│   └── integration/           # 应用集成层（3个）
│       ├── README.md          # integration总览
│       ├── jdbc.md            # 待创建
│       └── proxy.md           # 待创建
│
└── reference/                  # 参考资料（4个）
    ├── terminology.md          ✅ (待迁移)
    ├── data-flow.md           ✅ (待迁移)
    ├── api-reference.md       # 待创建
    └── design-patterns.md     # 待创建
```

---

## 📝 迁移策略

### 策略1：渐进式迁移（推荐）

**优点**：风险低，可以逐步验证
**缺点**：需要较长时间

**步骤**：

```
第1阶段：创建索引和导航（已完成）
  ✅ 创建 .ai-index.yaml
  ✅ 创建 README.md
  ✅ 创建示例文档（route.md, sharding.md）

第2阶段：迁移现有文档（1-2小时）
  📋 迁移 terminology.md → reference/terminology.md
  📋 迁移 data-flow.md → reference/data-flow.md
  📋 拆分 proposal.md → overview/proposal.md + overview/design-principles.md
  📋 拆分 architecture-detail.md → modules/ 各层文档

第3阶段：创建新文档（2-3小时）
  📋 创建 infra 层剩余文档（parser.md, rewrite.md等）
  📋 创建 kernel 层文档（metadata.md等）
  📋 创建 features 层剩余文档（encrypt.md等）
  📋 创建 integration 层文档（jdbc.md, proxy.md等）

第4阶段：优化和验证（1小时）
  📋 验证所有链接
  📋 更新 .ai-index.yaml
  📋 更新 README.md
  📋 测试AI定位效果
```

---

### 策略2：快速重构

**优点**：快速完成，结构清晰
**缺点**：一次性工作量大，风险较高

**步骤**：

```
1. 保留现有文档作为参考
2. 一次性创建所有新文档
3. 从旧文档迁移内容
4. 删除旧文档
```

---

### 策略3：并行共存

**优点**：无风险，随时可以切换
**缺点**：维护成本高

**步骤**：

```
1. 保留 openspec/changes/ 文档
2. 创建 my-docs/architecture/ 文档
3. 两套文档并行存在一段时间
4. 验证新文档有效后，删除旧文档
```

---

## 🛠️ 文档创建清单

### 阶段1：基础设施层 (infra/)

#### 已完成
- [x] route.md

#### 待创建
- [ ] **parser.md** - SQL解析器
  - 关键类：`SQLParserEngine`, `SQLStatement`, `Lexer`
  - 内容：词法分析、语法分析、语义分析
  - 参考：`openspec/.../architecture-detail.md#SQL Parser`

- [ ] **rewrite.md** - 重写引擎
  - 关键类：`SQLRewriteContext`, `TokenRewriter`, `SegmentRewriter`
  - 内容：Token重写、Segment重写、SQL构建

- [ ] **executor.md** - 执行引擎
  - 关键类：`ExecuteEngine`, `ExecutionContext`, `ExecuteResult`
  - 内容：串行执行、并行执行、流式执行

- [ ] **merge.md** - 合并引擎
  - 关键类：`MergeEngine`, `MergedResult`, `MergeUnit`
  - 内容：流式合并、内存合并、排序合并

- [ ] **spi.md** - SPI机制
  - 关键类：`TypedSPILoader`, `DatabaseTypedSPILoader`
  - 内容：SPI加载、扩展点管理

- [ ] **expr.md** - 表达式引擎
  - 关键类：`ExpressionEngine`
  - 内容：表达式求值、动态计算

---

### 阶段2：核心内核层 (kernel/)

- [ ] **metadata.md** - 元数据管理
  - 关键类：`ShardingSphereMetaData`, `RuleMetaData`, `TableMetaData`
  - 内容：表结构、规则、数据源元数据

- [ ] **transaction.md** - 事务管理
  - 关键类：`TransactionManager`, `TransactionContext`
  - 内容：分布式事务、本地事务

- [ ] **session.md** - 会话管理
  - 关键类：`SessionManager`, `Session`
  - 内容：会话状态、连接管理

- [ ] **authority.md** - 权限管理
  - 关键类：`AuthorityManager`
  - 内容：用户认证、资源授权

---

### 阶段3：特性功能层 (features/)

#### 已完成
- [x] sharding.md

#### 待创建
- [ ] **encrypt.md** - 数据加密
  - 关键类：`EncryptRule`, `Encryptor`, `EncryptColumn`
  - 内容：加密算法、密钥管理、加密列

- [ ] **readwrite-splitting.md** - 读写分离
  - 关键类：`ReadwriteSplittingRule`, `LoadBalanceAlgorithm`
  - 内容：主从路由、负载均衡、故障转移

- [ ] **mask.md** - 数据脱敏
  - 关键类：`MaskRule`, `MaskAlgorithm`
  - 内容：脱敏算法、隐私保护

- [ ] **shadow.md** - 影子库
  - 关键类：`ShadowRule`
  - 内容：测试环境隔离

- [ ] **broadcast.md** - 广播表
  - 关键类：`BroadcastTableRule`
  - 内容：全局表、数据同步

---

### 阶段4：应用集成层 (integration/)

- [ ] **jdbc.md** - JDBC集成
  - 关键类：`ShardingSphereDataSource`, `ShardingSphereConnection`
  - 内容：JDBC驱动、轻量级框架

- [ ] **proxy.md** - Proxy集成
  - 关键类：`ShardingSphereProxy`, `ProxyContext`
  - 内容：独立部署、代理服务器

- [ ] **distsql.md** - DistSQL
  - 关键类：`DistSQLExecutor`
  - 内容：分布式SQL控制台

---

### 阶段5：参考资料 (reference/)

#### 待迁移
- [ ] **terminology.md** - 从 `openspec/.../terminology.md` 迁移
- [ ] **data-flow.md** - 从 `openspec/.../data-flow.md` 迁移

#### 待创建
- [ ] **api-reference.md** - API参考
  - 内容：所有公共API接口文档

- [ ] **design-patterns.md** - 设计模式
  - 内容：策略模式、工厂模式、建造者模式等应用

---

## 📋 文档模板

### 模块文档模板

```markdown
# [模块名称]

> **代码路径**: `[实际代码路径]`
> **核心标签**: `#tag1` `#tag2` `#tag3`
> **相关模块**: [上游模块](./upstream.md) | [下游模块](./downstream.md)

---

## 📋 模块概述

**职责**: [一句话描述核心职责]

**核心能力**:
- 能力1：[描述]
- 能力2：[描述]
- 能力3：[描述]

---

## 🎯 核心接口

### [核心接口名]

**位置**: `[代码路径]`

\`\`\`java
public interface [InterfaceName] {
    // 接口方法
}
\`\`\`

**实现类**:
- `[Implementation1]`: 描述
- `[Implementation2]`: 描述

---

## 🔄 工作流程

[流程图或步骤描述]

---

## 🎨 使用示例

[代码示例]

---

## 📚 相关文档

- **上游模块**: [链接]
- **下游模块**: [链接]
- **数据流**: [链接]

---

## 🏷️ 标签索引

- `#tag1`: 说明
- `#tag2`: 说明

---

**返回**: [文档导航](../../README.md) | **上一章**: [上一个模块] | **下一章**: [下一个模块]
```

---

## ✅ 质量检查清单

### 文档质量标准

- [ ] **代码路径准确**：所有代码路径与实际一致
- [ ] **类名正确**：所有类名拼写正确，路径正确
- [ ] **标签合理**：标签与内容匹配
- [ ] **交叉引用有效**：所有文档链接有效
- [ ] **示例可运行**：代码示例可以实际运行
- [ ] **术语一致**：术语使用与terminology.md一致

---

### AI索引质量标准

- [ ] **路径映射完整**：所有代码路径都有映射
- [ ] **类索引完整**：所有核心类都有索引
- [ ] **标签索引合理**：标签指向最相关的文档
- [ ] **功能索引清晰**：功能描述准确
- [ ] **问题诊断有效**：问题映射到正确文档

---

## 🚀 快速启动脚本

### 批量创建文档框架

```bash
#!/bin/bash
# create-docs.sh

# 创建目录结构
mkdir -p my-docs/architecture/{overview,modules/{infra,kernel,features,integration},reference}

# 创建基础设施层文档
for module in parser rewrite executor merge spi expr; do
  cat > "my-docs/architecture/modules/infra/${module}.md" << 'EOF'
# [Module Name]

> **代码路径**: `infra/[module]/`
> **核心标签**: `#[module]` `#infrastructure`

---

## 📋 模块概述

**职责**: [待补充]

---

## 🎯 核心接口

[待补充]

---

## 📚 相关文档

- **相关模块**: [待补充]

---

**返回**: [文档导航](../../../README.md)
EOF
done

echo "文档框架创建完成！"
```

---

## 📊 进度追踪

| 阶段 | 任务 | 状态 | 预计时间 | 实际时间 |
|------|------|------|---------|---------|
| **阶段0** | 创建索引和导航 | ✅ 完成 | 30分钟 | 30分钟 |
| **阶段1** | 迁移现有文档 | 📋 待开始 | 1-2小时 | - |
| **阶段2** | 创建infra文档 | 📋 待开始 | 2小时 | - |
| **阶段3** | 创建kernel文档 | 📋 待开始 | 1小时 | - |
| **阶段4** | 创建features文档 | 📋 待开始 | 2小时 | - |
| **阶段5** | 创建integration文档 | 📋 待开始 | 1小时 | - |
| **阶段6** | 创建reference文档 | 📋 待开始 | 1小时 | - |
| **阶段7** | 质量检查和优化 | 📋 待开始 | 1小时 | - |

**总预计时间**: 8-10小时

---

## 🎯 下一步行动

### 立即可做

1. **验证当前结构**：测试 `.ai-index.yaml` 的AI定位效果
2. **决定迁移策略**：选择渐进式迁移还是快速重构
3. **创建下一批文档**：优先级高的模块文档

### 优先级建议

```
高优先级（核心模块）:
  ✅ route.md (已完成)
  ✅ sharding.md (已完成)
  📋 parser.md (SQL解析)
  📋 rewrite.md (SQL重写)
  📋 executor.md (SQL执行)

中优先级（常用特性）:
  📋 encrypt.md (数据加密)
  📋 readwrite-splitting.md (读写分离)

低优先级（辅助模块）:
  📋 mask.md (数据脱敏)
  📋 shadow.md (影子库)
  📋 spi.md (SPI机制)
```

---

## 💡 维护建议

### 定期更新

- **每周**: 更新 `.ai-index.yaml` 索引
- **每月**: 检查文档链接有效性
- **重大变更后**: 立即更新相关文档

### 版本控制

```bash
# 文档应该提交到git
git add my-docs/
git commit -m "docs: update architecture documentation"

# 或者如果只是个人笔记，可以添加到.gitignore
echo "my-docs/" >> .gitignore
```

---

**准备好开始了吗？** 选择一个迁移策略，或者直接开始创建下一批文档！
