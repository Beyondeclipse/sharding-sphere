// Generated from D:/Develop/Git/main/github/sharding-sphere/shardingsphere-sql-parser/shardingsphere-sql-parser-dialect/shardingsphere-sql-parser-mysql/src/main/antlr4/org/apache/shardingsphere/sql/parser/autogen\MySQLStatement.g4 by ANTLR 4.8
package org.apache.shardingsphere.sql.parser.autogen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MySQLStatementParser}.
 */
public interface MySQLStatementListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#execute}.
	 * @param ctx the parse tree
	 */
	void enterExecute(MySQLStatementParser.ExecuteContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#execute}.
	 * @param ctx the parse tree
	 */
	void exitExecute(MySQLStatementParser.ExecuteContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#insert}.
	 * @param ctx the parse tree
	 */
	void enterInsert(MySQLStatementParser.InsertContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#insert}.
	 * @param ctx the parse tree
	 */
	void exitInsert(MySQLStatementParser.InsertContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#insertSpecification_}.
	 * @param ctx the parse tree
	 */
	void enterInsertSpecification_(MySQLStatementParser.InsertSpecification_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#insertSpecification_}.
	 * @param ctx the parse tree
	 */
	void exitInsertSpecification_(MySQLStatementParser.InsertSpecification_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#insertValuesClause}.
	 * @param ctx the parse tree
	 */
	void enterInsertValuesClause(MySQLStatementParser.InsertValuesClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#insertValuesClause}.
	 * @param ctx the parse tree
	 */
	void exitInsertValuesClause(MySQLStatementParser.InsertValuesClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#insertSelectClause}.
	 * @param ctx the parse tree
	 */
	void enterInsertSelectClause(MySQLStatementParser.InsertSelectClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#insertSelectClause}.
	 * @param ctx the parse tree
	 */
	void exitInsertSelectClause(MySQLStatementParser.InsertSelectClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#onDuplicateKeyClause}.
	 * @param ctx the parse tree
	 */
	void enterOnDuplicateKeyClause(MySQLStatementParser.OnDuplicateKeyClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#onDuplicateKeyClause}.
	 * @param ctx the parse tree
	 */
	void exitOnDuplicateKeyClause(MySQLStatementParser.OnDuplicateKeyClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#replace}.
	 * @param ctx the parse tree
	 */
	void enterReplace(MySQLStatementParser.ReplaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#replace}.
	 * @param ctx the parse tree
	 */
	void exitReplace(MySQLStatementParser.ReplaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#replaceSpecification_}.
	 * @param ctx the parse tree
	 */
	void enterReplaceSpecification_(MySQLStatementParser.ReplaceSpecification_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#replaceSpecification_}.
	 * @param ctx the parse tree
	 */
	void exitReplaceSpecification_(MySQLStatementParser.ReplaceSpecification_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#update}.
	 * @param ctx the parse tree
	 */
	void enterUpdate(MySQLStatementParser.UpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#update}.
	 * @param ctx the parse tree
	 */
	void exitUpdate(MySQLStatementParser.UpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#updateSpecification_}.
	 * @param ctx the parse tree
	 */
	void enterUpdateSpecification_(MySQLStatementParser.UpdateSpecification_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#updateSpecification_}.
	 * @param ctx the parse tree
	 */
	void exitUpdateSpecification_(MySQLStatementParser.UpdateSpecification_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(MySQLStatementParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(MySQLStatementParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#setAssignmentsClause}.
	 * @param ctx the parse tree
	 */
	void enterSetAssignmentsClause(MySQLStatementParser.SetAssignmentsClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#setAssignmentsClause}.
	 * @param ctx the parse tree
	 */
	void exitSetAssignmentsClause(MySQLStatementParser.SetAssignmentsClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#assignmentValues}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentValues(MySQLStatementParser.AssignmentValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#assignmentValues}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentValues(MySQLStatementParser.AssignmentValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#assignmentValue}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentValue(MySQLStatementParser.AssignmentValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#assignmentValue}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentValue(MySQLStatementParser.AssignmentValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#blobValue}.
	 * @param ctx the parse tree
	 */
	void enterBlobValue(MySQLStatementParser.BlobValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#blobValue}.
	 * @param ctx the parse tree
	 */
	void exitBlobValue(MySQLStatementParser.BlobValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#delete}.
	 * @param ctx the parse tree
	 */
	void enterDelete(MySQLStatementParser.DeleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#delete}.
	 * @param ctx the parse tree
	 */
	void exitDelete(MySQLStatementParser.DeleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#deleteSpecification_}.
	 * @param ctx the parse tree
	 */
	void enterDeleteSpecification_(MySQLStatementParser.DeleteSpecification_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#deleteSpecification_}.
	 * @param ctx the parse tree
	 */
	void exitDeleteSpecification_(MySQLStatementParser.DeleteSpecification_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#singleTableClause}.
	 * @param ctx the parse tree
	 */
	void enterSingleTableClause(MySQLStatementParser.SingleTableClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#singleTableClause}.
	 * @param ctx the parse tree
	 */
	void exitSingleTableClause(MySQLStatementParser.SingleTableClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#multipleTablesClause}.
	 * @param ctx the parse tree
	 */
	void enterMultipleTablesClause(MySQLStatementParser.MultipleTablesClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#multipleTablesClause}.
	 * @param ctx the parse tree
	 */
	void exitMultipleTablesClause(MySQLStatementParser.MultipleTablesClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#multipleTableNames}.
	 * @param ctx the parse tree
	 */
	void enterMultipleTableNames(MySQLStatementParser.MultipleTableNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#multipleTableNames}.
	 * @param ctx the parse tree
	 */
	void exitMultipleTableNames(MySQLStatementParser.MultipleTableNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect(MySQLStatementParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect(MySQLStatementParser.SelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(MySQLStatementParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(MySQLStatementParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(MySQLStatementParser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(MySQLStatementParser.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#handlerStatement}.
	 * @param ctx the parse tree
	 */
	void enterHandlerStatement(MySQLStatementParser.HandlerStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#handlerStatement}.
	 * @param ctx the parse tree
	 */
	void exitHandlerStatement(MySQLStatementParser.HandlerStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#handlerOpenStatement}.
	 * @param ctx the parse tree
	 */
	void enterHandlerOpenStatement(MySQLStatementParser.HandlerOpenStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#handlerOpenStatement}.
	 * @param ctx the parse tree
	 */
	void exitHandlerOpenStatement(MySQLStatementParser.HandlerOpenStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#handlerReadIndexStatement}.
	 * @param ctx the parse tree
	 */
	void enterHandlerReadIndexStatement(MySQLStatementParser.HandlerReadIndexStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#handlerReadIndexStatement}.
	 * @param ctx the parse tree
	 */
	void exitHandlerReadIndexStatement(MySQLStatementParser.HandlerReadIndexStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#handlerReadStatement}.
	 * @param ctx the parse tree
	 */
	void enterHandlerReadStatement(MySQLStatementParser.HandlerReadStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#handlerReadStatement}.
	 * @param ctx the parse tree
	 */
	void exitHandlerReadStatement(MySQLStatementParser.HandlerReadStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#handlerCloseStatement}.
	 * @param ctx the parse tree
	 */
	void enterHandlerCloseStatement(MySQLStatementParser.HandlerCloseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#handlerCloseStatement}.
	 * @param ctx the parse tree
	 */
	void exitHandlerCloseStatement(MySQLStatementParser.HandlerCloseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(MySQLStatementParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(MySQLStatementParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#loadDataStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoadDataStatement(MySQLStatementParser.LoadDataStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#loadDataStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoadDataStatement(MySQLStatementParser.LoadDataStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#loadXmlStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoadXmlStatement(MySQLStatementParser.LoadXmlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#loadXmlStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoadXmlStatement(MySQLStatementParser.LoadXmlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#withClause_}.
	 * @param ctx the parse tree
	 */
	void enterWithClause_(MySQLStatementParser.WithClause_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#withClause_}.
	 * @param ctx the parse tree
	 */
	void exitWithClause_(MySQLStatementParser.WithClause_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#cteClause_}.
	 * @param ctx the parse tree
	 */
	void enterCteClause_(MySQLStatementParser.CteClause_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#cteClause_}.
	 * @param ctx the parse tree
	 */
	void exitCteClause_(MySQLStatementParser.CteClause_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#unionClause}.
	 * @param ctx the parse tree
	 */
	void enterUnionClause(MySQLStatementParser.UnionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#unionClause}.
	 * @param ctx the parse tree
	 */
	void exitUnionClause(MySQLStatementParser.UnionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void enterSelectClause(MySQLStatementParser.SelectClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void exitSelectClause(MySQLStatementParser.SelectClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#selectSpecification}.
	 * @param ctx the parse tree
	 */
	void enterSelectSpecification(MySQLStatementParser.SelectSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#selectSpecification}.
	 * @param ctx the parse tree
	 */
	void exitSelectSpecification(MySQLStatementParser.SelectSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#duplicateSpecification}.
	 * @param ctx the parse tree
	 */
	void enterDuplicateSpecification(MySQLStatementParser.DuplicateSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#duplicateSpecification}.
	 * @param ctx the parse tree
	 */
	void exitDuplicateSpecification(MySQLStatementParser.DuplicateSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#projections}.
	 * @param ctx the parse tree
	 */
	void enterProjections(MySQLStatementParser.ProjectionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#projections}.
	 * @param ctx the parse tree
	 */
	void exitProjections(MySQLStatementParser.ProjectionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#projection}.
	 * @param ctx the parse tree
	 */
	void enterProjection(MySQLStatementParser.ProjectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#projection}.
	 * @param ctx the parse tree
	 */
	void exitProjection(MySQLStatementParser.ProjectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#alias}.
	 * @param ctx the parse tree
	 */
	void enterAlias(MySQLStatementParser.AliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#alias}.
	 * @param ctx the parse tree
	 */
	void exitAlias(MySQLStatementParser.AliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#unqualifiedShorthand}.
	 * @param ctx the parse tree
	 */
	void enterUnqualifiedShorthand(MySQLStatementParser.UnqualifiedShorthandContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#unqualifiedShorthand}.
	 * @param ctx the parse tree
	 */
	void exitUnqualifiedShorthand(MySQLStatementParser.UnqualifiedShorthandContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#qualifiedShorthand}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedShorthand(MySQLStatementParser.QualifiedShorthandContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#qualifiedShorthand}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedShorthand(MySQLStatementParser.QualifiedShorthandContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(MySQLStatementParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(MySQLStatementParser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#tableReferences}.
	 * @param ctx the parse tree
	 */
	void enterTableReferences(MySQLStatementParser.TableReferencesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#tableReferences}.
	 * @param ctx the parse tree
	 */
	void exitTableReferences(MySQLStatementParser.TableReferencesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#escapedTableReference}.
	 * @param ctx the parse tree
	 */
	void enterEscapedTableReference(MySQLStatementParser.EscapedTableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#escapedTableReference}.
	 * @param ctx the parse tree
	 */
	void exitEscapedTableReference(MySQLStatementParser.EscapedTableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#tableReference}.
	 * @param ctx the parse tree
	 */
	void enterTableReference(MySQLStatementParser.TableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#tableReference}.
	 * @param ctx the parse tree
	 */
	void exitTableReference(MySQLStatementParser.TableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#tableFactor}.
	 * @param ctx the parse tree
	 */
	void enterTableFactor(MySQLStatementParser.TableFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#tableFactor}.
	 * @param ctx the parse tree
	 */
	void exitTableFactor(MySQLStatementParser.TableFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#partitionNames_}.
	 * @param ctx the parse tree
	 */
	void enterPartitionNames_(MySQLStatementParser.PartitionNames_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#partitionNames_}.
	 * @param ctx the parse tree
	 */
	void exitPartitionNames_(MySQLStatementParser.PartitionNames_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#indexHintList_}.
	 * @param ctx the parse tree
	 */
	void enterIndexHintList_(MySQLStatementParser.IndexHintList_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#indexHintList_}.
	 * @param ctx the parse tree
	 */
	void exitIndexHintList_(MySQLStatementParser.IndexHintList_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#indexHint_}.
	 * @param ctx the parse tree
	 */
	void enterIndexHint_(MySQLStatementParser.IndexHint_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#indexHint_}.
	 * @param ctx the parse tree
	 */
	void exitIndexHint_(MySQLStatementParser.IndexHint_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#joinedTable}.
	 * @param ctx the parse tree
	 */
	void enterJoinedTable(MySQLStatementParser.JoinedTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#joinedTable}.
	 * @param ctx the parse tree
	 */
	void exitJoinedTable(MySQLStatementParser.JoinedTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#joinSpecification}.
	 * @param ctx the parse tree
	 */
	void enterJoinSpecification(MySQLStatementParser.JoinSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#joinSpecification}.
	 * @param ctx the parse tree
	 */
	void exitJoinSpecification(MySQLStatementParser.JoinSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(MySQLStatementParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(MySQLStatementParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void enterGroupByClause(MySQLStatementParser.GroupByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void exitGroupByClause(MySQLStatementParser.GroupByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void enterHavingClause(MySQLStatementParser.HavingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void exitHavingClause(MySQLStatementParser.HavingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void enterLimitClause(MySQLStatementParser.LimitClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void exitLimitClause(MySQLStatementParser.LimitClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#limitRowCount}.
	 * @param ctx the parse tree
	 */
	void enterLimitRowCount(MySQLStatementParser.LimitRowCountContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#limitRowCount}.
	 * @param ctx the parse tree
	 */
	void exitLimitRowCount(MySQLStatementParser.LimitRowCountContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#limitOffset}.
	 * @param ctx the parse tree
	 */
	void enterLimitOffset(MySQLStatementParser.LimitOffsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#limitOffset}.
	 * @param ctx the parse tree
	 */
	void exitLimitOffset(MySQLStatementParser.LimitOffsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#windowClause_}.
	 * @param ctx the parse tree
	 */
	void enterWindowClause_(MySQLStatementParser.WindowClause_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#windowClause_}.
	 * @param ctx the parse tree
	 */
	void exitWindowClause_(MySQLStatementParser.WindowClause_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#windowItem_}.
	 * @param ctx the parse tree
	 */
	void enterWindowItem_(MySQLStatementParser.WindowItem_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#windowItem_}.
	 * @param ctx the parse tree
	 */
	void exitWindowItem_(MySQLStatementParser.WindowItem_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#subquery}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(MySQLStatementParser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#subquery}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(MySQLStatementParser.SubqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#selectLinesInto_}.
	 * @param ctx the parse tree
	 */
	void enterSelectLinesInto_(MySQLStatementParser.SelectLinesInto_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#selectLinesInto_}.
	 * @param ctx the parse tree
	 */
	void exitSelectLinesInto_(MySQLStatementParser.SelectLinesInto_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#selectFieldsInto_}.
	 * @param ctx the parse tree
	 */
	void enterSelectFieldsInto_(MySQLStatementParser.SelectFieldsInto_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#selectFieldsInto_}.
	 * @param ctx the parse tree
	 */
	void exitSelectFieldsInto_(MySQLStatementParser.SelectFieldsInto_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#selectIntoExpression_}.
	 * @param ctx the parse tree
	 */
	void enterSelectIntoExpression_(MySQLStatementParser.SelectIntoExpression_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#selectIntoExpression_}.
	 * @param ctx the parse tree
	 */
	void exitSelectIntoExpression_(MySQLStatementParser.SelectIntoExpression_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#lockClause}.
	 * @param ctx the parse tree
	 */
	void enterLockClause(MySQLStatementParser.LockClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#lockClause}.
	 * @param ctx the parse tree
	 */
	void exitLockClause(MySQLStatementParser.LockClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#parameterMarker}.
	 * @param ctx the parse tree
	 */
	void enterParameterMarker(MySQLStatementParser.ParameterMarkerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#parameterMarker}.
	 * @param ctx the parse tree
	 */
	void exitParameterMarker(MySQLStatementParser.ParameterMarkerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#literals}.
	 * @param ctx the parse tree
	 */
	void enterLiterals(MySQLStatementParser.LiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#literals}.
	 * @param ctx the parse tree
	 */
	void exitLiterals(MySQLStatementParser.LiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#stringLiterals}.
	 * @param ctx the parse tree
	 */
	void enterStringLiterals(MySQLStatementParser.StringLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#stringLiterals}.
	 * @param ctx the parse tree
	 */
	void exitStringLiterals(MySQLStatementParser.StringLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#numberLiterals}.
	 * @param ctx the parse tree
	 */
	void enterNumberLiterals(MySQLStatementParser.NumberLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#numberLiterals}.
	 * @param ctx the parse tree
	 */
	void exitNumberLiterals(MySQLStatementParser.NumberLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#dateTimeLiterals}.
	 * @param ctx the parse tree
	 */
	void enterDateTimeLiterals(MySQLStatementParser.DateTimeLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#dateTimeLiterals}.
	 * @param ctx the parse tree
	 */
	void exitDateTimeLiterals(MySQLStatementParser.DateTimeLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#hexadecimalLiterals}.
	 * @param ctx the parse tree
	 */
	void enterHexadecimalLiterals(MySQLStatementParser.HexadecimalLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#hexadecimalLiterals}.
	 * @param ctx the parse tree
	 */
	void exitHexadecimalLiterals(MySQLStatementParser.HexadecimalLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#bitValueLiterals}.
	 * @param ctx the parse tree
	 */
	void enterBitValueLiterals(MySQLStatementParser.BitValueLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#bitValueLiterals}.
	 * @param ctx the parse tree
	 */
	void exitBitValueLiterals(MySQLStatementParser.BitValueLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#booleanLiterals}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiterals(MySQLStatementParser.BooleanLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#booleanLiterals}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiterals(MySQLStatementParser.BooleanLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#nullValueLiterals}.
	 * @param ctx the parse tree
	 */
	void enterNullValueLiterals(MySQLStatementParser.NullValueLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#nullValueLiterals}.
	 * @param ctx the parse tree
	 */
	void exitNullValueLiterals(MySQLStatementParser.NullValueLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#characterSetName_}.
	 * @param ctx the parse tree
	 */
	void enterCharacterSetName_(MySQLStatementParser.CharacterSetName_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#characterSetName_}.
	 * @param ctx the parse tree
	 */
	void exitCharacterSetName_(MySQLStatementParser.CharacterSetName_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#collationName_}.
	 * @param ctx the parse tree
	 */
	void enterCollationName_(MySQLStatementParser.CollationName_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#collationName_}.
	 * @param ctx the parse tree
	 */
	void exitCollationName_(MySQLStatementParser.CollationName_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(MySQLStatementParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(MySQLStatementParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#unreservedWord}.
	 * @param ctx the parse tree
	 */
	void enterUnreservedWord(MySQLStatementParser.UnreservedWordContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#unreservedWord}.
	 * @param ctx the parse tree
	 */
	void exitUnreservedWord(MySQLStatementParser.UnreservedWordContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(MySQLStatementParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(MySQLStatementParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#schemaName}.
	 * @param ctx the parse tree
	 */
	void enterSchemaName(MySQLStatementParser.SchemaNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#schemaName}.
	 * @param ctx the parse tree
	 */
	void exitSchemaName(MySQLStatementParser.SchemaNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(MySQLStatementParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(MySQLStatementParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#columnName}.
	 * @param ctx the parse tree
	 */
	void enterColumnName(MySQLStatementParser.ColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#columnName}.
	 * @param ctx the parse tree
	 */
	void exitColumnName(MySQLStatementParser.ColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#indexName}.
	 * @param ctx the parse tree
	 */
	void enterIndexName(MySQLStatementParser.IndexNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#indexName}.
	 * @param ctx the parse tree
	 */
	void exitIndexName(MySQLStatementParser.IndexNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#userName}.
	 * @param ctx the parse tree
	 */
	void enterUserName(MySQLStatementParser.UserNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#userName}.
	 * @param ctx the parse tree
	 */
	void exitUserName(MySQLStatementParser.UserNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#eventName}.
	 * @param ctx the parse tree
	 */
	void enterEventName(MySQLStatementParser.EventNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#eventName}.
	 * @param ctx the parse tree
	 */
	void exitEventName(MySQLStatementParser.EventNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#serverName}.
	 * @param ctx the parse tree
	 */
	void enterServerName(MySQLStatementParser.ServerNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#serverName}.
	 * @param ctx the parse tree
	 */
	void exitServerName(MySQLStatementParser.ServerNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#wrapperName}.
	 * @param ctx the parse tree
	 */
	void enterWrapperName(MySQLStatementParser.WrapperNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#wrapperName}.
	 * @param ctx the parse tree
	 */
	void exitWrapperName(MySQLStatementParser.WrapperNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(MySQLStatementParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(MySQLStatementParser.FunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#viewName}.
	 * @param ctx the parse tree
	 */
	void enterViewName(MySQLStatementParser.ViewNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#viewName}.
	 * @param ctx the parse tree
	 */
	void exitViewName(MySQLStatementParser.ViewNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#owner}.
	 * @param ctx the parse tree
	 */
	void enterOwner(MySQLStatementParser.OwnerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#owner}.
	 * @param ctx the parse tree
	 */
	void exitOwner(MySQLStatementParser.OwnerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(MySQLStatementParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(MySQLStatementParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#tableNames}.
	 * @param ctx the parse tree
	 */
	void enterTableNames(MySQLStatementParser.TableNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#tableNames}.
	 * @param ctx the parse tree
	 */
	void exitTableNames(MySQLStatementParser.TableNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#columnNames}.
	 * @param ctx the parse tree
	 */
	void enterColumnNames(MySQLStatementParser.ColumnNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#columnNames}.
	 * @param ctx the parse tree
	 */
	void exitColumnNames(MySQLStatementParser.ColumnNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#groupName}.
	 * @param ctx the parse tree
	 */
	void enterGroupName(MySQLStatementParser.GroupNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#groupName}.
	 * @param ctx the parse tree
	 */
	void exitGroupName(MySQLStatementParser.GroupNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#shardLibraryName}.
	 * @param ctx the parse tree
	 */
	void enterShardLibraryName(MySQLStatementParser.ShardLibraryNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#shardLibraryName}.
	 * @param ctx the parse tree
	 */
	void exitShardLibraryName(MySQLStatementParser.ShardLibraryNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#componentName}.
	 * @param ctx the parse tree
	 */
	void enterComponentName(MySQLStatementParser.ComponentNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#componentName}.
	 * @param ctx the parse tree
	 */
	void exitComponentName(MySQLStatementParser.ComponentNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#pluginName}.
	 * @param ctx the parse tree
	 */
	void enterPluginName(MySQLStatementParser.PluginNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#pluginName}.
	 * @param ctx the parse tree
	 */
	void exitPluginName(MySQLStatementParser.PluginNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#hostName}.
	 * @param ctx the parse tree
	 */
	void enterHostName(MySQLStatementParser.HostNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#hostName}.
	 * @param ctx the parse tree
	 */
	void exitHostName(MySQLStatementParser.HostNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#port}.
	 * @param ctx the parse tree
	 */
	void enterPort(MySQLStatementParser.PortContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#port}.
	 * @param ctx the parse tree
	 */
	void exitPort(MySQLStatementParser.PortContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#cloneInstance}.
	 * @param ctx the parse tree
	 */
	void enterCloneInstance(MySQLStatementParser.CloneInstanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#cloneInstance}.
	 * @param ctx the parse tree
	 */
	void exitCloneInstance(MySQLStatementParser.CloneInstanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#cloneDir}.
	 * @param ctx the parse tree
	 */
	void enterCloneDir(MySQLStatementParser.CloneDirContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#cloneDir}.
	 * @param ctx the parse tree
	 */
	void exitCloneDir(MySQLStatementParser.CloneDirContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#channelName}.
	 * @param ctx the parse tree
	 */
	void enterChannelName(MySQLStatementParser.ChannelNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#channelName}.
	 * @param ctx the parse tree
	 */
	void exitChannelName(MySQLStatementParser.ChannelNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#logName}.
	 * @param ctx the parse tree
	 */
	void enterLogName(MySQLStatementParser.LogNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#logName}.
	 * @param ctx the parse tree
	 */
	void exitLogName(MySQLStatementParser.LogNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#roleName}.
	 * @param ctx the parse tree
	 */
	void enterRoleName(MySQLStatementParser.RoleNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#roleName}.
	 * @param ctx the parse tree
	 */
	void exitRoleName(MySQLStatementParser.RoleNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#engineName}.
	 * @param ctx the parse tree
	 */
	void enterEngineName(MySQLStatementParser.EngineNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#engineName}.
	 * @param ctx the parse tree
	 */
	void exitEngineName(MySQLStatementParser.EngineNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#triggerName}.
	 * @param ctx the parse tree
	 */
	void enterTriggerName(MySQLStatementParser.TriggerNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#triggerName}.
	 * @param ctx the parse tree
	 */
	void exitTriggerName(MySQLStatementParser.TriggerNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#triggerTime}.
	 * @param ctx the parse tree
	 */
	void enterTriggerTime(MySQLStatementParser.TriggerTimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#triggerTime}.
	 * @param ctx the parse tree
	 */
	void exitTriggerTime(MySQLStatementParser.TriggerTimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#userOrRole}.
	 * @param ctx the parse tree
	 */
	void enterUserOrRole(MySQLStatementParser.UserOrRoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#userOrRole}.
	 * @param ctx the parse tree
	 */
	void exitUserOrRole(MySQLStatementParser.UserOrRoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#partitionName}.
	 * @param ctx the parse tree
	 */
	void enterPartitionName(MySQLStatementParser.PartitionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#partitionName}.
	 * @param ctx the parse tree
	 */
	void exitPartitionName(MySQLStatementParser.PartitionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#triggerEvent}.
	 * @param ctx the parse tree
	 */
	void enterTriggerEvent(MySQLStatementParser.TriggerEventContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#triggerEvent}.
	 * @param ctx the parse tree
	 */
	void exitTriggerEvent(MySQLStatementParser.TriggerEventContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#triggerOrder}.
	 * @param ctx the parse tree
	 */
	void enterTriggerOrder(MySQLStatementParser.TriggerOrderContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#triggerOrder}.
	 * @param ctx the parse tree
	 */
	void exitTriggerOrder(MySQLStatementParser.TriggerOrderContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MySQLStatementParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MySQLStatementParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOperator(MySQLStatementParser.LogicalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOperator(MySQLStatementParser.LogicalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#notOperator_}.
	 * @param ctx the parse tree
	 */
	void enterNotOperator_(MySQLStatementParser.NotOperator_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#notOperator_}.
	 * @param ctx the parse tree
	 */
	void exitNotOperator_(MySQLStatementParser.NotOperator_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#booleanPrimary}.
	 * @param ctx the parse tree
	 */
	void enterBooleanPrimary(MySQLStatementParser.BooleanPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#booleanPrimary}.
	 * @param ctx the parse tree
	 */
	void exitBooleanPrimary(MySQLStatementParser.BooleanPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(MySQLStatementParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(MySQLStatementParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(MySQLStatementParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(MySQLStatementParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#bitExpr}.
	 * @param ctx the parse tree
	 */
	void enterBitExpr(MySQLStatementParser.BitExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#bitExpr}.
	 * @param ctx the parse tree
	 */
	void exitBitExpr(MySQLStatementParser.BitExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpr(MySQLStatementParser.SimpleExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpr(MySQLStatementParser.SimpleExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(MySQLStatementParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(MySQLStatementParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#aggregationFunction}.
	 * @param ctx the parse tree
	 */
	void enterAggregationFunction(MySQLStatementParser.AggregationFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#aggregationFunction}.
	 * @param ctx the parse tree
	 */
	void exitAggregationFunction(MySQLStatementParser.AggregationFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#aggregationFunctionName}.
	 * @param ctx the parse tree
	 */
	void enterAggregationFunctionName(MySQLStatementParser.AggregationFunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#aggregationFunctionName}.
	 * @param ctx the parse tree
	 */
	void exitAggregationFunctionName(MySQLStatementParser.AggregationFunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#distinct}.
	 * @param ctx the parse tree
	 */
	void enterDistinct(MySQLStatementParser.DistinctContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#distinct}.
	 * @param ctx the parse tree
	 */
	void exitDistinct(MySQLStatementParser.DistinctContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#overClause_}.
	 * @param ctx the parse tree
	 */
	void enterOverClause_(MySQLStatementParser.OverClause_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#overClause_}.
	 * @param ctx the parse tree
	 */
	void exitOverClause_(MySQLStatementParser.OverClause_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#windowSpecification_}.
	 * @param ctx the parse tree
	 */
	void enterWindowSpecification_(MySQLStatementParser.WindowSpecification_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#windowSpecification_}.
	 * @param ctx the parse tree
	 */
	void exitWindowSpecification_(MySQLStatementParser.WindowSpecification_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#partitionClause_}.
	 * @param ctx the parse tree
	 */
	void enterPartitionClause_(MySQLStatementParser.PartitionClause_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#partitionClause_}.
	 * @param ctx the parse tree
	 */
	void exitPartitionClause_(MySQLStatementParser.PartitionClause_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#frameClause_}.
	 * @param ctx the parse tree
	 */
	void enterFrameClause_(MySQLStatementParser.FrameClause_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#frameClause_}.
	 * @param ctx the parse tree
	 */
	void exitFrameClause_(MySQLStatementParser.FrameClause_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#frameStart_}.
	 * @param ctx the parse tree
	 */
	void enterFrameStart_(MySQLStatementParser.FrameStart_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#frameStart_}.
	 * @param ctx the parse tree
	 */
	void exitFrameStart_(MySQLStatementParser.FrameStart_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#frameEnd_}.
	 * @param ctx the parse tree
	 */
	void enterFrameEnd_(MySQLStatementParser.FrameEnd_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#frameEnd_}.
	 * @param ctx the parse tree
	 */
	void exitFrameEnd_(MySQLStatementParser.FrameEnd_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#frameBetween_}.
	 * @param ctx the parse tree
	 */
	void enterFrameBetween_(MySQLStatementParser.FrameBetween_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#frameBetween_}.
	 * @param ctx the parse tree
	 */
	void exitFrameBetween_(MySQLStatementParser.FrameBetween_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#specialFunction}.
	 * @param ctx the parse tree
	 */
	void enterSpecialFunction(MySQLStatementParser.SpecialFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#specialFunction}.
	 * @param ctx the parse tree
	 */
	void exitSpecialFunction(MySQLStatementParser.SpecialFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#groupConcatFunction}.
	 * @param ctx the parse tree
	 */
	void enterGroupConcatFunction(MySQLStatementParser.GroupConcatFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#groupConcatFunction}.
	 * @param ctx the parse tree
	 */
	void exitGroupConcatFunction(MySQLStatementParser.GroupConcatFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#windowFunction}.
	 * @param ctx the parse tree
	 */
	void enterWindowFunction(MySQLStatementParser.WindowFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#windowFunction}.
	 * @param ctx the parse tree
	 */
	void exitWindowFunction(MySQLStatementParser.WindowFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#castFunction}.
	 * @param ctx the parse tree
	 */
	void enterCastFunction(MySQLStatementParser.CastFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#castFunction}.
	 * @param ctx the parse tree
	 */
	void exitCastFunction(MySQLStatementParser.CastFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#convertFunction}.
	 * @param ctx the parse tree
	 */
	void enterConvertFunction(MySQLStatementParser.ConvertFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#convertFunction}.
	 * @param ctx the parse tree
	 */
	void exitConvertFunction(MySQLStatementParser.ConvertFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#positionFunction}.
	 * @param ctx the parse tree
	 */
	void enterPositionFunction(MySQLStatementParser.PositionFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#positionFunction}.
	 * @param ctx the parse tree
	 */
	void exitPositionFunction(MySQLStatementParser.PositionFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#substringFunction}.
	 * @param ctx the parse tree
	 */
	void enterSubstringFunction(MySQLStatementParser.SubstringFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#substringFunction}.
	 * @param ctx the parse tree
	 */
	void exitSubstringFunction(MySQLStatementParser.SubstringFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#extractFunction}.
	 * @param ctx the parse tree
	 */
	void enterExtractFunction(MySQLStatementParser.ExtractFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#extractFunction}.
	 * @param ctx the parse tree
	 */
	void exitExtractFunction(MySQLStatementParser.ExtractFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#charFunction}.
	 * @param ctx the parse tree
	 */
	void enterCharFunction(MySQLStatementParser.CharFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#charFunction}.
	 * @param ctx the parse tree
	 */
	void exitCharFunction(MySQLStatementParser.CharFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#trimFunction_}.
	 * @param ctx the parse tree
	 */
	void enterTrimFunction_(MySQLStatementParser.TrimFunction_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#trimFunction_}.
	 * @param ctx the parse tree
	 */
	void exitTrimFunction_(MySQLStatementParser.TrimFunction_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#valuesFunction_}.
	 * @param ctx the parse tree
	 */
	void enterValuesFunction_(MySQLStatementParser.ValuesFunction_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#valuesFunction_}.
	 * @param ctx the parse tree
	 */
	void exitValuesFunction_(MySQLStatementParser.ValuesFunction_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#weightStringFunction}.
	 * @param ctx the parse tree
	 */
	void enterWeightStringFunction(MySQLStatementParser.WeightStringFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#weightStringFunction}.
	 * @param ctx the parse tree
	 */
	void exitWeightStringFunction(MySQLStatementParser.WeightStringFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#levelClause_}.
	 * @param ctx the parse tree
	 */
	void enterLevelClause_(MySQLStatementParser.LevelClause_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#levelClause_}.
	 * @param ctx the parse tree
	 */
	void exitLevelClause_(MySQLStatementParser.LevelClause_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#levelInWeightListElement_}.
	 * @param ctx the parse tree
	 */
	void enterLevelInWeightListElement_(MySQLStatementParser.LevelInWeightListElement_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#levelInWeightListElement_}.
	 * @param ctx the parse tree
	 */
	void exitLevelInWeightListElement_(MySQLStatementParser.LevelInWeightListElement_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#regularFunction}.
	 * @param ctx the parse tree
	 */
	void enterRegularFunction(MySQLStatementParser.RegularFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#regularFunction}.
	 * @param ctx the parse tree
	 */
	void exitRegularFunction(MySQLStatementParser.RegularFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#regularFunctionName_}.
	 * @param ctx the parse tree
	 */
	void enterRegularFunctionName_(MySQLStatementParser.RegularFunctionName_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#regularFunctionName_}.
	 * @param ctx the parse tree
	 */
	void exitRegularFunctionName_(MySQLStatementParser.RegularFunctionName_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#matchExpression_}.
	 * @param ctx the parse tree
	 */
	void enterMatchExpression_(MySQLStatementParser.MatchExpression_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#matchExpression_}.
	 * @param ctx the parse tree
	 */
	void exitMatchExpression_(MySQLStatementParser.MatchExpression_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#matchSearchModifier_}.
	 * @param ctx the parse tree
	 */
	void enterMatchSearchModifier_(MySQLStatementParser.MatchSearchModifier_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#matchSearchModifier_}.
	 * @param ctx the parse tree
	 */
	void exitMatchSearchModifier_(MySQLStatementParser.MatchSearchModifier_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#caseExpression}.
	 * @param ctx the parse tree
	 */
	void enterCaseExpression(MySQLStatementParser.CaseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#caseExpression}.
	 * @param ctx the parse tree
	 */
	void exitCaseExpression(MySQLStatementParser.CaseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#caseWhen_}.
	 * @param ctx the parse tree
	 */
	void enterCaseWhen_(MySQLStatementParser.CaseWhen_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#caseWhen_}.
	 * @param ctx the parse tree
	 */
	void exitCaseWhen_(MySQLStatementParser.CaseWhen_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#caseElse_}.
	 * @param ctx the parse tree
	 */
	void enterCaseElse_(MySQLStatementParser.CaseElse_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#caseElse_}.
	 * @param ctx the parse tree
	 */
	void exitCaseElse_(MySQLStatementParser.CaseElse_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#intervalExpression}.
	 * @param ctx the parse tree
	 */
	void enterIntervalExpression(MySQLStatementParser.IntervalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#intervalExpression}.
	 * @param ctx the parse tree
	 */
	void exitIntervalExpression(MySQLStatementParser.IntervalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#intervalUnit_}.
	 * @param ctx the parse tree
	 */
	void enterIntervalUnit_(MySQLStatementParser.IntervalUnit_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#intervalUnit_}.
	 * @param ctx the parse tree
	 */
	void exitIntervalUnit_(MySQLStatementParser.IntervalUnit_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void enterOrderByClause(MySQLStatementParser.OrderByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void exitOrderByClause(MySQLStatementParser.OrderByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#orderByItem}.
	 * @param ctx the parse tree
	 */
	void enterOrderByItem(MySQLStatementParser.OrderByItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#orderByItem}.
	 * @param ctx the parse tree
	 */
	void exitOrderByItem(MySQLStatementParser.OrderByItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(MySQLStatementParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(MySQLStatementParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#dataTypeName}.
	 * @param ctx the parse tree
	 */
	void enterDataTypeName(MySQLStatementParser.DataTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#dataTypeName}.
	 * @param ctx the parse tree
	 */
	void exitDataTypeName(MySQLStatementParser.DataTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#dataTypeLength}.
	 * @param ctx the parse tree
	 */
	void enterDataTypeLength(MySQLStatementParser.DataTypeLengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#dataTypeLength}.
	 * @param ctx the parse tree
	 */
	void exitDataTypeLength(MySQLStatementParser.DataTypeLengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#collectionOptions}.
	 * @param ctx the parse tree
	 */
	void enterCollectionOptions(MySQLStatementParser.CollectionOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#collectionOptions}.
	 * @param ctx the parse tree
	 */
	void exitCollectionOptions(MySQLStatementParser.CollectionOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#characterSet_}.
	 * @param ctx the parse tree
	 */
	void enterCharacterSet_(MySQLStatementParser.CharacterSet_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#characterSet_}.
	 * @param ctx the parse tree
	 */
	void exitCharacterSet_(MySQLStatementParser.CharacterSet_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#collateClause_}.
	 * @param ctx the parse tree
	 */
	void enterCollateClause_(MySQLStatementParser.CollateClause_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#collateClause_}.
	 * @param ctx the parse tree
	 */
	void exitCollateClause_(MySQLStatementParser.CollateClause_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#ignoredIdentifier_}.
	 * @param ctx the parse tree
	 */
	void enterIgnoredIdentifier_(MySQLStatementParser.IgnoredIdentifier_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#ignoredIdentifier_}.
	 * @param ctx the parse tree
	 */
	void exitIgnoredIdentifier_(MySQLStatementParser.IgnoredIdentifier_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#ignoredIdentifiers_}.
	 * @param ctx the parse tree
	 */
	void enterIgnoredIdentifiers_(MySQLStatementParser.IgnoredIdentifiers_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#ignoredIdentifiers_}.
	 * @param ctx the parse tree
	 */
	void exitIgnoredIdentifiers_(MySQLStatementParser.IgnoredIdentifiers_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#createTable}.
	 * @param ctx the parse tree
	 */
	void enterCreateTable(MySQLStatementParser.CreateTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#createTable}.
	 * @param ctx the parse tree
	 */
	void exitCreateTable(MySQLStatementParser.CreateTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#alterTable}.
	 * @param ctx the parse tree
	 */
	void enterAlterTable(MySQLStatementParser.AlterTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#alterTable}.
	 * @param ctx the parse tree
	 */
	void exitAlterTable(MySQLStatementParser.AlterTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#dropTable}.
	 * @param ctx the parse tree
	 */
	void enterDropTable(MySQLStatementParser.DropTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#dropTable}.
	 * @param ctx the parse tree
	 */
	void exitDropTable(MySQLStatementParser.DropTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#dropIndex}.
	 * @param ctx the parse tree
	 */
	void enterDropIndex(MySQLStatementParser.DropIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#dropIndex}.
	 * @param ctx the parse tree
	 */
	void exitDropIndex(MySQLStatementParser.DropIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#truncateTable}.
	 * @param ctx the parse tree
	 */
	void enterTruncateTable(MySQLStatementParser.TruncateTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#truncateTable}.
	 * @param ctx the parse tree
	 */
	void exitTruncateTable(MySQLStatementParser.TruncateTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#createIndex}.
	 * @param ctx the parse tree
	 */
	void enterCreateIndex(MySQLStatementParser.CreateIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#createIndex}.
	 * @param ctx the parse tree
	 */
	void exitCreateIndex(MySQLStatementParser.CreateIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#createDatabase}.
	 * @param ctx the parse tree
	 */
	void enterCreateDatabase(MySQLStatementParser.CreateDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#createDatabase}.
	 * @param ctx the parse tree
	 */
	void exitCreateDatabase(MySQLStatementParser.CreateDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#alterDatabase}.
	 * @param ctx the parse tree
	 */
	void enterAlterDatabase(MySQLStatementParser.AlterDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#alterDatabase}.
	 * @param ctx the parse tree
	 */
	void exitAlterDatabase(MySQLStatementParser.AlterDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#createDatabaseSpecification_}.
	 * @param ctx the parse tree
	 */
	void enterCreateDatabaseSpecification_(MySQLStatementParser.CreateDatabaseSpecification_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#createDatabaseSpecification_}.
	 * @param ctx the parse tree
	 */
	void exitCreateDatabaseSpecification_(MySQLStatementParser.CreateDatabaseSpecification_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#dropDatabase}.
	 * @param ctx the parse tree
	 */
	void enterDropDatabase(MySQLStatementParser.DropDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#dropDatabase}.
	 * @param ctx the parse tree
	 */
	void exitDropDatabase(MySQLStatementParser.DropDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#alterInstance}.
	 * @param ctx the parse tree
	 */
	void enterAlterInstance(MySQLStatementParser.AlterInstanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#alterInstance}.
	 * @param ctx the parse tree
	 */
	void exitAlterInstance(MySQLStatementParser.AlterInstanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#instanceAction}.
	 * @param ctx the parse tree
	 */
	void enterInstanceAction(MySQLStatementParser.InstanceActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#instanceAction}.
	 * @param ctx the parse tree
	 */
	void exitInstanceAction(MySQLStatementParser.InstanceActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#createEvent}.
	 * @param ctx the parse tree
	 */
	void enterCreateEvent(MySQLStatementParser.CreateEventContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#createEvent}.
	 * @param ctx the parse tree
	 */
	void exitCreateEvent(MySQLStatementParser.CreateEventContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#alterEvent}.
	 * @param ctx the parse tree
	 */
	void enterAlterEvent(MySQLStatementParser.AlterEventContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#alterEvent}.
	 * @param ctx the parse tree
	 */
	void exitAlterEvent(MySQLStatementParser.AlterEventContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#dropEvent}.
	 * @param ctx the parse tree
	 */
	void enterDropEvent(MySQLStatementParser.DropEventContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#dropEvent}.
	 * @param ctx the parse tree
	 */
	void exitDropEvent(MySQLStatementParser.DropEventContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#createFunction}.
	 * @param ctx the parse tree
	 */
	void enterCreateFunction(MySQLStatementParser.CreateFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#createFunction}.
	 * @param ctx the parse tree
	 */
	void exitCreateFunction(MySQLStatementParser.CreateFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#alterFunction}.
	 * @param ctx the parse tree
	 */
	void enterAlterFunction(MySQLStatementParser.AlterFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#alterFunction}.
	 * @param ctx the parse tree
	 */
	void exitAlterFunction(MySQLStatementParser.AlterFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#dropFunction}.
	 * @param ctx the parse tree
	 */
	void enterDropFunction(MySQLStatementParser.DropFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#dropFunction}.
	 * @param ctx the parse tree
	 */
	void exitDropFunction(MySQLStatementParser.DropFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#createProcedure}.
	 * @param ctx the parse tree
	 */
	void enterCreateProcedure(MySQLStatementParser.CreateProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#createProcedure}.
	 * @param ctx the parse tree
	 */
	void exitCreateProcedure(MySQLStatementParser.CreateProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#alterProcedure}.
	 * @param ctx the parse tree
	 */
	void enterAlterProcedure(MySQLStatementParser.AlterProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#alterProcedure}.
	 * @param ctx the parse tree
	 */
	void exitAlterProcedure(MySQLStatementParser.AlterProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#dropProcedure}.
	 * @param ctx the parse tree
	 */
	void enterDropProcedure(MySQLStatementParser.DropProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#dropProcedure}.
	 * @param ctx the parse tree
	 */
	void exitDropProcedure(MySQLStatementParser.DropProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#createServer}.
	 * @param ctx the parse tree
	 */
	void enterCreateServer(MySQLStatementParser.CreateServerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#createServer}.
	 * @param ctx the parse tree
	 */
	void exitCreateServer(MySQLStatementParser.CreateServerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#alterServer}.
	 * @param ctx the parse tree
	 */
	void enterAlterServer(MySQLStatementParser.AlterServerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#alterServer}.
	 * @param ctx the parse tree
	 */
	void exitAlterServer(MySQLStatementParser.AlterServerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#dropServer}.
	 * @param ctx the parse tree
	 */
	void enterDropServer(MySQLStatementParser.DropServerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#dropServer}.
	 * @param ctx the parse tree
	 */
	void exitDropServer(MySQLStatementParser.DropServerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#createView}.
	 * @param ctx the parse tree
	 */
	void enterCreateView(MySQLStatementParser.CreateViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#createView}.
	 * @param ctx the parse tree
	 */
	void exitCreateView(MySQLStatementParser.CreateViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#alterView}.
	 * @param ctx the parse tree
	 */
	void enterAlterView(MySQLStatementParser.AlterViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#alterView}.
	 * @param ctx the parse tree
	 */
	void exitAlterView(MySQLStatementParser.AlterViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#dropView}.
	 * @param ctx the parse tree
	 */
	void enterDropView(MySQLStatementParser.DropViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#dropView}.
	 * @param ctx the parse tree
	 */
	void exitDropView(MySQLStatementParser.DropViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#createTablespaceInnodb}.
	 * @param ctx the parse tree
	 */
	void enterCreateTablespaceInnodb(MySQLStatementParser.CreateTablespaceInnodbContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#createTablespaceInnodb}.
	 * @param ctx the parse tree
	 */
	void exitCreateTablespaceInnodb(MySQLStatementParser.CreateTablespaceInnodbContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#createTablespaceNdb}.
	 * @param ctx the parse tree
	 */
	void enterCreateTablespaceNdb(MySQLStatementParser.CreateTablespaceNdbContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#createTablespaceNdb}.
	 * @param ctx the parse tree
	 */
	void exitCreateTablespaceNdb(MySQLStatementParser.CreateTablespaceNdbContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#alterTablespace}.
	 * @param ctx the parse tree
	 */
	void enterAlterTablespace(MySQLStatementParser.AlterTablespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#alterTablespace}.
	 * @param ctx the parse tree
	 */
	void exitAlterTablespace(MySQLStatementParser.AlterTablespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#dropTablespace}.
	 * @param ctx the parse tree
	 */
	void enterDropTablespace(MySQLStatementParser.DropTablespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#dropTablespace}.
	 * @param ctx the parse tree
	 */
	void exitDropTablespace(MySQLStatementParser.DropTablespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#createLogfileGroup}.
	 * @param ctx the parse tree
	 */
	void enterCreateLogfileGroup(MySQLStatementParser.CreateLogfileGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#createLogfileGroup}.
	 * @param ctx the parse tree
	 */
	void exitCreateLogfileGroup(MySQLStatementParser.CreateLogfileGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#alterLogfileGroup}.
	 * @param ctx the parse tree
	 */
	void enterAlterLogfileGroup(MySQLStatementParser.AlterLogfileGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#alterLogfileGroup}.
	 * @param ctx the parse tree
	 */
	void exitAlterLogfileGroup(MySQLStatementParser.AlterLogfileGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#dropLogfileGroup}.
	 * @param ctx the parse tree
	 */
	void enterDropLogfileGroup(MySQLStatementParser.DropLogfileGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#dropLogfileGroup}.
	 * @param ctx the parse tree
	 */
	void exitDropLogfileGroup(MySQLStatementParser.DropLogfileGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#createTrigger}.
	 * @param ctx the parse tree
	 */
	void enterCreateTrigger(MySQLStatementParser.CreateTriggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#createTrigger}.
	 * @param ctx the parse tree
	 */
	void exitCreateTrigger(MySQLStatementParser.CreateTriggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#createTableSpecification_}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableSpecification_(MySQLStatementParser.CreateTableSpecification_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#createTableSpecification_}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableSpecification_(MySQLStatementParser.CreateTableSpecification_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#tableNotExistClause_}.
	 * @param ctx the parse tree
	 */
	void enterTableNotExistClause_(MySQLStatementParser.TableNotExistClause_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#tableNotExistClause_}.
	 * @param ctx the parse tree
	 */
	void exitTableNotExistClause_(MySQLStatementParser.TableNotExistClause_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#createDefinitionClause}.
	 * @param ctx the parse tree
	 */
	void enterCreateDefinitionClause(MySQLStatementParser.CreateDefinitionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#createDefinitionClause}.
	 * @param ctx the parse tree
	 */
	void exitCreateDefinitionClause(MySQLStatementParser.CreateDefinitionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#createDefinition}.
	 * @param ctx the parse tree
	 */
	void enterCreateDefinition(MySQLStatementParser.CreateDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#createDefinition}.
	 * @param ctx the parse tree
	 */
	void exitCreateDefinition(MySQLStatementParser.CreateDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterColumnDefinition(MySQLStatementParser.ColumnDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitColumnDefinition(MySQLStatementParser.ColumnDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#storageOption}.
	 * @param ctx the parse tree
	 */
	void enterStorageOption(MySQLStatementParser.StorageOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#storageOption}.
	 * @param ctx the parse tree
	 */
	void exitStorageOption(MySQLStatementParser.StorageOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#generatedOption}.
	 * @param ctx the parse tree
	 */
	void enterGeneratedOption(MySQLStatementParser.GeneratedOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#generatedOption}.
	 * @param ctx the parse tree
	 */
	void exitGeneratedOption(MySQLStatementParser.GeneratedOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#dataTypeGenericOption}.
	 * @param ctx the parse tree
	 */
	void enterDataTypeGenericOption(MySQLStatementParser.DataTypeGenericOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#dataTypeGenericOption}.
	 * @param ctx the parse tree
	 */
	void exitDataTypeGenericOption(MySQLStatementParser.DataTypeGenericOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#checkConstraintDefinition}.
	 * @param ctx the parse tree
	 */
	void enterCheckConstraintDefinition(MySQLStatementParser.CheckConstraintDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#checkConstraintDefinition}.
	 * @param ctx the parse tree
	 */
	void exitCheckConstraintDefinition(MySQLStatementParser.CheckConstraintDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#referenceDefinition}.
	 * @param ctx the parse tree
	 */
	void enterReferenceDefinition(MySQLStatementParser.ReferenceDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#referenceDefinition}.
	 * @param ctx the parse tree
	 */
	void exitReferenceDefinition(MySQLStatementParser.ReferenceDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#referenceOption_}.
	 * @param ctx the parse tree
	 */
	void enterReferenceOption_(MySQLStatementParser.ReferenceOption_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#referenceOption_}.
	 * @param ctx the parse tree
	 */
	void exitReferenceOption_(MySQLStatementParser.ReferenceOption_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#indexDefinition_}.
	 * @param ctx the parse tree
	 */
	void enterIndexDefinition_(MySQLStatementParser.IndexDefinition_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#indexDefinition_}.
	 * @param ctx the parse tree
	 */
	void exitIndexDefinition_(MySQLStatementParser.IndexDefinition_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#indexType_}.
	 * @param ctx the parse tree
	 */
	void enterIndexType_(MySQLStatementParser.IndexType_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#indexType_}.
	 * @param ctx the parse tree
	 */
	void exitIndexType_(MySQLStatementParser.IndexType_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#keyParts_}.
	 * @param ctx the parse tree
	 */
	void enterKeyParts_(MySQLStatementParser.KeyParts_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#keyParts_}.
	 * @param ctx the parse tree
	 */
	void exitKeyParts_(MySQLStatementParser.KeyParts_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#keyPart_}.
	 * @param ctx the parse tree
	 */
	void enterKeyPart_(MySQLStatementParser.KeyPart_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#keyPart_}.
	 * @param ctx the parse tree
	 */
	void exitKeyPart_(MySQLStatementParser.KeyPart_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#indexOption_}.
	 * @param ctx the parse tree
	 */
	void enterIndexOption_(MySQLStatementParser.IndexOption_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#indexOption_}.
	 * @param ctx the parse tree
	 */
	void exitIndexOption_(MySQLStatementParser.IndexOption_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#constraintDefinition}.
	 * @param ctx the parse tree
	 */
	void enterConstraintDefinition(MySQLStatementParser.ConstraintDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#constraintDefinition}.
	 * @param ctx the parse tree
	 */
	void exitConstraintDefinition(MySQLStatementParser.ConstraintDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#primaryKeyOption}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryKeyOption(MySQLStatementParser.PrimaryKeyOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#primaryKeyOption}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryKeyOption(MySQLStatementParser.PrimaryKeyOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#primaryKey}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryKey(MySQLStatementParser.PrimaryKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#primaryKey}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryKey(MySQLStatementParser.PrimaryKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#uniqueOption_}.
	 * @param ctx the parse tree
	 */
	void enterUniqueOption_(MySQLStatementParser.UniqueOption_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#uniqueOption_}.
	 * @param ctx the parse tree
	 */
	void exitUniqueOption_(MySQLStatementParser.UniqueOption_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#foreignKeyOption}.
	 * @param ctx the parse tree
	 */
	void enterForeignKeyOption(MySQLStatementParser.ForeignKeyOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#foreignKeyOption}.
	 * @param ctx the parse tree
	 */
	void exitForeignKeyOption(MySQLStatementParser.ForeignKeyOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#createLikeClause}.
	 * @param ctx the parse tree
	 */
	void enterCreateLikeClause(MySQLStatementParser.CreateLikeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#createLikeClause}.
	 * @param ctx the parse tree
	 */
	void exitCreateLikeClause(MySQLStatementParser.CreateLikeClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#createIndexSpecification_}.
	 * @param ctx the parse tree
	 */
	void enterCreateIndexSpecification_(MySQLStatementParser.CreateIndexSpecification_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#createIndexSpecification_}.
	 * @param ctx the parse tree
	 */
	void exitCreateIndexSpecification_(MySQLStatementParser.CreateIndexSpecification_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#alterDefinitionClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterDefinitionClause(MySQLStatementParser.AlterDefinitionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#alterDefinitionClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterDefinitionClause(MySQLStatementParser.AlterDefinitionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterSpecification(MySQLStatementParser.AlterSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterSpecification(MySQLStatementParser.AlterSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#tableOptions_}.
	 * @param ctx the parse tree
	 */
	void enterTableOptions_(MySQLStatementParser.TableOptions_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#tableOptions_}.
	 * @param ctx the parse tree
	 */
	void exitTableOptions_(MySQLStatementParser.TableOptions_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#tableOption_}.
	 * @param ctx the parse tree
	 */
	void enterTableOption_(MySQLStatementParser.TableOption_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#tableOption_}.
	 * @param ctx the parse tree
	 */
	void exitTableOption_(MySQLStatementParser.TableOption_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#addColumnSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAddColumnSpecification(MySQLStatementParser.AddColumnSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#addColumnSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAddColumnSpecification(MySQLStatementParser.AddColumnSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#firstOrAfterColumn}.
	 * @param ctx the parse tree
	 */
	void enterFirstOrAfterColumn(MySQLStatementParser.FirstOrAfterColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#firstOrAfterColumn}.
	 * @param ctx the parse tree
	 */
	void exitFirstOrAfterColumn(MySQLStatementParser.FirstOrAfterColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#addIndexSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAddIndexSpecification(MySQLStatementParser.AddIndexSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#addIndexSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAddIndexSpecification(MySQLStatementParser.AddIndexSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#addConstraintSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAddConstraintSpecification(MySQLStatementParser.AddConstraintSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#addConstraintSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAddConstraintSpecification(MySQLStatementParser.AddConstraintSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#changeColumnSpecification}.
	 * @param ctx the parse tree
	 */
	void enterChangeColumnSpecification(MySQLStatementParser.ChangeColumnSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#changeColumnSpecification}.
	 * @param ctx the parse tree
	 */
	void exitChangeColumnSpecification(MySQLStatementParser.ChangeColumnSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#modifyColumnSpecification}.
	 * @param ctx the parse tree
	 */
	void enterModifyColumnSpecification(MySQLStatementParser.ModifyColumnSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#modifyColumnSpecification}.
	 * @param ctx the parse tree
	 */
	void exitModifyColumnSpecification(MySQLStatementParser.ModifyColumnSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#dropColumnSpecification}.
	 * @param ctx the parse tree
	 */
	void enterDropColumnSpecification(MySQLStatementParser.DropColumnSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#dropColumnSpecification}.
	 * @param ctx the parse tree
	 */
	void exitDropColumnSpecification(MySQLStatementParser.DropColumnSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#dropIndexSpecification}.
	 * @param ctx the parse tree
	 */
	void enterDropIndexSpecification(MySQLStatementParser.DropIndexSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#dropIndexSpecification}.
	 * @param ctx the parse tree
	 */
	void exitDropIndexSpecification(MySQLStatementParser.DropIndexSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#dropPrimaryKeySpecification}.
	 * @param ctx the parse tree
	 */
	void enterDropPrimaryKeySpecification(MySQLStatementParser.DropPrimaryKeySpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#dropPrimaryKeySpecification}.
	 * @param ctx the parse tree
	 */
	void exitDropPrimaryKeySpecification(MySQLStatementParser.DropPrimaryKeySpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#renameColumnSpecification}.
	 * @param ctx the parse tree
	 */
	void enterRenameColumnSpecification(MySQLStatementParser.RenameColumnSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#renameColumnSpecification}.
	 * @param ctx the parse tree
	 */
	void exitRenameColumnSpecification(MySQLStatementParser.RenameColumnSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#renameIndexSpecification}.
	 * @param ctx the parse tree
	 */
	void enterRenameIndexSpecification(MySQLStatementParser.RenameIndexSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#renameIndexSpecification}.
	 * @param ctx the parse tree
	 */
	void exitRenameIndexSpecification(MySQLStatementParser.RenameIndexSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#renameTableSpecification}.
	 * @param ctx the parse tree
	 */
	void enterRenameTableSpecification(MySQLStatementParser.RenameTableSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#renameTableSpecification}.
	 * @param ctx the parse tree
	 */
	void exitRenameTableSpecification(MySQLStatementParser.RenameTableSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#partitionDefinitions_}.
	 * @param ctx the parse tree
	 */
	void enterPartitionDefinitions_(MySQLStatementParser.PartitionDefinitions_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#partitionDefinitions_}.
	 * @param ctx the parse tree
	 */
	void exitPartitionDefinitions_(MySQLStatementParser.PartitionDefinitions_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#partitionDefinition_}.
	 * @param ctx the parse tree
	 */
	void enterPartitionDefinition_(MySQLStatementParser.PartitionDefinition_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#partitionDefinition_}.
	 * @param ctx the parse tree
	 */
	void exitPartitionDefinition_(MySQLStatementParser.PartitionDefinition_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#partitionLessThanValue_}.
	 * @param ctx the parse tree
	 */
	void enterPartitionLessThanValue_(MySQLStatementParser.PartitionLessThanValue_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#partitionLessThanValue_}.
	 * @param ctx the parse tree
	 */
	void exitPartitionLessThanValue_(MySQLStatementParser.PartitionLessThanValue_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#partitionValueList_}.
	 * @param ctx the parse tree
	 */
	void enterPartitionValueList_(MySQLStatementParser.PartitionValueList_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#partitionValueList_}.
	 * @param ctx the parse tree
	 */
	void exitPartitionValueList_(MySQLStatementParser.PartitionValueList_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#partitionDefinitionOption_}.
	 * @param ctx the parse tree
	 */
	void enterPartitionDefinitionOption_(MySQLStatementParser.PartitionDefinitionOption_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#partitionDefinitionOption_}.
	 * @param ctx the parse tree
	 */
	void exitPartitionDefinitionOption_(MySQLStatementParser.PartitionDefinitionOption_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#subpartitionDefinition_}.
	 * @param ctx the parse tree
	 */
	void enterSubpartitionDefinition_(MySQLStatementParser.SubpartitionDefinition_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#subpartitionDefinition_}.
	 * @param ctx the parse tree
	 */
	void exitSubpartitionDefinition_(MySQLStatementParser.SubpartitionDefinition_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#dropTableSpecification_}.
	 * @param ctx the parse tree
	 */
	void enterDropTableSpecification_(MySQLStatementParser.DropTableSpecification_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#dropTableSpecification_}.
	 * @param ctx the parse tree
	 */
	void exitDropTableSpecification_(MySQLStatementParser.DropTableSpecification_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#tableExistClause_}.
	 * @param ctx the parse tree
	 */
	void enterTableExistClause_(MySQLStatementParser.TableExistClause_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#tableExistClause_}.
	 * @param ctx the parse tree
	 */
	void exitTableExistClause_(MySQLStatementParser.TableExistClause_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#dropIndexSpecification_}.
	 * @param ctx the parse tree
	 */
	void enterDropIndexSpecification_(MySQLStatementParser.DropIndexSpecification_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#dropIndexSpecification_}.
	 * @param ctx the parse tree
	 */
	void exitDropIndexSpecification_(MySQLStatementParser.DropIndexSpecification_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#ownerStatement}.
	 * @param ctx the parse tree
	 */
	void enterOwnerStatement(MySQLStatementParser.OwnerStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#ownerStatement}.
	 * @param ctx the parse tree
	 */
	void exitOwnerStatement(MySQLStatementParser.OwnerStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#scheduleExpression_}.
	 * @param ctx the parse tree
	 */
	void enterScheduleExpression_(MySQLStatementParser.ScheduleExpression_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#scheduleExpression_}.
	 * @param ctx the parse tree
	 */
	void exitScheduleExpression_(MySQLStatementParser.ScheduleExpression_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#timestampValue}.
	 * @param ctx the parse tree
	 */
	void enterTimestampValue(MySQLStatementParser.TimestampValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#timestampValue}.
	 * @param ctx the parse tree
	 */
	void exitTimestampValue(MySQLStatementParser.TimestampValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#routineBody}.
	 * @param ctx the parse tree
	 */
	void enterRoutineBody(MySQLStatementParser.RoutineBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#routineBody}.
	 * @param ctx the parse tree
	 */
	void exitRoutineBody(MySQLStatementParser.RoutineBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#serverOption_}.
	 * @param ctx the parse tree
	 */
	void enterServerOption_(MySQLStatementParser.ServerOption_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#serverOption_}.
	 * @param ctx the parse tree
	 */
	void exitServerOption_(MySQLStatementParser.ServerOption_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#routineOption_}.
	 * @param ctx the parse tree
	 */
	void enterRoutineOption_(MySQLStatementParser.RoutineOption_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#routineOption_}.
	 * @param ctx the parse tree
	 */
	void exitRoutineOption_(MySQLStatementParser.RoutineOption_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#procedureParameter_}.
	 * @param ctx the parse tree
	 */
	void enterProcedureParameter_(MySQLStatementParser.ProcedureParameter_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#procedureParameter_}.
	 * @param ctx the parse tree
	 */
	void exitProcedureParameter_(MySQLStatementParser.ProcedureParameter_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#fileSizeLiteral_}.
	 * @param ctx the parse tree
	 */
	void enterFileSizeLiteral_(MySQLStatementParser.FileSizeLiteral_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#fileSizeLiteral_}.
	 * @param ctx the parse tree
	 */
	void exitFileSizeLiteral_(MySQLStatementParser.FileSizeLiteral_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#setTransaction}.
	 * @param ctx the parse tree
	 */
	void enterSetTransaction(MySQLStatementParser.SetTransactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#setTransaction}.
	 * @param ctx the parse tree
	 */
	void exitSetTransaction(MySQLStatementParser.SetTransactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#setAutoCommit}.
	 * @param ctx the parse tree
	 */
	void enterSetAutoCommit(MySQLStatementParser.SetAutoCommitContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#setAutoCommit}.
	 * @param ctx the parse tree
	 */
	void exitSetAutoCommit(MySQLStatementParser.SetAutoCommitContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#scope_}.
	 * @param ctx the parse tree
	 */
	void enterScope_(MySQLStatementParser.Scope_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#scope_}.
	 * @param ctx the parse tree
	 */
	void exitScope_(MySQLStatementParser.Scope_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#autoCommitValue}.
	 * @param ctx the parse tree
	 */
	void enterAutoCommitValue(MySQLStatementParser.AutoCommitValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#autoCommitValue}.
	 * @param ctx the parse tree
	 */
	void exitAutoCommitValue(MySQLStatementParser.AutoCommitValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#beginTransaction}.
	 * @param ctx the parse tree
	 */
	void enterBeginTransaction(MySQLStatementParser.BeginTransactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#beginTransaction}.
	 * @param ctx the parse tree
	 */
	void exitBeginTransaction(MySQLStatementParser.BeginTransactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#commit}.
	 * @param ctx the parse tree
	 */
	void enterCommit(MySQLStatementParser.CommitContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#commit}.
	 * @param ctx the parse tree
	 */
	void exitCommit(MySQLStatementParser.CommitContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#rollback}.
	 * @param ctx the parse tree
	 */
	void enterRollback(MySQLStatementParser.RollbackContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#rollback}.
	 * @param ctx the parse tree
	 */
	void exitRollback(MySQLStatementParser.RollbackContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#savepoint}.
	 * @param ctx the parse tree
	 */
	void enterSavepoint(MySQLStatementParser.SavepointContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#savepoint}.
	 * @param ctx the parse tree
	 */
	void exitSavepoint(MySQLStatementParser.SavepointContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#grant}.
	 * @param ctx the parse tree
	 */
	void enterGrant(MySQLStatementParser.GrantContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#grant}.
	 * @param ctx the parse tree
	 */
	void exitGrant(MySQLStatementParser.GrantContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#revoke}.
	 * @param ctx the parse tree
	 */
	void enterRevoke(MySQLStatementParser.RevokeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#revoke}.
	 * @param ctx the parse tree
	 */
	void exitRevoke(MySQLStatementParser.RevokeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#proxyClause_}.
	 * @param ctx the parse tree
	 */
	void enterProxyClause_(MySQLStatementParser.ProxyClause_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#proxyClause_}.
	 * @param ctx the parse tree
	 */
	void exitProxyClause_(MySQLStatementParser.ProxyClause_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#privilegeClause}.
	 * @param ctx the parse tree
	 */
	void enterPrivilegeClause(MySQLStatementParser.PrivilegeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#privilegeClause}.
	 * @param ctx the parse tree
	 */
	void exitPrivilegeClause(MySQLStatementParser.PrivilegeClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#roleClause_}.
	 * @param ctx the parse tree
	 */
	void enterRoleClause_(MySQLStatementParser.RoleClause_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#roleClause_}.
	 * @param ctx the parse tree
	 */
	void exitRoleClause_(MySQLStatementParser.RoleClause_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#allClause_}.
	 * @param ctx the parse tree
	 */
	void enterAllClause_(MySQLStatementParser.AllClause_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#allClause_}.
	 * @param ctx the parse tree
	 */
	void exitAllClause_(MySQLStatementParser.AllClause_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#privileges_}.
	 * @param ctx the parse tree
	 */
	void enterPrivileges_(MySQLStatementParser.Privileges_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#privileges_}.
	 * @param ctx the parse tree
	 */
	void exitPrivileges_(MySQLStatementParser.Privileges_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#privilegeType_}.
	 * @param ctx the parse tree
	 */
	void enterPrivilegeType_(MySQLStatementParser.PrivilegeType_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#privilegeType_}.
	 * @param ctx the parse tree
	 */
	void exitPrivilegeType_(MySQLStatementParser.PrivilegeType_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#onObjectClause}.
	 * @param ctx the parse tree
	 */
	void enterOnObjectClause(MySQLStatementParser.OnObjectClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#onObjectClause}.
	 * @param ctx the parse tree
	 */
	void exitOnObjectClause(MySQLStatementParser.OnObjectClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#objectType_}.
	 * @param ctx the parse tree
	 */
	void enterObjectType_(MySQLStatementParser.ObjectType_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#objectType_}.
	 * @param ctx the parse tree
	 */
	void exitObjectType_(MySQLStatementParser.ObjectType_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#privilegeLevel}.
	 * @param ctx the parse tree
	 */
	void enterPrivilegeLevel(MySQLStatementParser.PrivilegeLevelContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#privilegeLevel}.
	 * @param ctx the parse tree
	 */
	void exitPrivilegeLevel(MySQLStatementParser.PrivilegeLevelContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#createUser}.
	 * @param ctx the parse tree
	 */
	void enterCreateUser(MySQLStatementParser.CreateUserContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#createUser}.
	 * @param ctx the parse tree
	 */
	void exitCreateUser(MySQLStatementParser.CreateUserContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#alterUser}.
	 * @param ctx the parse tree
	 */
	void enterAlterUser(MySQLStatementParser.AlterUserContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#alterUser}.
	 * @param ctx the parse tree
	 */
	void exitAlterUser(MySQLStatementParser.AlterUserContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#dropUser}.
	 * @param ctx the parse tree
	 */
	void enterDropUser(MySQLStatementParser.DropUserContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#dropUser}.
	 * @param ctx the parse tree
	 */
	void exitDropUser(MySQLStatementParser.DropUserContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#createRole}.
	 * @param ctx the parse tree
	 */
	void enterCreateRole(MySQLStatementParser.CreateRoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#createRole}.
	 * @param ctx the parse tree
	 */
	void exitCreateRole(MySQLStatementParser.CreateRoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#dropRole}.
	 * @param ctx the parse tree
	 */
	void enterDropRole(MySQLStatementParser.DropRoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#dropRole}.
	 * @param ctx the parse tree
	 */
	void exitDropRole(MySQLStatementParser.DropRoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#renameUser}.
	 * @param ctx the parse tree
	 */
	void enterRenameUser(MySQLStatementParser.RenameUserContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#renameUser}.
	 * @param ctx the parse tree
	 */
	void exitRenameUser(MySQLStatementParser.RenameUserContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#setDefaultRole}.
	 * @param ctx the parse tree
	 */
	void enterSetDefaultRole(MySQLStatementParser.SetDefaultRoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#setDefaultRole}.
	 * @param ctx the parse tree
	 */
	void exitSetDefaultRole(MySQLStatementParser.SetDefaultRoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#setRole}.
	 * @param ctx the parse tree
	 */
	void enterSetRole(MySQLStatementParser.SetRoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#setRole}.
	 * @param ctx the parse tree
	 */
	void exitSetRole(MySQLStatementParser.SetRoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#setPassword}.
	 * @param ctx the parse tree
	 */
	void enterSetPassword(MySQLStatementParser.SetPasswordContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#setPassword}.
	 * @param ctx the parse tree
	 */
	void exitSetPassword(MySQLStatementParser.SetPasswordContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#authOption_}.
	 * @param ctx the parse tree
	 */
	void enterAuthOption_(MySQLStatementParser.AuthOption_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#authOption_}.
	 * @param ctx the parse tree
	 */
	void exitAuthOption_(MySQLStatementParser.AuthOption_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#withGrantOption_}.
	 * @param ctx the parse tree
	 */
	void enterWithGrantOption_(MySQLStatementParser.WithGrantOption_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#withGrantOption_}.
	 * @param ctx the parse tree
	 */
	void exitWithGrantOption_(MySQLStatementParser.WithGrantOption_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#userOrRoles_}.
	 * @param ctx the parse tree
	 */
	void enterUserOrRoles_(MySQLStatementParser.UserOrRoles_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#userOrRoles_}.
	 * @param ctx the parse tree
	 */
	void exitUserOrRoles_(MySQLStatementParser.UserOrRoles_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#roles_}.
	 * @param ctx the parse tree
	 */
	void enterRoles_(MySQLStatementParser.Roles_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#roles_}.
	 * @param ctx the parse tree
	 */
	void exitRoles_(MySQLStatementParser.Roles_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#grantOption_}.
	 * @param ctx the parse tree
	 */
	void enterGrantOption_(MySQLStatementParser.GrantOption_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#grantOption_}.
	 * @param ctx the parse tree
	 */
	void exitGrantOption_(MySQLStatementParser.GrantOption_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#userAuthOption_}.
	 * @param ctx the parse tree
	 */
	void enterUserAuthOption_(MySQLStatementParser.UserAuthOption_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#userAuthOption_}.
	 * @param ctx the parse tree
	 */
	void exitUserAuthOption_(MySQLStatementParser.UserAuthOption_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#identifiedBy_}.
	 * @param ctx the parse tree
	 */
	void enterIdentifiedBy_(MySQLStatementParser.IdentifiedBy_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#identifiedBy_}.
	 * @param ctx the parse tree
	 */
	void exitIdentifiedBy_(MySQLStatementParser.IdentifiedBy_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#identifiedWith_}.
	 * @param ctx the parse tree
	 */
	void enterIdentifiedWith_(MySQLStatementParser.IdentifiedWith_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#identifiedWith_}.
	 * @param ctx the parse tree
	 */
	void exitIdentifiedWith_(MySQLStatementParser.IdentifiedWith_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#lockOption_}.
	 * @param ctx the parse tree
	 */
	void enterLockOption_(MySQLStatementParser.LockOption_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#lockOption_}.
	 * @param ctx the parse tree
	 */
	void exitLockOption_(MySQLStatementParser.LockOption_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#passwordOption_}.
	 * @param ctx the parse tree
	 */
	void enterPasswordOption_(MySQLStatementParser.PasswordOption_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#passwordOption_}.
	 * @param ctx the parse tree
	 */
	void exitPasswordOption_(MySQLStatementParser.PasswordOption_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#resourceOption_}.
	 * @param ctx the parse tree
	 */
	void enterResourceOption_(MySQLStatementParser.ResourceOption_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#resourceOption_}.
	 * @param ctx the parse tree
	 */
	void exitResourceOption_(MySQLStatementParser.ResourceOption_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#tlsOption_}.
	 * @param ctx the parse tree
	 */
	void enterTlsOption_(MySQLStatementParser.TlsOption_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#tlsOption_}.
	 * @param ctx the parse tree
	 */
	void exitTlsOption_(MySQLStatementParser.TlsOption_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#userFuncAuthOption_}.
	 * @param ctx the parse tree
	 */
	void enterUserFuncAuthOption_(MySQLStatementParser.UserFuncAuthOption_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#userFuncAuthOption_}.
	 * @param ctx the parse tree
	 */
	void exitUserFuncAuthOption_(MySQLStatementParser.UserFuncAuthOption_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#use}.
	 * @param ctx the parse tree
	 */
	void enterUse(MySQLStatementParser.UseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#use}.
	 * @param ctx the parse tree
	 */
	void exitUse(MySQLStatementParser.UseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#desc}.
	 * @param ctx the parse tree
	 */
	void enterDesc(MySQLStatementParser.DescContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#desc}.
	 * @param ctx the parse tree
	 */
	void exitDesc(MySQLStatementParser.DescContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showDatabases}.
	 * @param ctx the parse tree
	 */
	void enterShowDatabases(MySQLStatementParser.ShowDatabasesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showDatabases}.
	 * @param ctx the parse tree
	 */
	void exitShowDatabases(MySQLStatementParser.ShowDatabasesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showTables}.
	 * @param ctx the parse tree
	 */
	void enterShowTables(MySQLStatementParser.ShowTablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showTables}.
	 * @param ctx the parse tree
	 */
	void exitShowTables(MySQLStatementParser.ShowTablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showTableStatus}.
	 * @param ctx the parse tree
	 */
	void enterShowTableStatus(MySQLStatementParser.ShowTableStatusContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showTableStatus}.
	 * @param ctx the parse tree
	 */
	void exitShowTableStatus(MySQLStatementParser.ShowTableStatusContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showColumns}.
	 * @param ctx the parse tree
	 */
	void enterShowColumns(MySQLStatementParser.ShowColumnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showColumns}.
	 * @param ctx the parse tree
	 */
	void exitShowColumns(MySQLStatementParser.ShowColumnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showIndex}.
	 * @param ctx the parse tree
	 */
	void enterShowIndex(MySQLStatementParser.ShowIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showIndex}.
	 * @param ctx the parse tree
	 */
	void exitShowIndex(MySQLStatementParser.ShowIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showCreateTable}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateTable(MySQLStatementParser.ShowCreateTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showCreateTable}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateTable(MySQLStatementParser.ShowCreateTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showOther}.
	 * @param ctx the parse tree
	 */
	void enterShowOther(MySQLStatementParser.ShowOtherContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showOther}.
	 * @param ctx the parse tree
	 */
	void exitShowOther(MySQLStatementParser.ShowOtherContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#fromSchema}.
	 * @param ctx the parse tree
	 */
	void enterFromSchema(MySQLStatementParser.FromSchemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#fromSchema}.
	 * @param ctx the parse tree
	 */
	void exitFromSchema(MySQLStatementParser.FromSchemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#fromTable}.
	 * @param ctx the parse tree
	 */
	void enterFromTable(MySQLStatementParser.FromTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#fromTable}.
	 * @param ctx the parse tree
	 */
	void exitFromTable(MySQLStatementParser.FromTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showLike}.
	 * @param ctx the parse tree
	 */
	void enterShowLike(MySQLStatementParser.ShowLikeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showLike}.
	 * @param ctx the parse tree
	 */
	void exitShowLike(MySQLStatementParser.ShowLikeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showColumnLike_}.
	 * @param ctx the parse tree
	 */
	void enterShowColumnLike_(MySQLStatementParser.ShowColumnLike_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showColumnLike_}.
	 * @param ctx the parse tree
	 */
	void exitShowColumnLike_(MySQLStatementParser.ShowColumnLike_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showWhereClause_}.
	 * @param ctx the parse tree
	 */
	void enterShowWhereClause_(MySQLStatementParser.ShowWhereClause_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showWhereClause_}.
	 * @param ctx the parse tree
	 */
	void exitShowWhereClause_(MySQLStatementParser.ShowWhereClause_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showFilter}.
	 * @param ctx the parse tree
	 */
	void enterShowFilter(MySQLStatementParser.ShowFilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showFilter}.
	 * @param ctx the parse tree
	 */
	void exitShowFilter(MySQLStatementParser.ShowFilterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showProfileType}.
	 * @param ctx the parse tree
	 */
	void enterShowProfileType(MySQLStatementParser.ShowProfileTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showProfileType}.
	 * @param ctx the parse tree
	 */
	void exitShowProfileType(MySQLStatementParser.ShowProfileTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#setVariable}.
	 * @param ctx the parse tree
	 */
	void enterSetVariable(MySQLStatementParser.SetVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#setVariable}.
	 * @param ctx the parse tree
	 */
	void exitSetVariable(MySQLStatementParser.SetVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showBinaryLogs}.
	 * @param ctx the parse tree
	 */
	void enterShowBinaryLogs(MySQLStatementParser.ShowBinaryLogsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showBinaryLogs}.
	 * @param ctx the parse tree
	 */
	void exitShowBinaryLogs(MySQLStatementParser.ShowBinaryLogsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showBinlogEvents}.
	 * @param ctx the parse tree
	 */
	void enterShowBinlogEvents(MySQLStatementParser.ShowBinlogEventsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showBinlogEvents}.
	 * @param ctx the parse tree
	 */
	void exitShowBinlogEvents(MySQLStatementParser.ShowBinlogEventsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showCharacterSet}.
	 * @param ctx the parse tree
	 */
	void enterShowCharacterSet(MySQLStatementParser.ShowCharacterSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showCharacterSet}.
	 * @param ctx the parse tree
	 */
	void exitShowCharacterSet(MySQLStatementParser.ShowCharacterSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showCollation}.
	 * @param ctx the parse tree
	 */
	void enterShowCollation(MySQLStatementParser.ShowCollationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showCollation}.
	 * @param ctx the parse tree
	 */
	void exitShowCollation(MySQLStatementParser.ShowCollationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showCreateDatabase}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateDatabase(MySQLStatementParser.ShowCreateDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showCreateDatabase}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateDatabase(MySQLStatementParser.ShowCreateDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showCreateEvent}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateEvent(MySQLStatementParser.ShowCreateEventContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showCreateEvent}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateEvent(MySQLStatementParser.ShowCreateEventContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showCreateFunction}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateFunction(MySQLStatementParser.ShowCreateFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showCreateFunction}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateFunction(MySQLStatementParser.ShowCreateFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showCreateProcedure}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateProcedure(MySQLStatementParser.ShowCreateProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showCreateProcedure}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateProcedure(MySQLStatementParser.ShowCreateProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showCreateTrigger}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateTrigger(MySQLStatementParser.ShowCreateTriggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showCreateTrigger}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateTrigger(MySQLStatementParser.ShowCreateTriggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showCreateUser}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateUser(MySQLStatementParser.ShowCreateUserContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showCreateUser}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateUser(MySQLStatementParser.ShowCreateUserContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showCreateView}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateView(MySQLStatementParser.ShowCreateViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showCreateView}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateView(MySQLStatementParser.ShowCreateViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showEngine}.
	 * @param ctx the parse tree
	 */
	void enterShowEngine(MySQLStatementParser.ShowEngineContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showEngine}.
	 * @param ctx the parse tree
	 */
	void exitShowEngine(MySQLStatementParser.ShowEngineContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showEngines}.
	 * @param ctx the parse tree
	 */
	void enterShowEngines(MySQLStatementParser.ShowEnginesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showEngines}.
	 * @param ctx the parse tree
	 */
	void exitShowEngines(MySQLStatementParser.ShowEnginesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showErrors}.
	 * @param ctx the parse tree
	 */
	void enterShowErrors(MySQLStatementParser.ShowErrorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showErrors}.
	 * @param ctx the parse tree
	 */
	void exitShowErrors(MySQLStatementParser.ShowErrorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showEvents}.
	 * @param ctx the parse tree
	 */
	void enterShowEvents(MySQLStatementParser.ShowEventsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showEvents}.
	 * @param ctx the parse tree
	 */
	void exitShowEvents(MySQLStatementParser.ShowEventsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showFunctionCode}.
	 * @param ctx the parse tree
	 */
	void enterShowFunctionCode(MySQLStatementParser.ShowFunctionCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showFunctionCode}.
	 * @param ctx the parse tree
	 */
	void exitShowFunctionCode(MySQLStatementParser.ShowFunctionCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showFunctionStatus}.
	 * @param ctx the parse tree
	 */
	void enterShowFunctionStatus(MySQLStatementParser.ShowFunctionStatusContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showFunctionStatus}.
	 * @param ctx the parse tree
	 */
	void exitShowFunctionStatus(MySQLStatementParser.ShowFunctionStatusContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showGrant}.
	 * @param ctx the parse tree
	 */
	void enterShowGrant(MySQLStatementParser.ShowGrantContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showGrant}.
	 * @param ctx the parse tree
	 */
	void exitShowGrant(MySQLStatementParser.ShowGrantContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showMasterStatus}.
	 * @param ctx the parse tree
	 */
	void enterShowMasterStatus(MySQLStatementParser.ShowMasterStatusContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showMasterStatus}.
	 * @param ctx the parse tree
	 */
	void exitShowMasterStatus(MySQLStatementParser.ShowMasterStatusContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showOpenTables}.
	 * @param ctx the parse tree
	 */
	void enterShowOpenTables(MySQLStatementParser.ShowOpenTablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showOpenTables}.
	 * @param ctx the parse tree
	 */
	void exitShowOpenTables(MySQLStatementParser.ShowOpenTablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showPlugins}.
	 * @param ctx the parse tree
	 */
	void enterShowPlugins(MySQLStatementParser.ShowPluginsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showPlugins}.
	 * @param ctx the parse tree
	 */
	void exitShowPlugins(MySQLStatementParser.ShowPluginsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showPrivileges}.
	 * @param ctx the parse tree
	 */
	void enterShowPrivileges(MySQLStatementParser.ShowPrivilegesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showPrivileges}.
	 * @param ctx the parse tree
	 */
	void exitShowPrivileges(MySQLStatementParser.ShowPrivilegesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showProcedureCode}.
	 * @param ctx the parse tree
	 */
	void enterShowProcedureCode(MySQLStatementParser.ShowProcedureCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showProcedureCode}.
	 * @param ctx the parse tree
	 */
	void exitShowProcedureCode(MySQLStatementParser.ShowProcedureCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showProcedureStatus}.
	 * @param ctx the parse tree
	 */
	void enterShowProcedureStatus(MySQLStatementParser.ShowProcedureStatusContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showProcedureStatus}.
	 * @param ctx the parse tree
	 */
	void exitShowProcedureStatus(MySQLStatementParser.ShowProcedureStatusContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showProcesslist}.
	 * @param ctx the parse tree
	 */
	void enterShowProcesslist(MySQLStatementParser.ShowProcesslistContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showProcesslist}.
	 * @param ctx the parse tree
	 */
	void exitShowProcesslist(MySQLStatementParser.ShowProcesslistContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showProfile}.
	 * @param ctx the parse tree
	 */
	void enterShowProfile(MySQLStatementParser.ShowProfileContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showProfile}.
	 * @param ctx the parse tree
	 */
	void exitShowProfile(MySQLStatementParser.ShowProfileContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showProfiles}.
	 * @param ctx the parse tree
	 */
	void enterShowProfiles(MySQLStatementParser.ShowProfilesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showProfiles}.
	 * @param ctx the parse tree
	 */
	void exitShowProfiles(MySQLStatementParser.ShowProfilesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showRelaylogEvent}.
	 * @param ctx the parse tree
	 */
	void enterShowRelaylogEvent(MySQLStatementParser.ShowRelaylogEventContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showRelaylogEvent}.
	 * @param ctx the parse tree
	 */
	void exitShowRelaylogEvent(MySQLStatementParser.ShowRelaylogEventContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showSlavehost}.
	 * @param ctx the parse tree
	 */
	void enterShowSlavehost(MySQLStatementParser.ShowSlavehostContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showSlavehost}.
	 * @param ctx the parse tree
	 */
	void exitShowSlavehost(MySQLStatementParser.ShowSlavehostContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showSlaveStatus}.
	 * @param ctx the parse tree
	 */
	void enterShowSlaveStatus(MySQLStatementParser.ShowSlaveStatusContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showSlaveStatus}.
	 * @param ctx the parse tree
	 */
	void exitShowSlaveStatus(MySQLStatementParser.ShowSlaveStatusContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showStatus}.
	 * @param ctx the parse tree
	 */
	void enterShowStatus(MySQLStatementParser.ShowStatusContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showStatus}.
	 * @param ctx the parse tree
	 */
	void exitShowStatus(MySQLStatementParser.ShowStatusContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showTrriggers}.
	 * @param ctx the parse tree
	 */
	void enterShowTrriggers(MySQLStatementParser.ShowTrriggersContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showTrriggers}.
	 * @param ctx the parse tree
	 */
	void exitShowTrriggers(MySQLStatementParser.ShowTrriggersContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showVariables}.
	 * @param ctx the parse tree
	 */
	void enterShowVariables(MySQLStatementParser.ShowVariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showVariables}.
	 * @param ctx the parse tree
	 */
	void exitShowVariables(MySQLStatementParser.ShowVariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#showWarnings}.
	 * @param ctx the parse tree
	 */
	void enterShowWarnings(MySQLStatementParser.ShowWarningsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#showWarnings}.
	 * @param ctx the parse tree
	 */
	void exitShowWarnings(MySQLStatementParser.ShowWarningsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#setCharacter}.
	 * @param ctx the parse tree
	 */
	void enterSetCharacter(MySQLStatementParser.SetCharacterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#setCharacter}.
	 * @param ctx the parse tree
	 */
	void exitSetCharacter(MySQLStatementParser.SetCharacterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#setName}.
	 * @param ctx the parse tree
	 */
	void enterSetName(MySQLStatementParser.SetNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#setName}.
	 * @param ctx the parse tree
	 */
	void exitSetName(MySQLStatementParser.SetNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#clone}.
	 * @param ctx the parse tree
	 */
	void enterClone(MySQLStatementParser.CloneContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#clone}.
	 * @param ctx the parse tree
	 */
	void exitClone(MySQLStatementParser.CloneContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#cloneAction_}.
	 * @param ctx the parse tree
	 */
	void enterCloneAction_(MySQLStatementParser.CloneAction_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#cloneAction_}.
	 * @param ctx the parse tree
	 */
	void exitCloneAction_(MySQLStatementParser.CloneAction_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#createUdf}.
	 * @param ctx the parse tree
	 */
	void enterCreateUdf(MySQLStatementParser.CreateUdfContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#createUdf}.
	 * @param ctx the parse tree
	 */
	void exitCreateUdf(MySQLStatementParser.CreateUdfContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#installComponent}.
	 * @param ctx the parse tree
	 */
	void enterInstallComponent(MySQLStatementParser.InstallComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#installComponent}.
	 * @param ctx the parse tree
	 */
	void exitInstallComponent(MySQLStatementParser.InstallComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#installPlugin}.
	 * @param ctx the parse tree
	 */
	void enterInstallPlugin(MySQLStatementParser.InstallPluginContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#installPlugin}.
	 * @param ctx the parse tree
	 */
	void exitInstallPlugin(MySQLStatementParser.InstallPluginContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#uninstallComponent}.
	 * @param ctx the parse tree
	 */
	void enterUninstallComponent(MySQLStatementParser.UninstallComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#uninstallComponent}.
	 * @param ctx the parse tree
	 */
	void exitUninstallComponent(MySQLStatementParser.UninstallComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#uninstallPlugin}.
	 * @param ctx the parse tree
	 */
	void enterUninstallPlugin(MySQLStatementParser.UninstallPluginContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#uninstallPlugin}.
	 * @param ctx the parse tree
	 */
	void exitUninstallPlugin(MySQLStatementParser.UninstallPluginContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#analyzeTable}.
	 * @param ctx the parse tree
	 */
	void enterAnalyzeTable(MySQLStatementParser.AnalyzeTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#analyzeTable}.
	 * @param ctx the parse tree
	 */
	void exitAnalyzeTable(MySQLStatementParser.AnalyzeTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#checkTable}.
	 * @param ctx the parse tree
	 */
	void enterCheckTable(MySQLStatementParser.CheckTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#checkTable}.
	 * @param ctx the parse tree
	 */
	void exitCheckTable(MySQLStatementParser.CheckTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#checkTableOption_}.
	 * @param ctx the parse tree
	 */
	void enterCheckTableOption_(MySQLStatementParser.CheckTableOption_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#checkTableOption_}.
	 * @param ctx the parse tree
	 */
	void exitCheckTableOption_(MySQLStatementParser.CheckTableOption_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#checksumTable}.
	 * @param ctx the parse tree
	 */
	void enterChecksumTable(MySQLStatementParser.ChecksumTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#checksumTable}.
	 * @param ctx the parse tree
	 */
	void exitChecksumTable(MySQLStatementParser.ChecksumTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#optimizeTable}.
	 * @param ctx the parse tree
	 */
	void enterOptimizeTable(MySQLStatementParser.OptimizeTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#optimizeTable}.
	 * @param ctx the parse tree
	 */
	void exitOptimizeTable(MySQLStatementParser.OptimizeTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#repairTable}.
	 * @param ctx the parse tree
	 */
	void enterRepairTable(MySQLStatementParser.RepairTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#repairTable}.
	 * @param ctx the parse tree
	 */
	void exitRepairTable(MySQLStatementParser.RepairTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#alterResourceGroup}.
	 * @param ctx the parse tree
	 */
	void enterAlterResourceGroup(MySQLStatementParser.AlterResourceGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#alterResourceGroup}.
	 * @param ctx the parse tree
	 */
	void exitAlterResourceGroup(MySQLStatementParser.AlterResourceGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#vcpuSpec_}.
	 * @param ctx the parse tree
	 */
	void enterVcpuSpec_(MySQLStatementParser.VcpuSpec_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#vcpuSpec_}.
	 * @param ctx the parse tree
	 */
	void exitVcpuSpec_(MySQLStatementParser.VcpuSpec_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#createResourceGroup}.
	 * @param ctx the parse tree
	 */
	void enterCreateResourceGroup(MySQLStatementParser.CreateResourceGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#createResourceGroup}.
	 * @param ctx the parse tree
	 */
	void exitCreateResourceGroup(MySQLStatementParser.CreateResourceGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#dropResourceGroup}.
	 * @param ctx the parse tree
	 */
	void enterDropResourceGroup(MySQLStatementParser.DropResourceGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#dropResourceGroup}.
	 * @param ctx the parse tree
	 */
	void exitDropResourceGroup(MySQLStatementParser.DropResourceGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#setResourceGroup}.
	 * @param ctx the parse tree
	 */
	void enterSetResourceGroup(MySQLStatementParser.SetResourceGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#setResourceGroup}.
	 * @param ctx the parse tree
	 */
	void exitSetResourceGroup(MySQLStatementParser.SetResourceGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#binlog}.
	 * @param ctx the parse tree
	 */
	void enterBinlog(MySQLStatementParser.BinlogContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#binlog}.
	 * @param ctx the parse tree
	 */
	void exitBinlog(MySQLStatementParser.BinlogContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#cacheIndex}.
	 * @param ctx the parse tree
	 */
	void enterCacheIndex(MySQLStatementParser.CacheIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#cacheIndex}.
	 * @param ctx the parse tree
	 */
	void exitCacheIndex(MySQLStatementParser.CacheIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#tableIndexList}.
	 * @param ctx the parse tree
	 */
	void enterTableIndexList(MySQLStatementParser.TableIndexListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#tableIndexList}.
	 * @param ctx the parse tree
	 */
	void exitTableIndexList(MySQLStatementParser.TableIndexListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#partitionList}.
	 * @param ctx the parse tree
	 */
	void enterPartitionList(MySQLStatementParser.PartitionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#partitionList}.
	 * @param ctx the parse tree
	 */
	void exitPartitionList(MySQLStatementParser.PartitionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#flush}.
	 * @param ctx the parse tree
	 */
	void enterFlush(MySQLStatementParser.FlushContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#flush}.
	 * @param ctx the parse tree
	 */
	void exitFlush(MySQLStatementParser.FlushContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#flushOption_}.
	 * @param ctx the parse tree
	 */
	void enterFlushOption_(MySQLStatementParser.FlushOption_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#flushOption_}.
	 * @param ctx the parse tree
	 */
	void exitFlushOption_(MySQLStatementParser.FlushOption_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#tablesOption_}.
	 * @param ctx the parse tree
	 */
	void enterTablesOption_(MySQLStatementParser.TablesOption_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#tablesOption_}.
	 * @param ctx the parse tree
	 */
	void exitTablesOption_(MySQLStatementParser.TablesOption_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#kill}.
	 * @param ctx the parse tree
	 */
	void enterKill(MySQLStatementParser.KillContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#kill}.
	 * @param ctx the parse tree
	 */
	void exitKill(MySQLStatementParser.KillContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#loadIndexInfo}.
	 * @param ctx the parse tree
	 */
	void enterLoadIndexInfo(MySQLStatementParser.LoadIndexInfoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#loadIndexInfo}.
	 * @param ctx the parse tree
	 */
	void exitLoadIndexInfo(MySQLStatementParser.LoadIndexInfoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#resetStatement}.
	 * @param ctx the parse tree
	 */
	void enterResetStatement(MySQLStatementParser.ResetStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#resetStatement}.
	 * @param ctx the parse tree
	 */
	void exitResetStatement(MySQLStatementParser.ResetStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#resetOption_}.
	 * @param ctx the parse tree
	 */
	void enterResetOption_(MySQLStatementParser.ResetOption_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#resetOption_}.
	 * @param ctx the parse tree
	 */
	void exitResetOption_(MySQLStatementParser.ResetOption_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#resetPersist}.
	 * @param ctx the parse tree
	 */
	void enterResetPersist(MySQLStatementParser.ResetPersistContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#resetPersist}.
	 * @param ctx the parse tree
	 */
	void exitResetPersist(MySQLStatementParser.ResetPersistContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#restart}.
	 * @param ctx the parse tree
	 */
	void enterRestart(MySQLStatementParser.RestartContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#restart}.
	 * @param ctx the parse tree
	 */
	void exitRestart(MySQLStatementParser.RestartContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#shutdown}.
	 * @param ctx the parse tree
	 */
	void enterShutdown(MySQLStatementParser.ShutdownContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#shutdown}.
	 * @param ctx the parse tree
	 */
	void exitShutdown(MySQLStatementParser.ShutdownContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#changeMasterTo}.
	 * @param ctx the parse tree
	 */
	void enterChangeMasterTo(MySQLStatementParser.ChangeMasterToContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#changeMasterTo}.
	 * @param ctx the parse tree
	 */
	void exitChangeMasterTo(MySQLStatementParser.ChangeMasterToContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#startSlave}.
	 * @param ctx the parse tree
	 */
	void enterStartSlave(MySQLStatementParser.StartSlaveContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#startSlave}.
	 * @param ctx the parse tree
	 */
	void exitStartSlave(MySQLStatementParser.StartSlaveContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#stopSlave}.
	 * @param ctx the parse tree
	 */
	void enterStopSlave(MySQLStatementParser.StopSlaveContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#stopSlave}.
	 * @param ctx the parse tree
	 */
	void exitStopSlave(MySQLStatementParser.StopSlaveContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#threadTypes_}.
	 * @param ctx the parse tree
	 */
	void enterThreadTypes_(MySQLStatementParser.ThreadTypes_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#threadTypes_}.
	 * @param ctx the parse tree
	 */
	void exitThreadTypes_(MySQLStatementParser.ThreadTypes_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#threadType_}.
	 * @param ctx the parse tree
	 */
	void enterThreadType_(MySQLStatementParser.ThreadType_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#threadType_}.
	 * @param ctx the parse tree
	 */
	void exitThreadType_(MySQLStatementParser.ThreadType_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#utilOption_}.
	 * @param ctx the parse tree
	 */
	void enterUtilOption_(MySQLStatementParser.UtilOption_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#utilOption_}.
	 * @param ctx the parse tree
	 */
	void exitUtilOption_(MySQLStatementParser.UtilOption_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#connectionOptions_}.
	 * @param ctx the parse tree
	 */
	void enterConnectionOptions_(MySQLStatementParser.ConnectionOptions_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#connectionOptions_}.
	 * @param ctx the parse tree
	 */
	void exitConnectionOptions_(MySQLStatementParser.ConnectionOptions_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLStatementParser#channelOption_}.
	 * @param ctx the parse tree
	 */
	void enterChannelOption_(MySQLStatementParser.ChannelOption_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLStatementParser#channelOption_}.
	 * @param ctx the parse tree
	 */
	void exitChannelOption_(MySQLStatementParser.ChannelOption_Context ctx);
}