// Generated from D:/Develop/Git/main/github/sharding-sphere/shardingsphere-sql-parser/shardingsphere-sql-parser-dialect/shardingsphere-sql-parser-postgresql/src/main/antlr4/org/apache/shardingsphere/sql/parser/autogen\PostgreSQLStatement.g4 by ANTLR 4.8
package org.apache.shardingsphere.sql.parser.autogen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PostgreSQLStatementParser}.
 */
public interface PostgreSQLStatementListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#execute}.
	 * @param ctx the parse tree
	 */
	void enterExecute(PostgreSQLStatementParser.ExecuteContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#execute}.
	 * @param ctx the parse tree
	 */
	void exitExecute(PostgreSQLStatementParser.ExecuteContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#insert}.
	 * @param ctx the parse tree
	 */
	void enterInsert(PostgreSQLStatementParser.InsertContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#insert}.
	 * @param ctx the parse tree
	 */
	void exitInsert(PostgreSQLStatementParser.InsertContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#insertValuesClause}.
	 * @param ctx the parse tree
	 */
	void enterInsertValuesClause(PostgreSQLStatementParser.InsertValuesClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#insertValuesClause}.
	 * @param ctx the parse tree
	 */
	void exitInsertValuesClause(PostgreSQLStatementParser.InsertValuesClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#insertSelectClause}.
	 * @param ctx the parse tree
	 */
	void enterInsertSelectClause(PostgreSQLStatementParser.InsertSelectClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#insertSelectClause}.
	 * @param ctx the parse tree
	 */
	void exitInsertSelectClause(PostgreSQLStatementParser.InsertSelectClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#update}.
	 * @param ctx the parse tree
	 */
	void enterUpdate(PostgreSQLStatementParser.UpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#update}.
	 * @param ctx the parse tree
	 */
	void exitUpdate(PostgreSQLStatementParser.UpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#updateSpecification_}.
	 * @param ctx the parse tree
	 */
	void enterUpdateSpecification_(PostgreSQLStatementParser.UpdateSpecification_Context ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#updateSpecification_}.
	 * @param ctx the parse tree
	 */
	void exitUpdateSpecification_(PostgreSQLStatementParser.UpdateSpecification_Context ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(PostgreSQLStatementParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(PostgreSQLStatementParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#setAssignmentsClause}.
	 * @param ctx the parse tree
	 */
	void enterSetAssignmentsClause(PostgreSQLStatementParser.SetAssignmentsClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#setAssignmentsClause}.
	 * @param ctx the parse tree
	 */
	void exitSetAssignmentsClause(PostgreSQLStatementParser.SetAssignmentsClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#assignmentValues}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentValues(PostgreSQLStatementParser.AssignmentValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#assignmentValues}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentValues(PostgreSQLStatementParser.AssignmentValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#assignmentValue}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentValue(PostgreSQLStatementParser.AssignmentValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#assignmentValue}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentValue(PostgreSQLStatementParser.AssignmentValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#delete}.
	 * @param ctx the parse tree
	 */
	void enterDelete(PostgreSQLStatementParser.DeleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#delete}.
	 * @param ctx the parse tree
	 */
	void exitDelete(PostgreSQLStatementParser.DeleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#deleteSpecification_}.
	 * @param ctx the parse tree
	 */
	void enterDeleteSpecification_(PostgreSQLStatementParser.DeleteSpecification_Context ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#deleteSpecification_}.
	 * @param ctx the parse tree
	 */
	void exitDeleteSpecification_(PostgreSQLStatementParser.DeleteSpecification_Context ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#singleTableClause}.
	 * @param ctx the parse tree
	 */
	void enterSingleTableClause(PostgreSQLStatementParser.SingleTableClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#singleTableClause}.
	 * @param ctx the parse tree
	 */
	void exitSingleTableClause(PostgreSQLStatementParser.SingleTableClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#multipleTablesClause}.
	 * @param ctx the parse tree
	 */
	void enterMultipleTablesClause(PostgreSQLStatementParser.MultipleTablesClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#multipleTablesClause}.
	 * @param ctx the parse tree
	 */
	void exitMultipleTablesClause(PostgreSQLStatementParser.MultipleTablesClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#multipleTableNames}.
	 * @param ctx the parse tree
	 */
	void enterMultipleTableNames(PostgreSQLStatementParser.MultipleTableNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#multipleTableNames}.
	 * @param ctx the parse tree
	 */
	void exitMultipleTableNames(PostgreSQLStatementParser.MultipleTableNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect(PostgreSQLStatementParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect(PostgreSQLStatementParser.SelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#unionClause}.
	 * @param ctx the parse tree
	 */
	void enterUnionClause(PostgreSQLStatementParser.UnionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#unionClause}.
	 * @param ctx the parse tree
	 */
	void exitUnionClause(PostgreSQLStatementParser.UnionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void enterSelectClause(PostgreSQLStatementParser.SelectClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void exitSelectClause(PostgreSQLStatementParser.SelectClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#duplicateSpecification}.
	 * @param ctx the parse tree
	 */
	void enterDuplicateSpecification(PostgreSQLStatementParser.DuplicateSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#duplicateSpecification}.
	 * @param ctx the parse tree
	 */
	void exitDuplicateSpecification(PostgreSQLStatementParser.DuplicateSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#projections}.
	 * @param ctx the parse tree
	 */
	void enterProjections(PostgreSQLStatementParser.ProjectionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#projections}.
	 * @param ctx the parse tree
	 */
	void exitProjections(PostgreSQLStatementParser.ProjectionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#projection}.
	 * @param ctx the parse tree
	 */
	void enterProjection(PostgreSQLStatementParser.ProjectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#projection}.
	 * @param ctx the parse tree
	 */
	void exitProjection(PostgreSQLStatementParser.ProjectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alias}.
	 * @param ctx the parse tree
	 */
	void enterAlias(PostgreSQLStatementParser.AliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alias}.
	 * @param ctx the parse tree
	 */
	void exitAlias(PostgreSQLStatementParser.AliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#unqualifiedShorthand}.
	 * @param ctx the parse tree
	 */
	void enterUnqualifiedShorthand(PostgreSQLStatementParser.UnqualifiedShorthandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#unqualifiedShorthand}.
	 * @param ctx the parse tree
	 */
	void exitUnqualifiedShorthand(PostgreSQLStatementParser.UnqualifiedShorthandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#qualifiedShorthand}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedShorthand(PostgreSQLStatementParser.QualifiedShorthandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#qualifiedShorthand}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedShorthand(PostgreSQLStatementParser.QualifiedShorthandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(PostgreSQLStatementParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(PostgreSQLStatementParser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#tableReferences}.
	 * @param ctx the parse tree
	 */
	void enterTableReferences(PostgreSQLStatementParser.TableReferencesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#tableReferences}.
	 * @param ctx the parse tree
	 */
	void exitTableReferences(PostgreSQLStatementParser.TableReferencesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#tableReference}.
	 * @param ctx the parse tree
	 */
	void enterTableReference(PostgreSQLStatementParser.TableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#tableReference}.
	 * @param ctx the parse tree
	 */
	void exitTableReference(PostgreSQLStatementParser.TableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#tableFactor}.
	 * @param ctx the parse tree
	 */
	void enterTableFactor(PostgreSQLStatementParser.TableFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#tableFactor}.
	 * @param ctx the parse tree
	 */
	void exitTableFactor(PostgreSQLStatementParser.TableFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#joinedTable}.
	 * @param ctx the parse tree
	 */
	void enterJoinedTable(PostgreSQLStatementParser.JoinedTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#joinedTable}.
	 * @param ctx the parse tree
	 */
	void exitJoinedTable(PostgreSQLStatementParser.JoinedTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#joinSpecification}.
	 * @param ctx the parse tree
	 */
	void enterJoinSpecification(PostgreSQLStatementParser.JoinSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#joinSpecification}.
	 * @param ctx the parse tree
	 */
	void exitJoinSpecification(PostgreSQLStatementParser.JoinSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(PostgreSQLStatementParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(PostgreSQLStatementParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void enterGroupByClause(PostgreSQLStatementParser.GroupByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void exitGroupByClause(PostgreSQLStatementParser.GroupByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void enterHavingClause(PostgreSQLStatementParser.HavingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void exitHavingClause(PostgreSQLStatementParser.HavingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void enterLimitClause(PostgreSQLStatementParser.LimitClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void exitLimitClause(PostgreSQLStatementParser.LimitClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#limitRowCountSyntax}.
	 * @param ctx the parse tree
	 */
	void enterLimitRowCountSyntax(PostgreSQLStatementParser.LimitRowCountSyntaxContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#limitRowCountSyntax}.
	 * @param ctx the parse tree
	 */
	void exitLimitRowCountSyntax(PostgreSQLStatementParser.LimitRowCountSyntaxContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#limitRowCount}.
	 * @param ctx the parse tree
	 */
	void enterLimitRowCount(PostgreSQLStatementParser.LimitRowCountContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#limitRowCount}.
	 * @param ctx the parse tree
	 */
	void exitLimitRowCount(PostgreSQLStatementParser.LimitRowCountContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#limitOffsetSyntax}.
	 * @param ctx the parse tree
	 */
	void enterLimitOffsetSyntax(PostgreSQLStatementParser.LimitOffsetSyntaxContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#limitOffsetSyntax}.
	 * @param ctx the parse tree
	 */
	void exitLimitOffsetSyntax(PostgreSQLStatementParser.LimitOffsetSyntaxContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#limitOffset}.
	 * @param ctx the parse tree
	 */
	void enterLimitOffset(PostgreSQLStatementParser.LimitOffsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#limitOffset}.
	 * @param ctx the parse tree
	 */
	void exitLimitOffset(PostgreSQLStatementParser.LimitOffsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#subquery}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(PostgreSQLStatementParser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#subquery}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(PostgreSQLStatementParser.SubqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#parameterMarker}.
	 * @param ctx the parse tree
	 */
	void enterParameterMarker(PostgreSQLStatementParser.ParameterMarkerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#parameterMarker}.
	 * @param ctx the parse tree
	 */
	void exitParameterMarker(PostgreSQLStatementParser.ParameterMarkerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#literals}.
	 * @param ctx the parse tree
	 */
	void enterLiterals(PostgreSQLStatementParser.LiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#literals}.
	 * @param ctx the parse tree
	 */
	void exitLiterals(PostgreSQLStatementParser.LiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#stringLiterals}.
	 * @param ctx the parse tree
	 */
	void enterStringLiterals(PostgreSQLStatementParser.StringLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#stringLiterals}.
	 * @param ctx the parse tree
	 */
	void exitStringLiterals(PostgreSQLStatementParser.StringLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#numberLiterals}.
	 * @param ctx the parse tree
	 */
	void enterNumberLiterals(PostgreSQLStatementParser.NumberLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#numberLiterals}.
	 * @param ctx the parse tree
	 */
	void exitNumberLiterals(PostgreSQLStatementParser.NumberLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#hexadecimalLiterals}.
	 * @param ctx the parse tree
	 */
	void enterHexadecimalLiterals(PostgreSQLStatementParser.HexadecimalLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#hexadecimalLiterals}.
	 * @param ctx the parse tree
	 */
	void exitHexadecimalLiterals(PostgreSQLStatementParser.HexadecimalLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#bitValueLiterals}.
	 * @param ctx the parse tree
	 */
	void enterBitValueLiterals(PostgreSQLStatementParser.BitValueLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#bitValueLiterals}.
	 * @param ctx the parse tree
	 */
	void exitBitValueLiterals(PostgreSQLStatementParser.BitValueLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#booleanLiterals}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiterals(PostgreSQLStatementParser.BooleanLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#booleanLiterals}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiterals(PostgreSQLStatementParser.BooleanLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#nullValueLiterals}.
	 * @param ctx the parse tree
	 */
	void enterNullValueLiterals(PostgreSQLStatementParser.NullValueLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#nullValueLiterals}.
	 * @param ctx the parse tree
	 */
	void exitNullValueLiterals(PostgreSQLStatementParser.NullValueLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#literalsType_}.
	 * @param ctx the parse tree
	 */
	void enterLiteralsType_(PostgreSQLStatementParser.LiteralsType_Context ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#literalsType_}.
	 * @param ctx the parse tree
	 */
	void exitLiteralsType_(PostgreSQLStatementParser.LiteralsType_Context ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(PostgreSQLStatementParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(PostgreSQLStatementParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#unicodeEscapes_}.
	 * @param ctx the parse tree
	 */
	void enterUnicodeEscapes_(PostgreSQLStatementParser.UnicodeEscapes_Context ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#unicodeEscapes_}.
	 * @param ctx the parse tree
	 */
	void exitUnicodeEscapes_(PostgreSQLStatementParser.UnicodeEscapes_Context ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#uescape_}.
	 * @param ctx the parse tree
	 */
	void enterUescape_(PostgreSQLStatementParser.Uescape_Context ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#uescape_}.
	 * @param ctx the parse tree
	 */
	void exitUescape_(PostgreSQLStatementParser.Uescape_Context ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#unreservedWord}.
	 * @param ctx the parse tree
	 */
	void enterUnreservedWord(PostgreSQLStatementParser.UnreservedWordContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#unreservedWord}.
	 * @param ctx the parse tree
	 */
	void exitUnreservedWord(PostgreSQLStatementParser.UnreservedWordContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#schemaName}.
	 * @param ctx the parse tree
	 */
	void enterSchemaName(PostgreSQLStatementParser.SchemaNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#schemaName}.
	 * @param ctx the parse tree
	 */
	void exitSchemaName(PostgreSQLStatementParser.SchemaNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(PostgreSQLStatementParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(PostgreSQLStatementParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#columnName}.
	 * @param ctx the parse tree
	 */
	void enterColumnName(PostgreSQLStatementParser.ColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#columnName}.
	 * @param ctx the parse tree
	 */
	void exitColumnName(PostgreSQLStatementParser.ColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#owner}.
	 * @param ctx the parse tree
	 */
	void enterOwner(PostgreSQLStatementParser.OwnerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#owner}.
	 * @param ctx the parse tree
	 */
	void exitOwner(PostgreSQLStatementParser.OwnerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(PostgreSQLStatementParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(PostgreSQLStatementParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#tableNames}.
	 * @param ctx the parse tree
	 */
	void enterTableNames(PostgreSQLStatementParser.TableNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#tableNames}.
	 * @param ctx the parse tree
	 */
	void exitTableNames(PostgreSQLStatementParser.TableNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#columnNames}.
	 * @param ctx the parse tree
	 */
	void enterColumnNames(PostgreSQLStatementParser.ColumnNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#columnNames}.
	 * @param ctx the parse tree
	 */
	void exitColumnNames(PostgreSQLStatementParser.ColumnNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#collationName}.
	 * @param ctx the parse tree
	 */
	void enterCollationName(PostgreSQLStatementParser.CollationNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#collationName}.
	 * @param ctx the parse tree
	 */
	void exitCollationName(PostgreSQLStatementParser.CollationNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#indexName}.
	 * @param ctx the parse tree
	 */
	void enterIndexName(PostgreSQLStatementParser.IndexNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#indexName}.
	 * @param ctx the parse tree
	 */
	void exitIndexName(PostgreSQLStatementParser.IndexNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#primaryKey}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryKey(PostgreSQLStatementParser.PrimaryKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#primaryKey}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryKey(PostgreSQLStatementParser.PrimaryKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(PostgreSQLStatementParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(PostgreSQLStatementParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOperator(PostgreSQLStatementParser.LogicalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOperator(PostgreSQLStatementParser.LogicalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#notOperator_}.
	 * @param ctx the parse tree
	 */
	void enterNotOperator_(PostgreSQLStatementParser.NotOperator_Context ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#notOperator_}.
	 * @param ctx the parse tree
	 */
	void exitNotOperator_(PostgreSQLStatementParser.NotOperator_Context ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#booleanPrimary}.
	 * @param ctx the parse tree
	 */
	void enterBooleanPrimary(PostgreSQLStatementParser.BooleanPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#booleanPrimary}.
	 * @param ctx the parse tree
	 */
	void exitBooleanPrimary(PostgreSQLStatementParser.BooleanPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(PostgreSQLStatementParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(PostgreSQLStatementParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(PostgreSQLStatementParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(PostgreSQLStatementParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#bitExpr}.
	 * @param ctx the parse tree
	 */
	void enterBitExpr(PostgreSQLStatementParser.BitExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#bitExpr}.
	 * @param ctx the parse tree
	 */
	void exitBitExpr(PostgreSQLStatementParser.BitExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpr(PostgreSQLStatementParser.SimpleExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpr(PostgreSQLStatementParser.SimpleExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(PostgreSQLStatementParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(PostgreSQLStatementParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#aggregationFunction}.
	 * @param ctx the parse tree
	 */
	void enterAggregationFunction(PostgreSQLStatementParser.AggregationFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#aggregationFunction}.
	 * @param ctx the parse tree
	 */
	void exitAggregationFunction(PostgreSQLStatementParser.AggregationFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#aggregationFunctionName}.
	 * @param ctx the parse tree
	 */
	void enterAggregationFunctionName(PostgreSQLStatementParser.AggregationFunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#aggregationFunctionName}.
	 * @param ctx the parse tree
	 */
	void exitAggregationFunctionName(PostgreSQLStatementParser.AggregationFunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#distinct}.
	 * @param ctx the parse tree
	 */
	void enterDistinct(PostgreSQLStatementParser.DistinctContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#distinct}.
	 * @param ctx the parse tree
	 */
	void exitDistinct(PostgreSQLStatementParser.DistinctContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#filterClause_}.
	 * @param ctx the parse tree
	 */
	void enterFilterClause_(PostgreSQLStatementParser.FilterClause_Context ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#filterClause_}.
	 * @param ctx the parse tree
	 */
	void exitFilterClause_(PostgreSQLStatementParser.FilterClause_Context ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#windowFunction}.
	 * @param ctx the parse tree
	 */
	void enterWindowFunction(PostgreSQLStatementParser.WindowFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#windowFunction}.
	 * @param ctx the parse tree
	 */
	void exitWindowFunction(PostgreSQLStatementParser.WindowFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#windowDefinition_}.
	 * @param ctx the parse tree
	 */
	void enterWindowDefinition_(PostgreSQLStatementParser.WindowDefinition_Context ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#windowDefinition_}.
	 * @param ctx the parse tree
	 */
	void exitWindowDefinition_(PostgreSQLStatementParser.WindowDefinition_Context ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#pratitionClause_}.
	 * @param ctx the parse tree
	 */
	void enterPratitionClause_(PostgreSQLStatementParser.PratitionClause_Context ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#pratitionClause_}.
	 * @param ctx the parse tree
	 */
	void exitPratitionClause_(PostgreSQLStatementParser.PratitionClause_Context ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#frameClause_}.
	 * @param ctx the parse tree
	 */
	void enterFrameClause_(PostgreSQLStatementParser.FrameClause_Context ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#frameClause_}.
	 * @param ctx the parse tree
	 */
	void exitFrameClause_(PostgreSQLStatementParser.FrameClause_Context ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#frameStart_}.
	 * @param ctx the parse tree
	 */
	void enterFrameStart_(PostgreSQLStatementParser.FrameStart_Context ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#frameStart_}.
	 * @param ctx the parse tree
	 */
	void exitFrameStart_(PostgreSQLStatementParser.FrameStart_Context ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#frameEnd_}.
	 * @param ctx the parse tree
	 */
	void enterFrameEnd_(PostgreSQLStatementParser.FrameEnd_Context ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#frameEnd_}.
	 * @param ctx the parse tree
	 */
	void exitFrameEnd_(PostgreSQLStatementParser.FrameEnd_Context ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#frameBetween_}.
	 * @param ctx the parse tree
	 */
	void enterFrameBetween_(PostgreSQLStatementParser.FrameBetween_Context ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#frameBetween_}.
	 * @param ctx the parse tree
	 */
	void exitFrameBetween_(PostgreSQLStatementParser.FrameBetween_Context ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#specialFunction}.
	 * @param ctx the parse tree
	 */
	void enterSpecialFunction(PostgreSQLStatementParser.SpecialFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#specialFunction}.
	 * @param ctx the parse tree
	 */
	void exitSpecialFunction(PostgreSQLStatementParser.SpecialFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#castFunction}.
	 * @param ctx the parse tree
	 */
	void enterCastFunction(PostgreSQLStatementParser.CastFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#castFunction}.
	 * @param ctx the parse tree
	 */
	void exitCastFunction(PostgreSQLStatementParser.CastFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#charFunction}.
	 * @param ctx the parse tree
	 */
	void enterCharFunction(PostgreSQLStatementParser.CharFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#charFunction}.
	 * @param ctx the parse tree
	 */
	void exitCharFunction(PostgreSQLStatementParser.CharFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#regularFunction}.
	 * @param ctx the parse tree
	 */
	void enterRegularFunction(PostgreSQLStatementParser.RegularFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#regularFunction}.
	 * @param ctx the parse tree
	 */
	void exitRegularFunction(PostgreSQLStatementParser.RegularFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#regularFunctionName_}.
	 * @param ctx the parse tree
	 */
	void enterRegularFunctionName_(PostgreSQLStatementParser.RegularFunctionName_Context ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#regularFunctionName_}.
	 * @param ctx the parse tree
	 */
	void exitRegularFunctionName_(PostgreSQLStatementParser.RegularFunctionName_Context ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#caseExpression}.
	 * @param ctx the parse tree
	 */
	void enterCaseExpression(PostgreSQLStatementParser.CaseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#caseExpression}.
	 * @param ctx the parse tree
	 */
	void exitCaseExpression(PostgreSQLStatementParser.CaseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#caseWhen_}.
	 * @param ctx the parse tree
	 */
	void enterCaseWhen_(PostgreSQLStatementParser.CaseWhen_Context ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#caseWhen_}.
	 * @param ctx the parse tree
	 */
	void exitCaseWhen_(PostgreSQLStatementParser.CaseWhen_Context ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#caseElse_}.
	 * @param ctx the parse tree
	 */
	void enterCaseElse_(PostgreSQLStatementParser.CaseElse_Context ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#caseElse_}.
	 * @param ctx the parse tree
	 */
	void exitCaseElse_(PostgreSQLStatementParser.CaseElse_Context ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void enterOrderByClause(PostgreSQLStatementParser.OrderByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void exitOrderByClause(PostgreSQLStatementParser.OrderByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#orderByItem}.
	 * @param ctx the parse tree
	 */
	void enterOrderByItem(PostgreSQLStatementParser.OrderByItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#orderByItem}.
	 * @param ctx the parse tree
	 */
	void exitOrderByItem(PostgreSQLStatementParser.OrderByItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(PostgreSQLStatementParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(PostgreSQLStatementParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#dataTypeName}.
	 * @param ctx the parse tree
	 */
	void enterDataTypeName(PostgreSQLStatementParser.DataTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#dataTypeName}.
	 * @param ctx the parse tree
	 */
	void exitDataTypeName(PostgreSQLStatementParser.DataTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#dataTypeLength}.
	 * @param ctx the parse tree
	 */
	void enterDataTypeLength(PostgreSQLStatementParser.DataTypeLengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#dataTypeLength}.
	 * @param ctx the parse tree
	 */
	void exitDataTypeLength(PostgreSQLStatementParser.DataTypeLengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#characterSet_}.
	 * @param ctx the parse tree
	 */
	void enterCharacterSet_(PostgreSQLStatementParser.CharacterSet_Context ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#characterSet_}.
	 * @param ctx the parse tree
	 */
	void exitCharacterSet_(PostgreSQLStatementParser.CharacterSet_Context ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#collateClause_}.
	 * @param ctx the parse tree
	 */
	void enterCollateClause_(PostgreSQLStatementParser.CollateClause_Context ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#collateClause_}.
	 * @param ctx the parse tree
	 */
	void exitCollateClause_(PostgreSQLStatementParser.CollateClause_Context ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#ignoredIdentifier_}.
	 * @param ctx the parse tree
	 */
	void enterIgnoredIdentifier_(PostgreSQLStatementParser.IgnoredIdentifier_Context ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#ignoredIdentifier_}.
	 * @param ctx the parse tree
	 */
	void exitIgnoredIdentifier_(PostgreSQLStatementParser.IgnoredIdentifier_Context ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#ignoredIdentifiers_}.
	 * @param ctx the parse tree
	 */
	void enterIgnoredIdentifiers_(PostgreSQLStatementParser.IgnoredIdentifiers_Context ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#ignoredIdentifiers_}.
	 * @param ctx the parse tree
	 */
	void exitIgnoredIdentifiers_(PostgreSQLStatementParser.IgnoredIdentifiers_Context ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#createTable}.
	 * @param ctx the parse tree
	 */
	void enterCreateTable(PostgreSQLStatementParser.CreateTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#createTable}.
	 * @param ctx the parse tree
	 */
	void exitCreateTable(PostgreSQLStatementParser.CreateTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#createIndex}.
	 * @param ctx the parse tree
	 */
	void enterCreateIndex(PostgreSQLStatementParser.CreateIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#createIndex}.
	 * @param ctx the parse tree
	 */
	void exitCreateIndex(PostgreSQLStatementParser.CreateIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterTable}.
	 * @param ctx the parse tree
	 */
	void enterAlterTable(PostgreSQLStatementParser.AlterTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterTable}.
	 * @param ctx the parse tree
	 */
	void exitAlterTable(PostgreSQLStatementParser.AlterTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterIndex}.
	 * @param ctx the parse tree
	 */
	void enterAlterIndex(PostgreSQLStatementParser.AlterIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterIndex}.
	 * @param ctx the parse tree
	 */
	void exitAlterIndex(PostgreSQLStatementParser.AlterIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#dropTable}.
	 * @param ctx the parse tree
	 */
	void enterDropTable(PostgreSQLStatementParser.DropTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#dropTable}.
	 * @param ctx the parse tree
	 */
	void exitDropTable(PostgreSQLStatementParser.DropTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#dropIndex}.
	 * @param ctx the parse tree
	 */
	void enterDropIndex(PostgreSQLStatementParser.DropIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#dropIndex}.
	 * @param ctx the parse tree
	 */
	void exitDropIndex(PostgreSQLStatementParser.DropIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#truncateTable}.
	 * @param ctx the parse tree
	 */
	void enterTruncateTable(PostgreSQLStatementParser.TruncateTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#truncateTable}.
	 * @param ctx the parse tree
	 */
	void exitTruncateTable(PostgreSQLStatementParser.TruncateTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#createTableSpecification_}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableSpecification_(PostgreSQLStatementParser.CreateTableSpecification_Context ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#createTableSpecification_}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableSpecification_(PostgreSQLStatementParser.CreateTableSpecification_Context ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#tableNotExistClause_}.
	 * @param ctx the parse tree
	 */
	void enterTableNotExistClause_(PostgreSQLStatementParser.TableNotExistClause_Context ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#tableNotExistClause_}.
	 * @param ctx the parse tree
	 */
	void exitTableNotExistClause_(PostgreSQLStatementParser.TableNotExistClause_Context ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#createDefinitionClause}.
	 * @param ctx the parse tree
	 */
	void enterCreateDefinitionClause(PostgreSQLStatementParser.CreateDefinitionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#createDefinitionClause}.
	 * @param ctx the parse tree
	 */
	void exitCreateDefinitionClause(PostgreSQLStatementParser.CreateDefinitionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#createDefinition}.
	 * @param ctx the parse tree
	 */
	void enterCreateDefinition(PostgreSQLStatementParser.CreateDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#createDefinition}.
	 * @param ctx the parse tree
	 */
	void exitCreateDefinition(PostgreSQLStatementParser.CreateDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterColumnDefinition(PostgreSQLStatementParser.ColumnDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitColumnDefinition(PostgreSQLStatementParser.ColumnDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterColumnConstraint(PostgreSQLStatementParser.ColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitColumnConstraint(PostgreSQLStatementParser.ColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#constraintClause}.
	 * @param ctx the parse tree
	 */
	void enterConstraintClause(PostgreSQLStatementParser.ConstraintClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#constraintClause}.
	 * @param ctx the parse tree
	 */
	void exitConstraintClause(PostgreSQLStatementParser.ConstraintClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#columnConstraintOption}.
	 * @param ctx the parse tree
	 */
	void enterColumnConstraintOption(PostgreSQLStatementParser.ColumnConstraintOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#columnConstraintOption}.
	 * @param ctx the parse tree
	 */
	void exitColumnConstraintOption(PostgreSQLStatementParser.ColumnConstraintOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#checkOption}.
	 * @param ctx the parse tree
	 */
	void enterCheckOption(PostgreSQLStatementParser.CheckOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#checkOption}.
	 * @param ctx the parse tree
	 */
	void exitCheckOption(PostgreSQLStatementParser.CheckOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#defaultExpr}.
	 * @param ctx the parse tree
	 */
	void enterDefaultExpr(PostgreSQLStatementParser.DefaultExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#defaultExpr}.
	 * @param ctx the parse tree
	 */
	void exitDefaultExpr(PostgreSQLStatementParser.DefaultExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#sequenceOptions}.
	 * @param ctx the parse tree
	 */
	void enterSequenceOptions(PostgreSQLStatementParser.SequenceOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#sequenceOptions}.
	 * @param ctx the parse tree
	 */
	void exitSequenceOptions(PostgreSQLStatementParser.SequenceOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#sequenceOption}.
	 * @param ctx the parse tree
	 */
	void enterSequenceOption(PostgreSQLStatementParser.SequenceOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#sequenceOption}.
	 * @param ctx the parse tree
	 */
	void exitSequenceOption(PostgreSQLStatementParser.SequenceOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#indexParameters}.
	 * @param ctx the parse tree
	 */
	void enterIndexParameters(PostgreSQLStatementParser.IndexParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#indexParameters}.
	 * @param ctx the parse tree
	 */
	void exitIndexParameters(PostgreSQLStatementParser.IndexParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(PostgreSQLStatementParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(PostgreSQLStatementParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#constraintOptionalParam}.
	 * @param ctx the parse tree
	 */
	void enterConstraintOptionalParam(PostgreSQLStatementParser.ConstraintOptionalParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#constraintOptionalParam}.
	 * @param ctx the parse tree
	 */
	void exitConstraintOptionalParam(PostgreSQLStatementParser.ConstraintOptionalParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#likeOption}.
	 * @param ctx the parse tree
	 */
	void enterLikeOption(PostgreSQLStatementParser.LikeOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#likeOption}.
	 * @param ctx the parse tree
	 */
	void exitLikeOption(PostgreSQLStatementParser.LikeOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void enterTableConstraint(PostgreSQLStatementParser.TableConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void exitTableConstraint(PostgreSQLStatementParser.TableConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#tableConstraintOption}.
	 * @param ctx the parse tree
	 */
	void enterTableConstraintOption(PostgreSQLStatementParser.TableConstraintOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#tableConstraintOption}.
	 * @param ctx the parse tree
	 */
	void exitTableConstraintOption(PostgreSQLStatementParser.TableConstraintOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#inheritClause_}.
	 * @param ctx the parse tree
	 */
	void enterInheritClause_(PostgreSQLStatementParser.InheritClause_Context ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#inheritClause_}.
	 * @param ctx the parse tree
	 */
	void exitInheritClause_(PostgreSQLStatementParser.InheritClause_Context ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#createIndexSpecification_}.
	 * @param ctx the parse tree
	 */
	void enterCreateIndexSpecification_(PostgreSQLStatementParser.CreateIndexSpecification_Context ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#createIndexSpecification_}.
	 * @param ctx the parse tree
	 */
	void exitCreateIndexSpecification_(PostgreSQLStatementParser.CreateIndexSpecification_Context ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#concurrentlyClause_}.
	 * @param ctx the parse tree
	 */
	void enterConcurrentlyClause_(PostgreSQLStatementParser.ConcurrentlyClause_Context ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#concurrentlyClause_}.
	 * @param ctx the parse tree
	 */
	void exitConcurrentlyClause_(PostgreSQLStatementParser.ConcurrentlyClause_Context ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#indexNotExistClause_}.
	 * @param ctx the parse tree
	 */
	void enterIndexNotExistClause_(PostgreSQLStatementParser.IndexNotExistClause_Context ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#indexNotExistClause_}.
	 * @param ctx the parse tree
	 */
	void exitIndexNotExistClause_(PostgreSQLStatementParser.IndexNotExistClause_Context ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#onlyClause_}.
	 * @param ctx the parse tree
	 */
	void enterOnlyClause_(PostgreSQLStatementParser.OnlyClause_Context ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#onlyClause_}.
	 * @param ctx the parse tree
	 */
	void exitOnlyClause_(PostgreSQLStatementParser.OnlyClause_Context ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#tableExistClause_}.
	 * @param ctx the parse tree
	 */
	void enterTableExistClause_(PostgreSQLStatementParser.TableExistClause_Context ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#tableExistClause_}.
	 * @param ctx the parse tree
	 */
	void exitTableExistClause_(PostgreSQLStatementParser.TableExistClause_Context ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#asteriskClause_}.
	 * @param ctx the parse tree
	 */
	void enterAsteriskClause_(PostgreSQLStatementParser.AsteriskClause_Context ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#asteriskClause_}.
	 * @param ctx the parse tree
	 */
	void exitAsteriskClause_(PostgreSQLStatementParser.AsteriskClause_Context ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterDefinitionClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterDefinitionClause(PostgreSQLStatementParser.AlterDefinitionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterDefinitionClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterDefinitionClause(PostgreSQLStatementParser.AlterDefinitionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterIndexDefinitionClause_}.
	 * @param ctx the parse tree
	 */
	void enterAlterIndexDefinitionClause_(PostgreSQLStatementParser.AlterIndexDefinitionClause_Context ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterIndexDefinitionClause_}.
	 * @param ctx the parse tree
	 */
	void exitAlterIndexDefinitionClause_(PostgreSQLStatementParser.AlterIndexDefinitionClause_Context ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#renameIndexSpecification}.
	 * @param ctx the parse tree
	 */
	void enterRenameIndexSpecification(PostgreSQLStatementParser.RenameIndexSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#renameIndexSpecification}.
	 * @param ctx the parse tree
	 */
	void exitRenameIndexSpecification(PostgreSQLStatementParser.RenameIndexSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterIndexDependsOnExtension}.
	 * @param ctx the parse tree
	 */
	void enterAlterIndexDependsOnExtension(PostgreSQLStatementParser.AlterIndexDependsOnExtensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterIndexDependsOnExtension}.
	 * @param ctx the parse tree
	 */
	void exitAlterIndexDependsOnExtension(PostgreSQLStatementParser.AlterIndexDependsOnExtensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterIndexSetTableSpace}.
	 * @param ctx the parse tree
	 */
	void enterAlterIndexSetTableSpace(PostgreSQLStatementParser.AlterIndexSetTableSpaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterIndexSetTableSpace}.
	 * @param ctx the parse tree
	 */
	void exitAlterIndexSetTableSpace(PostgreSQLStatementParser.AlterIndexSetTableSpaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#tableNamesClause}.
	 * @param ctx the parse tree
	 */
	void enterTableNamesClause(PostgreSQLStatementParser.TableNamesClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#tableNamesClause}.
	 * @param ctx the parse tree
	 */
	void exitTableNamesClause(PostgreSQLStatementParser.TableNamesClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#tableNameClause}.
	 * @param ctx the parse tree
	 */
	void enterTableNameClause(PostgreSQLStatementParser.TableNameClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#tableNameClause}.
	 * @param ctx the parse tree
	 */
	void exitTableNameClause(PostgreSQLStatementParser.TableNameClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterTableActions}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableActions(PostgreSQLStatementParser.AlterTableActionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterTableActions}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableActions(PostgreSQLStatementParser.AlterTableActionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterTableAction}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableAction(PostgreSQLStatementParser.AlterTableActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterTableAction}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableAction(PostgreSQLStatementParser.AlterTableActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#addColumnSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAddColumnSpecification(PostgreSQLStatementParser.AddColumnSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#addColumnSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAddColumnSpecification(PostgreSQLStatementParser.AddColumnSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#dropColumnSpecification}.
	 * @param ctx the parse tree
	 */
	void enterDropColumnSpecification(PostgreSQLStatementParser.DropColumnSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#dropColumnSpecification}.
	 * @param ctx the parse tree
	 */
	void exitDropColumnSpecification(PostgreSQLStatementParser.DropColumnSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#columnExistClause_}.
	 * @param ctx the parse tree
	 */
	void enterColumnExistClause_(PostgreSQLStatementParser.ColumnExistClause_Context ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#columnExistClause_}.
	 * @param ctx the parse tree
	 */
	void exitColumnExistClause_(PostgreSQLStatementParser.ColumnExistClause_Context ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#modifyColumnSpecification}.
	 * @param ctx the parse tree
	 */
	void enterModifyColumnSpecification(PostgreSQLStatementParser.ModifyColumnSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#modifyColumnSpecification}.
	 * @param ctx the parse tree
	 */
	void exitModifyColumnSpecification(PostgreSQLStatementParser.ModifyColumnSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#modifyColumn}.
	 * @param ctx the parse tree
	 */
	void enterModifyColumn(PostgreSQLStatementParser.ModifyColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#modifyColumn}.
	 * @param ctx the parse tree
	 */
	void exitModifyColumn(PostgreSQLStatementParser.ModifyColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterColumnSetOption}.
	 * @param ctx the parse tree
	 */
	void enterAlterColumnSetOption(PostgreSQLStatementParser.AlterColumnSetOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterColumnSetOption}.
	 * @param ctx the parse tree
	 */
	void exitAlterColumnSetOption(PostgreSQLStatementParser.AlterColumnSetOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#attributeOptions}.
	 * @param ctx the parse tree
	 */
	void enterAttributeOptions(PostgreSQLStatementParser.AttributeOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#attributeOptions}.
	 * @param ctx the parse tree
	 */
	void exitAttributeOptions(PostgreSQLStatementParser.AttributeOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#attributeOption}.
	 * @param ctx the parse tree
	 */
	void enterAttributeOption(PostgreSQLStatementParser.AttributeOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#attributeOption}.
	 * @param ctx the parse tree
	 */
	void exitAttributeOption(PostgreSQLStatementParser.AttributeOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#addConstraintSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAddConstraintSpecification(PostgreSQLStatementParser.AddConstraintSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#addConstraintSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAddConstraintSpecification(PostgreSQLStatementParser.AddConstraintSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#tableConstraintUsingIndex}.
	 * @param ctx the parse tree
	 */
	void enterTableConstraintUsingIndex(PostgreSQLStatementParser.TableConstraintUsingIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#tableConstraintUsingIndex}.
	 * @param ctx the parse tree
	 */
	void exitTableConstraintUsingIndex(PostgreSQLStatementParser.TableConstraintUsingIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#storageParameterWithValue}.
	 * @param ctx the parse tree
	 */
	void enterStorageParameterWithValue(PostgreSQLStatementParser.StorageParameterWithValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#storageParameterWithValue}.
	 * @param ctx the parse tree
	 */
	void exitStorageParameterWithValue(PostgreSQLStatementParser.StorageParameterWithValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#storageParameter}.
	 * @param ctx the parse tree
	 */
	void enterStorageParameter(PostgreSQLStatementParser.StorageParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#storageParameter}.
	 * @param ctx the parse tree
	 */
	void exitStorageParameter(PostgreSQLStatementParser.StorageParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#renameColumnSpecification}.
	 * @param ctx the parse tree
	 */
	void enterRenameColumnSpecification(PostgreSQLStatementParser.RenameColumnSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#renameColumnSpecification}.
	 * @param ctx the parse tree
	 */
	void exitRenameColumnSpecification(PostgreSQLStatementParser.RenameColumnSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#renameConstraint}.
	 * @param ctx the parse tree
	 */
	void enterRenameConstraint(PostgreSQLStatementParser.RenameConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#renameConstraint}.
	 * @param ctx the parse tree
	 */
	void exitRenameConstraint(PostgreSQLStatementParser.RenameConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#renameTableSpecification_}.
	 * @param ctx the parse tree
	 */
	void enterRenameTableSpecification_(PostgreSQLStatementParser.RenameTableSpecification_Context ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#renameTableSpecification_}.
	 * @param ctx the parse tree
	 */
	void exitRenameTableSpecification_(PostgreSQLStatementParser.RenameTableSpecification_Context ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#indexExistClause_}.
	 * @param ctx the parse tree
	 */
	void enterIndexExistClause_(PostgreSQLStatementParser.IndexExistClause_Context ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#indexExistClause_}.
	 * @param ctx the parse tree
	 */
	void exitIndexExistClause_(PostgreSQLStatementParser.IndexExistClause_Context ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#indexNames}.
	 * @param ctx the parse tree
	 */
	void enterIndexNames(PostgreSQLStatementParser.IndexNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#indexNames}.
	 * @param ctx the parse tree
	 */
	void exitIndexNames(PostgreSQLStatementParser.IndexNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#setTransaction}.
	 * @param ctx the parse tree
	 */
	void enterSetTransaction(PostgreSQLStatementParser.SetTransactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#setTransaction}.
	 * @param ctx the parse tree
	 */
	void exitSetTransaction(PostgreSQLStatementParser.SetTransactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#beginTransaction}.
	 * @param ctx the parse tree
	 */
	void enterBeginTransaction(PostgreSQLStatementParser.BeginTransactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#beginTransaction}.
	 * @param ctx the parse tree
	 */
	void exitBeginTransaction(PostgreSQLStatementParser.BeginTransactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#commit}.
	 * @param ctx the parse tree
	 */
	void enterCommit(PostgreSQLStatementParser.CommitContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#commit}.
	 * @param ctx the parse tree
	 */
	void exitCommit(PostgreSQLStatementParser.CommitContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#rollback}.
	 * @param ctx the parse tree
	 */
	void enterRollback(PostgreSQLStatementParser.RollbackContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#rollback}.
	 * @param ctx the parse tree
	 */
	void exitRollback(PostgreSQLStatementParser.RollbackContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#savepoint}.
	 * @param ctx the parse tree
	 */
	void enterSavepoint(PostgreSQLStatementParser.SavepointContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#savepoint}.
	 * @param ctx the parse tree
	 */
	void exitSavepoint(PostgreSQLStatementParser.SavepointContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#grant}.
	 * @param ctx the parse tree
	 */
	void enterGrant(PostgreSQLStatementParser.GrantContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#grant}.
	 * @param ctx the parse tree
	 */
	void exitGrant(PostgreSQLStatementParser.GrantContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#revoke}.
	 * @param ctx the parse tree
	 */
	void enterRevoke(PostgreSQLStatementParser.RevokeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#revoke}.
	 * @param ctx the parse tree
	 */
	void exitRevoke(PostgreSQLStatementParser.RevokeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#privilegeClause}.
	 * @param ctx the parse tree
	 */
	void enterPrivilegeClause(PostgreSQLStatementParser.PrivilegeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#privilegeClause}.
	 * @param ctx the parse tree
	 */
	void exitPrivilegeClause(PostgreSQLStatementParser.PrivilegeClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#roleClause_}.
	 * @param ctx the parse tree
	 */
	void enterRoleClause_(PostgreSQLStatementParser.RoleClause_Context ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#roleClause_}.
	 * @param ctx the parse tree
	 */
	void exitRoleClause_(PostgreSQLStatementParser.RoleClause_Context ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#optionForClause_}.
	 * @param ctx the parse tree
	 */
	void enterOptionForClause_(PostgreSQLStatementParser.OptionForClause_Context ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#optionForClause_}.
	 * @param ctx the parse tree
	 */
	void exitOptionForClause_(PostgreSQLStatementParser.OptionForClause_Context ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#privileges_}.
	 * @param ctx the parse tree
	 */
	void enterPrivileges_(PostgreSQLStatementParser.Privileges_Context ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#privileges_}.
	 * @param ctx the parse tree
	 */
	void exitPrivileges_(PostgreSQLStatementParser.Privileges_Context ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#privilegeType_}.
	 * @param ctx the parse tree
	 */
	void enterPrivilegeType_(PostgreSQLStatementParser.PrivilegeType_Context ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#privilegeType_}.
	 * @param ctx the parse tree
	 */
	void exitPrivilegeType_(PostgreSQLStatementParser.PrivilegeType_Context ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#onObjectClause}.
	 * @param ctx the parse tree
	 */
	void enterOnObjectClause(PostgreSQLStatementParser.OnObjectClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#onObjectClause}.
	 * @param ctx the parse tree
	 */
	void exitOnObjectClause(PostgreSQLStatementParser.OnObjectClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#createUser}.
	 * @param ctx the parse tree
	 */
	void enterCreateUser(PostgreSQLStatementParser.CreateUserContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#createUser}.
	 * @param ctx the parse tree
	 */
	void exitCreateUser(PostgreSQLStatementParser.CreateUserContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#dropUser}.
	 * @param ctx the parse tree
	 */
	void enterDropUser(PostgreSQLStatementParser.DropUserContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#dropUser}.
	 * @param ctx the parse tree
	 */
	void exitDropUser(PostgreSQLStatementParser.DropUserContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterUser}.
	 * @param ctx the parse tree
	 */
	void enterAlterUser(PostgreSQLStatementParser.AlterUserContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterUser}.
	 * @param ctx the parse tree
	 */
	void exitAlterUser(PostgreSQLStatementParser.AlterUserContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#createRole}.
	 * @param ctx the parse tree
	 */
	void enterCreateRole(PostgreSQLStatementParser.CreateRoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#createRole}.
	 * @param ctx the parse tree
	 */
	void exitCreateRole(PostgreSQLStatementParser.CreateRoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#dropRole}.
	 * @param ctx the parse tree
	 */
	void enterDropRole(PostgreSQLStatementParser.DropRoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#dropRole}.
	 * @param ctx the parse tree
	 */
	void exitDropRole(PostgreSQLStatementParser.DropRoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#alterRole}.
	 * @param ctx the parse tree
	 */
	void enterAlterRole(PostgreSQLStatementParser.AlterRoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#alterRole}.
	 * @param ctx the parse tree
	 */
	void exitAlterRole(PostgreSQLStatementParser.AlterRoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#show}.
	 * @param ctx the parse tree
	 */
	void enterShow(PostgreSQLStatementParser.ShowContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#show}.
	 * @param ctx the parse tree
	 */
	void exitShow(PostgreSQLStatementParser.ShowContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSet(PostgreSQLStatementParser.SetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSet(PostgreSQLStatementParser.SetContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#runtimeScope_}.
	 * @param ctx the parse tree
	 */
	void enterRuntimeScope_(PostgreSQLStatementParser.RuntimeScope_Context ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#runtimeScope_}.
	 * @param ctx the parse tree
	 */
	void exitRuntimeScope_(PostgreSQLStatementParser.RuntimeScope_Context ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#timeZoneClause_}.
	 * @param ctx the parse tree
	 */
	void enterTimeZoneClause_(PostgreSQLStatementParser.TimeZoneClause_Context ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#timeZoneClause_}.
	 * @param ctx the parse tree
	 */
	void exitTimeZoneClause_(PostgreSQLStatementParser.TimeZoneClause_Context ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#configurationParameterClause}.
	 * @param ctx the parse tree
	 */
	void enterConfigurationParameterClause(PostgreSQLStatementParser.ConfigurationParameterClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#configurationParameterClause}.
	 * @param ctx the parse tree
	 */
	void exitConfigurationParameterClause(PostgreSQLStatementParser.ConfigurationParameterClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#resetParameter}.
	 * @param ctx the parse tree
	 */
	void enterResetParameter(PostgreSQLStatementParser.ResetParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#resetParameter}.
	 * @param ctx the parse tree
	 */
	void exitResetParameter(PostgreSQLStatementParser.ResetParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLStatementParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(PostgreSQLStatementParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLStatementParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(PostgreSQLStatementParser.CallContext ctx);
}