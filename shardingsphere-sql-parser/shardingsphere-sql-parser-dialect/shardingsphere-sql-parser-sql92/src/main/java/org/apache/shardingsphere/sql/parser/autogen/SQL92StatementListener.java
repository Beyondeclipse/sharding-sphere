// Generated from D:/Develop/Git/main/github/sharding-sphere/shardingsphere-sql-parser/shardingsphere-sql-parser-dialect/shardingsphere-sql-parser-sql92/src/main/antlr4/org/apache/shardingsphere/sql/parser/autogen\SQL92Statement.g4 by ANTLR 4.8
package org.apache.shardingsphere.sql.parser.autogen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SQL92StatementParser}.
 */
public interface SQL92StatementListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#execute}.
	 * @param ctx the parse tree
	 */
	void enterExecute(SQL92StatementParser.ExecuteContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#execute}.
	 * @param ctx the parse tree
	 */
	void exitExecute(SQL92StatementParser.ExecuteContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#insert}.
	 * @param ctx the parse tree
	 */
	void enterInsert(SQL92StatementParser.InsertContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#insert}.
	 * @param ctx the parse tree
	 */
	void exitInsert(SQL92StatementParser.InsertContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#insertValuesClause}.
	 * @param ctx the parse tree
	 */
	void enterInsertValuesClause(SQL92StatementParser.InsertValuesClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#insertValuesClause}.
	 * @param ctx the parse tree
	 */
	void exitInsertValuesClause(SQL92StatementParser.InsertValuesClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#insertSelectClause}.
	 * @param ctx the parse tree
	 */
	void enterInsertSelectClause(SQL92StatementParser.InsertSelectClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#insertSelectClause}.
	 * @param ctx the parse tree
	 */
	void exitInsertSelectClause(SQL92StatementParser.InsertSelectClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#update}.
	 * @param ctx the parse tree
	 */
	void enterUpdate(SQL92StatementParser.UpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#update}.
	 * @param ctx the parse tree
	 */
	void exitUpdate(SQL92StatementParser.UpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(SQL92StatementParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(SQL92StatementParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#setAssignmentsClause}.
	 * @param ctx the parse tree
	 */
	void enterSetAssignmentsClause(SQL92StatementParser.SetAssignmentsClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#setAssignmentsClause}.
	 * @param ctx the parse tree
	 */
	void exitSetAssignmentsClause(SQL92StatementParser.SetAssignmentsClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#assignmentValues}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentValues(SQL92StatementParser.AssignmentValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#assignmentValues}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentValues(SQL92StatementParser.AssignmentValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#assignmentValue}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentValue(SQL92StatementParser.AssignmentValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#assignmentValue}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentValue(SQL92StatementParser.AssignmentValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#blobValue}.
	 * @param ctx the parse tree
	 */
	void enterBlobValue(SQL92StatementParser.BlobValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#blobValue}.
	 * @param ctx the parse tree
	 */
	void exitBlobValue(SQL92StatementParser.BlobValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#delete}.
	 * @param ctx the parse tree
	 */
	void enterDelete(SQL92StatementParser.DeleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#delete}.
	 * @param ctx the parse tree
	 */
	void exitDelete(SQL92StatementParser.DeleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#singleTableClause}.
	 * @param ctx the parse tree
	 */
	void enterSingleTableClause(SQL92StatementParser.SingleTableClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#singleTableClause}.
	 * @param ctx the parse tree
	 */
	void exitSingleTableClause(SQL92StatementParser.SingleTableClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect(SQL92StatementParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect(SQL92StatementParser.SelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#unionClause}.
	 * @param ctx the parse tree
	 */
	void enterUnionClause(SQL92StatementParser.UnionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#unionClause}.
	 * @param ctx the parse tree
	 */
	void exitUnionClause(SQL92StatementParser.UnionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void enterSelectClause(SQL92StatementParser.SelectClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void exitSelectClause(SQL92StatementParser.SelectClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#selectSpecification}.
	 * @param ctx the parse tree
	 */
	void enterSelectSpecification(SQL92StatementParser.SelectSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#selectSpecification}.
	 * @param ctx the parse tree
	 */
	void exitSelectSpecification(SQL92StatementParser.SelectSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#duplicateSpecification}.
	 * @param ctx the parse tree
	 */
	void enterDuplicateSpecification(SQL92StatementParser.DuplicateSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#duplicateSpecification}.
	 * @param ctx the parse tree
	 */
	void exitDuplicateSpecification(SQL92StatementParser.DuplicateSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#projections}.
	 * @param ctx the parse tree
	 */
	void enterProjections(SQL92StatementParser.ProjectionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#projections}.
	 * @param ctx the parse tree
	 */
	void exitProjections(SQL92StatementParser.ProjectionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#projection}.
	 * @param ctx the parse tree
	 */
	void enterProjection(SQL92StatementParser.ProjectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#projection}.
	 * @param ctx the parse tree
	 */
	void exitProjection(SQL92StatementParser.ProjectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#alias}.
	 * @param ctx the parse tree
	 */
	void enterAlias(SQL92StatementParser.AliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#alias}.
	 * @param ctx the parse tree
	 */
	void exitAlias(SQL92StatementParser.AliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#unqualifiedShorthand}.
	 * @param ctx the parse tree
	 */
	void enterUnqualifiedShorthand(SQL92StatementParser.UnqualifiedShorthandContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#unqualifiedShorthand}.
	 * @param ctx the parse tree
	 */
	void exitUnqualifiedShorthand(SQL92StatementParser.UnqualifiedShorthandContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#qualifiedShorthand}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedShorthand(SQL92StatementParser.QualifiedShorthandContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#qualifiedShorthand}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedShorthand(SQL92StatementParser.QualifiedShorthandContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(SQL92StatementParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(SQL92StatementParser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#tableReferences}.
	 * @param ctx the parse tree
	 */
	void enterTableReferences(SQL92StatementParser.TableReferencesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#tableReferences}.
	 * @param ctx the parse tree
	 */
	void exitTableReferences(SQL92StatementParser.TableReferencesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#escapedTableReference}.
	 * @param ctx the parse tree
	 */
	void enterEscapedTableReference(SQL92StatementParser.EscapedTableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#escapedTableReference}.
	 * @param ctx the parse tree
	 */
	void exitEscapedTableReference(SQL92StatementParser.EscapedTableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#tableReference}.
	 * @param ctx the parse tree
	 */
	void enterTableReference(SQL92StatementParser.TableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#tableReference}.
	 * @param ctx the parse tree
	 */
	void exitTableReference(SQL92StatementParser.TableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#tableFactor}.
	 * @param ctx the parse tree
	 */
	void enterTableFactor(SQL92StatementParser.TableFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#tableFactor}.
	 * @param ctx the parse tree
	 */
	void exitTableFactor(SQL92StatementParser.TableFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#joinedTable}.
	 * @param ctx the parse tree
	 */
	void enterJoinedTable(SQL92StatementParser.JoinedTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#joinedTable}.
	 * @param ctx the parse tree
	 */
	void exitJoinedTable(SQL92StatementParser.JoinedTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#joinSpecification}.
	 * @param ctx the parse tree
	 */
	void enterJoinSpecification(SQL92StatementParser.JoinSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#joinSpecification}.
	 * @param ctx the parse tree
	 */
	void exitJoinSpecification(SQL92StatementParser.JoinSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(SQL92StatementParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(SQL92StatementParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void enterGroupByClause(SQL92StatementParser.GroupByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void exitGroupByClause(SQL92StatementParser.GroupByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void enterHavingClause(SQL92StatementParser.HavingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void exitHavingClause(SQL92StatementParser.HavingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void enterLimitClause(SQL92StatementParser.LimitClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void exitLimitClause(SQL92StatementParser.LimitClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#limitRowCount}.
	 * @param ctx the parse tree
	 */
	void enterLimitRowCount(SQL92StatementParser.LimitRowCountContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#limitRowCount}.
	 * @param ctx the parse tree
	 */
	void exitLimitRowCount(SQL92StatementParser.LimitRowCountContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#limitOffset}.
	 * @param ctx the parse tree
	 */
	void enterLimitOffset(SQL92StatementParser.LimitOffsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#limitOffset}.
	 * @param ctx the parse tree
	 */
	void exitLimitOffset(SQL92StatementParser.LimitOffsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#subquery}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(SQL92StatementParser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#subquery}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(SQL92StatementParser.SubqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#parameterMarker}.
	 * @param ctx the parse tree
	 */
	void enterParameterMarker(SQL92StatementParser.ParameterMarkerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#parameterMarker}.
	 * @param ctx the parse tree
	 */
	void exitParameterMarker(SQL92StatementParser.ParameterMarkerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#literals}.
	 * @param ctx the parse tree
	 */
	void enterLiterals(SQL92StatementParser.LiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#literals}.
	 * @param ctx the parse tree
	 */
	void exitLiterals(SQL92StatementParser.LiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#stringLiterals}.
	 * @param ctx the parse tree
	 */
	void enterStringLiterals(SQL92StatementParser.StringLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#stringLiterals}.
	 * @param ctx the parse tree
	 */
	void exitStringLiterals(SQL92StatementParser.StringLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#numberLiterals}.
	 * @param ctx the parse tree
	 */
	void enterNumberLiterals(SQL92StatementParser.NumberLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#numberLiterals}.
	 * @param ctx the parse tree
	 */
	void exitNumberLiterals(SQL92StatementParser.NumberLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#dateTimeLiterals}.
	 * @param ctx the parse tree
	 */
	void enterDateTimeLiterals(SQL92StatementParser.DateTimeLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#dateTimeLiterals}.
	 * @param ctx the parse tree
	 */
	void exitDateTimeLiterals(SQL92StatementParser.DateTimeLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#hexadecimalLiterals}.
	 * @param ctx the parse tree
	 */
	void enterHexadecimalLiterals(SQL92StatementParser.HexadecimalLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#hexadecimalLiterals}.
	 * @param ctx the parse tree
	 */
	void exitHexadecimalLiterals(SQL92StatementParser.HexadecimalLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#bitValueLiterals}.
	 * @param ctx the parse tree
	 */
	void enterBitValueLiterals(SQL92StatementParser.BitValueLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#bitValueLiterals}.
	 * @param ctx the parse tree
	 */
	void exitBitValueLiterals(SQL92StatementParser.BitValueLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#booleanLiterals}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiterals(SQL92StatementParser.BooleanLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#booleanLiterals}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiterals(SQL92StatementParser.BooleanLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#nullValueLiterals}.
	 * @param ctx the parse tree
	 */
	void enterNullValueLiterals(SQL92StatementParser.NullValueLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#nullValueLiterals}.
	 * @param ctx the parse tree
	 */
	void exitNullValueLiterals(SQL92StatementParser.NullValueLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(SQL92StatementParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(SQL92StatementParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#unreservedWord}.
	 * @param ctx the parse tree
	 */
	void enterUnreservedWord(SQL92StatementParser.UnreservedWordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#unreservedWord}.
	 * @param ctx the parse tree
	 */
	void exitUnreservedWord(SQL92StatementParser.UnreservedWordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(SQL92StatementParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(SQL92StatementParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#schemaName}.
	 * @param ctx the parse tree
	 */
	void enterSchemaName(SQL92StatementParser.SchemaNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#schemaName}.
	 * @param ctx the parse tree
	 */
	void exitSchemaName(SQL92StatementParser.SchemaNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(SQL92StatementParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(SQL92StatementParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#columnName}.
	 * @param ctx the parse tree
	 */
	void enterColumnName(SQL92StatementParser.ColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#columnName}.
	 * @param ctx the parse tree
	 */
	void exitColumnName(SQL92StatementParser.ColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#viewName}.
	 * @param ctx the parse tree
	 */
	void enterViewName(SQL92StatementParser.ViewNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#viewName}.
	 * @param ctx the parse tree
	 */
	void exitViewName(SQL92StatementParser.ViewNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#owner}.
	 * @param ctx the parse tree
	 */
	void enterOwner(SQL92StatementParser.OwnerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#owner}.
	 * @param ctx the parse tree
	 */
	void exitOwner(SQL92StatementParser.OwnerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(SQL92StatementParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(SQL92StatementParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#columnNames}.
	 * @param ctx the parse tree
	 */
	void enterColumnNames(SQL92StatementParser.ColumnNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#columnNames}.
	 * @param ctx the parse tree
	 */
	void exitColumnNames(SQL92StatementParser.ColumnNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#tableNames}.
	 * @param ctx the parse tree
	 */
	void enterTableNames(SQL92StatementParser.TableNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#tableNames}.
	 * @param ctx the parse tree
	 */
	void exitTableNames(SQL92StatementParser.TableNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#characterSetName_}.
	 * @param ctx the parse tree
	 */
	void enterCharacterSetName_(SQL92StatementParser.CharacterSetName_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#characterSetName_}.
	 * @param ctx the parse tree
	 */
	void exitCharacterSetName_(SQL92StatementParser.CharacterSetName_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SQL92StatementParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SQL92StatementParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOperator(SQL92StatementParser.LogicalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOperator(SQL92StatementParser.LogicalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#notOperator_}.
	 * @param ctx the parse tree
	 */
	void enterNotOperator_(SQL92StatementParser.NotOperator_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#notOperator_}.
	 * @param ctx the parse tree
	 */
	void exitNotOperator_(SQL92StatementParser.NotOperator_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#booleanPrimary}.
	 * @param ctx the parse tree
	 */
	void enterBooleanPrimary(SQL92StatementParser.BooleanPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#booleanPrimary}.
	 * @param ctx the parse tree
	 */
	void exitBooleanPrimary(SQL92StatementParser.BooleanPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(SQL92StatementParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(SQL92StatementParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(SQL92StatementParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(SQL92StatementParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#bitExpr}.
	 * @param ctx the parse tree
	 */
	void enterBitExpr(SQL92StatementParser.BitExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#bitExpr}.
	 * @param ctx the parse tree
	 */
	void exitBitExpr(SQL92StatementParser.BitExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpr(SQL92StatementParser.SimpleExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpr(SQL92StatementParser.SimpleExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(SQL92StatementParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(SQL92StatementParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#aggregationFunction}.
	 * @param ctx the parse tree
	 */
	void enterAggregationFunction(SQL92StatementParser.AggregationFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#aggregationFunction}.
	 * @param ctx the parse tree
	 */
	void exitAggregationFunction(SQL92StatementParser.AggregationFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#aggregationFunctionName}.
	 * @param ctx the parse tree
	 */
	void enterAggregationFunctionName(SQL92StatementParser.AggregationFunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#aggregationFunctionName}.
	 * @param ctx the parse tree
	 */
	void exitAggregationFunctionName(SQL92StatementParser.AggregationFunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#distinct}.
	 * @param ctx the parse tree
	 */
	void enterDistinct(SQL92StatementParser.DistinctContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#distinct}.
	 * @param ctx the parse tree
	 */
	void exitDistinct(SQL92StatementParser.DistinctContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#specialFunction}.
	 * @param ctx the parse tree
	 */
	void enterSpecialFunction(SQL92StatementParser.SpecialFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#specialFunction}.
	 * @param ctx the parse tree
	 */
	void exitSpecialFunction(SQL92StatementParser.SpecialFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#castFunction}.
	 * @param ctx the parse tree
	 */
	void enterCastFunction(SQL92StatementParser.CastFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#castFunction}.
	 * @param ctx the parse tree
	 */
	void exitCastFunction(SQL92StatementParser.CastFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#convertFunction}.
	 * @param ctx the parse tree
	 */
	void enterConvertFunction(SQL92StatementParser.ConvertFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#convertFunction}.
	 * @param ctx the parse tree
	 */
	void exitConvertFunction(SQL92StatementParser.ConvertFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#positionFunction}.
	 * @param ctx the parse tree
	 */
	void enterPositionFunction(SQL92StatementParser.PositionFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#positionFunction}.
	 * @param ctx the parse tree
	 */
	void exitPositionFunction(SQL92StatementParser.PositionFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#substringFunction}.
	 * @param ctx the parse tree
	 */
	void enterSubstringFunction(SQL92StatementParser.SubstringFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#substringFunction}.
	 * @param ctx the parse tree
	 */
	void exitSubstringFunction(SQL92StatementParser.SubstringFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#extractFunction}.
	 * @param ctx the parse tree
	 */
	void enterExtractFunction(SQL92StatementParser.ExtractFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#extractFunction}.
	 * @param ctx the parse tree
	 */
	void exitExtractFunction(SQL92StatementParser.ExtractFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#trimFunction_}.
	 * @param ctx the parse tree
	 */
	void enterTrimFunction_(SQL92StatementParser.TrimFunction_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#trimFunction_}.
	 * @param ctx the parse tree
	 */
	void exitTrimFunction_(SQL92StatementParser.TrimFunction_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#regularFunction}.
	 * @param ctx the parse tree
	 */
	void enterRegularFunction(SQL92StatementParser.RegularFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#regularFunction}.
	 * @param ctx the parse tree
	 */
	void exitRegularFunction(SQL92StatementParser.RegularFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#regularFunctionName_}.
	 * @param ctx the parse tree
	 */
	void enterRegularFunctionName_(SQL92StatementParser.RegularFunctionName_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#regularFunctionName_}.
	 * @param ctx the parse tree
	 */
	void exitRegularFunctionName_(SQL92StatementParser.RegularFunctionName_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#matchExpression_}.
	 * @param ctx the parse tree
	 */
	void enterMatchExpression_(SQL92StatementParser.MatchExpression_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#matchExpression_}.
	 * @param ctx the parse tree
	 */
	void exitMatchExpression_(SQL92StatementParser.MatchExpression_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#caseExpression}.
	 * @param ctx the parse tree
	 */
	void enterCaseExpression(SQL92StatementParser.CaseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#caseExpression}.
	 * @param ctx the parse tree
	 */
	void exitCaseExpression(SQL92StatementParser.CaseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#caseWhen_}.
	 * @param ctx the parse tree
	 */
	void enterCaseWhen_(SQL92StatementParser.CaseWhen_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#caseWhen_}.
	 * @param ctx the parse tree
	 */
	void exitCaseWhen_(SQL92StatementParser.CaseWhen_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#caseElse_}.
	 * @param ctx the parse tree
	 */
	void enterCaseElse_(SQL92StatementParser.CaseElse_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#caseElse_}.
	 * @param ctx the parse tree
	 */
	void exitCaseElse_(SQL92StatementParser.CaseElse_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#intervalExpression}.
	 * @param ctx the parse tree
	 */
	void enterIntervalExpression(SQL92StatementParser.IntervalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#intervalExpression}.
	 * @param ctx the parse tree
	 */
	void exitIntervalExpression(SQL92StatementParser.IntervalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#intervalUnit_}.
	 * @param ctx the parse tree
	 */
	void enterIntervalUnit_(SQL92StatementParser.IntervalUnit_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#intervalUnit_}.
	 * @param ctx the parse tree
	 */
	void exitIntervalUnit_(SQL92StatementParser.IntervalUnit_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void enterOrderByClause(SQL92StatementParser.OrderByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void exitOrderByClause(SQL92StatementParser.OrderByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#orderByItem}.
	 * @param ctx the parse tree
	 */
	void enterOrderByItem(SQL92StatementParser.OrderByItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#orderByItem}.
	 * @param ctx the parse tree
	 */
	void exitOrderByItem(SQL92StatementParser.OrderByItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(SQL92StatementParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(SQL92StatementParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#dataTypeName}.
	 * @param ctx the parse tree
	 */
	void enterDataTypeName(SQL92StatementParser.DataTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#dataTypeName}.
	 * @param ctx the parse tree
	 */
	void exitDataTypeName(SQL92StatementParser.DataTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#dataTypeLength}.
	 * @param ctx the parse tree
	 */
	void enterDataTypeLength(SQL92StatementParser.DataTypeLengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#dataTypeLength}.
	 * @param ctx the parse tree
	 */
	void exitDataTypeLength(SQL92StatementParser.DataTypeLengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#characterSet_}.
	 * @param ctx the parse tree
	 */
	void enterCharacterSet_(SQL92StatementParser.CharacterSet_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#characterSet_}.
	 * @param ctx the parse tree
	 */
	void exitCharacterSet_(SQL92StatementParser.CharacterSet_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#collateClause_}.
	 * @param ctx the parse tree
	 */
	void enterCollateClause_(SQL92StatementParser.CollateClause_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#collateClause_}.
	 * @param ctx the parse tree
	 */
	void exitCollateClause_(SQL92StatementParser.CollateClause_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#ignoredIdentifier_}.
	 * @param ctx the parse tree
	 */
	void enterIgnoredIdentifier_(SQL92StatementParser.IgnoredIdentifier_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#ignoredIdentifier_}.
	 * @param ctx the parse tree
	 */
	void exitIgnoredIdentifier_(SQL92StatementParser.IgnoredIdentifier_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#dropBehaviour_}.
	 * @param ctx the parse tree
	 */
	void enterDropBehaviour_(SQL92StatementParser.DropBehaviour_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#dropBehaviour_}.
	 * @param ctx the parse tree
	 */
	void exitDropBehaviour_(SQL92StatementParser.DropBehaviour_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#createTable}.
	 * @param ctx the parse tree
	 */
	void enterCreateTable(SQL92StatementParser.CreateTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#createTable}.
	 * @param ctx the parse tree
	 */
	void exitCreateTable(SQL92StatementParser.CreateTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#alterTable}.
	 * @param ctx the parse tree
	 */
	void enterAlterTable(SQL92StatementParser.AlterTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#alterTable}.
	 * @param ctx the parse tree
	 */
	void exitAlterTable(SQL92StatementParser.AlterTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#dropTable}.
	 * @param ctx the parse tree
	 */
	void enterDropTable(SQL92StatementParser.DropTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#dropTable}.
	 * @param ctx the parse tree
	 */
	void exitDropTable(SQL92StatementParser.DropTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#createDatabase}.
	 * @param ctx the parse tree
	 */
	void enterCreateDatabase(SQL92StatementParser.CreateDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#createDatabase}.
	 * @param ctx the parse tree
	 */
	void exitCreateDatabase(SQL92StatementParser.CreateDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#dropDatabase}.
	 * @param ctx the parse tree
	 */
	void enterDropDatabase(SQL92StatementParser.DropDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#dropDatabase}.
	 * @param ctx the parse tree
	 */
	void exitDropDatabase(SQL92StatementParser.DropDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#createView}.
	 * @param ctx the parse tree
	 */
	void enterCreateView(SQL92StatementParser.CreateViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#createView}.
	 * @param ctx the parse tree
	 */
	void exitCreateView(SQL92StatementParser.CreateViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#dropView}.
	 * @param ctx the parse tree
	 */
	void enterDropView(SQL92StatementParser.DropViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#dropView}.
	 * @param ctx the parse tree
	 */
	void exitDropView(SQL92StatementParser.DropViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#createTableSpecification_}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableSpecification_(SQL92StatementParser.CreateTableSpecification_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#createTableSpecification_}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableSpecification_(SQL92StatementParser.CreateTableSpecification_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#createDefinitionClause}.
	 * @param ctx the parse tree
	 */
	void enterCreateDefinitionClause(SQL92StatementParser.CreateDefinitionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#createDefinitionClause}.
	 * @param ctx the parse tree
	 */
	void exitCreateDefinitionClause(SQL92StatementParser.CreateDefinitionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#createDatabaseSpecification_}.
	 * @param ctx the parse tree
	 */
	void enterCreateDatabaseSpecification_(SQL92StatementParser.CreateDatabaseSpecification_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#createDatabaseSpecification_}.
	 * @param ctx the parse tree
	 */
	void exitCreateDatabaseSpecification_(SQL92StatementParser.CreateDatabaseSpecification_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#createDefinition}.
	 * @param ctx the parse tree
	 */
	void enterCreateDefinition(SQL92StatementParser.CreateDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#createDefinition}.
	 * @param ctx the parse tree
	 */
	void exitCreateDefinition(SQL92StatementParser.CreateDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterColumnDefinition(SQL92StatementParser.ColumnDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitColumnDefinition(SQL92StatementParser.ColumnDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#dataTypeOption}.
	 * @param ctx the parse tree
	 */
	void enterDataTypeOption(SQL92StatementParser.DataTypeOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#dataTypeOption}.
	 * @param ctx the parse tree
	 */
	void exitDataTypeOption(SQL92StatementParser.DataTypeOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#checkConstraintDefinition_}.
	 * @param ctx the parse tree
	 */
	void enterCheckConstraintDefinition_(SQL92StatementParser.CheckConstraintDefinition_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#checkConstraintDefinition_}.
	 * @param ctx the parse tree
	 */
	void exitCheckConstraintDefinition_(SQL92StatementParser.CheckConstraintDefinition_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#referenceDefinition}.
	 * @param ctx the parse tree
	 */
	void enterReferenceDefinition(SQL92StatementParser.ReferenceDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#referenceDefinition}.
	 * @param ctx the parse tree
	 */
	void exitReferenceDefinition(SQL92StatementParser.ReferenceDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#referenceOption_}.
	 * @param ctx the parse tree
	 */
	void enterReferenceOption_(SQL92StatementParser.ReferenceOption_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#referenceOption_}.
	 * @param ctx the parse tree
	 */
	void exitReferenceOption_(SQL92StatementParser.ReferenceOption_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#keyParts_}.
	 * @param ctx the parse tree
	 */
	void enterKeyParts_(SQL92StatementParser.KeyParts_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#keyParts_}.
	 * @param ctx the parse tree
	 */
	void exitKeyParts_(SQL92StatementParser.KeyParts_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#keyPart_}.
	 * @param ctx the parse tree
	 */
	void enterKeyPart_(SQL92StatementParser.KeyPart_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#keyPart_}.
	 * @param ctx the parse tree
	 */
	void exitKeyPart_(SQL92StatementParser.KeyPart_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#constraintDefinition}.
	 * @param ctx the parse tree
	 */
	void enterConstraintDefinition(SQL92StatementParser.ConstraintDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#constraintDefinition}.
	 * @param ctx the parse tree
	 */
	void exitConstraintDefinition(SQL92StatementParser.ConstraintDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#primaryKeyOption}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryKeyOption(SQL92StatementParser.PrimaryKeyOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#primaryKeyOption}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryKeyOption(SQL92StatementParser.PrimaryKeyOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#primaryKey}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryKey(SQL92StatementParser.PrimaryKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#primaryKey}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryKey(SQL92StatementParser.PrimaryKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#uniqueOption_}.
	 * @param ctx the parse tree
	 */
	void enterUniqueOption_(SQL92StatementParser.UniqueOption_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#uniqueOption_}.
	 * @param ctx the parse tree
	 */
	void exitUniqueOption_(SQL92StatementParser.UniqueOption_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#foreignKeyOption}.
	 * @param ctx the parse tree
	 */
	void enterForeignKeyOption(SQL92StatementParser.ForeignKeyOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#foreignKeyOption}.
	 * @param ctx the parse tree
	 */
	void exitForeignKeyOption(SQL92StatementParser.ForeignKeyOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#createLikeClause_}.
	 * @param ctx the parse tree
	 */
	void enterCreateLikeClause_(SQL92StatementParser.CreateLikeClause_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#createLikeClause_}.
	 * @param ctx the parse tree
	 */
	void exitCreateLikeClause_(SQL92StatementParser.CreateLikeClause_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#alterDefinitionClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterDefinitionClause(SQL92StatementParser.AlterDefinitionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#alterDefinitionClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterDefinitionClause(SQL92StatementParser.AlterDefinitionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#addColumnSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAddColumnSpecification(SQL92StatementParser.AddColumnSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#addColumnSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAddColumnSpecification(SQL92StatementParser.AddColumnSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#modifyColumnSpecification}.
	 * @param ctx the parse tree
	 */
	void enterModifyColumnSpecification(SQL92StatementParser.ModifyColumnSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#modifyColumnSpecification}.
	 * @param ctx the parse tree
	 */
	void exitModifyColumnSpecification(SQL92StatementParser.ModifyColumnSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#dropColumnSpecification}.
	 * @param ctx the parse tree
	 */
	void enterDropColumnSpecification(SQL92StatementParser.DropColumnSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#dropColumnSpecification}.
	 * @param ctx the parse tree
	 */
	void exitDropColumnSpecification(SQL92StatementParser.DropColumnSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#addConstraintSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAddConstraintSpecification(SQL92StatementParser.AddConstraintSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#addConstraintSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAddConstraintSpecification(SQL92StatementParser.AddConstraintSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#dropConstraintSpecification}.
	 * @param ctx the parse tree
	 */
	void enterDropConstraintSpecification(SQL92StatementParser.DropConstraintSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#dropConstraintSpecification}.
	 * @param ctx the parse tree
	 */
	void exitDropConstraintSpecification(SQL92StatementParser.DropConstraintSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#setTransaction}.
	 * @param ctx the parse tree
	 */
	void enterSetTransaction(SQL92StatementParser.SetTransactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#setTransaction}.
	 * @param ctx the parse tree
	 */
	void exitSetTransaction(SQL92StatementParser.SetTransactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#commit}.
	 * @param ctx the parse tree
	 */
	void enterCommit(SQL92StatementParser.CommitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#commit}.
	 * @param ctx the parse tree
	 */
	void exitCommit(SQL92StatementParser.CommitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#rollback}.
	 * @param ctx the parse tree
	 */
	void enterRollback(SQL92StatementParser.RollbackContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#rollback}.
	 * @param ctx the parse tree
	 */
	void exitRollback(SQL92StatementParser.RollbackContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#levelOfIsolation_}.
	 * @param ctx the parse tree
	 */
	void enterLevelOfIsolation_(SQL92StatementParser.LevelOfIsolation_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#levelOfIsolation_}.
	 * @param ctx the parse tree
	 */
	void exitLevelOfIsolation_(SQL92StatementParser.LevelOfIsolation_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#grant}.
	 * @param ctx the parse tree
	 */
	void enterGrant(SQL92StatementParser.GrantContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#grant}.
	 * @param ctx the parse tree
	 */
	void exitGrant(SQL92StatementParser.GrantContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#revoke}.
	 * @param ctx the parse tree
	 */
	void enterRevoke(SQL92StatementParser.RevokeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#revoke}.
	 * @param ctx the parse tree
	 */
	void exitRevoke(SQL92StatementParser.RevokeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#privilegeClause}.
	 * @param ctx the parse tree
	 */
	void enterPrivilegeClause(SQL92StatementParser.PrivilegeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#privilegeClause}.
	 * @param ctx the parse tree
	 */
	void exitPrivilegeClause(SQL92StatementParser.PrivilegeClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#privileges_}.
	 * @param ctx the parse tree
	 */
	void enterPrivileges_(SQL92StatementParser.Privileges_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#privileges_}.
	 * @param ctx the parse tree
	 */
	void exitPrivileges_(SQL92StatementParser.Privileges_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#privilegeType_}.
	 * @param ctx the parse tree
	 */
	void enterPrivilegeType_(SQL92StatementParser.PrivilegeType_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#privilegeType_}.
	 * @param ctx the parse tree
	 */
	void exitPrivilegeType_(SQL92StatementParser.PrivilegeType_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#grantee_}.
	 * @param ctx the parse tree
	 */
	void enterGrantee_(SQL92StatementParser.Grantee_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#grantee_}.
	 * @param ctx the parse tree
	 */
	void exitGrantee_(SQL92StatementParser.Grantee_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#onObjectClause}.
	 * @param ctx the parse tree
	 */
	void enterOnObjectClause(SQL92StatementParser.OnObjectClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#onObjectClause}.
	 * @param ctx the parse tree
	 */
	void exitOnObjectClause(SQL92StatementParser.OnObjectClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#objectType_}.
	 * @param ctx the parse tree
	 */
	void enterObjectType_(SQL92StatementParser.ObjectType_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#objectType_}.
	 * @param ctx the parse tree
	 */
	void exitObjectType_(SQL92StatementParser.ObjectType_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#privilegeLevel}.
	 * @param ctx the parse tree
	 */
	void enterPrivilegeLevel(SQL92StatementParser.PrivilegeLevelContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#privilegeLevel}.
	 * @param ctx the parse tree
	 */
	void exitPrivilegeLevel(SQL92StatementParser.PrivilegeLevelContext ctx);
}