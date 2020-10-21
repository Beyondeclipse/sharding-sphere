// Generated from D:/Develop/Git/main/github/sharding-sphere/shardingsphere-sql-parser/shardingsphere-sql-parser-dialect/shardingsphere-sql-parser-oracle/src/main/antlr4/org/apache/shardingsphere/sql/parser/autogen\OracleStatement.g4 by ANTLR 4.8
package org.apache.shardingsphere.sql.parser.autogen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link OracleStatementParser}.
 */
public interface OracleStatementListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#execute}.
	 * @param ctx the parse tree
	 */
	void enterExecute(OracleStatementParser.ExecuteContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#execute}.
	 * @param ctx the parse tree
	 */
	void exitExecute(OracleStatementParser.ExecuteContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#insert}.
	 * @param ctx the parse tree
	 */
	void enterInsert(OracleStatementParser.InsertContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#insert}.
	 * @param ctx the parse tree
	 */
	void exitInsert(OracleStatementParser.InsertContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#insertSingleTable}.
	 * @param ctx the parse tree
	 */
	void enterInsertSingleTable(OracleStatementParser.InsertSingleTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#insertSingleTable}.
	 * @param ctx the parse tree
	 */
	void exitInsertSingleTable(OracleStatementParser.InsertSingleTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#insertMultiTable}.
	 * @param ctx the parse tree
	 */
	void enterInsertMultiTable(OracleStatementParser.InsertMultiTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#insertMultiTable}.
	 * @param ctx the parse tree
	 */
	void exitInsertMultiTable(OracleStatementParser.InsertMultiTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#multiTableElement}.
	 * @param ctx the parse tree
	 */
	void enterMultiTableElement(OracleStatementParser.MultiTableElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#multiTableElement}.
	 * @param ctx the parse tree
	 */
	void exitMultiTableElement(OracleStatementParser.MultiTableElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#conditionalInsertClause}.
	 * @param ctx the parse tree
	 */
	void enterConditionalInsertClause(OracleStatementParser.ConditionalInsertClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#conditionalInsertClause}.
	 * @param ctx the parse tree
	 */
	void exitConditionalInsertClause(OracleStatementParser.ConditionalInsertClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#conditionalInsertWhenPart}.
	 * @param ctx the parse tree
	 */
	void enterConditionalInsertWhenPart(OracleStatementParser.ConditionalInsertWhenPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#conditionalInsertWhenPart}.
	 * @param ctx the parse tree
	 */
	void exitConditionalInsertWhenPart(OracleStatementParser.ConditionalInsertWhenPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#conditionalInsertElsePart}.
	 * @param ctx the parse tree
	 */
	void enterConditionalInsertElsePart(OracleStatementParser.ConditionalInsertElsePartContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#conditionalInsertElsePart}.
	 * @param ctx the parse tree
	 */
	void exitConditionalInsertElsePart(OracleStatementParser.ConditionalInsertElsePartContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#insertIntoClause}.
	 * @param ctx the parse tree
	 */
	void enterInsertIntoClause(OracleStatementParser.InsertIntoClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#insertIntoClause}.
	 * @param ctx the parse tree
	 */
	void exitInsertIntoClause(OracleStatementParser.InsertIntoClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#insertValuesClause}.
	 * @param ctx the parse tree
	 */
	void enterInsertValuesClause(OracleStatementParser.InsertValuesClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#insertValuesClause}.
	 * @param ctx the parse tree
	 */
	void exitInsertValuesClause(OracleStatementParser.InsertValuesClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#update}.
	 * @param ctx the parse tree
	 */
	void enterUpdate(OracleStatementParser.UpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#update}.
	 * @param ctx the parse tree
	 */
	void exitUpdate(OracleStatementParser.UpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#updateSpecification_}.
	 * @param ctx the parse tree
	 */
	void enterUpdateSpecification_(OracleStatementParser.UpdateSpecification_Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#updateSpecification_}.
	 * @param ctx the parse tree
	 */
	void exitUpdateSpecification_(OracleStatementParser.UpdateSpecification_Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(OracleStatementParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(OracleStatementParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#setAssignmentsClause}.
	 * @param ctx the parse tree
	 */
	void enterSetAssignmentsClause(OracleStatementParser.SetAssignmentsClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#setAssignmentsClause}.
	 * @param ctx the parse tree
	 */
	void exitSetAssignmentsClause(OracleStatementParser.SetAssignmentsClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#assignmentValues}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentValues(OracleStatementParser.AssignmentValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#assignmentValues}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentValues(OracleStatementParser.AssignmentValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#assignmentValue}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentValue(OracleStatementParser.AssignmentValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#assignmentValue}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentValue(OracleStatementParser.AssignmentValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#delete}.
	 * @param ctx the parse tree
	 */
	void enterDelete(OracleStatementParser.DeleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#delete}.
	 * @param ctx the parse tree
	 */
	void exitDelete(OracleStatementParser.DeleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#deleteSpecification_}.
	 * @param ctx the parse tree
	 */
	void enterDeleteSpecification_(OracleStatementParser.DeleteSpecification_Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#deleteSpecification_}.
	 * @param ctx the parse tree
	 */
	void exitDeleteSpecification_(OracleStatementParser.DeleteSpecification_Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#singleTableClause}.
	 * @param ctx the parse tree
	 */
	void enterSingleTableClause(OracleStatementParser.SingleTableClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#singleTableClause}.
	 * @param ctx the parse tree
	 */
	void exitSingleTableClause(OracleStatementParser.SingleTableClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#multipleTablesClause}.
	 * @param ctx the parse tree
	 */
	void enterMultipleTablesClause(OracleStatementParser.MultipleTablesClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#multipleTablesClause}.
	 * @param ctx the parse tree
	 */
	void exitMultipleTablesClause(OracleStatementParser.MultipleTablesClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#multipleTableNames}.
	 * @param ctx the parse tree
	 */
	void enterMultipleTableNames(OracleStatementParser.MultipleTableNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#multipleTableNames}.
	 * @param ctx the parse tree
	 */
	void exitMultipleTableNames(OracleStatementParser.MultipleTableNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect(OracleStatementParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect(OracleStatementParser.SelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#unionClause}.
	 * @param ctx the parse tree
	 */
	void enterUnionClause(OracleStatementParser.UnionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#unionClause}.
	 * @param ctx the parse tree
	 */
	void exitUnionClause(OracleStatementParser.UnionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void enterSelectClause(OracleStatementParser.SelectClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void exitSelectClause(OracleStatementParser.SelectClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#duplicateSpecification}.
	 * @param ctx the parse tree
	 */
	void enterDuplicateSpecification(OracleStatementParser.DuplicateSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#duplicateSpecification}.
	 * @param ctx the parse tree
	 */
	void exitDuplicateSpecification(OracleStatementParser.DuplicateSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#projections}.
	 * @param ctx the parse tree
	 */
	void enterProjections(OracleStatementParser.ProjectionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#projections}.
	 * @param ctx the parse tree
	 */
	void exitProjections(OracleStatementParser.ProjectionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#projection}.
	 * @param ctx the parse tree
	 */
	void enterProjection(OracleStatementParser.ProjectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#projection}.
	 * @param ctx the parse tree
	 */
	void exitProjection(OracleStatementParser.ProjectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#alias}.
	 * @param ctx the parse tree
	 */
	void enterAlias(OracleStatementParser.AliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#alias}.
	 * @param ctx the parse tree
	 */
	void exitAlias(OracleStatementParser.AliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#unqualifiedShorthand}.
	 * @param ctx the parse tree
	 */
	void enterUnqualifiedShorthand(OracleStatementParser.UnqualifiedShorthandContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#unqualifiedShorthand}.
	 * @param ctx the parse tree
	 */
	void exitUnqualifiedShorthand(OracleStatementParser.UnqualifiedShorthandContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#qualifiedShorthand}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedShorthand(OracleStatementParser.QualifiedShorthandContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#qualifiedShorthand}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedShorthand(OracleStatementParser.QualifiedShorthandContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(OracleStatementParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(OracleStatementParser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#tableReferences}.
	 * @param ctx the parse tree
	 */
	void enterTableReferences(OracleStatementParser.TableReferencesContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#tableReferences}.
	 * @param ctx the parse tree
	 */
	void exitTableReferences(OracleStatementParser.TableReferencesContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#tableReference}.
	 * @param ctx the parse tree
	 */
	void enterTableReference(OracleStatementParser.TableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#tableReference}.
	 * @param ctx the parse tree
	 */
	void exitTableReference(OracleStatementParser.TableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#tableFactor}.
	 * @param ctx the parse tree
	 */
	void enterTableFactor(OracleStatementParser.TableFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#tableFactor}.
	 * @param ctx the parse tree
	 */
	void exitTableFactor(OracleStatementParser.TableFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#joinedTable}.
	 * @param ctx the parse tree
	 */
	void enterJoinedTable(OracleStatementParser.JoinedTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#joinedTable}.
	 * @param ctx the parse tree
	 */
	void exitJoinedTable(OracleStatementParser.JoinedTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#joinSpecification}.
	 * @param ctx the parse tree
	 */
	void enterJoinSpecification(OracleStatementParser.JoinSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#joinSpecification}.
	 * @param ctx the parse tree
	 */
	void exitJoinSpecification(OracleStatementParser.JoinSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(OracleStatementParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(OracleStatementParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void enterGroupByClause(OracleStatementParser.GroupByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void exitGroupByClause(OracleStatementParser.GroupByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void enterHavingClause(OracleStatementParser.HavingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void exitHavingClause(OracleStatementParser.HavingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#subquery}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(OracleStatementParser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#subquery}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(OracleStatementParser.SubqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#parameterMarker}.
	 * @param ctx the parse tree
	 */
	void enterParameterMarker(OracleStatementParser.ParameterMarkerContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#parameterMarker}.
	 * @param ctx the parse tree
	 */
	void exitParameterMarker(OracleStatementParser.ParameterMarkerContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#literals}.
	 * @param ctx the parse tree
	 */
	void enterLiterals(OracleStatementParser.LiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#literals}.
	 * @param ctx the parse tree
	 */
	void exitLiterals(OracleStatementParser.LiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#stringLiterals}.
	 * @param ctx the parse tree
	 */
	void enterStringLiterals(OracleStatementParser.StringLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#stringLiterals}.
	 * @param ctx the parse tree
	 */
	void exitStringLiterals(OracleStatementParser.StringLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#numberLiterals}.
	 * @param ctx the parse tree
	 */
	void enterNumberLiterals(OracleStatementParser.NumberLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#numberLiterals}.
	 * @param ctx the parse tree
	 */
	void exitNumberLiterals(OracleStatementParser.NumberLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#dateTimeLiterals}.
	 * @param ctx the parse tree
	 */
	void enterDateTimeLiterals(OracleStatementParser.DateTimeLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#dateTimeLiterals}.
	 * @param ctx the parse tree
	 */
	void exitDateTimeLiterals(OracleStatementParser.DateTimeLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#hexadecimalLiterals}.
	 * @param ctx the parse tree
	 */
	void enterHexadecimalLiterals(OracleStatementParser.HexadecimalLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#hexadecimalLiterals}.
	 * @param ctx the parse tree
	 */
	void exitHexadecimalLiterals(OracleStatementParser.HexadecimalLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#bitValueLiterals}.
	 * @param ctx the parse tree
	 */
	void enterBitValueLiterals(OracleStatementParser.BitValueLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#bitValueLiterals}.
	 * @param ctx the parse tree
	 */
	void exitBitValueLiterals(OracleStatementParser.BitValueLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#booleanLiterals}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiterals(OracleStatementParser.BooleanLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#booleanLiterals}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiterals(OracleStatementParser.BooleanLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#nullValueLiterals}.
	 * @param ctx the parse tree
	 */
	void enterNullValueLiterals(OracleStatementParser.NullValueLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#nullValueLiterals}.
	 * @param ctx the parse tree
	 */
	void exitNullValueLiterals(OracleStatementParser.NullValueLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(OracleStatementParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(OracleStatementParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#unreservedWord}.
	 * @param ctx the parse tree
	 */
	void enterUnreservedWord(OracleStatementParser.UnreservedWordContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#unreservedWord}.
	 * @param ctx the parse tree
	 */
	void exitUnreservedWord(OracleStatementParser.UnreservedWordContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#schemaName}.
	 * @param ctx the parse tree
	 */
	void enterSchemaName(OracleStatementParser.SchemaNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#schemaName}.
	 * @param ctx the parse tree
	 */
	void exitSchemaName(OracleStatementParser.SchemaNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(OracleStatementParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(OracleStatementParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#columnName}.
	 * @param ctx the parse tree
	 */
	void enterColumnName(OracleStatementParser.ColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#columnName}.
	 * @param ctx the parse tree
	 */
	void exitColumnName(OracleStatementParser.ColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#owner}.
	 * @param ctx the parse tree
	 */
	void enterOwner(OracleStatementParser.OwnerContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#owner}.
	 * @param ctx the parse tree
	 */
	void exitOwner(OracleStatementParser.OwnerContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(OracleStatementParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(OracleStatementParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#columnNames}.
	 * @param ctx the parse tree
	 */
	void enterColumnNames(OracleStatementParser.ColumnNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#columnNames}.
	 * @param ctx the parse tree
	 */
	void exitColumnNames(OracleStatementParser.ColumnNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#tableNames}.
	 * @param ctx the parse tree
	 */
	void enterTableNames(OracleStatementParser.TableNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#tableNames}.
	 * @param ctx the parse tree
	 */
	void exitTableNames(OracleStatementParser.TableNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#indexName}.
	 * @param ctx the parse tree
	 */
	void enterIndexName(OracleStatementParser.IndexNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#indexName}.
	 * @param ctx the parse tree
	 */
	void exitIndexName(OracleStatementParser.IndexNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#oracleId}.
	 * @param ctx the parse tree
	 */
	void enterOracleId(OracleStatementParser.OracleIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#oracleId}.
	 * @param ctx the parse tree
	 */
	void exitOracleId(OracleStatementParser.OracleIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#collationName}.
	 * @param ctx the parse tree
	 */
	void enterCollationName(OracleStatementParser.CollationNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#collationName}.
	 * @param ctx the parse tree
	 */
	void exitCollationName(OracleStatementParser.CollationNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#dataTypeLength}.
	 * @param ctx the parse tree
	 */
	void enterDataTypeLength(OracleStatementParser.DataTypeLengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#dataTypeLength}.
	 * @param ctx the parse tree
	 */
	void exitDataTypeLength(OracleStatementParser.DataTypeLengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#primaryKey}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryKey(OracleStatementParser.PrimaryKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#primaryKey}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryKey(OracleStatementParser.PrimaryKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#exprs}.
	 * @param ctx the parse tree
	 */
	void enterExprs(OracleStatementParser.ExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#exprs}.
	 * @param ctx the parse tree
	 */
	void exitExprs(OracleStatementParser.ExprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(OracleStatementParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(OracleStatementParser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(OracleStatementParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(OracleStatementParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOperator(OracleStatementParser.LogicalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOperator(OracleStatementParser.LogicalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#notOperator_}.
	 * @param ctx the parse tree
	 */
	void enterNotOperator_(OracleStatementParser.NotOperator_Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#notOperator_}.
	 * @param ctx the parse tree
	 */
	void exitNotOperator_(OracleStatementParser.NotOperator_Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#booleanPrimary}.
	 * @param ctx the parse tree
	 */
	void enterBooleanPrimary(OracleStatementParser.BooleanPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#booleanPrimary}.
	 * @param ctx the parse tree
	 */
	void exitBooleanPrimary(OracleStatementParser.BooleanPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(OracleStatementParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(OracleStatementParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(OracleStatementParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(OracleStatementParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#bitExpr}.
	 * @param ctx the parse tree
	 */
	void enterBitExpr(OracleStatementParser.BitExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#bitExpr}.
	 * @param ctx the parse tree
	 */
	void exitBitExpr(OracleStatementParser.BitExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpr(OracleStatementParser.SimpleExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpr(OracleStatementParser.SimpleExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(OracleStatementParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(OracleStatementParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#aggregationFunction}.
	 * @param ctx the parse tree
	 */
	void enterAggregationFunction(OracleStatementParser.AggregationFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#aggregationFunction}.
	 * @param ctx the parse tree
	 */
	void exitAggregationFunction(OracleStatementParser.AggregationFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#aggregationFunctionName}.
	 * @param ctx the parse tree
	 */
	void enterAggregationFunctionName(OracleStatementParser.AggregationFunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#aggregationFunctionName}.
	 * @param ctx the parse tree
	 */
	void exitAggregationFunctionName(OracleStatementParser.AggregationFunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#distinct}.
	 * @param ctx the parse tree
	 */
	void enterDistinct(OracleStatementParser.DistinctContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#distinct}.
	 * @param ctx the parse tree
	 */
	void exitDistinct(OracleStatementParser.DistinctContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#specialFunction}.
	 * @param ctx the parse tree
	 */
	void enterSpecialFunction(OracleStatementParser.SpecialFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#specialFunction}.
	 * @param ctx the parse tree
	 */
	void exitSpecialFunction(OracleStatementParser.SpecialFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#castFunction}.
	 * @param ctx the parse tree
	 */
	void enterCastFunction(OracleStatementParser.CastFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#castFunction}.
	 * @param ctx the parse tree
	 */
	void exitCastFunction(OracleStatementParser.CastFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#charFunction}.
	 * @param ctx the parse tree
	 */
	void enterCharFunction(OracleStatementParser.CharFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#charFunction}.
	 * @param ctx the parse tree
	 */
	void exitCharFunction(OracleStatementParser.CharFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#regularFunction}.
	 * @param ctx the parse tree
	 */
	void enterRegularFunction(OracleStatementParser.RegularFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#regularFunction}.
	 * @param ctx the parse tree
	 */
	void exitRegularFunction(OracleStatementParser.RegularFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#regularFunctionName_}.
	 * @param ctx the parse tree
	 */
	void enterRegularFunctionName_(OracleStatementParser.RegularFunctionName_Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#regularFunctionName_}.
	 * @param ctx the parse tree
	 */
	void exitRegularFunctionName_(OracleStatementParser.RegularFunctionName_Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#caseExpression}.
	 * @param ctx the parse tree
	 */
	void enterCaseExpression(OracleStatementParser.CaseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#caseExpression}.
	 * @param ctx the parse tree
	 */
	void exitCaseExpression(OracleStatementParser.CaseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#caseWhen_}.
	 * @param ctx the parse tree
	 */
	void enterCaseWhen_(OracleStatementParser.CaseWhen_Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#caseWhen_}.
	 * @param ctx the parse tree
	 */
	void exitCaseWhen_(OracleStatementParser.CaseWhen_Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#caseElse_}.
	 * @param ctx the parse tree
	 */
	void enterCaseElse_(OracleStatementParser.CaseElse_Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#caseElse_}.
	 * @param ctx the parse tree
	 */
	void exitCaseElse_(OracleStatementParser.CaseElse_Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void enterOrderByClause(OracleStatementParser.OrderByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void exitOrderByClause(OracleStatementParser.OrderByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#orderByItem}.
	 * @param ctx the parse tree
	 */
	void enterOrderByItem(OracleStatementParser.OrderByItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#orderByItem}.
	 * @param ctx the parse tree
	 */
	void exitOrderByItem(OracleStatementParser.OrderByItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#attributeName}.
	 * @param ctx the parse tree
	 */
	void enterAttributeName(OracleStatementParser.AttributeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#attributeName}.
	 * @param ctx the parse tree
	 */
	void exitAttributeName(OracleStatementParser.AttributeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#indexTypeName}.
	 * @param ctx the parse tree
	 */
	void enterIndexTypeName(OracleStatementParser.IndexTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#indexTypeName}.
	 * @param ctx the parse tree
	 */
	void exitIndexTypeName(OracleStatementParser.IndexTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#simpleExprs}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExprs(OracleStatementParser.SimpleExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#simpleExprs}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExprs(OracleStatementParser.SimpleExprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#lobItem}.
	 * @param ctx the parse tree
	 */
	void enterLobItem(OracleStatementParser.LobItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#lobItem}.
	 * @param ctx the parse tree
	 */
	void exitLobItem(OracleStatementParser.LobItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#lobItems}.
	 * @param ctx the parse tree
	 */
	void enterLobItems(OracleStatementParser.LobItemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#lobItems}.
	 * @param ctx the parse tree
	 */
	void exitLobItems(OracleStatementParser.LobItemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#lobItemList}.
	 * @param ctx the parse tree
	 */
	void enterLobItemList(OracleStatementParser.LobItemListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#lobItemList}.
	 * @param ctx the parse tree
	 */
	void exitLobItemList(OracleStatementParser.LobItemListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(OracleStatementParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(OracleStatementParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#specialDatatype}.
	 * @param ctx the parse tree
	 */
	void enterSpecialDatatype(OracleStatementParser.SpecialDatatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#specialDatatype}.
	 * @param ctx the parse tree
	 */
	void exitSpecialDatatype(OracleStatementParser.SpecialDatatypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#dataTypeName}.
	 * @param ctx the parse tree
	 */
	void enterDataTypeName(OracleStatementParser.DataTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#dataTypeName}.
	 * @param ctx the parse tree
	 */
	void exitDataTypeName(OracleStatementParser.DataTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#datetimeTypeSuffix}.
	 * @param ctx the parse tree
	 */
	void enterDatetimeTypeSuffix(OracleStatementParser.DatetimeTypeSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#datetimeTypeSuffix}.
	 * @param ctx the parse tree
	 */
	void exitDatetimeTypeSuffix(OracleStatementParser.DatetimeTypeSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#treatFunction}.
	 * @param ctx the parse tree
	 */
	void enterTreatFunction(OracleStatementParser.TreatFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#treatFunction}.
	 * @param ctx the parse tree
	 */
	void exitTreatFunction(OracleStatementParser.TreatFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#privateExprOfDb}.
	 * @param ctx the parse tree
	 */
	void enterPrivateExprOfDb(OracleStatementParser.PrivateExprOfDbContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#privateExprOfDb}.
	 * @param ctx the parse tree
	 */
	void exitPrivateExprOfDb(OracleStatementParser.PrivateExprOfDbContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#caseExpr}.
	 * @param ctx the parse tree
	 */
	void enterCaseExpr(OracleStatementParser.CaseExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#caseExpr}.
	 * @param ctx the parse tree
	 */
	void exitCaseExpr(OracleStatementParser.CaseExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#simpleCaseExpr}.
	 * @param ctx the parse tree
	 */
	void enterSimpleCaseExpr(OracleStatementParser.SimpleCaseExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#simpleCaseExpr}.
	 * @param ctx the parse tree
	 */
	void exitSimpleCaseExpr(OracleStatementParser.SimpleCaseExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#searchedCaseExpr}.
	 * @param ctx the parse tree
	 */
	void enterSearchedCaseExpr(OracleStatementParser.SearchedCaseExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#searchedCaseExpr}.
	 * @param ctx the parse tree
	 */
	void exitSearchedCaseExpr(OracleStatementParser.SearchedCaseExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#elseClause}.
	 * @param ctx the parse tree
	 */
	void enterElseClause(OracleStatementParser.ElseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#elseClause}.
	 * @param ctx the parse tree
	 */
	void exitElseClause(OracleStatementParser.ElseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#intervalExpression}.
	 * @param ctx the parse tree
	 */
	void enterIntervalExpression(OracleStatementParser.IntervalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#intervalExpression}.
	 * @param ctx the parse tree
	 */
	void exitIntervalExpression(OracleStatementParser.IntervalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#objectAccessExpression}.
	 * @param ctx the parse tree
	 */
	void enterObjectAccessExpression(OracleStatementParser.ObjectAccessExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#objectAccessExpression}.
	 * @param ctx the parse tree
	 */
	void exitObjectAccessExpression(OracleStatementParser.ObjectAccessExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#constructorExpr}.
	 * @param ctx the parse tree
	 */
	void enterConstructorExpr(OracleStatementParser.ConstructorExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#constructorExpr}.
	 * @param ctx the parse tree
	 */
	void exitConstructorExpr(OracleStatementParser.ConstructorExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#ignoredIdentifier_}.
	 * @param ctx the parse tree
	 */
	void enterIgnoredIdentifier_(OracleStatementParser.IgnoredIdentifier_Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#ignoredIdentifier_}.
	 * @param ctx the parse tree
	 */
	void exitIgnoredIdentifier_(OracleStatementParser.IgnoredIdentifier_Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#ignoredIdentifiers_}.
	 * @param ctx the parse tree
	 */
	void enterIgnoredIdentifiers_(OracleStatementParser.IgnoredIdentifiers_Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#ignoredIdentifiers_}.
	 * @param ctx the parse tree
	 */
	void exitIgnoredIdentifiers_(OracleStatementParser.IgnoredIdentifiers_Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#matchNone}.
	 * @param ctx the parse tree
	 */
	void enterMatchNone(OracleStatementParser.MatchNoneContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#matchNone}.
	 * @param ctx the parse tree
	 */
	void exitMatchNone(OracleStatementParser.MatchNoneContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#createTable}.
	 * @param ctx the parse tree
	 */
	void enterCreateTable(OracleStatementParser.CreateTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#createTable}.
	 * @param ctx the parse tree
	 */
	void exitCreateTable(OracleStatementParser.CreateTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#createIndex}.
	 * @param ctx the parse tree
	 */
	void enterCreateIndex(OracleStatementParser.CreateIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#createIndex}.
	 * @param ctx the parse tree
	 */
	void exitCreateIndex(OracleStatementParser.CreateIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#alterTable}.
	 * @param ctx the parse tree
	 */
	void enterAlterTable(OracleStatementParser.AlterTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#alterTable}.
	 * @param ctx the parse tree
	 */
	void exitAlterTable(OracleStatementParser.AlterTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#alterIndex}.
	 * @param ctx the parse tree
	 */
	void enterAlterIndex(OracleStatementParser.AlterIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#alterIndex}.
	 * @param ctx the parse tree
	 */
	void exitAlterIndex(OracleStatementParser.AlterIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#dropTable}.
	 * @param ctx the parse tree
	 */
	void enterDropTable(OracleStatementParser.DropTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#dropTable}.
	 * @param ctx the parse tree
	 */
	void exitDropTable(OracleStatementParser.DropTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#dropIndex}.
	 * @param ctx the parse tree
	 */
	void enterDropIndex(OracleStatementParser.DropIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#dropIndex}.
	 * @param ctx the parse tree
	 */
	void exitDropIndex(OracleStatementParser.DropIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#truncateTable}.
	 * @param ctx the parse tree
	 */
	void enterTruncateTable(OracleStatementParser.TruncateTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#truncateTable}.
	 * @param ctx the parse tree
	 */
	void exitTruncateTable(OracleStatementParser.TruncateTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#createTableSpecification_}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableSpecification_(OracleStatementParser.CreateTableSpecification_Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#createTableSpecification_}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableSpecification_(OracleStatementParser.CreateTableSpecification_Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#tablespaceClauseWithParen}.
	 * @param ctx the parse tree
	 */
	void enterTablespaceClauseWithParen(OracleStatementParser.TablespaceClauseWithParenContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#tablespaceClauseWithParen}.
	 * @param ctx the parse tree
	 */
	void exitTablespaceClauseWithParen(OracleStatementParser.TablespaceClauseWithParenContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#tablespaceClause}.
	 * @param ctx the parse tree
	 */
	void enterTablespaceClause(OracleStatementParser.TablespaceClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#tablespaceClause}.
	 * @param ctx the parse tree
	 */
	void exitTablespaceClause(OracleStatementParser.TablespaceClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#domainIndexClause}.
	 * @param ctx the parse tree
	 */
	void enterDomainIndexClause(OracleStatementParser.DomainIndexClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#domainIndexClause}.
	 * @param ctx the parse tree
	 */
	void exitDomainIndexClause(OracleStatementParser.DomainIndexClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#createDefinitionClause}.
	 * @param ctx the parse tree
	 */
	void enterCreateDefinitionClause(OracleStatementParser.CreateDefinitionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#createDefinitionClause}.
	 * @param ctx the parse tree
	 */
	void exitCreateDefinitionClause(OracleStatementParser.CreateDefinitionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#relationalProperties}.
	 * @param ctx the parse tree
	 */
	void enterRelationalProperties(OracleStatementParser.RelationalPropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#relationalProperties}.
	 * @param ctx the parse tree
	 */
	void exitRelationalProperties(OracleStatementParser.RelationalPropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#relationalProperty}.
	 * @param ctx the parse tree
	 */
	void enterRelationalProperty(OracleStatementParser.RelationalPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#relationalProperty}.
	 * @param ctx the parse tree
	 */
	void exitRelationalProperty(OracleStatementParser.RelationalPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterColumnDefinition(OracleStatementParser.ColumnDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitColumnDefinition(OracleStatementParser.ColumnDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#visibleClause_}.
	 * @param ctx the parse tree
	 */
	void enterVisibleClause_(OracleStatementParser.VisibleClause_Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#visibleClause_}.
	 * @param ctx the parse tree
	 */
	void exitVisibleClause_(OracleStatementParser.VisibleClause_Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#defaultNullClause_}.
	 * @param ctx the parse tree
	 */
	void enterDefaultNullClause_(OracleStatementParser.DefaultNullClause_Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#defaultNullClause_}.
	 * @param ctx the parse tree
	 */
	void exitDefaultNullClause_(OracleStatementParser.DefaultNullClause_Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#identityClause}.
	 * @param ctx the parse tree
	 */
	void enterIdentityClause(OracleStatementParser.IdentityClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#identityClause}.
	 * @param ctx the parse tree
	 */
	void exitIdentityClause(OracleStatementParser.IdentityClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#identifyOptions}.
	 * @param ctx the parse tree
	 */
	void enterIdentifyOptions(OracleStatementParser.IdentifyOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#identifyOptions}.
	 * @param ctx the parse tree
	 */
	void exitIdentifyOptions(OracleStatementParser.IdentifyOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#identityOption}.
	 * @param ctx the parse tree
	 */
	void enterIdentityOption(OracleStatementParser.IdentityOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#identityOption}.
	 * @param ctx the parse tree
	 */
	void exitIdentityOption(OracleStatementParser.IdentityOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#encryptionSpecification_}.
	 * @param ctx the parse tree
	 */
	void enterEncryptionSpecification_(OracleStatementParser.EncryptionSpecification_Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#encryptionSpecification_}.
	 * @param ctx the parse tree
	 */
	void exitEncryptionSpecification_(OracleStatementParser.EncryptionSpecification_Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#inlineConstraint}.
	 * @param ctx the parse tree
	 */
	void enterInlineConstraint(OracleStatementParser.InlineConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#inlineConstraint}.
	 * @param ctx the parse tree
	 */
	void exitInlineConstraint(OracleStatementParser.InlineConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#referencesClause}.
	 * @param ctx the parse tree
	 */
	void enterReferencesClause(OracleStatementParser.ReferencesClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#referencesClause}.
	 * @param ctx the parse tree
	 */
	void exitReferencesClause(OracleStatementParser.ReferencesClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#constraintState}.
	 * @param ctx the parse tree
	 */
	void enterConstraintState(OracleStatementParser.ConstraintStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#constraintState}.
	 * @param ctx the parse tree
	 */
	void exitConstraintState(OracleStatementParser.ConstraintStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#notDeferrable}.
	 * @param ctx the parse tree
	 */
	void enterNotDeferrable(OracleStatementParser.NotDeferrableContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#notDeferrable}.
	 * @param ctx the parse tree
	 */
	void exitNotDeferrable(OracleStatementParser.NotDeferrableContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#initiallyClause}.
	 * @param ctx the parse tree
	 */
	void enterInitiallyClause(OracleStatementParser.InitiallyClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#initiallyClause}.
	 * @param ctx the parse tree
	 */
	void exitInitiallyClause(OracleStatementParser.InitiallyClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#exceptionsClause}.
	 * @param ctx the parse tree
	 */
	void enterExceptionsClause(OracleStatementParser.ExceptionsClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#exceptionsClause}.
	 * @param ctx the parse tree
	 */
	void exitExceptionsClause(OracleStatementParser.ExceptionsClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#usingIndexClause}.
	 * @param ctx the parse tree
	 */
	void enterUsingIndexClause(OracleStatementParser.UsingIndexClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#usingIndexClause}.
	 * @param ctx the parse tree
	 */
	void exitUsingIndexClause(OracleStatementParser.UsingIndexClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#createIndexClause_}.
	 * @param ctx the parse tree
	 */
	void enterCreateIndexClause_(OracleStatementParser.CreateIndexClause_Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#createIndexClause_}.
	 * @param ctx the parse tree
	 */
	void exitCreateIndexClause_(OracleStatementParser.CreateIndexClause_Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#inlineRefConstraint}.
	 * @param ctx the parse tree
	 */
	void enterInlineRefConstraint(OracleStatementParser.InlineRefConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#inlineRefConstraint}.
	 * @param ctx the parse tree
	 */
	void exitInlineRefConstraint(OracleStatementParser.InlineRefConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#virtualColumnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterVirtualColumnDefinition(OracleStatementParser.VirtualColumnDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#virtualColumnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitVirtualColumnDefinition(OracleStatementParser.VirtualColumnDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#outOfLineConstraint}.
	 * @param ctx the parse tree
	 */
	void enterOutOfLineConstraint(OracleStatementParser.OutOfLineConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#outOfLineConstraint}.
	 * @param ctx the parse tree
	 */
	void exitOutOfLineConstraint(OracleStatementParser.OutOfLineConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#outOfLineRefConstraint}.
	 * @param ctx the parse tree
	 */
	void enterOutOfLineRefConstraint(OracleStatementParser.OutOfLineRefConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#outOfLineRefConstraint}.
	 * @param ctx the parse tree
	 */
	void exitOutOfLineRefConstraint(OracleStatementParser.OutOfLineRefConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#createIndexSpecification_}.
	 * @param ctx the parse tree
	 */
	void enterCreateIndexSpecification_(OracleStatementParser.CreateIndexSpecification_Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#createIndexSpecification_}.
	 * @param ctx the parse tree
	 */
	void exitCreateIndexSpecification_(OracleStatementParser.CreateIndexSpecification_Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#tableIndexClause}.
	 * @param ctx the parse tree
	 */
	void enterTableIndexClause(OracleStatementParser.TableIndexClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#tableIndexClause}.
	 * @param ctx the parse tree
	 */
	void exitTableIndexClause(OracleStatementParser.TableIndexClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#indexExpressions_}.
	 * @param ctx the parse tree
	 */
	void enterIndexExpressions_(OracleStatementParser.IndexExpressions_Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#indexExpressions_}.
	 * @param ctx the parse tree
	 */
	void exitIndexExpressions_(OracleStatementParser.IndexExpressions_Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#indexExpression_}.
	 * @param ctx the parse tree
	 */
	void enterIndexExpression_(OracleStatementParser.IndexExpression_Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#indexExpression_}.
	 * @param ctx the parse tree
	 */
	void exitIndexExpression_(OracleStatementParser.IndexExpression_Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#bitmapJoinIndexClause_}.
	 * @param ctx the parse tree
	 */
	void enterBitmapJoinIndexClause_(OracleStatementParser.BitmapJoinIndexClause_Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#bitmapJoinIndexClause_}.
	 * @param ctx the parse tree
	 */
	void exitBitmapJoinIndexClause_(OracleStatementParser.BitmapJoinIndexClause_Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#columnSortsClause_}.
	 * @param ctx the parse tree
	 */
	void enterColumnSortsClause_(OracleStatementParser.ColumnSortsClause_Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#columnSortsClause_}.
	 * @param ctx the parse tree
	 */
	void exitColumnSortsClause_(OracleStatementParser.ColumnSortsClause_Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#columnSortClause_}.
	 * @param ctx the parse tree
	 */
	void enterColumnSortClause_(OracleStatementParser.ColumnSortClause_Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#columnSortClause_}.
	 * @param ctx the parse tree
	 */
	void exitColumnSortClause_(OracleStatementParser.ColumnSortClause_Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#createIndexDefinitionClause}.
	 * @param ctx the parse tree
	 */
	void enterCreateIndexDefinitionClause(OracleStatementParser.CreateIndexDefinitionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#createIndexDefinitionClause}.
	 * @param ctx the parse tree
	 */
	void exitCreateIndexDefinitionClause(OracleStatementParser.CreateIndexDefinitionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#tableAlias}.
	 * @param ctx the parse tree
	 */
	void enterTableAlias(OracleStatementParser.TableAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#tableAlias}.
	 * @param ctx the parse tree
	 */
	void exitTableAlias(OracleStatementParser.TableAliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#alterDefinitionClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterDefinitionClause(OracleStatementParser.AlterDefinitionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#alterDefinitionClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterDefinitionClause(OracleStatementParser.AlterDefinitionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#alterTableProperties}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableProperties(OracleStatementParser.AlterTablePropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#alterTableProperties}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableProperties(OracleStatementParser.AlterTablePropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#renameTableSpecification_}.
	 * @param ctx the parse tree
	 */
	void enterRenameTableSpecification_(OracleStatementParser.RenameTableSpecification_Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#renameTableSpecification_}.
	 * @param ctx the parse tree
	 */
	void exitRenameTableSpecification_(OracleStatementParser.RenameTableSpecification_Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#columnClauses}.
	 * @param ctx the parse tree
	 */
	void enterColumnClauses(OracleStatementParser.ColumnClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#columnClauses}.
	 * @param ctx the parse tree
	 */
	void exitColumnClauses(OracleStatementParser.ColumnClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#operateColumnClause}.
	 * @param ctx the parse tree
	 */
	void enterOperateColumnClause(OracleStatementParser.OperateColumnClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#operateColumnClause}.
	 * @param ctx the parse tree
	 */
	void exitOperateColumnClause(OracleStatementParser.OperateColumnClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#addColumnSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAddColumnSpecification(OracleStatementParser.AddColumnSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#addColumnSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAddColumnSpecification(OracleStatementParser.AddColumnSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#columnOrVirtualDefinitions}.
	 * @param ctx the parse tree
	 */
	void enterColumnOrVirtualDefinitions(OracleStatementParser.ColumnOrVirtualDefinitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#columnOrVirtualDefinitions}.
	 * @param ctx the parse tree
	 */
	void exitColumnOrVirtualDefinitions(OracleStatementParser.ColumnOrVirtualDefinitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#columnOrVirtualDefinition}.
	 * @param ctx the parse tree
	 */
	void enterColumnOrVirtualDefinition(OracleStatementParser.ColumnOrVirtualDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#columnOrVirtualDefinition}.
	 * @param ctx the parse tree
	 */
	void exitColumnOrVirtualDefinition(OracleStatementParser.ColumnOrVirtualDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#columnProperties}.
	 * @param ctx the parse tree
	 */
	void enterColumnProperties(OracleStatementParser.ColumnPropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#columnProperties}.
	 * @param ctx the parse tree
	 */
	void exitColumnProperties(OracleStatementParser.ColumnPropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#columnProperty}.
	 * @param ctx the parse tree
	 */
	void enterColumnProperty(OracleStatementParser.ColumnPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#columnProperty}.
	 * @param ctx the parse tree
	 */
	void exitColumnProperty(OracleStatementParser.ColumnPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#objectTypeColProperties}.
	 * @param ctx the parse tree
	 */
	void enterObjectTypeColProperties(OracleStatementParser.ObjectTypeColPropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#objectTypeColProperties}.
	 * @param ctx the parse tree
	 */
	void exitObjectTypeColProperties(OracleStatementParser.ObjectTypeColPropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#substitutableColumnClause}.
	 * @param ctx the parse tree
	 */
	void enterSubstitutableColumnClause(OracleStatementParser.SubstitutableColumnClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#substitutableColumnClause}.
	 * @param ctx the parse tree
	 */
	void exitSubstitutableColumnClause(OracleStatementParser.SubstitutableColumnClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#modifyColumnSpecification}.
	 * @param ctx the parse tree
	 */
	void enterModifyColumnSpecification(OracleStatementParser.ModifyColumnSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#modifyColumnSpecification}.
	 * @param ctx the parse tree
	 */
	void exitModifyColumnSpecification(OracleStatementParser.ModifyColumnSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#modifyColProperties}.
	 * @param ctx the parse tree
	 */
	void enterModifyColProperties(OracleStatementParser.ModifyColPropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#modifyColProperties}.
	 * @param ctx the parse tree
	 */
	void exitModifyColProperties(OracleStatementParser.ModifyColPropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#modifyColSubstitutable}.
	 * @param ctx the parse tree
	 */
	void enterModifyColSubstitutable(OracleStatementParser.ModifyColSubstitutableContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#modifyColSubstitutable}.
	 * @param ctx the parse tree
	 */
	void exitModifyColSubstitutable(OracleStatementParser.ModifyColSubstitutableContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#dropColumnClause}.
	 * @param ctx the parse tree
	 */
	void enterDropColumnClause(OracleStatementParser.DropColumnClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#dropColumnClause}.
	 * @param ctx the parse tree
	 */
	void exitDropColumnClause(OracleStatementParser.DropColumnClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#dropColumnSpecification}.
	 * @param ctx the parse tree
	 */
	void enterDropColumnSpecification(OracleStatementParser.DropColumnSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#dropColumnSpecification}.
	 * @param ctx the parse tree
	 */
	void exitDropColumnSpecification(OracleStatementParser.DropColumnSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#columnOrColumnList}.
	 * @param ctx the parse tree
	 */
	void enterColumnOrColumnList(OracleStatementParser.ColumnOrColumnListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#columnOrColumnList}.
	 * @param ctx the parse tree
	 */
	void exitColumnOrColumnList(OracleStatementParser.ColumnOrColumnListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#cascadeOrInvalidate}.
	 * @param ctx the parse tree
	 */
	void enterCascadeOrInvalidate(OracleStatementParser.CascadeOrInvalidateContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#cascadeOrInvalidate}.
	 * @param ctx the parse tree
	 */
	void exitCascadeOrInvalidate(OracleStatementParser.CascadeOrInvalidateContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#checkpointNumber}.
	 * @param ctx the parse tree
	 */
	void enterCheckpointNumber(OracleStatementParser.CheckpointNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#checkpointNumber}.
	 * @param ctx the parse tree
	 */
	void exitCheckpointNumber(OracleStatementParser.CheckpointNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#renameColumnClause}.
	 * @param ctx the parse tree
	 */
	void enterRenameColumnClause(OracleStatementParser.RenameColumnClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#renameColumnClause}.
	 * @param ctx the parse tree
	 */
	void exitRenameColumnClause(OracleStatementParser.RenameColumnClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#constraintClauses}.
	 * @param ctx the parse tree
	 */
	void enterConstraintClauses(OracleStatementParser.ConstraintClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#constraintClauses}.
	 * @param ctx the parse tree
	 */
	void exitConstraintClauses(OracleStatementParser.ConstraintClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#addConstraintSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAddConstraintSpecification(OracleStatementParser.AddConstraintSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#addConstraintSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAddConstraintSpecification(OracleStatementParser.AddConstraintSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#modifyConstraintClause}.
	 * @param ctx the parse tree
	 */
	void enterModifyConstraintClause(OracleStatementParser.ModifyConstraintClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#modifyConstraintClause}.
	 * @param ctx the parse tree
	 */
	void exitModifyConstraintClause(OracleStatementParser.ModifyConstraintClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#constraintWithName}.
	 * @param ctx the parse tree
	 */
	void enterConstraintWithName(OracleStatementParser.ConstraintWithNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#constraintWithName}.
	 * @param ctx the parse tree
	 */
	void exitConstraintWithName(OracleStatementParser.ConstraintWithNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#constraintOption}.
	 * @param ctx the parse tree
	 */
	void enterConstraintOption(OracleStatementParser.ConstraintOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#constraintOption}.
	 * @param ctx the parse tree
	 */
	void exitConstraintOption(OracleStatementParser.ConstraintOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#constraintPrimaryOrUnique}.
	 * @param ctx the parse tree
	 */
	void enterConstraintPrimaryOrUnique(OracleStatementParser.ConstraintPrimaryOrUniqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#constraintPrimaryOrUnique}.
	 * @param ctx the parse tree
	 */
	void exitConstraintPrimaryOrUnique(OracleStatementParser.ConstraintPrimaryOrUniqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#renameConstraintClause}.
	 * @param ctx the parse tree
	 */
	void enterRenameConstraintClause(OracleStatementParser.RenameConstraintClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#renameConstraintClause}.
	 * @param ctx the parse tree
	 */
	void exitRenameConstraintClause(OracleStatementParser.RenameConstraintClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#dropConstraintClause}.
	 * @param ctx the parse tree
	 */
	void enterDropConstraintClause(OracleStatementParser.DropConstraintClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#dropConstraintClause}.
	 * @param ctx the parse tree
	 */
	void exitDropConstraintClause(OracleStatementParser.DropConstraintClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#alterExternalTable}.
	 * @param ctx the parse tree
	 */
	void enterAlterExternalTable(OracleStatementParser.AlterExternalTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#alterExternalTable}.
	 * @param ctx the parse tree
	 */
	void exitAlterExternalTable(OracleStatementParser.AlterExternalTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#objectProperties}.
	 * @param ctx the parse tree
	 */
	void enterObjectProperties(OracleStatementParser.ObjectPropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#objectProperties}.
	 * @param ctx the parse tree
	 */
	void exitObjectProperties(OracleStatementParser.ObjectPropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#objectProperty}.
	 * @param ctx the parse tree
	 */
	void enterObjectProperty(OracleStatementParser.ObjectPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#objectProperty}.
	 * @param ctx the parse tree
	 */
	void exitObjectProperty(OracleStatementParser.ObjectPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#renameIndexClause_}.
	 * @param ctx the parse tree
	 */
	void enterRenameIndexClause_(OracleStatementParser.RenameIndexClause_Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#renameIndexClause_}.
	 * @param ctx the parse tree
	 */
	void exitRenameIndexClause_(OracleStatementParser.RenameIndexClause_Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#setTransaction}.
	 * @param ctx the parse tree
	 */
	void enterSetTransaction(OracleStatementParser.SetTransactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#setTransaction}.
	 * @param ctx the parse tree
	 */
	void exitSetTransaction(OracleStatementParser.SetTransactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#commit}.
	 * @param ctx the parse tree
	 */
	void enterCommit(OracleStatementParser.CommitContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#commit}.
	 * @param ctx the parse tree
	 */
	void exitCommit(OracleStatementParser.CommitContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#rollback}.
	 * @param ctx the parse tree
	 */
	void enterRollback(OracleStatementParser.RollbackContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#rollback}.
	 * @param ctx the parse tree
	 */
	void exitRollback(OracleStatementParser.RollbackContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#savepoint}.
	 * @param ctx the parse tree
	 */
	void enterSavepoint(OracleStatementParser.SavepointContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#savepoint}.
	 * @param ctx the parse tree
	 */
	void exitSavepoint(OracleStatementParser.SavepointContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#grant}.
	 * @param ctx the parse tree
	 */
	void enterGrant(OracleStatementParser.GrantContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#grant}.
	 * @param ctx the parse tree
	 */
	void exitGrant(OracleStatementParser.GrantContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#revoke}.
	 * @param ctx the parse tree
	 */
	void enterRevoke(OracleStatementParser.RevokeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#revoke}.
	 * @param ctx the parse tree
	 */
	void exitRevoke(OracleStatementParser.RevokeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#objectPrivilegeClause}.
	 * @param ctx the parse tree
	 */
	void enterObjectPrivilegeClause(OracleStatementParser.ObjectPrivilegeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#objectPrivilegeClause}.
	 * @param ctx the parse tree
	 */
	void exitObjectPrivilegeClause(OracleStatementParser.ObjectPrivilegeClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#systemPrivilegeClause_}.
	 * @param ctx the parse tree
	 */
	void enterSystemPrivilegeClause_(OracleStatementParser.SystemPrivilegeClause_Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#systemPrivilegeClause_}.
	 * @param ctx the parse tree
	 */
	void exitSystemPrivilegeClause_(OracleStatementParser.SystemPrivilegeClause_Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#roleClause_}.
	 * @param ctx the parse tree
	 */
	void enterRoleClause_(OracleStatementParser.RoleClause_Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#roleClause_}.
	 * @param ctx the parse tree
	 */
	void exitRoleClause_(OracleStatementParser.RoleClause_Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#objectPrivileges_}.
	 * @param ctx the parse tree
	 */
	void enterObjectPrivileges_(OracleStatementParser.ObjectPrivileges_Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#objectPrivileges_}.
	 * @param ctx the parse tree
	 */
	void exitObjectPrivileges_(OracleStatementParser.ObjectPrivileges_Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#objectPrivilegeType_}.
	 * @param ctx the parse tree
	 */
	void enterObjectPrivilegeType_(OracleStatementParser.ObjectPrivilegeType_Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#objectPrivilegeType_}.
	 * @param ctx the parse tree
	 */
	void exitObjectPrivilegeType_(OracleStatementParser.ObjectPrivilegeType_Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#onObjectClause}.
	 * @param ctx the parse tree
	 */
	void enterOnObjectClause(OracleStatementParser.OnObjectClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#onObjectClause}.
	 * @param ctx the parse tree
	 */
	void exitOnObjectClause(OracleStatementParser.OnObjectClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#systemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void enterSystemPrivilege_(OracleStatementParser.SystemPrivilege_Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#systemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void exitSystemPrivilege_(OracleStatementParser.SystemPrivilege_Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#systemPrivilegeOperation_}.
	 * @param ctx the parse tree
	 */
	void enterSystemPrivilegeOperation_(OracleStatementParser.SystemPrivilegeOperation_Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#systemPrivilegeOperation_}.
	 * @param ctx the parse tree
	 */
	void exitSystemPrivilegeOperation_(OracleStatementParser.SystemPrivilegeOperation_Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#advisorFrameworkSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void enterAdvisorFrameworkSystemPrivilege_(OracleStatementParser.AdvisorFrameworkSystemPrivilege_Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#advisorFrameworkSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void exitAdvisorFrameworkSystemPrivilege_(OracleStatementParser.AdvisorFrameworkSystemPrivilege_Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#clustersSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void enterClustersSystemPrivilege_(OracleStatementParser.ClustersSystemPrivilege_Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#clustersSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void exitClustersSystemPrivilege_(OracleStatementParser.ClustersSystemPrivilege_Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#contextsSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void enterContextsSystemPrivilege_(OracleStatementParser.ContextsSystemPrivilege_Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#contextsSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void exitContextsSystemPrivilege_(OracleStatementParser.ContextsSystemPrivilege_Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#dataRedactionSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void enterDataRedactionSystemPrivilege_(OracleStatementParser.DataRedactionSystemPrivilege_Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#dataRedactionSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void exitDataRedactionSystemPrivilege_(OracleStatementParser.DataRedactionSystemPrivilege_Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#databaseSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void enterDatabaseSystemPrivilege_(OracleStatementParser.DatabaseSystemPrivilege_Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#databaseSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void exitDatabaseSystemPrivilege_(OracleStatementParser.DatabaseSystemPrivilege_Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#databaseLinksSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void enterDatabaseLinksSystemPrivilege_(OracleStatementParser.DatabaseLinksSystemPrivilege_Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#databaseLinksSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void exitDatabaseLinksSystemPrivilege_(OracleStatementParser.DatabaseLinksSystemPrivilege_Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#debuggingSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void enterDebuggingSystemPrivilege_(OracleStatementParser.DebuggingSystemPrivilege_Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#debuggingSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void exitDebuggingSystemPrivilege_(OracleStatementParser.DebuggingSystemPrivilege_Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#dictionariesSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void enterDictionariesSystemPrivilege_(OracleStatementParser.DictionariesSystemPrivilege_Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#dictionariesSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void exitDictionariesSystemPrivilege_(OracleStatementParser.DictionariesSystemPrivilege_Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#dimensionsSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void enterDimensionsSystemPrivilege_(OracleStatementParser.DimensionsSystemPrivilege_Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#dimensionsSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void exitDimensionsSystemPrivilege_(OracleStatementParser.DimensionsSystemPrivilege_Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#directoriesSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void enterDirectoriesSystemPrivilege_(OracleStatementParser.DirectoriesSystemPrivilege_Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#directoriesSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void exitDirectoriesSystemPrivilege_(OracleStatementParser.DirectoriesSystemPrivilege_Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#editionsSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void enterEditionsSystemPrivilege_(OracleStatementParser.EditionsSystemPrivilege_Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#editionsSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void exitEditionsSystemPrivilege_(OracleStatementParser.EditionsSystemPrivilege_Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#flashbackDataArchivesPrivilege_}.
	 * @param ctx the parse tree
	 */
	void enterFlashbackDataArchivesPrivilege_(OracleStatementParser.FlashbackDataArchivesPrivilege_Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#flashbackDataArchivesPrivilege_}.
	 * @param ctx the parse tree
	 */
	void exitFlashbackDataArchivesPrivilege_(OracleStatementParser.FlashbackDataArchivesPrivilege_Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#indexesSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void enterIndexesSystemPrivilege_(OracleStatementParser.IndexesSystemPrivilege_Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#indexesSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void exitIndexesSystemPrivilege_(OracleStatementParser.IndexesSystemPrivilege_Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#indexTypesSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void enterIndexTypesSystemPrivilege_(OracleStatementParser.IndexTypesSystemPrivilege_Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#indexTypesSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void exitIndexTypesSystemPrivilege_(OracleStatementParser.IndexTypesSystemPrivilege_Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#jobSchedulerObjectsSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void enterJobSchedulerObjectsSystemPrivilege_(OracleStatementParser.JobSchedulerObjectsSystemPrivilege_Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#jobSchedulerObjectsSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void exitJobSchedulerObjectsSystemPrivilege_(OracleStatementParser.JobSchedulerObjectsSystemPrivilege_Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#keyManagementFrameworkSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void enterKeyManagementFrameworkSystemPrivilege_(OracleStatementParser.KeyManagementFrameworkSystemPrivilege_Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#keyManagementFrameworkSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void exitKeyManagementFrameworkSystemPrivilege_(OracleStatementParser.KeyManagementFrameworkSystemPrivilege_Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#librariesFrameworkSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void enterLibrariesFrameworkSystemPrivilege_(OracleStatementParser.LibrariesFrameworkSystemPrivilege_Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#librariesFrameworkSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void exitLibrariesFrameworkSystemPrivilege_(OracleStatementParser.LibrariesFrameworkSystemPrivilege_Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#logminerFrameworkSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void enterLogminerFrameworkSystemPrivilege_(OracleStatementParser.LogminerFrameworkSystemPrivilege_Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#logminerFrameworkSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void exitLogminerFrameworkSystemPrivilege_(OracleStatementParser.LogminerFrameworkSystemPrivilege_Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#materizlizedViewsSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void enterMaterizlizedViewsSystemPrivilege_(OracleStatementParser.MaterizlizedViewsSystemPrivilege_Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#materizlizedViewsSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void exitMaterizlizedViewsSystemPrivilege_(OracleStatementParser.MaterizlizedViewsSystemPrivilege_Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#miningModelsSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void enterMiningModelsSystemPrivilege_(OracleStatementParser.MiningModelsSystemPrivilege_Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#miningModelsSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void exitMiningModelsSystemPrivilege_(OracleStatementParser.MiningModelsSystemPrivilege_Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#olapCubesSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void enterOlapCubesSystemPrivilege_(OracleStatementParser.OlapCubesSystemPrivilege_Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#olapCubesSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void exitOlapCubesSystemPrivilege_(OracleStatementParser.OlapCubesSystemPrivilege_Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#olapCubeMeasureFoldersSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void enterOlapCubeMeasureFoldersSystemPrivilege_(OracleStatementParser.OlapCubeMeasureFoldersSystemPrivilege_Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#olapCubeMeasureFoldersSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void exitOlapCubeMeasureFoldersSystemPrivilege_(OracleStatementParser.OlapCubeMeasureFoldersSystemPrivilege_Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#olapCubeDiminsionsSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void enterOlapCubeDiminsionsSystemPrivilege_(OracleStatementParser.OlapCubeDiminsionsSystemPrivilege_Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#olapCubeDiminsionsSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void exitOlapCubeDiminsionsSystemPrivilege_(OracleStatementParser.OlapCubeDiminsionsSystemPrivilege_Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#olapCubeBuildProcessesSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void enterOlapCubeBuildProcessesSystemPrivilege_(OracleStatementParser.OlapCubeBuildProcessesSystemPrivilege_Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#olapCubeBuildProcessesSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void exitOlapCubeBuildProcessesSystemPrivilege_(OracleStatementParser.OlapCubeBuildProcessesSystemPrivilege_Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#operatorsSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void enterOperatorsSystemPrivilege_(OracleStatementParser.OperatorsSystemPrivilege_Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#operatorsSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void exitOperatorsSystemPrivilege_(OracleStatementParser.OperatorsSystemPrivilege_Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#outlinesSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void enterOutlinesSystemPrivilege_(OracleStatementParser.OutlinesSystemPrivilege_Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#outlinesSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void exitOutlinesSystemPrivilege_(OracleStatementParser.OutlinesSystemPrivilege_Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#planManagementSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void enterPlanManagementSystemPrivilege_(OracleStatementParser.PlanManagementSystemPrivilege_Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#planManagementSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void exitPlanManagementSystemPrivilege_(OracleStatementParser.PlanManagementSystemPrivilege_Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#pluggableDatabasesSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void enterPluggableDatabasesSystemPrivilege_(OracleStatementParser.PluggableDatabasesSystemPrivilege_Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#pluggableDatabasesSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void exitPluggableDatabasesSystemPrivilege_(OracleStatementParser.PluggableDatabasesSystemPrivilege_Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#proceduresSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void enterProceduresSystemPrivilege_(OracleStatementParser.ProceduresSystemPrivilege_Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#proceduresSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void exitProceduresSystemPrivilege_(OracleStatementParser.ProceduresSystemPrivilege_Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#profilesSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void enterProfilesSystemPrivilege_(OracleStatementParser.ProfilesSystemPrivilege_Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#profilesSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void exitProfilesSystemPrivilege_(OracleStatementParser.ProfilesSystemPrivilege_Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#rolesSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void enterRolesSystemPrivilege_(OracleStatementParser.RolesSystemPrivilege_Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#rolesSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void exitRolesSystemPrivilege_(OracleStatementParser.RolesSystemPrivilege_Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#rollbackSegmentsSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void enterRollbackSegmentsSystemPrivilege_(OracleStatementParser.RollbackSegmentsSystemPrivilege_Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#rollbackSegmentsSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void exitRollbackSegmentsSystemPrivilege_(OracleStatementParser.RollbackSegmentsSystemPrivilege_Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#sequencesSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void enterSequencesSystemPrivilege_(OracleStatementParser.SequencesSystemPrivilege_Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#sequencesSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void exitSequencesSystemPrivilege_(OracleStatementParser.SequencesSystemPrivilege_Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#sessionsSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void enterSessionsSystemPrivilege_(OracleStatementParser.SessionsSystemPrivilege_Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#sessionsSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void exitSessionsSystemPrivilege_(OracleStatementParser.SessionsSystemPrivilege_Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#sqlTranslationProfilesSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void enterSqlTranslationProfilesSystemPrivilege_(OracleStatementParser.SqlTranslationProfilesSystemPrivilege_Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#sqlTranslationProfilesSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void exitSqlTranslationProfilesSystemPrivilege_(OracleStatementParser.SqlTranslationProfilesSystemPrivilege_Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#synonymsSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void enterSynonymsSystemPrivilege_(OracleStatementParser.SynonymsSystemPrivilege_Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#synonymsSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void exitSynonymsSystemPrivilege_(OracleStatementParser.SynonymsSystemPrivilege_Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#tablesSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void enterTablesSystemPrivilege_(OracleStatementParser.TablesSystemPrivilege_Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#tablesSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void exitTablesSystemPrivilege_(OracleStatementParser.TablesSystemPrivilege_Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#tablespacesSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void enterTablespacesSystemPrivilege_(OracleStatementParser.TablespacesSystemPrivilege_Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#tablespacesSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void exitTablespacesSystemPrivilege_(OracleStatementParser.TablespacesSystemPrivilege_Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#triggersSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void enterTriggersSystemPrivilege_(OracleStatementParser.TriggersSystemPrivilege_Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#triggersSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void exitTriggersSystemPrivilege_(OracleStatementParser.TriggersSystemPrivilege_Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#typesSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void enterTypesSystemPrivilege_(OracleStatementParser.TypesSystemPrivilege_Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#typesSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void exitTypesSystemPrivilege_(OracleStatementParser.TypesSystemPrivilege_Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#usersSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void enterUsersSystemPrivilege_(OracleStatementParser.UsersSystemPrivilege_Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#usersSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void exitUsersSystemPrivilege_(OracleStatementParser.UsersSystemPrivilege_Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#viewsSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void enterViewsSystemPrivilege_(OracleStatementParser.ViewsSystemPrivilege_Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#viewsSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void exitViewsSystemPrivilege_(OracleStatementParser.ViewsSystemPrivilege_Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#miscellaneousSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void enterMiscellaneousSystemPrivilege_(OracleStatementParser.MiscellaneousSystemPrivilege_Context ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#miscellaneousSystemPrivilege_}.
	 * @param ctx the parse tree
	 */
	void exitMiscellaneousSystemPrivilege_(OracleStatementParser.MiscellaneousSystemPrivilege_Context ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#createUser}.
	 * @param ctx the parse tree
	 */
	void enterCreateUser(OracleStatementParser.CreateUserContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#createUser}.
	 * @param ctx the parse tree
	 */
	void exitCreateUser(OracleStatementParser.CreateUserContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#dropUser}.
	 * @param ctx the parse tree
	 */
	void enterDropUser(OracleStatementParser.DropUserContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#dropUser}.
	 * @param ctx the parse tree
	 */
	void exitDropUser(OracleStatementParser.DropUserContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#alterUser}.
	 * @param ctx the parse tree
	 */
	void enterAlterUser(OracleStatementParser.AlterUserContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#alterUser}.
	 * @param ctx the parse tree
	 */
	void exitAlterUser(OracleStatementParser.AlterUserContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#createRole}.
	 * @param ctx the parse tree
	 */
	void enterCreateRole(OracleStatementParser.CreateRoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#createRole}.
	 * @param ctx the parse tree
	 */
	void exitCreateRole(OracleStatementParser.CreateRoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#dropRole}.
	 * @param ctx the parse tree
	 */
	void enterDropRole(OracleStatementParser.DropRoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#dropRole}.
	 * @param ctx the parse tree
	 */
	void exitDropRole(OracleStatementParser.DropRoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#alterRole}.
	 * @param ctx the parse tree
	 */
	void enterAlterRole(OracleStatementParser.AlterRoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#alterRole}.
	 * @param ctx the parse tree
	 */
	void exitAlterRole(OracleStatementParser.AlterRoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleStatementParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(OracleStatementParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleStatementParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(OracleStatementParser.CallContext ctx);
}