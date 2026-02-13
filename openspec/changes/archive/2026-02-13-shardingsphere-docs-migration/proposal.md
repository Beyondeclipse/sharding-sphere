# ShardingSphere文档迁移提案

## Why

当前文档结构（`openspec/changes/shardingsphere-architecture-proposal/`）采用大文档模式，AI系统定位特定模块需要搜索和解析整个文档，效率低下且精确度不足。同时，文档结构与代码结构不完全对应，增加了理解和维护成本。

我们需要一个既AI友好又人类友好的文档架构，能够：
1. 让AI系统毫秒级精确定位相关文档
2. 让架构师和开发人员流畅阅读和理解
3. 保持文档与代码结构的一致性

## What Changes

**文档结构重构**：
- 从大文档模式（6个大文档）迁移到模块化镜像结构（25+小文档）
- 创建AI专用索引文件（`.ai-index.yaml`）实现快速定位
- 文档路径镜像代码路径，实现一一对应

**文档迁移**：
- 迁移 `terminology.md` → `reference/terminology.md`
- 迁移 `data-flow.md` → `reference/data-flow.md`
- 拆分 `proposal.md` → `overview/proposal.md` + `overview/design-principles.md`
- 拆分 `architecture-detail.md` → `modules/` 下各层文档

**新文档创建**：
- 创建基础设施层文档（infra/）：parser.md, rewrite.md, executor.md, merge.md, spi.md, expr.md
- 创建核心内核层文档（kernel/）：metadata.md, transaction.md, session.md, authority.md
- 创建特性功能层文档（features/）：encrypt.md, readwrite-splitting.md, mask.md, shadow.md, broadcast.md
- 创建应用集成层文档（integration/）：jdbc.md, proxy.md, distsql.md

**索引系统创建**：
- 创建 `.ai-index.yaml` 包含200+索引条目
- 实现代码路径映射、类名索引、标签索引、功能索引、问题诊断索引

## Capabilities

### New Capabilities

- `ai-index-system`: AI专用索引系统，支持代码路径映射、类名索引、标签索引、功能索引和问题诊断索引
- `mirrored-doc-structure`: 镜像代码结构的文档组织方式，实现文档路径与代码路径一一对应
- `module-doc-templates`: 模块文档标准化模板，确保所有文档结构一致、信息完整

### Modified Capabilities

无（这是全新的文档结构，不修改现有功能规格）

## Impact

**文档结构变更**：
- 文档位置从 `openspec/changes/shardingsphere-architecture-proposal/` 迁移到 `my-docs/architecture/`
- 文档数量从6个大文档增加到25+个小文档
- 新增 `.ai-index.yaml` 作为AI系统定位的核心工具

**AI系统影响**：
- AI定位效率提升：从秒级搜索到毫秒级索引定位
- 定位精确度提升：从文档级别定位到模块级别定位
- 需要AI系统学习使用 `.ai-index.yaml` 索引文件

**人类读者影响**：
- 阅读方式变化：从线性阅读大文档到按需阅读模块文档
- 导航方式优化：通过 `.ai-index.yaml` 和 `README.md` 快速导航
- 学习路径清晰：提供架构师路径和开发者路径

**维护影响**：
- 文档更新粒度更细：单个模块更新不影响其他文档
- 索引维护成本：需要同步更新 `.ai-index.yaml`
- 文档间链接维护：需要验证交叉引用链接
