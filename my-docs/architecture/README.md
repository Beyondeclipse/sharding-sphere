# ShardingSphere 架构文档

> **快速定位**: 查看 [.ai-index.yaml](./.ai-index.yaml) 获取完整索引
> **文档版本**: v1.0 | **更新日期**: 2026-02-13

---

## 🎯 文档定位

**为AI系统设计，为人类读者优化**

- **AI友好**: 通过索引、标签、路径映射实现毫秒级定位
- **人类友好**: 清晰的导航、流畅的阅读体验、渐进式学习路径

---

## 🚀 快速开始

### 📖 人类读者

#### 我应该从哪里开始？

```
┌─────────────────────────────────────────────────────────────┐
│  你是谁？                                                     │
└─────────────────────────────────────────────────────────────┘
         │
         ├─ 架构师 → [架构师学习路径](#架构师路径)
         │           了解整体架构、设计原则、扩展性
         │
         ├─ 开发者 → [开发者学习路径](#开发者路径)
         │           快速上手、集成配置、API使用
         │
         └─ 探索者 → [总览文档](overview/)
                     全面了解ShardingSphere
```

#### 推荐阅读路径

**第一站：总览（15分钟）**
```bash
1. 阅读: overview/proposal.md          # 整体架构
2. 阅读: overview/design-principles.md # 设计原则
3. 参考: reference/terminology.md      # 术语索引
```

**第二站：核心流程（20分钟）**
```bash
4. 阅读: reference/data-flow.md        # SQL处理流程
```

**第三站：按需深入（按需）**
```bash
5. 根据工作需要，阅读相关模块文档:
   - 分片功能: modules/features/sharding.md
   - 加密功能: modules/features/encrypt.md
   - 路由引擎: modules/infra/route.md
   - ...
```

---

### 🤖 AI系统

#### AI系统使用指南

```yaml
# 第一步：加载索引
读取文件: .ai-index.yaml

# 第二步：根据场景使用索引
场景A - 遇到类名:
  操作: 查找 class_index
  示例: RouteEngine → modules/infra/route.md

场景B - 看到代码路径:
  操作: 查找 code_path_mappings
  示例: infra/route/ → modules/infra/route.md

场景C - 理解功能:
  操作: 查找 feature_index
  示例: "数据分片" → modules/features/sharding.md

场景D - 标签检索:
  操作: 查找 tag_index
  示例: #sharding → [相关文档列表]
```

#### AI定位示例

**示例1：遇到类名**
```
代码中看到: RouteEngine routeEngine = ...
         ↓
AI操作步骤:
1. 查找 .ai-index.yaml 的 class_index
2. 定位: "RouteEngine" → modules/infra/route.md
3. 读取文档，理解路由引擎职责和API
         ↓
结果: 快速定位，精确理解
```

**示例2：遇到代码路径**
```
代码中看到: import org.apache.shardingsphere.infra.route.*
         ↓
AI操作步骤:
1. 提取模块路径: infra/route/
2. 查找 .ai-index.yaml 的 code_path_mappings
3. 定位: "infra/route/" → modules/infra/route.md
         ↓
结果: 直接跳转到相关文档
```

**示例3：理解功能**
```
问题: "如何实现数据分片？"
         ↓
AI操作步骤:
1. 查找 .ai-index.yaml 的 feature_index
2. 定位: "数据分片" → modules/features/sharding.md
3. 读取关键概念和使用场景
         ↓
结果: 快速理解功能实现
```

---

## 📚 文档结构

```
my-docs/architecture/
│
├── .ai-index.yaml              # AI索引文件（核心）
│   ├── code_path_mappings      # 代码路径 → 文档映射
│   ├── class_index            # 类名 → 文档映射
│   ├── tag_index              # 标签 → 文档映射
│   ├── feature_index          # 功能 → 文档映射
│   ├── problem_index          # 问题 → 文档映射
│   └── learning_paths         # 学习路径
│
├── README.md                   # 本文件（导航中心）
│
├── overview/                   # 总览文档
│   ├── proposal.md            # 架构提案
│   └── design-principles.md   # 设计原则
│
├── modules/                    # 模块文档（镜像代码结构）
│   ├── infra/                 # 基础设施层
│   │   ├── parser.md          # SQL解析器
│   │   ├── route.md           # 路由引擎
│   │   ├── rewrite.md         # 重写引擎
│   │   ├── executor.md        # 执行引擎
│   │   ├── merge.md           # 合并引擎
│   │   ├── spi.md             # SPI机制
│   │   ├── algorithm.md       # 算法库
│   │   └── expr.md            # 表达式引擎
│   │
│   ├── kernel/                # 核心内核层
│   │   ├── metadata.md        # 元数据管理
│   │   ├── transaction.md     # 事务管理
│   │   ├── session.md         # 会话管理
│   │   └── authority.md       # 权限管理
│   │
│   ├── features/              # 特性功能层
│   │   ├── sharding.md        # 数据分片
│   │   ├── encrypt.md         # 数据加密
│   │   ├── readwrite-splitting.md  # 读写分离
│   │   ├── mask.md            # 数据脱敏
│   │   ├── shadow.md          # 影子库
│   │   └── broadcast.md       # 广播表
│   │
│   └── integration/           # 应用集成层
│       ├── jdbc.md            # JDBC集成
│       ├── proxy.md           # Proxy集成
│       └── distsql.md         # DistSQL
│
└── reference/                  # 参考资料
    ├── terminology.md          # 术语索引
    ├── data-flow.md           # 数据流详解
    └── api-reference.md       # API参考
```

