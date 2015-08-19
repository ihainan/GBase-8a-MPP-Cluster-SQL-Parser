// Generated from uniformSQL.g4 by ANTLR 4.5
package cn.edu.bit.linc.sqlparser.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class uniformSQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TRUE=1, FALSE=2, ALL=3, NOT=4, LIKE=5, IF=6, EXISTS=7, ASC=8, DESC=9, 
		ORDER=10, GROUP=11, BY=12, HAVING=13, WHERE=14, FROM=15, AS=16, SELECT=17, 
		DISTINCT=18, INSERT=19, OVERWRITE=20, OUTER=21, UNIQUEJOIN=22, PRESERVE=23, 
		JOIN=24, LEFT=25, RIGHT=26, FULL=27, ON=28, PARTITION=29, PARTITIONS=30, 
		TABLE=31, TABLES=32, COLUMNS=33, INDEX=34, INDEXES=35, REBUILD=36, FUNCTIONS=37, 
		SHOW=38, MSCK=39, REPAIR=40, DIRECTORY=41, LOCAL=42, TRANSFORM=43, USING=44, 
		CLUSTER=45, DISTRIBUTE=46, SORT=47, UNION=48, LOAD=49, EXPORT=50, IMPORT=51, 
		DATA=52, INPATH=53, IS=54, NULL=55, CREATE=56, EXTERNAL=57, ALTER=58, 
		CHANGE=59, COLUMN=60, FIRST=61, AFTER=62, DESCRIBE=63, DROP=64, RENAME=65, 
		IGNORE=66, PROTECTION=67, TO=68, COMMENT=69, BOOLEAN=70, TINYINT=71, SMALLINT=72, 
		INT=73, BIGINT=74, FLOAT=75, DOUBLE=76, DATE=77, DATETIME=78, TIMESTAMP=79, 
		DECIMAL=80, STRING=81, VARCHAR=82, ARRAY=83, STRUCT=84, MAP=85, UNIONTYPE=86, 
		REDUCE=87, PARTITIONED=88, CLUSTERED=89, SORTED=90, INTO=91, BUCKETS=92, 
		ROW=93, ROWS=94, FORMAT=95, DELIMITED=96, FIELDS=97, TERMINATED=98, ESCAPED=99, 
		COLLECTION=100, ITEMS=101, KEYS=102, KEY=103, LINES=104, STORED=105, FILEFORMAT=106, 
		SEQUENCEFILE=107, TEXTFILE=108, RCFILE=109, ORCFILE=110, INPUTFORMAT=111, 
		OUTPUTFORMAT=112, INPUTDRIVER=113, OUTPUTDRIVER=114, OFFLINE=115, ENABLE=116, 
		DEFAULT=117, DISABLE=118, READONLY=119, LOCATION=120, TABLESAMPLE=121, 
		BUCKET=122, OUT=123, OF=124, PERCENT=125, CAST=126, ADD=127, REPLACE=128, 
		RLIKE=129, REGEXP=130, TEMPORARY=131, FUNCTION=132, MACRO=133, EXPLAIN=134, 
		EXTENDED=135, FORMATTED=136, PRETTY=137, DEPENDENCY=138, LOGICAL=139, 
		SERDE=140, WITH=141, DEFERRED=142, SERDEPROPERTIES=143, DBPROPERTIES=144, 
		LIMIT=145, SET=146, UNSET=147, TBLPROPERTIES=148, IDXPROPERTIES=149, CASCADED=150, 
		CASE=151, WHEN=152, THEN=153, ELSE=154, END=155, MAPJOIN=156, STREAMTABLE=157, 
		CLUSTERSTATUS=158, UTC=159, LONG=160, DELETE=161, FETCH=162, INTERSECT=163, 
		VIEW=164, IN=165, DATABASE=166, DATABASES=167, MATERIALIZED=168, SCHEMA=169, 
		SCHEMAS=170, GRANT=171, REVOKE=172, SSL=173, UNDO=174, LOCK=175, LOCKS=176, 
		UNLOCK=177, SHARED=178, EXCLUSIVE=179, PROCEDURE=180, UNSIGNED=181, WHILE=182, 
		READ=183, READS=184, PURGE=185, RANGE=186, ANALYZE=187, BEFORE=188, BETWEEN=189, 
		BOTH=190, BINARY=191, CROSS=192, CONTINUE=193, CURSOR=194, TRIGGER=195, 
		RECORDREADER=196, RECORDWRITER=197, LATERAL=198, TOUCH=199, ARCHIVE=200, 
		UNARCHIVE=201, COMPUTE=202, STATISTICS=203, USE=204, OPTION=205, CONCATENATE=206, 
		UPDATE=207, RESTRICT=208, CASCADE=209, SKEWED=210, ROLLUP=211, CUBE=212, 
		DIRECTORIES=213, FOR=214, WINDOW=215, UNBOUNDED=216, PRECEDING=217, FOLLOWING=218, 
		CURRENT=219, LESS=220, MORE=221, OVER=222, GROUPING=223, SETS=224, TRUNCATE=225, 
		NOSCAN=226, PARTIALSCAN=227, USER=228, ROLE=229, INNER=230, EXCHANGE=231, 
		IDENTIFIED=232, CHAR=233, ABS=234, ACOS=235, ASIN=236, ATAN=237, CEIL=238, 
		COS=239, COT=240, EXP=241, FLOOR=242, LN=243, POW=244, RAND=245, ROUND=246, 
		SIN=247, SQRT=248, TAN=249, LCASE=250, LOWER=251, LTRIM=252, RTRIM=253, 
		CONCAT=254, SUBSTR=255, TRIM=256, UCASE=257, UPPER=258, INTERVAL=259, 
		TO_DATE=260, DAY=261, HOUR=262, MINUTE=263, MONTH=264, SECOND=265, FROM_UNIXTIME=266, 
		YEAR=267, DATE_ADD=268, DATE_SUB=269, COLLATE=270, AVG=271, COUNT=272, 
		MAX=273, MIN=274, SUM=275, COALESCE=276, DUPLICATE=277, SERVER=278, ALIASES=279, 
		ALIAS=280, VALUES=281, VALUE=282, LOW_PRIORITY=283, HIGH_PRIORITY=284, 
		HASH=285, REFERENCES=286, TO_CHAR=287, DATE_FORMAT=288, SIGNED=289, INTEGER=290, 
		LENGTH=291, REVERSE=292, IFNULL=293, DIVIDE=294, MOD=295, OR=296, AND=297, 
		XOR=298, ARROW=299, EQ=300, NOT_EQ=301, LET=302, GET=303, SET_VAR=304, 
		SHIFT_LEFT=305, SHIFT_RIGHT=306, SEMI=307, COLON=308, DOT=309, COMMA=310, 
		ASTERISK=311, RPAREN=312, LPAREN=313, RBRACK=314, LBRACK=315, PLUS=316, 
		MINUS=317, NEGATION=318, VERTBAR=319, BITAND=320, POWER_OP=321, GTH=322, 
		LTH=323, Double_Quote=324, INTEGER_NUM=325, VARCHAR_NUM=326, BINARY_NUM=327, 
		HEX_DIGIT=328, BIT_NUM=329, REAL_NUMBER=330, TEXT_STRING=331, ID=332, 
		LINE_COMMENT=333, BLOCKCOMMENT=334, WHITE_SPACE=335, SL_COMMENT=336, Regex_Escaped_Unicode=337;
	public static final int
		RULE_keyword = 0, RULE_delimited_statement = 1, RULE_integer_types = 2, 
		RULE_relational_op = 3, RULE_cast_data_type = 4, RULE_interval_unit = 5, 
		RULE_string_literal = 6, RULE_number_literal = 7, RULE_hex_literal = 8, 
		RULE_boolean_literal = 9, RULE_bit_literal = 10, RULE_literal_value = 11, 
		RULE_functionList = 12, RULE_number_functions = 13, RULE_char_functions = 14, 
		RULE_time_functions = 15, RULE_other_functions = 16, RULE_group_functions = 17, 
		RULE_schema_name = 18, RULE_database_name = 19, RULE_table_name = 20, 
		RULE_engine_name = 21, RULE_column_name = 22, RULE_view_name = 23, RULE_parser_name = 24, 
		RULE_index_name = 25, RULE_partition_name = 26, RULE_partition_logical_name = 27, 
		RULE_constraintbol_name = 28, RULE_foreign_keybol_name = 29, RULE_collation_name = 30, 
		RULE_event_name = 31, RULE_user_name = 32, RULE_function_name = 33, RULE_procedure_name = 34, 
		RULE_server_name = 35, RULE_wrapper_name = 36, RULE_alias = 37, RULE_password = 38, 
		RULE_server_alias = 39, RULE_role_name = 40, RULE_group_name = 41, RULE_principal_name = 42, 
		RULE_any_name = 43, RULE_priv_type = 44, RULE_expression = 45, RULE_exp_factor1 = 46, 
		RULE_exp_factor2 = 47, RULE_exp_factor3 = 48, RULE_exp_factor4 = 49, RULE_bool_primary = 50, 
		RULE_predicate = 51, RULE_bit_expr = 52, RULE_factor1 = 53, RULE_factor2 = 54, 
		RULE_factor3 = 55, RULE_factor4 = 56, RULE_factor5 = 57, RULE_factor6 = 58, 
		RULE_factor7 = 59, RULE_simple_expr = 60, RULE_function_call = 61, RULE_case_when_statement = 62, 
		RULE_case_when_statement1 = 63, RULE_case_when_statement2 = 64, RULE_column_spec = 65, 
		RULE_raw_expression_list = 66, RULE_expression_list = 67, RULE_interval_expr = 68, 
		RULE_table_references = 69, RULE_table_reference = 70, RULE_table_factor1 = 71, 
		RULE_table_factor2 = 72, RULE_table_factor3 = 73, RULE_table_atom = 74, 
		RULE_join_condition = 75, RULE_index_hint_list = 76, RULE_index_options = 77, 
		RULE_index_hint = 78, RULE_index_list = 79, RULE_partition_clause = 80, 
		RULE_partition_names = 81, RULE_root_statement = 82, RULE_data_manipulation_statements = 83, 
		RULE_data_definition_statements = 84, RULE_select_statement = 85, RULE_select_expression = 86, 
		RULE_where_clause = 87, RULE_groupby_clause = 88, RULE_groupby_item = 89, 
		RULE_having_clause = 90, RULE_orderby_clause = 91, RULE_orderby_item = 92, 
		RULE_limit_clause = 93, RULE_offset = 94, RULE_row_count = 95, RULE_select_list = 96, 
		RULE_column_list = 97, RULE_subquery = 98, RULE_table_spec = 99, RULE_displayed_column = 100, 
		RULE_insert_statements = 101, RULE_insert_header = 102, RULE_insert_subfix = 103, 
		RULE_insert_statement = 104, RULE_value_list_clause = 105, RULE_column_value_list = 106, 
		RULE_set_columns_cluase = 107, RULE_set_column_cluase = 108, RULE_create_database_statement = 109, 
		RULE_drop_database_statement = 110, RULE_create_table_statement = 111, 
		RULE_create_table_statement1 = 112, RULE_create_table_statement2 = 113, 
		RULE_create_table_statement3 = 114, RULE_create_definition = 115, RULE_column_definition = 116, 
		RULE_null_or_notnull = 117, RULE_column_data_type_header = 118, RULE_index_column_name = 119, 
		RULE_reference_definition = 120, RULE_reference_option = 121, RULE_length = 122, 
		RULE_varchar_length = 123, RULE_binary_length = 124, RULE_alter_table_statement = 125, 
		RULE_alter_table_specification = 126, RULE_index_column_names = 127, RULE_index_type = 128, 
		RULE_index_option = 129, RULE_column_definitions = 130, RULE_rename_table_statement = 131, 
		RULE_drop_table_statement = 132, RULE_drop_view_statement = 133, RULE_truncate_table_statement = 134, 
		RULE_create_view_statement = 135, RULE_create_view_body = 136, RULE_alter_view_statement = 137, 
		RULE_create_user_statement = 138, RULE_drop_user_statement = 139, RULE_grant_privilege_statement = 140, 
		RULE_principal_specification = 141, RULE_revoke_privilege_statement = 142, 
		RULE_show_event_statement = 143, RULE_show_specification = 144, RULE_set_event_statement = 145, 
		RULE_use_event_statement = 146, RULE_server_event_statement = 147, RULE_update_statements = 148, 
		RULE_delete_statements = 149;
	public static final String[] ruleNames = {
		"keyword", "delimited_statement", "integer_types", "relational_op", "cast_data_type", 
		"interval_unit", "string_literal", "number_literal", "hex_literal", "boolean_literal", 
		"bit_literal", "literal_value", "functionList", "number_functions", "char_functions", 
		"time_functions", "other_functions", "group_functions", "schema_name", 
		"database_name", "table_name", "engine_name", "column_name", "view_name", 
		"parser_name", "index_name", "partition_name", "partition_logical_name", 
		"constraintbol_name", "foreign_keybol_name", "collation_name", "event_name", 
		"user_name", "function_name", "procedure_name", "server_name", "wrapper_name", 
		"alias", "password", "server_alias", "role_name", "group_name", "principal_name", 
		"any_name", "priv_type", "expression", "exp_factor1", "exp_factor2", "exp_factor3", 
		"exp_factor4", "bool_primary", "predicate", "bit_expr", "factor1", "factor2", 
		"factor3", "factor4", "factor5", "factor6", "factor7", "simple_expr", 
		"function_call", "case_when_statement", "case_when_statement1", "case_when_statement2", 
		"column_spec", "raw_expression_list", "expression_list", "interval_expr", 
		"table_references", "table_reference", "table_factor1", "table_factor2", 
		"table_factor3", "table_atom", "join_condition", "index_hint_list", "index_options", 
		"index_hint", "index_list", "partition_clause", "partition_names", "root_statement", 
		"data_manipulation_statements", "data_definition_statements", "select_statement", 
		"select_expression", "where_clause", "groupby_clause", "groupby_item", 
		"having_clause", "orderby_clause", "orderby_item", "limit_clause", "offset", 
		"row_count", "select_list", "column_list", "subquery", "table_spec", "displayed_column", 
		"insert_statements", "insert_header", "insert_subfix", "insert_statement", 
		"value_list_clause", "column_value_list", "set_columns_cluase", "set_column_cluase", 
		"create_database_statement", "drop_database_statement", "create_table_statement", 
		"create_table_statement1", "create_table_statement2", "create_table_statement3", 
		"create_definition", "column_definition", "null_or_notnull", "column_data_type_header", 
		"index_column_name", "reference_definition", "reference_option", "length", 
		"varchar_length", "binary_length", "alter_table_statement", "alter_table_specification", 
		"index_column_names", "index_type", "index_option", "column_definitions", 
		"rename_table_statement", "drop_table_statement", "drop_view_statement", 
		"truncate_table_statement", "create_view_statement", "create_view_body", 
		"alter_view_statement", "create_user_statement", "drop_user_statement", 
		"grant_privilege_statement", "principal_specification", "revoke_privilege_statement", 
		"show_event_statement", "show_specification", "set_event_statement", "use_event_statement", 
		"server_event_statement", "update_statements", "delete_statements"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "'=>'", 
		null, null, "'<='", "'>='", "':='", "'<<'", "'>>'", "';'", "':'", "'.'", 
		"','", "'*'", "')'", "'('", "']'", "'['", "'+'", "'-'", "'~'", "'|'", 
		"'&'", "'^'", "'>'", "'<'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TRUE", "FALSE", "ALL", "NOT", "LIKE", "IF", "EXISTS", "ASC", "DESC", 
		"ORDER", "GROUP", "BY", "HAVING", "WHERE", "FROM", "AS", "SELECT", "DISTINCT", 
		"INSERT", "OVERWRITE", "OUTER", "UNIQUEJOIN", "PRESERVE", "JOIN", "LEFT", 
		"RIGHT", "FULL", "ON", "PARTITION", "PARTITIONS", "TABLE", "TABLES", "COLUMNS", 
		"INDEX", "INDEXES", "REBUILD", "FUNCTIONS", "SHOW", "MSCK", "REPAIR", 
		"DIRECTORY", "LOCAL", "TRANSFORM", "USING", "CLUSTER", "DISTRIBUTE", "SORT", 
		"UNION", "LOAD", "EXPORT", "IMPORT", "DATA", "INPATH", "IS", "NULL", "CREATE", 
		"EXTERNAL", "ALTER", "CHANGE", "COLUMN", "FIRST", "AFTER", "DESCRIBE", 
		"DROP", "RENAME", "IGNORE", "PROTECTION", "TO", "COMMENT", "BOOLEAN", 
		"TINYINT", "SMALLINT", "INT", "BIGINT", "FLOAT", "DOUBLE", "DATE", "DATETIME", 
		"TIMESTAMP", "DECIMAL", "STRING", "VARCHAR", "ARRAY", "STRUCT", "MAP", 
		"UNIONTYPE", "REDUCE", "PARTITIONED", "CLUSTERED", "SORTED", "INTO", "BUCKETS", 
		"ROW", "ROWS", "FORMAT", "DELIMITED", "FIELDS", "TERMINATED", "ESCAPED", 
		"COLLECTION", "ITEMS", "KEYS", "KEY", "LINES", "STORED", "FILEFORMAT", 
		"SEQUENCEFILE", "TEXTFILE", "RCFILE", "ORCFILE", "INPUTFORMAT", "OUTPUTFORMAT", 
		"INPUTDRIVER", "OUTPUTDRIVER", "OFFLINE", "ENABLE", "DEFAULT", "DISABLE", 
		"READONLY", "LOCATION", "TABLESAMPLE", "BUCKET", "OUT", "OF", "PERCENT", 
		"CAST", "ADD", "REPLACE", "RLIKE", "REGEXP", "TEMPORARY", "FUNCTION", 
		"MACRO", "EXPLAIN", "EXTENDED", "FORMATTED", "PRETTY", "DEPENDENCY", "LOGICAL", 
		"SERDE", "WITH", "DEFERRED", "SERDEPROPERTIES", "DBPROPERTIES", "LIMIT", 
		"SET", "UNSET", "TBLPROPERTIES", "IDXPROPERTIES", "CASCADED", "CASE", 
		"WHEN", "THEN", "ELSE", "END", "MAPJOIN", "STREAMTABLE", "CLUSTERSTATUS", 
		"UTC", "LONG", "DELETE", "FETCH", "INTERSECT", "VIEW", "IN", "DATABASE", 
		"DATABASES", "MATERIALIZED", "SCHEMA", "SCHEMAS", "GRANT", "REVOKE", "SSL", 
		"UNDO", "LOCK", "LOCKS", "UNLOCK", "SHARED", "EXCLUSIVE", "PROCEDURE", 
		"UNSIGNED", "WHILE", "READ", "READS", "PURGE", "RANGE", "ANALYZE", "BEFORE", 
		"BETWEEN", "BOTH", "BINARY", "CROSS", "CONTINUE", "CURSOR", "TRIGGER", 
		"RECORDREADER", "RECORDWRITER", "LATERAL", "TOUCH", "ARCHIVE", "UNARCHIVE", 
		"COMPUTE", "STATISTICS", "USE", "OPTION", "CONCATENATE", "UPDATE", "RESTRICT", 
		"CASCADE", "SKEWED", "ROLLUP", "CUBE", "DIRECTORIES", "FOR", "WINDOW", 
		"UNBOUNDED", "PRECEDING", "FOLLOWING", "CURRENT", "LESS", "MORE", "OVER", 
		"GROUPING", "SETS", "TRUNCATE", "NOSCAN", "PARTIALSCAN", "USER", "ROLE", 
		"INNER", "EXCHANGE", "IDENTIFIED", "CHAR", "ABS", "ACOS", "ASIN", "ATAN", 
		"CEIL", "COS", "COT", "EXP", "FLOOR", "LN", "POW", "RAND", "ROUND", "SIN", 
		"SQRT", "TAN", "LCASE", "LOWER", "LTRIM", "RTRIM", "CONCAT", "SUBSTR", 
		"TRIM", "UCASE", "UPPER", "INTERVAL", "TO_DATE", "DAY", "HOUR", "MINUTE", 
		"MONTH", "SECOND", "FROM_UNIXTIME", "YEAR", "DATE_ADD", "DATE_SUB", "COLLATE", 
		"AVG", "COUNT", "MAX", "MIN", "SUM", "COALESCE", "DUPLICATE", "SERVER", 
		"ALIASES", "ALIAS", "VALUES", "VALUE", "LOW_PRIORITY", "HIGH_PRIORITY", 
		"HASH", "REFERENCES", "TO_CHAR", "DATE_FORMAT", "SIGNED", "INTEGER", "LENGTH", 
		"REVERSE", "IFNULL", "DIVIDE", "MOD", "OR", "AND", "XOR", "ARROW", "EQ", 
		"NOT_EQ", "LET", "GET", "SET_VAR", "SHIFT_LEFT", "SHIFT_RIGHT", "SEMI", 
		"COLON", "DOT", "COMMA", "ASTERISK", "RPAREN", "LPAREN", "RBRACK", "LBRACK", 
		"PLUS", "MINUS", "NEGATION", "VERTBAR", "BITAND", "POWER_OP", "GTH", "LTH", 
		"Double_Quote", "INTEGER_NUM", "VARCHAR_NUM", "BINARY_NUM", "HEX_DIGIT", 
		"BIT_NUM", "REAL_NUMBER", "TEXT_STRING", "ID", "LINE_COMMENT", "BLOCKCOMMENT", 
		"WHITE_SPACE", "SL_COMMENT", "Regex_Escaped_Unicode"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "uniformSQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public uniformSQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(uniformSQLParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(uniformSQLParser.FALSE, 0); }
		public TerminalNode ALL() { return getToken(uniformSQLParser.ALL, 0); }
		public TerminalNode NOT() { return getToken(uniformSQLParser.NOT, 0); }
		public TerminalNode LIKE() { return getToken(uniformSQLParser.LIKE, 0); }
		public TerminalNode IF() { return getToken(uniformSQLParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(uniformSQLParser.EXISTS, 0); }
		public TerminalNode ASC() { return getToken(uniformSQLParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(uniformSQLParser.DESC, 0); }
		public TerminalNode ORDER() { return getToken(uniformSQLParser.ORDER, 0); }
		public TerminalNode GROUP() { return getToken(uniformSQLParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(uniformSQLParser.BY, 0); }
		public TerminalNode HAVING() { return getToken(uniformSQLParser.HAVING, 0); }
		public TerminalNode WHERE() { return getToken(uniformSQLParser.WHERE, 0); }
		public TerminalNode FROM() { return getToken(uniformSQLParser.FROM, 0); }
		public TerminalNode AS() { return getToken(uniformSQLParser.AS, 0); }
		public TerminalNode SELECT() { return getToken(uniformSQLParser.SELECT, 0); }
		public TerminalNode DISTINCT() { return getToken(uniformSQLParser.DISTINCT, 0); }
		public TerminalNode INSERT() { return getToken(uniformSQLParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(uniformSQLParser.OVERWRITE, 0); }
		public TerminalNode OUTER() { return getToken(uniformSQLParser.OUTER, 0); }
		public TerminalNode UNIQUEJOIN() { return getToken(uniformSQLParser.UNIQUEJOIN, 0); }
		public TerminalNode PRESERVE() { return getToken(uniformSQLParser.PRESERVE, 0); }
		public TerminalNode JOIN() { return getToken(uniformSQLParser.JOIN, 0); }
		public TerminalNode LEFT() { return getToken(uniformSQLParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(uniformSQLParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(uniformSQLParser.FULL, 0); }
		public TerminalNode ON() { return getToken(uniformSQLParser.ON, 0); }
		public TerminalNode PARTITION() { return getToken(uniformSQLParser.PARTITION, 0); }
		public TerminalNode PARTITIONS() { return getToken(uniformSQLParser.PARTITIONS, 0); }
		public TerminalNode TABLE() { return getToken(uniformSQLParser.TABLE, 0); }
		public TerminalNode TABLES() { return getToken(uniformSQLParser.TABLES, 0); }
		public TerminalNode COLUMNS() { return getToken(uniformSQLParser.COLUMNS, 0); }
		public TerminalNode INDEX() { return getToken(uniformSQLParser.INDEX, 0); }
		public TerminalNode INDEXES() { return getToken(uniformSQLParser.INDEXES, 0); }
		public TerminalNode REBUILD() { return getToken(uniformSQLParser.REBUILD, 0); }
		public TerminalNode FUNCTIONS() { return getToken(uniformSQLParser.FUNCTIONS, 0); }
		public TerminalNode SHOW() { return getToken(uniformSQLParser.SHOW, 0); }
		public TerminalNode MSCK() { return getToken(uniformSQLParser.MSCK, 0); }
		public TerminalNode REPAIR() { return getToken(uniformSQLParser.REPAIR, 0); }
		public TerminalNode DIRECTORY() { return getToken(uniformSQLParser.DIRECTORY, 0); }
		public TerminalNode LOCAL() { return getToken(uniformSQLParser.LOCAL, 0); }
		public TerminalNode TRANSFORM() { return getToken(uniformSQLParser.TRANSFORM, 0); }
		public TerminalNode USING() { return getToken(uniformSQLParser.USING, 0); }
		public TerminalNode CLUSTER() { return getToken(uniformSQLParser.CLUSTER, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(uniformSQLParser.DISTRIBUTE, 0); }
		public TerminalNode SORT() { return getToken(uniformSQLParser.SORT, 0); }
		public TerminalNode UNION() { return getToken(uniformSQLParser.UNION, 0); }
		public TerminalNode LOAD() { return getToken(uniformSQLParser.LOAD, 0); }
		public TerminalNode EXPORT() { return getToken(uniformSQLParser.EXPORT, 0); }
		public TerminalNode IMPORT() { return getToken(uniformSQLParser.IMPORT, 0); }
		public TerminalNode DATA() { return getToken(uniformSQLParser.DATA, 0); }
		public TerminalNode INPATH() { return getToken(uniformSQLParser.INPATH, 0); }
		public TerminalNode IS() { return getToken(uniformSQLParser.IS, 0); }
		public TerminalNode NULL() { return getToken(uniformSQLParser.NULL, 0); }
		public TerminalNode CREATE() { return getToken(uniformSQLParser.CREATE, 0); }
		public TerminalNode EXTERNAL() { return getToken(uniformSQLParser.EXTERNAL, 0); }
		public TerminalNode ALTER() { return getToken(uniformSQLParser.ALTER, 0); }
		public TerminalNode CHANGE() { return getToken(uniformSQLParser.CHANGE, 0); }
		public TerminalNode COLUMN() { return getToken(uniformSQLParser.COLUMN, 0); }
		public TerminalNode FIRST() { return getToken(uniformSQLParser.FIRST, 0); }
		public TerminalNode AFTER() { return getToken(uniformSQLParser.AFTER, 0); }
		public TerminalNode DESCRIBE() { return getToken(uniformSQLParser.DESCRIBE, 0); }
		public TerminalNode DROP() { return getToken(uniformSQLParser.DROP, 0); }
		public TerminalNode RENAME() { return getToken(uniformSQLParser.RENAME, 0); }
		public TerminalNode IGNORE() { return getToken(uniformSQLParser.IGNORE, 0); }
		public TerminalNode PROTECTION() { return getToken(uniformSQLParser.PROTECTION, 0); }
		public TerminalNode TO() { return getToken(uniformSQLParser.TO, 0); }
		public TerminalNode COMMENT() { return getToken(uniformSQLParser.COMMENT, 0); }
		public TerminalNode BOOLEAN() { return getToken(uniformSQLParser.BOOLEAN, 0); }
		public TerminalNode TINYINT() { return getToken(uniformSQLParser.TINYINT, 0); }
		public TerminalNode SMALLINT() { return getToken(uniformSQLParser.SMALLINT, 0); }
		public TerminalNode INT() { return getToken(uniformSQLParser.INT, 0); }
		public TerminalNode BIGINT() { return getToken(uniformSQLParser.BIGINT, 0); }
		public TerminalNode FLOAT() { return getToken(uniformSQLParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(uniformSQLParser.DOUBLE, 0); }
		public TerminalNode DATE() { return getToken(uniformSQLParser.DATE, 0); }
		public TerminalNode DATETIME() { return getToken(uniformSQLParser.DATETIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(uniformSQLParser.TIMESTAMP, 0); }
		public TerminalNode DECIMAL() { return getToken(uniformSQLParser.DECIMAL, 0); }
		public TerminalNode STRING() { return getToken(uniformSQLParser.STRING, 0); }
		public TerminalNode VARCHAR() { return getToken(uniformSQLParser.VARCHAR, 0); }
		public TerminalNode ARRAY() { return getToken(uniformSQLParser.ARRAY, 0); }
		public TerminalNode STRUCT() { return getToken(uniformSQLParser.STRUCT, 0); }
		public TerminalNode MAP() { return getToken(uniformSQLParser.MAP, 0); }
		public TerminalNode UNIONTYPE() { return getToken(uniformSQLParser.UNIONTYPE, 0); }
		public TerminalNode REDUCE() { return getToken(uniformSQLParser.REDUCE, 0); }
		public TerminalNode PARTITIONED() { return getToken(uniformSQLParser.PARTITIONED, 0); }
		public TerminalNode CLUSTERED() { return getToken(uniformSQLParser.CLUSTERED, 0); }
		public TerminalNode SORTED() { return getToken(uniformSQLParser.SORTED, 0); }
		public TerminalNode INTO() { return getToken(uniformSQLParser.INTO, 0); }
		public TerminalNode BUCKETS() { return getToken(uniformSQLParser.BUCKETS, 0); }
		public TerminalNode ROW() { return getToken(uniformSQLParser.ROW, 0); }
		public TerminalNode ROWS() { return getToken(uniformSQLParser.ROWS, 0); }
		public TerminalNode FORMAT() { return getToken(uniformSQLParser.FORMAT, 0); }
		public TerminalNode DELIMITED() { return getToken(uniformSQLParser.DELIMITED, 0); }
		public TerminalNode FIELDS() { return getToken(uniformSQLParser.FIELDS, 0); }
		public TerminalNode TERMINATED() { return getToken(uniformSQLParser.TERMINATED, 0); }
		public TerminalNode ESCAPED() { return getToken(uniformSQLParser.ESCAPED, 0); }
		public TerminalNode COLLECTION() { return getToken(uniformSQLParser.COLLECTION, 0); }
		public TerminalNode ITEMS() { return getToken(uniformSQLParser.ITEMS, 0); }
		public TerminalNode KEYS() { return getToken(uniformSQLParser.KEYS, 0); }
		public TerminalNode KEY() { return getToken(uniformSQLParser.KEY, 0); }
		public TerminalNode LINES() { return getToken(uniformSQLParser.LINES, 0); }
		public TerminalNode STORED() { return getToken(uniformSQLParser.STORED, 0); }
		public TerminalNode FILEFORMAT() { return getToken(uniformSQLParser.FILEFORMAT, 0); }
		public TerminalNode SEQUENCEFILE() { return getToken(uniformSQLParser.SEQUENCEFILE, 0); }
		public TerminalNode TEXTFILE() { return getToken(uniformSQLParser.TEXTFILE, 0); }
		public TerminalNode RCFILE() { return getToken(uniformSQLParser.RCFILE, 0); }
		public TerminalNode ORCFILE() { return getToken(uniformSQLParser.ORCFILE, 0); }
		public TerminalNode INPUTFORMAT() { return getToken(uniformSQLParser.INPUTFORMAT, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(uniformSQLParser.OUTPUTFORMAT, 0); }
		public TerminalNode INPUTDRIVER() { return getToken(uniformSQLParser.INPUTDRIVER, 0); }
		public TerminalNode OUTPUTDRIVER() { return getToken(uniformSQLParser.OUTPUTDRIVER, 0); }
		public TerminalNode OFFLINE() { return getToken(uniformSQLParser.OFFLINE, 0); }
		public TerminalNode ENABLE() { return getToken(uniformSQLParser.ENABLE, 0); }
		public TerminalNode DEFAULT() { return getToken(uniformSQLParser.DEFAULT, 0); }
		public TerminalNode DISABLE() { return getToken(uniformSQLParser.DISABLE, 0); }
		public TerminalNode READONLY() { return getToken(uniformSQLParser.READONLY, 0); }
		public TerminalNode LOCATION() { return getToken(uniformSQLParser.LOCATION, 0); }
		public TerminalNode TABLESAMPLE() { return getToken(uniformSQLParser.TABLESAMPLE, 0); }
		public TerminalNode BUCKET() { return getToken(uniformSQLParser.BUCKET, 0); }
		public TerminalNode OUT() { return getToken(uniformSQLParser.OUT, 0); }
		public TerminalNode OF() { return getToken(uniformSQLParser.OF, 0); }
		public TerminalNode PERCENT() { return getToken(uniformSQLParser.PERCENT, 0); }
		public TerminalNode CAST() { return getToken(uniformSQLParser.CAST, 0); }
		public TerminalNode ADD() { return getToken(uniformSQLParser.ADD, 0); }
		public TerminalNode REPLACE() { return getToken(uniformSQLParser.REPLACE, 0); }
		public TerminalNode RLIKE() { return getToken(uniformSQLParser.RLIKE, 0); }
		public TerminalNode REGEXP() { return getToken(uniformSQLParser.REGEXP, 0); }
		public TerminalNode TEMPORARY() { return getToken(uniformSQLParser.TEMPORARY, 0); }
		public TerminalNode FUNCTION() { return getToken(uniformSQLParser.FUNCTION, 0); }
		public TerminalNode MACRO() { return getToken(uniformSQLParser.MACRO, 0); }
		public TerminalNode EXPLAIN() { return getToken(uniformSQLParser.EXPLAIN, 0); }
		public TerminalNode EXTENDED() { return getToken(uniformSQLParser.EXTENDED, 0); }
		public TerminalNode FORMATTED() { return getToken(uniformSQLParser.FORMATTED, 0); }
		public TerminalNode PRETTY() { return getToken(uniformSQLParser.PRETTY, 0); }
		public TerminalNode DEPENDENCY() { return getToken(uniformSQLParser.DEPENDENCY, 0); }
		public TerminalNode LOGICAL() { return getToken(uniformSQLParser.LOGICAL, 0); }
		public TerminalNode SERDE() { return getToken(uniformSQLParser.SERDE, 0); }
		public TerminalNode WITH() { return getToken(uniformSQLParser.WITH, 0); }
		public TerminalNode DEFERRED() { return getToken(uniformSQLParser.DEFERRED, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(uniformSQLParser.SERDEPROPERTIES, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(uniformSQLParser.DBPROPERTIES, 0); }
		public TerminalNode LIMIT() { return getToken(uniformSQLParser.LIMIT, 0); }
		public TerminalNode SET() { return getToken(uniformSQLParser.SET, 0); }
		public TerminalNode UNSET() { return getToken(uniformSQLParser.UNSET, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(uniformSQLParser.TBLPROPERTIES, 0); }
		public TerminalNode IDXPROPERTIES() { return getToken(uniformSQLParser.IDXPROPERTIES, 0); }
		public TerminalNode CASCADED() { return getToken(uniformSQLParser.CASCADED, 0); }
		public TerminalNode CASE() { return getToken(uniformSQLParser.CASE, 0); }
		public TerminalNode WHEN() { return getToken(uniformSQLParser.WHEN, 0); }
		public TerminalNode THEN() { return getToken(uniformSQLParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(uniformSQLParser.ELSE, 0); }
		public TerminalNode END() { return getToken(uniformSQLParser.END, 0); }
		public TerminalNode MAPJOIN() { return getToken(uniformSQLParser.MAPJOIN, 0); }
		public TerminalNode STREAMTABLE() { return getToken(uniformSQLParser.STREAMTABLE, 0); }
		public TerminalNode CLUSTERSTATUS() { return getToken(uniformSQLParser.CLUSTERSTATUS, 0); }
		public TerminalNode UTC() { return getToken(uniformSQLParser.UTC, 0); }
		public TerminalNode LONG() { return getToken(uniformSQLParser.LONG, 0); }
		public TerminalNode DELETE() { return getToken(uniformSQLParser.DELETE, 0); }
		public TerminalNode FETCH() { return getToken(uniformSQLParser.FETCH, 0); }
		public TerminalNode INTERSECT() { return getToken(uniformSQLParser.INTERSECT, 0); }
		public TerminalNode VIEW() { return getToken(uniformSQLParser.VIEW, 0); }
		public TerminalNode IN() { return getToken(uniformSQLParser.IN, 0); }
		public TerminalNode DATABASE() { return getToken(uniformSQLParser.DATABASE, 0); }
		public TerminalNode DATABASES() { return getToken(uniformSQLParser.DATABASES, 0); }
		public TerminalNode MATERIALIZED() { return getToken(uniformSQLParser.MATERIALIZED, 0); }
		public TerminalNode SCHEMA() { return getToken(uniformSQLParser.SCHEMA, 0); }
		public TerminalNode SCHEMAS() { return getToken(uniformSQLParser.SCHEMAS, 0); }
		public TerminalNode GRANT() { return getToken(uniformSQLParser.GRANT, 0); }
		public TerminalNode REVOKE() { return getToken(uniformSQLParser.REVOKE, 0); }
		public TerminalNode SSL() { return getToken(uniformSQLParser.SSL, 0); }
		public TerminalNode UNDO() { return getToken(uniformSQLParser.UNDO, 0); }
		public TerminalNode LOCK() { return getToken(uniformSQLParser.LOCK, 0); }
		public TerminalNode LOCKS() { return getToken(uniformSQLParser.LOCKS, 0); }
		public TerminalNode UNLOCK() { return getToken(uniformSQLParser.UNLOCK, 0); }
		public TerminalNode SHARED() { return getToken(uniformSQLParser.SHARED, 0); }
		public TerminalNode EXCLUSIVE() { return getToken(uniformSQLParser.EXCLUSIVE, 0); }
		public TerminalNode PROCEDURE() { return getToken(uniformSQLParser.PROCEDURE, 0); }
		public TerminalNode UNSIGNED() { return getToken(uniformSQLParser.UNSIGNED, 0); }
		public TerminalNode WHILE() { return getToken(uniformSQLParser.WHILE, 0); }
		public TerminalNode READ() { return getToken(uniformSQLParser.READ, 0); }
		public TerminalNode READS() { return getToken(uniformSQLParser.READS, 0); }
		public TerminalNode PURGE() { return getToken(uniformSQLParser.PURGE, 0); }
		public TerminalNode RANGE() { return getToken(uniformSQLParser.RANGE, 0); }
		public TerminalNode ANALYZE() { return getToken(uniformSQLParser.ANALYZE, 0); }
		public TerminalNode BEFORE() { return getToken(uniformSQLParser.BEFORE, 0); }
		public TerminalNode BETWEEN() { return getToken(uniformSQLParser.BETWEEN, 0); }
		public TerminalNode BOTH() { return getToken(uniformSQLParser.BOTH, 0); }
		public TerminalNode BINARY() { return getToken(uniformSQLParser.BINARY, 0); }
		public TerminalNode CROSS() { return getToken(uniformSQLParser.CROSS, 0); }
		public TerminalNode CONTINUE() { return getToken(uniformSQLParser.CONTINUE, 0); }
		public TerminalNode CURSOR() { return getToken(uniformSQLParser.CURSOR, 0); }
		public TerminalNode TRIGGER() { return getToken(uniformSQLParser.TRIGGER, 0); }
		public TerminalNode RECORDREADER() { return getToken(uniformSQLParser.RECORDREADER, 0); }
		public TerminalNode RECORDWRITER() { return getToken(uniformSQLParser.RECORDWRITER, 0); }
		public TerminalNode LATERAL() { return getToken(uniformSQLParser.LATERAL, 0); }
		public TerminalNode TOUCH() { return getToken(uniformSQLParser.TOUCH, 0); }
		public TerminalNode ARCHIVE() { return getToken(uniformSQLParser.ARCHIVE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(uniformSQLParser.UNARCHIVE, 0); }
		public TerminalNode COMPUTE() { return getToken(uniformSQLParser.COMPUTE, 0); }
		public TerminalNode STATISTICS() { return getToken(uniformSQLParser.STATISTICS, 0); }
		public TerminalNode USE() { return getToken(uniformSQLParser.USE, 0); }
		public TerminalNode OPTION() { return getToken(uniformSQLParser.OPTION, 0); }
		public TerminalNode CONCATENATE() { return getToken(uniformSQLParser.CONCATENATE, 0); }
		public TerminalNode UPDATE() { return getToken(uniformSQLParser.UPDATE, 0); }
		public TerminalNode RESTRICT() { return getToken(uniformSQLParser.RESTRICT, 0); }
		public TerminalNode CASCADE() { return getToken(uniformSQLParser.CASCADE, 0); }
		public TerminalNode SKEWED() { return getToken(uniformSQLParser.SKEWED, 0); }
		public TerminalNode ROLLUP() { return getToken(uniformSQLParser.ROLLUP, 0); }
		public TerminalNode CUBE() { return getToken(uniformSQLParser.CUBE, 0); }
		public TerminalNode DIRECTORIES() { return getToken(uniformSQLParser.DIRECTORIES, 0); }
		public TerminalNode FOR() { return getToken(uniformSQLParser.FOR, 0); }
		public TerminalNode WINDOW() { return getToken(uniformSQLParser.WINDOW, 0); }
		public TerminalNode UNBOUNDED() { return getToken(uniformSQLParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(uniformSQLParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(uniformSQLParser.FOLLOWING, 0); }
		public TerminalNode CURRENT() { return getToken(uniformSQLParser.CURRENT, 0); }
		public TerminalNode LESS() { return getToken(uniformSQLParser.LESS, 0); }
		public TerminalNode MORE() { return getToken(uniformSQLParser.MORE, 0); }
		public TerminalNode OVER() { return getToken(uniformSQLParser.OVER, 0); }
		public TerminalNode GROUPING() { return getToken(uniformSQLParser.GROUPING, 0); }
		public TerminalNode SETS() { return getToken(uniformSQLParser.SETS, 0); }
		public TerminalNode TRUNCATE() { return getToken(uniformSQLParser.TRUNCATE, 0); }
		public TerminalNode NOSCAN() { return getToken(uniformSQLParser.NOSCAN, 0); }
		public TerminalNode PARTIALSCAN() { return getToken(uniformSQLParser.PARTIALSCAN, 0); }
		public TerminalNode USER() { return getToken(uniformSQLParser.USER, 0); }
		public TerminalNode ROLE() { return getToken(uniformSQLParser.ROLE, 0); }
		public TerminalNode INNER() { return getToken(uniformSQLParser.INNER, 0); }
		public TerminalNode EXCHANGE() { return getToken(uniformSQLParser.EXCHANGE, 0); }
		public TerminalNode IDENTIFIED() { return getToken(uniformSQLParser.IDENTIFIED, 0); }
		public TerminalNode CHAR() { return getToken(uniformSQLParser.CHAR, 0); }
		public TerminalNode ABS() { return getToken(uniformSQLParser.ABS, 0); }
		public TerminalNode ACOS() { return getToken(uniformSQLParser.ACOS, 0); }
		public TerminalNode ASIN() { return getToken(uniformSQLParser.ASIN, 0); }
		public TerminalNode ATAN() { return getToken(uniformSQLParser.ATAN, 0); }
		public TerminalNode CEIL() { return getToken(uniformSQLParser.CEIL, 0); }
		public TerminalNode COS() { return getToken(uniformSQLParser.COS, 0); }
		public TerminalNode COT() { return getToken(uniformSQLParser.COT, 0); }
		public TerminalNode EXP() { return getToken(uniformSQLParser.EXP, 0); }
		public TerminalNode FLOOR() { return getToken(uniformSQLParser.FLOOR, 0); }
		public TerminalNode LN() { return getToken(uniformSQLParser.LN, 0); }
		public TerminalNode POW() { return getToken(uniformSQLParser.POW, 0); }
		public TerminalNode RAND() { return getToken(uniformSQLParser.RAND, 0); }
		public TerminalNode ROUND() { return getToken(uniformSQLParser.ROUND, 0); }
		public TerminalNode SIN() { return getToken(uniformSQLParser.SIN, 0); }
		public TerminalNode SQRT() { return getToken(uniformSQLParser.SQRT, 0); }
		public TerminalNode TAN() { return getToken(uniformSQLParser.TAN, 0); }
		public TerminalNode LCASE() { return getToken(uniformSQLParser.LCASE, 0); }
		public TerminalNode LOWER() { return getToken(uniformSQLParser.LOWER, 0); }
		public TerminalNode LTRIM() { return getToken(uniformSQLParser.LTRIM, 0); }
		public TerminalNode RTRIM() { return getToken(uniformSQLParser.RTRIM, 0); }
		public TerminalNode CONCAT() { return getToken(uniformSQLParser.CONCAT, 0); }
		public TerminalNode SUBSTR() { return getToken(uniformSQLParser.SUBSTR, 0); }
		public TerminalNode TRIM() { return getToken(uniformSQLParser.TRIM, 0); }
		public TerminalNode UCASE() { return getToken(uniformSQLParser.UCASE, 0); }
		public TerminalNode UPPER() { return getToken(uniformSQLParser.UPPER, 0); }
		public TerminalNode INTERVAL() { return getToken(uniformSQLParser.INTERVAL, 0); }
		public TerminalNode TO_DATE() { return getToken(uniformSQLParser.TO_DATE, 0); }
		public TerminalNode DAY() { return getToken(uniformSQLParser.DAY, 0); }
		public TerminalNode HOUR() { return getToken(uniformSQLParser.HOUR, 0); }
		public TerminalNode MINUTE() { return getToken(uniformSQLParser.MINUTE, 0); }
		public TerminalNode MONTH() { return getToken(uniformSQLParser.MONTH, 0); }
		public TerminalNode SECOND() { return getToken(uniformSQLParser.SECOND, 0); }
		public TerminalNode FROM_UNIXTIME() { return getToken(uniformSQLParser.FROM_UNIXTIME, 0); }
		public TerminalNode YEAR() { return getToken(uniformSQLParser.YEAR, 0); }
		public TerminalNode DATE_ADD() { return getToken(uniformSQLParser.DATE_ADD, 0); }
		public TerminalNode DATE_SUB() { return getToken(uniformSQLParser.DATE_SUB, 0); }
		public TerminalNode COLLATE() { return getToken(uniformSQLParser.COLLATE, 0); }
		public TerminalNode AVG() { return getToken(uniformSQLParser.AVG, 0); }
		public TerminalNode COUNT() { return getToken(uniformSQLParser.COUNT, 0); }
		public TerminalNode MAX() { return getToken(uniformSQLParser.MAX, 0); }
		public TerminalNode MIN() { return getToken(uniformSQLParser.MIN, 0); }
		public TerminalNode SUM() { return getToken(uniformSQLParser.SUM, 0); }
		public TerminalNode COALESCE() { return getToken(uniformSQLParser.COALESCE, 0); }
		public TerminalNode DUPLICATE() { return getToken(uniformSQLParser.DUPLICATE, 0); }
		public TerminalNode SERVER() { return getToken(uniformSQLParser.SERVER, 0); }
		public TerminalNode ALIASES() { return getToken(uniformSQLParser.ALIASES, 0); }
		public TerminalNode ALIAS() { return getToken(uniformSQLParser.ALIAS, 0); }
		public TerminalNode VALUES() { return getToken(uniformSQLParser.VALUES, 0); }
		public TerminalNode VALUE() { return getToken(uniformSQLParser.VALUE, 0); }
		public TerminalNode LOW_PRIORITY() { return getToken(uniformSQLParser.LOW_PRIORITY, 0); }
		public TerminalNode HIGH_PRIORITY() { return getToken(uniformSQLParser.HIGH_PRIORITY, 0); }
		public TerminalNode HASH() { return getToken(uniformSQLParser.HASH, 0); }
		public TerminalNode REFERENCES() { return getToken(uniformSQLParser.REFERENCES, 0); }
		public TerminalNode TO_CHAR() { return getToken(uniformSQLParser.TO_CHAR, 0); }
		public TerminalNode DATE_FORMAT() { return getToken(uniformSQLParser.DATE_FORMAT, 0); }
		public TerminalNode SIGNED() { return getToken(uniformSQLParser.SIGNED, 0); }
		public TerminalNode INTEGER() { return getToken(uniformSQLParser.INTEGER, 0); }
		public TerminalNode LENGTH() { return getToken(uniformSQLParser.LENGTH, 0); }
		public TerminalNode REVERSE() { return getToken(uniformSQLParser.REVERSE, 0); }
		public TerminalNode IFNULL() { return getToken(uniformSQLParser.IFNULL, 0); }
		public TerminalNode DIVIDE() { return getToken(uniformSQLParser.DIVIDE, 0); }
		public TerminalNode MOD() { return getToken(uniformSQLParser.MOD, 0); }
		public TerminalNode OR() { return getToken(uniformSQLParser.OR, 0); }
		public TerminalNode AND() { return getToken(uniformSQLParser.AND, 0); }
		public TerminalNode XOR() { return getToken(uniformSQLParser.XOR, 0); }
		public TerminalNode ARROW() { return getToken(uniformSQLParser.ARROW, 0); }
		public TerminalNode EQ() { return getToken(uniformSQLParser.EQ, 0); }
		public TerminalNode NOT_EQ() { return getToken(uniformSQLParser.NOT_EQ, 0); }
		public TerminalNode LET() { return getToken(uniformSQLParser.LET, 0); }
		public TerminalNode GET() { return getToken(uniformSQLParser.GET, 0); }
		public TerminalNode SET_VAR() { return getToken(uniformSQLParser.SET_VAR, 0); }
		public TerminalNode SHIFT_LEFT() { return getToken(uniformSQLParser.SHIFT_LEFT, 0); }
		public TerminalNode SHIFT_RIGHT() { return getToken(uniformSQLParser.SHIFT_RIGHT, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitKeyword(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << ALL) | (1L << NOT) | (1L << LIKE) | (1L << IF) | (1L << EXISTS) | (1L << ASC) | (1L << DESC) | (1L << ORDER) | (1L << GROUP) | (1L << BY) | (1L << HAVING) | (1L << WHERE) | (1L << FROM) | (1L << AS) | (1L << SELECT) | (1L << DISTINCT) | (1L << INSERT) | (1L << OVERWRITE) | (1L << OUTER) | (1L << UNIQUEJOIN) | (1L << PRESERVE) | (1L << JOIN) | (1L << LEFT) | (1L << RIGHT) | (1L << FULL) | (1L << ON) | (1L << PARTITION) | (1L << PARTITIONS) | (1L << TABLE) | (1L << TABLES) | (1L << COLUMNS) | (1L << INDEX) | (1L << INDEXES) | (1L << REBUILD) | (1L << FUNCTIONS) | (1L << SHOW) | (1L << MSCK) | (1L << REPAIR) | (1L << DIRECTORY) | (1L << LOCAL) | (1L << TRANSFORM) | (1L << USING) | (1L << CLUSTER) | (1L << DISTRIBUTE) | (1L << SORT) | (1L << UNION) | (1L << LOAD) | (1L << EXPORT) | (1L << IMPORT) | (1L << DATA) | (1L << INPATH) | (1L << IS) | (1L << NULL) | (1L << CREATE) | (1L << EXTERNAL) | (1L << ALTER) | (1L << CHANGE) | (1L << COLUMN) | (1L << FIRST) | (1L << AFTER) | (1L << DESCRIBE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DROP - 64)) | (1L << (RENAME - 64)) | (1L << (IGNORE - 64)) | (1L << (PROTECTION - 64)) | (1L << (TO - 64)) | (1L << (COMMENT - 64)) | (1L << (BOOLEAN - 64)) | (1L << (TINYINT - 64)) | (1L << (SMALLINT - 64)) | (1L << (INT - 64)) | (1L << (BIGINT - 64)) | (1L << (FLOAT - 64)) | (1L << (DOUBLE - 64)) | (1L << (DATE - 64)) | (1L << (DATETIME - 64)) | (1L << (TIMESTAMP - 64)) | (1L << (DECIMAL - 64)) | (1L << (STRING - 64)) | (1L << (VARCHAR - 64)) | (1L << (ARRAY - 64)) | (1L << (STRUCT - 64)) | (1L << (MAP - 64)) | (1L << (UNIONTYPE - 64)) | (1L << (REDUCE - 64)) | (1L << (PARTITIONED - 64)) | (1L << (CLUSTERED - 64)) | (1L << (SORTED - 64)) | (1L << (INTO - 64)) | (1L << (BUCKETS - 64)) | (1L << (ROW - 64)) | (1L << (ROWS - 64)) | (1L << (FORMAT - 64)) | (1L << (DELIMITED - 64)) | (1L << (FIELDS - 64)) | (1L << (TERMINATED - 64)) | (1L << (ESCAPED - 64)) | (1L << (COLLECTION - 64)) | (1L << (ITEMS - 64)) | (1L << (KEYS - 64)) | (1L << (KEY - 64)) | (1L << (LINES - 64)) | (1L << (STORED - 64)) | (1L << (FILEFORMAT - 64)) | (1L << (SEQUENCEFILE - 64)) | (1L << (TEXTFILE - 64)) | (1L << (RCFILE - 64)) | (1L << (ORCFILE - 64)) | (1L << (INPUTFORMAT - 64)) | (1L << (OUTPUTFORMAT - 64)) | (1L << (INPUTDRIVER - 64)) | (1L << (OUTPUTDRIVER - 64)) | (1L << (OFFLINE - 64)) | (1L << (ENABLE - 64)) | (1L << (DEFAULT - 64)) | (1L << (DISABLE - 64)) | (1L << (READONLY - 64)) | (1L << (LOCATION - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (BUCKET - 64)) | (1L << (OUT - 64)) | (1L << (OF - 64)) | (1L << (PERCENT - 64)) | (1L << (CAST - 64)) | (1L << (ADD - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (REPLACE - 128)) | (1L << (RLIKE - 128)) | (1L << (REGEXP - 128)) | (1L << (TEMPORARY - 128)) | (1L << (FUNCTION - 128)) | (1L << (MACRO - 128)) | (1L << (EXPLAIN - 128)) | (1L << (EXTENDED - 128)) | (1L << (FORMATTED - 128)) | (1L << (PRETTY - 128)) | (1L << (DEPENDENCY - 128)) | (1L << (LOGICAL - 128)) | (1L << (SERDE - 128)) | (1L << (WITH - 128)) | (1L << (DEFERRED - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (DBPROPERTIES - 128)) | (1L << (LIMIT - 128)) | (1L << (SET - 128)) | (1L << (UNSET - 128)) | (1L << (TBLPROPERTIES - 128)) | (1L << (IDXPROPERTIES - 128)) | (1L << (CASCADED - 128)) | (1L << (CASE - 128)) | (1L << (WHEN - 128)) | (1L << (THEN - 128)) | (1L << (ELSE - 128)) | (1L << (END - 128)) | (1L << (MAPJOIN - 128)) | (1L << (STREAMTABLE - 128)) | (1L << (CLUSTERSTATUS - 128)) | (1L << (UTC - 128)) | (1L << (LONG - 128)) | (1L << (DELETE - 128)) | (1L << (FETCH - 128)) | (1L << (INTERSECT - 128)) | (1L << (VIEW - 128)) | (1L << (IN - 128)) | (1L << (DATABASE - 128)) | (1L << (DATABASES - 128)) | (1L << (MATERIALIZED - 128)) | (1L << (SCHEMA - 128)) | (1L << (SCHEMAS - 128)) | (1L << (GRANT - 128)) | (1L << (REVOKE - 128)) | (1L << (SSL - 128)) | (1L << (UNDO - 128)) | (1L << (LOCK - 128)) | (1L << (LOCKS - 128)) | (1L << (UNLOCK - 128)) | (1L << (SHARED - 128)) | (1L << (EXCLUSIVE - 128)) | (1L << (PROCEDURE - 128)) | (1L << (UNSIGNED - 128)) | (1L << (WHILE - 128)) | (1L << (READ - 128)) | (1L << (READS - 128)) | (1L << (PURGE - 128)) | (1L << (RANGE - 128)) | (1L << (ANALYZE - 128)) | (1L << (BEFORE - 128)) | (1L << (BETWEEN - 128)) | (1L << (BOTH - 128)) | (1L << (BINARY - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (CROSS - 192)) | (1L << (CONTINUE - 192)) | (1L << (CURSOR - 192)) | (1L << (TRIGGER - 192)) | (1L << (RECORDREADER - 192)) | (1L << (RECORDWRITER - 192)) | (1L << (LATERAL - 192)) | (1L << (TOUCH - 192)) | (1L << (ARCHIVE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (COMPUTE - 192)) | (1L << (STATISTICS - 192)) | (1L << (USE - 192)) | (1L << (OPTION - 192)) | (1L << (CONCATENATE - 192)) | (1L << (UPDATE - 192)) | (1L << (RESTRICT - 192)) | (1L << (CASCADE - 192)) | (1L << (SKEWED - 192)) | (1L << (ROLLUP - 192)) | (1L << (CUBE - 192)) | (1L << (DIRECTORIES - 192)) | (1L << (FOR - 192)) | (1L << (WINDOW - 192)) | (1L << (UNBOUNDED - 192)) | (1L << (PRECEDING - 192)) | (1L << (FOLLOWING - 192)) | (1L << (CURRENT - 192)) | (1L << (LESS - 192)) | (1L << (MORE - 192)) | (1L << (OVER - 192)) | (1L << (GROUPING - 192)) | (1L << (SETS - 192)) | (1L << (TRUNCATE - 192)) | (1L << (NOSCAN - 192)) | (1L << (PARTIALSCAN - 192)) | (1L << (USER - 192)) | (1L << (ROLE - 192)) | (1L << (INNER - 192)) | (1L << (EXCHANGE - 192)) | (1L << (IDENTIFIED - 192)) | (1L << (CHAR - 192)) | (1L << (ABS - 192)) | (1L << (ACOS - 192)) | (1L << (ASIN - 192)) | (1L << (ATAN - 192)) | (1L << (CEIL - 192)) | (1L << (COS - 192)) | (1L << (COT - 192)) | (1L << (EXP - 192)) | (1L << (FLOOR - 192)) | (1L << (LN - 192)) | (1L << (POW - 192)) | (1L << (RAND - 192)) | (1L << (ROUND - 192)) | (1L << (SIN - 192)) | (1L << (SQRT - 192)) | (1L << (TAN - 192)) | (1L << (LCASE - 192)) | (1L << (LOWER - 192)) | (1L << (LTRIM - 192)) | (1L << (RTRIM - 192)) | (1L << (CONCAT - 192)) | (1L << (SUBSTR - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (TRIM - 256)) | (1L << (UCASE - 256)) | (1L << (UPPER - 256)) | (1L << (INTERVAL - 256)) | (1L << (TO_DATE - 256)) | (1L << (DAY - 256)) | (1L << (HOUR - 256)) | (1L << (MINUTE - 256)) | (1L << (MONTH - 256)) | (1L << (SECOND - 256)) | (1L << (FROM_UNIXTIME - 256)) | (1L << (YEAR - 256)) | (1L << (DATE_ADD - 256)) | (1L << (DATE_SUB - 256)) | (1L << (COLLATE - 256)) | (1L << (AVG - 256)) | (1L << (COUNT - 256)) | (1L << (MAX - 256)) | (1L << (MIN - 256)) | (1L << (SUM - 256)) | (1L << (COALESCE - 256)) | (1L << (DUPLICATE - 256)) | (1L << (SERVER - 256)) | (1L << (ALIASES - 256)) | (1L << (ALIAS - 256)) | (1L << (VALUES - 256)) | (1L << (VALUE - 256)) | (1L << (LOW_PRIORITY - 256)) | (1L << (HIGH_PRIORITY - 256)) | (1L << (HASH - 256)) | (1L << (REFERENCES - 256)) | (1L << (TO_CHAR - 256)) | (1L << (DATE_FORMAT - 256)) | (1L << (SIGNED - 256)) | (1L << (INTEGER - 256)) | (1L << (LENGTH - 256)) | (1L << (REVERSE - 256)) | (1L << (IFNULL - 256)) | (1L << (DIVIDE - 256)) | (1L << (MOD - 256)) | (1L << (OR - 256)) | (1L << (AND - 256)) | (1L << (XOR - 256)) | (1L << (ARROW - 256)) | (1L << (EQ - 256)) | (1L << (NOT_EQ - 256)) | (1L << (LET - 256)) | (1L << (GET - 256)) | (1L << (SET_VAR - 256)) | (1L << (SHIFT_LEFT - 256)) | (1L << (SHIFT_RIGHT - 256)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delimited_statementContext extends ParserRuleContext {
		public TerminalNode Regex_Escaped_Unicode() { return getToken(uniformSQLParser.Regex_Escaped_Unicode, 0); }
		public Delimited_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delimited_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterDelimited_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitDelimited_statement(this);
		}
	}

	public final Delimited_statementContext delimited_statement() throws RecognitionException {
		Delimited_statementContext _localctx = new Delimited_statementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_delimited_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(Regex_Escaped_Unicode);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Integer_typesContext extends ParserRuleContext {
		public TerminalNode TINYINT() { return getToken(uniformSQLParser.TINYINT, 0); }
		public TerminalNode SMALLINT() { return getToken(uniformSQLParser.SMALLINT, 0); }
		public TerminalNode INT() { return getToken(uniformSQLParser.INT, 0); }
		public TerminalNode BIGINT() { return getToken(uniformSQLParser.BIGINT, 0); }
		public TerminalNode BOOLEAN() { return getToken(uniformSQLParser.BOOLEAN, 0); }
		public TerminalNode FLOAT() { return getToken(uniformSQLParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(uniformSQLParser.DOUBLE, 0); }
		public TerminalNode DATE() { return getToken(uniformSQLParser.DATE, 0); }
		public TerminalNode TIMESTAMP() { return getToken(uniformSQLParser.TIMESTAMP, 0); }
		public TerminalNode VARCHAR() { return getToken(uniformSQLParser.VARCHAR, 0); }
		public TerminalNode BINARY() { return getToken(uniformSQLParser.BINARY, 0); }
		public TerminalNode DECIMAL() { return getToken(uniformSQLParser.DECIMAL, 0); }
		public Integer_typesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterInteger_types(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitInteger_types(this);
		}
	}

	public final Integer_typesContext integer_types() throws RecognitionException {
		Integer_typesContext _localctx = new Integer_typesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_integer_types);
		try {
			setState(317);
			switch (_input.LA(1)) {
			case EOF:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case TINYINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				match(TINYINT);
				}
				break;
			case SMALLINT:
				enterOuterAlt(_localctx, 3);
				{
				setState(306);
				match(SMALLINT);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 4);
				{
				setState(307);
				match(INT);
				}
				break;
			case BIGINT:
				enterOuterAlt(_localctx, 5);
				{
				setState(308);
				match(BIGINT);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 6);
				{
				setState(309);
				match(BOOLEAN);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 7);
				{
				setState(310);
				match(FLOAT);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 8);
				{
				setState(311);
				match(DOUBLE);
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 9);
				{
				setState(312);
				match(DATE);
				}
				break;
			case TIMESTAMP:
				enterOuterAlt(_localctx, 10);
				{
				setState(313);
				match(TIMESTAMP);
				}
				break;
			case VARCHAR:
				enterOuterAlt(_localctx, 11);
				{
				setState(314);
				match(VARCHAR);
				}
				break;
			case BINARY:
				enterOuterAlt(_localctx, 12);
				{
				setState(315);
				match(BINARY);
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 13);
				{
				setState(316);
				match(DECIMAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Relational_opContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(uniformSQLParser.EQ, 0); }
		public TerminalNode LTH() { return getToken(uniformSQLParser.LTH, 0); }
		public TerminalNode GTH() { return getToken(uniformSQLParser.GTH, 0); }
		public TerminalNode NOT_EQ() { return getToken(uniformSQLParser.NOT_EQ, 0); }
		public TerminalNode LET() { return getToken(uniformSQLParser.LET, 0); }
		public TerminalNode GET() { return getToken(uniformSQLParser.GET, 0); }
		public Relational_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterRelational_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitRelational_op(this);
		}
	}

	public final Relational_opContext relational_op() throws RecognitionException {
		Relational_opContext _localctx = new Relational_opContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_relational_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			_la = _input.LA(1);
			if ( !(((((_la - 300)) & ~0x3f) == 0 && ((1L << (_la - 300)) & ((1L << (EQ - 300)) | (1L << (NOT_EQ - 300)) | (1L << (LET - 300)) | (1L << (GET - 300)) | (1L << (GTH - 300)) | (1L << (LTH - 300)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cast_data_typeContext extends ParserRuleContext {
		public TerminalNode BINARY() { return getToken(uniformSQLParser.BINARY, 0); }
		public List<TerminalNode> INTEGER_NUM() { return getTokens(uniformSQLParser.INTEGER_NUM); }
		public TerminalNode INTEGER_NUM(int i) {
			return getToken(uniformSQLParser.INTEGER_NUM, i);
		}
		public TerminalNode CHAR() { return getToken(uniformSQLParser.CHAR, 0); }
		public TerminalNode DATE() { return getToken(uniformSQLParser.DATE, 0); }
		public TerminalNode DATETIME() { return getToken(uniformSQLParser.DATETIME, 0); }
		public TerminalNode DECIMAL() { return getToken(uniformSQLParser.DECIMAL, 0); }
		public TerminalNode LPAREN() { return getToken(uniformSQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(uniformSQLParser.RPAREN, 0); }
		public TerminalNode COMMA() { return getToken(uniformSQLParser.COMMA, 0); }
		public TerminalNode SIGNED() { return getToken(uniformSQLParser.SIGNED, 0); }
		public TerminalNode INTEGER() { return getToken(uniformSQLParser.INTEGER, 0); }
		public TerminalNode UNSIGNED() { return getToken(uniformSQLParser.UNSIGNED, 0); }
		public Cast_data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast_data_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterCast_data_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitCast_data_type(this);
		}
	}

	public final Cast_data_typeContext cast_data_type() throws RecognitionException {
		Cast_data_typeContext _localctx = new Cast_data_typeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cast_data_type);
		int _la;
		try {
			setState(349);
			switch (_input.LA(1)) {
			case BINARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				match(BINARY);
				setState(323);
				_la = _input.LA(1);
				if (_la==INTEGER_NUM) {
					{
					setState(322);
					match(INTEGER_NUM);
					}
				}

				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				match(CHAR);
				setState(327);
				_la = _input.LA(1);
				if (_la==INTEGER_NUM) {
					{
					setState(326);
					match(INTEGER_NUM);
					}
				}

				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(329);
				match(DATE);
				}
				break;
			case DATETIME:
				enterOuterAlt(_localctx, 4);
				{
				setState(330);
				match(DATETIME);
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(331);
				match(DECIMAL);
				setState(339);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(332);
					match(LPAREN);
					setState(333);
					match(INTEGER_NUM);
					setState(336);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(334);
						match(COMMA);
						setState(335);
						match(INTEGER_NUM);
						}
					}

					setState(338);
					match(RPAREN);
					}
				}

				}
				break;
			case SIGNED:
				enterOuterAlt(_localctx, 6);
				{
				setState(341);
				match(SIGNED);
				setState(343);
				_la = _input.LA(1);
				if (_la==INTEGER) {
					{
					setState(342);
					match(INTEGER);
					}
				}

				}
				break;
			case UNSIGNED:
				enterOuterAlt(_localctx, 7);
				{
				setState(345);
				match(UNSIGNED);
				setState(347);
				_la = _input.LA(1);
				if (_la==INTEGER) {
					{
					setState(346);
					match(INTEGER);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interval_unitContext extends ParserRuleContext {
		public TerminalNode SECOND() { return getToken(uniformSQLParser.SECOND, 0); }
		public TerminalNode MINUTE() { return getToken(uniformSQLParser.MINUTE, 0); }
		public TerminalNode HOUR() { return getToken(uniformSQLParser.HOUR, 0); }
		public TerminalNode DAY() { return getToken(uniformSQLParser.DAY, 0); }
		public TerminalNode MONTH() { return getToken(uniformSQLParser.MONTH, 0); }
		public TerminalNode YEAR() { return getToken(uniformSQLParser.YEAR, 0); }
		public Interval_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterInterval_unit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitInterval_unit(this);
		}
	}

	public final Interval_unitContext interval_unit() throws RecognitionException {
		Interval_unitContext _localctx = new Interval_unitContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_interval_unit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			_la = _input.LA(1);
			if ( !(((((_la - 261)) & ~0x3f) == 0 && ((1L << (_la - 261)) & ((1L << (DAY - 261)) | (1L << (HOUR - 261)) | (1L << (MINUTE - 261)) | (1L << (MONTH - 261)) | (1L << (SECOND - 261)) | (1L << (YEAR - 261)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_literalContext extends ParserRuleContext {
		public TerminalNode TEXT_STRING() { return getToken(uniformSQLParser.TEXT_STRING, 0); }
		public String_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterString_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitString_literal(this);
		}
	}

	public final String_literalContext string_literal() throws RecognitionException {
		String_literalContext _localctx = new String_literalContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_string_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(TEXT_STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Number_literalContext extends ParserRuleContext {
		public TerminalNode INTEGER_NUM() { return getToken(uniformSQLParser.INTEGER_NUM, 0); }
		public TerminalNode REAL_NUMBER() { return getToken(uniformSQLParser.REAL_NUMBER, 0); }
		public TerminalNode PLUS() { return getToken(uniformSQLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(uniformSQLParser.MINUS, 0); }
		public Number_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterNumber_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitNumber_literal(this);
		}
	}

	public final Number_literalContext number_literal() throws RecognitionException {
		Number_literalContext _localctx = new Number_literalContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_number_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(355);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(358);
			_la = _input.LA(1);
			if ( !(_la==INTEGER_NUM || _la==REAL_NUMBER) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Hex_literalContext extends ParserRuleContext {
		public TerminalNode HEX_DIGIT() { return getToken(uniformSQLParser.HEX_DIGIT, 0); }
		public Hex_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hex_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterHex_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitHex_literal(this);
		}
	}

	public final Hex_literalContext hex_literal() throws RecognitionException {
		Hex_literalContext _localctx = new Hex_literalContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_hex_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(HEX_DIGIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Boolean_literalContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(uniformSQLParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(uniformSQLParser.FALSE, 0); }
		public Boolean_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterBoolean_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitBoolean_literal(this);
		}
	}

	public final Boolean_literalContext boolean_literal() throws RecognitionException {
		Boolean_literalContext _localctx = new Boolean_literalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_boolean_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bit_literalContext extends ParserRuleContext {
		public TerminalNode BIT_NUM() { return getToken(uniformSQLParser.BIT_NUM, 0); }
		public Bit_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterBit_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitBit_literal(this);
		}
	}

	public final Bit_literalContext bit_literal() throws RecognitionException {
		Bit_literalContext _localctx = new Bit_literalContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_bit_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(BIT_NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Literal_valueContext extends ParserRuleContext {
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public Number_literalContext number_literal() {
			return getRuleContext(Number_literalContext.class,0);
		}
		public Hex_literalContext hex_literal() {
			return getRuleContext(Hex_literalContext.class,0);
		}
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public Bit_literalContext bit_literal() {
			return getRuleContext(Bit_literalContext.class,0);
		}
		public TerminalNode NULL() { return getToken(uniformSQLParser.NULL, 0); }
		public Literal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterLiteral_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitLiteral_value(this);
		}
	}

	public final Literal_valueContext literal_value() throws RecognitionException {
		Literal_valueContext _localctx = new Literal_valueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_literal_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			switch (_input.LA(1)) {
			case TEXT_STRING:
				{
				setState(366);
				string_literal();
				}
				break;
			case PLUS:
			case MINUS:
			case INTEGER_NUM:
			case REAL_NUMBER:
				{
				setState(367);
				number_literal();
				}
				break;
			case HEX_DIGIT:
				{
				setState(368);
				hex_literal();
				}
				break;
			case TRUE:
			case FALSE:
				{
				setState(369);
				boolean_literal();
				}
				break;
			case BIT_NUM:
				{
				setState(370);
				bit_literal();
				}
				break;
			case NULL:
				{
				setState(371);
				match(NULL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionListContext extends ParserRuleContext {
		public Number_functionsContext number_functions() {
			return getRuleContext(Number_functionsContext.class,0);
		}
		public Char_functionsContext char_functions() {
			return getRuleContext(Char_functionsContext.class,0);
		}
		public Time_functionsContext time_functions() {
			return getRuleContext(Time_functionsContext.class,0);
		}
		public Other_functionsContext other_functions() {
			return getRuleContext(Other_functionsContext.class,0);
		}
		public FunctionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterFunctionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitFunctionList(this);
		}
	}

	public final FunctionListContext functionList() throws RecognitionException {
		FunctionListContext _localctx = new FunctionListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functionList);
		try {
			setState(378);
			switch (_input.LA(1)) {
			case ABS:
			case ACOS:
			case ASIN:
			case ATAN:
			case CEIL:
			case COS:
			case COT:
			case EXP:
			case FLOOR:
			case LN:
			case POW:
			case RAND:
			case ROUND:
			case SIN:
			case SQRT:
			case TAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(374);
				number_functions();
				}
				break;
			case LCASE:
			case LOWER:
			case LTRIM:
			case RTRIM:
			case CONCAT:
			case SUBSTR:
			case TRIM:
			case UCASE:
			case UPPER:
			case TO_CHAR:
			case LENGTH:
			case REVERSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(375);
				char_functions();
				}
				break;
			case TO_DATE:
			case DAY:
			case HOUR:
			case MINUTE:
			case MONTH:
			case SECOND:
			case FROM_UNIXTIME:
			case YEAR:
			case DATE_ADD:
			case DATE_SUB:
			case DATE_FORMAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(376);
				time_functions();
				}
				break;
			case COALESCE:
			case IFNULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(377);
				other_functions();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Number_functionsContext extends ParserRuleContext {
		public TerminalNode ABS() { return getToken(uniformSQLParser.ABS, 0); }
		public TerminalNode ACOS() { return getToken(uniformSQLParser.ACOS, 0); }
		public TerminalNode ASIN() { return getToken(uniformSQLParser.ASIN, 0); }
		public TerminalNode ATAN() { return getToken(uniformSQLParser.ATAN, 0); }
		public TerminalNode CEIL() { return getToken(uniformSQLParser.CEIL, 0); }
		public TerminalNode COS() { return getToken(uniformSQLParser.COS, 0); }
		public TerminalNode COT() { return getToken(uniformSQLParser.COT, 0); }
		public TerminalNode EXP() { return getToken(uniformSQLParser.EXP, 0); }
		public TerminalNode FLOOR() { return getToken(uniformSQLParser.FLOOR, 0); }
		public TerminalNode LN() { return getToken(uniformSQLParser.LN, 0); }
		public TerminalNode POW() { return getToken(uniformSQLParser.POW, 0); }
		public TerminalNode RAND() { return getToken(uniformSQLParser.RAND, 0); }
		public TerminalNode ROUND() { return getToken(uniformSQLParser.ROUND, 0); }
		public TerminalNode SIN() { return getToken(uniformSQLParser.SIN, 0); }
		public TerminalNode SQRT() { return getToken(uniformSQLParser.SQRT, 0); }
		public TerminalNode TAN() { return getToken(uniformSQLParser.TAN, 0); }
		public Number_functionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number_functions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterNumber_functions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitNumber_functions(this);
		}
	}

	public final Number_functionsContext number_functions() throws RecognitionException {
		Number_functionsContext _localctx = new Number_functionsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_number_functions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			_la = _input.LA(1);
			if ( !(((((_la - 234)) & ~0x3f) == 0 && ((1L << (_la - 234)) & ((1L << (ABS - 234)) | (1L << (ACOS - 234)) | (1L << (ASIN - 234)) | (1L << (ATAN - 234)) | (1L << (CEIL - 234)) | (1L << (COS - 234)) | (1L << (COT - 234)) | (1L << (EXP - 234)) | (1L << (FLOOR - 234)) | (1L << (LN - 234)) | (1L << (POW - 234)) | (1L << (RAND - 234)) | (1L << (ROUND - 234)) | (1L << (SIN - 234)) | (1L << (SQRT - 234)) | (1L << (TAN - 234)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Char_functionsContext extends ParserRuleContext {
		public TerminalNode LCASE() { return getToken(uniformSQLParser.LCASE, 0); }
		public TerminalNode LOWER() { return getToken(uniformSQLParser.LOWER, 0); }
		public TerminalNode LTRIM() { return getToken(uniformSQLParser.LTRIM, 0); }
		public TerminalNode RTRIM() { return getToken(uniformSQLParser.RTRIM, 0); }
		public TerminalNode CONCAT() { return getToken(uniformSQLParser.CONCAT, 0); }
		public TerminalNode SUBSTR() { return getToken(uniformSQLParser.SUBSTR, 0); }
		public TerminalNode TRIM() { return getToken(uniformSQLParser.TRIM, 0); }
		public TerminalNode UCASE() { return getToken(uniformSQLParser.UCASE, 0); }
		public TerminalNode UPPER() { return getToken(uniformSQLParser.UPPER, 0); }
		public TerminalNode TO_CHAR() { return getToken(uniformSQLParser.TO_CHAR, 0); }
		public TerminalNode LENGTH() { return getToken(uniformSQLParser.LENGTH, 0); }
		public TerminalNode REVERSE() { return getToken(uniformSQLParser.REVERSE, 0); }
		public Char_functionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_char_functions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterChar_functions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitChar_functions(this);
		}
	}

	public final Char_functionsContext char_functions() throws RecognitionException {
		Char_functionsContext _localctx = new Char_functionsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_char_functions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			_la = _input.LA(1);
			if ( !(((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (LCASE - 250)) | (1L << (LOWER - 250)) | (1L << (LTRIM - 250)) | (1L << (RTRIM - 250)) | (1L << (CONCAT - 250)) | (1L << (SUBSTR - 250)) | (1L << (TRIM - 250)) | (1L << (UCASE - 250)) | (1L << (UPPER - 250)) | (1L << (TO_CHAR - 250)) | (1L << (LENGTH - 250)) | (1L << (REVERSE - 250)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Time_functionsContext extends ParserRuleContext {
		public TerminalNode TO_DATE() { return getToken(uniformSQLParser.TO_DATE, 0); }
		public TerminalNode DAY() { return getToken(uniformSQLParser.DAY, 0); }
		public TerminalNode HOUR() { return getToken(uniformSQLParser.HOUR, 0); }
		public TerminalNode MINUTE() { return getToken(uniformSQLParser.MINUTE, 0); }
		public TerminalNode MONTH() { return getToken(uniformSQLParser.MONTH, 0); }
		public TerminalNode SECOND() { return getToken(uniformSQLParser.SECOND, 0); }
		public TerminalNode FROM_UNIXTIME() { return getToken(uniformSQLParser.FROM_UNIXTIME, 0); }
		public TerminalNode YEAR() { return getToken(uniformSQLParser.YEAR, 0); }
		public TerminalNode DATE_ADD() { return getToken(uniformSQLParser.DATE_ADD, 0); }
		public TerminalNode DATE_SUB() { return getToken(uniformSQLParser.DATE_SUB, 0); }
		public TerminalNode DATE_FORMAT() { return getToken(uniformSQLParser.DATE_FORMAT, 0); }
		public Time_functionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time_functions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterTime_functions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitTime_functions(this);
		}
	}

	public final Time_functionsContext time_functions() throws RecognitionException {
		Time_functionsContext _localctx = new Time_functionsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_time_functions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			_la = _input.LA(1);
			if ( !(((((_la - 260)) & ~0x3f) == 0 && ((1L << (_la - 260)) & ((1L << (TO_DATE - 260)) | (1L << (DAY - 260)) | (1L << (HOUR - 260)) | (1L << (MINUTE - 260)) | (1L << (MONTH - 260)) | (1L << (SECOND - 260)) | (1L << (FROM_UNIXTIME - 260)) | (1L << (YEAR - 260)) | (1L << (DATE_ADD - 260)) | (1L << (DATE_SUB - 260)) | (1L << (DATE_FORMAT - 260)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Other_functionsContext extends ParserRuleContext {
		public TerminalNode COALESCE() { return getToken(uniformSQLParser.COALESCE, 0); }
		public TerminalNode IFNULL() { return getToken(uniformSQLParser.IFNULL, 0); }
		public Other_functionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_other_functions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterOther_functions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitOther_functions(this);
		}
	}

	public final Other_functionsContext other_functions() throws RecognitionException {
		Other_functionsContext _localctx = new Other_functionsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_other_functions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			_la = _input.LA(1);
			if ( !(_la==COALESCE || _la==IFNULL) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Group_functionsContext extends ParserRuleContext {
		public TerminalNode AVG() { return getToken(uniformSQLParser.AVG, 0); }
		public TerminalNode COUNT() { return getToken(uniformSQLParser.COUNT, 0); }
		public TerminalNode MAX() { return getToken(uniformSQLParser.MAX, 0); }
		public TerminalNode MIN() { return getToken(uniformSQLParser.MIN, 0); }
		public TerminalNode SUM() { return getToken(uniformSQLParser.SUM, 0); }
		public Group_functionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_functions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterGroup_functions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitGroup_functions(this);
		}
	}

	public final Group_functionsContext group_functions() throws RecognitionException {
		Group_functionsContext _localctx = new Group_functionsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_group_functions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			_la = _input.LA(1);
			if ( !(((((_la - 271)) & ~0x3f) == 0 && ((1L << (_la - 271)) & ((1L << (AVG - 271)) | (1L << (COUNT - 271)) | (1L << (MAX - 271)) | (1L << (MIN - 271)) | (1L << (SUM - 271)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Schema_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Schema_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schema_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterSchema_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitSchema_name(this);
		}
	}

	public final Schema_nameContext schema_name() throws RecognitionException {
		Schema_nameContext _localctx = new Schema_nameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_schema_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Database_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Database_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterDatabase_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitDatabase_name(this);
		}
	}

	public final Database_nameContext database_name() throws RecognitionException {
		Database_nameContext _localctx = new Database_nameContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitTable_name(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Engine_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Engine_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_engine_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterEngine_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitEngine_name(this);
		}
	}

	public final Engine_nameContext engine_name() throws RecognitionException {
		Engine_nameContext _localctx = new Engine_nameContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_engine_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitColumn_name(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class View_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public View_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_view_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterView_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitView_name(this);
		}
	}

	public final View_nameContext view_name() throws RecognitionException {
		View_nameContext _localctx = new View_nameContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_view_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parser_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Parser_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parser_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterParser_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitParser_name(this);
		}
	}

	public final Parser_nameContext parser_name() throws RecognitionException {
		Parser_nameContext _localctx = new Parser_nameContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_parser_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterIndex_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitIndex_name(this);
		}
	}

	public final Index_nameContext index_name() throws RecognitionException {
		Index_nameContext _localctx = new Index_nameContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Partition_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Partition_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partition_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterPartition_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitPartition_name(this);
		}
	}

	public final Partition_nameContext partition_name() throws RecognitionException {
		Partition_nameContext _localctx = new Partition_nameContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_partition_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Partition_logical_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Partition_logical_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partition_logical_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterPartition_logical_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitPartition_logical_name(this);
		}
	}

	public final Partition_logical_nameContext partition_logical_name() throws RecognitionException {
		Partition_logical_nameContext _localctx = new Partition_logical_nameContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_partition_logical_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constraintbol_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Constraintbol_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintbol_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterConstraintbol_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitConstraintbol_name(this);
		}
	}

	public final Constraintbol_nameContext constraintbol_name() throws RecognitionException {
		Constraintbol_nameContext _localctx = new Constraintbol_nameContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_constraintbol_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Foreign_keybol_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Foreign_keybol_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_keybol_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterForeign_keybol_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitForeign_keybol_name(this);
		}
	}

	public final Foreign_keybol_nameContext foreign_keybol_name() throws RecognitionException {
		Foreign_keybol_nameContext _localctx = new Foreign_keybol_nameContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_foreign_keybol_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Collation_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Collation_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collation_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterCollation_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitCollation_name(this);
		}
	}

	public final Collation_nameContext collation_name() throws RecognitionException {
		Collation_nameContext _localctx = new Collation_nameContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Event_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Event_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterEvent_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitEvent_name(this);
		}
	}

	public final Event_nameContext event_name() throws RecognitionException {
		Event_nameContext _localctx = new Event_nameContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_event_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class User_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public User_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_user_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterUser_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitUser_name(this);
		}
	}

	public final User_nameContext user_name() throws RecognitionException {
		User_nameContext _localctx = new User_nameContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_user_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitFunction_name(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Procedure_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Procedure_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterProcedure_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitProcedure_name(this);
		}
	}

	public final Procedure_nameContext procedure_name() throws RecognitionException {
		Procedure_nameContext _localctx = new Procedure_nameContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_procedure_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Server_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Server_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_server_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterServer_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitServer_name(this);
		}
	}

	public final Server_nameContext server_name() throws RecognitionException {
		Server_nameContext _localctx = new Server_nameContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_server_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Wrapper_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Wrapper_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wrapper_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterWrapper_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitWrapper_name(this);
		}
	}

	public final Wrapper_nameContext wrapper_name() throws RecognitionException {
		Wrapper_nameContext _localctx = new Wrapper_nameContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_wrapper_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AliasContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TerminalNode AS() { return getToken(uniformSQLParser.AS, 0); }
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitAlias(this);
		}
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(428);
				match(AS);
				}
				break;
			}
			setState(431);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PasswordContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public PasswordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_password; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterPassword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitPassword(this);
		}
	}

	public final PasswordContext password() throws RecognitionException {
		PasswordContext _localctx = new PasswordContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_password);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Server_aliasContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Server_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_server_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterServer_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitServer_alias(this);
		}
	}

	public final Server_aliasContext server_alias() throws RecognitionException {
		Server_aliasContext _localctx = new Server_aliasContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_server_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Role_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Role_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_role_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterRole_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitRole_name(this);
		}
	}

	public final Role_nameContext role_name() throws RecognitionException {
		Role_nameContext _localctx = new Role_nameContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_role_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Group_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Group_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterGroup_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitGroup_name(this);
		}
	}

	public final Group_nameContext group_name() throws RecognitionException {
		Group_nameContext _localctx = new Group_nameContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_group_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Principal_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Principal_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_principal_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterPrincipal_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitPrincipal_name(this);
		}
	}

	public final Principal_nameContext principal_name() throws RecognitionException {
		Principal_nameContext _localctx = new Principal_nameContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_principal_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Any_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(uniformSQLParser.ID, 0); }
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public Any_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterAny_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitAny_name(this);
		}
	}

	public final Any_nameContext any_name() throws RecognitionException {
		Any_nameContext _localctx = new Any_nameContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_any_name);
		try {
			setState(446);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(443);
				match(ID);
				}
				break;
			case TRUE:
			case FALSE:
			case ALL:
			case NOT:
			case LIKE:
			case IF:
			case EXISTS:
			case ASC:
			case DESC:
			case ORDER:
			case GROUP:
			case BY:
			case HAVING:
			case WHERE:
			case FROM:
			case AS:
			case SELECT:
			case DISTINCT:
			case INSERT:
			case OVERWRITE:
			case OUTER:
			case UNIQUEJOIN:
			case PRESERVE:
			case JOIN:
			case LEFT:
			case RIGHT:
			case FULL:
			case ON:
			case PARTITION:
			case PARTITIONS:
			case TABLE:
			case TABLES:
			case COLUMNS:
			case INDEX:
			case INDEXES:
			case REBUILD:
			case FUNCTIONS:
			case SHOW:
			case MSCK:
			case REPAIR:
			case DIRECTORY:
			case LOCAL:
			case TRANSFORM:
			case USING:
			case CLUSTER:
			case DISTRIBUTE:
			case SORT:
			case UNION:
			case LOAD:
			case EXPORT:
			case IMPORT:
			case DATA:
			case INPATH:
			case IS:
			case NULL:
			case CREATE:
			case EXTERNAL:
			case ALTER:
			case CHANGE:
			case COLUMN:
			case FIRST:
			case AFTER:
			case DESCRIBE:
			case DROP:
			case RENAME:
			case IGNORE:
			case PROTECTION:
			case TO:
			case COMMENT:
			case BOOLEAN:
			case TINYINT:
			case SMALLINT:
			case INT:
			case BIGINT:
			case FLOAT:
			case DOUBLE:
			case DATE:
			case DATETIME:
			case TIMESTAMP:
			case DECIMAL:
			case STRING:
			case VARCHAR:
			case ARRAY:
			case STRUCT:
			case MAP:
			case UNIONTYPE:
			case REDUCE:
			case PARTITIONED:
			case CLUSTERED:
			case SORTED:
			case INTO:
			case BUCKETS:
			case ROW:
			case ROWS:
			case FORMAT:
			case DELIMITED:
			case FIELDS:
			case TERMINATED:
			case ESCAPED:
			case COLLECTION:
			case ITEMS:
			case KEYS:
			case KEY:
			case LINES:
			case STORED:
			case FILEFORMAT:
			case SEQUENCEFILE:
			case TEXTFILE:
			case RCFILE:
			case ORCFILE:
			case INPUTFORMAT:
			case OUTPUTFORMAT:
			case INPUTDRIVER:
			case OUTPUTDRIVER:
			case OFFLINE:
			case ENABLE:
			case DEFAULT:
			case DISABLE:
			case READONLY:
			case LOCATION:
			case TABLESAMPLE:
			case BUCKET:
			case OUT:
			case OF:
			case PERCENT:
			case CAST:
			case ADD:
			case REPLACE:
			case RLIKE:
			case REGEXP:
			case TEMPORARY:
			case FUNCTION:
			case MACRO:
			case EXPLAIN:
			case EXTENDED:
			case FORMATTED:
			case PRETTY:
			case DEPENDENCY:
			case LOGICAL:
			case SERDE:
			case WITH:
			case DEFERRED:
			case SERDEPROPERTIES:
			case DBPROPERTIES:
			case LIMIT:
			case SET:
			case UNSET:
			case TBLPROPERTIES:
			case IDXPROPERTIES:
			case CASCADED:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case MAPJOIN:
			case STREAMTABLE:
			case CLUSTERSTATUS:
			case UTC:
			case LONG:
			case DELETE:
			case FETCH:
			case INTERSECT:
			case VIEW:
			case IN:
			case DATABASE:
			case DATABASES:
			case MATERIALIZED:
			case SCHEMA:
			case SCHEMAS:
			case GRANT:
			case REVOKE:
			case SSL:
			case UNDO:
			case LOCK:
			case LOCKS:
			case UNLOCK:
			case SHARED:
			case EXCLUSIVE:
			case PROCEDURE:
			case UNSIGNED:
			case WHILE:
			case READ:
			case READS:
			case PURGE:
			case RANGE:
			case ANALYZE:
			case BEFORE:
			case BETWEEN:
			case BOTH:
			case BINARY:
			case CROSS:
			case CONTINUE:
			case CURSOR:
			case TRIGGER:
			case RECORDREADER:
			case RECORDWRITER:
			case LATERAL:
			case TOUCH:
			case ARCHIVE:
			case UNARCHIVE:
			case COMPUTE:
			case STATISTICS:
			case USE:
			case OPTION:
			case CONCATENATE:
			case UPDATE:
			case RESTRICT:
			case CASCADE:
			case SKEWED:
			case ROLLUP:
			case CUBE:
			case DIRECTORIES:
			case FOR:
			case WINDOW:
			case UNBOUNDED:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case LESS:
			case MORE:
			case OVER:
			case GROUPING:
			case SETS:
			case TRUNCATE:
			case NOSCAN:
			case PARTIALSCAN:
			case USER:
			case ROLE:
			case INNER:
			case EXCHANGE:
			case IDENTIFIED:
			case CHAR:
			case ABS:
			case ACOS:
			case ASIN:
			case ATAN:
			case CEIL:
			case COS:
			case COT:
			case EXP:
			case FLOOR:
			case LN:
			case POW:
			case RAND:
			case ROUND:
			case SIN:
			case SQRT:
			case TAN:
			case LCASE:
			case LOWER:
			case LTRIM:
			case RTRIM:
			case CONCAT:
			case SUBSTR:
			case TRIM:
			case UCASE:
			case UPPER:
			case INTERVAL:
			case TO_DATE:
			case DAY:
			case HOUR:
			case MINUTE:
			case MONTH:
			case SECOND:
			case FROM_UNIXTIME:
			case YEAR:
			case DATE_ADD:
			case DATE_SUB:
			case COLLATE:
			case AVG:
			case COUNT:
			case MAX:
			case MIN:
			case SUM:
			case COALESCE:
			case DUPLICATE:
			case SERVER:
			case ALIASES:
			case ALIAS:
			case VALUES:
			case VALUE:
			case LOW_PRIORITY:
			case HIGH_PRIORITY:
			case HASH:
			case REFERENCES:
			case TO_CHAR:
			case DATE_FORMAT:
			case SIGNED:
			case INTEGER:
			case LENGTH:
			case REVERSE:
			case IFNULL:
			case DIVIDE:
			case MOD:
			case OR:
			case AND:
			case XOR:
			case ARROW:
			case EQ:
			case NOT_EQ:
			case LET:
			case GET:
			case SET_VAR:
			case SHIFT_LEFT:
			case SHIFT_RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(444);
				keyword();
				}
				break;
			case TEXT_STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(445);
				string_literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Priv_typeContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(uniformSQLParser.INSERT, 0); }
		public TerminalNode SELECT() { return getToken(uniformSQLParser.SELECT, 0); }
		public TerminalNode UPDATE() { return getToken(uniformSQLParser.UPDATE, 0); }
		public TerminalNode DELETE() { return getToken(uniformSQLParser.DELETE, 0); }
		public TerminalNode ALL() { return getToken(uniformSQLParser.ALL, 0); }
		public Priv_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_priv_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterPriv_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitPriv_type(this);
		}
	}

	public final Priv_typeContext priv_type() throws RecognitionException {
		Priv_typeContext _localctx = new Priv_typeContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_priv_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << SELECT) | (1L << INSERT))) != 0) || _la==DELETE || _la==UPDATE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public List<Exp_factor1Context> exp_factor1() {
			return getRuleContexts(Exp_factor1Context.class);
		}
		public Exp_factor1Context exp_factor1(int i) {
			return getRuleContext(Exp_factor1Context.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(uniformSQLParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(uniformSQLParser.OR, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			exp_factor1();
			setState(455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(451);
				match(OR);
				setState(452);
				exp_factor1();
				}
				}
				setState(457);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp_factor1Context extends ParserRuleContext {
		public List<Exp_factor2Context> exp_factor2() {
			return getRuleContexts(Exp_factor2Context.class);
		}
		public Exp_factor2Context exp_factor2(int i) {
			return getRuleContext(Exp_factor2Context.class,i);
		}
		public List<TerminalNode> XOR() { return getTokens(uniformSQLParser.XOR); }
		public TerminalNode XOR(int i) {
			return getToken(uniformSQLParser.XOR, i);
		}
		public Exp_factor1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_factor1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterExp_factor1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitExp_factor1(this);
		}
	}

	public final Exp_factor1Context exp_factor1() throws RecognitionException {
		Exp_factor1Context _localctx = new Exp_factor1Context(_ctx, getState());
		enterRule(_localctx, 92, RULE_exp_factor1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			exp_factor2();
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==XOR) {
				{
				{
				setState(459);
				match(XOR);
				setState(460);
				exp_factor2();
				}
				}
				setState(465);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp_factor2Context extends ParserRuleContext {
		public List<Exp_factor3Context> exp_factor3() {
			return getRuleContexts(Exp_factor3Context.class);
		}
		public Exp_factor3Context exp_factor3(int i) {
			return getRuleContext(Exp_factor3Context.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(uniformSQLParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(uniformSQLParser.AND, i);
		}
		public Exp_factor2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_factor2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterExp_factor2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitExp_factor2(this);
		}
	}

	public final Exp_factor2Context exp_factor2() throws RecognitionException {
		Exp_factor2Context _localctx = new Exp_factor2Context(_ctx, getState());
		enterRule(_localctx, 94, RULE_exp_factor2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			exp_factor3();
			setState(471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(467);
				match(AND);
				setState(468);
				exp_factor3();
				}
				}
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp_factor3Context extends ParserRuleContext {
		public Exp_factor4Context exp_factor4() {
			return getRuleContext(Exp_factor4Context.class,0);
		}
		public TerminalNode NOT() { return getToken(uniformSQLParser.NOT, 0); }
		public Exp_factor3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_factor3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterExp_factor3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitExp_factor3(this);
		}
	}

	public final Exp_factor3Context exp_factor3() throws RecognitionException {
		Exp_factor3Context _localctx = new Exp_factor3Context(_ctx, getState());
		enterRule(_localctx, 96, RULE_exp_factor3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(474);
				match(NOT);
				}
				break;
			}
			setState(477);
			exp_factor4();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp_factor4Context extends ParserRuleContext {
		public Bool_primaryContext bool_primary() {
			return getRuleContext(Bool_primaryContext.class,0);
		}
		public TerminalNode IS() { return getToken(uniformSQLParser.IS, 0); }
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public TerminalNode NULL() { return getToken(uniformSQLParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(uniformSQLParser.NOT, 0); }
		public Exp_factor4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_factor4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterExp_factor4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitExp_factor4(this);
		}
	}

	public final Exp_factor4Context exp_factor4() throws RecognitionException {
		Exp_factor4Context _localctx = new Exp_factor4Context(_ctx, getState());
		enterRule(_localctx, 98, RULE_exp_factor4);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			bool_primary();
			setState(488);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(480);
				match(IS);
				setState(482);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(481);
					match(NOT);
					}
				}

				setState(486);
				switch (_input.LA(1)) {
				case TRUE:
				case FALSE:
					{
					setState(484);
					boolean_literal();
					}
					break;
				case NULL:
					{
					setState(485);
					match(NULL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_primaryContext extends ParserRuleContext {
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public Relational_opContext relational_op() {
			return getRuleContext(Relational_opContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode ALL() { return getToken(uniformSQLParser.ALL, 0); }
		public TerminalNode EXISTS() { return getToken(uniformSQLParser.EXISTS, 0); }
		public TerminalNode NOT() { return getToken(uniformSQLParser.NOT, 0); }
		public Bool_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterBool_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitBool_primary(this);
		}
	}

	public final Bool_primaryContext bool_primary() throws RecognitionException {
		Bool_primaryContext _localctx = new Bool_primaryContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_bool_primary);
		int _la;
		try {
			setState(507);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(490);
				predicate();
				setState(491);
				relational_op();
				setState(492);
				predicate();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(494);
				predicate();
				setState(495);
				relational_op();
				setState(497);
				_la = _input.LA(1);
				if (_la==ALL) {
					{
					setState(496);
					match(ALL);
					}
				}

				setState(499);
				subquery();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(502);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(501);
					match(NOT);
					}
				}

				setState(504);
				match(EXISTS);
				setState(505);
				subquery();
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(506);
				predicate();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public List<Bit_exprContext> bit_expr() {
			return getRuleContexts(Bit_exprContext.class);
		}
		public Bit_exprContext bit_expr(int i) {
			return getRuleContext(Bit_exprContext.class,i);
		}
		public TerminalNode IN() { return getToken(uniformSQLParser.IN, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public TerminalNode NOT() { return getToken(uniformSQLParser.NOT, 0); }
		public TerminalNode BETWEEN() { return getToken(uniformSQLParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(uniformSQLParser.AND, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(uniformSQLParser.LIKE, 0); }
		public Simple_exprContext simple_expr() {
			return getRuleContext(Simple_exprContext.class,0);
		}
		public TerminalNode REGEXP() { return getToken(uniformSQLParser.REGEXP, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitPredicate(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_predicate);
		int _la;
		try {
			setState(542);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(509);
				bit_expr();
				setState(511);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(510);
					match(NOT);
					}
				}

				setState(513);
				match(IN);
				setState(516);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(514);
					subquery();
					}
					break;
				case 2:
					{
					setState(515);
					expression_list();
					}
					break;
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(518);
				bit_expr();
				setState(520);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(519);
					match(NOT);
					}
				}

				setState(522);
				match(BETWEEN);
				setState(523);
				bit_expr();
				setState(524);
				match(AND);
				setState(525);
				predicate();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(527);
				bit_expr();
				setState(529);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(528);
					match(NOT);
					}
				}

				setState(531);
				match(LIKE);
				setState(532);
				simple_expr();
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(534);
				bit_expr();
				setState(536);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(535);
					match(NOT);
					}
				}

				setState(538);
				match(REGEXP);
				setState(539);
				bit_expr();
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(541);
				bit_expr();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bit_exprContext extends ParserRuleContext {
		public List<Factor1Context> factor1() {
			return getRuleContexts(Factor1Context.class);
		}
		public Factor1Context factor1(int i) {
			return getRuleContext(Factor1Context.class,i);
		}
		public TerminalNode VERTBAR() { return getToken(uniformSQLParser.VERTBAR, 0); }
		public Bit_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterBit_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitBit_expr(this);
		}
	}

	public final Bit_exprContext bit_expr() throws RecognitionException {
		Bit_exprContext _localctx = new Bit_exprContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_bit_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			factor1();
			setState(547);
			_la = _input.LA(1);
			if (_la==VERTBAR) {
				{
				setState(545);
				match(VERTBAR);
				setState(546);
				factor1();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Factor1Context extends ParserRuleContext {
		public List<Factor2Context> factor2() {
			return getRuleContexts(Factor2Context.class);
		}
		public Factor2Context factor2(int i) {
			return getRuleContext(Factor2Context.class,i);
		}
		public TerminalNode BITAND() { return getToken(uniformSQLParser.BITAND, 0); }
		public Factor1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterFactor1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitFactor1(this);
		}
	}

	public final Factor1Context factor1() throws RecognitionException {
		Factor1Context _localctx = new Factor1Context(_ctx, getState());
		enterRule(_localctx, 106, RULE_factor1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			factor2();
			setState(552);
			_la = _input.LA(1);
			if (_la==BITAND) {
				{
				setState(550);
				match(BITAND);
				setState(551);
				factor2();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Factor2Context extends ParserRuleContext {
		public List<Factor3Context> factor3() {
			return getRuleContexts(Factor3Context.class);
		}
		public Factor3Context factor3(int i) {
			return getRuleContext(Factor3Context.class,i);
		}
		public TerminalNode SHIFT_LEFT() { return getToken(uniformSQLParser.SHIFT_LEFT, 0); }
		public TerminalNode SHIFT_RIGHT() { return getToken(uniformSQLParser.SHIFT_RIGHT, 0); }
		public Factor2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterFactor2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitFactor2(this);
		}
	}

	public final Factor2Context factor2() throws RecognitionException {
		Factor2Context _localctx = new Factor2Context(_ctx, getState());
		enterRule(_localctx, 108, RULE_factor2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			factor3();
			setState(557);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(555);
				_la = _input.LA(1);
				if ( !(_la==SHIFT_LEFT || _la==SHIFT_RIGHT) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(556);
				factor3();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Factor3Context extends ParserRuleContext {
		public List<Factor4Context> factor4() {
			return getRuleContexts(Factor4Context.class);
		}
		public Factor4Context factor4(int i) {
			return getRuleContext(Factor4Context.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(uniformSQLParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(uniformSQLParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(uniformSQLParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(uniformSQLParser.MINUS, i);
		}
		public Factor3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterFactor3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitFactor3(this);
		}
	}

	public final Factor3Context factor3() throws RecognitionException {
		Factor3Context _localctx = new Factor3Context(_ctx, getState());
		enterRule(_localctx, 110, RULE_factor3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			factor4();
			setState(564);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(560);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(561);
				factor4();
				}
				}
				setState(566);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Factor4Context extends ParserRuleContext {
		public List<Factor5Context> factor5() {
			return getRuleContexts(Factor5Context.class);
		}
		public Factor5Context factor5(int i) {
			return getRuleContext(Factor5Context.class,i);
		}
		public List<TerminalNode> ASTERISK() { return getTokens(uniformSQLParser.ASTERISK); }
		public TerminalNode ASTERISK(int i) {
			return getToken(uniformSQLParser.ASTERISK, i);
		}
		public List<TerminalNode> DIVIDE() { return getTokens(uniformSQLParser.DIVIDE); }
		public TerminalNode DIVIDE(int i) {
			return getToken(uniformSQLParser.DIVIDE, i);
		}
		public List<TerminalNode> MOD() { return getTokens(uniformSQLParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(uniformSQLParser.MOD, i);
		}
		public List<TerminalNode> POWER_OP() { return getTokens(uniformSQLParser.POWER_OP); }
		public TerminalNode POWER_OP(int i) {
			return getToken(uniformSQLParser.POWER_OP, i);
		}
		public Factor4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterFactor4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitFactor4(this);
		}
	}

	public final Factor4Context factor4() throws RecognitionException {
		Factor4Context _localctx = new Factor4Context(_ctx, getState());
		enterRule(_localctx, 112, RULE_factor4);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			factor5();
			setState(572);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(568);
					_la = _input.LA(1);
					if ( !(((((_la - 294)) & ~0x3f) == 0 && ((1L << (_la - 294)) & ((1L << (DIVIDE - 294)) | (1L << (MOD - 294)) | (1L << (ASTERISK - 294)) | (1L << (POWER_OP - 294)))) != 0)) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(569);
					factor5();
					}
					} 
				}
				setState(574);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Factor5Context extends ParserRuleContext {
		public Factor6Context factor6() {
			return getRuleContext(Factor6Context.class,0);
		}
		public Interval_exprContext interval_expr() {
			return getRuleContext(Interval_exprContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(uniformSQLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(uniformSQLParser.MINUS, 0); }
		public Factor5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterFactor5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitFactor5(this);
		}
	}

	public final Factor5Context factor5() throws RecognitionException {
		Factor5Context _localctx = new Factor5Context(_ctx, getState());
		enterRule(_localctx, 114, RULE_factor5);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			factor6();
			setState(578);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(576);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(577);
				interval_expr();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Factor6Context extends ParserRuleContext {
		public Simple_exprContext simple_expr() {
			return getRuleContext(Simple_exprContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(uniformSQLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(uniformSQLParser.MINUS, 0); }
		public TerminalNode NEGATION() { return getToken(uniformSQLParser.NEGATION, 0); }
		public TerminalNode BINARY() { return getToken(uniformSQLParser.BINARY, 0); }
		public Factor6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor6; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterFactor6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitFactor6(this);
		}
	}

	public final Factor6Context factor6() throws RecognitionException {
		Factor6Context _localctx = new Factor6Context(_ctx, getState());
		enterRule(_localctx, 116, RULE_factor6);
		int _la;
		try {
			setState(583);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(580);
				_la = _input.LA(1);
				if ( !(_la==BINARY || ((((_la - 316)) & ~0x3f) == 0 && ((1L << (_la - 316)) & ((1L << (PLUS - 316)) | (1L << (MINUS - 316)) | (1L << (NEGATION - 316)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(581);
				simple_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(582);
				simple_expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Factor7Context extends ParserRuleContext {
		public Simple_exprContext simple_expr() {
			return getRuleContext(Simple_exprContext.class,0);
		}
		public Factor7Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor7; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterFactor7(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitFactor7(this);
		}
	}

	public final Factor7Context factor7() throws RecognitionException {
		Factor7Context _localctx = new Factor7Context(_ctx, getState());
		enterRule(_localctx, 118, RULE_factor7);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			simple_expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_exprContext extends ParserRuleContext {
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public Column_specContext column_spec() {
			return getRuleContext(Column_specContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Raw_expression_listContext raw_expression_list() {
			return getRuleContext(Raw_expression_listContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode EXISTS() { return getToken(uniformSQLParser.EXISTS, 0); }
		public Case_when_statementContext case_when_statement() {
			return getRuleContext(Case_when_statementContext.class,0);
		}
		public Simple_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterSimple_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitSimple_expr(this);
		}
	}

	public final Simple_exprContext simple_expr() throws RecognitionException {
		Simple_exprContext _localctx = new Simple_exprContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_simple_expr);
		try {
			setState(596);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(587);
				literal_value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(588);
				column_spec();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(589);
				function_call();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(590);
				expression_list();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(591);
				raw_expression_list();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(592);
				subquery();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(593);
				match(EXISTS);
				setState(594);
				subquery();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(595);
				case_when_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_callContext extends ParserRuleContext {
		public FunctionListContext functionList() {
			return getRuleContext(FunctionListContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(uniformSQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(uniformSQLParser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public TerminalNode CAST() { return getToken(uniformSQLParser.CAST, 0); }
		public TerminalNode AS() { return getToken(uniformSQLParser.AS, 0); }
		public Cast_data_typeContext cast_data_type() {
			return getRuleContext(Cast_data_typeContext.class,0);
		}
		public Group_functionsContext group_functions() {
			return getRuleContext(Group_functionsContext.class,0);
		}
		public Bit_exprContext bit_expr() {
			return getRuleContext(Bit_exprContext.class,0);
		}
		public TerminalNode ASTERISK() { return getToken(uniformSQLParser.ASTERISK, 0); }
		public TerminalNode ALL() { return getToken(uniformSQLParser.ALL, 0); }
		public TerminalNode DISTINCT() { return getToken(uniformSQLParser.DISTINCT, 0); }
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitFunction_call(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_function_call);
		int _la;
		try {
			setState(628);
			switch (_input.LA(1)) {
			case ABS:
			case ACOS:
			case ASIN:
			case ATAN:
			case CEIL:
			case COS:
			case COT:
			case EXP:
			case FLOOR:
			case LN:
			case POW:
			case RAND:
			case ROUND:
			case SIN:
			case SQRT:
			case TAN:
			case LCASE:
			case LOWER:
			case LTRIM:
			case RTRIM:
			case CONCAT:
			case SUBSTR:
			case TRIM:
			case UCASE:
			case UPPER:
			case TO_DATE:
			case DAY:
			case HOUR:
			case MINUTE:
			case MONTH:
			case SECOND:
			case FROM_UNIXTIME:
			case YEAR:
			case DATE_ADD:
			case DATE_SUB:
			case COALESCE:
			case TO_CHAR:
			case DATE_FORMAT:
			case LENGTH:
			case REVERSE:
			case IFNULL:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(598);
				functionList();
				setState(611);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(599);
					match(LPAREN);
					setState(608);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << ALL) | (1L << NOT) | (1L << LIKE) | (1L << IF) | (1L << EXISTS) | (1L << ASC) | (1L << DESC) | (1L << ORDER) | (1L << GROUP) | (1L << BY) | (1L << HAVING) | (1L << WHERE) | (1L << FROM) | (1L << AS) | (1L << SELECT) | (1L << DISTINCT) | (1L << INSERT) | (1L << OVERWRITE) | (1L << OUTER) | (1L << UNIQUEJOIN) | (1L << PRESERVE) | (1L << JOIN) | (1L << LEFT) | (1L << RIGHT) | (1L << FULL) | (1L << ON) | (1L << PARTITION) | (1L << PARTITIONS) | (1L << TABLE) | (1L << TABLES) | (1L << COLUMNS) | (1L << INDEX) | (1L << INDEXES) | (1L << REBUILD) | (1L << FUNCTIONS) | (1L << SHOW) | (1L << MSCK) | (1L << REPAIR) | (1L << DIRECTORY) | (1L << LOCAL) | (1L << TRANSFORM) | (1L << USING) | (1L << CLUSTER) | (1L << DISTRIBUTE) | (1L << SORT) | (1L << UNION) | (1L << LOAD) | (1L << EXPORT) | (1L << IMPORT) | (1L << DATA) | (1L << INPATH) | (1L << IS) | (1L << NULL) | (1L << CREATE) | (1L << EXTERNAL) | (1L << ALTER) | (1L << CHANGE) | (1L << COLUMN) | (1L << FIRST) | (1L << AFTER) | (1L << DESCRIBE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DROP - 64)) | (1L << (RENAME - 64)) | (1L << (IGNORE - 64)) | (1L << (PROTECTION - 64)) | (1L << (TO - 64)) | (1L << (COMMENT - 64)) | (1L << (BOOLEAN - 64)) | (1L << (TINYINT - 64)) | (1L << (SMALLINT - 64)) | (1L << (INT - 64)) | (1L << (BIGINT - 64)) | (1L << (FLOAT - 64)) | (1L << (DOUBLE - 64)) | (1L << (DATE - 64)) | (1L << (DATETIME - 64)) | (1L << (TIMESTAMP - 64)) | (1L << (DECIMAL - 64)) | (1L << (STRING - 64)) | (1L << (VARCHAR - 64)) | (1L << (ARRAY - 64)) | (1L << (STRUCT - 64)) | (1L << (MAP - 64)) | (1L << (UNIONTYPE - 64)) | (1L << (REDUCE - 64)) | (1L << (PARTITIONED - 64)) | (1L << (CLUSTERED - 64)) | (1L << (SORTED - 64)) | (1L << (INTO - 64)) | (1L << (BUCKETS - 64)) | (1L << (ROW - 64)) | (1L << (ROWS - 64)) | (1L << (FORMAT - 64)) | (1L << (DELIMITED - 64)) | (1L << (FIELDS - 64)) | (1L << (TERMINATED - 64)) | (1L << (ESCAPED - 64)) | (1L << (COLLECTION - 64)) | (1L << (ITEMS - 64)) | (1L << (KEYS - 64)) | (1L << (KEY - 64)) | (1L << (LINES - 64)) | (1L << (STORED - 64)) | (1L << (FILEFORMAT - 64)) | (1L << (SEQUENCEFILE - 64)) | (1L << (TEXTFILE - 64)) | (1L << (RCFILE - 64)) | (1L << (ORCFILE - 64)) | (1L << (INPUTFORMAT - 64)) | (1L << (OUTPUTFORMAT - 64)) | (1L << (INPUTDRIVER - 64)) | (1L << (OUTPUTDRIVER - 64)) | (1L << (OFFLINE - 64)) | (1L << (ENABLE - 64)) | (1L << (DEFAULT - 64)) | (1L << (DISABLE - 64)) | (1L << (READONLY - 64)) | (1L << (LOCATION - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (BUCKET - 64)) | (1L << (OUT - 64)) | (1L << (OF - 64)) | (1L << (PERCENT - 64)) | (1L << (CAST - 64)) | (1L << (ADD - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (REPLACE - 128)) | (1L << (RLIKE - 128)) | (1L << (REGEXP - 128)) | (1L << (TEMPORARY - 128)) | (1L << (FUNCTION - 128)) | (1L << (MACRO - 128)) | (1L << (EXPLAIN - 128)) | (1L << (EXTENDED - 128)) | (1L << (FORMATTED - 128)) | (1L << (PRETTY - 128)) | (1L << (DEPENDENCY - 128)) | (1L << (LOGICAL - 128)) | (1L << (SERDE - 128)) | (1L << (WITH - 128)) | (1L << (DEFERRED - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (DBPROPERTIES - 128)) | (1L << (LIMIT - 128)) | (1L << (SET - 128)) | (1L << (UNSET - 128)) | (1L << (TBLPROPERTIES - 128)) | (1L << (IDXPROPERTIES - 128)) | (1L << (CASCADED - 128)) | (1L << (CASE - 128)) | (1L << (WHEN - 128)) | (1L << (THEN - 128)) | (1L << (ELSE - 128)) | (1L << (END - 128)) | (1L << (MAPJOIN - 128)) | (1L << (STREAMTABLE - 128)) | (1L << (CLUSTERSTATUS - 128)) | (1L << (UTC - 128)) | (1L << (LONG - 128)) | (1L << (DELETE - 128)) | (1L << (FETCH - 128)) | (1L << (INTERSECT - 128)) | (1L << (VIEW - 128)) | (1L << (IN - 128)) | (1L << (DATABASE - 128)) | (1L << (DATABASES - 128)) | (1L << (MATERIALIZED - 128)) | (1L << (SCHEMA - 128)) | (1L << (SCHEMAS - 128)) | (1L << (GRANT - 128)) | (1L << (REVOKE - 128)) | (1L << (SSL - 128)) | (1L << (UNDO - 128)) | (1L << (LOCK - 128)) | (1L << (LOCKS - 128)) | (1L << (UNLOCK - 128)) | (1L << (SHARED - 128)) | (1L << (EXCLUSIVE - 128)) | (1L << (PROCEDURE - 128)) | (1L << (UNSIGNED - 128)) | (1L << (WHILE - 128)) | (1L << (READ - 128)) | (1L << (READS - 128)) | (1L << (PURGE - 128)) | (1L << (RANGE - 128)) | (1L << (ANALYZE - 128)) | (1L << (BEFORE - 128)) | (1L << (BETWEEN - 128)) | (1L << (BOTH - 128)) | (1L << (BINARY - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (CROSS - 192)) | (1L << (CONTINUE - 192)) | (1L << (CURSOR - 192)) | (1L << (TRIGGER - 192)) | (1L << (RECORDREADER - 192)) | (1L << (RECORDWRITER - 192)) | (1L << (LATERAL - 192)) | (1L << (TOUCH - 192)) | (1L << (ARCHIVE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (COMPUTE - 192)) | (1L << (STATISTICS - 192)) | (1L << (USE - 192)) | (1L << (OPTION - 192)) | (1L << (CONCATENATE - 192)) | (1L << (UPDATE - 192)) | (1L << (RESTRICT - 192)) | (1L << (CASCADE - 192)) | (1L << (SKEWED - 192)) | (1L << (ROLLUP - 192)) | (1L << (CUBE - 192)) | (1L << (DIRECTORIES - 192)) | (1L << (FOR - 192)) | (1L << (WINDOW - 192)) | (1L << (UNBOUNDED - 192)) | (1L << (PRECEDING - 192)) | (1L << (FOLLOWING - 192)) | (1L << (CURRENT - 192)) | (1L << (LESS - 192)) | (1L << (MORE - 192)) | (1L << (OVER - 192)) | (1L << (GROUPING - 192)) | (1L << (SETS - 192)) | (1L << (TRUNCATE - 192)) | (1L << (NOSCAN - 192)) | (1L << (PARTIALSCAN - 192)) | (1L << (USER - 192)) | (1L << (ROLE - 192)) | (1L << (INNER - 192)) | (1L << (EXCHANGE - 192)) | (1L << (IDENTIFIED - 192)) | (1L << (CHAR - 192)) | (1L << (ABS - 192)) | (1L << (ACOS - 192)) | (1L << (ASIN - 192)) | (1L << (ATAN - 192)) | (1L << (CEIL - 192)) | (1L << (COS - 192)) | (1L << (COT - 192)) | (1L << (EXP - 192)) | (1L << (FLOOR - 192)) | (1L << (LN - 192)) | (1L << (POW - 192)) | (1L << (RAND - 192)) | (1L << (ROUND - 192)) | (1L << (SIN - 192)) | (1L << (SQRT - 192)) | (1L << (TAN - 192)) | (1L << (LCASE - 192)) | (1L << (LOWER - 192)) | (1L << (LTRIM - 192)) | (1L << (RTRIM - 192)) | (1L << (CONCAT - 192)) | (1L << (SUBSTR - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (TRIM - 256)) | (1L << (UCASE - 256)) | (1L << (UPPER - 256)) | (1L << (INTERVAL - 256)) | (1L << (TO_DATE - 256)) | (1L << (DAY - 256)) | (1L << (HOUR - 256)) | (1L << (MINUTE - 256)) | (1L << (MONTH - 256)) | (1L << (SECOND - 256)) | (1L << (FROM_UNIXTIME - 256)) | (1L << (YEAR - 256)) | (1L << (DATE_ADD - 256)) | (1L << (DATE_SUB - 256)) | (1L << (COLLATE - 256)) | (1L << (AVG - 256)) | (1L << (COUNT - 256)) | (1L << (MAX - 256)) | (1L << (MIN - 256)) | (1L << (SUM - 256)) | (1L << (COALESCE - 256)) | (1L << (DUPLICATE - 256)) | (1L << (SERVER - 256)) | (1L << (ALIASES - 256)) | (1L << (ALIAS - 256)) | (1L << (VALUES - 256)) | (1L << (VALUE - 256)) | (1L << (LOW_PRIORITY - 256)) | (1L << (HIGH_PRIORITY - 256)) | (1L << (HASH - 256)) | (1L << (REFERENCES - 256)) | (1L << (TO_CHAR - 256)) | (1L << (DATE_FORMAT - 256)) | (1L << (SIGNED - 256)) | (1L << (INTEGER - 256)) | (1L << (LENGTH - 256)) | (1L << (REVERSE - 256)) | (1L << (IFNULL - 256)) | (1L << (DIVIDE - 256)) | (1L << (MOD - 256)) | (1L << (OR - 256)) | (1L << (AND - 256)) | (1L << (XOR - 256)) | (1L << (ARROW - 256)) | (1L << (EQ - 256)) | (1L << (NOT_EQ - 256)) | (1L << (LET - 256)) | (1L << (GET - 256)) | (1L << (SET_VAR - 256)) | (1L << (SHIFT_LEFT - 256)) | (1L << (SHIFT_RIGHT - 256)) | (1L << (LPAREN - 256)) | (1L << (PLUS - 256)) | (1L << (MINUS - 256)) | (1L << (NEGATION - 256)))) != 0) || ((((_la - 325)) & ~0x3f) == 0 && ((1L << (_la - 325)) & ((1L << (INTEGER_NUM - 325)) | (1L << (HEX_DIGIT - 325)) | (1L << (BIT_NUM - 325)) | (1L << (REAL_NUMBER - 325)) | (1L << (TEXT_STRING - 325)) | (1L << (ID - 325)))) != 0)) {
						{
						setState(600);
						expression();
						setState(605);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(601);
							match(COMMA);
							setState(602);
							expression();
							}
							}
							setState(607);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(610);
					match(RPAREN);
					}
				}

				}
				}
				break;
			case CAST:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(613);
				match(CAST);
				setState(614);
				match(LPAREN);
				setState(615);
				expression();
				setState(616);
				match(AS);
				setState(617);
				cast_data_type();
				setState(618);
				match(RPAREN);
				}
				}
				break;
			case AVG:
			case COUNT:
			case MAX:
			case MIN:
			case SUM:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(620);
				group_functions();
				setState(621);
				match(LPAREN);
				setState(623);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(622);
					_la = _input.LA(1);
					if ( !(_la==ALL || _la==DISTINCT || _la==ASTERISK) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					break;
				}
				setState(625);
				bit_expr();
				setState(626);
				match(RPAREN);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Case_when_statementContext extends ParserRuleContext {
		public Case_when_statement1Context case_when_statement1() {
			return getRuleContext(Case_when_statement1Context.class,0);
		}
		public Case_when_statement2Context case_when_statement2() {
			return getRuleContext(Case_when_statement2Context.class,0);
		}
		public Case_when_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_when_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterCase_when_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitCase_when_statement(this);
		}
	}

	public final Case_when_statementContext case_when_statement() throws RecognitionException {
		Case_when_statementContext _localctx = new Case_when_statementContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_case_when_statement);
		try {
			setState(632);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(630);
				case_when_statement1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(631);
				case_when_statement2();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Case_when_statement1Context extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(uniformSQLParser.CASE, 0); }
		public TerminalNode END() { return getToken(uniformSQLParser.END, 0); }
		public List<TerminalNode> WHEN() { return getTokens(uniformSQLParser.WHEN); }
		public TerminalNode WHEN(int i) {
			return getToken(uniformSQLParser.WHEN, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> THEN() { return getTokens(uniformSQLParser.THEN); }
		public TerminalNode THEN(int i) {
			return getToken(uniformSQLParser.THEN, i);
		}
		public List<Bit_exprContext> bit_expr() {
			return getRuleContexts(Bit_exprContext.class);
		}
		public Bit_exprContext bit_expr(int i) {
			return getRuleContext(Bit_exprContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(uniformSQLParser.ELSE, 0); }
		public Case_when_statement1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_when_statement1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterCase_when_statement1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitCase_when_statement1(this);
		}
	}

	public final Case_when_statement1Context case_when_statement1() throws RecognitionException {
		Case_when_statement1Context _localctx = new Case_when_statement1Context(_ctx, getState());
		enterRule(_localctx, 126, RULE_case_when_statement1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			match(CASE);
			setState(640); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(635);
				match(WHEN);
				setState(636);
				expression();
				setState(637);
				match(THEN);
				setState(638);
				bit_expr();
				}
				}
				setState(642); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
			setState(646);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(644);
				match(ELSE);
				setState(645);
				bit_expr();
				}
			}

			setState(648);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Case_when_statement2Context extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(uniformSQLParser.CASE, 0); }
		public List<Bit_exprContext> bit_expr() {
			return getRuleContexts(Bit_exprContext.class);
		}
		public Bit_exprContext bit_expr(int i) {
			return getRuleContext(Bit_exprContext.class,i);
		}
		public TerminalNode END() { return getToken(uniformSQLParser.END, 0); }
		public List<TerminalNode> WHEN() { return getTokens(uniformSQLParser.WHEN); }
		public TerminalNode WHEN(int i) {
			return getToken(uniformSQLParser.WHEN, i);
		}
		public List<TerminalNode> THEN() { return getTokens(uniformSQLParser.THEN); }
		public TerminalNode THEN(int i) {
			return getToken(uniformSQLParser.THEN, i);
		}
		public TerminalNode ELSE() { return getToken(uniformSQLParser.ELSE, 0); }
		public Case_when_statement2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_when_statement2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterCase_when_statement2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitCase_when_statement2(this);
		}
	}

	public final Case_when_statement2Context case_when_statement2() throws RecognitionException {
		Case_when_statement2Context _localctx = new Case_when_statement2Context(_ctx, getState());
		enterRule(_localctx, 128, RULE_case_when_statement2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			match(CASE);
			setState(651);
			bit_expr();
			setState(657); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(652);
				match(WHEN);
				setState(653);
				bit_expr();
				setState(654);
				match(THEN);
				setState(655);
				bit_expr();
				}
				}
				setState(659); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
			setState(663);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(661);
				match(ELSE);
				setState(662);
				bit_expr();
				}
			}

			setState(665);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_specContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(uniformSQLParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(uniformSQLParser.DOT, i);
		}
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public Column_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterColumn_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitColumn_spec(this);
		}
	}

	public final Column_specContext column_spec() throws RecognitionException {
		Column_specContext _localctx = new Column_specContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_column_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(670);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(667);
					schema_name();
					setState(668);
					match(DOT);
					}
					break;
				}
				setState(672);
				table_name();
				setState(673);
				match(DOT);
				}
				break;
			}
			{
			setState(677);
			column_name();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Raw_expression_listContext extends ParserRuleContext {
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(uniformSQLParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(uniformSQLParser.OR, i);
		}
		public List<TerminalNode> AND() { return getTokens(uniformSQLParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(uniformSQLParser.AND, i);
		}
		public Raw_expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raw_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterRaw_expression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitRaw_expression_list(this);
		}
	}

	public final Raw_expression_listContext raw_expression_list() throws RecognitionException {
		Raw_expression_listContext _localctx = new Raw_expression_listContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_raw_expression_list);
		try {
			int _alt;
			setState(693);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(679);
				column_name();
				setState(682); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(680);
						match(OR);
						setState(681);
						column_name();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(684); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(686);
				column_name();
				setState(689); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(687);
						match(AND);
						setState(688);
						column_name();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(691); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression_listContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(uniformSQLParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(uniformSQLParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public Expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterExpression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitExpression_list(this);
		}
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		Expression_listContext _localctx = new Expression_listContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
			match(LPAREN);
			setState(696);
			expression();
			setState(701);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(697);
				match(COMMA);
				setState(698);
				expression();
				}
				}
				setState(703);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(704);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interval_exprContext extends ParserRuleContext {
		public TerminalNode INTERVAL() { return getToken(uniformSQLParser.INTERVAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Interval_unitContext interval_unit() {
			return getRuleContext(Interval_unitContext.class,0);
		}
		public Interval_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterInterval_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitInterval_expr(this);
		}
	}

	public final Interval_exprContext interval_expr() throws RecognitionException {
		Interval_exprContext _localctx = new Interval_exprContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_interval_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			match(INTERVAL);
			setState(707);
			expression();
			setState(708);
			interval_unit();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_referencesContext extends ParserRuleContext {
		public List<Table_referenceContext> table_reference() {
			return getRuleContexts(Table_referenceContext.class);
		}
		public Table_referenceContext table_reference(int i) {
			return getRuleContext(Table_referenceContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public Table_referencesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_references; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterTable_references(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitTable_references(this);
		}
	}

	public final Table_referencesContext table_references() throws RecognitionException {
		Table_referencesContext _localctx = new Table_referencesContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_table_references);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(710);
			table_reference();
			setState(715);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(711);
				match(COMMA);
				setState(712);
				table_reference();
				}
				}
				setState(717);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_referenceContext extends ParserRuleContext {
		public Table_factor1Context table_factor1() {
			return getRuleContext(Table_factor1Context.class,0);
		}
		public Table_atomContext table_atom() {
			return getRuleContext(Table_atomContext.class,0);
		}
		public Table_referenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterTable_reference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitTable_reference(this);
		}
	}

	public final Table_referenceContext table_reference() throws RecognitionException {
		Table_referenceContext _localctx = new Table_referenceContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_table_reference);
		try {
			setState(720);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(718);
				table_factor1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(719);
				table_atom();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_factor1Context extends ParserRuleContext {
		public Table_factor2Context table_factor2() {
			return getRuleContext(Table_factor2Context.class,0);
		}
		public List<TerminalNode> JOIN() { return getTokens(uniformSQLParser.JOIN); }
		public TerminalNode JOIN(int i) {
			return getToken(uniformSQLParser.JOIN, i);
		}
		public List<Table_atomContext> table_atom() {
			return getRuleContexts(Table_atomContext.class);
		}
		public Table_atomContext table_atom(int i) {
			return getRuleContext(Table_atomContext.class,i);
		}
		public List<TerminalNode> CROSS() { return getTokens(uniformSQLParser.CROSS); }
		public TerminalNode CROSS(int i) {
			return getToken(uniformSQLParser.CROSS, i);
		}
		public List<TerminalNode> OUTER() { return getTokens(uniformSQLParser.OUTER); }
		public TerminalNode OUTER(int i) {
			return getToken(uniformSQLParser.OUTER, i);
		}
		public List<Join_conditionContext> join_condition() {
			return getRuleContexts(Join_conditionContext.class);
		}
		public Join_conditionContext join_condition(int i) {
			return getRuleContext(Join_conditionContext.class,i);
		}
		public List<TerminalNode> LEFT() { return getTokens(uniformSQLParser.LEFT); }
		public TerminalNode LEFT(int i) {
			return getToken(uniformSQLParser.LEFT, i);
		}
		public List<TerminalNode> RIGHT() { return getTokens(uniformSQLParser.RIGHT); }
		public TerminalNode RIGHT(int i) {
			return getToken(uniformSQLParser.RIGHT, i);
		}
		public List<TerminalNode> FULL() { return getTokens(uniformSQLParser.FULL); }
		public TerminalNode FULL(int i) {
			return getToken(uniformSQLParser.FULL, i);
		}
		public Table_factor1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_factor1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterTable_factor1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitTable_factor1(this);
		}
	}

	public final Table_factor1Context table_factor1() throws RecognitionException {
		Table_factor1Context _localctx = new Table_factor1Context(_ctx, getState());
		enterRule(_localctx, 142, RULE_table_factor1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(722);
			table_factor2();
			setState(739);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OUTER) | (1L << JOIN) | (1L << LEFT) | (1L << RIGHT) | (1L << FULL))) != 0) || _la==CROSS) {
				{
				{
				setState(724);
				_la = _input.LA(1);
				if (_la==CROSS) {
					{
					setState(723);
					match(CROSS);
					}
				}

				setState(727);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT) | (1L << RIGHT) | (1L << FULL))) != 0)) {
					{
					setState(726);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT) | (1L << RIGHT) | (1L << FULL))) != 0)) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(730);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(729);
					match(OUTER);
					}
				}

				setState(732);
				match(JOIN);
				setState(733);
				table_atom();
				setState(735);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					setState(734);
					join_condition();
					}
					break;
				}
				}
				}
				setState(741);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_factor2Context extends ParserRuleContext {
		public List<Table_factor3Context> table_factor3() {
			return getRuleContexts(Table_factor3Context.class);
		}
		public Table_factor3Context table_factor3(int i) {
			return getRuleContext(Table_factor3Context.class,i);
		}
		public List<TerminalNode> JOIN() { return getTokens(uniformSQLParser.JOIN); }
		public TerminalNode JOIN(int i) {
			return getToken(uniformSQLParser.JOIN, i);
		}
		public List<Join_conditionContext> join_condition() {
			return getRuleContexts(Join_conditionContext.class);
		}
		public Join_conditionContext join_condition(int i) {
			return getRuleContext(Join_conditionContext.class,i);
		}
		public List<TerminalNode> LEFT() { return getTokens(uniformSQLParser.LEFT); }
		public TerminalNode LEFT(int i) {
			return getToken(uniformSQLParser.LEFT, i);
		}
		public List<TerminalNode> RIGHT() { return getTokens(uniformSQLParser.RIGHT); }
		public TerminalNode RIGHT(int i) {
			return getToken(uniformSQLParser.RIGHT, i);
		}
		public List<TerminalNode> FULL() { return getTokens(uniformSQLParser.FULL); }
		public TerminalNode FULL(int i) {
			return getToken(uniformSQLParser.FULL, i);
		}
		public List<TerminalNode> OUTER() { return getTokens(uniformSQLParser.OUTER); }
		public TerminalNode OUTER(int i) {
			return getToken(uniformSQLParser.OUTER, i);
		}
		public Table_factor2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_factor2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterTable_factor2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitTable_factor2(this);
		}
	}

	public final Table_factor2Context table_factor2() throws RecognitionException {
		Table_factor2Context _localctx = new Table_factor2Context(_ctx, getState());
		enterRule(_localctx, 144, RULE_table_factor2);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(742);
			table_factor3();
			setState(753);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(743);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT) | (1L << RIGHT) | (1L << FULL))) != 0)) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(745);
					_la = _input.LA(1);
					if (_la==OUTER) {
						{
						setState(744);
						match(OUTER);
						}
					}

					setState(747);
					match(JOIN);
					setState(748);
					table_factor3();
					setState(749);
					join_condition();
					}
					} 
				}
				setState(755);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_factor3Context extends ParserRuleContext {
		public List<Table_atomContext> table_atom() {
			return getRuleContexts(Table_atomContext.class);
		}
		public Table_atomContext table_atom(int i) {
			return getRuleContext(Table_atomContext.class,i);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode JOIN() { return getToken(uniformSQLParser.JOIN, 0); }
		public TerminalNode LEFT() { return getToken(uniformSQLParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(uniformSQLParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(uniformSQLParser.FULL, 0); }
		public TerminalNode OUTER() { return getToken(uniformSQLParser.OUTER, 0); }
		public Table_factor3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_factor3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterTable_factor3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitTable_factor3(this);
		}
	}

	public final Table_factor3Context table_factor3() throws RecognitionException {
		Table_factor3Context _localctx = new Table_factor3Context(_ctx, getState());
		enterRule(_localctx, 146, RULE_table_factor3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(756);
			table_atom();
			setState(758);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(757);
				alias();
				}
				break;
			}
			setState(768);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(764);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT) | (1L << RIGHT) | (1L << FULL))) != 0)) {
					{
					setState(760);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT) | (1L << RIGHT) | (1L << FULL))) != 0)) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(762);
					_la = _input.LA(1);
					if (_la==OUTER) {
						{
						setState(761);
						match(OUTER);
						}
					}

					}
				}

				setState(766);
				match(JOIN);
				setState(767);
				table_atom();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_atomContext extends ParserRuleContext {
		public Table_specContext table_spec() {
			return getRuleContext(Table_specContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(uniformSQLParser.LPAREN, 0); }
		public Table_referencesContext table_references() {
			return getRuleContext(Table_referencesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(uniformSQLParser.RPAREN, 0); }
		public TerminalNode ID() { return getToken(uniformSQLParser.ID, 0); }
		public Table_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterTable_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitTable_atom(this);
		}
	}

	public final Table_atomContext table_atom() throws RecognitionException {
		Table_atomContext _localctx = new Table_atomContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_table_atom);
		try {
			setState(783);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(770);
				table_spec();
				setState(772);
				switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
				case 1:
					{
					setState(771);
					alias();
					}
					break;
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(774);
				subquery();
				setState(776);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					setState(775);
					alias();
					}
					break;
				}
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(778);
				match(LPAREN);
				setState(779);
				table_references();
				setState(780);
				match(RPAREN);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(782);
				match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_conditionContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(uniformSQLParser.ON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Join_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterJoin_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitJoin_condition(this);
		}
	}

	public final Join_conditionContext join_condition() throws RecognitionException {
		Join_conditionContext _localctx = new Join_conditionContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_join_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(785);
			match(ON);
			setState(786);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_hint_listContext extends ParserRuleContext {
		public List<Index_hintContext> index_hint() {
			return getRuleContexts(Index_hintContext.class);
		}
		public Index_hintContext index_hint(int i) {
			return getRuleContext(Index_hintContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public Index_hint_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_hint_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterIndex_hint_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitIndex_hint_list(this);
		}
	}

	public final Index_hint_listContext index_hint_list() throws RecognitionException {
		Index_hint_listContext _localctx = new Index_hint_listContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_index_hint_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(788);
			index_hint();
			setState(793);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(789);
				match(COMMA);
				setState(790);
				index_hint();
				}
				}
				setState(795);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_optionsContext extends ParserRuleContext {
		public TerminalNode INDEX() { return getToken(uniformSQLParser.INDEX, 0); }
		public TerminalNode KEY() { return getToken(uniformSQLParser.KEY, 0); }
		public TerminalNode FOR() { return getToken(uniformSQLParser.FOR, 0); }
		public TerminalNode JOIN() { return getToken(uniformSQLParser.JOIN, 0); }
		public TerminalNode ORDER() { return getToken(uniformSQLParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(uniformSQLParser.BY, 0); }
		public TerminalNode GROUP() { return getToken(uniformSQLParser.GROUP, 0); }
		public Index_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterIndex_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitIndex_options(this);
		}
	}

	public final Index_optionsContext index_options() throws RecognitionException {
		Index_optionsContext _localctx = new Index_optionsContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_index_options);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
			_la = _input.LA(1);
			if ( !(_la==INDEX || _la==KEY) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(805);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(797);
				match(FOR);
				setState(803);
				switch (_input.LA(1)) {
				case JOIN:
					{
					{
					setState(798);
					match(JOIN);
					}
					}
					break;
				case ORDER:
					{
					{
					setState(799);
					match(ORDER);
					setState(800);
					match(BY);
					}
					}
					break;
				case GROUP:
					{
					{
					setState(801);
					match(GROUP);
					setState(802);
					match(BY);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_hintContext extends ParserRuleContext {
		public TerminalNode USE() { return getToken(uniformSQLParser.USE, 0); }
		public Index_optionsContext index_options() {
			return getRuleContext(Index_optionsContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(uniformSQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(uniformSQLParser.RPAREN, 0); }
		public Index_listContext index_list() {
			return getRuleContext(Index_listContext.class,0);
		}
		public TerminalNode IGNORE() { return getToken(uniformSQLParser.IGNORE, 0); }
		public Index_hintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_hint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterIndex_hint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitIndex_hint(this);
		}
	}

	public final Index_hintContext index_hint() throws RecognitionException {
		Index_hintContext _localctx = new Index_hintContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_index_hint);
		int _la;
		try {
			setState(821);
			switch (_input.LA(1)) {
			case USE:
				enterOuterAlt(_localctx, 1);
				{
				setState(807);
				match(USE);
				setState(808);
				index_options();
				setState(809);
				match(LPAREN);
				setState(811);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << ALL) | (1L << NOT) | (1L << LIKE) | (1L << IF) | (1L << EXISTS) | (1L << ASC) | (1L << DESC) | (1L << ORDER) | (1L << GROUP) | (1L << BY) | (1L << HAVING) | (1L << WHERE) | (1L << FROM) | (1L << AS) | (1L << SELECT) | (1L << DISTINCT) | (1L << INSERT) | (1L << OVERWRITE) | (1L << OUTER) | (1L << UNIQUEJOIN) | (1L << PRESERVE) | (1L << JOIN) | (1L << LEFT) | (1L << RIGHT) | (1L << FULL) | (1L << ON) | (1L << PARTITION) | (1L << PARTITIONS) | (1L << TABLE) | (1L << TABLES) | (1L << COLUMNS) | (1L << INDEX) | (1L << INDEXES) | (1L << REBUILD) | (1L << FUNCTIONS) | (1L << SHOW) | (1L << MSCK) | (1L << REPAIR) | (1L << DIRECTORY) | (1L << LOCAL) | (1L << TRANSFORM) | (1L << USING) | (1L << CLUSTER) | (1L << DISTRIBUTE) | (1L << SORT) | (1L << UNION) | (1L << LOAD) | (1L << EXPORT) | (1L << IMPORT) | (1L << DATA) | (1L << INPATH) | (1L << IS) | (1L << NULL) | (1L << CREATE) | (1L << EXTERNAL) | (1L << ALTER) | (1L << CHANGE) | (1L << COLUMN) | (1L << FIRST) | (1L << AFTER) | (1L << DESCRIBE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DROP - 64)) | (1L << (RENAME - 64)) | (1L << (IGNORE - 64)) | (1L << (PROTECTION - 64)) | (1L << (TO - 64)) | (1L << (COMMENT - 64)) | (1L << (BOOLEAN - 64)) | (1L << (TINYINT - 64)) | (1L << (SMALLINT - 64)) | (1L << (INT - 64)) | (1L << (BIGINT - 64)) | (1L << (FLOAT - 64)) | (1L << (DOUBLE - 64)) | (1L << (DATE - 64)) | (1L << (DATETIME - 64)) | (1L << (TIMESTAMP - 64)) | (1L << (DECIMAL - 64)) | (1L << (STRING - 64)) | (1L << (VARCHAR - 64)) | (1L << (ARRAY - 64)) | (1L << (STRUCT - 64)) | (1L << (MAP - 64)) | (1L << (UNIONTYPE - 64)) | (1L << (REDUCE - 64)) | (1L << (PARTITIONED - 64)) | (1L << (CLUSTERED - 64)) | (1L << (SORTED - 64)) | (1L << (INTO - 64)) | (1L << (BUCKETS - 64)) | (1L << (ROW - 64)) | (1L << (ROWS - 64)) | (1L << (FORMAT - 64)) | (1L << (DELIMITED - 64)) | (1L << (FIELDS - 64)) | (1L << (TERMINATED - 64)) | (1L << (ESCAPED - 64)) | (1L << (COLLECTION - 64)) | (1L << (ITEMS - 64)) | (1L << (KEYS - 64)) | (1L << (KEY - 64)) | (1L << (LINES - 64)) | (1L << (STORED - 64)) | (1L << (FILEFORMAT - 64)) | (1L << (SEQUENCEFILE - 64)) | (1L << (TEXTFILE - 64)) | (1L << (RCFILE - 64)) | (1L << (ORCFILE - 64)) | (1L << (INPUTFORMAT - 64)) | (1L << (OUTPUTFORMAT - 64)) | (1L << (INPUTDRIVER - 64)) | (1L << (OUTPUTDRIVER - 64)) | (1L << (OFFLINE - 64)) | (1L << (ENABLE - 64)) | (1L << (DEFAULT - 64)) | (1L << (DISABLE - 64)) | (1L << (READONLY - 64)) | (1L << (LOCATION - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (BUCKET - 64)) | (1L << (OUT - 64)) | (1L << (OF - 64)) | (1L << (PERCENT - 64)) | (1L << (CAST - 64)) | (1L << (ADD - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (REPLACE - 128)) | (1L << (RLIKE - 128)) | (1L << (REGEXP - 128)) | (1L << (TEMPORARY - 128)) | (1L << (FUNCTION - 128)) | (1L << (MACRO - 128)) | (1L << (EXPLAIN - 128)) | (1L << (EXTENDED - 128)) | (1L << (FORMATTED - 128)) | (1L << (PRETTY - 128)) | (1L << (DEPENDENCY - 128)) | (1L << (LOGICAL - 128)) | (1L << (SERDE - 128)) | (1L << (WITH - 128)) | (1L << (DEFERRED - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (DBPROPERTIES - 128)) | (1L << (LIMIT - 128)) | (1L << (SET - 128)) | (1L << (UNSET - 128)) | (1L << (TBLPROPERTIES - 128)) | (1L << (IDXPROPERTIES - 128)) | (1L << (CASCADED - 128)) | (1L << (CASE - 128)) | (1L << (WHEN - 128)) | (1L << (THEN - 128)) | (1L << (ELSE - 128)) | (1L << (END - 128)) | (1L << (MAPJOIN - 128)) | (1L << (STREAMTABLE - 128)) | (1L << (CLUSTERSTATUS - 128)) | (1L << (UTC - 128)) | (1L << (LONG - 128)) | (1L << (DELETE - 128)) | (1L << (FETCH - 128)) | (1L << (INTERSECT - 128)) | (1L << (VIEW - 128)) | (1L << (IN - 128)) | (1L << (DATABASE - 128)) | (1L << (DATABASES - 128)) | (1L << (MATERIALIZED - 128)) | (1L << (SCHEMA - 128)) | (1L << (SCHEMAS - 128)) | (1L << (GRANT - 128)) | (1L << (REVOKE - 128)) | (1L << (SSL - 128)) | (1L << (UNDO - 128)) | (1L << (LOCK - 128)) | (1L << (LOCKS - 128)) | (1L << (UNLOCK - 128)) | (1L << (SHARED - 128)) | (1L << (EXCLUSIVE - 128)) | (1L << (PROCEDURE - 128)) | (1L << (UNSIGNED - 128)) | (1L << (WHILE - 128)) | (1L << (READ - 128)) | (1L << (READS - 128)) | (1L << (PURGE - 128)) | (1L << (RANGE - 128)) | (1L << (ANALYZE - 128)) | (1L << (BEFORE - 128)) | (1L << (BETWEEN - 128)) | (1L << (BOTH - 128)) | (1L << (BINARY - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (CROSS - 192)) | (1L << (CONTINUE - 192)) | (1L << (CURSOR - 192)) | (1L << (TRIGGER - 192)) | (1L << (RECORDREADER - 192)) | (1L << (RECORDWRITER - 192)) | (1L << (LATERAL - 192)) | (1L << (TOUCH - 192)) | (1L << (ARCHIVE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (COMPUTE - 192)) | (1L << (STATISTICS - 192)) | (1L << (USE - 192)) | (1L << (OPTION - 192)) | (1L << (CONCATENATE - 192)) | (1L << (UPDATE - 192)) | (1L << (RESTRICT - 192)) | (1L << (CASCADE - 192)) | (1L << (SKEWED - 192)) | (1L << (ROLLUP - 192)) | (1L << (CUBE - 192)) | (1L << (DIRECTORIES - 192)) | (1L << (FOR - 192)) | (1L << (WINDOW - 192)) | (1L << (UNBOUNDED - 192)) | (1L << (PRECEDING - 192)) | (1L << (FOLLOWING - 192)) | (1L << (CURRENT - 192)) | (1L << (LESS - 192)) | (1L << (MORE - 192)) | (1L << (OVER - 192)) | (1L << (GROUPING - 192)) | (1L << (SETS - 192)) | (1L << (TRUNCATE - 192)) | (1L << (NOSCAN - 192)) | (1L << (PARTIALSCAN - 192)) | (1L << (USER - 192)) | (1L << (ROLE - 192)) | (1L << (INNER - 192)) | (1L << (EXCHANGE - 192)) | (1L << (IDENTIFIED - 192)) | (1L << (CHAR - 192)) | (1L << (ABS - 192)) | (1L << (ACOS - 192)) | (1L << (ASIN - 192)) | (1L << (ATAN - 192)) | (1L << (CEIL - 192)) | (1L << (COS - 192)) | (1L << (COT - 192)) | (1L << (EXP - 192)) | (1L << (FLOOR - 192)) | (1L << (LN - 192)) | (1L << (POW - 192)) | (1L << (RAND - 192)) | (1L << (ROUND - 192)) | (1L << (SIN - 192)) | (1L << (SQRT - 192)) | (1L << (TAN - 192)) | (1L << (LCASE - 192)) | (1L << (LOWER - 192)) | (1L << (LTRIM - 192)) | (1L << (RTRIM - 192)) | (1L << (CONCAT - 192)) | (1L << (SUBSTR - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (TRIM - 256)) | (1L << (UCASE - 256)) | (1L << (UPPER - 256)) | (1L << (INTERVAL - 256)) | (1L << (TO_DATE - 256)) | (1L << (DAY - 256)) | (1L << (HOUR - 256)) | (1L << (MINUTE - 256)) | (1L << (MONTH - 256)) | (1L << (SECOND - 256)) | (1L << (FROM_UNIXTIME - 256)) | (1L << (YEAR - 256)) | (1L << (DATE_ADD - 256)) | (1L << (DATE_SUB - 256)) | (1L << (COLLATE - 256)) | (1L << (AVG - 256)) | (1L << (COUNT - 256)) | (1L << (MAX - 256)) | (1L << (MIN - 256)) | (1L << (SUM - 256)) | (1L << (COALESCE - 256)) | (1L << (DUPLICATE - 256)) | (1L << (SERVER - 256)) | (1L << (ALIASES - 256)) | (1L << (ALIAS - 256)) | (1L << (VALUES - 256)) | (1L << (VALUE - 256)) | (1L << (LOW_PRIORITY - 256)) | (1L << (HIGH_PRIORITY - 256)) | (1L << (HASH - 256)) | (1L << (REFERENCES - 256)) | (1L << (TO_CHAR - 256)) | (1L << (DATE_FORMAT - 256)) | (1L << (SIGNED - 256)) | (1L << (INTEGER - 256)) | (1L << (LENGTH - 256)) | (1L << (REVERSE - 256)) | (1L << (IFNULL - 256)) | (1L << (DIVIDE - 256)) | (1L << (MOD - 256)) | (1L << (OR - 256)) | (1L << (AND - 256)) | (1L << (XOR - 256)) | (1L << (ARROW - 256)) | (1L << (EQ - 256)) | (1L << (NOT_EQ - 256)) | (1L << (LET - 256)) | (1L << (GET - 256)) | (1L << (SET_VAR - 256)) | (1L << (SHIFT_LEFT - 256)) | (1L << (SHIFT_RIGHT - 256)))) != 0) || _la==TEXT_STRING || _la==ID) {
					{
					setState(810);
					index_list();
					}
				}

				setState(813);
				match(RPAREN);
				}
				break;
			case IGNORE:
				enterOuterAlt(_localctx, 2);
				{
				setState(815);
				match(IGNORE);
				setState(816);
				index_options();
				setState(817);
				match(LPAREN);
				setState(818);
				index_list();
				setState(819);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_listContext extends ParserRuleContext {
		public List<Index_nameContext> index_name() {
			return getRuleContexts(Index_nameContext.class);
		}
		public Index_nameContext index_name(int i) {
			return getRuleContext(Index_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public Index_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterIndex_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitIndex_list(this);
		}
	}

	public final Index_listContext index_list() throws RecognitionException {
		Index_listContext _localctx = new Index_listContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_index_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(823);
			index_name();
			setState(828);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(824);
				match(COMMA);
				setState(825);
				index_name();
				}
				}
				setState(830);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Partition_clauseContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(uniformSQLParser.PARTITION, 0); }
		public TerminalNode LPAREN() { return getToken(uniformSQLParser.LPAREN, 0); }
		public Partition_namesContext partition_names() {
			return getRuleContext(Partition_namesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(uniformSQLParser.RPAREN, 0); }
		public Partition_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partition_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterPartition_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitPartition_clause(this);
		}
	}

	public final Partition_clauseContext partition_clause() throws RecognitionException {
		Partition_clauseContext _localctx = new Partition_clauseContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_partition_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(831);
			match(PARTITION);
			setState(832);
			match(LPAREN);
			setState(833);
			partition_names();
			setState(834);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Partition_namesContext extends ParserRuleContext {
		public List<Partition_nameContext> partition_name() {
			return getRuleContexts(Partition_nameContext.class);
		}
		public Partition_nameContext partition_name(int i) {
			return getRuleContext(Partition_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public Partition_namesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partition_names; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterPartition_names(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitPartition_names(this);
		}
	}

	public final Partition_namesContext partition_names() throws RecognitionException {
		Partition_namesContext _localctx = new Partition_namesContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_partition_names);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(836);
			partition_name();
			setState(841);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(837);
				match(COMMA);
				setState(838);
				partition_name();
				}
				}
				setState(843);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Root_statementContext extends ParserRuleContext {
		public Data_manipulation_statementsContext data_manipulation_statements() {
			return getRuleContext(Data_manipulation_statementsContext.class,0);
		}
		public Data_definition_statementsContext data_definition_statements() {
			return getRuleContext(Data_definition_statementsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(uniformSQLParser.SEMI, 0); }
		public Root_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterRoot_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitRoot_statement(this);
		}
	}

	public final Root_statementContext root_statement() throws RecognitionException {
		Root_statementContext _localctx = new Root_statementContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_root_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
			switch (_input.LA(1)) {
			case SELECT:
			case INSERT:
			case DELETE:
			case UPDATE:
			case SERVER:
				{
				setState(844);
				data_manipulation_statements();
				}
				break;
			case SHOW:
			case CREATE:
			case ALTER:
			case DROP:
			case SET:
			case GRANT:
			case REVOKE:
			case USE:
				{
				setState(845);
				data_definition_statements();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(849);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(848);
				match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Data_manipulation_statementsContext extends ParserRuleContext {
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public Delete_statementsContext delete_statements() {
			return getRuleContext(Delete_statementsContext.class,0);
		}
		public Insert_statementsContext insert_statements() {
			return getRuleContext(Insert_statementsContext.class,0);
		}
		public Update_statementsContext update_statements() {
			return getRuleContext(Update_statementsContext.class,0);
		}
		public Server_event_statementContext server_event_statement() {
			return getRuleContext(Server_event_statementContext.class,0);
		}
		public Data_manipulation_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_manipulation_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterData_manipulation_statements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitData_manipulation_statements(this);
		}
	}

	public final Data_manipulation_statementsContext data_manipulation_statements() throws RecognitionException {
		Data_manipulation_statementsContext _localctx = new Data_manipulation_statementsContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_data_manipulation_statements);
		try {
			setState(856);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(851);
				select_statement();
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 2);
				{
				setState(852);
				delete_statements();
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 3);
				{
				setState(853);
				insert_statements();
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(854);
				update_statements();
				}
				break;
			case SERVER:
				enterOuterAlt(_localctx, 5);
				{
				setState(855);
				server_event_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Data_definition_statementsContext extends ParserRuleContext {
		public Create_database_statementContext create_database_statement() {
			return getRuleContext(Create_database_statementContext.class,0);
		}
		public Drop_database_statementContext drop_database_statement() {
			return getRuleContext(Drop_database_statementContext.class,0);
		}
		public Create_user_statementContext create_user_statement() {
			return getRuleContext(Create_user_statementContext.class,0);
		}
		public Drop_user_statementContext drop_user_statement() {
			return getRuleContext(Drop_user_statementContext.class,0);
		}
		public Grant_privilege_statementContext grant_privilege_statement() {
			return getRuleContext(Grant_privilege_statementContext.class,0);
		}
		public Revoke_privilege_statementContext revoke_privilege_statement() {
			return getRuleContext(Revoke_privilege_statementContext.class,0);
		}
		public Show_event_statementContext show_event_statement() {
			return getRuleContext(Show_event_statementContext.class,0);
		}
		public Set_event_statementContext set_event_statement() {
			return getRuleContext(Set_event_statementContext.class,0);
		}
		public Create_table_statementContext create_table_statement() {
			return getRuleContext(Create_table_statementContext.class,0);
		}
		public Alter_table_statementContext alter_table_statement() {
			return getRuleContext(Alter_table_statementContext.class,0);
		}
		public Drop_table_statementContext drop_table_statement() {
			return getRuleContext(Drop_table_statementContext.class,0);
		}
		public Drop_view_statementContext drop_view_statement() {
			return getRuleContext(Drop_view_statementContext.class,0);
		}
		public Create_view_statementContext create_view_statement() {
			return getRuleContext(Create_view_statementContext.class,0);
		}
		public Alter_view_statementContext alter_view_statement() {
			return getRuleContext(Alter_view_statementContext.class,0);
		}
		public Use_event_statementContext use_event_statement() {
			return getRuleContext(Use_event_statementContext.class,0);
		}
		public Data_definition_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_definition_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterData_definition_statements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitData_definition_statements(this);
		}
	}

	public final Data_definition_statementsContext data_definition_statements() throws RecognitionException {
		Data_definition_statementsContext _localctx = new Data_definition_statementsContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_data_definition_statements);
		try {
			setState(873);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(858);
				create_database_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(859);
				drop_database_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(860);
				create_user_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(861);
				drop_user_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(862);
				grant_privilege_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(863);
				revoke_privilege_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(864);
				show_event_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(865);
				set_event_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(866);
				create_table_statement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(867);
				alter_table_statement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(868);
				drop_table_statement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(869);
				drop_view_statement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(870);
				create_view_statement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(871);
				alter_view_statement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(872);
				use_event_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_statementContext extends ParserRuleContext {
		public List<Select_expressionContext> select_expression() {
			return getRuleContexts(Select_expressionContext.class);
		}
		public Select_expressionContext select_expression(int i) {
			return getRuleContext(Select_expressionContext.class,i);
		}
		public List<TerminalNode> UNION() { return getTokens(uniformSQLParser.UNION); }
		public TerminalNode UNION(int i) {
			return getToken(uniformSQLParser.UNION, i);
		}
		public List<TerminalNode> ALL() { return getTokens(uniformSQLParser.ALL); }
		public TerminalNode ALL(int i) {
			return getToken(uniformSQLParser.ALL, i);
		}
		public List<TerminalNode> DISTINCT() { return getTokens(uniformSQLParser.DISTINCT); }
		public TerminalNode DISTINCT(int i) {
			return getToken(uniformSQLParser.DISTINCT, i);
		}
		public Select_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterSelect_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitSelect_statement(this);
		}
	}

	public final Select_statementContext select_statement() throws RecognitionException {
		Select_statementContext _localctx = new Select_statementContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_select_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(875);
			select_expression();
			setState(883);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UNION) {
				{
				{
				setState(876);
				match(UNION);
				setState(878);
				_la = _input.LA(1);
				if (_la==ALL || _la==DISTINCT) {
					{
					setState(877);
					_la = _input.LA(1);
					if ( !(_la==ALL || _la==DISTINCT) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(880);
				select_expression();
				}
				}
				setState(885);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_expressionContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(uniformSQLParser.SELECT, 0); }
		public Select_listContext select_list() {
			return getRuleContext(Select_listContext.class,0);
		}
		public TerminalNode FROM() { return getToken(uniformSQLParser.FROM, 0); }
		public Table_referencesContext table_references() {
			return getRuleContext(Table_referencesContext.class,0);
		}
		public Orderby_clauseContext orderby_clause() {
			return getRuleContext(Orderby_clauseContext.class,0);
		}
		public Limit_clauseContext limit_clause() {
			return getRuleContext(Limit_clauseContext.class,0);
		}
		public TerminalNode ALL() { return getToken(uniformSQLParser.ALL, 0); }
		public TerminalNode DISTINCT() { return getToken(uniformSQLParser.DISTINCT, 0); }
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Groupby_clauseContext groupby_clause() {
			return getRuleContext(Groupby_clauseContext.class,0);
		}
		public Having_clauseContext having_clause() {
			return getRuleContext(Having_clauseContext.class,0);
		}
		public Select_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterSelect_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitSelect_expression(this);
		}
	}

	public final Select_expressionContext select_expression() throws RecognitionException {
		Select_expressionContext _localctx = new Select_expressionContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_select_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(886);
			match(SELECT);
			setState(888);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(887);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==DISTINCT) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			}
			setState(890);
			select_list();
			setState(902);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(891);
				match(FROM);
				setState(892);
				table_references();
				setState(894);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(893);
					where_clause();
					}
				}

				setState(897);
				_la = _input.LA(1);
				if (_la==GROUP) {
					{
					setState(896);
					groupby_clause();
					}
				}

				setState(900);
				_la = _input.LA(1);
				if (_la==HAVING) {
					{
					setState(899);
					having_clause();
					}
				}

				}
			}

			setState(905);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(904);
				orderby_clause();
				}
			}

			setState(908);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(907);
				limit_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Where_clauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(uniformSQLParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterWhere_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitWhere_clause(this);
		}
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(910);
			match(WHERE);
			setState(911);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Groupby_clauseContext extends ParserRuleContext {
		public TerminalNode GROUP() { return getToken(uniformSQLParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(uniformSQLParser.BY, 0); }
		public List<Groupby_itemContext> groupby_item() {
			return getRuleContexts(Groupby_itemContext.class);
		}
		public Groupby_itemContext groupby_item(int i) {
			return getRuleContext(Groupby_itemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public TerminalNode WITH() { return getToken(uniformSQLParser.WITH, 0); }
		public TerminalNode ROLLUP() { return getToken(uniformSQLParser.ROLLUP, 0); }
		public Groupby_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupby_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterGroupby_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitGroupby_clause(this);
		}
	}

	public final Groupby_clauseContext groupby_clause() throws RecognitionException {
		Groupby_clauseContext _localctx = new Groupby_clauseContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_groupby_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(913);
			match(GROUP);
			setState(914);
			match(BY);
			setState(915);
			groupby_item();
			setState(920);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(916);
				match(COMMA);
				setState(917);
				groupby_item();
				}
				}
				setState(922);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(925);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(923);
				match(WITH);
				setState(924);
				match(ROLLUP);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Groupby_itemContext extends ParserRuleContext {
		public Column_specContext column_spec() {
			return getRuleContext(Column_specContext.class,0);
		}
		public TerminalNode INTEGER_NUM() { return getToken(uniformSQLParser.INTEGER_NUM, 0); }
		public Bit_exprContext bit_expr() {
			return getRuleContext(Bit_exprContext.class,0);
		}
		public Groupby_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupby_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterGroupby_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitGroupby_item(this);
		}
	}

	public final Groupby_itemContext groupby_item() throws RecognitionException {
		Groupby_itemContext _localctx = new Groupby_itemContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_groupby_item);
		try {
			setState(930);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(927);
				column_spec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(928);
				match(INTEGER_NUM);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(929);
				bit_expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Having_clauseContext extends ParserRuleContext {
		public TerminalNode HAVING() { return getToken(uniformSQLParser.HAVING, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Having_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_having_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterHaving_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitHaving_clause(this);
		}
	}

	public final Having_clauseContext having_clause() throws RecognitionException {
		Having_clauseContext _localctx = new Having_clauseContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_having_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(932);
			match(HAVING);
			setState(933);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Orderby_clauseContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(uniformSQLParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(uniformSQLParser.BY, 0); }
		public List<Orderby_itemContext> orderby_item() {
			return getRuleContexts(Orderby_itemContext.class);
		}
		public Orderby_itemContext orderby_item(int i) {
			return getRuleContext(Orderby_itemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public Orderby_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderby_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterOrderby_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitOrderby_clause(this);
		}
	}

	public final Orderby_clauseContext orderby_clause() throws RecognitionException {
		Orderby_clauseContext _localctx = new Orderby_clauseContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_orderby_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(935);
			match(ORDER);
			setState(936);
			match(BY);
			setState(937);
			orderby_item();
			setState(942);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(938);
				match(COMMA);
				setState(939);
				orderby_item();
				}
				}
				setState(944);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Orderby_itemContext extends ParserRuleContext {
		public Groupby_itemContext groupby_item() {
			return getRuleContext(Groupby_itemContext.class,0);
		}
		public TerminalNode ASC() { return getToken(uniformSQLParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(uniformSQLParser.DESC, 0); }
		public Orderby_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderby_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterOrderby_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitOrderby_item(this);
		}
	}

	public final Orderby_itemContext orderby_item() throws RecognitionException {
		Orderby_itemContext _localctx = new Orderby_itemContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_orderby_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(945);
			groupby_item();
			setState(947);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(946);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Limit_clauseContext extends ParserRuleContext {
		public TerminalNode LIMIT() { return getToken(uniformSQLParser.LIMIT, 0); }
		public Row_countContext row_count() {
			return getRuleContext(Row_countContext.class,0);
		}
		public OffsetContext offset() {
			return getRuleContext(OffsetContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(uniformSQLParser.COMMA, 0); }
		public Limit_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limit_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterLimit_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitLimit_clause(this);
		}
	}

	public final Limit_clauseContext limit_clause() throws RecognitionException {
		Limit_clauseContext _localctx = new Limit_clauseContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_limit_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(949);
			match(LIMIT);
			{
			setState(953);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(950);
				offset();
				setState(951);
				match(COMMA);
				}
				break;
			}
			setState(955);
			row_count();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OffsetContext extends ParserRuleContext {
		public TerminalNode INTEGER_NUM() { return getToken(uniformSQLParser.INTEGER_NUM, 0); }
		public OffsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_offset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterOffset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitOffset(this);
		}
	}

	public final OffsetContext offset() throws RecognitionException {
		OffsetContext _localctx = new OffsetContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_offset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(957);
			match(INTEGER_NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Row_countContext extends ParserRuleContext {
		public TerminalNode INTEGER_NUM() { return getToken(uniformSQLParser.INTEGER_NUM, 0); }
		public Row_countContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row_count; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterRow_count(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitRow_count(this);
		}
	}

	public final Row_countContext row_count() throws RecognitionException {
		Row_countContext _localctx = new Row_countContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_row_count);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(959);
			match(INTEGER_NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_listContext extends ParserRuleContext {
		public List<Displayed_columnContext> displayed_column() {
			return getRuleContexts(Displayed_columnContext.class);
		}
		public Displayed_columnContext displayed_column(int i) {
			return getRuleContext(Displayed_columnContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public Select_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterSelect_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitSelect_list(this);
		}
	}

	public final Select_listContext select_list() throws RecognitionException {
		Select_listContext _localctx = new Select_listContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_select_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(961);
			displayed_column();
			setState(966);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(962);
				match(COMMA);
				setState(963);
				displayed_column();
				}
				}
				setState(968);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_listContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(uniformSQLParser.LPAREN, 0); }
		public List<Column_specContext> column_spec() {
			return getRuleContexts(Column_specContext.class);
		}
		public Column_specContext column_spec(int i) {
			return getRuleContext(Column_specContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(uniformSQLParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public Column_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterColumn_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitColumn_list(this);
		}
	}

	public final Column_listContext column_list() throws RecognitionException {
		Column_listContext _localctx = new Column_listContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_column_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(969);
			match(LPAREN);
			setState(970);
			column_spec();
			setState(975);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(971);
				match(COMMA);
				setState(972);
				column_spec();
				}
				}
				setState(977);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(978);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubqueryContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(uniformSQLParser.LPAREN, 0); }
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(uniformSQLParser.RPAREN, 0); }
		public SubqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitSubquery(this);
		}
	}

	public final SubqueryContext subquery() throws RecognitionException {
		SubqueryContext _localctx = new SubqueryContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(980);
			match(LPAREN);
			setState(981);
			select_statement();
			setState(982);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_specContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(uniformSQLParser.DOT, 0); }
		public Table_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterTable_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitTable_spec(this);
		}
	}

	public final Table_specContext table_spec() throws RecognitionException {
		Table_specContext _localctx = new Table_specContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_table_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(987);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				{
				setState(984);
				schema_name();
				setState(985);
				match(DOT);
				}
				break;
			}
			setState(989);
			table_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Displayed_columnContext extends ParserRuleContext {
		public TerminalNode ASTERISK() { return getToken(uniformSQLParser.ASTERISK, 0); }
		public Table_specContext table_spec() {
			return getRuleContext(Table_specContext.class,0);
		}
		public TerminalNode DOT() { return getToken(uniformSQLParser.DOT, 0); }
		public Column_specContext column_spec() {
			return getRuleContext(Column_specContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public Bit_exprContext bit_expr() {
			return getRuleContext(Bit_exprContext.class,0);
		}
		public Displayed_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_displayed_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterDisplayed_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitDisplayed_column(this);
		}
	}

	public final Displayed_columnContext displayed_column() throws RecognitionException {
		Displayed_columnContext _localctx = new Displayed_columnContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_displayed_column);
		try {
			setState(1004);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(991);
				match(ASTERISK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(992);
				table_spec();
				setState(993);
				match(DOT);
				setState(994);
				match(ASTERISK);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(996);
				column_spec();
				setState(998);
				switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
				case 1:
					{
					setState(997);
					alias();
					}
					break;
				}
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(1000);
				bit_expr();
				setState(1002);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					setState(1001);
					alias();
					}
					break;
				}
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_statementsContext extends ParserRuleContext {
		public Insert_statementContext insert_statement() {
			return getRuleContext(Insert_statementContext.class,0);
		}
		public Insert_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterInsert_statements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitInsert_statements(this);
		}
	}

	public final Insert_statementsContext insert_statements() throws RecognitionException {
		Insert_statementsContext _localctx = new Insert_statementsContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_insert_statements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1006);
			insert_statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_headerContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(uniformSQLParser.INSERT, 0); }
		public Table_specContext table_spec() {
			return getRuleContext(Table_specContext.class,0);
		}
		public TerminalNode IGNORE() { return getToken(uniformSQLParser.IGNORE, 0); }
		public TerminalNode INTO() { return getToken(uniformSQLParser.INTO, 0); }
		public Partition_clauseContext partition_clause() {
			return getRuleContext(Partition_clauseContext.class,0);
		}
		public TerminalNode LOW_PRIORITY() { return getToken(uniformSQLParser.LOW_PRIORITY, 0); }
		public TerminalNode HIGH_PRIORITY() { return getToken(uniformSQLParser.HIGH_PRIORITY, 0); }
		public Insert_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterInsert_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitInsert_header(this);
		}
	}

	public final Insert_headerContext insert_header() throws RecognitionException {
		Insert_headerContext _localctx = new Insert_headerContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_insert_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1008);
			match(INSERT);
			setState(1010);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				{
				setState(1009);
				_la = _input.LA(1);
				if ( !(_la==LOW_PRIORITY || _la==HIGH_PRIORITY) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			}
			setState(1013);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				{
				setState(1012);
				match(IGNORE);
				}
				break;
			}
			setState(1016);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				{
				setState(1015);
				match(INTO);
				}
				break;
			}
			setState(1018);
			table_spec();
			setState(1020);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(1019);
				partition_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_subfixContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(uniformSQLParser.ON, 0); }
		public TerminalNode DUPLICATE() { return getToken(uniformSQLParser.DUPLICATE, 0); }
		public TerminalNode KEY() { return getToken(uniformSQLParser.KEY, 0); }
		public TerminalNode UPDATE() { return getToken(uniformSQLParser.UPDATE, 0); }
		public List<Column_specContext> column_spec() {
			return getRuleContexts(Column_specContext.class);
		}
		public Column_specContext column_spec(int i) {
			return getRuleContext(Column_specContext.class,i);
		}
		public List<TerminalNode> EQ() { return getTokens(uniformSQLParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(uniformSQLParser.EQ, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public Insert_subfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_subfix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterInsert_subfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitInsert_subfix(this);
		}
	}

	public final Insert_subfixContext insert_subfix() throws RecognitionException {
		Insert_subfixContext _localctx = new Insert_subfixContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_insert_subfix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1022);
			match(ON);
			setState(1023);
			match(DUPLICATE);
			setState(1024);
			match(KEY);
			setState(1025);
			match(UPDATE);
			setState(1026);
			column_spec();
			setState(1027);
			match(EQ);
			setState(1028);
			expression();
			setState(1036);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1029);
				match(COMMA);
				setState(1030);
				column_spec();
				setState(1031);
				match(EQ);
				setState(1032);
				expression();
				}
				}
				setState(1038);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_statementContext extends ParserRuleContext {
		public Insert_headerContext insert_header() {
			return getRuleContext(Insert_headerContext.class,0);
		}
		public Select_expressionContext select_expression() {
			return getRuleContext(Select_expressionContext.class,0);
		}
		public Value_list_clauseContext value_list_clause() {
			return getRuleContext(Value_list_clauseContext.class,0);
		}
		public Column_listContext column_list() {
			return getRuleContext(Column_listContext.class,0);
		}
		public Insert_subfixContext insert_subfix() {
			return getRuleContext(Insert_subfixContext.class,0);
		}
		public Insert_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterInsert_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitInsert_statement(this);
		}
	}

	public final Insert_statementContext insert_statement() throws RecognitionException {
		Insert_statementContext _localctx = new Insert_statementContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_insert_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1039);
			insert_header();
			setState(1041);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1040);
				column_list();
				}
			}

			setState(1045);
			switch (_input.LA(1)) {
			case SELECT:
				{
				setState(1043);
				select_expression();
				}
				break;
			case VALUES:
			case VALUE:
				{
				setState(1044);
				value_list_clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1048);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(1047);
				insert_subfix();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Value_list_clauseContext extends ParserRuleContext {
		public List<Column_value_listContext> column_value_list() {
			return getRuleContexts(Column_value_listContext.class);
		}
		public Column_value_listContext column_value_list(int i) {
			return getRuleContext(Column_value_listContext.class,i);
		}
		public TerminalNode VALUES() { return getToken(uniformSQLParser.VALUES, 0); }
		public TerminalNode VALUE() { return getToken(uniformSQLParser.VALUE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public Value_list_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_list_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterValue_list_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitValue_list_clause(this);
		}
	}

	public final Value_list_clauseContext value_list_clause() throws RecognitionException {
		Value_list_clauseContext _localctx = new Value_list_clauseContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_value_list_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1050);
			_la = _input.LA(1);
			if ( !(_la==VALUES || _la==VALUE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1051);
			column_value_list();
			setState(1056);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1052);
				match(COMMA);
				setState(1053);
				column_value_list();
				}
				}
				setState(1058);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_value_listContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(uniformSQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(uniformSQLParser.RPAREN, 0); }
		public List<Bit_exprContext> bit_expr() {
			return getRuleContexts(Bit_exprContext.class);
		}
		public Bit_exprContext bit_expr(int i) {
			return getRuleContext(Bit_exprContext.class,i);
		}
		public List<TerminalNode> DEFAULT() { return getTokens(uniformSQLParser.DEFAULT); }
		public TerminalNode DEFAULT(int i) {
			return getToken(uniformSQLParser.DEFAULT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public Column_value_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_value_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterColumn_value_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitColumn_value_list(this);
		}
	}

	public final Column_value_listContext column_value_list() throws RecognitionException {
		Column_value_listContext _localctx = new Column_value_listContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_column_value_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1059);
			match(LPAREN);
			setState(1062);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				{
				setState(1060);
				bit_expr();
				}
				break;
			case 2:
				{
				setState(1061);
				match(DEFAULT);
				}
				break;
			}
			setState(1071);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1064);
				match(COMMA);
				setState(1067);
				switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
				case 1:
					{
					setState(1065);
					bit_expr();
					}
					break;
				case 2:
					{
					setState(1066);
					match(DEFAULT);
					}
					break;
				}
				}
				}
				setState(1073);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1074);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_columns_cluaseContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(uniformSQLParser.SET, 0); }
		public List<Set_column_cluaseContext> set_column_cluase() {
			return getRuleContexts(Set_column_cluaseContext.class);
		}
		public Set_column_cluaseContext set_column_cluase(int i) {
			return getRuleContext(Set_column_cluaseContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public Set_columns_cluaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_columns_cluase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterSet_columns_cluase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitSet_columns_cluase(this);
		}
	}

	public final Set_columns_cluaseContext set_columns_cluase() throws RecognitionException {
		Set_columns_cluaseContext _localctx = new Set_columns_cluaseContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_set_columns_cluase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1076);
			match(SET);
			setState(1077);
			set_column_cluase();
			setState(1082);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1078);
				match(COMMA);
				setState(1079);
				set_column_cluase();
				}
				}
				setState(1084);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_column_cluaseContext extends ParserRuleContext {
		public Column_specContext column_spec() {
			return getRuleContext(Column_specContext.class,0);
		}
		public TerminalNode EQ() { return getToken(uniformSQLParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(uniformSQLParser.DEFAULT, 0); }
		public Set_column_cluaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_column_cluase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterSet_column_cluase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitSet_column_cluase(this);
		}
	}

	public final Set_column_cluaseContext set_column_cluase() throws RecognitionException {
		Set_column_cluaseContext _localctx = new Set_column_cluaseContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_set_column_cluase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1085);
			column_spec();
			setState(1086);
			match(EQ);
			setState(1089);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				{
				setState(1087);
				expression();
				}
				break;
			case 2:
				{
				setState(1088);
				match(DEFAULT);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_database_statementContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(uniformSQLParser.CREATE, 0); }
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode DATABASE() { return getToken(uniformSQLParser.DATABASE, 0); }
		public TerminalNode SCHEMA() { return getToken(uniformSQLParser.SCHEMA, 0); }
		public TerminalNode IF() { return getToken(uniformSQLParser.IF, 0); }
		public TerminalNode NOT() { return getToken(uniformSQLParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(uniformSQLParser.EXISTS, 0); }
		public Create_database_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_database_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterCreate_database_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitCreate_database_statement(this);
		}
	}

	public final Create_database_statementContext create_database_statement() throws RecognitionException {
		Create_database_statementContext _localctx = new Create_database_statementContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_create_database_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1091);
			match(CREATE);
			setState(1092);
			_la = _input.LA(1);
			if ( !(_la==DATABASE || _la==SCHEMA) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1096);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				{
				setState(1093);
				match(IF);
				setState(1094);
				match(NOT);
				setState(1095);
				match(EXISTS);
				}
				break;
			}
			setState(1098);
			schema_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_database_statementContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(uniformSQLParser.DROP, 0); }
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode DATABASE() { return getToken(uniformSQLParser.DATABASE, 0); }
		public TerminalNode SCHEMA() { return getToken(uniformSQLParser.SCHEMA, 0); }
		public TerminalNode IF() { return getToken(uniformSQLParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(uniformSQLParser.EXISTS, 0); }
		public Drop_database_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_database_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterDrop_database_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitDrop_database_statement(this);
		}
	}

	public final Drop_database_statementContext drop_database_statement() throws RecognitionException {
		Drop_database_statementContext _localctx = new Drop_database_statementContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_drop_database_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1100);
			match(DROP);
			setState(1101);
			_la = _input.LA(1);
			if ( !(_la==DATABASE || _la==SCHEMA) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1104);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				{
				setState(1102);
				match(IF);
				setState(1103);
				match(EXISTS);
				}
				break;
			}
			setState(1106);
			schema_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_statementContext extends ParserRuleContext {
		public Create_table_statement1Context create_table_statement1() {
			return getRuleContext(Create_table_statement1Context.class,0);
		}
		public Create_table_statement2Context create_table_statement2() {
			return getRuleContext(Create_table_statement2Context.class,0);
		}
		public Create_table_statement3Context create_table_statement3() {
			return getRuleContext(Create_table_statement3Context.class,0);
		}
		public Create_table_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterCreate_table_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitCreate_table_statement(this);
		}
	}

	public final Create_table_statementContext create_table_statement() throws RecognitionException {
		Create_table_statementContext _localctx = new Create_table_statementContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_create_table_statement);
		try {
			setState(1111);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1108);
				create_table_statement1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1109);
				create_table_statement2();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1110);
				create_table_statement3();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_statement1Context extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(uniformSQLParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(uniformSQLParser.TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(uniformSQLParser.TEMPORARY, 0); }
		public TerminalNode EXTERNAL() { return getToken(uniformSQLParser.EXTERNAL, 0); }
		public TerminalNode IF() { return getToken(uniformSQLParser.IF, 0); }
		public TerminalNode NOT() { return getToken(uniformSQLParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(uniformSQLParser.EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(uniformSQLParser.DOT, 0); }
		public TerminalNode LPAREN() { return getToken(uniformSQLParser.LPAREN, 0); }
		public List<Create_definitionContext> create_definition() {
			return getRuleContexts(Create_definitionContext.class);
		}
		public Create_definitionContext create_definition(int i) {
			return getRuleContext(Create_definitionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(uniformSQLParser.RPAREN, 0); }
		public TerminalNode COMMENT() { return getToken(uniformSQLParser.COMMENT, 0); }
		public TerminalNode TEXT_STRING() { return getToken(uniformSQLParser.TEXT_STRING, 0); }
		public TerminalNode AS() { return getToken(uniformSQLParser.AS, 0); }
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public Create_table_statement1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_statement1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterCreate_table_statement1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitCreate_table_statement1(this);
		}
	}

	public final Create_table_statement1Context create_table_statement1() throws RecognitionException {
		Create_table_statement1Context _localctx = new Create_table_statement1Context(_ctx, getState());
		enterRule(_localctx, 224, RULE_create_table_statement1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1113);
			match(CREATE);
			setState(1115);
			_la = _input.LA(1);
			if (_la==TEMPORARY) {
				{
				setState(1114);
				match(TEMPORARY);
				}
			}

			setState(1118);
			_la = _input.LA(1);
			if (_la==EXTERNAL) {
				{
				setState(1117);
				match(EXTERNAL);
				}
			}

			setState(1120);
			match(TABLE);
			setState(1124);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				{
				setState(1121);
				match(IF);
				setState(1122);
				match(NOT);
				setState(1123);
				match(EXISTS);
				}
				break;
			}
			setState(1129);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				{
				setState(1126);
				database_name();
				setState(1127);
				match(DOT);
				}
				break;
			}
			setState(1131);
			table_name();
			setState(1143);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1132);
				match(LPAREN);
				setState(1133);
				create_definition();
				setState(1138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1134);
					match(COMMA);
					setState(1135);
					create_definition();
					}
					}
					setState(1140);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1141);
				match(RPAREN);
				}
			}

			setState(1147);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(1145);
				match(COMMENT);
				setState(1146);
				match(TEXT_STRING);
				}
			}

			setState(1151);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1149);
				match(AS);
				setState(1150);
				select_statement();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_statement2Context extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(uniformSQLParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(uniformSQLParser.TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode AS() { return getToken(uniformSQLParser.AS, 0); }
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(uniformSQLParser.TEMPORARY, 0); }
		public TerminalNode EXTERNAL() { return getToken(uniformSQLParser.EXTERNAL, 0); }
		public TerminalNode IF() { return getToken(uniformSQLParser.IF, 0); }
		public TerminalNode NOT() { return getToken(uniformSQLParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(uniformSQLParser.EXISTS, 0); }
		public Create_table_statement2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_statement2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterCreate_table_statement2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitCreate_table_statement2(this);
		}
	}

	public final Create_table_statement2Context create_table_statement2() throws RecognitionException {
		Create_table_statement2Context _localctx = new Create_table_statement2Context(_ctx, getState());
		enterRule(_localctx, 226, RULE_create_table_statement2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1153);
			match(CREATE);
			setState(1155);
			_la = _input.LA(1);
			if (_la==TEMPORARY) {
				{
				setState(1154);
				match(TEMPORARY);
				}
			}

			setState(1158);
			_la = _input.LA(1);
			if (_la==EXTERNAL) {
				{
				setState(1157);
				match(EXTERNAL);
				}
			}

			setState(1160);
			match(TABLE);
			setState(1164);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				{
				setState(1161);
				match(IF);
				setState(1162);
				match(NOT);
				setState(1163);
				match(EXISTS);
				}
				break;
			}
			setState(1166);
			table_name();
			setState(1167);
			match(AS);
			setState(1168);
			select_statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_statement3Context extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(uniformSQLParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(uniformSQLParser.TABLE, 0); }
		public List<Table_nameContext> table_name() {
			return getRuleContexts(Table_nameContext.class);
		}
		public Table_nameContext table_name(int i) {
			return getRuleContext(Table_nameContext.class,i);
		}
		public TerminalNode TEMPORARY() { return getToken(uniformSQLParser.TEMPORARY, 0); }
		public TerminalNode EXTERNAL() { return getToken(uniformSQLParser.EXTERNAL, 0); }
		public TerminalNode IF() { return getToken(uniformSQLParser.IF, 0); }
		public TerminalNode NOT() { return getToken(uniformSQLParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(uniformSQLParser.EXISTS, 0); }
		public TerminalNode LIKE() { return getToken(uniformSQLParser.LIKE, 0); }
		public TerminalNode LPAREN() { return getToken(uniformSQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(uniformSQLParser.RPAREN, 0); }
		public Create_table_statement3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_statement3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterCreate_table_statement3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitCreate_table_statement3(this);
		}
	}

	public final Create_table_statement3Context create_table_statement3() throws RecognitionException {
		Create_table_statement3Context _localctx = new Create_table_statement3Context(_ctx, getState());
		enterRule(_localctx, 228, RULE_create_table_statement3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1170);
			match(CREATE);
			setState(1172);
			_la = _input.LA(1);
			if (_la==TEMPORARY) {
				{
				setState(1171);
				match(TEMPORARY);
				}
			}

			setState(1175);
			_la = _input.LA(1);
			if (_la==EXTERNAL) {
				{
				setState(1174);
				match(EXTERNAL);
				}
			}

			setState(1177);
			match(TABLE);
			setState(1181);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				{
				setState(1178);
				match(IF);
				setState(1179);
				match(NOT);
				setState(1180);
				match(EXISTS);
				}
				break;
			}
			setState(1183);
			table_name();
			setState(1191);
			switch (_input.LA(1)) {
			case LIKE:
				{
				{
				setState(1184);
				match(LIKE);
				setState(1185);
				table_name();
				}
				}
				break;
			case LPAREN:
				{
				{
				setState(1186);
				match(LPAREN);
				setState(1187);
				match(LIKE);
				setState(1188);
				table_name();
				setState(1189);
				match(RPAREN);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_definitionContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Column_definitionContext column_definition() {
			return getRuleContext(Column_definitionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(uniformSQLParser.LPAREN, 0); }
		public List<Index_column_nameContext> index_column_name() {
			return getRuleContexts(Index_column_nameContext.class);
		}
		public Index_column_nameContext index_column_name(int i) {
			return getRuleContext(Index_column_nameContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(uniformSQLParser.RPAREN, 0); }
		public TerminalNode INDEX() { return getToken(uniformSQLParser.INDEX, 0); }
		public TerminalNode KEY() { return getToken(uniformSQLParser.KEY, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public Index_typeContext index_type() {
			return getRuleContext(Index_typeContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public List<Index_optionContext> index_option() {
			return getRuleContexts(Index_optionContext.class);
		}
		public Index_optionContext index_option(int i) {
			return getRuleContext(Index_optionContext.class,i);
		}
		public Create_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterCreate_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitCreate_definition(this);
		}
	}

	public final Create_definitionContext create_definition() throws RecognitionException {
		Create_definitionContext _localctx = new Create_definitionContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_create_definition);
		int _la;
		try {
			setState(1219);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1193);
				column_name();
				setState(1194);
				column_definition();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1196);
				_la = _input.LA(1);
				if ( !(_la==INDEX || _la==KEY) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1198);
				switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
				case 1:
					{
					setState(1197);
					index_name();
					}
					break;
				}
				setState(1201);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(1200);
					index_type();
					}
				}

				setState(1203);
				match(LPAREN);
				setState(1204);
				index_column_name();
				setState(1209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1205);
					match(COMMA);
					setState(1206);
					index_column_name();
					}
					}
					setState(1211);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1212);
				match(RPAREN);
				setState(1216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==USING || _la==COMMENT) {
					{
					{
					setState(1213);
					index_option();
					}
					}
					setState(1218);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_definitionContext extends ParserRuleContext {
		public Column_data_type_headerContext column_data_type_header() {
			return getRuleContext(Column_data_type_headerContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(uniformSQLParser.COMMENT, 0); }
		public TerminalNode TEXT_STRING() { return getToken(uniformSQLParser.TEXT_STRING, 0); }
		public Reference_definitionContext reference_definition() {
			return getRuleContext(Reference_definitionContext.class,0);
		}
		public Column_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterColumn_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitColumn_definition(this);
		}
	}

	public final Column_definitionContext column_definition() throws RecognitionException {
		Column_definitionContext _localctx = new Column_definitionContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_column_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1221);
			column_data_type_header();
			setState(1224);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(1222);
				match(COMMENT);
				setState(1223);
				match(TEXT_STRING);
				}
			}

			setState(1227);
			_la = _input.LA(1);
			if (_la==REFERENCES) {
				{
				setState(1226);
				reference_definition();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Null_or_notnullContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(uniformSQLParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(uniformSQLParser.NULL, 0); }
		public Null_or_notnullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_or_notnull; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterNull_or_notnull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitNull_or_notnull(this);
		}
	}

	public final Null_or_notnullContext null_or_notnull() throws RecognitionException {
		Null_or_notnullContext _localctx = new Null_or_notnullContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_null_or_notnull);
		try {
			setState(1232);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1229);
				match(NOT);
				setState(1230);
				match(NULL);
				}
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1231);
				match(NULL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_data_type_headerContext extends ParserRuleContext {
		public TerminalNode TINYINT() { return getToken(uniformSQLParser.TINYINT, 0); }
		public TerminalNode LPAREN() { return getToken(uniformSQLParser.LPAREN, 0); }
		public LengthContext length() {
			return getRuleContext(LengthContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(uniformSQLParser.RPAREN, 0); }
		public TerminalNode UNSIGNED() { return getToken(uniformSQLParser.UNSIGNED, 0); }
		public Null_or_notnullContext null_or_notnull() {
			return getRuleContext(Null_or_notnullContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(uniformSQLParser.DEFAULT, 0); }
		public List<Number_literalContext> number_literal() {
			return getRuleContexts(Number_literalContext.class);
		}
		public Number_literalContext number_literal(int i) {
			return getRuleContext(Number_literalContext.class,i);
		}
		public TerminalNode SMALLINT() { return getToken(uniformSQLParser.SMALLINT, 0); }
		public TerminalNode INT() { return getToken(uniformSQLParser.INT, 0); }
		public TerminalNode BIGINT() { return getToken(uniformSQLParser.BIGINT, 0); }
		public TerminalNode DOUBLE() { return getToken(uniformSQLParser.DOUBLE, 0); }
		public TerminalNode COMMA() { return getToken(uniformSQLParser.COMMA, 0); }
		public TerminalNode FLOAT() { return getToken(uniformSQLParser.FLOAT, 0); }
		public TerminalNode DECIMAL() { return getToken(uniformSQLParser.DECIMAL, 0); }
		public TerminalNode DATE() { return getToken(uniformSQLParser.DATE, 0); }
		public TerminalNode TEXT_STRING() { return getToken(uniformSQLParser.TEXT_STRING, 0); }
		public TerminalNode TIMESTAMP() { return getToken(uniformSQLParser.TIMESTAMP, 0); }
		public TerminalNode DATETIME() { return getToken(uniformSQLParser.DATETIME, 0); }
		public TerminalNode VARCHAR() { return getToken(uniformSQLParser.VARCHAR, 0); }
		public Varchar_lengthContext varchar_length() {
			return getRuleContext(Varchar_lengthContext.class,0);
		}
		public TerminalNode BINARY() { return getToken(uniformSQLParser.BINARY, 0); }
		public Binary_lengthContext binary_length() {
			return getRuleContext(Binary_lengthContext.class,0);
		}
		public TerminalNode BOOLEAN() { return getToken(uniformSQLParser.BOOLEAN, 0); }
		public Column_data_type_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_data_type_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterColumn_data_type_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitColumn_data_type_header(this);
		}
	}

	public final Column_data_type_headerContext column_data_type_header() throws RecognitionException {
		Column_data_type_headerContext _localctx = new Column_data_type_headerContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_column_data_type_header);
		int _la;
		try {
			setState(1418);
			switch (_input.LA(1)) {
			case TINYINT:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1234);
				match(TINYINT);
				setState(1239);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1235);
					match(LPAREN);
					setState(1236);
					length();
					setState(1237);
					match(RPAREN);
					}
				}

				setState(1242);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(1241);
					match(UNSIGNED);
					}
				}

				setState(1245);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1244);
					null_or_notnull();
					}
				}

				setState(1249);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1247);
					match(DEFAULT);
					setState(1248);
					number_literal();
					}
				}

				}
				}
				break;
			case SMALLINT:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1251);
				match(SMALLINT);
				setState(1256);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1252);
					match(LPAREN);
					setState(1253);
					length();
					setState(1254);
					match(RPAREN);
					}
				}

				setState(1259);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(1258);
					match(UNSIGNED);
					}
				}

				setState(1262);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1261);
					null_or_notnull();
					}
				}

				setState(1266);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1264);
					match(DEFAULT);
					setState(1265);
					number_literal();
					}
				}

				}
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(1268);
				match(INT);
				setState(1273);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1269);
					match(LPAREN);
					setState(1270);
					length();
					setState(1271);
					match(RPAREN);
					}
				}

				setState(1276);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(1275);
					match(UNSIGNED);
					}
				}

				setState(1279);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1278);
					null_or_notnull();
					}
				}

				setState(1283);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1281);
					match(DEFAULT);
					setState(1282);
					number_literal();
					}
				}

				}
				}
				break;
			case BIGINT:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(1285);
				match(BIGINT);
				setState(1290);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1286);
					match(LPAREN);
					setState(1287);
					length();
					setState(1288);
					match(RPAREN);
					}
				}

				setState(1293);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(1292);
					match(UNSIGNED);
					}
				}

				setState(1296);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1295);
					null_or_notnull();
					}
				}

				setState(1300);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1298);
					match(DEFAULT);
					setState(1299);
					number_literal();
					}
				}

				}
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(1302);
				match(DOUBLE);
				setState(1309);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1303);
					match(LPAREN);
					setState(1304);
					length();
					setState(1305);
					match(COMMA);
					setState(1306);
					number_literal();
					setState(1307);
					match(RPAREN);
					}
				}

				setState(1312);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(1311);
					match(UNSIGNED);
					}
				}

				setState(1315);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1314);
					null_or_notnull();
					}
				}

				setState(1319);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1317);
					match(DEFAULT);
					setState(1318);
					number_literal();
					}
				}

				}
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(1321);
				match(FLOAT);
				setState(1328);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1322);
					match(LPAREN);
					setState(1323);
					length();
					setState(1324);
					match(COMMA);
					setState(1325);
					number_literal();
					setState(1326);
					match(RPAREN);
					}
				}

				setState(1331);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(1330);
					match(UNSIGNED);
					}
				}

				setState(1334);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1333);
					null_or_notnull();
					}
				}

				setState(1338);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1336);
					match(DEFAULT);
					setState(1337);
					number_literal();
					}
				}

				}
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(1340);
				match(DECIMAL);
				setState(1349);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1341);
					match(LPAREN);
					setState(1342);
					length();
					setState(1345);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(1343);
						match(COMMA);
						setState(1344);
						number_literal();
						}
					}

					setState(1347);
					match(RPAREN);
					}
				}

				setState(1352);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(1351);
					match(UNSIGNED);
					}
				}

				setState(1355);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1354);
					null_or_notnull();
					}
				}

				setState(1359);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1357);
					match(DEFAULT);
					setState(1358);
					number_literal();
					}
				}

				}
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(1361);
				match(DATE);
				setState(1363);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1362);
					null_or_notnull();
					}
				}

				setState(1367);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1365);
					match(DEFAULT);
					setState(1366);
					match(TEXT_STRING);
					}
				}

				}
				}
				break;
			case TIMESTAMP:
				enterOuterAlt(_localctx, 9);
				{
				{
				setState(1369);
				match(TIMESTAMP);
				setState(1371);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1370);
					null_or_notnull();
					}
				}

				setState(1375);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1373);
					match(DEFAULT);
					setState(1374);
					match(TEXT_STRING);
					}
				}

				}
				}
				break;
			case DATETIME:
				enterOuterAlt(_localctx, 10);
				{
				{
				setState(1377);
				match(DATETIME);
				setState(1379);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1378);
					null_or_notnull();
					}
				}

				setState(1383);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1381);
					match(DEFAULT);
					setState(1382);
					match(TEXT_STRING);
					}
				}

				}
				}
				break;
			case VARCHAR:
				enterOuterAlt(_localctx, 11);
				{
				{
				setState(1385);
				match(VARCHAR);
				setState(1386);
				match(LPAREN);
				setState(1387);
				varchar_length();
				setState(1388);
				match(RPAREN);
				setState(1390);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1389);
					null_or_notnull();
					}
				}

				setState(1394);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1392);
					match(DEFAULT);
					setState(1393);
					match(TEXT_STRING);
					}
				}

				}
				}
				break;
			case BINARY:
				enterOuterAlt(_localctx, 12);
				{
				{
				setState(1396);
				match(BINARY);
				setState(1401);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1397);
					match(LPAREN);
					setState(1398);
					binary_length();
					setState(1399);
					match(RPAREN);
					}
				}

				setState(1404);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1403);
					null_or_notnull();
					}
				}

				setState(1408);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1406);
					match(DEFAULT);
					setState(1407);
					match(TEXT_STRING);
					}
				}

				}
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 13);
				{
				{
				setState(1410);
				match(BOOLEAN);
				setState(1412);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1411);
					null_or_notnull();
					}
				}

				setState(1416);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1414);
					match(DEFAULT);
					setState(1415);
					match(TEXT_STRING);
					}
				}

				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_column_nameContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(uniformSQLParser.LPAREN, 0); }
		public TerminalNode INTEGER_NUM() { return getToken(uniformSQLParser.INTEGER_NUM, 0); }
		public TerminalNode RPAREN() { return getToken(uniformSQLParser.RPAREN, 0); }
		public TerminalNode ASC() { return getToken(uniformSQLParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(uniformSQLParser.DESC, 0); }
		public Index_column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterIndex_column_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitIndex_column_name(this);
		}
	}

	public final Index_column_nameContext index_column_name() throws RecognitionException {
		Index_column_nameContext _localctx = new Index_column_nameContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_index_column_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1420);
			column_name();
			setState(1424);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1421);
				match(LPAREN);
				setState(1422);
				match(INTEGER_NUM);
				setState(1423);
				match(RPAREN);
				}
			}

			setState(1427);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1426);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Reference_definitionContext extends ParserRuleContext {
		public TerminalNode REFERENCES() { return getToken(uniformSQLParser.REFERENCES, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(uniformSQLParser.LPAREN, 0); }
		public List<Index_column_nameContext> index_column_name() {
			return getRuleContexts(Index_column_nameContext.class);
		}
		public Index_column_nameContext index_column_name(int i) {
			return getRuleContext(Index_column_nameContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(uniformSQLParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public List<TerminalNode> ON() { return getTokens(uniformSQLParser.ON); }
		public TerminalNode ON(int i) {
			return getToken(uniformSQLParser.ON, i);
		}
		public TerminalNode DELETE() { return getToken(uniformSQLParser.DELETE, 0); }
		public List<Reference_optionContext> reference_option() {
			return getRuleContexts(Reference_optionContext.class);
		}
		public Reference_optionContext reference_option(int i) {
			return getRuleContext(Reference_optionContext.class,i);
		}
		public TerminalNode UPDATE() { return getToken(uniformSQLParser.UPDATE, 0); }
		public Reference_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterReference_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitReference_definition(this);
		}
	}

	public final Reference_definitionContext reference_definition() throws RecognitionException {
		Reference_definitionContext _localctx = new Reference_definitionContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_reference_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1429);
			match(REFERENCES);
			setState(1430);
			table_name();
			setState(1431);
			match(LPAREN);
			setState(1432);
			index_column_name();
			setState(1437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1433);
				match(COMMA);
				setState(1434);
				index_column_name();
				}
				}
				setState(1439);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1440);
			match(RPAREN);
			setState(1444);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				{
				setState(1441);
				match(ON);
				setState(1442);
				match(DELETE);
				setState(1443);
				reference_option();
				}
				break;
			}
			setState(1449);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(1446);
				match(ON);
				setState(1447);
				match(UPDATE);
				setState(1448);
				reference_option();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Reference_optionContext extends ParserRuleContext {
		public TerminalNode RESTRICT() { return getToken(uniformSQLParser.RESTRICT, 0); }
		public TerminalNode CASCADE() { return getToken(uniformSQLParser.CASCADE, 0); }
		public TerminalNode SET() { return getToken(uniformSQLParser.SET, 0); }
		public TerminalNode NULL() { return getToken(uniformSQLParser.NULL, 0); }
		public Reference_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterReference_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitReference_option(this);
		}
	}

	public final Reference_optionContext reference_option() throws RecognitionException {
		Reference_optionContext _localctx = new Reference_optionContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_reference_option);
		try {
			setState(1455);
			switch (_input.LA(1)) {
			case RESTRICT:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1451);
				match(RESTRICT);
				}
				}
				break;
			case CASCADE:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1452);
				match(CASCADE);
				}
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(1453);
				match(SET);
				setState(1454);
				match(NULL);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LengthContext extends ParserRuleContext {
		public TerminalNode INTEGER_NUM() { return getToken(uniformSQLParser.INTEGER_NUM, 0); }
		public LengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_length; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterLength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitLength(this);
		}
	}

	public final LengthContext length() throws RecognitionException {
		LengthContext _localctx = new LengthContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1457);
			match(INTEGER_NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Varchar_lengthContext extends ParserRuleContext {
		public TerminalNode INTEGER_NUM() { return getToken(uniformSQLParser.INTEGER_NUM, 0); }
		public Varchar_lengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varchar_length; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterVarchar_length(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitVarchar_length(this);
		}
	}

	public final Varchar_lengthContext varchar_length() throws RecognitionException {
		Varchar_lengthContext _localctx = new Varchar_lengthContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_varchar_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1459);
			match(INTEGER_NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Binary_lengthContext extends ParserRuleContext {
		public TerminalNode INTEGER_NUM() { return getToken(uniformSQLParser.INTEGER_NUM, 0); }
		public Binary_lengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_length; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterBinary_length(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitBinary_length(this);
		}
	}

	public final Binary_lengthContext binary_length() throws RecognitionException {
		Binary_lengthContext _localctx = new Binary_lengthContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_binary_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1461);
			match(INTEGER_NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_table_statementContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(uniformSQLParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(uniformSQLParser.TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<Alter_table_specificationContext> alter_table_specification() {
			return getRuleContexts(Alter_table_specificationContext.class);
		}
		public Alter_table_specificationContext alter_table_specification(int i) {
			return getRuleContext(Alter_table_specificationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public Alter_table_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterAlter_table_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitAlter_table_statement(this);
		}
	}

	public final Alter_table_statementContext alter_table_statement() throws RecognitionException {
		Alter_table_statementContext _localctx = new Alter_table_statementContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_alter_table_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1463);
			match(ALTER);
			setState(1464);
			match(TABLE);
			setState(1465);
			table_name();
			setState(1474);
			_la = _input.LA(1);
			if (_la==CHANGE || _la==RENAME) {
				{
				setState(1466);
				alter_table_specification();
				setState(1471);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1467);
					match(COMMA);
					setState(1468);
					alter_table_specification();
					}
					}
					setState(1473);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_table_specificationContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(uniformSQLParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(uniformSQLParser.TO, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode CHANGE() { return getToken(uniformSQLParser.CHANGE, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode COLUMN() { return getToken(uniformSQLParser.COLUMN, 0); }
		public Alter_table_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterAlter_table_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitAlter_table_specification(this);
		}
	}

	public final Alter_table_specificationContext alter_table_specification() throws RecognitionException {
		Alter_table_specificationContext _localctx = new Alter_table_specificationContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_alter_table_specification);
		try {
			setState(1486);
			switch (_input.LA(1)) {
			case RENAME:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1476);
				match(RENAME);
				setState(1477);
				match(TO);
				setState(1478);
				table_name();
				}
				}
				break;
			case CHANGE:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1479);
				match(CHANGE);
				setState(1481);
				switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
				case 1:
					{
					setState(1480);
					match(COLUMN);
					}
					break;
				}
				setState(1483);
				column_name();
				setState(1484);
				column_name();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_column_namesContext extends ParserRuleContext {
		public List<Index_column_nameContext> index_column_name() {
			return getRuleContexts(Index_column_nameContext.class);
		}
		public Index_column_nameContext index_column_name(int i) {
			return getRuleContext(Index_column_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public Index_column_namesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_column_names; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterIndex_column_names(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitIndex_column_names(this);
		}
	}

	public final Index_column_namesContext index_column_names() throws RecognitionException {
		Index_column_namesContext _localctx = new Index_column_namesContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_index_column_names);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1488);
			index_column_name();
			setState(1493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1489);
				match(COMMA);
				setState(1490);
				index_column_name();
				}
				}
				setState(1495);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_typeContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(uniformSQLParser.USING, 0); }
		public TerminalNode HASH() { return getToken(uniformSQLParser.HASH, 0); }
		public Index_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterIndex_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitIndex_type(this);
		}
	}

	public final Index_typeContext index_type() throws RecognitionException {
		Index_typeContext _localctx = new Index_typeContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_index_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1496);
			match(USING);
			{
			setState(1497);
			match(HASH);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_optionContext extends ParserRuleContext {
		public Index_typeContext index_type() {
			return getRuleContext(Index_typeContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(uniformSQLParser.COMMENT, 0); }
		public TerminalNode TEXT_STRING() { return getToken(uniformSQLParser.TEXT_STRING, 0); }
		public Index_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterIndex_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitIndex_option(this);
		}
	}

	public final Index_optionContext index_option() throws RecognitionException {
		Index_optionContext _localctx = new Index_optionContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_index_option);
		try {
			setState(1502);
			switch (_input.LA(1)) {
			case USING:
				enterOuterAlt(_localctx, 1);
				{
				setState(1499);
				index_type();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1500);
				match(COMMENT);
				setState(1501);
				match(TEXT_STRING);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_definitionsContext extends ParserRuleContext {
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<Column_definitionContext> column_definition() {
			return getRuleContexts(Column_definitionContext.class);
		}
		public Column_definitionContext column_definition(int i) {
			return getRuleContext(Column_definitionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public Column_definitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_definitions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterColumn_definitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitColumn_definitions(this);
		}
	}

	public final Column_definitionsContext column_definitions() throws RecognitionException {
		Column_definitionsContext _localctx = new Column_definitionsContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_column_definitions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1504);
			column_name();
			setState(1505);
			column_definition();
			setState(1512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1506);
				match(COMMA);
				setState(1507);
				column_name();
				setState(1508);
				column_definition();
				}
				}
				setState(1514);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rename_table_statementContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(uniformSQLParser.RENAME, 0); }
		public TerminalNode TABLE() { return getToken(uniformSQLParser.TABLE, 0); }
		public List<Table_nameContext> table_name() {
			return getRuleContexts(Table_nameContext.class);
		}
		public Table_nameContext table_name(int i) {
			return getRuleContext(Table_nameContext.class,i);
		}
		public List<TerminalNode> TO() { return getTokens(uniformSQLParser.TO); }
		public TerminalNode TO(int i) {
			return getToken(uniformSQLParser.TO, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public Rename_table_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rename_table_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterRename_table_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitRename_table_statement(this);
		}
	}

	public final Rename_table_statementContext rename_table_statement() throws RecognitionException {
		Rename_table_statementContext _localctx = new Rename_table_statementContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_rename_table_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1515);
			match(RENAME);
			setState(1516);
			match(TABLE);
			setState(1517);
			table_name();
			setState(1518);
			match(TO);
			setState(1519);
			table_name();
			setState(1527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1520);
				match(COMMA);
				setState(1521);
				table_name();
				setState(1522);
				match(TO);
				setState(1523);
				table_name();
				}
				}
				setState(1529);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_table_statementContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(uniformSQLParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(uniformSQLParser.TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode IF() { return getToken(uniformSQLParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(uniformSQLParser.EXISTS, 0); }
		public Drop_table_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_table_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterDrop_table_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitDrop_table_statement(this);
		}
	}

	public final Drop_table_statementContext drop_table_statement() throws RecognitionException {
		Drop_table_statementContext _localctx = new Drop_table_statementContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_drop_table_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1530);
			match(DROP);
			setState(1531);
			match(TABLE);
			setState(1534);
			switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
			case 1:
				{
				setState(1532);
				match(IF);
				setState(1533);
				match(EXISTS);
				}
				break;
			}
			setState(1536);
			table_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_view_statementContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(uniformSQLParser.DROP, 0); }
		public TerminalNode VIEW() { return getToken(uniformSQLParser.VIEW, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode IF() { return getToken(uniformSQLParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(uniformSQLParser.EXISTS, 0); }
		public Drop_view_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_view_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterDrop_view_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitDrop_view_statement(this);
		}
	}

	public final Drop_view_statementContext drop_view_statement() throws RecognitionException {
		Drop_view_statementContext _localctx = new Drop_view_statementContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_drop_view_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1538);
			match(DROP);
			setState(1539);
			match(VIEW);
			setState(1542);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				{
				setState(1540);
				match(IF);
				setState(1541);
				match(EXISTS);
				}
				break;
			}
			setState(1544);
			table_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Truncate_table_statementContext extends ParserRuleContext {
		public TerminalNode TRUNCATE() { return getToken(uniformSQLParser.TRUNCATE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(uniformSQLParser.TABLE, 0); }
		public Truncate_table_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_truncate_table_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterTruncate_table_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitTruncate_table_statement(this);
		}
	}

	public final Truncate_table_statementContext truncate_table_statement() throws RecognitionException {
		Truncate_table_statementContext _localctx = new Truncate_table_statementContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_truncate_table_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1546);
			match(TRUNCATE);
			setState(1548);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				{
				setState(1547);
				match(TABLE);
				}
				break;
			}
			setState(1550);
			table_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_view_statementContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(uniformSQLParser.CREATE, 0); }
		public Create_view_bodyContext create_view_body() {
			return getRuleContext(Create_view_bodyContext.class,0);
		}
		public Create_view_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_view_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterCreate_view_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitCreate_view_statement(this);
		}
	}

	public final Create_view_statementContext create_view_statement() throws RecognitionException {
		Create_view_statementContext _localctx = new Create_view_statementContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_create_view_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1552);
			match(CREATE);
			setState(1553);
			create_view_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_view_bodyContext extends ParserRuleContext {
		public TerminalNode VIEW() { return getToken(uniformSQLParser.VIEW, 0); }
		public View_nameContext view_name() {
			return getRuleContext(View_nameContext.class,0);
		}
		public TerminalNode AS() { return getToken(uniformSQLParser.AS, 0); }
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(uniformSQLParser.DOT, 0); }
		public TerminalNode IF() { return getToken(uniformSQLParser.IF, 0); }
		public TerminalNode NOT() { return getToken(uniformSQLParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(uniformSQLParser.EXISTS, 0); }
		public Column_listContext column_list() {
			return getRuleContext(Column_listContext.class,0);
		}
		public Create_view_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_view_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterCreate_view_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitCreate_view_body(this);
		}
	}

	public final Create_view_bodyContext create_view_body() throws RecognitionException {
		Create_view_bodyContext _localctx = new Create_view_bodyContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_create_view_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1555);
			match(VIEW);
			setState(1559);
			switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
			case 1:
				{
				setState(1556);
				database_name();
				setState(1557);
				match(DOT);
				}
				break;
			}
			setState(1561);
			view_name();
			setState(1565);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1562);
				match(IF);
				setState(1563);
				match(NOT);
				setState(1564);
				match(EXISTS);
				}
			}

			setState(1568);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1567);
				column_list();
				}
			}

			setState(1570);
			match(AS);
			setState(1571);
			select_statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_view_statementContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(uniformSQLParser.ALTER, 0); }
		public Create_view_bodyContext create_view_body() {
			return getRuleContext(Create_view_bodyContext.class,0);
		}
		public Alter_view_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_view_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterAlter_view_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitAlter_view_statement(this);
		}
	}

	public final Alter_view_statementContext alter_view_statement() throws RecognitionException {
		Alter_view_statementContext _localctx = new Alter_view_statementContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_alter_view_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1573);
			match(ALTER);
			setState(1574);
			create_view_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_user_statementContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(uniformSQLParser.CREATE, 0); }
		public TerminalNode USER() { return getToken(uniformSQLParser.USER, 0); }
		public User_nameContext user_name() {
			return getRuleContext(User_nameContext.class,0);
		}
		public TerminalNode IDENTIFIED() { return getToken(uniformSQLParser.IDENTIFIED, 0); }
		public TerminalNode BY() { return getToken(uniformSQLParser.BY, 0); }
		public TerminalNode TEXT_STRING() { return getToken(uniformSQLParser.TEXT_STRING, 0); }
		public Create_user_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_user_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterCreate_user_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitCreate_user_statement(this);
		}
	}

	public final Create_user_statementContext create_user_statement() throws RecognitionException {
		Create_user_statementContext _localctx = new Create_user_statementContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_create_user_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1576);
			match(CREATE);
			setState(1577);
			match(USER);
			setState(1578);
			user_name();
			setState(1579);
			match(IDENTIFIED);
			setState(1580);
			match(BY);
			setState(1581);
			match(TEXT_STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_user_statementContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(uniformSQLParser.DROP, 0); }
		public TerminalNode USER() { return getToken(uniformSQLParser.USER, 0); }
		public User_nameContext user_name() {
			return getRuleContext(User_nameContext.class,0);
		}
		public Drop_user_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_user_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterDrop_user_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitDrop_user_statement(this);
		}
	}

	public final Drop_user_statementContext drop_user_statement() throws RecognitionException {
		Drop_user_statementContext _localctx = new Drop_user_statementContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_drop_user_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1583);
			match(DROP);
			setState(1584);
			match(USER);
			setState(1585);
			user_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Grant_privilege_statementContext extends ParserRuleContext {
		public List<TerminalNode> GRANT() { return getTokens(uniformSQLParser.GRANT); }
		public TerminalNode GRANT(int i) {
			return getToken(uniformSQLParser.GRANT, i);
		}
		public List<Priv_typeContext> priv_type() {
			return getRuleContexts(Priv_typeContext.class);
		}
		public Priv_typeContext priv_type(int i) {
			return getRuleContext(Priv_typeContext.class,i);
		}
		public TerminalNode ON() { return getToken(uniformSQLParser.ON, 0); }
		public TerminalNode TO() { return getToken(uniformSQLParser.TO, 0); }
		public List<Principal_specificationContext> principal_specification() {
			return getRuleContexts(Principal_specificationContext.class);
		}
		public Principal_specificationContext principal_specification(int i) {
			return getRuleContext(Principal_specificationContext.class,i);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public View_nameContext view_name() {
			return getRuleContext(View_nameContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public TerminalNode WITH() { return getToken(uniformSQLParser.WITH, 0); }
		public TerminalNode OPTION() { return getToken(uniformSQLParser.OPTION, 0); }
		public Grant_privilege_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grant_privilege_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterGrant_privilege_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitGrant_privilege_statement(this);
		}
	}

	public final Grant_privilege_statementContext grant_privilege_statement() throws RecognitionException {
		Grant_privilege_statementContext _localctx = new Grant_privilege_statementContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_grant_privilege_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1587);
			match(GRANT);
			setState(1588);
			priv_type();
			setState(1593);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1589);
				match(COMMA);
				setState(1590);
				priv_type();
				}
				}
				setState(1595);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1596);
			match(ON);
			setState(1599);
			switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
			case 1:
				{
				setState(1597);
				table_name();
				}
				break;
			case 2:
				{
				setState(1598);
				view_name();
				}
				break;
			}
			setState(1601);
			match(TO);
			setState(1602);
			principal_specification();
			setState(1607);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1603);
				match(COMMA);
				setState(1604);
				principal_specification();
				}
				}
				setState(1609);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1613);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1610);
				match(WITH);
				setState(1611);
				match(GRANT);
				setState(1612);
				match(OPTION);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Principal_specificationContext extends ParserRuleContext {
		public User_nameContext user_name() {
			return getRuleContext(User_nameContext.class,0);
		}
		public TerminalNode USER() { return getToken(uniformSQLParser.USER, 0); }
		public Principal_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_principal_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterPrincipal_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitPrincipal_specification(this);
		}
	}

	public final Principal_specificationContext principal_specification() throws RecognitionException {
		Principal_specificationContext _localctx = new Principal_specificationContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_principal_specification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1616);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				{
				setState(1615);
				match(USER);
				}
				break;
			}
			setState(1618);
			user_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Revoke_privilege_statementContext extends ParserRuleContext {
		public TerminalNode REVOKE() { return getToken(uniformSQLParser.REVOKE, 0); }
		public List<Priv_typeContext> priv_type() {
			return getRuleContexts(Priv_typeContext.class);
		}
		public Priv_typeContext priv_type(int i) {
			return getRuleContext(Priv_typeContext.class,i);
		}
		public TerminalNode ON() { return getToken(uniformSQLParser.ON, 0); }
		public TerminalNode FROM() { return getToken(uniformSQLParser.FROM, 0); }
		public List<Principal_specificationContext> principal_specification() {
			return getRuleContexts(Principal_specificationContext.class);
		}
		public Principal_specificationContext principal_specification(int i) {
			return getRuleContext(Principal_specificationContext.class,i);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public View_nameContext view_name() {
			return getRuleContext(View_nameContext.class,0);
		}
		public TerminalNode GRANT() { return getToken(uniformSQLParser.GRANT, 0); }
		public TerminalNode OPTION() { return getToken(uniformSQLParser.OPTION, 0); }
		public TerminalNode FOR() { return getToken(uniformSQLParser.FOR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public Revoke_privilege_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_revoke_privilege_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterRevoke_privilege_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitRevoke_privilege_statement(this);
		}
	}

	public final Revoke_privilege_statementContext revoke_privilege_statement() throws RecognitionException {
		Revoke_privilege_statementContext _localctx = new Revoke_privilege_statementContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_revoke_privilege_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1620);
			match(REVOKE);
			setState(1624);
			_la = _input.LA(1);
			if (_la==GRANT) {
				{
				setState(1621);
				match(GRANT);
				setState(1622);
				match(OPTION);
				setState(1623);
				match(FOR);
				}
			}

			setState(1626);
			priv_type();
			setState(1631);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1627);
				match(COMMA);
				setState(1628);
				priv_type();
				}
				}
				setState(1633);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1634);
			match(ON);
			setState(1637);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				{
				setState(1635);
				table_name();
				}
				break;
			case 2:
				{
				setState(1636);
				view_name();
				}
				break;
			}
			setState(1639);
			match(FROM);
			setState(1640);
			principal_specification();
			setState(1645);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1641);
				match(COMMA);
				setState(1642);
				principal_specification();
				}
				}
				setState(1647);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Show_event_statementContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(uniformSQLParser.SHOW, 0); }
		public Show_specificationContext show_specification() {
			return getRuleContext(Show_specificationContext.class,0);
		}
		public Show_event_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_show_event_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterShow_event_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitShow_event_statement(this);
		}
	}

	public final Show_event_statementContext show_event_statement() throws RecognitionException {
		Show_event_statementContext _localctx = new Show_event_statementContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_show_event_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1648);
			match(SHOW);
			setState(1649);
			show_specification();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Show_specificationContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(uniformSQLParser.CREATE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(uniformSQLParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(uniformSQLParser.VIEW, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(uniformSQLParser.DOT, 0); }
		public TerminalNode COLUMNS() { return getToken(uniformSQLParser.COLUMNS, 0); }
		public List<TerminalNode> FROM() { return getTokens(uniformSQLParser.FROM); }
		public TerminalNode FROM(int i) {
			return getToken(uniformSQLParser.FROM, i);
		}
		public TerminalNode DATABASES() { return getToken(uniformSQLParser.DATABASES, 0); }
		public TerminalNode SCHEMAS() { return getToken(uniformSQLParser.SCHEMAS, 0); }
		public TerminalNode LIKE() { return getToken(uniformSQLParser.LIKE, 0); }
		public TerminalNode TEXT_STRING() { return getToken(uniformSQLParser.TEXT_STRING, 0); }
		public TerminalNode SERVER() { return getToken(uniformSQLParser.SERVER, 0); }
		public TerminalNode ALIASES() { return getToken(uniformSQLParser.ALIASES, 0); }
		public TerminalNode TABLES() { return getToken(uniformSQLParser.TABLES, 0); }
		public TerminalNode IN() { return getToken(uniformSQLParser.IN, 0); }
		public TerminalNode GRANT() { return getToken(uniformSQLParser.GRANT, 0); }
		public TerminalNode ON() { return getToken(uniformSQLParser.ON, 0); }
		public TerminalNode ALL() { return getToken(uniformSQLParser.ALL, 0); }
		public Principal_nameContext principal_name() {
			return getRuleContext(Principal_nameContext.class,0);
		}
		public Principal_specificationContext principal_specification() {
			return getRuleContext(Principal_specificationContext.class,0);
		}
		public Show_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_show_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterShow_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitShow_specification(this);
		}
	}

	public final Show_specificationContext show_specification() throws RecognitionException {
		Show_specificationContext _localctx = new Show_specificationContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_show_specification);
		int _la;
		try {
			setState(1694);
			switch (_input.LA(1)) {
			case CREATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1651);
				match(CREATE);
				setState(1652);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1656);
				switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
				case 1:
					{
					setState(1653);
					database_name();
					setState(1654);
					match(DOT);
					}
					break;
				}
				setState(1658);
				table_name();
				}
				break;
			case COLUMNS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1659);
				match(COLUMNS);
				setState(1660);
				match(FROM);
				setState(1661);
				table_name();
				setState(1664);
				_la = _input.LA(1);
				if (_la==FROM) {
					{
					setState(1662);
					match(FROM);
					setState(1663);
					database_name();
					}
				}

				}
				break;
			case DATABASES:
			case SCHEMAS:
				enterOuterAlt(_localctx, 3);
				{
				setState(1666);
				_la = _input.LA(1);
				if ( !(_la==DATABASES || _la==SCHEMAS) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1669);
				_la = _input.LA(1);
				if (_la==LIKE) {
					{
					setState(1667);
					match(LIKE);
					setState(1668);
					match(TEXT_STRING);
					}
				}

				}
				break;
			case SERVER:
				enterOuterAlt(_localctx, 4);
				{
				setState(1671);
				match(SERVER);
				setState(1672);
				match(ALIASES);
				}
				break;
			case TABLES:
				enterOuterAlt(_localctx, 5);
				{
				setState(1673);
				match(TABLES);
				setState(1676);
				_la = _input.LA(1);
				if (_la==IN) {
					{
					setState(1674);
					match(IN);
					setState(1675);
					database_name();
					}
				}

				setState(1679);
				_la = _input.LA(1);
				if (_la==TEXT_STRING) {
					{
					setState(1678);
					match(TEXT_STRING);
					}
				}

				}
				break;
			case GRANT:
				enterOuterAlt(_localctx, 6);
				{
				setState(1681);
				match(GRANT);
				setState(1684);
				switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
				case 1:
					{
					setState(1682);
					principal_name();
					}
					break;
				case 2:
					{
					setState(1683);
					principal_specification();
					}
					break;
				}
				setState(1686);
				match(ON);
				setState(1692);
				switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
				case 1:
					{
					setState(1687);
					match(ALL);
					}
					break;
				case 2:
					{
					setState(1689);
					switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
					case 1:
						{
						setState(1688);
						match(TABLE);
						}
						break;
					}
					setState(1691);
					table_name();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_event_statementContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(uniformSQLParser.SET, 0); }
		public TerminalNode TABLE() { return getToken(uniformSQLParser.TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode TO() { return getToken(uniformSQLParser.TO, 0); }
		public Server_aliasContext server_alias() {
			return getRuleContext(Server_aliasContext.class,0);
		}
		public TerminalNode DOT() { return getToken(uniformSQLParser.DOT, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Set_event_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_event_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterSet_event_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitSet_event_statement(this);
		}
	}

	public final Set_event_statementContext set_event_statement() throws RecognitionException {
		Set_event_statementContext _localctx = new Set_event_statementContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_set_event_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1696);
			match(SET);
			setState(1697);
			match(TABLE);
			setState(1698);
			table_name();
			setState(1699);
			match(TO);
			setState(1700);
			server_alias();
			setState(1701);
			match(DOT);
			setState(1702);
			database_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Use_event_statementContext extends ParserRuleContext {
		public TerminalNode USE() { return getToken(uniformSQLParser.USE, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Use_event_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use_event_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterUse_event_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitUse_event_statement(this);
		}
	}

	public final Use_event_statementContext use_event_statement() throws RecognitionException {
		Use_event_statementContext _localctx = new Use_event_statementContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_use_event_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1704);
			match(USE);
			setState(1705);
			database_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Server_event_statementContext extends ParserRuleContext {
		public TerminalNode SERVER() { return getToken(uniformSQLParser.SERVER, 0); }
		public TerminalNode ALIAS() { return getToken(uniformSQLParser.ALIAS, 0); }
		public Server_aliasContext server_alias() {
			return getRuleContext(Server_aliasContext.class,0);
		}
		public Root_statementContext root_statement() {
			return getRuleContext(Root_statementContext.class,0);
		}
		public Server_event_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_server_event_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterServer_event_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitServer_event_statement(this);
		}
	}

	public final Server_event_statementContext server_event_statement() throws RecognitionException {
		Server_event_statementContext _localctx = new Server_event_statementContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_server_event_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1707);
			match(SERVER);
			setState(1708);
			match(ALIAS);
			setState(1709);
			server_alias();
			setState(1710);
			root_statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_statementsContext extends ParserRuleContext {
		public TerminalNode UPDATE() { return getToken(uniformSQLParser.UPDATE, 0); }
		public User_nameContext user_name() {
			return getRuleContext(User_nameContext.class,0);
		}
		public Set_columns_cluaseContext set_columns_cluase() {
			return getRuleContext(Set_columns_cluaseContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(uniformSQLParser.DOT, 0); }
		public Update_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterUpdate_statements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitUpdate_statements(this);
		}
	}

	public final Update_statementsContext update_statements() throws RecognitionException {
		Update_statementsContext _localctx = new Update_statementsContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_update_statements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1712);
			match(UPDATE);
			setState(1716);
			switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
			case 1:
				{
				setState(1713);
				database_name();
				setState(1714);
				match(DOT);
				}
				break;
			}
			setState(1718);
			user_name();
			setState(1719);
			set_columns_cluase();
			setState(1720);
			where_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delete_statementsContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(uniformSQLParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(uniformSQLParser.FROM, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Delete_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterDelete_statements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitDelete_statements(this);
		}
	}

	public final Delete_statementsContext delete_statements() throws RecognitionException {
		Delete_statementsContext _localctx = new Delete_statementsContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_delete_statements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1722);
			match(DELETE);
			setState(1723);
			match(FROM);
			setState(1724);
			table_name();
			setState(1725);
			where_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u0153\u06c2\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\5\4\u0140\n\4\3\5\3\5\3\6\3\6\5\6\u0146\n\6\3\6\3\6\5\6\u014a\n"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0153\n\6\3\6\5\6\u0156\n\6\3\6\3\6"+
		"\5\6\u015a\n\6\3\6\3\6\5\6\u015e\n\6\5\6\u0160\n\6\3\7\3\7\3\b\3\b\3\t"+
		"\5\t\u0167\n\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\5\r\u0177\n\r\3\16\3\16\3\16\3\16\5\16\u017d\n\16\3\17\3\17\3\20\3"+
		"\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3"+
		"\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3"+
		"\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\5\'\u01b0"+
		"\n\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3-\5-\u01c1\n-\3.\3."+
		"\3/\3/\3/\7/\u01c8\n/\f/\16/\u01cb\13/\3\60\3\60\3\60\7\60\u01d0\n\60"+
		"\f\60\16\60\u01d3\13\60\3\61\3\61\3\61\7\61\u01d8\n\61\f\61\16\61\u01db"+
		"\13\61\3\62\5\62\u01de\n\62\3\62\3\62\3\63\3\63\3\63\5\63\u01e5\n\63\3"+
		"\63\3\63\5\63\u01e9\n\63\5\63\u01eb\n\63\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\5\64\u01f4\n\64\3\64\3\64\3\64\5\64\u01f9\n\64\3\64\3\64\3\64\5"+
		"\64\u01fe\n\64\3\65\3\65\5\65\u0202\n\65\3\65\3\65\3\65\5\65\u0207\n\65"+
		"\3\65\3\65\5\65\u020b\n\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u0214"+
		"\n\65\3\65\3\65\3\65\3\65\3\65\5\65\u021b\n\65\3\65\3\65\3\65\3\65\5\65"+
		"\u0221\n\65\3\66\3\66\3\66\5\66\u0226\n\66\3\67\3\67\3\67\5\67\u022b\n"+
		"\67\38\38\38\58\u0230\n8\39\39\39\79\u0235\n9\f9\169\u0238\139\3:\3:\3"+
		":\7:\u023d\n:\f:\16:\u0240\13:\3;\3;\3;\5;\u0245\n;\3<\3<\3<\5<\u024a"+
		"\n<\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3>\5>\u0257\n>\3?\3?\3?\3?\3?\7?\u025e"+
		"\n?\f?\16?\u0261\13?\5?\u0263\n?\3?\5?\u0266\n?\3?\3?\3?\3?\3?\3?\3?\3"+
		"?\3?\3?\5?\u0272\n?\3?\3?\3?\5?\u0277\n?\3@\3@\5@\u027b\n@\3A\3A\3A\3"+
		"A\3A\3A\6A\u0283\nA\rA\16A\u0284\3A\3A\5A\u0289\nA\3A\3A\3B\3B\3B\3B\3"+
		"B\3B\3B\6B\u0294\nB\rB\16B\u0295\3B\3B\5B\u029a\nB\3B\3B\3C\3C\3C\5C\u02a1"+
		"\nC\3C\3C\3C\5C\u02a6\nC\3C\3C\3D\3D\3D\6D\u02ad\nD\rD\16D\u02ae\3D\3"+
		"D\3D\6D\u02b4\nD\rD\16D\u02b5\5D\u02b8\nD\3E\3E\3E\3E\7E\u02be\nE\fE\16"+
		"E\u02c1\13E\3E\3E\3F\3F\3F\3F\3G\3G\3G\7G\u02cc\nG\fG\16G\u02cf\13G\3"+
		"H\3H\5H\u02d3\nH\3I\3I\5I\u02d7\nI\3I\5I\u02da\nI\3I\5I\u02dd\nI\3I\3"+
		"I\3I\5I\u02e2\nI\7I\u02e4\nI\fI\16I\u02e7\13I\3J\3J\3J\5J\u02ec\nJ\3J"+
		"\3J\3J\3J\7J\u02f2\nJ\fJ\16J\u02f5\13J\3K\3K\5K\u02f9\nK\3K\3K\5K\u02fd"+
		"\nK\5K\u02ff\nK\3K\3K\5K\u0303\nK\3L\3L\5L\u0307\nL\3L\3L\5L\u030b\nL"+
		"\3L\3L\3L\3L\3L\5L\u0312\nL\3M\3M\3M\3N\3N\3N\7N\u031a\nN\fN\16N\u031d"+
		"\13N\3O\3O\3O\3O\3O\3O\3O\5O\u0326\nO\5O\u0328\nO\3P\3P\3P\3P\5P\u032e"+
		"\nP\3P\3P\3P\3P\3P\3P\3P\3P\5P\u0338\nP\3Q\3Q\3Q\7Q\u033d\nQ\fQ\16Q\u0340"+
		"\13Q\3R\3R\3R\3R\3R\3S\3S\3S\7S\u034a\nS\fS\16S\u034d\13S\3T\3T\5T\u0351"+
		"\nT\3T\5T\u0354\nT\3U\3U\3U\3U\3U\5U\u035b\nU\3V\3V\3V\3V\3V\3V\3V\3V"+
		"\3V\3V\3V\3V\3V\3V\3V\5V\u036c\nV\3W\3W\3W\5W\u0371\nW\3W\7W\u0374\nW"+
		"\fW\16W\u0377\13W\3X\3X\5X\u037b\nX\3X\3X\3X\3X\5X\u0381\nX\3X\5X\u0384"+
		"\nX\3X\5X\u0387\nX\5X\u0389\nX\3X\5X\u038c\nX\3X\5X\u038f\nX\3Y\3Y\3Y"+
		"\3Z\3Z\3Z\3Z\3Z\7Z\u0399\nZ\fZ\16Z\u039c\13Z\3Z\3Z\5Z\u03a0\nZ\3[\3[\3"+
		"[\5[\u03a5\n[\3\\\3\\\3\\\3]\3]\3]\3]\3]\7]\u03af\n]\f]\16]\u03b2\13]"+
		"\3^\3^\5^\u03b6\n^\3_\3_\3_\3_\5_\u03bc\n_\3_\3_\3`\3`\3a\3a\3b\3b\3b"+
		"\7b\u03c7\nb\fb\16b\u03ca\13b\3c\3c\3c\3c\7c\u03d0\nc\fc\16c\u03d3\13"+
		"c\3c\3c\3d\3d\3d\3d\3e\3e\3e\5e\u03de\ne\3e\3e\3f\3f\3f\3f\3f\3f\3f\5"+
		"f\u03e9\nf\3f\3f\5f\u03ed\nf\5f\u03ef\nf\3g\3g\3h\3h\5h\u03f5\nh\3h\5"+
		"h\u03f8\nh\3h\5h\u03fb\nh\3h\3h\5h\u03ff\nh\3i\3i\3i\3i\3i\3i\3i\3i\3"+
		"i\3i\3i\3i\7i\u040d\ni\fi\16i\u0410\13i\3j\3j\5j\u0414\nj\3j\3j\5j\u0418"+
		"\nj\3j\5j\u041b\nj\3k\3k\3k\3k\7k\u0421\nk\fk\16k\u0424\13k\3l\3l\3l\5"+
		"l\u0429\nl\3l\3l\3l\5l\u042e\nl\7l\u0430\nl\fl\16l\u0433\13l\3l\3l\3m"+
		"\3m\3m\3m\7m\u043b\nm\fm\16m\u043e\13m\3n\3n\3n\3n\5n\u0444\nn\3o\3o\3"+
		"o\3o\3o\5o\u044b\no\3o\3o\3p\3p\3p\3p\5p\u0453\np\3p\3p\3q\3q\3q\5q\u045a"+
		"\nq\3r\3r\5r\u045e\nr\3r\5r\u0461\nr\3r\3r\3r\3r\5r\u0467\nr\3r\3r\3r"+
		"\5r\u046c\nr\3r\3r\3r\3r\3r\7r\u0473\nr\fr\16r\u0476\13r\3r\3r\5r\u047a"+
		"\nr\3r\3r\5r\u047e\nr\3r\3r\5r\u0482\nr\3s\3s\5s\u0486\ns\3s\5s\u0489"+
		"\ns\3s\3s\3s\3s\5s\u048f\ns\3s\3s\3s\3s\3t\3t\5t\u0497\nt\3t\5t\u049a"+
		"\nt\3t\3t\3t\3t\5t\u04a0\nt\3t\3t\3t\3t\3t\3t\3t\3t\5t\u04aa\nt\3u\3u"+
		"\3u\3u\3u\5u\u04b1\nu\3u\5u\u04b4\nu\3u\3u\3u\3u\7u\u04ba\nu\fu\16u\u04bd"+
		"\13u\3u\3u\7u\u04c1\nu\fu\16u\u04c4\13u\5u\u04c6\nu\3v\3v\3v\5v\u04cb"+
		"\nv\3v\5v\u04ce\nv\3w\3w\3w\5w\u04d3\nw\3x\3x\3x\3x\3x\5x\u04da\nx\3x"+
		"\5x\u04dd\nx\3x\5x\u04e0\nx\3x\3x\5x\u04e4\nx\3x\3x\3x\3x\3x\5x\u04eb"+
		"\nx\3x\5x\u04ee\nx\3x\5x\u04f1\nx\3x\3x\5x\u04f5\nx\3x\3x\3x\3x\3x\5x"+
		"\u04fc\nx\3x\5x\u04ff\nx\3x\5x\u0502\nx\3x\3x\5x\u0506\nx\3x\3x\3x\3x"+
		"\3x\5x\u050d\nx\3x\5x\u0510\nx\3x\5x\u0513\nx\3x\3x\5x\u0517\nx\3x\3x"+
		"\3x\3x\3x\3x\3x\5x\u0520\nx\3x\5x\u0523\nx\3x\5x\u0526\nx\3x\3x\5x\u052a"+
		"\nx\3x\3x\3x\3x\3x\3x\3x\5x\u0533\nx\3x\5x\u0536\nx\3x\5x\u0539\nx\3x"+
		"\3x\5x\u053d\nx\3x\3x\3x\3x\3x\5x\u0544\nx\3x\3x\5x\u0548\nx\3x\5x\u054b"+
		"\nx\3x\5x\u054e\nx\3x\3x\5x\u0552\nx\3x\3x\5x\u0556\nx\3x\3x\5x\u055a"+
		"\nx\3x\3x\5x\u055e\nx\3x\3x\5x\u0562\nx\3x\3x\5x\u0566\nx\3x\3x\5x\u056a"+
		"\nx\3x\3x\3x\3x\3x\5x\u0571\nx\3x\3x\5x\u0575\nx\3x\3x\3x\3x\3x\5x\u057c"+
		"\nx\3x\5x\u057f\nx\3x\3x\5x\u0583\nx\3x\3x\5x\u0587\nx\3x\3x\5x\u058b"+
		"\nx\5x\u058d\nx\3y\3y\3y\3y\5y\u0593\ny\3y\5y\u0596\ny\3z\3z\3z\3z\3z"+
		"\3z\7z\u059e\nz\fz\16z\u05a1\13z\3z\3z\3z\3z\5z\u05a7\nz\3z\3z\3z\5z\u05ac"+
		"\nz\3{\3{\3{\3{\5{\u05b2\n{\3|\3|\3}\3}\3~\3~\3\177\3\177\3\177\3\177"+
		"\3\177\3\177\7\177\u05c0\n\177\f\177\16\177\u05c3\13\177\5\177\u05c5\n"+
		"\177\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\5\u0080\u05cc\n\u0080\3\u0080"+
		"\3\u0080\3\u0080\5\u0080\u05d1\n\u0080\3\u0081\3\u0081\3\u0081\7\u0081"+
		"\u05d6\n\u0081\f\u0081\16\u0081\u05d9\13\u0081\3\u0082\3\u0082\3\u0082"+
		"\3\u0083\3\u0083\3\u0083\5\u0083\u05e1\n\u0083\3\u0084\3\u0084\3\u0084"+
		"\3\u0084\3\u0084\3\u0084\7\u0084\u05e9\n\u0084\f\u0084\16\u0084\u05ec"+
		"\13\u0084\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\3\u0085\7\u0085\u05f8\n\u0085\f\u0085\16\u0085\u05fb\13\u0085"+
		"\3\u0086\3\u0086\3\u0086\3\u0086\5\u0086\u0601\n\u0086\3\u0086\3\u0086"+
		"\3\u0087\3\u0087\3\u0087\3\u0087\5\u0087\u0609\n\u0087\3\u0087\3\u0087"+
		"\3\u0088\3\u0088\5\u0088\u060f\n\u0088\3\u0088\3\u0088\3\u0089\3\u0089"+
		"\3\u0089\3\u008a\3\u008a\3\u008a\3\u008a\5\u008a\u061a\n\u008a\3\u008a"+
		"\3\u008a\3\u008a\3\u008a\5\u008a\u0620\n\u008a\3\u008a\5\u008a\u0623\n"+
		"\u008a\3\u008a\3\u008a\3\u008a\3\u008b\3\u008b\3\u008b\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008e\3\u008e\3\u008e\3\u008e\7\u008e\u063a\n\u008e\f\u008e\16\u008e"+
		"\u063d\13\u008e\3\u008e\3\u008e\3\u008e\5\u008e\u0642\n\u008e\3\u008e"+
		"\3\u008e\3\u008e\3\u008e\7\u008e\u0648\n\u008e\f\u008e\16\u008e\u064b"+
		"\13\u008e\3\u008e\3\u008e\3\u008e\5\u008e\u0650\n\u008e\3\u008f\5\u008f"+
		"\u0653\n\u008f\3\u008f\3\u008f\3\u0090\3\u0090\3\u0090\3\u0090\5\u0090"+
		"\u065b\n\u0090\3\u0090\3\u0090\3\u0090\7\u0090\u0660\n\u0090\f\u0090\16"+
		"\u0090\u0663\13\u0090\3\u0090\3\u0090\3\u0090\5\u0090\u0668\n\u0090\3"+
		"\u0090\3\u0090\3\u0090\3\u0090\7\u0090\u066e\n\u0090\f\u0090\16\u0090"+
		"\u0671\13\u0090\3\u0091\3\u0091\3\u0091\3\u0092\3\u0092\3\u0092\3\u0092"+
		"\3\u0092\5\u0092\u067b\n\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092"+
		"\3\u0092\5\u0092\u0683\n\u0092\3\u0092\3\u0092\3\u0092\5\u0092\u0688\n"+
		"\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\5\u0092\u068f\n\u0092\3"+
		"\u0092\5\u0092\u0692\n\u0092\3\u0092\3\u0092\3\u0092\5\u0092\u0697\n\u0092"+
		"\3\u0092\3\u0092\3\u0092\5\u0092\u069c\n\u0092\3\u0092\5\u0092\u069f\n"+
		"\u0092\5\u0092\u06a1\n\u0092\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3"+
		"\u0093\3\u0093\3\u0093\3\u0094\3\u0094\3\u0094\3\u0095\3\u0095\3\u0095"+
		"\3\u0095\3\u0095\3\u0096\3\u0096\3\u0096\3\u0096\5\u0096\u06b7\n\u0096"+
		"\3\u0096\3\u0096\3\u0096\3\u0096\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097"+
		"\3\u0097\2\2\u0098\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6"+
		"\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce"+
		"\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6"+
		"\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe"+
		"\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116"+
		"\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c\2\33"+
		"\3\2\3\u0134\4\2\u012e\u0131\u0144\u0145\4\2\u0107\u010b\u010d\u010d\3"+
		"\2\u013e\u013f\4\2\u0147\u0147\u014c\u014c\3\2\3\4\3\2\u00ec\u00fb\5\2"+
		"\u00fc\u0104\u0121\u0121\u0125\u0126\4\2\u0106\u010f\u0122\u0122\4\2\u0116"+
		"\u0116\u0127\u0127\3\2\u0111\u0115\7\2\5\5\23\23\25\25\u00a3\u00a3\u00d1"+
		"\u00d1\3\2\u0133\u0134\5\2\u0128\u0129\u0139\u0139\u0143\u0143\4\2\u00c1"+
		"\u00c1\u013e\u0140\5\2\5\5\24\24\u0139\u0139\3\2\33\35\4\2$$ii\4\2\5\5"+
		"\24\24\3\2\n\13\3\2\u011d\u011e\3\2\u011b\u011c\4\2\u00a8\u00a8\u00ab"+
		"\u00ab\4\2!!\u00a6\u00a6\4\2\u00a9\u00a9\u00ac\u00ac\u0755\2\u012e\3\2"+
		"\2\2\4\u0130\3\2\2\2\6\u013f\3\2\2\2\b\u0141\3\2\2\2\n\u015f\3\2\2\2\f"+
		"\u0161\3\2\2\2\16\u0163\3\2\2\2\20\u0166\3\2\2\2\22\u016a\3\2\2\2\24\u016c"+
		"\3\2\2\2\26\u016e\3\2\2\2\30\u0176\3\2\2\2\32\u017c\3\2\2\2\34\u017e\3"+
		"\2\2\2\36\u0180\3\2\2\2 \u0182\3\2\2\2\"\u0184\3\2\2\2$\u0186\3\2\2\2"+
		"&\u0188\3\2\2\2(\u018a\3\2\2\2*\u018c\3\2\2\2,\u018e\3\2\2\2.\u0190\3"+
		"\2\2\2\60\u0192\3\2\2\2\62\u0194\3\2\2\2\64\u0196\3\2\2\2\66\u0198\3\2"+
		"\2\28\u019a\3\2\2\2:\u019c\3\2\2\2<\u019e\3\2\2\2>\u01a0\3\2\2\2@\u01a2"+
		"\3\2\2\2B\u01a4\3\2\2\2D\u01a6\3\2\2\2F\u01a8\3\2\2\2H\u01aa\3\2\2\2J"+
		"\u01ac\3\2\2\2L\u01af\3\2\2\2N\u01b3\3\2\2\2P\u01b5\3\2\2\2R\u01b7\3\2"+
		"\2\2T\u01b9\3\2\2\2V\u01bb\3\2\2\2X\u01c0\3\2\2\2Z\u01c2\3\2\2\2\\\u01c4"+
		"\3\2\2\2^\u01cc\3\2\2\2`\u01d4\3\2\2\2b\u01dd\3\2\2\2d\u01e1\3\2\2\2f"+
		"\u01fd\3\2\2\2h\u0220\3\2\2\2j\u0222\3\2\2\2l\u0227\3\2\2\2n\u022c\3\2"+
		"\2\2p\u0231\3\2\2\2r\u0239\3\2\2\2t\u0241\3\2\2\2v\u0249\3\2\2\2x\u024b"+
		"\3\2\2\2z\u0256\3\2\2\2|\u0276\3\2\2\2~\u027a\3\2\2\2\u0080\u027c\3\2"+
		"\2\2\u0082\u028c\3\2\2\2\u0084\u02a5\3\2\2\2\u0086\u02b7\3\2\2\2\u0088"+
		"\u02b9\3\2\2\2\u008a\u02c4\3\2\2\2\u008c\u02c8\3\2\2\2\u008e\u02d2\3\2"+
		"\2\2\u0090\u02d4\3\2\2\2\u0092\u02e8\3\2\2\2\u0094\u02f6\3\2\2\2\u0096"+
		"\u0311\3\2\2\2\u0098\u0313\3\2\2\2\u009a\u0316\3\2\2\2\u009c\u031e\3\2"+
		"\2\2\u009e\u0337\3\2\2\2\u00a0\u0339\3\2\2\2\u00a2\u0341\3\2\2\2\u00a4"+
		"\u0346\3\2\2\2\u00a6\u0350\3\2\2\2\u00a8\u035a\3\2\2\2\u00aa\u036b\3\2"+
		"\2\2\u00ac\u036d\3\2\2\2\u00ae\u0378\3\2\2\2\u00b0\u0390\3\2\2\2\u00b2"+
		"\u0393\3\2\2\2\u00b4\u03a4\3\2\2\2\u00b6\u03a6\3\2\2\2\u00b8\u03a9\3\2"+
		"\2\2\u00ba\u03b3\3\2\2\2\u00bc\u03b7\3\2\2\2\u00be\u03bf\3\2\2\2\u00c0"+
		"\u03c1\3\2\2\2\u00c2\u03c3\3\2\2\2\u00c4\u03cb\3\2\2\2\u00c6\u03d6\3\2"+
		"\2\2\u00c8\u03dd\3\2\2\2\u00ca\u03ee\3\2\2\2\u00cc\u03f0\3\2\2\2\u00ce"+
		"\u03f2\3\2\2\2\u00d0\u0400\3\2\2\2\u00d2\u0411\3\2\2\2\u00d4\u041c\3\2"+
		"\2\2\u00d6\u0425\3\2\2\2\u00d8\u0436\3\2\2\2\u00da\u043f\3\2\2\2\u00dc"+
		"\u0445\3\2\2\2\u00de\u044e\3\2\2\2\u00e0\u0459\3\2\2\2\u00e2\u045b\3\2"+
		"\2\2\u00e4\u0483\3\2\2\2\u00e6\u0494\3\2\2\2\u00e8\u04c5\3\2\2\2\u00ea"+
		"\u04c7\3\2\2\2\u00ec\u04d2\3\2\2\2\u00ee\u058c\3\2\2\2\u00f0\u058e\3\2"+
		"\2\2\u00f2\u0597\3\2\2\2\u00f4\u05b1\3\2\2\2\u00f6\u05b3\3\2\2\2\u00f8"+
		"\u05b5\3\2\2\2\u00fa\u05b7\3\2\2\2\u00fc\u05b9\3\2\2\2\u00fe\u05d0\3\2"+
		"\2\2\u0100\u05d2\3\2\2\2\u0102\u05da\3\2\2\2\u0104\u05e0\3\2\2\2\u0106"+
		"\u05e2\3\2\2\2\u0108\u05ed\3\2\2\2\u010a\u05fc\3\2\2\2\u010c\u0604\3\2"+
		"\2\2\u010e\u060c\3\2\2\2\u0110\u0612\3\2\2\2\u0112\u0615\3\2\2\2\u0114"+
		"\u0627\3\2\2\2\u0116\u062a\3\2\2\2\u0118\u0631\3\2\2\2\u011a\u0635\3\2"+
		"\2\2\u011c\u0652\3\2\2\2\u011e\u0656\3\2\2\2\u0120\u0672\3\2\2\2\u0122"+
		"\u06a0\3\2\2\2\u0124\u06a2\3\2\2\2\u0126\u06aa\3\2\2\2\u0128\u06ad\3\2"+
		"\2\2\u012a\u06b2\3\2\2\2\u012c\u06bc\3\2\2\2\u012e\u012f\t\2\2\2\u012f"+
		"\3\3\2\2\2\u0130\u0131\7\u0153\2\2\u0131\5\3\2\2\2\u0132\u0140\3\2\2\2"+
		"\u0133\u0140\7I\2\2\u0134\u0140\7J\2\2\u0135\u0140\7K\2\2\u0136\u0140"+
		"\7L\2\2\u0137\u0140\7H\2\2\u0138\u0140\7M\2\2\u0139\u0140\7N\2\2\u013a"+
		"\u0140\7O\2\2\u013b\u0140\7Q\2\2\u013c\u0140\7T\2\2\u013d\u0140\7\u00c1"+
		"\2\2\u013e\u0140\7R\2\2\u013f\u0132\3\2\2\2\u013f\u0133\3\2\2\2\u013f"+
		"\u0134\3\2\2\2\u013f\u0135\3\2\2\2\u013f\u0136\3\2\2\2\u013f\u0137\3\2"+
		"\2\2\u013f\u0138\3\2\2\2\u013f\u0139\3\2\2\2\u013f\u013a\3\2\2\2\u013f"+
		"\u013b\3\2\2\2\u013f\u013c\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u013e\3\2"+
		"\2\2\u0140\7\3\2\2\2\u0141\u0142\t\3\2\2\u0142\t\3\2\2\2\u0143\u0145\7"+
		"\u00c1\2\2\u0144\u0146\7\u0147\2\2\u0145\u0144\3\2\2\2\u0145\u0146\3\2"+
		"\2\2\u0146\u0160\3\2\2\2\u0147\u0149\7\u00eb\2\2\u0148\u014a\7\u0147\2"+
		"\2\u0149\u0148\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u0160\3\2\2\2\u014b\u0160"+
		"\7O\2\2\u014c\u0160\7P\2\2\u014d\u0155\7R\2\2\u014e\u014f\7\u013b\2\2"+
		"\u014f\u0152\7\u0147\2\2\u0150\u0151\7\u0138\2\2\u0151\u0153\7\u0147\2"+
		"\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0156"+
		"\7\u013a\2\2\u0155\u014e\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0160\3\2\2"+
		"\2\u0157\u0159\7\u0123\2\2\u0158\u015a\7\u0124\2\2\u0159\u0158\3\2\2\2"+
		"\u0159\u015a\3\2\2\2\u015a\u0160\3\2\2\2\u015b\u015d\7\u00b7\2\2\u015c"+
		"\u015e\7\u0124\2\2\u015d\u015c\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0160"+
		"\3\2\2\2\u015f\u0143\3\2\2\2\u015f\u0147\3\2\2\2\u015f\u014b\3\2\2\2\u015f"+
		"\u014c\3\2\2\2\u015f\u014d\3\2\2\2\u015f\u0157\3\2\2\2\u015f\u015b\3\2"+
		"\2\2\u0160\13\3\2\2\2\u0161\u0162\t\4\2\2\u0162\r\3\2\2\2\u0163\u0164"+
		"\7\u014d\2\2\u0164\17\3\2\2\2\u0165\u0167\t\5\2\2\u0166\u0165\3\2\2\2"+
		"\u0166\u0167\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0169\t\6\2\2\u0169\21"+
		"\3\2\2\2\u016a\u016b\7\u014a\2\2\u016b\23\3\2\2\2\u016c\u016d\t\7\2\2"+
		"\u016d\25\3\2\2\2\u016e\u016f\7\u014b\2\2\u016f\27\3\2\2\2\u0170\u0177"+
		"\5\16\b\2\u0171\u0177\5\20\t\2\u0172\u0177\5\22\n\2\u0173\u0177\5\24\13"+
		"\2\u0174\u0177\5\26\f\2\u0175\u0177\79\2\2\u0176\u0170\3\2\2\2\u0176\u0171"+
		"\3\2\2\2\u0176\u0172\3\2\2\2\u0176\u0173\3\2\2\2\u0176\u0174\3\2\2\2\u0176"+
		"\u0175\3\2\2\2\u0177\31\3\2\2\2\u0178\u017d\5\34\17\2\u0179\u017d\5\36"+
		"\20\2\u017a\u017d\5 \21\2\u017b\u017d\5\"\22\2\u017c\u0178\3\2\2\2\u017c"+
		"\u0179\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017b\3\2\2\2\u017d\33\3\2\2"+
		"\2\u017e\u017f\t\b\2\2\u017f\35\3\2\2\2\u0180\u0181\t\t\2\2\u0181\37\3"+
		"\2\2\2\u0182\u0183\t\n\2\2\u0183!\3\2\2\2\u0184\u0185\t\13\2\2\u0185#"+
		"\3\2\2\2\u0186\u0187\t\f\2\2\u0187%\3\2\2\2\u0188\u0189\5X-\2\u0189\'"+
		"\3\2\2\2\u018a\u018b\5X-\2\u018b)\3\2\2\2\u018c\u018d\5X-\2\u018d+\3\2"+
		"\2\2\u018e\u018f\5X-\2\u018f-\3\2\2\2\u0190\u0191\5X-\2\u0191/\3\2\2\2"+
		"\u0192\u0193\5X-\2\u0193\61\3\2\2\2\u0194\u0195\5X-\2\u0195\63\3\2\2\2"+
		"\u0196\u0197\5X-\2\u0197\65\3\2\2\2\u0198\u0199\5X-\2\u0199\67\3\2\2\2"+
		"\u019a\u019b\5X-\2\u019b9\3\2\2\2\u019c\u019d\5X-\2\u019d;\3\2\2\2\u019e"+
		"\u019f\5X-\2\u019f=\3\2\2\2\u01a0\u01a1\5X-\2\u01a1?\3\2\2\2\u01a2\u01a3"+
		"\5X-\2\u01a3A\3\2\2\2\u01a4\u01a5\5X-\2\u01a5C\3\2\2\2\u01a6\u01a7\5X"+
		"-\2\u01a7E\3\2\2\2\u01a8\u01a9\5X-\2\u01a9G\3\2\2\2\u01aa\u01ab\5X-\2"+
		"\u01abI\3\2\2\2\u01ac\u01ad\5X-\2\u01adK\3\2\2\2\u01ae\u01b0\7\22\2\2"+
		"\u01af\u01ae\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b2"+
		"\5X-\2\u01b2M\3\2\2\2\u01b3\u01b4\5X-\2\u01b4O\3\2\2\2\u01b5\u01b6\5X"+
		"-\2\u01b6Q\3\2\2\2\u01b7\u01b8\5X-\2\u01b8S\3\2\2\2\u01b9\u01ba\5X-\2"+
		"\u01baU\3\2\2\2\u01bb\u01bc\5X-\2\u01bcW\3\2\2\2\u01bd\u01c1\7\u014e\2"+
		"\2\u01be\u01c1\5\2\2\2\u01bf\u01c1\5\16\b\2\u01c0\u01bd\3\2\2\2\u01c0"+
		"\u01be\3\2\2\2\u01c0\u01bf\3\2\2\2\u01c1Y\3\2\2\2\u01c2\u01c3\t\r\2\2"+
		"\u01c3[\3\2\2\2\u01c4\u01c9\5^\60\2\u01c5\u01c6\7\u012a\2\2\u01c6\u01c8"+
		"\5^\60\2\u01c7\u01c5\3\2\2\2\u01c8\u01cb\3\2\2\2\u01c9\u01c7\3\2\2\2\u01c9"+
		"\u01ca\3\2\2\2\u01ca]\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cc\u01d1\5`\61\2"+
		"\u01cd\u01ce\7\u012c\2\2\u01ce\u01d0\5`\61\2\u01cf\u01cd\3\2\2\2\u01d0"+
		"\u01d3\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2_\3\2\2\2"+
		"\u01d3\u01d1\3\2\2\2\u01d4\u01d9\5b\62\2\u01d5\u01d6\7\u012b\2\2\u01d6"+
		"\u01d8\5b\62\2\u01d7\u01d5\3\2\2\2\u01d8\u01db\3\2\2\2\u01d9\u01d7\3\2"+
		"\2\2\u01d9\u01da\3\2\2\2\u01daa\3\2\2\2\u01db\u01d9\3\2\2\2\u01dc\u01de"+
		"\7\6\2\2\u01dd\u01dc\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01df\3\2\2\2\u01df"+
		"\u01e0\5d\63\2\u01e0c\3\2\2\2\u01e1\u01ea\5f\64\2\u01e2\u01e4\78\2\2\u01e3"+
		"\u01e5\7\6\2\2\u01e4\u01e3\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e8\3\2"+
		"\2\2\u01e6\u01e9\5\24\13\2\u01e7\u01e9\79\2\2\u01e8\u01e6\3\2\2\2\u01e8"+
		"\u01e7\3\2\2\2\u01e9\u01eb\3\2\2\2\u01ea\u01e2\3\2\2\2\u01ea\u01eb\3\2"+
		"\2\2\u01ebe\3\2\2\2\u01ec\u01ed\5h\65\2\u01ed\u01ee\5\b\5\2\u01ee\u01ef"+
		"\5h\65\2\u01ef\u01fe\3\2\2\2\u01f0\u01f1\5h\65\2\u01f1\u01f3\5\b\5\2\u01f2"+
		"\u01f4\7\5\2\2\u01f3\u01f2\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f5\3\2"+
		"\2\2\u01f5\u01f6\5\u00c6d\2\u01f6\u01fe\3\2\2\2\u01f7\u01f9\7\6\2\2\u01f8"+
		"\u01f7\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fb\7\t"+
		"\2\2\u01fb\u01fe\5\u00c6d\2\u01fc\u01fe\5h\65\2\u01fd\u01ec\3\2\2\2\u01fd"+
		"\u01f0\3\2\2\2\u01fd\u01f8\3\2\2\2\u01fd\u01fc\3\2\2\2\u01feg\3\2\2\2"+
		"\u01ff\u0201\5j\66\2\u0200\u0202\7\6\2\2\u0201\u0200\3\2\2\2\u0201\u0202"+
		"\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0206\7\u00a7\2\2\u0204\u0207\5\u00c6"+
		"d\2\u0205\u0207\5\u0088E\2\u0206\u0204\3\2\2\2\u0206\u0205\3\2\2\2\u0207"+
		"\u0221\3\2\2\2\u0208\u020a\5j\66\2\u0209\u020b\7\6\2\2\u020a\u0209\3\2"+
		"\2\2\u020a\u020b\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020d\7\u00bf\2\2\u020d"+
		"\u020e\5j\66\2\u020e\u020f\7\u012b\2\2\u020f\u0210\5h\65\2\u0210\u0221"+
		"\3\2\2\2\u0211\u0213\5j\66\2\u0212\u0214\7\6\2\2\u0213\u0212\3\2\2\2\u0213"+
		"\u0214\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0216\7\7\2\2\u0216\u0217\5z"+
		">\2\u0217\u0221\3\2\2\2\u0218\u021a\5j\66\2\u0219\u021b\7\6\2\2\u021a"+
		"\u0219\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u021d\7\u0084"+
		"\2\2\u021d\u021e\5j\66\2\u021e\u0221\3\2\2\2\u021f\u0221\5j\66\2\u0220"+
		"\u01ff\3\2\2\2\u0220\u0208\3\2\2\2\u0220\u0211\3\2\2\2\u0220\u0218\3\2"+
		"\2\2\u0220\u021f\3\2\2\2\u0221i\3\2\2\2\u0222\u0225\5l\67\2\u0223\u0224"+
		"\7\u0141\2\2\u0224\u0226\5l\67\2\u0225\u0223\3\2\2\2\u0225\u0226\3\2\2"+
		"\2\u0226k\3\2\2\2\u0227\u022a\5n8\2\u0228\u0229\7\u0142\2\2\u0229\u022b"+
		"\5n8\2\u022a\u0228\3\2\2\2\u022a\u022b\3\2\2\2\u022bm\3\2\2\2\u022c\u022f"+
		"\5p9\2\u022d\u022e\t\16\2\2\u022e\u0230\5p9\2\u022f\u022d\3\2\2\2\u022f"+
		"\u0230\3\2\2\2\u0230o\3\2\2\2\u0231\u0236\5r:\2\u0232\u0233\t\5\2\2\u0233"+
		"\u0235\5r:\2\u0234\u0232\3\2\2\2\u0235\u0238\3\2\2\2\u0236\u0234\3\2\2"+
		"\2\u0236\u0237\3\2\2\2\u0237q\3\2\2\2\u0238\u0236\3\2\2\2\u0239\u023e"+
		"\5t;\2\u023a\u023b\t\17\2\2\u023b\u023d\5t;\2\u023c\u023a\3\2\2\2\u023d"+
		"\u0240\3\2\2\2\u023e\u023c\3\2\2\2\u023e\u023f\3\2\2\2\u023fs\3\2\2\2"+
		"\u0240\u023e\3\2\2\2\u0241\u0244\5v<\2\u0242\u0243\t\5\2\2\u0243\u0245"+
		"\5\u008aF\2\u0244\u0242\3\2\2\2\u0244\u0245\3\2\2\2\u0245u\3\2\2\2\u0246"+
		"\u0247\t\20\2\2\u0247\u024a\5z>\2\u0248\u024a\5z>\2\u0249\u0246\3\2\2"+
		"\2\u0249\u0248\3\2\2\2\u024aw\3\2\2\2\u024b\u024c\5z>\2\u024cy\3\2\2\2"+
		"\u024d\u0257\5\30\r\2\u024e\u0257\5\u0084C\2\u024f\u0257\5|?\2\u0250\u0257"+
		"\5\u0088E\2\u0251\u0257\5\u0086D\2\u0252\u0257\5\u00c6d\2\u0253\u0254"+
		"\7\t\2\2\u0254\u0257\5\u00c6d\2\u0255\u0257\5~@\2\u0256\u024d\3\2\2\2"+
		"\u0256\u024e\3\2\2\2\u0256\u024f\3\2\2\2\u0256\u0250\3\2\2\2\u0256\u0251"+
		"\3\2\2\2\u0256\u0252\3\2\2\2\u0256\u0253\3\2\2\2\u0256\u0255\3\2\2\2\u0257"+
		"{\3\2\2\2\u0258\u0265\5\32\16\2\u0259\u0262\7\u013b\2\2\u025a\u025f\5"+
		"\\/\2\u025b\u025c\7\u0138\2\2\u025c\u025e\5\\/\2\u025d\u025b\3\2\2\2\u025e"+
		"\u0261\3\2\2\2\u025f\u025d\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u0263\3\2"+
		"\2\2\u0261\u025f\3\2\2\2\u0262\u025a\3\2\2\2\u0262\u0263\3\2\2\2\u0263"+
		"\u0264\3\2\2\2\u0264\u0266\7\u013a\2\2\u0265\u0259\3\2\2\2\u0265\u0266"+
		"\3\2\2\2\u0266\u0277\3\2\2\2\u0267\u0268\7\u0080\2\2\u0268\u0269\7\u013b"+
		"\2\2\u0269\u026a\5\\/\2\u026a\u026b\7\22\2\2\u026b\u026c\5\n\6\2\u026c"+
		"\u026d\7\u013a\2\2\u026d\u0277\3\2\2\2\u026e\u026f\5$\23\2\u026f\u0271"+
		"\7\u013b\2\2\u0270\u0272\t\21\2\2\u0271\u0270\3\2\2\2\u0271\u0272\3\2"+
		"\2\2\u0272\u0273\3\2\2\2\u0273\u0274\5j\66\2\u0274\u0275\7\u013a\2\2\u0275"+
		"\u0277\3\2\2\2\u0276\u0258\3\2\2\2\u0276\u0267\3\2\2\2\u0276\u026e\3\2"+
		"\2\2\u0277}\3\2\2\2\u0278\u027b\5\u0080A\2\u0279\u027b\5\u0082B\2\u027a"+
		"\u0278\3\2\2\2\u027a\u0279\3\2\2\2\u027b\177\3\2\2\2\u027c\u0282\7\u0099"+
		"\2\2\u027d\u027e\7\u009a\2\2\u027e\u027f\5\\/\2\u027f\u0280\7\u009b\2"+
		"\2\u0280\u0281\5j\66\2\u0281\u0283\3\2\2\2\u0282\u027d\3\2\2\2\u0283\u0284"+
		"\3\2\2\2\u0284\u0282\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0288\3\2\2\2\u0286"+
		"\u0287\7\u009c\2\2\u0287\u0289\5j\66\2\u0288\u0286\3\2\2\2\u0288\u0289"+
		"\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u028b\7\u009d\2\2\u028b\u0081\3\2\2"+
		"\2\u028c\u028d\7\u0099\2\2\u028d\u0293\5j\66\2\u028e\u028f\7\u009a\2\2"+
		"\u028f\u0290\5j\66\2\u0290\u0291\7\u009b\2\2\u0291\u0292\5j\66\2\u0292"+
		"\u0294\3\2\2\2\u0293\u028e\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u0293\3\2"+
		"\2\2\u0295\u0296\3\2\2\2\u0296\u0299\3\2\2\2\u0297\u0298\7\u009c\2\2\u0298"+
		"\u029a\5j\66\2\u0299\u0297\3\2\2\2\u0299\u029a\3\2\2\2\u029a\u029b\3\2"+
		"\2\2\u029b\u029c\7\u009d\2\2\u029c\u0083\3\2\2\2\u029d\u029e\5&\24\2\u029e"+
		"\u029f\7\u0137\2\2\u029f\u02a1\3\2\2\2\u02a0\u029d\3\2\2\2\u02a0\u02a1"+
		"\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a3\5*\26\2\u02a3\u02a4\7\u0137\2"+
		"\2\u02a4\u02a6\3\2\2\2\u02a5\u02a0\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\u02a7"+
		"\3\2\2\2\u02a7\u02a8\5.\30\2\u02a8\u0085\3\2\2\2\u02a9\u02ac\5.\30\2\u02aa"+
		"\u02ab\7\u012a\2\2\u02ab\u02ad\5.\30\2\u02ac\u02aa\3\2\2\2\u02ad\u02ae"+
		"\3\2\2\2\u02ae\u02ac\3\2\2\2\u02ae\u02af\3\2\2\2\u02af\u02b8\3\2\2\2\u02b0"+
		"\u02b3\5.\30\2\u02b1\u02b2\7\u012b\2\2\u02b2\u02b4\5.\30\2\u02b3\u02b1"+
		"\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02b3\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6"+
		"\u02b8\3\2\2\2\u02b7\u02a9\3\2\2\2\u02b7\u02b0\3\2\2\2\u02b8\u0087\3\2"+
		"\2\2\u02b9\u02ba\7\u013b\2\2\u02ba\u02bf\5\\/\2\u02bb\u02bc\7\u0138\2"+
		"\2\u02bc\u02be\5\\/\2\u02bd\u02bb\3\2\2\2\u02be\u02c1\3\2\2\2\u02bf\u02bd"+
		"\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02c2\3\2\2\2\u02c1\u02bf\3\2\2\2\u02c2"+
		"\u02c3\7\u013a\2\2\u02c3\u0089\3\2\2\2\u02c4\u02c5\7\u0105\2\2\u02c5\u02c6"+
		"\5\\/\2\u02c6\u02c7\5\f\7\2\u02c7\u008b\3\2\2\2\u02c8\u02cd\5\u008eH\2"+
		"\u02c9\u02ca\7\u0138\2\2\u02ca\u02cc\5\u008eH\2\u02cb\u02c9\3\2\2\2\u02cc"+
		"\u02cf\3\2\2\2\u02cd\u02cb\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce\u008d\3\2"+
		"\2\2\u02cf\u02cd\3\2\2\2\u02d0\u02d3\5\u0090I\2\u02d1\u02d3\5\u0096L\2"+
		"\u02d2\u02d0\3\2\2\2\u02d2\u02d1\3\2\2\2\u02d3\u008f\3\2\2\2\u02d4\u02e5"+
		"\5\u0092J\2\u02d5\u02d7\7\u00c2\2\2\u02d6\u02d5\3\2\2\2\u02d6\u02d7\3"+
		"\2\2\2\u02d7\u02d9\3\2\2\2\u02d8\u02da\t\22\2\2\u02d9\u02d8\3\2\2\2\u02d9"+
		"\u02da\3\2\2\2\u02da\u02dc\3\2\2\2\u02db\u02dd\7\27\2\2\u02dc\u02db\3"+
		"\2\2\2\u02dc\u02dd\3\2\2\2\u02dd\u02de\3\2\2\2\u02de\u02df\7\32\2\2\u02df"+
		"\u02e1\5\u0096L\2\u02e0\u02e2\5\u0098M\2\u02e1\u02e0\3\2\2\2\u02e1\u02e2"+
		"\3\2\2\2\u02e2\u02e4\3\2\2\2\u02e3\u02d6\3\2\2\2\u02e4\u02e7\3\2\2\2\u02e5"+
		"\u02e3\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6\u0091\3\2\2\2\u02e7\u02e5\3\2"+
		"\2\2\u02e8\u02f3\5\u0094K\2\u02e9\u02eb\t\22\2\2\u02ea\u02ec\7\27\2\2"+
		"\u02eb\u02ea\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec\u02ed\3\2\2\2\u02ed\u02ee"+
		"\7\32\2\2\u02ee\u02ef\5\u0094K\2\u02ef\u02f0\5\u0098M\2\u02f0\u02f2\3"+
		"\2\2\2\u02f1\u02e9\3\2\2\2\u02f2\u02f5\3\2\2\2\u02f3\u02f1\3\2\2\2\u02f3"+
		"\u02f4\3\2\2\2\u02f4\u0093\3\2\2\2\u02f5\u02f3\3\2\2\2\u02f6\u02f8\5\u0096"+
		"L\2\u02f7\u02f9\5L\'\2\u02f8\u02f7\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9\u0302"+
		"\3\2\2\2\u02fa\u02fc\t\22\2\2\u02fb\u02fd\7\27\2\2\u02fc\u02fb\3\2\2\2"+
		"\u02fc\u02fd\3\2\2\2\u02fd\u02ff\3\2\2\2\u02fe\u02fa\3\2\2\2\u02fe\u02ff"+
		"\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u0301\7\32\2\2\u0301\u0303\5\u0096"+
		"L\2\u0302\u02fe\3\2\2\2\u0302\u0303\3\2\2\2\u0303\u0095\3\2\2\2\u0304"+
		"\u0306\5\u00c8e\2\u0305\u0307\5L\'\2\u0306\u0305\3\2\2\2\u0306\u0307\3"+
		"\2\2\2\u0307\u0312\3\2\2\2\u0308\u030a\5\u00c6d\2\u0309\u030b\5L\'\2\u030a"+
		"\u0309\3\2\2\2\u030a\u030b\3\2\2\2\u030b\u0312\3\2\2\2\u030c\u030d\7\u013b"+
		"\2\2\u030d\u030e\5\u008cG\2\u030e\u030f\7\u013a\2\2\u030f\u0312\3\2\2"+
		"\2\u0310\u0312\7\u014e\2\2\u0311\u0304\3\2\2\2\u0311\u0308\3\2\2\2\u0311"+
		"\u030c\3\2\2\2\u0311\u0310\3\2\2\2\u0312\u0097\3\2\2\2\u0313\u0314\7\36"+
		"\2\2\u0314\u0315\5\\/\2\u0315\u0099\3\2\2\2\u0316\u031b\5\u009eP\2\u0317"+
		"\u0318\7\u0138\2\2\u0318\u031a\5\u009eP\2\u0319\u0317\3\2\2\2\u031a\u031d"+
		"\3\2\2\2\u031b\u0319\3\2\2\2\u031b\u031c\3\2\2\2\u031c\u009b\3\2\2\2\u031d"+
		"\u031b\3\2\2\2\u031e\u0327\t\23\2\2\u031f\u0325\7\u00d8\2\2\u0320\u0326"+
		"\7\32\2\2\u0321\u0322\7\f\2\2\u0322\u0326\7\16\2\2\u0323\u0324\7\r\2\2"+
		"\u0324\u0326\7\16\2\2\u0325\u0320\3\2\2\2\u0325\u0321\3\2\2\2\u0325\u0323"+
		"\3\2\2\2\u0326\u0328\3\2\2\2\u0327\u031f\3\2\2\2\u0327\u0328\3\2\2\2\u0328"+
		"\u009d\3\2\2\2\u0329\u032a\7\u00ce\2\2\u032a\u032b\5\u009cO\2\u032b\u032d"+
		"\7\u013b\2\2\u032c\u032e\5\u00a0Q\2\u032d\u032c\3\2\2\2\u032d\u032e\3"+
		"\2\2\2\u032e\u032f\3\2\2\2\u032f\u0330\7\u013a\2\2\u0330\u0338\3\2\2\2"+
		"\u0331\u0332\7D\2\2\u0332\u0333\5\u009cO\2\u0333\u0334\7\u013b\2\2\u0334"+
		"\u0335\5\u00a0Q\2\u0335\u0336\7\u013a\2\2\u0336\u0338\3\2\2\2\u0337\u0329"+
		"\3\2\2\2\u0337\u0331\3\2\2\2\u0338\u009f\3\2\2\2\u0339\u033e\5\64\33\2"+
		"\u033a\u033b\7\u0138\2\2\u033b\u033d\5\64\33\2\u033c\u033a\3\2\2\2\u033d"+
		"\u0340\3\2\2\2\u033e\u033c\3\2\2\2\u033e\u033f\3\2\2\2\u033f\u00a1\3\2"+
		"\2\2\u0340\u033e\3\2\2\2\u0341\u0342\7\37\2\2\u0342\u0343\7\u013b\2\2"+
		"\u0343\u0344\5\u00a4S\2\u0344\u0345\7\u013a\2\2\u0345\u00a3\3\2\2\2\u0346"+
		"\u034b\5\66\34\2\u0347\u0348\7\u0138\2\2\u0348\u034a\5\66\34\2\u0349\u0347"+
		"\3\2\2\2\u034a\u034d\3\2\2\2\u034b\u0349\3\2\2\2\u034b\u034c\3\2\2\2\u034c"+
		"\u00a5\3\2\2\2\u034d\u034b\3\2\2\2\u034e\u0351\5\u00a8U\2\u034f\u0351"+
		"\5\u00aaV\2\u0350\u034e\3\2\2\2\u0350\u034f\3\2\2\2\u0351\u0353\3\2\2"+
		"\2\u0352\u0354\7\u0135\2\2\u0353\u0352\3\2\2\2\u0353\u0354\3\2\2\2\u0354"+
		"\u00a7\3\2\2\2\u0355\u035b\5\u00acW\2\u0356\u035b\5\u012c\u0097\2\u0357"+
		"\u035b\5\u00ccg\2\u0358\u035b\5\u012a\u0096\2\u0359\u035b\5\u0128\u0095"+
		"\2\u035a\u0355\3\2\2\2\u035a\u0356\3\2\2\2\u035a\u0357\3\2\2\2\u035a\u0358"+
		"\3\2\2\2\u035a\u0359\3\2\2\2\u035b\u00a9\3\2\2\2\u035c\u036c\5\u00dco"+
		"\2\u035d\u036c\5\u00dep\2\u035e\u036c\5\u0116\u008c\2\u035f\u036c\5\u0118"+
		"\u008d\2\u0360\u036c\5\u011a\u008e\2\u0361\u036c\5\u011e\u0090\2\u0362"+
		"\u036c\5\u0120\u0091\2\u0363\u036c\5\u0124\u0093\2\u0364\u036c\5\u00e0"+
		"q\2\u0365\u036c\5\u00fc\177\2\u0366\u036c\5\u010a\u0086\2\u0367\u036c"+
		"\5\u010c\u0087\2\u0368\u036c\5\u0110\u0089\2\u0369\u036c\5\u0114\u008b"+
		"\2\u036a\u036c\5\u0126\u0094\2\u036b\u035c\3\2\2\2\u036b\u035d\3\2\2\2"+
		"\u036b\u035e\3\2\2\2\u036b\u035f\3\2\2\2\u036b\u0360\3\2\2\2\u036b\u0361"+
		"\3\2\2\2\u036b\u0362\3\2\2\2\u036b\u0363\3\2\2\2\u036b\u0364\3\2\2\2\u036b"+
		"\u0365\3\2\2\2\u036b\u0366\3\2\2\2\u036b\u0367\3\2\2\2\u036b\u0368\3\2"+
		"\2\2\u036b\u0369\3\2\2\2\u036b\u036a\3\2\2\2\u036c\u00ab\3\2\2\2\u036d"+
		"\u0375\5\u00aeX\2\u036e\u0370\7\62\2\2\u036f\u0371\t\24\2\2\u0370\u036f"+
		"\3\2\2\2\u0370\u0371\3\2\2\2\u0371\u0372\3\2\2\2\u0372\u0374\5\u00aeX"+
		"\2\u0373\u036e\3\2\2\2\u0374\u0377\3\2\2\2\u0375\u0373\3\2\2\2\u0375\u0376"+
		"\3\2\2\2\u0376\u00ad\3\2\2\2\u0377\u0375\3\2\2\2\u0378\u037a\7\23\2\2"+
		"\u0379\u037b\t\24\2\2\u037a\u0379\3\2\2\2\u037a\u037b\3\2\2\2\u037b\u037c"+
		"\3\2\2\2\u037c\u0388\5\u00c2b\2\u037d\u037e\7\21\2\2\u037e\u0380\5\u008c"+
		"G\2\u037f\u0381\5\u00b0Y\2\u0380\u037f\3\2\2\2\u0380\u0381\3\2\2\2\u0381"+
		"\u0383\3\2\2\2\u0382\u0384\5\u00b2Z\2\u0383\u0382\3\2\2\2\u0383\u0384"+
		"\3\2\2\2\u0384\u0386\3\2\2\2\u0385\u0387\5\u00b6\\\2\u0386\u0385\3\2\2"+
		"\2\u0386\u0387\3\2\2\2\u0387\u0389\3\2\2\2\u0388\u037d\3\2\2\2\u0388\u0389"+
		"\3\2\2\2\u0389\u038b\3\2\2\2\u038a\u038c\5\u00b8]\2\u038b\u038a\3\2\2"+
		"\2\u038b\u038c\3\2\2\2\u038c\u038e\3\2\2\2\u038d\u038f\5\u00bc_\2\u038e"+
		"\u038d\3\2\2\2\u038e\u038f\3\2\2\2\u038f\u00af\3\2\2\2\u0390\u0391\7\20"+
		"\2\2\u0391\u0392\5\\/\2\u0392\u00b1\3\2\2\2\u0393\u0394\7\r\2\2\u0394"+
		"\u0395\7\16\2\2\u0395\u039a\5\u00b4[\2\u0396\u0397\7\u0138\2\2\u0397\u0399"+
		"\5\u00b4[\2\u0398\u0396\3\2\2\2\u0399\u039c\3\2\2\2\u039a\u0398\3\2\2"+
		"\2\u039a\u039b\3\2\2\2\u039b\u039f\3\2\2\2\u039c\u039a\3\2\2\2\u039d\u039e"+
		"\7\u008f\2\2\u039e\u03a0\7\u00d5\2\2\u039f\u039d\3\2\2\2\u039f\u03a0\3"+
		"\2\2\2\u03a0\u00b3\3\2\2\2\u03a1\u03a5\5\u0084C\2\u03a2\u03a5\7\u0147"+
		"\2\2\u03a3\u03a5\5j\66\2\u03a4\u03a1\3\2\2\2\u03a4\u03a2\3\2\2\2\u03a4"+
		"\u03a3\3\2\2\2\u03a5\u00b5\3\2\2\2\u03a6\u03a7\7\17\2\2\u03a7\u03a8\5"+
		"\\/\2\u03a8\u00b7\3\2\2\2\u03a9\u03aa\7\f\2\2\u03aa\u03ab\7\16\2\2\u03ab"+
		"\u03b0\5\u00ba^\2\u03ac\u03ad\7\u0138\2\2\u03ad\u03af\5\u00ba^\2\u03ae"+
		"\u03ac\3\2\2\2\u03af\u03b2\3\2\2\2\u03b0\u03ae\3\2\2\2\u03b0\u03b1\3\2"+
		"\2\2\u03b1\u00b9\3\2\2\2\u03b2\u03b0\3\2\2\2\u03b3\u03b5\5\u00b4[\2\u03b4"+
		"\u03b6\t\25\2\2\u03b5\u03b4\3\2\2\2\u03b5\u03b6\3\2\2\2\u03b6\u00bb\3"+
		"\2\2\2\u03b7\u03bb\7\u0093\2\2\u03b8\u03b9\5\u00be`\2\u03b9\u03ba\7\u0138"+
		"\2\2\u03ba\u03bc\3\2\2\2\u03bb\u03b8\3\2\2\2\u03bb\u03bc\3\2\2\2\u03bc"+
		"\u03bd\3\2\2\2\u03bd\u03be\5\u00c0a\2\u03be\u00bd\3\2\2\2\u03bf\u03c0"+
		"\7\u0147\2\2\u03c0\u00bf\3\2\2\2\u03c1\u03c2\7\u0147\2\2\u03c2\u00c1\3"+
		"\2\2\2\u03c3\u03c8\5\u00caf\2\u03c4\u03c5\7\u0138\2\2\u03c5\u03c7\5\u00ca"+
		"f\2\u03c6\u03c4\3\2\2\2\u03c7\u03ca\3\2\2\2\u03c8\u03c6\3\2\2\2\u03c8"+
		"\u03c9\3\2\2\2\u03c9\u00c3\3\2\2\2\u03ca\u03c8\3\2\2\2\u03cb\u03cc\7\u013b"+
		"\2\2\u03cc\u03d1\5\u0084C\2\u03cd\u03ce\7\u0138\2\2\u03ce\u03d0\5\u0084"+
		"C\2\u03cf\u03cd\3\2\2\2\u03d0\u03d3\3\2\2\2\u03d1\u03cf\3\2\2\2\u03d1"+
		"\u03d2\3\2\2\2\u03d2\u03d4\3\2\2\2\u03d3\u03d1\3\2\2\2\u03d4\u03d5\7\u013a"+
		"\2\2\u03d5\u00c5\3\2\2\2\u03d6\u03d7\7\u013b\2\2\u03d7\u03d8\5\u00acW"+
		"\2\u03d8\u03d9\7\u013a\2\2\u03d9\u00c7\3\2\2\2\u03da\u03db\5&\24\2\u03db"+
		"\u03dc\7\u0137\2\2\u03dc\u03de\3\2\2\2\u03dd\u03da\3\2\2\2\u03dd\u03de"+
		"\3\2\2\2\u03de\u03df\3\2\2\2\u03df\u03e0\5*\26\2\u03e0\u00c9\3\2\2\2\u03e1"+
		"\u03ef\7\u0139\2\2\u03e2\u03e3\5\u00c8e\2\u03e3\u03e4\7\u0137\2\2\u03e4"+
		"\u03e5\7\u0139\2\2\u03e5\u03ef\3\2\2\2\u03e6\u03e8\5\u0084C\2\u03e7\u03e9"+
		"\5L\'\2\u03e8\u03e7\3\2\2\2\u03e8\u03e9\3\2\2\2\u03e9\u03ef\3\2\2\2\u03ea"+
		"\u03ec\5j\66\2\u03eb\u03ed\5L\'\2\u03ec\u03eb\3\2\2\2\u03ec\u03ed\3\2"+
		"\2\2\u03ed\u03ef\3\2\2\2\u03ee\u03e1\3\2\2\2\u03ee\u03e2\3\2\2\2\u03ee"+
		"\u03e6\3\2\2\2\u03ee\u03ea\3\2\2\2\u03ef\u00cb\3\2\2\2\u03f0\u03f1\5\u00d2"+
		"j\2\u03f1\u00cd\3\2\2\2\u03f2\u03f4\7\25\2\2\u03f3\u03f5\t\26\2\2\u03f4"+
		"\u03f3\3\2\2\2\u03f4\u03f5\3\2\2\2\u03f5\u03f7\3\2\2\2\u03f6\u03f8\7D"+
		"\2\2\u03f7\u03f6\3\2\2\2\u03f7\u03f8\3\2\2\2\u03f8\u03fa\3\2\2\2\u03f9"+
		"\u03fb\7]\2\2\u03fa\u03f9\3\2\2\2\u03fa\u03fb\3\2\2\2\u03fb\u03fc\3\2"+
		"\2\2\u03fc\u03fe\5\u00c8e\2\u03fd\u03ff\5\u00a2R\2\u03fe\u03fd\3\2\2\2"+
		"\u03fe\u03ff\3\2\2\2\u03ff\u00cf\3\2\2\2\u0400\u0401\7\36\2\2\u0401\u0402"+
		"\7\u0117\2\2\u0402\u0403\7i\2\2\u0403\u0404\7\u00d1\2\2\u0404\u0405\5"+
		"\u0084C\2\u0405\u0406\7\u012e\2\2\u0406\u040e\5\\/\2\u0407\u0408\7\u0138"+
		"\2\2\u0408\u0409\5\u0084C\2\u0409\u040a\7\u012e\2\2\u040a\u040b\5\\/\2"+
		"\u040b\u040d\3\2\2\2\u040c\u0407\3\2\2\2\u040d\u0410\3\2\2\2\u040e\u040c"+
		"\3\2\2\2\u040e\u040f\3\2\2\2\u040f\u00d1\3\2\2\2\u0410\u040e\3\2\2\2\u0411"+
		"\u0413\5\u00ceh\2\u0412\u0414\5\u00c4c\2\u0413\u0412\3\2\2\2\u0413\u0414"+
		"\3\2\2\2\u0414\u0417\3\2\2\2\u0415\u0418\5\u00aeX\2\u0416\u0418\5\u00d4"+
		"k\2\u0417\u0415\3\2\2\2\u0417\u0416\3\2\2\2\u0418\u041a\3\2\2\2\u0419"+
		"\u041b\5\u00d0i\2\u041a\u0419\3\2\2\2\u041a\u041b\3\2\2\2\u041b\u00d3"+
		"\3\2\2\2\u041c\u041d\t\27\2\2\u041d\u0422\5\u00d6l\2\u041e\u041f\7\u0138"+
		"\2\2\u041f\u0421\5\u00d6l\2\u0420\u041e\3\2\2\2\u0421\u0424\3\2\2\2\u0422"+
		"\u0420\3\2\2\2\u0422\u0423\3\2\2\2\u0423\u00d5\3\2\2\2\u0424\u0422\3\2"+
		"\2\2\u0425\u0428\7\u013b\2\2\u0426\u0429\5j\66\2\u0427\u0429\7w\2\2\u0428"+
		"\u0426\3\2\2\2\u0428\u0427\3\2\2\2\u0429\u0431\3\2\2\2\u042a\u042d\7\u0138"+
		"\2\2\u042b\u042e\5j\66\2\u042c\u042e\7w\2\2\u042d\u042b\3\2\2\2\u042d"+
		"\u042c\3\2\2\2\u042e\u0430\3\2\2\2\u042f\u042a\3\2\2\2\u0430\u0433\3\2"+
		"\2\2\u0431\u042f\3\2\2\2\u0431\u0432\3\2\2\2\u0432\u0434\3\2\2\2\u0433"+
		"\u0431\3\2\2\2\u0434\u0435\7\u013a\2\2\u0435\u00d7\3\2\2\2\u0436\u0437"+
		"\7\u0094\2\2\u0437\u043c\5\u00dan\2\u0438\u0439\7\u0138\2\2\u0439\u043b"+
		"\5\u00dan\2\u043a\u0438\3\2\2\2\u043b\u043e\3\2\2\2\u043c\u043a\3\2\2"+
		"\2\u043c\u043d\3\2\2\2\u043d\u00d9\3\2\2\2\u043e\u043c\3\2\2\2\u043f\u0440"+
		"\5\u0084C\2\u0440\u0443\7\u012e\2\2\u0441\u0444\5\\/\2\u0442\u0444\7w"+
		"\2\2\u0443\u0441\3\2\2\2\u0443\u0442\3\2\2\2\u0444\u00db\3\2\2\2\u0445"+
		"\u0446\7:\2\2\u0446\u044a\t\30\2\2\u0447\u0448\7\b\2\2\u0448\u0449\7\6"+
		"\2\2\u0449\u044b\7\t\2\2\u044a\u0447\3\2\2\2\u044a\u044b\3\2\2\2\u044b"+
		"\u044c\3\2\2\2\u044c\u044d\5&\24\2\u044d\u00dd\3\2\2\2\u044e\u044f\7B"+
		"\2\2\u044f\u0452\t\30\2\2\u0450\u0451\7\b\2\2\u0451\u0453\7\t\2\2\u0452"+
		"\u0450\3\2\2\2\u0452\u0453\3\2\2\2\u0453\u0454\3\2\2\2\u0454\u0455\5&"+
		"\24\2\u0455\u00df\3\2\2\2\u0456\u045a\5\u00e2r\2\u0457\u045a\5\u00e4s"+
		"\2\u0458\u045a\5\u00e6t\2\u0459\u0456\3\2\2\2\u0459\u0457\3\2\2\2\u0459"+
		"\u0458\3\2\2\2\u045a\u00e1\3\2\2\2\u045b\u045d\7:\2\2\u045c\u045e\7\u0085"+
		"\2\2\u045d\u045c\3\2\2\2\u045d\u045e\3\2\2\2\u045e\u0460\3\2\2\2\u045f"+
		"\u0461\7;\2\2\u0460\u045f\3\2\2\2\u0460\u0461\3\2\2\2\u0461\u0462\3\2"+
		"\2\2\u0462\u0466\7!\2\2\u0463\u0464\7\b\2\2\u0464\u0465\7\6\2\2\u0465"+
		"\u0467\7\t\2\2\u0466\u0463\3\2\2\2\u0466\u0467\3\2\2\2\u0467\u046b\3\2"+
		"\2\2\u0468\u0469\5(\25\2\u0469\u046a\7\u0137\2\2\u046a\u046c\3\2\2\2\u046b"+
		"\u0468\3\2\2\2\u046b\u046c\3\2\2\2\u046c\u046d\3\2\2\2\u046d\u0479\5*"+
		"\26\2\u046e\u046f\7\u013b\2\2\u046f\u0474\5\u00e8u\2\u0470\u0471\7\u0138"+
		"\2\2\u0471\u0473\5\u00e8u\2\u0472\u0470\3\2\2\2\u0473\u0476\3\2\2\2\u0474"+
		"\u0472\3\2\2\2\u0474\u0475\3\2\2\2\u0475\u0477\3\2\2\2\u0476\u0474\3\2"+
		"\2\2\u0477\u0478\7\u013a\2\2\u0478\u047a\3\2\2\2\u0479\u046e\3\2\2\2\u0479"+
		"\u047a\3\2\2\2\u047a\u047d\3\2\2\2\u047b\u047c\7G\2\2\u047c\u047e\7\u014d"+
		"\2\2\u047d\u047b\3\2\2\2\u047d\u047e\3\2\2\2\u047e\u0481\3\2\2\2\u047f"+
		"\u0480\7\22\2\2\u0480\u0482\5\u00acW\2\u0481\u047f\3\2\2\2\u0481\u0482"+
		"\3\2\2\2\u0482\u00e3\3\2\2\2\u0483\u0485\7:\2\2\u0484\u0486\7\u0085\2"+
		"\2\u0485\u0484\3\2\2\2\u0485\u0486\3\2\2\2\u0486\u0488\3\2\2\2\u0487\u0489"+
		"\7;\2\2\u0488\u0487\3\2\2\2\u0488\u0489\3\2\2\2\u0489\u048a\3\2\2\2\u048a"+
		"\u048e\7!\2\2\u048b\u048c\7\b\2\2\u048c\u048d\7\6\2\2\u048d\u048f\7\t"+
		"\2\2\u048e\u048b\3\2\2\2\u048e\u048f\3\2\2\2\u048f\u0490\3\2\2\2\u0490"+
		"\u0491\5*\26\2\u0491\u0492\7\22\2\2\u0492\u0493\5\u00acW\2\u0493\u00e5"+
		"\3\2\2\2\u0494\u0496\7:\2\2\u0495\u0497\7\u0085\2\2\u0496\u0495\3\2\2"+
		"\2\u0496\u0497\3\2\2\2\u0497\u0499\3\2\2\2\u0498\u049a\7;\2\2\u0499\u0498"+
		"\3\2\2\2\u0499\u049a\3\2\2\2\u049a\u049b\3\2\2\2\u049b\u049f\7!\2\2\u049c"+
		"\u049d\7\b\2\2\u049d\u049e\7\6\2\2\u049e\u04a0\7\t\2\2\u049f\u049c\3\2"+
		"\2\2\u049f\u04a0\3\2\2\2\u04a0\u04a1\3\2\2\2\u04a1\u04a9\5*\26\2\u04a2"+
		"\u04a3\7\7\2\2\u04a3\u04aa\5*\26\2\u04a4\u04a5\7\u013b\2\2\u04a5\u04a6"+
		"\7\7\2\2\u04a6\u04a7\5*\26\2\u04a7\u04a8\7\u013a\2\2\u04a8\u04aa\3\2\2"+
		"\2\u04a9\u04a2\3\2\2\2\u04a9\u04a4\3\2\2\2\u04aa\u00e7\3\2\2\2\u04ab\u04ac"+
		"\5.\30\2\u04ac\u04ad\5\u00eav\2\u04ad\u04c6\3\2\2\2\u04ae\u04b0\t\23\2"+
		"\2\u04af\u04b1\5\64\33\2\u04b0\u04af\3\2\2\2\u04b0\u04b1\3\2\2\2\u04b1"+
		"\u04b3\3\2\2\2\u04b2\u04b4\5\u0102\u0082\2\u04b3\u04b2\3\2\2\2\u04b3\u04b4"+
		"\3\2\2\2\u04b4\u04b5\3\2\2\2\u04b5\u04b6\7\u013b\2\2\u04b6\u04bb\5\u00f0"+
		"y\2\u04b7\u04b8\7\u0138\2\2\u04b8\u04ba\5\u00f0y\2\u04b9\u04b7\3\2\2\2"+
		"\u04ba\u04bd\3\2\2\2\u04bb\u04b9\3\2\2\2\u04bb\u04bc\3\2\2\2\u04bc\u04be"+
		"\3\2\2\2\u04bd\u04bb\3\2\2\2\u04be\u04c2\7\u013a\2\2\u04bf\u04c1\5\u0104"+
		"\u0083\2\u04c0\u04bf\3\2\2\2\u04c1\u04c4\3\2\2\2\u04c2\u04c0\3\2\2\2\u04c2"+
		"\u04c3\3\2\2\2\u04c3\u04c6\3\2\2\2\u04c4\u04c2\3\2\2\2\u04c5\u04ab\3\2"+
		"\2\2\u04c5\u04ae\3\2\2\2\u04c6\u00e9\3\2\2\2\u04c7\u04ca\5\u00eex\2\u04c8"+
		"\u04c9\7G\2\2\u04c9\u04cb\7\u014d\2\2\u04ca\u04c8\3\2\2\2\u04ca\u04cb"+
		"\3\2\2\2\u04cb\u04cd\3\2\2\2\u04cc\u04ce\5\u00f2z\2\u04cd\u04cc\3\2\2"+
		"\2\u04cd\u04ce\3\2\2\2\u04ce\u00eb\3\2\2\2\u04cf\u04d0\7\6\2\2\u04d0\u04d3"+
		"\79\2\2\u04d1\u04d3\79\2\2\u04d2\u04cf\3\2\2\2\u04d2\u04d1\3\2\2\2\u04d3"+
		"\u00ed\3\2\2\2\u04d4\u04d9\7I\2\2\u04d5\u04d6\7\u013b\2\2\u04d6\u04d7"+
		"\5\u00f6|\2\u04d7\u04d8\7\u013a\2\2\u04d8\u04da\3\2\2\2\u04d9\u04d5\3"+
		"\2\2\2\u04d9\u04da\3\2\2\2\u04da\u04dc\3\2\2\2\u04db\u04dd\7\u00b7\2\2"+
		"\u04dc\u04db\3\2\2\2\u04dc\u04dd\3\2\2\2\u04dd\u04df\3\2\2\2\u04de\u04e0"+
		"\5\u00ecw\2\u04df\u04de\3\2\2\2\u04df\u04e0\3\2\2\2\u04e0\u04e3\3\2\2"+
		"\2\u04e1\u04e2\7w\2\2\u04e2\u04e4\5\20\t\2\u04e3\u04e1\3\2\2\2\u04e3\u04e4"+
		"\3\2\2\2\u04e4\u058d\3\2\2\2\u04e5\u04ea\7J\2\2\u04e6\u04e7\7\u013b\2"+
		"\2\u04e7\u04e8\5\u00f6|\2\u04e8\u04e9\7\u013a\2\2\u04e9\u04eb\3\2\2\2"+
		"\u04ea\u04e6\3\2\2\2\u04ea\u04eb\3\2\2\2\u04eb\u04ed\3\2\2\2\u04ec\u04ee"+
		"\7\u00b7\2\2\u04ed\u04ec\3\2\2\2\u04ed\u04ee\3\2\2\2\u04ee\u04f0\3\2\2"+
		"\2\u04ef\u04f1\5\u00ecw\2\u04f0\u04ef\3\2\2\2\u04f0\u04f1\3\2\2\2\u04f1"+
		"\u04f4\3\2\2\2\u04f2\u04f3\7w\2\2\u04f3\u04f5\5\20\t\2\u04f4\u04f2\3\2"+
		"\2\2\u04f4\u04f5\3\2\2\2\u04f5\u058d\3\2\2\2\u04f6\u04fb\7K\2\2\u04f7"+
		"\u04f8\7\u013b\2\2\u04f8\u04f9\5\u00f6|\2\u04f9\u04fa\7\u013a\2\2\u04fa"+
		"\u04fc\3\2\2\2\u04fb\u04f7\3\2\2\2\u04fb\u04fc\3\2\2\2\u04fc\u04fe\3\2"+
		"\2\2\u04fd\u04ff\7\u00b7\2\2\u04fe\u04fd\3\2\2\2\u04fe\u04ff\3\2\2\2\u04ff"+
		"\u0501\3\2\2\2\u0500\u0502\5\u00ecw\2\u0501\u0500\3\2\2\2\u0501\u0502"+
		"\3\2\2\2\u0502\u0505\3\2\2\2\u0503\u0504\7w\2\2\u0504\u0506\5\20\t\2\u0505"+
		"\u0503\3\2\2\2\u0505\u0506\3\2\2\2\u0506\u058d\3\2\2\2\u0507\u050c\7L"+
		"\2\2\u0508\u0509\7\u013b\2\2\u0509\u050a\5\u00f6|\2\u050a\u050b\7\u013a"+
		"\2\2\u050b\u050d\3\2\2\2\u050c\u0508\3\2\2\2\u050c\u050d\3\2\2\2\u050d"+
		"\u050f\3\2\2\2\u050e\u0510\7\u00b7\2\2\u050f\u050e\3\2\2\2\u050f\u0510"+
		"\3\2\2\2\u0510\u0512\3\2\2\2\u0511\u0513\5\u00ecw\2\u0512\u0511\3\2\2"+
		"\2\u0512\u0513\3\2\2\2\u0513\u0516\3\2\2\2\u0514\u0515\7w\2\2\u0515\u0517"+
		"\5\20\t\2\u0516\u0514\3\2\2\2\u0516\u0517\3\2\2\2\u0517\u058d\3\2\2\2"+
		"\u0518\u051f\7N\2\2\u0519\u051a\7\u013b\2\2\u051a\u051b\5\u00f6|\2\u051b"+
		"\u051c\7\u0138\2\2\u051c\u051d\5\20\t\2\u051d\u051e\7\u013a\2\2\u051e"+
		"\u0520\3\2\2\2\u051f\u0519\3\2\2\2\u051f\u0520\3\2\2\2\u0520\u0522\3\2"+
		"\2\2\u0521\u0523\7\u00b7\2\2\u0522\u0521\3\2\2\2\u0522\u0523\3\2\2\2\u0523"+
		"\u0525\3\2\2\2\u0524\u0526\5\u00ecw\2\u0525\u0524\3\2\2\2\u0525\u0526"+
		"\3\2\2\2\u0526\u0529\3\2\2\2\u0527\u0528\7w\2\2\u0528\u052a\5\20\t\2\u0529"+
		"\u0527\3\2\2\2\u0529\u052a\3\2\2\2\u052a\u058d\3\2\2\2\u052b\u0532\7M"+
		"\2\2\u052c\u052d\7\u013b\2\2\u052d\u052e\5\u00f6|\2\u052e\u052f\7\u0138"+
		"\2\2\u052f\u0530\5\20\t\2\u0530\u0531\7\u013a\2\2\u0531\u0533\3\2\2\2"+
		"\u0532\u052c\3\2\2\2\u0532\u0533\3\2\2\2\u0533\u0535\3\2\2\2\u0534\u0536"+
		"\7\u00b7\2\2\u0535\u0534\3\2\2\2\u0535\u0536\3\2\2\2\u0536\u0538\3\2\2"+
		"\2\u0537\u0539\5\u00ecw\2\u0538\u0537\3\2\2\2\u0538\u0539\3\2\2\2\u0539"+
		"\u053c\3\2\2\2\u053a\u053b\7w\2\2\u053b\u053d\5\20\t\2\u053c\u053a\3\2"+
		"\2\2\u053c\u053d\3\2\2\2\u053d\u058d\3\2\2\2\u053e\u0547\7R\2\2\u053f"+
		"\u0540\7\u013b\2\2\u0540\u0543\5\u00f6|\2\u0541\u0542\7\u0138\2\2\u0542"+
		"\u0544\5\20\t\2\u0543\u0541\3\2\2\2\u0543\u0544\3\2\2\2\u0544\u0545\3"+
		"\2\2\2\u0545\u0546\7\u013a\2\2\u0546\u0548\3\2\2\2\u0547\u053f\3\2\2\2"+
		"\u0547\u0548\3\2\2\2\u0548\u054a\3\2\2\2\u0549\u054b\7\u00b7\2\2\u054a"+
		"\u0549\3\2\2\2\u054a\u054b\3\2\2\2\u054b\u054d\3\2\2\2\u054c\u054e\5\u00ec"+
		"w\2\u054d\u054c\3\2\2\2\u054d\u054e\3\2\2\2\u054e\u0551\3\2\2\2\u054f"+
		"\u0550\7w\2\2\u0550\u0552\5\20\t\2\u0551\u054f\3\2\2\2\u0551\u0552\3\2"+
		"\2\2\u0552\u058d\3\2\2\2\u0553\u0555\7O\2\2\u0554\u0556\5\u00ecw\2\u0555"+
		"\u0554\3\2\2\2\u0555\u0556\3\2\2\2\u0556\u0559\3\2\2\2\u0557\u0558\7w"+
		"\2\2\u0558\u055a\7\u014d\2\2\u0559\u0557\3\2\2\2\u0559\u055a\3\2\2\2\u055a"+
		"\u058d\3\2\2\2\u055b\u055d\7Q\2\2\u055c\u055e\5\u00ecw\2\u055d\u055c\3"+
		"\2\2\2\u055d\u055e\3\2\2\2\u055e\u0561\3\2\2\2\u055f\u0560\7w\2\2\u0560"+
		"\u0562\7\u014d\2\2\u0561\u055f\3\2\2\2\u0561\u0562\3\2\2\2\u0562\u058d"+
		"\3\2\2\2\u0563\u0565\7P\2\2\u0564\u0566\5\u00ecw\2\u0565\u0564\3\2\2\2"+
		"\u0565\u0566\3\2\2\2\u0566\u0569\3\2\2\2\u0567\u0568\7w\2\2\u0568\u056a"+
		"\7\u014d\2\2\u0569\u0567\3\2\2\2\u0569\u056a\3\2\2\2\u056a\u058d\3\2\2"+
		"\2\u056b\u056c\7T\2\2\u056c\u056d\7\u013b\2\2\u056d\u056e\5\u00f8}\2\u056e"+
		"\u0570\7\u013a\2\2\u056f\u0571\5\u00ecw\2\u0570\u056f\3\2\2\2\u0570\u0571"+
		"\3\2\2\2\u0571\u0574\3\2\2\2\u0572\u0573\7w\2\2\u0573\u0575\7\u014d\2"+
		"\2\u0574\u0572\3\2\2\2\u0574\u0575\3\2\2\2\u0575\u058d\3\2\2\2\u0576\u057b"+
		"\7\u00c1\2\2\u0577\u0578\7\u013b\2\2\u0578\u0579\5\u00fa~\2\u0579\u057a"+
		"\7\u013a\2\2\u057a\u057c\3\2\2\2\u057b\u0577\3\2\2\2\u057b\u057c\3\2\2"+
		"\2\u057c\u057e\3\2\2\2\u057d\u057f\5\u00ecw\2\u057e\u057d\3\2\2\2\u057e"+
		"\u057f\3\2\2\2\u057f\u0582\3\2\2\2\u0580\u0581\7w\2\2\u0581\u0583\7\u014d"+
		"\2\2\u0582\u0580\3\2\2\2\u0582\u0583\3\2\2\2\u0583\u058d\3\2\2\2\u0584"+
		"\u0586\7H\2\2\u0585\u0587\5\u00ecw\2\u0586\u0585\3\2\2\2\u0586\u0587\3"+
		"\2\2\2\u0587\u058a\3\2\2\2\u0588\u0589\7w\2\2\u0589\u058b\7\u014d\2\2"+
		"\u058a\u0588\3\2\2\2\u058a\u058b\3\2\2\2\u058b\u058d\3\2\2\2\u058c\u04d4"+
		"\3\2\2\2\u058c\u04e5\3\2\2\2\u058c\u04f6\3\2\2\2\u058c\u0507\3\2\2\2\u058c"+
		"\u0518\3\2\2\2\u058c\u052b\3\2\2\2\u058c\u053e\3\2\2\2\u058c\u0553\3\2"+
		"\2\2\u058c\u055b\3\2\2\2\u058c\u0563\3\2\2\2\u058c\u056b\3\2\2\2\u058c"+
		"\u0576\3\2\2\2\u058c\u0584\3\2\2\2\u058d\u00ef\3\2\2\2\u058e\u0592\5."+
		"\30\2\u058f\u0590\7\u013b\2\2\u0590\u0591\7\u0147\2\2\u0591\u0593\7\u013a"+
		"\2\2\u0592\u058f\3\2\2\2\u0592\u0593\3\2\2\2\u0593\u0595\3\2\2\2\u0594"+
		"\u0596\t\25\2\2\u0595\u0594\3\2\2\2\u0595\u0596\3\2\2\2\u0596\u00f1\3"+
		"\2\2\2\u0597\u0598\7\u0120\2\2\u0598\u0599\5*\26\2\u0599\u059a\7\u013b"+
		"\2\2\u059a\u059f\5\u00f0y\2\u059b\u059c\7\u0138\2\2\u059c\u059e\5\u00f0"+
		"y\2\u059d\u059b\3\2\2\2\u059e\u05a1\3\2\2\2\u059f\u059d\3\2\2\2\u059f"+
		"\u05a0\3\2\2\2\u05a0\u05a2\3\2\2\2\u05a1\u059f\3\2\2\2\u05a2\u05a6\7\u013a"+
		"\2\2\u05a3\u05a4\7\36\2\2\u05a4\u05a5\7\u00a3\2\2\u05a5\u05a7\5\u00f4"+
		"{\2\u05a6\u05a3\3\2\2\2\u05a6\u05a7\3\2\2\2\u05a7\u05ab\3\2\2\2\u05a8"+
		"\u05a9\7\36\2\2\u05a9\u05aa\7\u00d1\2\2\u05aa\u05ac\5\u00f4{\2\u05ab\u05a8"+
		"\3\2\2\2\u05ab\u05ac\3\2\2\2\u05ac\u00f3\3\2\2\2\u05ad\u05b2\7\u00d2\2"+
		"\2\u05ae\u05b2\7\u00d3\2\2\u05af\u05b0\7\u0094\2\2\u05b0\u05b2\79\2\2"+
		"\u05b1\u05ad\3\2\2\2\u05b1\u05ae\3\2\2\2\u05b1\u05af\3\2\2\2\u05b2\u00f5"+
		"\3\2\2\2\u05b3\u05b4\7\u0147\2\2\u05b4\u00f7\3\2\2\2\u05b5\u05b6\7\u0147"+
		"\2\2\u05b6\u00f9\3\2\2\2\u05b7\u05b8\7\u0147\2\2\u05b8\u00fb\3\2\2\2\u05b9"+
		"\u05ba\7<\2\2\u05ba\u05bb\7!\2\2\u05bb\u05c4\5*\26\2\u05bc\u05c1\5\u00fe"+
		"\u0080\2\u05bd\u05be\7\u0138\2\2\u05be\u05c0\5\u00fe\u0080\2\u05bf\u05bd"+
		"\3\2\2\2\u05c0\u05c3\3\2\2\2\u05c1\u05bf\3\2\2\2\u05c1\u05c2\3\2\2\2\u05c2"+
		"\u05c5\3\2\2\2\u05c3\u05c1\3\2\2\2\u05c4\u05bc\3\2\2\2\u05c4\u05c5\3\2"+
		"\2\2\u05c5\u00fd\3\2\2\2\u05c6\u05c7\7C\2\2\u05c7\u05c8\7F\2\2\u05c8\u05d1"+
		"\5*\26\2\u05c9\u05cb\7=\2\2\u05ca\u05cc\7>\2\2\u05cb\u05ca\3\2\2\2\u05cb"+
		"\u05cc\3\2\2\2\u05cc\u05cd\3\2\2\2\u05cd\u05ce\5.\30\2\u05ce\u05cf\5."+
		"\30\2\u05cf\u05d1\3\2\2\2\u05d0\u05c6\3\2\2\2\u05d0\u05c9\3\2\2\2\u05d1"+
		"\u00ff\3\2\2\2\u05d2\u05d7\5\u00f0y\2\u05d3\u05d4\7\u0138\2\2\u05d4\u05d6"+
		"\5\u00f0y\2\u05d5\u05d3\3\2\2\2\u05d6\u05d9\3\2\2\2\u05d7\u05d5\3\2\2"+
		"\2\u05d7\u05d8\3\2\2\2\u05d8\u0101\3\2\2\2\u05d9\u05d7\3\2\2\2\u05da\u05db"+
		"\7.\2\2\u05db\u05dc\7\u011f\2\2\u05dc\u0103\3\2\2\2\u05dd\u05e1\5\u0102"+
		"\u0082\2\u05de\u05df\7G\2\2\u05df\u05e1\7\u014d\2\2\u05e0\u05dd\3\2\2"+
		"\2\u05e0\u05de\3\2\2\2\u05e1\u0105\3\2\2\2\u05e2\u05e3\5.\30\2\u05e3\u05ea"+
		"\5\u00eav\2\u05e4\u05e5\7\u0138\2\2\u05e5\u05e6\5.\30\2\u05e6\u05e7\5"+
		"\u00eav\2\u05e7\u05e9\3\2\2\2\u05e8\u05e4\3\2\2\2\u05e9\u05ec\3\2\2\2"+
		"\u05ea\u05e8\3\2\2\2\u05ea\u05eb\3\2\2\2\u05eb\u0107\3\2\2\2\u05ec\u05ea"+
		"\3\2\2\2\u05ed\u05ee\7C\2\2\u05ee\u05ef\7!\2\2\u05ef\u05f0\5*\26\2\u05f0"+
		"\u05f1\7F\2\2\u05f1\u05f9\5*\26\2\u05f2\u05f3\7\u0138\2\2\u05f3\u05f4"+
		"\5*\26\2\u05f4\u05f5\7F\2\2\u05f5\u05f6\5*\26\2\u05f6\u05f8\3\2\2\2\u05f7"+
		"\u05f2\3\2\2\2\u05f8\u05fb\3\2\2\2\u05f9\u05f7\3\2\2\2\u05f9\u05fa\3\2"+
		"\2\2\u05fa\u0109\3\2\2\2\u05fb\u05f9\3\2\2\2\u05fc\u05fd\7B\2\2\u05fd"+
		"\u0600\7!\2\2\u05fe\u05ff\7\b\2\2\u05ff\u0601\7\t\2\2\u0600\u05fe\3\2"+
		"\2\2\u0600\u0601\3\2\2\2\u0601\u0602\3\2\2\2\u0602\u0603\5*\26\2\u0603"+
		"\u010b\3\2\2\2\u0604\u0605\7B\2\2\u0605\u0608\7\u00a6\2\2\u0606\u0607"+
		"\7\b\2\2\u0607\u0609\7\t\2\2\u0608\u0606\3\2\2\2\u0608\u0609\3\2\2\2\u0609"+
		"\u060a\3\2\2\2\u060a\u060b\5*\26\2\u060b\u010d\3\2\2\2\u060c\u060e\7\u00e3"+
		"\2\2\u060d\u060f\7!\2\2\u060e\u060d\3\2\2\2\u060e\u060f\3\2\2\2\u060f"+
		"\u0610\3\2\2\2\u0610\u0611\5*\26\2\u0611\u010f\3\2\2\2\u0612\u0613\7:"+
		"\2\2\u0613\u0614\5\u0112\u008a\2\u0614\u0111\3\2\2\2\u0615\u0619\7\u00a6"+
		"\2\2\u0616\u0617\5(\25\2\u0617\u0618\7\u0137\2\2\u0618\u061a\3\2\2\2\u0619"+
		"\u0616\3\2\2\2\u0619\u061a\3\2\2\2\u061a\u061b\3\2\2\2\u061b\u061f\5\60"+
		"\31\2\u061c\u061d\7\b\2\2\u061d\u061e\7\6\2\2\u061e\u0620\7\t\2\2\u061f"+
		"\u061c\3\2\2\2\u061f\u0620\3\2\2\2\u0620\u0622\3\2\2\2\u0621\u0623\5\u00c4"+
		"c\2\u0622\u0621\3\2\2\2\u0622\u0623\3\2\2\2\u0623\u0624\3\2\2\2\u0624"+
		"\u0625\7\22\2\2\u0625\u0626\5\u00acW\2\u0626\u0113\3\2\2\2\u0627\u0628"+
		"\7<\2\2\u0628\u0629\5\u0112\u008a\2\u0629\u0115\3\2\2\2\u062a\u062b\7"+
		":\2\2\u062b\u062c\7\u00e6\2\2\u062c\u062d\5B\"\2\u062d\u062e\7\u00ea\2"+
		"\2\u062e\u062f\7\16\2\2\u062f\u0630\7\u014d\2\2\u0630\u0117\3\2\2\2\u0631"+
		"\u0632\7B\2\2\u0632\u0633\7\u00e6\2\2\u0633\u0634\5B\"\2\u0634\u0119\3"+
		"\2\2\2\u0635\u0636\7\u00ad\2\2\u0636\u063b\5Z.\2\u0637\u0638\7\u0138\2"+
		"\2\u0638\u063a\5Z.\2\u0639\u0637\3\2\2\2\u063a\u063d\3\2\2\2\u063b\u0639"+
		"\3\2\2\2\u063b\u063c\3\2\2\2\u063c\u063e\3\2\2\2\u063d\u063b\3\2\2\2\u063e"+
		"\u0641\7\36\2\2\u063f\u0642\5*\26\2\u0640\u0642\5\60\31\2\u0641\u063f"+
		"\3\2\2\2\u0641\u0640\3\2\2\2\u0642\u0643\3\2\2\2\u0643\u0644\7F\2\2\u0644"+
		"\u0649\5\u011c\u008f\2\u0645\u0646\7\u0138\2\2\u0646\u0648\5\u011c\u008f"+
		"\2\u0647\u0645\3\2\2\2\u0648\u064b\3\2\2\2\u0649\u0647\3\2\2\2\u0649\u064a"+
		"\3\2\2\2\u064a\u064f\3\2\2\2\u064b\u0649\3\2\2\2\u064c\u064d\7\u008f\2"+
		"\2\u064d\u064e\7\u00ad\2\2\u064e\u0650\7\u00cf\2\2\u064f\u064c\3\2\2\2"+
		"\u064f\u0650\3\2\2\2\u0650\u011b\3\2\2\2\u0651\u0653\7\u00e6\2\2\u0652"+
		"\u0651\3\2\2\2\u0652\u0653\3\2\2\2\u0653\u0654\3\2\2\2\u0654\u0655\5B"+
		"\"\2\u0655\u011d\3\2\2\2\u0656\u065a\7\u00ae\2\2\u0657\u0658\7\u00ad\2"+
		"\2\u0658\u0659\7\u00cf\2\2\u0659\u065b\7\u00d8\2\2\u065a\u0657\3\2\2\2"+
		"\u065a\u065b\3\2\2\2\u065b\u065c\3\2\2\2\u065c\u0661\5Z.\2\u065d\u065e"+
		"\7\u0138\2\2\u065e\u0660\5Z.\2\u065f\u065d\3\2\2\2\u0660\u0663\3\2\2\2"+
		"\u0661\u065f\3\2\2\2\u0661\u0662\3\2\2\2\u0662\u0664\3\2\2\2\u0663\u0661"+
		"\3\2\2\2\u0664\u0667\7\36\2\2\u0665\u0668\5*\26\2\u0666\u0668\5\60\31"+
		"\2\u0667\u0665\3\2\2\2\u0667\u0666\3\2\2\2\u0668\u0669\3\2\2\2\u0669\u066a"+
		"\7\21\2\2\u066a\u066f\5\u011c\u008f\2\u066b\u066c\7\u0138\2\2\u066c\u066e"+
		"\5\u011c\u008f\2\u066d\u066b\3\2\2\2\u066e\u0671\3\2\2\2\u066f\u066d\3"+
		"\2\2\2\u066f\u0670\3\2\2\2\u0670\u011f\3\2\2\2\u0671\u066f\3\2\2\2\u0672"+
		"\u0673\7(\2\2\u0673\u0674\5\u0122\u0092\2\u0674\u0121\3\2\2\2\u0675\u0676"+
		"\7:\2\2\u0676\u067a\t\31\2\2\u0677\u0678\5(\25\2\u0678\u0679\7\u0137\2"+
		"\2\u0679\u067b\3\2\2\2\u067a\u0677\3\2\2\2\u067a\u067b\3\2\2\2\u067b\u067c"+
		"\3\2\2\2\u067c\u06a1\5*\26\2\u067d\u067e\7#\2\2\u067e\u067f\7\21\2\2\u067f"+
		"\u0682\5*\26\2\u0680\u0681\7\21\2\2\u0681\u0683\5(\25\2\u0682\u0680\3"+
		"\2\2\2\u0682\u0683\3\2\2\2\u0683\u06a1\3\2\2\2\u0684\u0687\t\32\2\2\u0685"+
		"\u0686\7\7\2\2\u0686\u0688\7\u014d\2\2\u0687\u0685\3\2\2\2\u0687\u0688"+
		"\3\2\2\2\u0688\u06a1\3\2\2\2\u0689\u068a\7\u0118\2\2\u068a\u06a1\7\u0119"+
		"\2\2\u068b\u068e\7\"\2\2\u068c\u068d\7\u00a7\2\2\u068d\u068f\5(\25\2\u068e"+
		"\u068c\3\2\2\2\u068e\u068f\3\2\2\2\u068f\u0691\3\2\2\2\u0690\u0692\7\u014d"+
		"\2\2\u0691\u0690\3\2\2\2\u0691\u0692\3\2\2\2\u0692\u06a1\3\2\2\2\u0693"+
		"\u0696\7\u00ad\2\2\u0694\u0697\5V,\2\u0695\u0697\5\u011c\u008f\2\u0696"+
		"\u0694\3\2\2\2\u0696\u0695\3\2\2\2\u0696\u0697\3\2\2\2\u0697\u0698\3\2"+
		"\2\2\u0698\u069e\7\36\2\2\u0699\u069f\7\5\2\2\u069a\u069c\7!\2\2\u069b"+
		"\u069a\3\2\2\2\u069b\u069c\3\2\2\2\u069c\u069d\3\2\2\2\u069d\u069f\5*"+
		"\26\2\u069e\u0699\3\2\2\2\u069e\u069b\3\2\2\2\u069f\u06a1\3\2\2\2\u06a0"+
		"\u0675\3\2\2\2\u06a0\u067d\3\2\2\2\u06a0\u0684\3\2\2\2\u06a0\u0689\3\2"+
		"\2\2\u06a0\u068b\3\2\2\2\u06a0\u0693\3\2\2\2\u06a1\u0123\3\2\2\2\u06a2"+
		"\u06a3\7\u0094\2\2\u06a3\u06a4\7!\2\2\u06a4\u06a5\5*\26\2\u06a5\u06a6"+
		"\7F\2\2\u06a6\u06a7\5P)\2\u06a7\u06a8\7\u0137\2\2\u06a8\u06a9\5(\25\2"+
		"\u06a9\u0125\3\2\2\2\u06aa\u06ab\7\u00ce\2\2\u06ab\u06ac\5(\25\2\u06ac"+
		"\u0127\3\2\2\2\u06ad\u06ae\7\u0118\2\2\u06ae\u06af\7\u011a\2\2\u06af\u06b0"+
		"\5P)\2\u06b0\u06b1\5\u00a6T\2\u06b1\u0129\3\2\2\2\u06b2\u06b6\7\u00d1"+
		"\2\2\u06b3\u06b4\5(\25\2\u06b4\u06b5\7\u0137\2\2\u06b5\u06b7\3\2\2\2\u06b6"+
		"\u06b3\3\2\2\2\u06b6\u06b7\3\2\2\2\u06b7\u06b8\3\2\2\2\u06b8\u06b9\5B"+
		"\"\2\u06b9\u06ba\5\u00d8m\2\u06ba\u06bb\5\u00b0Y\2\u06bb\u012b\3\2\2\2"+
		"\u06bc\u06bd\7\u00a3\2\2\u06bd\u06be\7\21\2\2\u06be\u06bf\5*\26\2\u06bf"+
		"\u06c0\5\u00b0Y\2\u06c0\u012d\3\2\2\2\u00e1\u013f\u0145\u0149\u0152\u0155"+
		"\u0159\u015d\u015f\u0166\u0176\u017c\u01af\u01c0\u01c9\u01d1\u01d9\u01dd"+
		"\u01e4\u01e8\u01ea\u01f3\u01f8\u01fd\u0201\u0206\u020a\u0213\u021a\u0220"+
		"\u0225\u022a\u022f\u0236\u023e\u0244\u0249\u0256\u025f\u0262\u0265\u0271"+
		"\u0276\u027a\u0284\u0288\u0295\u0299\u02a0\u02a5\u02ae\u02b5\u02b7\u02bf"+
		"\u02cd\u02d2\u02d6\u02d9\u02dc\u02e1\u02e5\u02eb\u02f3\u02f8\u02fc\u02fe"+
		"\u0302\u0306\u030a\u0311\u031b\u0325\u0327\u032d\u0337\u033e\u034b\u0350"+
		"\u0353\u035a\u036b\u0370\u0375\u037a\u0380\u0383\u0386\u0388\u038b\u038e"+
		"\u039a\u039f\u03a4\u03b0\u03b5\u03bb\u03c8\u03d1\u03dd\u03e8\u03ec\u03ee"+
		"\u03f4\u03f7\u03fa\u03fe\u040e\u0413\u0417\u041a\u0422\u0428\u042d\u0431"+
		"\u043c\u0443\u044a\u0452\u0459\u045d\u0460\u0466\u046b\u0474\u0479\u047d"+
		"\u0481\u0485\u0488\u048e\u0496\u0499\u049f\u04a9\u04b0\u04b3\u04bb\u04c2"+
		"\u04c5\u04ca\u04cd\u04d2\u04d9\u04dc\u04df\u04e3\u04ea\u04ed\u04f0\u04f4"+
		"\u04fb\u04fe\u0501\u0505\u050c\u050f\u0512\u0516\u051f\u0522\u0525\u0529"+
		"\u0532\u0535\u0538\u053c\u0543\u0547\u054a\u054d\u0551\u0555\u0559\u055d"+
		"\u0561\u0565\u0569\u0570\u0574\u057b\u057e\u0582\u0586\u058a\u058c\u0592"+
		"\u0595\u059f\u05a6\u05ab\u05b1\u05c1\u05c4\u05cb\u05d0\u05d7\u05e0\u05ea"+
		"\u05f9\u0600\u0608\u060e\u0619\u061f\u0622\u063b\u0641\u0649\u064f\u0652"+
		"\u065a\u0661\u0667\u066f\u067a\u0682\u0687\u068e\u0691\u0696\u069b\u069e"+
		"\u06a0\u06b6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}