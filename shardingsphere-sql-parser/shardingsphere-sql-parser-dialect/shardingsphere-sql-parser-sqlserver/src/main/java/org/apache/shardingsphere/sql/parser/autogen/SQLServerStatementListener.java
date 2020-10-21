// Generated from D:/Develop/Git/main/github/sharding-sphere/shardingsphere-sql-parser/shardingsphere-sql-parser-dialect/shardingsphere-sql-parser-sqlserver/src/main/antlr4/org/apache/shardingsphere/sql/parser/autogen\SQLServerStatement.g4 by ANTLR 4.8
package org.apache.shardingsphere.sql.parser.autogen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SQLServerStatementParser}.
 */
public interface SQLServerStatementListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#execute}.
	 * @param ctx the parse tree
	 */
	void enterExecute(SQLServerStatementParser.ExecuteContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#execute}.
	 * @param ctx the parse tree
	 */
	void exitExecute(SQLServerStatementParser.ExecuteContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#insert}.
	 * @param ctx the parse tree
	 */
	void enterInsert(SQLServerStatementParser.InsertContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#insert}.
	 * @param ctx the parse tree
	 */
	void exitInsert(SQLServerStatementParser.InsertContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#insertValuesClause}.
	 * @param ctx the parse tree
	 */
	void enterInsertValuesClause(SQLServerStatementParser.InsertValuesClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#insertValuesClause}.
	 * @param ctx the parse tree
	 */
	void exitInsertValuesClause(SQLServerStatementParser.InsertValuesClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#insertSelectClause}.
	 * @param ctx the parse tree
	 */
	void enterInsertSelectClause(SQLServerStatementParser.InsertSelectClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#insertSelectClause}.
	 * @param ctx the parse tree
	 */
	void exitInsertSelectClause(SQLServerStatementParser.InsertSelectClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#update}.
	 * @param ctx the parse tree
	 */
	void enterUpdate(SQLServerStatementParser.UpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#update}.
	 * @param ctx the parse tree
	 */
	void exitUpdate(SQLServerStatementParser.UpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(SQLServerStatementParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(SQLServerStatementParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#setAssignmentsClause}.
	 * @param ctx the parse tree
	 */
	void enterSetAssignmentsClause(SQLServerStatementParser.SetAssignmentsClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#setAssignmentsClause}.
	 * @param ctx the parse tree
	 */
	void exitSetAssignmentsClause(SQLServerStatementParser.SetAssignmentsClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#assignmentValues}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentValues(SQLServerStatementParser.AssignmentValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#assignmentValues}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentValues(SQLServerStatementParser.AssignmentValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#assignmentValue}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentValue(SQLServerStatementParser.AssignmentValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#assignmentValue}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentValue(SQLServerStatementParser.AssignmentValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#delete}.
	 * @param ctx the parse tree
	 */
	void enterDelete(SQLServerStatementParser.DeleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#delete}.
	 * @param ctx the parse tree
	 */
	void exitDelete(SQLServerStatementParser.DeleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#singleTableClause}.
	 * @param ctx the parse tree
	 */
	void enterSingleTableClause(SQLServerStatementParser.SingleTableClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#singleTableClause}.
	 * @param ctx the parse tree
	 */
	void exitSingleTableClause(SQLServerStatementParser.SingleTableClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#multipleTablesClause}.
	 * @param ctx the parse tree
	 */
	void enterMultipleTablesClause(SQLServerStatementParser.MultipleTablesClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#multipleTablesClause}.
	 * @param ctx the parse tree
	 */
	void exitMultipleTablesClause(SQLServerStatementParser.MultipleTablesClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#multipleTableNames}.
	 * @param ctx the parse tree
	 */
	void enterMultipleTableNames(SQLServerStatementParser.MultipleTableNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#multipleTableNames}.
	 * @param ctx the parse tree
	 */
	void exitMultipleTableNames(SQLServerStatementParser.MultipleTableNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect(SQLServerStatementParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect(SQLServerStatementParser.SelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#unionClause}.
	 * @param ctx the parse tree
	 */
	void enterUnionClause(SQLServerStatementParser.UnionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#unionClause}.
	 * @param ctx the parse tree
	 */
	void exitUnionClause(SQLServerStatementParser.UnionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void enterSelectClause(SQLServerStatementParser.SelectClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void exitSelectClause(SQLServerStatementParser.SelectClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#duplicateSpecification}.
	 * @param ctx the parse tree
	 */
	void enterDuplicateSpecification(SQLServerStatementParser.DuplicateSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#duplicateSpecification}.
	 * @param ctx the parse tree
	 */
	void exitDuplicateSpecification(SQLServerStatementParser.DuplicateSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#projections}.
	 * @param ctx the parse tree
	 */
	void enterProjections(SQLServerStatementParser.ProjectionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#projections}.
	 * @param ctx the parse tree
	 */
	void exitProjections(SQLServerStatementParser.ProjectionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#projection}.
	 * @param ctx the parse tree
	 */
	void enterProjection(SQLServerStatementParser.ProjectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#projection}.
	 * @param ctx the parse tree
	 */
	void exitProjection(SQLServerStatementParser.ProjectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#top}.
	 * @param ctx the parse tree
	 */
	void enterTop(SQLServerStatementParser.TopContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#top}.
	 * @param ctx the parse tree
	 */
	void exitTop(SQLServerStatementParser.TopContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#alias}.
	 * @param ctx the parse tree
	 */
	void enterAlias(SQLServerStatementParser.AliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#alias}.
	 * @param ctx the parse tree
	 */
	void exitAlias(SQLServerStatementParser.AliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#unqualifiedShorthand}.
	 * @param ctx the parse tree
	 */
	void enterUnqualifiedShorthand(SQLServerStatementParser.UnqualifiedShorthandContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#unqualifiedShorthand}.
	 * @param ctx the parse tree
	 */
	void exitUnqualifiedShorthand(SQLServerStatementParser.UnqualifiedShorthandContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#qualifiedShorthand}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedShorthand(SQLServerStatementParser.QualifiedShorthandContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#qualifiedShorthand}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedShorthand(SQLServerStatementParser.QualifiedShorthandContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(SQLServerStatementParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(SQLServerStatementParser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#tableReferences}.
	 * @param ctx the parse tree
	 */
	void enterTableReferences(SQLServerStatementParser.TableReferencesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#tableReferences}.
	 * @param ctx the parse tree
	 */
	void exitTableReferences(SQLServerStatementParser.TableReferencesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#tableReference}.
	 * @param ctx the parse tree
	 */
	void enterTableReference(SQLServerStatementParser.TableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#tableReference}.
	 * @param ctx the parse tree
	 */
	void exitTableReference(SQLServerStatementParser.TableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#tableFactor}.
	 * @param ctx the parse tree
	 */
	void enterTableFactor(SQLServerStatementParser.TableFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#tableFactor}.
	 * @param ctx the parse tree
	 */
	void exitTableFactor(SQLServerStatementParser.TableFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#joinedTable}.
	 * @param ctx the parse tree
	 */
	void enterJoinedTable(SQLServerStatementParser.JoinedTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#joinedTable}.
	 * @param ctx the parse tree
	 */
	void exitJoinedTable(SQLServerStatementParser.JoinedTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#joinSpecification}.
	 * @param ctx the parse tree
	 */
	void enterJoinSpecification(SQLServerStatementParser.JoinSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#joinSpecification}.
	 * @param ctx the parse tree
	 */
	void exitJoinSpecification(SQLServerStatementParser.JoinSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(SQLServerStatementParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(SQLServerStatementParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void enterGroupByClause(SQLServerStatementParser.GroupByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void exitGroupByClause(SQLServerStatementParser.GroupByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void enterHavingClause(SQLServerStatementParser.HavingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void exitHavingClause(SQLServerStatementParser.HavingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#subquery}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(SQLServerStatementParser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#subquery}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(SQLServerStatementParser.SubqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#parameterMarker}.
	 * @param ctx the parse tree
	 */
	void enterParameterMarker(SQLServerStatementParser.ParameterMarkerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#parameterMarker}.
	 * @param ctx the parse tree
	 */
	void exitParameterMarker(SQLServerStatementParser.ParameterMarkerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#literals}.
	 * @param ctx the parse tree
	 */
	void enterLiterals(SQLServerStatementParser.LiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#literals}.
	 * @param ctx the parse tree
	 */
	void exitLiterals(SQLServerStatementParser.LiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#stringLiterals}.
	 * @param ctx the parse tree
	 */
	void enterStringLiterals(SQLServerStatementParser.StringLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#stringLiterals}.
	 * @param ctx the parse tree
	 */
	void exitStringLiterals(SQLServerStatementParser.StringLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#numberLiterals}.
	 * @param ctx the parse tree
	 */
	void enterNumberLiterals(SQLServerStatementParser.NumberLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#numberLiterals}.
	 * @param ctx the parse tree
	 */
	void exitNumberLiterals(SQLServerStatementParser.NumberLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#dateTimeLiterals}.
	 * @param ctx the parse tree
	 */
	void enterDateTimeLiterals(SQLServerStatementParser.DateTimeLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#dateTimeLiterals}.
	 * @param ctx the parse tree
	 */
	void exitDateTimeLiterals(SQLServerStatementParser.DateTimeLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#hexadecimalLiterals}.
	 * @param ctx the parse tree
	 */
	void enterHexadecimalLiterals(SQLServerStatementParser.HexadecimalLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#hexadecimalLiterals}.
	 * @param ctx the parse tree
	 */
	void exitHexadecimalLiterals(SQLServerStatementParser.HexadecimalLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#bitValueLiterals}.
	 * @param ctx the parse tree
	 */
	void enterBitValueLiterals(SQLServerStatementParser.BitValueLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#bitValueLiterals}.
	 * @param ctx the parse tree
	 */
	void exitBitValueLiterals(SQLServerStatementParser.BitValueLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#booleanLiterals}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiterals(SQLServerStatementParser.BooleanLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#booleanLiterals}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiterals(SQLServerStatementParser.BooleanLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#nullValueLiterals}.
	 * @param ctx the parse tree
	 */
	void enterNullValueLiterals(SQLServerStatementParser.NullValueLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#nullValueLiterals}.
	 * @param ctx the parse tree
	 */
	void exitNullValueLiterals(SQLServerStatementParser.NullValueLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(SQLServerStatementParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(SQLServerStatementParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#unreservedWord}.
	 * @param ctx the parse tree
	 */
	void enterUnreservedWord(SQLServerStatementParser.UnreservedWordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#unreservedWord}.
	 * @param ctx the parse tree
	 */
	void exitUnreservedWord(SQLServerStatementParser.UnreservedWordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#schemaName}.
	 * @param ctx the parse tree
	 */
	void enterSchemaName(SQLServerStatementParser.SchemaNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#schemaName}.
	 * @param ctx the parse tree
	 */
	void exitSchemaName(SQLServerStatementParser.SchemaNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(SQLServerStatementParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(SQLServerStatementParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#columnName}.
	 * @param ctx the parse tree
	 */
	void enterColumnName(SQLServerStatementParser.ColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#columnName}.
	 * @param ctx the parse tree
	 */
	void exitColumnName(SQLServerStatementParser.ColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#owner}.
	 * @param ctx the parse tree
	 */
	void enterOwner(SQLServerStatementParser.OwnerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#owner}.
	 * @param ctx the parse tree
	 */
	void exitOwner(SQLServerStatementParser.OwnerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(SQLServerStatementParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(SQLServerStatementParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#columnNames}.
	 * @param ctx the parse tree
	 */
	void enterColumnNames(SQLServerStatementParser.ColumnNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#columnNames}.
	 * @param ctx the parse tree
	 */
	void exitColumnNames(SQLServerStatementParser.ColumnNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#tableNames}.
	 * @param ctx the parse tree
	 */
	void enterTableNames(SQLServerStatementParser.TableNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#tableNames}.
	 * @param ctx the parse tree
	 */
	void exitTableNames(SQLServerStatementParser.TableNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#indexName}.
	 * @param ctx the parse tree
	 */
	void enterIndexName(SQLServerStatementParser.IndexNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#indexName}.
	 * @param ctx the parse tree
	 */
	void exitIndexName(SQLServerStatementParser.IndexNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#collationName}.
	 * @param ctx the parse tree
	 */
	void enterCollationName(SQLServerStatementParser.CollationNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#collationName}.
	 * @param ctx the parse tree
	 */
	void exitCollationName(SQLServerStatementParser.CollationNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#dataTypeLength}.
	 * @param ctx the parse tree
	 */
	void enterDataTypeLength(SQLServerStatementParser.DataTypeLengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#dataTypeLength}.
	 * @param ctx the parse tree
	 */
	void exitDataTypeLength(SQLServerStatementParser.DataTypeLengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#primaryKey}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryKey(SQLServerStatementParser.PrimaryKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#primaryKey}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryKey(SQLServerStatementParser.PrimaryKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SQLServerStatementParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SQLServerStatementParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOperator(SQLServerStatementParser.LogicalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOperator(SQLServerStatementParser.LogicalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#notOperator_}.
	 * @param ctx the parse tree
	 */
	void enterNotOperator_(SQLServerStatementParser.NotOperator_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#notOperator_}.
	 * @param ctx the parse tree
	 */
	void exitNotOperator_(SQLServerStatementParser.NotOperator_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#booleanPrimary}.
	 * @param ctx the parse tree
	 */
	void enterBooleanPrimary(SQLServerStatementParser.BooleanPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#booleanPrimary}.
	 * @param ctx the parse tree
	 */
	void exitBooleanPrimary(SQLServerStatementParser.BooleanPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(SQLServerStatementParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(SQLServerStatementParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(SQLServerStatementParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(SQLServerStatementParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#bitExpr}.
	 * @param ctx the parse tree
	 */
	void enterBitExpr(SQLServerStatementParser.BitExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#bitExpr}.
	 * @param ctx the parse tree
	 */
	void exitBitExpr(SQLServerStatementParser.BitExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpr(SQLServerStatementParser.SimpleExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpr(SQLServerStatementParser.SimpleExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(SQLServerStatementParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(SQLServerStatementParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#aggregationFunction}.
	 * @param ctx the parse tree
	 */
	void enterAggregationFunction(SQLServerStatementParser.AggregationFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#aggregationFunction}.
	 * @param ctx the parse tree
	 */
	void exitAggregationFunction(SQLServerStatementParser.AggregationFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#aggregationFunctionName}.
	 * @param ctx the parse tree
	 */
	void enterAggregationFunctionName(SQLServerStatementParser.AggregationFunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#aggregationFunctionName}.
	 * @param ctx the parse tree
	 */
	void exitAggregationFunctionName(SQLServerStatementParser.AggregationFunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#distinct}.
	 * @param ctx the parse tree
	 */
	void enterDistinct(SQLServerStatementParser.DistinctContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#distinct}.
	 * @param ctx the parse tree
	 */
	void exitDistinct(SQLServerStatementParser.DistinctContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#specialFunction}.
	 * @param ctx the parse tree
	 */
	void enterSpecialFunction(SQLServerStatementParser.SpecialFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#specialFunction}.
	 * @param ctx the parse tree
	 */
	void exitSpecialFunction(SQLServerStatementParser.SpecialFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#castFunction}.
	 * @param ctx the parse tree
	 */
	void enterCastFunction(SQLServerStatementParser.CastFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#castFunction}.
	 * @param ctx the parse tree
	 */
	void exitCastFunction(SQLServerStatementParser.CastFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#charFunction}.
	 * @param ctx the parse tree
	 */
	void enterCharFunction(SQLServerStatementParser.CharFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#charFunction}.
	 * @param ctx the parse tree
	 */
	void exitCharFunction(SQLServerStatementParser.CharFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#regularFunction}.
	 * @param ctx the parse tree
	 */
	void enterRegularFunction(SQLServerStatementParser.RegularFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#regularFunction}.
	 * @param ctx the parse tree
	 */
	void exitRegularFunction(SQLServerStatementParser.RegularFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#regularFunctionName_}.
	 * @param ctx the parse tree
	 */
	void enterRegularFunctionName_(SQLServerStatementParser.RegularFunctionName_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#regularFunctionName_}.
	 * @param ctx the parse tree
	 */
	void exitRegularFunctionName_(SQLServerStatementParser.RegularFunctionName_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#caseExpression}.
	 * @param ctx the parse tree
	 */
	void enterCaseExpression(SQLServerStatementParser.CaseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#caseExpression}.
	 * @param ctx the parse tree
	 */
	void exitCaseExpression(SQLServerStatementParser.CaseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#caseWhen_}.
	 * @param ctx the parse tree
	 */
	void enterCaseWhen_(SQLServerStatementParser.CaseWhen_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#caseWhen_}.
	 * @param ctx the parse tree
	 */
	void exitCaseWhen_(SQLServerStatementParser.CaseWhen_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#caseElse_}.
	 * @param ctx the parse tree
	 */
	void enterCaseElse_(SQLServerStatementParser.CaseElse_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#caseElse_}.
	 * @param ctx the parse tree
	 */
	void exitCaseElse_(SQLServerStatementParser.CaseElse_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#privateExprOfDb}.
	 * @param ctx the parse tree
	 */
	void enterPrivateExprOfDb(SQLServerStatementParser.PrivateExprOfDbContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#privateExprOfDb}.
	 * @param ctx the parse tree
	 */
	void exitPrivateExprOfDb(SQLServerStatementParser.PrivateExprOfDbContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void enterOrderByClause(SQLServerStatementParser.OrderByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void exitOrderByClause(SQLServerStatementParser.OrderByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#orderByItem}.
	 * @param ctx the parse tree
	 */
	void enterOrderByItem(SQLServerStatementParser.OrderByItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#orderByItem}.
	 * @param ctx the parse tree
	 */
	void exitOrderByItem(SQLServerStatementParser.OrderByItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(SQLServerStatementParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(SQLServerStatementParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#dataTypeName}.
	 * @param ctx the parse tree
	 */
	void enterDataTypeName(SQLServerStatementParser.DataTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#dataTypeName}.
	 * @param ctx the parse tree
	 */
	void exitDataTypeName(SQLServerStatementParser.DataTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#atTimeZoneExpr}.
	 * @param ctx the parse tree
	 */
	void enterAtTimeZoneExpr(SQLServerStatementParser.AtTimeZoneExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#atTimeZoneExpr}.
	 * @param ctx the parse tree
	 */
	void exitAtTimeZoneExpr(SQLServerStatementParser.AtTimeZoneExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#castExpr}.
	 * @param ctx the parse tree
	 */
	void enterCastExpr(SQLServerStatementParser.CastExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#castExpr}.
	 * @param ctx the parse tree
	 */
	void exitCastExpr(SQLServerStatementParser.CastExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#convertExpr}.
	 * @param ctx the parse tree
	 */
	void enterConvertExpr(SQLServerStatementParser.ConvertExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#convertExpr}.
	 * @param ctx the parse tree
	 */
	void exitConvertExpr(SQLServerStatementParser.ConvertExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#windowedFunction}.
	 * @param ctx the parse tree
	 */
	void enterWindowedFunction(SQLServerStatementParser.WindowedFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#windowedFunction}.
	 * @param ctx the parse tree
	 */
	void exitWindowedFunction(SQLServerStatementParser.WindowedFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#overClause}.
	 * @param ctx the parse tree
	 */
	void enterOverClause(SQLServerStatementParser.OverClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#overClause}.
	 * @param ctx the parse tree
	 */
	void exitOverClause(SQLServerStatementParser.OverClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#partitionByClause}.
	 * @param ctx the parse tree
	 */
	void enterPartitionByClause(SQLServerStatementParser.PartitionByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#partitionByClause}.
	 * @param ctx the parse tree
	 */
	void exitPartitionByClause(SQLServerStatementParser.PartitionByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#rowRangeClause}.
	 * @param ctx the parse tree
	 */
	void enterRowRangeClause(SQLServerStatementParser.RowRangeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#rowRangeClause}.
	 * @param ctx the parse tree
	 */
	void exitRowRangeClause(SQLServerStatementParser.RowRangeClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#windowFrameExtent}.
	 * @param ctx the parse tree
	 */
	void enterWindowFrameExtent(SQLServerStatementParser.WindowFrameExtentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#windowFrameExtent}.
	 * @param ctx the parse tree
	 */
	void exitWindowFrameExtent(SQLServerStatementParser.WindowFrameExtentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#windowFrameBetween}.
	 * @param ctx the parse tree
	 */
	void enterWindowFrameBetween(SQLServerStatementParser.WindowFrameBetweenContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#windowFrameBetween}.
	 * @param ctx the parse tree
	 */
	void exitWindowFrameBetween(SQLServerStatementParser.WindowFrameBetweenContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#windowFrameBound}.
	 * @param ctx the parse tree
	 */
	void enterWindowFrameBound(SQLServerStatementParser.WindowFrameBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#windowFrameBound}.
	 * @param ctx the parse tree
	 */
	void exitWindowFrameBound(SQLServerStatementParser.WindowFrameBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#windowFramePreceding}.
	 * @param ctx the parse tree
	 */
	void enterWindowFramePreceding(SQLServerStatementParser.WindowFramePrecedingContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#windowFramePreceding}.
	 * @param ctx the parse tree
	 */
	void exitWindowFramePreceding(SQLServerStatementParser.WindowFramePrecedingContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#windowFrameFollowing}.
	 * @param ctx the parse tree
	 */
	void enterWindowFrameFollowing(SQLServerStatementParser.WindowFrameFollowingContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#windowFrameFollowing}.
	 * @param ctx the parse tree
	 */
	void exitWindowFrameFollowing(SQLServerStatementParser.WindowFrameFollowingContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#columnNameWithSort}.
	 * @param ctx the parse tree
	 */
	void enterColumnNameWithSort(SQLServerStatementParser.ColumnNameWithSortContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#columnNameWithSort}.
	 * @param ctx the parse tree
	 */
	void exitColumnNameWithSort(SQLServerStatementParser.ColumnNameWithSortContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#indexOption}.
	 * @param ctx the parse tree
	 */
	void enterIndexOption(SQLServerStatementParser.IndexOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#indexOption}.
	 * @param ctx the parse tree
	 */
	void exitIndexOption(SQLServerStatementParser.IndexOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#compressionOption}.
	 * @param ctx the parse tree
	 */
	void enterCompressionOption(SQLServerStatementParser.CompressionOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#compressionOption}.
	 * @param ctx the parse tree
	 */
	void exitCompressionOption(SQLServerStatementParser.CompressionOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#eqTime}.
	 * @param ctx the parse tree
	 */
	void enterEqTime(SQLServerStatementParser.EqTimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#eqTime}.
	 * @param ctx the parse tree
	 */
	void exitEqTime(SQLServerStatementParser.EqTimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#eqOnOffOption}.
	 * @param ctx the parse tree
	 */
	void enterEqOnOffOption(SQLServerStatementParser.EqOnOffOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#eqOnOffOption}.
	 * @param ctx the parse tree
	 */
	void exitEqOnOffOption(SQLServerStatementParser.EqOnOffOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#eqKey}.
	 * @param ctx the parse tree
	 */
	void enterEqKey(SQLServerStatementParser.EqKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#eqKey}.
	 * @param ctx the parse tree
	 */
	void exitEqKey(SQLServerStatementParser.EqKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#eqOnOff}.
	 * @param ctx the parse tree
	 */
	void enterEqOnOff(SQLServerStatementParser.EqOnOffContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#eqOnOff}.
	 * @param ctx the parse tree
	 */
	void exitEqOnOff(SQLServerStatementParser.EqOnOffContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#onPartitionClause}.
	 * @param ctx the parse tree
	 */
	void enterOnPartitionClause(SQLServerStatementParser.OnPartitionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#onPartitionClause}.
	 * @param ctx the parse tree
	 */
	void exitOnPartitionClause(SQLServerStatementParser.OnPartitionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#partitionExpressions}.
	 * @param ctx the parse tree
	 */
	void enterPartitionExpressions(SQLServerStatementParser.PartitionExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#partitionExpressions}.
	 * @param ctx the parse tree
	 */
	void exitPartitionExpressions(SQLServerStatementParser.PartitionExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#partitionExpression}.
	 * @param ctx the parse tree
	 */
	void enterPartitionExpression(SQLServerStatementParser.PartitionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#partitionExpression}.
	 * @param ctx the parse tree
	 */
	void exitPartitionExpression(SQLServerStatementParser.PartitionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#numberRange}.
	 * @param ctx the parse tree
	 */
	void enterNumberRange(SQLServerStatementParser.NumberRangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#numberRange}.
	 * @param ctx the parse tree
	 */
	void exitNumberRange(SQLServerStatementParser.NumberRangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#lowPriorityLockWait}.
	 * @param ctx the parse tree
	 */
	void enterLowPriorityLockWait(SQLServerStatementParser.LowPriorityLockWaitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#lowPriorityLockWait}.
	 * @param ctx the parse tree
	 */
	void exitLowPriorityLockWait(SQLServerStatementParser.LowPriorityLockWaitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#onLowPriorLockWait}.
	 * @param ctx the parse tree
	 */
	void enterOnLowPriorLockWait(SQLServerStatementParser.OnLowPriorLockWaitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#onLowPriorLockWait}.
	 * @param ctx the parse tree
	 */
	void exitOnLowPriorLockWait(SQLServerStatementParser.OnLowPriorLockWaitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#ignoredIdentifier_}.
	 * @param ctx the parse tree
	 */
	void enterIgnoredIdentifier_(SQLServerStatementParser.IgnoredIdentifier_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#ignoredIdentifier_}.
	 * @param ctx the parse tree
	 */
	void exitIgnoredIdentifier_(SQLServerStatementParser.IgnoredIdentifier_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#ignoredIdentifiers_}.
	 * @param ctx the parse tree
	 */
	void enterIgnoredIdentifiers_(SQLServerStatementParser.IgnoredIdentifiers_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#ignoredIdentifiers_}.
	 * @param ctx the parse tree
	 */
	void exitIgnoredIdentifiers_(SQLServerStatementParser.IgnoredIdentifiers_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#matchNone}.
	 * @param ctx the parse tree
	 */
	void enterMatchNone(SQLServerStatementParser.MatchNoneContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#matchNone}.
	 * @param ctx the parse tree
	 */
	void exitMatchNone(SQLServerStatementParser.MatchNoneContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#createTable}.
	 * @param ctx the parse tree
	 */
	void enterCreateTable(SQLServerStatementParser.CreateTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#createTable}.
	 * @param ctx the parse tree
	 */
	void exitCreateTable(SQLServerStatementParser.CreateTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#createIndex}.
	 * @param ctx the parse tree
	 */
	void enterCreateIndex(SQLServerStatementParser.CreateIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#createIndex}.
	 * @param ctx the parse tree
	 */
	void exitCreateIndex(SQLServerStatementParser.CreateIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#alterTable}.
	 * @param ctx the parse tree
	 */
	void enterAlterTable(SQLServerStatementParser.AlterTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#alterTable}.
	 * @param ctx the parse tree
	 */
	void exitAlterTable(SQLServerStatementParser.AlterTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#alterIndex}.
	 * @param ctx the parse tree
	 */
	void enterAlterIndex(SQLServerStatementParser.AlterIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#alterIndex}.
	 * @param ctx the parse tree
	 */
	void exitAlterIndex(SQLServerStatementParser.AlterIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#dropTable}.
	 * @param ctx the parse tree
	 */
	void enterDropTable(SQLServerStatementParser.DropTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#dropTable}.
	 * @param ctx the parse tree
	 */
	void exitDropTable(SQLServerStatementParser.DropTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#dropIndex}.
	 * @param ctx the parse tree
	 */
	void enterDropIndex(SQLServerStatementParser.DropIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#dropIndex}.
	 * @param ctx the parse tree
	 */
	void exitDropIndex(SQLServerStatementParser.DropIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#truncateTable}.
	 * @param ctx the parse tree
	 */
	void enterTruncateTable(SQLServerStatementParser.TruncateTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#truncateTable}.
	 * @param ctx the parse tree
	 */
	void exitTruncateTable(SQLServerStatementParser.TruncateTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#fileTableClause_}.
	 * @param ctx the parse tree
	 */
	void enterFileTableClause_(SQLServerStatementParser.FileTableClause_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#fileTableClause_}.
	 * @param ctx the parse tree
	 */
	void exitFileTableClause_(SQLServerStatementParser.FileTableClause_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#createDefinitionClause}.
	 * @param ctx the parse tree
	 */
	void enterCreateDefinitionClause(SQLServerStatementParser.CreateDefinitionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#createDefinitionClause}.
	 * @param ctx the parse tree
	 */
	void exitCreateDefinitionClause(SQLServerStatementParser.CreateDefinitionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#createTableDefinitions}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableDefinitions(SQLServerStatementParser.CreateTableDefinitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#createTableDefinitions}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableDefinitions(SQLServerStatementParser.CreateTableDefinitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#createTableDefinition}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableDefinition(SQLServerStatementParser.CreateTableDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#createTableDefinition}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableDefinition(SQLServerStatementParser.CreateTableDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterColumnDefinition(SQLServerStatementParser.ColumnDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitColumnDefinition(SQLServerStatementParser.ColumnDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#columnDefinitionOption}.
	 * @param ctx the parse tree
	 */
	void enterColumnDefinitionOption(SQLServerStatementParser.ColumnDefinitionOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#columnDefinitionOption}.
	 * @param ctx the parse tree
	 */
	void exitColumnDefinitionOption(SQLServerStatementParser.ColumnDefinitionOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#encryptedOptions_}.
	 * @param ctx the parse tree
	 */
	void enterEncryptedOptions_(SQLServerStatementParser.EncryptedOptions_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#encryptedOptions_}.
	 * @param ctx the parse tree
	 */
	void exitEncryptedOptions_(SQLServerStatementParser.EncryptedOptions_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterColumnConstraint(SQLServerStatementParser.ColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitColumnConstraint(SQLServerStatementParser.ColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#primaryKeyConstraint}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryKeyConstraint(SQLServerStatementParser.PrimaryKeyConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#primaryKeyConstraint}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryKeyConstraint(SQLServerStatementParser.PrimaryKeyConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#diskTablePrimaryKeyConstraintOption}.
	 * @param ctx the parse tree
	 */
	void enterDiskTablePrimaryKeyConstraintOption(SQLServerStatementParser.DiskTablePrimaryKeyConstraintOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#diskTablePrimaryKeyConstraintOption}.
	 * @param ctx the parse tree
	 */
	void exitDiskTablePrimaryKeyConstraintOption(SQLServerStatementParser.DiskTablePrimaryKeyConstraintOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#clusterOption_}.
	 * @param ctx the parse tree
	 */
	void enterClusterOption_(SQLServerStatementParser.ClusterOption_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#clusterOption_}.
	 * @param ctx the parse tree
	 */
	void exitClusterOption_(SQLServerStatementParser.ClusterOption_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#primaryKeyWithClause}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryKeyWithClause(SQLServerStatementParser.PrimaryKeyWithClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#primaryKeyWithClause}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryKeyWithClause(SQLServerStatementParser.PrimaryKeyWithClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#primaryKeyOnClause}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryKeyOnClause(SQLServerStatementParser.PrimaryKeyOnClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#primaryKeyOnClause}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryKeyOnClause(SQLServerStatementParser.PrimaryKeyOnClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#onSchemaColumn}.
	 * @param ctx the parse tree
	 */
	void enterOnSchemaColumn(SQLServerStatementParser.OnSchemaColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#onSchemaColumn}.
	 * @param ctx the parse tree
	 */
	void exitOnSchemaColumn(SQLServerStatementParser.OnSchemaColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#onFileGroup}.
	 * @param ctx the parse tree
	 */
	void enterOnFileGroup(SQLServerStatementParser.OnFileGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#onFileGroup}.
	 * @param ctx the parse tree
	 */
	void exitOnFileGroup(SQLServerStatementParser.OnFileGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#onString}.
	 * @param ctx the parse tree
	 */
	void enterOnString(SQLServerStatementParser.OnStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#onString}.
	 * @param ctx the parse tree
	 */
	void exitOnString(SQLServerStatementParser.OnStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#memoryTablePrimaryKeyConstraintOption}.
	 * @param ctx the parse tree
	 */
	void enterMemoryTablePrimaryKeyConstraintOption(SQLServerStatementParser.MemoryTablePrimaryKeyConstraintOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#memoryTablePrimaryKeyConstraintOption}.
	 * @param ctx the parse tree
	 */
	void exitMemoryTablePrimaryKeyConstraintOption(SQLServerStatementParser.MemoryTablePrimaryKeyConstraintOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#withBucket}.
	 * @param ctx the parse tree
	 */
	void enterWithBucket(SQLServerStatementParser.WithBucketContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#withBucket}.
	 * @param ctx the parse tree
	 */
	void exitWithBucket(SQLServerStatementParser.WithBucketContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#columnForeignKeyConstraint}.
	 * @param ctx the parse tree
	 */
	void enterColumnForeignKeyConstraint(SQLServerStatementParser.ColumnForeignKeyConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#columnForeignKeyConstraint}.
	 * @param ctx the parse tree
	 */
	void exitColumnForeignKeyConstraint(SQLServerStatementParser.ColumnForeignKeyConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#foreignKeyOnAction}.
	 * @param ctx the parse tree
	 */
	void enterForeignKeyOnAction(SQLServerStatementParser.ForeignKeyOnActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#foreignKeyOnAction}.
	 * @param ctx the parse tree
	 */
	void exitForeignKeyOnAction(SQLServerStatementParser.ForeignKeyOnActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#foreignKeyOn}.
	 * @param ctx the parse tree
	 */
	void enterForeignKeyOn(SQLServerStatementParser.ForeignKeyOnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#foreignKeyOn}.
	 * @param ctx the parse tree
	 */
	void exitForeignKeyOn(SQLServerStatementParser.ForeignKeyOnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#checkConstraint}.
	 * @param ctx the parse tree
	 */
	void enterCheckConstraint(SQLServerStatementParser.CheckConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#checkConstraint}.
	 * @param ctx the parse tree
	 */
	void exitCheckConstraint(SQLServerStatementParser.CheckConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#columnIndex}.
	 * @param ctx the parse tree
	 */
	void enterColumnIndex(SQLServerStatementParser.ColumnIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#columnIndex}.
	 * @param ctx the parse tree
	 */
	void exitColumnIndex(SQLServerStatementParser.ColumnIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#withIndexOption_}.
	 * @param ctx the parse tree
	 */
	void enterWithIndexOption_(SQLServerStatementParser.WithIndexOption_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#withIndexOption_}.
	 * @param ctx the parse tree
	 */
	void exitWithIndexOption_(SQLServerStatementParser.WithIndexOption_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#indexOnClause}.
	 * @param ctx the parse tree
	 */
	void enterIndexOnClause(SQLServerStatementParser.IndexOnClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#indexOnClause}.
	 * @param ctx the parse tree
	 */
	void exitIndexOnClause(SQLServerStatementParser.IndexOnClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#onDefault}.
	 * @param ctx the parse tree
	 */
	void enterOnDefault(SQLServerStatementParser.OnDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#onDefault}.
	 * @param ctx the parse tree
	 */
	void exitOnDefault(SQLServerStatementParser.OnDefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#fileStreamOn_}.
	 * @param ctx the parse tree
	 */
	void enterFileStreamOn_(SQLServerStatementParser.FileStreamOn_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#fileStreamOn_}.
	 * @param ctx the parse tree
	 */
	void exitFileStreamOn_(SQLServerStatementParser.FileStreamOn_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#columnConstraints}.
	 * @param ctx the parse tree
	 */
	void enterColumnConstraints(SQLServerStatementParser.ColumnConstraintsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#columnConstraints}.
	 * @param ctx the parse tree
	 */
	void exitColumnConstraints(SQLServerStatementParser.ColumnConstraintsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#computedColumnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterComputedColumnDefinition(SQLServerStatementParser.ComputedColumnDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#computedColumnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitComputedColumnDefinition(SQLServerStatementParser.ComputedColumnDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#columnSetDefinition}.
	 * @param ctx the parse tree
	 */
	void enterColumnSetDefinition(SQLServerStatementParser.ColumnSetDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#columnSetDefinition}.
	 * @param ctx the parse tree
	 */
	void exitColumnSetDefinition(SQLServerStatementParser.ColumnSetDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void enterTableConstraint(SQLServerStatementParser.TableConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void exitTableConstraint(SQLServerStatementParser.TableConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#tablePrimaryConstraint}.
	 * @param ctx the parse tree
	 */
	void enterTablePrimaryConstraint(SQLServerStatementParser.TablePrimaryConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#tablePrimaryConstraint}.
	 * @param ctx the parse tree
	 */
	void exitTablePrimaryConstraint(SQLServerStatementParser.TablePrimaryConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#primaryKeyUnique}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryKeyUnique(SQLServerStatementParser.PrimaryKeyUniqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#primaryKeyUnique}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryKeyUnique(SQLServerStatementParser.PrimaryKeyUniqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#diskTablePrimaryConstraintOption}.
	 * @param ctx the parse tree
	 */
	void enterDiskTablePrimaryConstraintOption(SQLServerStatementParser.DiskTablePrimaryConstraintOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#diskTablePrimaryConstraintOption}.
	 * @param ctx the parse tree
	 */
	void exitDiskTablePrimaryConstraintOption(SQLServerStatementParser.DiskTablePrimaryConstraintOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#memoryTablePrimaryConstraintOption}.
	 * @param ctx the parse tree
	 */
	void enterMemoryTablePrimaryConstraintOption(SQLServerStatementParser.MemoryTablePrimaryConstraintOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#memoryTablePrimaryConstraintOption}.
	 * @param ctx the parse tree
	 */
	void exitMemoryTablePrimaryConstraintOption(SQLServerStatementParser.MemoryTablePrimaryConstraintOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#hashWithBucket}.
	 * @param ctx the parse tree
	 */
	void enterHashWithBucket(SQLServerStatementParser.HashWithBucketContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#hashWithBucket}.
	 * @param ctx the parse tree
	 */
	void exitHashWithBucket(SQLServerStatementParser.HashWithBucketContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#tableForeignKeyConstraint}.
	 * @param ctx the parse tree
	 */
	void enterTableForeignKeyConstraint(SQLServerStatementParser.TableForeignKeyConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#tableForeignKeyConstraint}.
	 * @param ctx the parse tree
	 */
	void exitTableForeignKeyConstraint(SQLServerStatementParser.TableForeignKeyConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#tableIndex}.
	 * @param ctx the parse tree
	 */
	void enterTableIndex(SQLServerStatementParser.TableIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#tableIndex}.
	 * @param ctx the parse tree
	 */
	void exitTableIndex(SQLServerStatementParser.TableIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#indexNameOption_}.
	 * @param ctx the parse tree
	 */
	void enterIndexNameOption_(SQLServerStatementParser.IndexNameOption_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#indexNameOption_}.
	 * @param ctx the parse tree
	 */
	void exitIndexNameOption_(SQLServerStatementParser.IndexNameOption_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#indexOptions_}.
	 * @param ctx the parse tree
	 */
	void enterIndexOptions_(SQLServerStatementParser.IndexOptions_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#indexOptions_}.
	 * @param ctx the parse tree
	 */
	void exitIndexOptions_(SQLServerStatementParser.IndexOptions_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#periodClause}.
	 * @param ctx the parse tree
	 */
	void enterPeriodClause(SQLServerStatementParser.PeriodClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#periodClause}.
	 * @param ctx the parse tree
	 */
	void exitPeriodClause(SQLServerStatementParser.PeriodClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#partitionScheme_}.
	 * @param ctx the parse tree
	 */
	void enterPartitionScheme_(SQLServerStatementParser.PartitionScheme_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#partitionScheme_}.
	 * @param ctx the parse tree
	 */
	void exitPartitionScheme_(SQLServerStatementParser.PartitionScheme_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#fileGroup_}.
	 * @param ctx the parse tree
	 */
	void enterFileGroup_(SQLServerStatementParser.FileGroup_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#fileGroup_}.
	 * @param ctx the parse tree
	 */
	void exitFileGroup_(SQLServerStatementParser.FileGroup_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#tableOptions}.
	 * @param ctx the parse tree
	 */
	void enterTableOptions(SQLServerStatementParser.TableOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#tableOptions}.
	 * @param ctx the parse tree
	 */
	void exitTableOptions(SQLServerStatementParser.TableOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOption(SQLServerStatementParser.TableOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOption(SQLServerStatementParser.TableOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#tableStretchOptions}.
	 * @param ctx the parse tree
	 */
	void enterTableStretchOptions(SQLServerStatementParser.TableStretchOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#tableStretchOptions}.
	 * @param ctx the parse tree
	 */
	void exitTableStretchOptions(SQLServerStatementParser.TableStretchOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#tableStretchOption}.
	 * @param ctx the parse tree
	 */
	void enterTableStretchOption(SQLServerStatementParser.TableStretchOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#tableStretchOption}.
	 * @param ctx the parse tree
	 */
	void exitTableStretchOption(SQLServerStatementParser.TableStretchOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#migrationState_}.
	 * @param ctx the parse tree
	 */
	void enterMigrationState_(SQLServerStatementParser.MigrationState_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#migrationState_}.
	 * @param ctx the parse tree
	 */
	void exitMigrationState_(SQLServerStatementParser.MigrationState_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#tableOperationOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOperationOption(SQLServerStatementParser.TableOperationOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#tableOperationOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOperationOption(SQLServerStatementParser.TableOperationOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#distributionOption}.
	 * @param ctx the parse tree
	 */
	void enterDistributionOption(SQLServerStatementParser.DistributionOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#distributionOption}.
	 * @param ctx the parse tree
	 */
	void exitDistributionOption(SQLServerStatementParser.DistributionOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#dataWareHouseTableOption}.
	 * @param ctx the parse tree
	 */
	void enterDataWareHouseTableOption(SQLServerStatementParser.DataWareHouseTableOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#dataWareHouseTableOption}.
	 * @param ctx the parse tree
	 */
	void exitDataWareHouseTableOption(SQLServerStatementParser.DataWareHouseTableOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#dataWareHousePartitionOption}.
	 * @param ctx the parse tree
	 */
	void enterDataWareHousePartitionOption(SQLServerStatementParser.DataWareHousePartitionOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#dataWareHousePartitionOption}.
	 * @param ctx the parse tree
	 */
	void exitDataWareHousePartitionOption(SQLServerStatementParser.DataWareHousePartitionOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#createIndexSpecification_}.
	 * @param ctx the parse tree
	 */
	void enterCreateIndexSpecification_(SQLServerStatementParser.CreateIndexSpecification_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#createIndexSpecification_}.
	 * @param ctx the parse tree
	 */
	void exitCreateIndexSpecification_(SQLServerStatementParser.CreateIndexSpecification_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#alterDefinitionClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterDefinitionClause(SQLServerStatementParser.AlterDefinitionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#alterDefinitionClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterDefinitionClause(SQLServerStatementParser.AlterDefinitionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#addColumnSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAddColumnSpecification(SQLServerStatementParser.AddColumnSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#addColumnSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAddColumnSpecification(SQLServerStatementParser.AddColumnSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#modifyColumnSpecification}.
	 * @param ctx the parse tree
	 */
	void enterModifyColumnSpecification(SQLServerStatementParser.ModifyColumnSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#modifyColumnSpecification}.
	 * @param ctx the parse tree
	 */
	void exitModifyColumnSpecification(SQLServerStatementParser.ModifyColumnSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#alterColumnOperation}.
	 * @param ctx the parse tree
	 */
	void enterAlterColumnOperation(SQLServerStatementParser.AlterColumnOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#alterColumnOperation}.
	 * @param ctx the parse tree
	 */
	void exitAlterColumnOperation(SQLServerStatementParser.AlterColumnOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#alterColumnAddOptions}.
	 * @param ctx the parse tree
	 */
	void enterAlterColumnAddOptions(SQLServerStatementParser.AlterColumnAddOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#alterColumnAddOptions}.
	 * @param ctx the parse tree
	 */
	void exitAlterColumnAddOptions(SQLServerStatementParser.AlterColumnAddOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#alterColumnAddOption}.
	 * @param ctx the parse tree
	 */
	void enterAlterColumnAddOption(SQLServerStatementParser.AlterColumnAddOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#alterColumnAddOption}.
	 * @param ctx the parse tree
	 */
	void exitAlterColumnAddOption(SQLServerStatementParser.AlterColumnAddOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#constraintForColumn}.
	 * @param ctx the parse tree
	 */
	void enterConstraintForColumn(SQLServerStatementParser.ConstraintForColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#constraintForColumn}.
	 * @param ctx the parse tree
	 */
	void exitConstraintForColumn(SQLServerStatementParser.ConstraintForColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#columnNameWithSortsWithParen}.
	 * @param ctx the parse tree
	 */
	void enterColumnNameWithSortsWithParen(SQLServerStatementParser.ColumnNameWithSortsWithParenContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#columnNameWithSortsWithParen}.
	 * @param ctx the parse tree
	 */
	void exitColumnNameWithSortsWithParen(SQLServerStatementParser.ColumnNameWithSortsWithParenContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#generatedColumnNamesClause}.
	 * @param ctx the parse tree
	 */
	void enterGeneratedColumnNamesClause(SQLServerStatementParser.GeneratedColumnNamesClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#generatedColumnNamesClause}.
	 * @param ctx the parse tree
	 */
	void exitGeneratedColumnNamesClause(SQLServerStatementParser.GeneratedColumnNamesClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#generatedColumnNameClause}.
	 * @param ctx the parse tree
	 */
	void enterGeneratedColumnNameClause(SQLServerStatementParser.GeneratedColumnNameClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#generatedColumnNameClause}.
	 * @param ctx the parse tree
	 */
	void exitGeneratedColumnNameClause(SQLServerStatementParser.GeneratedColumnNameClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#generatedColumnName}.
	 * @param ctx the parse tree
	 */
	void enterGeneratedColumnName(SQLServerStatementParser.GeneratedColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#generatedColumnName}.
	 * @param ctx the parse tree
	 */
	void exitGeneratedColumnName(SQLServerStatementParser.GeneratedColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#alterDrop}.
	 * @param ctx the parse tree
	 */
	void enterAlterDrop(SQLServerStatementParser.AlterDropContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#alterDrop}.
	 * @param ctx the parse tree
	 */
	void exitAlterDrop(SQLServerStatementParser.AlterDropContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#alterTableDropConstraint}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableDropConstraint(SQLServerStatementParser.AlterTableDropConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#alterTableDropConstraint}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableDropConstraint(SQLServerStatementParser.AlterTableDropConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#dropConstraintName}.
	 * @param ctx the parse tree
	 */
	void enterDropConstraintName(SQLServerStatementParser.DropConstraintNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#dropConstraintName}.
	 * @param ctx the parse tree
	 */
	void exitDropConstraintName(SQLServerStatementParser.DropConstraintNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#dropConstraintWithClause}.
	 * @param ctx the parse tree
	 */
	void enterDropConstraintWithClause(SQLServerStatementParser.DropConstraintWithClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#dropConstraintWithClause}.
	 * @param ctx the parse tree
	 */
	void exitDropConstraintWithClause(SQLServerStatementParser.DropConstraintWithClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#dropConstraintOption}.
	 * @param ctx the parse tree
	 */
	void enterDropConstraintOption(SQLServerStatementParser.DropConstraintOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#dropConstraintOption}.
	 * @param ctx the parse tree
	 */
	void exitDropConstraintOption(SQLServerStatementParser.DropConstraintOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#onOffOption_}.
	 * @param ctx the parse tree
	 */
	void enterOnOffOption_(SQLServerStatementParser.OnOffOption_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#onOffOption_}.
	 * @param ctx the parse tree
	 */
	void exitOnOffOption_(SQLServerStatementParser.OnOffOption_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#dropColumnSpecification}.
	 * @param ctx the parse tree
	 */
	void enterDropColumnSpecification(SQLServerStatementParser.DropColumnSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#dropColumnSpecification}.
	 * @param ctx the parse tree
	 */
	void exitDropColumnSpecification(SQLServerStatementParser.DropColumnSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#dropIndexSpecification}.
	 * @param ctx the parse tree
	 */
	void enterDropIndexSpecification(SQLServerStatementParser.DropIndexSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#dropIndexSpecification}.
	 * @param ctx the parse tree
	 */
	void exitDropIndexSpecification(SQLServerStatementParser.DropIndexSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#alterCheckConstraint}.
	 * @param ctx the parse tree
	 */
	void enterAlterCheckConstraint(SQLServerStatementParser.AlterCheckConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#alterCheckConstraint}.
	 * @param ctx the parse tree
	 */
	void exitAlterCheckConstraint(SQLServerStatementParser.AlterCheckConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#alterTrigger}.
	 * @param ctx the parse tree
	 */
	void enterAlterTrigger(SQLServerStatementParser.AlterTriggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#alterTrigger}.
	 * @param ctx the parse tree
	 */
	void exitAlterTrigger(SQLServerStatementParser.AlterTriggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#alterSwitch}.
	 * @param ctx the parse tree
	 */
	void enterAlterSwitch(SQLServerStatementParser.AlterSwitchContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#alterSwitch}.
	 * @param ctx the parse tree
	 */
	void exitAlterSwitch(SQLServerStatementParser.AlterSwitchContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#alterSet}.
	 * @param ctx the parse tree
	 */
	void enterAlterSet(SQLServerStatementParser.AlterSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#alterSet}.
	 * @param ctx the parse tree
	 */
	void exitAlterSet(SQLServerStatementParser.AlterSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#setFileStreamClause}.
	 * @param ctx the parse tree
	 */
	void enterSetFileStreamClause(SQLServerStatementParser.SetFileStreamClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#setFileStreamClause}.
	 * @param ctx the parse tree
	 */
	void exitSetFileStreamClause(SQLServerStatementParser.SetFileStreamClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#setSystemVersionClause}.
	 * @param ctx the parse tree
	 */
	void enterSetSystemVersionClause(SQLServerStatementParser.SetSystemVersionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#setSystemVersionClause}.
	 * @param ctx the parse tree
	 */
	void exitSetSystemVersionClause(SQLServerStatementParser.SetSystemVersionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#alterSetOnClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterSetOnClause(SQLServerStatementParser.AlterSetOnClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#alterSetOnClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterSetOnClause(SQLServerStatementParser.AlterSetOnClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#dataConsistencyCheckClause_}.
	 * @param ctx the parse tree
	 */
	void enterDataConsistencyCheckClause_(SQLServerStatementParser.DataConsistencyCheckClause_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#dataConsistencyCheckClause_}.
	 * @param ctx the parse tree
	 */
	void exitDataConsistencyCheckClause_(SQLServerStatementParser.DataConsistencyCheckClause_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#historyRetentionPeriodClause_}.
	 * @param ctx the parse tree
	 */
	void enterHistoryRetentionPeriodClause_(SQLServerStatementParser.HistoryRetentionPeriodClause_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#historyRetentionPeriodClause_}.
	 * @param ctx the parse tree
	 */
	void exitHistoryRetentionPeriodClause_(SQLServerStatementParser.HistoryRetentionPeriodClause_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#historyRetentionPeriod}.
	 * @param ctx the parse tree
	 */
	void enterHistoryRetentionPeriod(SQLServerStatementParser.HistoryRetentionPeriodContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#historyRetentionPeriod}.
	 * @param ctx the parse tree
	 */
	void exitHistoryRetentionPeriod(SQLServerStatementParser.HistoryRetentionPeriodContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#alterTableTableIndex}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableTableIndex(SQLServerStatementParser.AlterTableTableIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#alterTableTableIndex}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableTableIndex(SQLServerStatementParser.AlterTableTableIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#indexWithName}.
	 * @param ctx the parse tree
	 */
	void enterIndexWithName(SQLServerStatementParser.IndexWithNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#indexWithName}.
	 * @param ctx the parse tree
	 */
	void exitIndexWithName(SQLServerStatementParser.IndexWithNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#indexNonClusterClause}.
	 * @param ctx the parse tree
	 */
	void enterIndexNonClusterClause(SQLServerStatementParser.IndexNonClusterClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#indexNonClusterClause}.
	 * @param ctx the parse tree
	 */
	void exitIndexNonClusterClause(SQLServerStatementParser.IndexNonClusterClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#alterTableIndexOnClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableIndexOnClause(SQLServerStatementParser.AlterTableIndexOnClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#alterTableIndexOnClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableIndexOnClause(SQLServerStatementParser.AlterTableIndexOnClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#indexClusterClause}.
	 * @param ctx the parse tree
	 */
	void enterIndexClusterClause(SQLServerStatementParser.IndexClusterClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#indexClusterClause}.
	 * @param ctx the parse tree
	 */
	void exitIndexClusterClause(SQLServerStatementParser.IndexClusterClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#alterTableOption}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableOption(SQLServerStatementParser.AlterTableOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#alterTableOption}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableOption(SQLServerStatementParser.AlterTableOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#onHistoryTableClause}.
	 * @param ctx the parse tree
	 */
	void enterOnHistoryTableClause(SQLServerStatementParser.OnHistoryTableClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#onHistoryTableClause}.
	 * @param ctx the parse tree
	 */
	void exitOnHistoryTableClause(SQLServerStatementParser.OnHistoryTableClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#ifExist_}.
	 * @param ctx the parse tree
	 */
	void enterIfExist_(SQLServerStatementParser.IfExist_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#ifExist_}.
	 * @param ctx the parse tree
	 */
	void exitIfExist_(SQLServerStatementParser.IfExist_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#setTransaction}.
	 * @param ctx the parse tree
	 */
	void enterSetTransaction(SQLServerStatementParser.SetTransactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#setTransaction}.
	 * @param ctx the parse tree
	 */
	void exitSetTransaction(SQLServerStatementParser.SetTransactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#setImplicitTransactions}.
	 * @param ctx the parse tree
	 */
	void enterSetImplicitTransactions(SQLServerStatementParser.SetImplicitTransactionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#setImplicitTransactions}.
	 * @param ctx the parse tree
	 */
	void exitSetImplicitTransactions(SQLServerStatementParser.SetImplicitTransactionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#implicitTransactionsValue}.
	 * @param ctx the parse tree
	 */
	void enterImplicitTransactionsValue(SQLServerStatementParser.ImplicitTransactionsValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#implicitTransactionsValue}.
	 * @param ctx the parse tree
	 */
	void exitImplicitTransactionsValue(SQLServerStatementParser.ImplicitTransactionsValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#beginTransaction}.
	 * @param ctx the parse tree
	 */
	void enterBeginTransaction(SQLServerStatementParser.BeginTransactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#beginTransaction}.
	 * @param ctx the parse tree
	 */
	void exitBeginTransaction(SQLServerStatementParser.BeginTransactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#commit}.
	 * @param ctx the parse tree
	 */
	void enterCommit(SQLServerStatementParser.CommitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#commit}.
	 * @param ctx the parse tree
	 */
	void exitCommit(SQLServerStatementParser.CommitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#rollback}.
	 * @param ctx the parse tree
	 */
	void enterRollback(SQLServerStatementParser.RollbackContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#rollback}.
	 * @param ctx the parse tree
	 */
	void exitRollback(SQLServerStatementParser.RollbackContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#savepoint}.
	 * @param ctx the parse tree
	 */
	void enterSavepoint(SQLServerStatementParser.SavepointContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#savepoint}.
	 * @param ctx the parse tree
	 */
	void exitSavepoint(SQLServerStatementParser.SavepointContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#grant}.
	 * @param ctx the parse tree
	 */
	void enterGrant(SQLServerStatementParser.GrantContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#grant}.
	 * @param ctx the parse tree
	 */
	void exitGrant(SQLServerStatementParser.GrantContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#revoke}.
	 * @param ctx the parse tree
	 */
	void enterRevoke(SQLServerStatementParser.RevokeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#revoke}.
	 * @param ctx the parse tree
	 */
	void exitRevoke(SQLServerStatementParser.RevokeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#deny}.
	 * @param ctx the parse tree
	 */
	void enterDeny(SQLServerStatementParser.DenyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#deny}.
	 * @param ctx the parse tree
	 */
	void exitDeny(SQLServerStatementParser.DenyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#classPrivilegesClause}.
	 * @param ctx the parse tree
	 */
	void enterClassPrivilegesClause(SQLServerStatementParser.ClassPrivilegesClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#classPrivilegesClause}.
	 * @param ctx the parse tree
	 */
	void exitClassPrivilegesClause(SQLServerStatementParser.ClassPrivilegesClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#classTypePrivilegesClause}.
	 * @param ctx the parse tree
	 */
	void enterClassTypePrivilegesClause(SQLServerStatementParser.ClassTypePrivilegesClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#classTypePrivilegesClause}.
	 * @param ctx the parse tree
	 */
	void exitClassTypePrivilegesClause(SQLServerStatementParser.ClassTypePrivilegesClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#optionForClause_}.
	 * @param ctx the parse tree
	 */
	void enterOptionForClause_(SQLServerStatementParser.OptionForClause_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#optionForClause_}.
	 * @param ctx the parse tree
	 */
	void exitOptionForClause_(SQLServerStatementParser.OptionForClause_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#classPrivileges_}.
	 * @param ctx the parse tree
	 */
	void enterClassPrivileges_(SQLServerStatementParser.ClassPrivileges_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#classPrivileges_}.
	 * @param ctx the parse tree
	 */
	void exitClassPrivileges_(SQLServerStatementParser.ClassPrivileges_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#onClassClause}.
	 * @param ctx the parse tree
	 */
	void enterOnClassClause(SQLServerStatementParser.OnClassClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#onClassClause}.
	 * @param ctx the parse tree
	 */
	void exitOnClassClause(SQLServerStatementParser.OnClassClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#classTypePrivileges_}.
	 * @param ctx the parse tree
	 */
	void enterClassTypePrivileges_(SQLServerStatementParser.ClassTypePrivileges_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#classTypePrivileges_}.
	 * @param ctx the parse tree
	 */
	void exitClassTypePrivileges_(SQLServerStatementParser.ClassTypePrivileges_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#onClassTypeClause}.
	 * @param ctx the parse tree
	 */
	void enterOnClassTypeClause(SQLServerStatementParser.OnClassTypeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#onClassTypeClause}.
	 * @param ctx the parse tree
	 */
	void exitOnClassTypeClause(SQLServerStatementParser.OnClassTypeClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#privilegeType_}.
	 * @param ctx the parse tree
	 */
	void enterPrivilegeType_(SQLServerStatementParser.PrivilegeType_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#privilegeType_}.
	 * @param ctx the parse tree
	 */
	void exitPrivilegeType_(SQLServerStatementParser.PrivilegeType_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#basicPermission_}.
	 * @param ctx the parse tree
	 */
	void enterBasicPermission_(SQLServerStatementParser.BasicPermission_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#basicPermission_}.
	 * @param ctx the parse tree
	 */
	void exitBasicPermission_(SQLServerStatementParser.BasicPermission_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#objectPermission_}.
	 * @param ctx the parse tree
	 */
	void enterObjectPermission_(SQLServerStatementParser.ObjectPermission_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#objectPermission_}.
	 * @param ctx the parse tree
	 */
	void exitObjectPermission_(SQLServerStatementParser.ObjectPermission_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#serverPermission_}.
	 * @param ctx the parse tree
	 */
	void enterServerPermission_(SQLServerStatementParser.ServerPermission_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#serverPermission_}.
	 * @param ctx the parse tree
	 */
	void exitServerPermission_(SQLServerStatementParser.ServerPermission_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#serverPrincipalPermission_}.
	 * @param ctx the parse tree
	 */
	void enterServerPrincipalPermission_(SQLServerStatementParser.ServerPrincipalPermission_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#serverPrincipalPermission_}.
	 * @param ctx the parse tree
	 */
	void exitServerPrincipalPermission_(SQLServerStatementParser.ServerPrincipalPermission_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#databasePermission_}.
	 * @param ctx the parse tree
	 */
	void enterDatabasePermission_(SQLServerStatementParser.DatabasePermission_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#databasePermission_}.
	 * @param ctx the parse tree
	 */
	void exitDatabasePermission_(SQLServerStatementParser.DatabasePermission_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#databasePrincipalPermission_}.
	 * @param ctx the parse tree
	 */
	void enterDatabasePrincipalPermission_(SQLServerStatementParser.DatabasePrincipalPermission_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#databasePrincipalPermission_}.
	 * @param ctx the parse tree
	 */
	void exitDatabasePrincipalPermission_(SQLServerStatementParser.DatabasePrincipalPermission_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#schemaPermission_}.
	 * @param ctx the parse tree
	 */
	void enterSchemaPermission_(SQLServerStatementParser.SchemaPermission_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#schemaPermission_}.
	 * @param ctx the parse tree
	 */
	void exitSchemaPermission_(SQLServerStatementParser.SchemaPermission_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#serviceBrokerPermission_}.
	 * @param ctx the parse tree
	 */
	void enterServiceBrokerPermission_(SQLServerStatementParser.ServiceBrokerPermission_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#serviceBrokerPermission_}.
	 * @param ctx the parse tree
	 */
	void exitServiceBrokerPermission_(SQLServerStatementParser.ServiceBrokerPermission_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#endpointPermission_}.
	 * @param ctx the parse tree
	 */
	void enterEndpointPermission_(SQLServerStatementParser.EndpointPermission_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#endpointPermission_}.
	 * @param ctx the parse tree
	 */
	void exitEndpointPermission_(SQLServerStatementParser.EndpointPermission_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#certificatePermission_}.
	 * @param ctx the parse tree
	 */
	void enterCertificatePermission_(SQLServerStatementParser.CertificatePermission_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#certificatePermission_}.
	 * @param ctx the parse tree
	 */
	void exitCertificatePermission_(SQLServerStatementParser.CertificatePermission_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#symmetricKeyPermission_}.
	 * @param ctx the parse tree
	 */
	void enterSymmetricKeyPermission_(SQLServerStatementParser.SymmetricKeyPermission_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#symmetricKeyPermission_}.
	 * @param ctx the parse tree
	 */
	void exitSymmetricKeyPermission_(SQLServerStatementParser.SymmetricKeyPermission_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#asymmetricKeyPermission_}.
	 * @param ctx the parse tree
	 */
	void enterAsymmetricKeyPermission_(SQLServerStatementParser.AsymmetricKeyPermission_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#asymmetricKeyPermission_}.
	 * @param ctx the parse tree
	 */
	void exitAsymmetricKeyPermission_(SQLServerStatementParser.AsymmetricKeyPermission_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#assemblyPermission_}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyPermission_(SQLServerStatementParser.AssemblyPermission_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#assemblyPermission_}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyPermission_(SQLServerStatementParser.AssemblyPermission_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#availabilityGroupPermission_}.
	 * @param ctx the parse tree
	 */
	void enterAvailabilityGroupPermission_(SQLServerStatementParser.AvailabilityGroupPermission_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#availabilityGroupPermission_}.
	 * @param ctx the parse tree
	 */
	void exitAvailabilityGroupPermission_(SQLServerStatementParser.AvailabilityGroupPermission_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#fullTextPermission_}.
	 * @param ctx the parse tree
	 */
	void enterFullTextPermission_(SQLServerStatementParser.FullTextPermission_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#fullTextPermission_}.
	 * @param ctx the parse tree
	 */
	void exitFullTextPermission_(SQLServerStatementParser.FullTextPermission_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#class_}.
	 * @param ctx the parse tree
	 */
	void enterClass_(SQLServerStatementParser.Class_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#class_}.
	 * @param ctx the parse tree
	 */
	void exitClass_(SQLServerStatementParser.Class_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#classType_}.
	 * @param ctx the parse tree
	 */
	void enterClassType_(SQLServerStatementParser.ClassType_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#classType_}.
	 * @param ctx the parse tree
	 */
	void exitClassType_(SQLServerStatementParser.ClassType_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#roleClause_}.
	 * @param ctx the parse tree
	 */
	void enterRoleClause_(SQLServerStatementParser.RoleClause_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#roleClause_}.
	 * @param ctx the parse tree
	 */
	void exitRoleClause_(SQLServerStatementParser.RoleClause_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#createUser}.
	 * @param ctx the parse tree
	 */
	void enterCreateUser(SQLServerStatementParser.CreateUserContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#createUser}.
	 * @param ctx the parse tree
	 */
	void exitCreateUser(SQLServerStatementParser.CreateUserContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#dropUser}.
	 * @param ctx the parse tree
	 */
	void enterDropUser(SQLServerStatementParser.DropUserContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#dropUser}.
	 * @param ctx the parse tree
	 */
	void exitDropUser(SQLServerStatementParser.DropUserContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#alterUser}.
	 * @param ctx the parse tree
	 */
	void enterAlterUser(SQLServerStatementParser.AlterUserContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#alterUser}.
	 * @param ctx the parse tree
	 */
	void exitAlterUser(SQLServerStatementParser.AlterUserContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#createRole}.
	 * @param ctx the parse tree
	 */
	void enterCreateRole(SQLServerStatementParser.CreateRoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#createRole}.
	 * @param ctx the parse tree
	 */
	void exitCreateRole(SQLServerStatementParser.CreateRoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#dropRole}.
	 * @param ctx the parse tree
	 */
	void enterDropRole(SQLServerStatementParser.DropRoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#dropRole}.
	 * @param ctx the parse tree
	 */
	void exitDropRole(SQLServerStatementParser.DropRoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#alterRole}.
	 * @param ctx the parse tree
	 */
	void enterAlterRole(SQLServerStatementParser.AlterRoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#alterRole}.
	 * @param ctx the parse tree
	 */
	void exitAlterRole(SQLServerStatementParser.AlterRoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#createLogin}.
	 * @param ctx the parse tree
	 */
	void enterCreateLogin(SQLServerStatementParser.CreateLoginContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#createLogin}.
	 * @param ctx the parse tree
	 */
	void exitCreateLogin(SQLServerStatementParser.CreateLoginContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#dropLogin}.
	 * @param ctx the parse tree
	 */
	void enterDropLogin(SQLServerStatementParser.DropLoginContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#dropLogin}.
	 * @param ctx the parse tree
	 */
	void exitDropLogin(SQLServerStatementParser.DropLoginContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#alterLogin}.
	 * @param ctx the parse tree
	 */
	void enterAlterLogin(SQLServerStatementParser.AlterLoginContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#alterLogin}.
	 * @param ctx the parse tree
	 */
	void exitAlterLogin(SQLServerStatementParser.AlterLoginContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLServerStatementParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(SQLServerStatementParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLServerStatementParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(SQLServerStatementParser.CallContext ctx);
}