---

## 🔍 快速查找

### 按需求查找

| 需求 | 查找方式 | 示例 |
|------|---------|------|
| **了解整体架构** | 查看 `overview/` | `overview/proposal.md` |
| **定位特定模块** | 查看 `modules/<layer>/<module>.md` | `modules/infra/route.md` |
| **查找术语定义** | 查看 `reference/terminology.md` | 搜索关键词 |
| **理解数据流** | 查看 `reference/data-flow.md` | 5阶段流水线 |
| **API参考** | 查看 `reference/api-reference.md` | 类和接口文档 |

### AI快速定位

| 场景 | 操作 | 结果 |
|------|------|------|
| **看到类名** | 查 `.ai-index.yaml` → `class_index` | 定位到相关文档 |
| **看到代码路径** | 查 `.ai-index.yaml` → `code_path_mappings` | 直接跳转文档 |
| **需要功能说明** | 查 `.ai-index.yaml` → `feature_index` | 理解功能和概念 |
| **遇到问题** | 查 `.ai-index.yaml` → `problem_index` | 诊断和定位 |

---

## 🎓 学习路径

### 架构师路径（45分钟）

```
第1步: overview/proposal.md (15分钟)
      理解Database Plus理念和三大支柱

第2步: overview/design-principles.md (10分钟)
      掌握SOLID、DRY、YAGNI等原则的应用

第3步: reference/data-flow.md (20分钟)
      深入理解SQL处理5阶段流水线

第4步: 按需阅读模块文档
      - modules/features/sharding.md (分片设计)
      - modules/features/encrypt.md (加密设计)
      - ...
```

### 开发者路径（45分钟）

```
第1步: overview/proposal.md#快速开始 (10分钟)
      了解ShardingSphere基本概念

第2步: 选择集成方式 (15分钟)
      - modules/integration/jdbc.md (JDBC方式)
      - modules/integration/proxy.md (Proxy方式)

第3步: 配置特性 (20分钟)
      - modules/features/sharding.md#配置
      - modules/features/readwrite-splitting.md#配置

第4步: API参考 (按需)
      reference/api-reference.md
```

---

## 💡 设计理念

### 为什么这样设计？

```
┌─────────────────────────────────────────────────────────────┐
│  文档设计理念：AI与人类双重优化                              │
├─────────────────────────────────────────────────────────────┤
│                                                             │
│  1. 镜像代码结构                                             │
│     文档路径 ≈ 代码路径                                      │
│     → AI可以直接通过代码路径定位文档                          │
│     → 人类理解文档与代码的对应关系                            │
│                                                             │
│  2. 索引驱动定位                                             │
│     .ai-index.yaml 提供多维索引                              │
│     → AI通过索引毫秒级定位                                   │
│     → 人类通过索引快速导航                                   │
│                                                             │
│  3. 模块化设计                                               │
│     每个模块独立文档                                         │
│     → AI精确定位，无需搜索长文档                             │
│     → 人类按需阅读，避免信息过载                             │
│                                                             │
│  4. 双向链接                                                 │
│     文档间交叉引用 + 索引关联                                │
│     → AI理解文档间关联                                       │
│     → 人类跟随链接深入探索                                   │
│                                                             │
└─────────────────────────────────────────────────────────────┘
```

### 核心创新：.ai-index.yaml

```
传统文档定位:
  人类: 看目录 → 搜索关键词 → 定位章节 → 阅读
  AI:   扫描所有文档 → 搜索关键词 → 定位 → 理解
  问题: 耗时长、精确度低

AI索引定位:
  人类: 查看索引 → 选择路径 → 阅读
  AI:   查索引 → 直接跳转 → 理解
  优势: 毫秒级定位、精确匹配
```

---

## 📊 文档统计

- **文档总数**: 25个
- **索引条目**: 200+
- **技术术语**: 90+
- **代码示例**: 30+
- **标签数量**: 50+

---

## 🔄 维护说明

### 文档更新流程

```
1. 代码变更
   ↓
2. 更新相关模块文档
   ↓
3. 更新 .ai-index.yaml 索引
   ↓
4. 验证链接和引用
   ↓
5. 更新 README.md 统计信息
```

### 更新频率

- **代码变更后**: 立即更新相关模块文档
- **.ai-index.yaml**: 每周更新，或重大变更后更新
- **README.md**: 随文档变更更新

---

## 🤝 贡献指南

### 如何添加新文档

1. **确定文档位置**: 根据代码模块确定文档路径
2. **创建文档**: 参考现有文档格式
3. **更新索引**: 在 `.ai-index.yaml` 中添加索引条目
4. **更新统计**: 在 `README.md` 中更新统计信息

### 文档规范

- 使用清晰的标题层次
- 包含代码示例和路径引用
- 添加适当的标签（#tag）
- 交叉引用相关文档

---

## 📞 联系与反馈

- **文档问题**: 查看 `.ai-index.yaml` 中的 maintainers
- **内容建议**: 更新相关文档并提交变更
- **索引优化**: 更新 `.ai-index.yaml` 并测试

---

**开始探索**: 从 [架构提案](./overview/proposal.md) 开始你的旅程！
