# 文档迁移任务清单

## 1. 基础结构创建

- [x] 1.1 创建文档目录结构 (my-docs/architecture/)
- [x] 1.2 创建 .ai-index.yaml 索引文件框架
- [x] 1.3 创建 README.md 导航中心
- [x] 1.4 创建 modules/ 目录结构 (infra/, kernel/, features/, integration/)
- [x] 1.5 创建 reference/ 目录结构
- [x] 1.6 创建 overview/ 目录结构

## 2. 现有文档迁移

- [x] 2.1 迁移 terminology.md 到 reference/terminology.md
- [x] 2.2 迁移 data-flow.md 到 reference/data-flow.md
- [x] 2.3 从 proposal.md 提取创建 overview/proposal.md
- [x] 2.4 从 proposal.md 提取创建 overview/design-principles.md
- [x] 2.5 拆分 architecture-detail.md 到 modules/infra/ 相关文档 (已完成模块文档创建)
- [x] 2.6 拆分 architecture-detail.md 到 modules/kernel/ 相关文档 (已完成模块文档创建)
- [x] 2.7 拆分 architecture-detail.md 到 modules/features/ 相关文档 (已完成模块文档创建)
- [x] 2.8 拆分 architecture-detail.md 到 modules/integration/ 相关文档 (已完成模块文档创建)

## 3. 新文档创建 - 基础设施层 (infra/)

- [x] 3.1 创建 modules/infra/README.md (infra层总览)
- [x] 3.2 创建 modules/infra/parser.md (SQL解析器) - 已有
- [x] 3.3 创建 modules/infra/rewrite.md (重写引擎)
- [x] 3.4 创建 modules/infra/executor.md (执行引擎)
- [x] 3.5 创建 modules/infra/merge.md (合并引擎)
- [x] 3.6 创建 modules/infra/spi.md (SPI机制)
- [x] 3.7 创建 modules/infra/algorithm.md (算法库)
- [x] 3.8 创建 modules/infra/expr.md (表达式引擎)

## 4. 新文档创建 - 核心内核层 (kernel/)

- [x] 4.1 创建 modules/kernel/README.md (kernel层总览)
- [x] 4.2 创建 modules/kernel/metadata.md (元数据管理)
- [x] 4.3 创建 modules/kernel/transaction.md (事务管理)
- [x] 4.4 创建 modules/kernel/session.md (会话管理)
- [x] 4.5 创建 modules/kernel/authority.md (权限管理)

## 5. 新文档创建 - 特性功能层 (features/)

- [x] 5.1 创建 modules/features/README.md (features层总览)
- [x] 5.2 创建 modules/features/encrypt.md (数据加密)
- [x] 5.3 创建 modules/features/readwrite-splitting.md (读写分离)
- [x] 5.4 创建 modules/features/mask.md (数据脱敏)
- [x] 5.5 创建 modules/features/shadow.md (影子库)
- [x] 5.6 创建 modules/features/broadcast.md (广播表)

## 6. 新文档创建 - 应用集成层 (integration/)

- [x] 6.1 创建 modules/integration/README.md (integration层总览)
- [x] 6.2 创建 modules/integration/jdbc.md (JDBC集成)
- [x] 6.3 创建 modules/integration/proxy.md (Proxy集成)
- [x] 6.4 创建 modules/integration/distsql.md (DistSQL)

## 7. 新文档创建 - 参考资料 (reference/)

- [x] 7.1 创建 reference/api-reference.md (API参考文档)
- [x] 7.2 创建 reference/design-patterns.md (设计模式应用)

## 8. AI索引系统完善

- [x] 8.1 完善 code_path_mappings (代码路径映射)
- [x] 8.2 完善 class_index (类名索引)
- [x] 8.3 完善 tag_index (标签索引)
- [x] 8.4 完善 feature_index (功能索引)
- [x] 8.5 完善 problem_index (问题诊断索引)
- [x] 8.6 完善 learning_paths (学习路径)
- [x] 8.7 完善 quick_links (快速链接)
- [x] 8.8 完善 statistics (统计信息)

## 9. 导航和链接更新

- [x] 9.1 更新 README.md 文档统计信息
- [x] 9.2 验证所有模块文档的内部链接
- [x] 9.3 验证所有模块文档的跨文档链接
- [x] 9.4 验证所有模块文档的外部链接
- [x] 9.5 更新各层 README.md 的模块列表

## 10. 内容质量检查

- [x] 10.1 检查所有文档的代码路径准确性
- [x] 10.2 检查所有文档的类名拼写正确性
- [x] 10.3 检查所有文档的标签合理性
- [x] 10.4 检查术语使用一致性 (与 terminology.md 对比)
- [x] 10.5 检查代码示例可运行性

## 11. AI定位测试

- [x] 11.1 测试代码路径定位 (至少5个场景)
- [x] 11.2 测试类名定位 (至少5个场景)
- [x] 11.3 测试标签检索 (至少5个场景)
- [x] 11.4 测试功能关键词定位 (至少5个场景)
- [x] 11.5 测试问题诊断定位 (至少3个场景)

## 12. 人类阅读测试

- [x] 12.1 架构师阅读测试 (按学习路径阅读)
- [x] 12.2 开发者阅读测试 (按学习路径阅读)
- [x] 12.3 模块文档导航测试 (测试前后章节导航)
- [x] 12.4 文档搜索测试 (测试关键词搜索)
- [x] 12.5 文档完整性测试 (检查关键信息是否存在)

## 13. 文档归档和清理

- [x] 13.1 创建旧文档归档目录
- [x] 13.2 移动旧文档到归档目录
- [x] 13.3 创建迁移说明文档
- [x] 13.4 更新项目根目录文档引用 (如有)
- [x] 13.5 删除临时文件和草稿

## 14. 最终验证

- [x] 14.1 完整性检查 (所有计划文档都已创建)
- [x] 14.2 链接有效性检查 (所有链接都可访问)
- [x] 14.3 索引完整性检查 (所有索引条目都有对应文档)
- [x] 14.4 文档格式一致性检查 (所有文档使用统一模板)
- [x] 14.5 最终验收测试 (AI定位 + 人类阅读)
