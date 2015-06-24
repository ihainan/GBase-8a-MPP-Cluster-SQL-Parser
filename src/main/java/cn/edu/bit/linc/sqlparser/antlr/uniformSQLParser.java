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
		DIVIDE=232, MOD=233, OR=234, AND=235, ARROW=236, EQ=237, NOT_EQ=238, LET=239, 
		GET=240, SET_VAR=241, SHIFT_LEFT=242, SHIFT_RIGHT=243, ALL_FIELDS=244, 
		SEMI=245, COLON=246, DOT=247, COMMA=248, ASTERISK=249, RPAREN=250, LPAREN=251, 
		RBRACK=252, LBRACK=253, PLUS=254, MINUS=255, NEGATION=256, VERTBAR=257, 
		BITAND=258, POWER_OP=259, GTH=260, LTH=261, INTEGER_NUM=262, HEX_DIGIT=263, 
		BIT_NUM=264, REAL_NUMBER=265, TEXT_STRING=266, ID=267, USER_VAR=268, WHITE_SPACE=269, 
		SL_COMMENT=270, ARMSCII8=271, ASCII=272, BIG5=273, CP1250=274, CP1251=275, 
		CP1256=276, CP1257=277, CP850=278, CP852=279, CP866=280, CP932=281, DEC8=282, 
		EUCJPMS=283, EUCKR=284, GB2312=285, GBK=286, GEOSTD8=287, GREEK=288, HEBREW=289, 
		HP8=290, KEYBCS2=291, KOI8R=292, KOI8U=293, LATIN1=294, LATIN2=295, LATIN5=296, 
		LATIN7=297, MACCE=298, MACROMAN=299, SJIS=300, SWE7=301, TIS620=302, UCS2=303, 
		UJIS=304, UTF8=305, CHAR=306, SIGNED=307, INTEGER=308, TIME=309, NATURAL=310, 
		LANGUAGE=311, MODE=312, QUERY=313, EXPANSION=314, SECOND=315, MINUTE=316, 
		HOUR=317, DAY=318, WEEK=319, MONTH=320, QUARTER=321, YEAR=322, SECOND_MICROSECOND=323, 
		MINUTE_MICROSECOND=324, MINUTE_SECOND=325, HOUR_MICROSECOND=326, HOUR_SECOND=327, 
		HOUR_MINUTE=328, DAY_MICROSECOND=329, DAY_SECOND=330, DAY_MINUTE=331, 
		DAY_HOUR=332, YEAR_MONTH=333, LATIN1_GENERAL_CS=334, LATIN1_BIN=335, ABS=336, 
		ACOS=337, ASIN=338, ATAN2=339, ATAN=340, CEIL=341, CEILING=342, CONV=343, 
		COS=344, COT=345, CRC32=346, DEGREES=347, EXP=348, FLOOR=349, LN=350, 
		LOG10=351, LOG2=352, LOG=353, PI=354, POW=355, POWER=356, RADIANS=357, 
		RAND=358, ROUND=359, SIGN=360, SIN=361, SQRT=362, TAN=363, BIN=364, BIT_LENGTH=365, 
		CHAR_LENGTH=366, CONCAT_WS=367, CONCAT=368, ELT=369, EXPORT_SET=370, FIELD=371, 
		FIND_IN_SET=372, FROM_BASE64=373, HEX=374, INSTR=375, LENGTH=376, LOAD_FILE=377, 
		LOCATE=378, LOWER=379, LPAD=380, LTRIM=381, MAKE_SET=382, MID=383, OCT=384, 
		ORD=385, QUOTE=386, REPEAT=387, REVERSE=388, RPAD=389, RTRIM=390, SOUNDEX=391, 
		SPACE=392, STRCMP=393, SUBSTRING_INDEX=394, SUBSTRING=395, TO_BASE64=396, 
		TRIM=397, UNHEX=398, UPPER=399, WEIGHT_STRING=400, ADDDATE=401, ADDTIME=402, 
		CONVERT_TZ=403, CURDATE=404, CURTIME=405, DATE_ADD=406, DATE_FORMAT=407, 
		DATE_SUB=408, DATEDIFF=409, DAYNAME=410, DAYOFMONTH=411, DAYOFWEEK=412, 
		DAYOFYEAR=413, EXTRACT=414, FROM_DAYS=415, FROM_UNIXTIME=416, GET_FORMAT=417, 
		LAST_DAY=418, MAKEDATE=419, MAKETIME=420, MICROSECOND=421, MONTHNAME=422, 
		NOW=423, PERIOD_ADD=424, PERIOD_DIFF=425, SEC_TO_TIME=426, STR_TO_DATE=427, 
		SUBTIME=428, SYSDATE=429, TIME_FORMAT=430, TIME_TO_SEC=431, TIMEDIFF=432, 
		TIMESTAMPADD=433, TIMESTAMPDIFF=434, TO_DAYS=435, TO_SECONDS=436, UNIX_TIMESTAMP=437, 
		UTC_DATE=438, UTC_TIME=439, UTC_TIMESTAMP=440, WEEKDAY=441, WEEKOFYEAR=442, 
		YEARWEEK=443, IFNULL=444, AES_ENCRYPT=445, AES_DECRYPT=446, DECODE=447, 
		ENCODE=448, DES_DECRYPT=449, DES_ENCRYPT=450, ENCRYPT=451, MD5=452, OLD_PASSWORD=453, 
		PASSWORD=454, BENCHMARK=455, CHARSET=456, COERCIBILITY=457, COLLATION=458, 
		CONNECTION_ID=459, CURRENT_USER=460, SESSION_USER=461, SYSTEM_USER=462, 
		VERSION=463, FOUND_ROWS=464, LAST_INSERT_ID=465, GET_LOCK=466, RELEASE_LOCK=467, 
		IS_FREE_LOCK=468, IS_USED_LOCK=469, MASTER_POS_WAIT=470, INET_ATON=471, 
		INET_NTOA=472, NAME_CONST=473, SLEEP=474, UUID=475, VALUES=476, AVG=477, 
		COUNT=478, MAX=479, MIN=480, SUM=481, BIT_AND=482, BIT_OR=483, BIT_XOR=484, 
		GROUP_CONCAT=485, STD=486, STDDEV=487, STDDEV_POP=488, STDDEV_SAMP=489, 
		VAR_POP=490, VAR_SAMP=491, VARIANCE=492, XOR=493, ANY=494, SOUNDS=495, 
		ESCAPE=496, COLLATE=497, CONVERT=498, MATCH=499, AGAINST=500, INTERVAL=501, 
		STRAIGHT_JOIN=502, OJ=503, FORCE=504, HIGH_PRIORITY=505, OFFSET=506, LOW_PRIORITY=507, 
		DUPLICATE=508, VALUE=509, CONSTRAINT=510, PRIMARY=511, UNIQUE=512, FULLTEXT=513, 
		SPATIAL=514, FOREIGN=515, CHECK=516, AUTO_INCREMENT=517, COLUMN_FORMAT=518, 
		FIXED=519, DYNAMIC=520, BIT=521, MEDIUMINT=522, CHARACTER=523, VARBINARY=524, 
		REFERENCES=525, PARTIAL=526, SIMPLE=527, NO=528, ACTION=529, BTREE=530, 
		HASH=531, KEY_BLOCK_SIZE=532, PARSER=533;
	public static final int
		RULE_integer_types = 0, RULE_relational_op = 1, RULE_charset_name = 2, 
		RULE_cast_data_type = 3, RULE_search_modifier = 4, RULE_transcoding_name = 5, 
		RULE_interval_unit = 6, RULE_collation_names = 7, RULE_string_literal = 8, 
		RULE_number_literal = 9, RULE_hex_literal = 10, RULE_boolean_literal = 11, 
		RULE_bit_literal = 12, RULE_literal_value = 13, RULE_functionList = 14, 
		RULE_number_functions = 15, RULE_char_functions = 16, RULE_time_functions = 17, 
		RULE_other_functions = 18, RULE_group_functions = 19, RULE_schema_name = 20, 
		RULE_table_name = 21, RULE_engine_name = 22, RULE_column_name = 23, RULE_view_name = 24, 
		RULE_parser_name = 25, RULE_index_name = 26, RULE_partition_name = 27, 
		RULE_partition_logical_name = 28, RULE_constraintbol_name = 29, RULE_foreign_keybol_name = 30, 
		RULE_collation_name = 31, RULE_event_name = 32, RULE_user_name = 33, RULE_function_name = 34, 
		RULE_procedure_name = 35, RULE_server_name = 36, RULE_wrapper_name = 37, 
		RULE_alias = 38, RULE_expression = 39, RULE_exp_factor1 = 40, RULE_exp_factor2 = 41, 
		RULE_exp_factor3 = 42, RULE_exp_factor4 = 43, RULE_bool_primary = 44, 
		RULE_predicate = 45, RULE_bit_expr = 46, RULE_factor1 = 47, RULE_factor2 = 48, 
		RULE_factor3 = 49, RULE_factor4 = 50, RULE_factor5 = 51, RULE_factor6 = 52, 
		RULE_factor7 = 53, RULE_simple_expr = 54, RULE_function_call = 55, RULE_case_when_statement = 56, 
		RULE_case_when_statement1 = 57, RULE_case_when_statement2 = 58, RULE_match_against_statement = 59, 
		RULE_column_spec = 60, RULE_expression_list = 61, RULE_interval_expr = 62, 
		RULE_table_references = 63, RULE_table_reference = 64, RULE_table_factor1 = 65, 
		RULE_table_factor2 = 66, RULE_table_factor3 = 67, RULE_table_factor4 = 68, 
		RULE_table_atom = 69, RULE_join_condition = 70, RULE_index_hint_list = 71, 
		RULE_index_options = 72, RULE_index_hint = 73, RULE_index_list = 74, RULE_partition_clause = 75, 
		RULE_partition_names = 76, RULE_root_statement = 77, RULE_data_manipulation_statements = 78, 
		RULE_data_definition_statements = 79, RULE_select_statement = 80, RULE_select_expression = 81, 
		RULE_where_clause = 82, RULE_groupby_clause = 83, RULE_groupby_item = 84, 
		RULE_having_clause = 85, RULE_orderby_clause = 86, RULE_orderby_item = 87, 
		RULE_limit_clause = 88, RULE_offset = 89, RULE_row_count = 90, RULE_select_list = 91, 
		RULE_column_list = 92, RULE_subquery = 93, RULE_table_spec = 94, RULE_displayed_column = 95, 
		RULE_insert_statements = 96, RULE_insert_header = 97, RULE_insert_subfix = 98, 
		RULE_insert_statement = 99, RULE_value_list_clause = 100, RULE_column_value_list = 101, 
		RULE_set_columns_cluase = 102, RULE_set_column_cluase = 103, RULE_create_database_statement = 104, 
		RULE_drop_database_statement = 105, RULE_create_table_statement = 106, 
		RULE_create_table_statement1 = 107, RULE_create_table_statement2 = 108, 
		RULE_create_table_statement3 = 109, RULE_create_definition = 110, RULE_column_definition = 111, 
		RULE_null_or_notnull = 112, RULE_column_data_type_header = 113, RULE_index_column_name = 114, 
		RULE_reference_definition = 115, RULE_reference_option = 116, RULE_length = 117, 
		RULE_alter_table_statement = 118, RULE_alter_table_specification = 119, 
		RULE_index_column_names = 120, RULE_index_type = 121, RULE_index_option = 122, 
		RULE_column_definitions = 123, RULE_rename_table_statement = 124, RULE_drop_table_statement = 125, 
		RULE_truncate_table_statement = 126, RULE_create_view_statement = 127, 
		RULE_create_view_body = 128, RULE_alter_view_statement = 129, RULE_drop_view_statement = 130;
	public static final String[] ruleNames = {
		"integer_types", "relational_op", "charset_name", "cast_data_type", "search_modifier", 
		"transcoding_name", "interval_unit", "collation_names", "string_literal", 
		"number_literal", "hex_literal", "boolean_literal", "bit_literal", "literal_value", 
		"functionList", "number_functions", "char_functions", "time_functions", 
		"other_functions", "group_functions", "schema_name", "table_name", "engine_name", 
		"column_name", "view_name", "parser_name", "index_name", "partition_name", 
		"partition_logical_name", "constraintbol_name", "foreign_keybol_name", 
		"collation_name", "event_name", "user_name", "function_name", "procedure_name", 
		"server_name", "wrapper_name", "alias", "expression", "exp_factor1", "exp_factor2", 
		"exp_factor3", "exp_factor4", "bool_primary", "predicate", "bit_expr", 
		"factor1", "factor2", "factor3", "factor4", "factor5", "factor6", "factor7", 
		"simple_expr", "function_call", "case_when_statement", "case_when_statement1", 
		"case_when_statement2", "match_against_statement", "column_spec", "expression_list", 
		"interval_expr", "table_references", "table_reference", "table_factor1", 
		"table_factor2", "table_factor3", "table_factor4", "table_atom", "join_condition", 
		"index_hint_list", "index_options", "index_hint", "index_list", "partition_clause", 
		"partition_names", "root_statement", "data_manipulation_statements", "data_definition_statements", 
		"select_statement", "select_expression", "where_clause", "groupby_clause", 
		"groupby_item", "having_clause", "orderby_clause", "orderby_item", "limit_clause", 
		"offset", "row_count", "select_list", "column_list", "subquery", "table_spec", 
		"displayed_column", "insert_statements", "insert_header", "insert_subfix", 
		"insert_statement", "value_list_clause", "column_value_list", "set_columns_cluase", 
		"set_column_cluase", "create_database_statement", "drop_database_statement", 
		"create_table_statement", "create_table_statement1", "create_table_statement2", 
		"create_table_statement3", "create_definition", "column_definition", "null_or_notnull", 
		"column_data_type_header", "index_column_name", "reference_definition", 
		"reference_option", "length", "alter_table_statement", "alter_table_specification", 
		"index_column_names", "index_type", "index_option", "column_definitions", 
		"rename_table_statement", "drop_table_statement", "truncate_table_statement", 
		"create_view_statement", "create_view_body", "alter_view_statement", "drop_view_statement"
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
		null, null, null, null, null, null, null, null, "'=>'", null, null, "'<='", 
		"'>='", "':='", "'<<'", "'>>'", "'.*'", "';'", "':'", "'.'", "','", "'*'", 
		"')'", "'('", "']'", "'['", "'+'", "'-'", "'~'", "'|'", "'&'", "'^'", 
		"'>'", "'<'"
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
		"INNER", "EXCHANGE", "DIVIDE", "MOD", "OR", "AND", "ARROW", "EQ", "NOT_EQ", 
		"LET", "GET", "SET_VAR", "SHIFT_LEFT", "SHIFT_RIGHT", "ALL_FIELDS", "SEMI", 
		"COLON", "DOT", "COMMA", "ASTERISK", "RPAREN", "LPAREN", "RBRACK", "LBRACK", 
		"PLUS", "MINUS", "NEGATION", "VERTBAR", "BITAND", "POWER_OP", "GTH", "LTH", 
		"INTEGER_NUM", "HEX_DIGIT", "BIT_NUM", "REAL_NUMBER", "TEXT_STRING", "ID", 
		"USER_VAR", "WHITE_SPACE", "SL_COMMENT", "ARMSCII8", "ASCII", "BIG5", 
		"CP1250", "CP1251", "CP1256", "CP1257", "CP850", "CP852", "CP866", "CP932", 
		"DEC8", "EUCJPMS", "EUCKR", "GB2312", "GBK", "GEOSTD8", "GREEK", "HEBREW", 
		"HP8", "KEYBCS2", "KOI8R", "KOI8U", "LATIN1", "LATIN2", "LATIN5", "LATIN7", 
		"MACCE", "MACROMAN", "SJIS", "SWE7", "TIS620", "UCS2", "UJIS", "UTF8", 
		"CHAR", "SIGNED", "INTEGER", "TIME", "NATURAL", "LANGUAGE", "MODE", "QUERY", 
		"EXPANSION", "SECOND", "MINUTE", "HOUR", "DAY", "WEEK", "MONTH", "QUARTER", 
		"YEAR", "SECOND_MICROSECOND", "MINUTE_MICROSECOND", "MINUTE_SECOND", "HOUR_MICROSECOND", 
		"HOUR_SECOND", "HOUR_MINUTE", "DAY_MICROSECOND", "DAY_SECOND", "DAY_MINUTE", 
		"DAY_HOUR", "YEAR_MONTH", "LATIN1_GENERAL_CS", "LATIN1_BIN", "ABS", "ACOS", 
		"ASIN", "ATAN2", "ATAN", "CEIL", "CEILING", "CONV", "COS", "COT", "CRC32", 
		"DEGREES", "EXP", "FLOOR", "LN", "LOG10", "LOG2", "LOG", "PI", "POW", 
		"POWER", "RADIANS", "RAND", "ROUND", "SIGN", "SIN", "SQRT", "TAN", "BIN", 
		"BIT_LENGTH", "CHAR_LENGTH", "CONCAT_WS", "CONCAT", "ELT", "EXPORT_SET", 
		"FIELD", "FIND_IN_SET", "FROM_BASE64", "HEX", "INSTR", "LENGTH", "LOAD_FILE", 
		"LOCATE", "LOWER", "LPAD", "LTRIM", "MAKE_SET", "MID", "OCT", "ORD", "QUOTE", 
		"REPEAT", "REVERSE", "RPAD", "RTRIM", "SOUNDEX", "SPACE", "STRCMP", "SUBSTRING_INDEX", 
		"SUBSTRING", "TO_BASE64", "TRIM", "UNHEX", "UPPER", "WEIGHT_STRING", "ADDDATE", 
		"ADDTIME", "CONVERT_TZ", "CURDATE", "CURTIME", "DATE_ADD", "DATE_FORMAT", 
		"DATE_SUB", "DATEDIFF", "DAYNAME", "DAYOFMONTH", "DAYOFWEEK", "DAYOFYEAR", 
		"EXTRACT", "FROM_DAYS", "FROM_UNIXTIME", "GET_FORMAT", "LAST_DAY", "MAKEDATE", 
		"MAKETIME", "MICROSECOND", "MONTHNAME", "NOW", "PERIOD_ADD", "PERIOD_DIFF", 
		"SEC_TO_TIME", "STR_TO_DATE", "SUBTIME", "SYSDATE", "TIME_FORMAT", "TIME_TO_SEC", 
		"TIMEDIFF", "TIMESTAMPADD", "TIMESTAMPDIFF", "TO_DAYS", "TO_SECONDS", 
		"UNIX_TIMESTAMP", "UTC_DATE", "UTC_TIME", "UTC_TIMESTAMP", "WEEKDAY", 
		"WEEKOFYEAR", "YEARWEEK", "IFNULL", "AES_ENCRYPT", "AES_DECRYPT", "DECODE", 
		"ENCODE", "DES_DECRYPT", "DES_ENCRYPT", "ENCRYPT", "MD5", "OLD_PASSWORD", 
		"PASSWORD", "BENCHMARK", "CHARSET", "COERCIBILITY", "COLLATION", "CONNECTION_ID", 
		"CURRENT_USER", "SESSION_USER", "SYSTEM_USER", "VERSION", "FOUND_ROWS", 
		"LAST_INSERT_ID", "GET_LOCK", "RELEASE_LOCK", "IS_FREE_LOCK", "IS_USED_LOCK", 
		"MASTER_POS_WAIT", "INET_ATON", "INET_NTOA", "NAME_CONST", "SLEEP", "UUID", 
		"VALUES", "AVG", "COUNT", "MAX", "MIN", "SUM", "BIT_AND", "BIT_OR", "BIT_XOR", 
		"GROUP_CONCAT", "STD", "STDDEV", "STDDEV_POP", "STDDEV_SAMP", "VAR_POP", 
		"VAR_SAMP", "VARIANCE", "XOR", "ANY", "SOUNDS", "ESCAPE", "COLLATE", "CONVERT", 
		"MATCH", "AGAINST", "INTERVAL", "STRAIGHT_JOIN", "OJ", "FORCE", "HIGH_PRIORITY", 
		"OFFSET", "LOW_PRIORITY", "DUPLICATE", "VALUE", "CONSTRAINT", "PRIMARY", 
		"UNIQUE", "FULLTEXT", "SPATIAL", "FOREIGN", "CHECK", "AUTO_INCREMENT", 
		"COLUMN_FORMAT", "FIXED", "DYNAMIC", "BIT", "MEDIUMINT", "CHARACTER", 
		"VARBINARY", "REFERENCES", "PARTIAL", "SIMPLE", "NO", "ACTION", "BTREE", 
		"HASH", "KEY_BLOCK_SIZE", "PARSER"
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
	public static class Integer_typesContext extends ParserRuleContext {
		public TerminalNode TINYINT() { return getToken(uniformSQLParser.TINYINT, 0); }
		public TerminalNode SMALLINT() { return getToken(uniformSQLParser.SMALLINT, 0); }
		public TerminalNode INT() { return getToken(uniformSQLParser.INT, 0); }
		public TerminalNode BIGINT() { return getToken(uniformSQLParser.BIGINT, 0); }
		public TerminalNode BOOLEAN() { return getToken(uniformSQLParser.BOOLEAN, 0); }
		public TerminalNode FLOAT() { return getToken(uniformSQLParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(uniformSQLParser.DOUBLE, 0); }
		public TerminalNode DATE() { return getToken(uniformSQLParser.DATE, 0); }
		public TerminalNode DATETIME() { return getToken(uniformSQLParser.DATETIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(uniformSQLParser.TIMESTAMP, 0); }
		public TerminalNode STRING() { return getToken(uniformSQLParser.STRING, 0); }
		public TerminalNode VARCHAR() { return getToken(uniformSQLParser.VARCHAR, 0); }
		public TerminalNode BINARY() { return getToken(uniformSQLParser.BINARY, 0); }
		public TerminalNode DECIMAL() { return getToken(uniformSQLParser.DECIMAL, 0); }
		public TerminalNode STRUCT() { return getToken(uniformSQLParser.STRUCT, 0); }
		public TerminalNode MAP() { return getToken(uniformSQLParser.MAP, 0); }
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
		enterRule(_localctx, 0, RULE_integer_types);
		try {
			setState(279);
			switch (_input.LA(1)) {
			case EOF:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case TINYINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				match(TINYINT);
				}
				break;
			case SMALLINT:
				enterOuterAlt(_localctx, 3);
				{
				setState(264);
				match(SMALLINT);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 4);
				{
				setState(265);
				match(INT);
				}
				break;
			case BIGINT:
				enterOuterAlt(_localctx, 5);
				{
				setState(266);
				match(BIGINT);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 6);
				{
				setState(267);
				match(BOOLEAN);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 7);
				{
				setState(268);
				match(FLOAT);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 8);
				{
				setState(269);
				match(DOUBLE);
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 9);
				{
				setState(270);
				match(DATE);
				}
				break;
			case DATETIME:
				enterOuterAlt(_localctx, 10);
				{
				setState(271);
				match(DATETIME);
				}
				break;
			case TIMESTAMP:
				enterOuterAlt(_localctx, 11);
				{
				setState(272);
				match(TIMESTAMP);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 12);
				{
				setState(273);
				match(STRING);
				}
				break;
			case VARCHAR:
				enterOuterAlt(_localctx, 13);
				{
				setState(274);
				match(VARCHAR);
				}
				break;
			case BINARY:
				enterOuterAlt(_localctx, 14);
				{
				setState(275);
				match(BINARY);
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 15);
				{
				setState(276);
				match(DECIMAL);
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 16);
				{
				setState(277);
				match(STRUCT);
				}
				break;
			case MAP:
				enterOuterAlt(_localctx, 17);
				{
				setState(278);
				match(MAP);
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
		enterRule(_localctx, 2, RULE_relational_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			_la = _input.LA(1);
			if ( !(((((_la - 237)) & ~0x3f) == 0 && ((1L << (_la - 237)) & ((1L << (EQ - 237)) | (1L << (NOT_EQ - 237)) | (1L << (LET - 237)) | (1L << (GET - 237)) | (1L << (GTH - 237)) | (1L << (LTH - 237)))) != 0)) ) {
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

	public static class Charset_nameContext extends ParserRuleContext {
		public TerminalNode ARMSCII8() { return getToken(uniformSQLParser.ARMSCII8, 0); }
		public TerminalNode ASCII() { return getToken(uniformSQLParser.ASCII, 0); }
		public TerminalNode BIG5() { return getToken(uniformSQLParser.BIG5, 0); }
		public TerminalNode BINARY() { return getToken(uniformSQLParser.BINARY, 0); }
		public TerminalNode CP1250() { return getToken(uniformSQLParser.CP1250, 0); }
		public TerminalNode CP1251() { return getToken(uniformSQLParser.CP1251, 0); }
		public TerminalNode CP1256() { return getToken(uniformSQLParser.CP1256, 0); }
		public TerminalNode CP1257() { return getToken(uniformSQLParser.CP1257, 0); }
		public TerminalNode CP850() { return getToken(uniformSQLParser.CP850, 0); }
		public TerminalNode CP852() { return getToken(uniformSQLParser.CP852, 0); }
		public TerminalNode CP866() { return getToken(uniformSQLParser.CP866, 0); }
		public TerminalNode CP932() { return getToken(uniformSQLParser.CP932, 0); }
		public TerminalNode DEC8() { return getToken(uniformSQLParser.DEC8, 0); }
		public TerminalNode EUCJPMS() { return getToken(uniformSQLParser.EUCJPMS, 0); }
		public TerminalNode EUCKR() { return getToken(uniformSQLParser.EUCKR, 0); }
		public TerminalNode GB2312() { return getToken(uniformSQLParser.GB2312, 0); }
		public TerminalNode GBK() { return getToken(uniformSQLParser.GBK, 0); }
		public TerminalNode GEOSTD8() { return getToken(uniformSQLParser.GEOSTD8, 0); }
		public TerminalNode GREEK() { return getToken(uniformSQLParser.GREEK, 0); }
		public TerminalNode HEBREW() { return getToken(uniformSQLParser.HEBREW, 0); }
		public TerminalNode HP8() { return getToken(uniformSQLParser.HP8, 0); }
		public TerminalNode KEYBCS2() { return getToken(uniformSQLParser.KEYBCS2, 0); }
		public TerminalNode KOI8R() { return getToken(uniformSQLParser.KOI8R, 0); }
		public TerminalNode KOI8U() { return getToken(uniformSQLParser.KOI8U, 0); }
		public TerminalNode LATIN1() { return getToken(uniformSQLParser.LATIN1, 0); }
		public TerminalNode LATIN2() { return getToken(uniformSQLParser.LATIN2, 0); }
		public TerminalNode LATIN5() { return getToken(uniformSQLParser.LATIN5, 0); }
		public TerminalNode LATIN7() { return getToken(uniformSQLParser.LATIN7, 0); }
		public TerminalNode MACCE() { return getToken(uniformSQLParser.MACCE, 0); }
		public TerminalNode MACROMAN() { return getToken(uniformSQLParser.MACROMAN, 0); }
		public TerminalNode SJIS() { return getToken(uniformSQLParser.SJIS, 0); }
		public TerminalNode SWE7() { return getToken(uniformSQLParser.SWE7, 0); }
		public TerminalNode TIS620() { return getToken(uniformSQLParser.TIS620, 0); }
		public TerminalNode UCS2() { return getToken(uniformSQLParser.UCS2, 0); }
		public TerminalNode UJIS() { return getToken(uniformSQLParser.UJIS, 0); }
		public TerminalNode UTF8() { return getToken(uniformSQLParser.UTF8, 0); }
		public Charset_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charset_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterCharset_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitCharset_name(this);
		}
	}

	public final Charset_nameContext charset_name() throws RecognitionException {
		Charset_nameContext _localctx = new Charset_nameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_charset_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			_la = _input.LA(1);
			if ( !(_la==BINARY || ((((_la - 271)) & ~0x3f) == 0 && ((1L << (_la - 271)) & ((1L << (ARMSCII8 - 271)) | (1L << (ASCII - 271)) | (1L << (BIG5 - 271)) | (1L << (CP1250 - 271)) | (1L << (CP1251 - 271)) | (1L << (CP1256 - 271)) | (1L << (CP1257 - 271)) | (1L << (CP850 - 271)) | (1L << (CP852 - 271)) | (1L << (CP866 - 271)) | (1L << (CP932 - 271)) | (1L << (DEC8 - 271)) | (1L << (EUCJPMS - 271)) | (1L << (EUCKR - 271)) | (1L << (GB2312 - 271)) | (1L << (GBK - 271)) | (1L << (GEOSTD8 - 271)) | (1L << (GREEK - 271)) | (1L << (HEBREW - 271)) | (1L << (HP8 - 271)) | (1L << (KEYBCS2 - 271)) | (1L << (KOI8R - 271)) | (1L << (KOI8U - 271)) | (1L << (LATIN1 - 271)) | (1L << (LATIN2 - 271)) | (1L << (LATIN5 - 271)) | (1L << (LATIN7 - 271)) | (1L << (MACCE - 271)) | (1L << (MACROMAN - 271)) | (1L << (SJIS - 271)) | (1L << (SWE7 - 271)) | (1L << (TIS620 - 271)) | (1L << (UCS2 - 271)) | (1L << (UJIS - 271)) | (1L << (UTF8 - 271)))) != 0)) ) {
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
		public TerminalNode COMMA() { return getToken(uniformSQLParser.COMMA, 0); }
		public TerminalNode SIGNED() { return getToken(uniformSQLParser.SIGNED, 0); }
		public TerminalNode INTEGER() { return getToken(uniformSQLParser.INTEGER, 0); }
		public TerminalNode TIME() { return getToken(uniformSQLParser.TIME, 0); }
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
		enterRule(_localctx, 6, RULE_cast_data_type);
		int _la;
		try {
			setState(312);
			switch (_input.LA(1)) {
			case BINARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				match(BINARY);
				setState(287);
				_la = _input.LA(1);
				if (_la==INTEGER_NUM) {
					{
					setState(286);
					match(INTEGER_NUM);
					}
				}

				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				match(CHAR);
				setState(291);
				_la = _input.LA(1);
				if (_la==INTEGER_NUM) {
					{
					setState(290);
					match(INTEGER_NUM);
					}
				}

				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(293);
				match(DATE);
				}
				break;
			case DATETIME:
				enterOuterAlt(_localctx, 4);
				{
				setState(294);
				match(DATETIME);
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(295);
				match(DECIMAL);
				setState(301);
				_la = _input.LA(1);
				if (_la==INTEGER_NUM) {
					{
					setState(296);
					match(INTEGER_NUM);
					setState(299);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(297);
						match(COMMA);
						setState(298);
						match(INTEGER_NUM);
						}
					}

					}
				}

				}
				break;
			case SIGNED:
				enterOuterAlt(_localctx, 6);
				{
				setState(303);
				match(SIGNED);
				setState(305);
				_la = _input.LA(1);
				if (_la==INTEGER) {
					{
					setState(304);
					match(INTEGER);
					}
				}

				}
				break;
			case TIME:
				enterOuterAlt(_localctx, 7);
				{
				setState(307);
				match(TIME);
				}
				break;
			case UNSIGNED:
				enterOuterAlt(_localctx, 8);
				{
				setState(308);
				match(UNSIGNED);
				setState(310);
				_la = _input.LA(1);
				if (_la==INTEGER) {
					{
					setState(309);
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

	public static class Search_modifierContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(uniformSQLParser.IN, 0); }
		public TerminalNode NATURAL() { return getToken(uniformSQLParser.NATURAL, 0); }
		public TerminalNode LANGUAGE() { return getToken(uniformSQLParser.LANGUAGE, 0); }
		public TerminalNode MODE() { return getToken(uniformSQLParser.MODE, 0); }
		public TerminalNode WITH() { return getToken(uniformSQLParser.WITH, 0); }
		public TerminalNode QUERY() { return getToken(uniformSQLParser.QUERY, 0); }
		public TerminalNode EXPANSION() { return getToken(uniformSQLParser.EXPANSION, 0); }
		public TerminalNode BOOLEAN() { return getToken(uniformSQLParser.BOOLEAN, 0); }
		public Search_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_search_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterSearch_modifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitSearch_modifier(this);
		}
	}

	public final Search_modifierContext search_modifier() throws RecognitionException {
		Search_modifierContext _localctx = new Search_modifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_search_modifier);
		try {
			setState(331);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(314);
				match(IN);
				setState(315);
				match(NATURAL);
				setState(316);
				match(LANGUAGE);
				setState(317);
				match(MODE);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(318);
				match(IN);
				setState(319);
				match(NATURAL);
				setState(320);
				match(LANGUAGE);
				setState(321);
				match(MODE);
				setState(322);
				match(WITH);
				setState(323);
				match(QUERY);
				setState(324);
				match(EXPANSION);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(325);
				match(IN);
				setState(326);
				match(BOOLEAN);
				setState(327);
				match(MODE);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(328);
				match(WITH);
				setState(329);
				match(QUERY);
				setState(330);
				match(EXPANSION);
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

	public static class Transcoding_nameContext extends ParserRuleContext {
		public TerminalNode LATIN1() { return getToken(uniformSQLParser.LATIN1, 0); }
		public TerminalNode UTF8() { return getToken(uniformSQLParser.UTF8, 0); }
		public Transcoding_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transcoding_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterTranscoding_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitTranscoding_name(this);
		}
	}

	public final Transcoding_nameContext transcoding_name() throws RecognitionException {
		Transcoding_nameContext _localctx = new Transcoding_nameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_transcoding_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			_la = _input.LA(1);
			if ( !(_la==LATIN1 || _la==UTF8) ) {
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

	public static class Interval_unitContext extends ParserRuleContext {
		public TerminalNode SECOND() { return getToken(uniformSQLParser.SECOND, 0); }
		public TerminalNode MINUTE() { return getToken(uniformSQLParser.MINUTE, 0); }
		public TerminalNode HOUR() { return getToken(uniformSQLParser.HOUR, 0); }
		public TerminalNode DAY() { return getToken(uniformSQLParser.DAY, 0); }
		public TerminalNode WEEK() { return getToken(uniformSQLParser.WEEK, 0); }
		public TerminalNode MONTH() { return getToken(uniformSQLParser.MONTH, 0); }
		public TerminalNode QUARTER() { return getToken(uniformSQLParser.QUARTER, 0); }
		public TerminalNode YEAR() { return getToken(uniformSQLParser.YEAR, 0); }
		public TerminalNode SECOND_MICROSECOND() { return getToken(uniformSQLParser.SECOND_MICROSECOND, 0); }
		public TerminalNode MINUTE_MICROSECOND() { return getToken(uniformSQLParser.MINUTE_MICROSECOND, 0); }
		public TerminalNode MINUTE_SECOND() { return getToken(uniformSQLParser.MINUTE_SECOND, 0); }
		public TerminalNode HOUR_MICROSECOND() { return getToken(uniformSQLParser.HOUR_MICROSECOND, 0); }
		public TerminalNode HOUR_SECOND() { return getToken(uniformSQLParser.HOUR_SECOND, 0); }
		public TerminalNode HOUR_MINUTE() { return getToken(uniformSQLParser.HOUR_MINUTE, 0); }
		public TerminalNode DAY_MICROSECOND() { return getToken(uniformSQLParser.DAY_MICROSECOND, 0); }
		public TerminalNode DAY_SECOND() { return getToken(uniformSQLParser.DAY_SECOND, 0); }
		public TerminalNode DAY_MINUTE() { return getToken(uniformSQLParser.DAY_MINUTE, 0); }
		public TerminalNode DAY_HOUR() { return getToken(uniformSQLParser.DAY_HOUR, 0); }
		public TerminalNode YEAR_MONTH() { return getToken(uniformSQLParser.YEAR_MONTH, 0); }
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
		enterRule(_localctx, 12, RULE_interval_unit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			_la = _input.LA(1);
			if ( !(((((_la - 315)) & ~0x3f) == 0 && ((1L << (_la - 315)) & ((1L << (SECOND - 315)) | (1L << (MINUTE - 315)) | (1L << (HOUR - 315)) | (1L << (DAY - 315)) | (1L << (WEEK - 315)) | (1L << (MONTH - 315)) | (1L << (QUARTER - 315)) | (1L << (YEAR - 315)) | (1L << (SECOND_MICROSECOND - 315)) | (1L << (MINUTE_MICROSECOND - 315)) | (1L << (MINUTE_SECOND - 315)) | (1L << (HOUR_MICROSECOND - 315)) | (1L << (HOUR_SECOND - 315)) | (1L << (HOUR_MINUTE - 315)) | (1L << (DAY_MICROSECOND - 315)) | (1L << (DAY_SECOND - 315)) | (1L << (DAY_MINUTE - 315)) | (1L << (DAY_HOUR - 315)) | (1L << (YEAR_MONTH - 315)))) != 0)) ) {
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

	public static class Collation_namesContext extends ParserRuleContext {
		public TerminalNode LATIN1_GENERAL_CS() { return getToken(uniformSQLParser.LATIN1_GENERAL_CS, 0); }
		public TerminalNode LATIN1_BIN() { return getToken(uniformSQLParser.LATIN1_BIN, 0); }
		public Collation_namesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collation_names; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterCollation_names(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitCollation_names(this);
		}
	}

	public final Collation_namesContext collation_names() throws RecognitionException {
		Collation_namesContext _localctx = new Collation_namesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_collation_names);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			_la = _input.LA(1);
			if ( !(_la==LATIN1_GENERAL_CS || _la==LATIN1_BIN) ) {
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
		enterRule(_localctx, 16, RULE_string_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
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
		enterRule(_localctx, 18, RULE_number_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(341);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(344);
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
		enterRule(_localctx, 20, RULE_hex_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
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
		enterRule(_localctx, 22, RULE_boolean_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
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
		enterRule(_localctx, 24, RULE_bit_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
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
		enterRule(_localctx, 26, RULE_literal_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			switch (_input.LA(1)) {
			case TEXT_STRING:
				{
				setState(352);
				string_literal();
				}
				break;
			case PLUS:
			case MINUS:
			case INTEGER_NUM:
			case REAL_NUMBER:
				{
				setState(353);
				number_literal();
				}
				break;
			case HEX_DIGIT:
				{
				setState(354);
				hex_literal();
				}
				break;
			case TRUE:
			case FALSE:
				{
				setState(355);
				boolean_literal();
				}
				break;
			case BIT_NUM:
				{
				setState(356);
				bit_literal();
				}
				break;
			case NULL:
				{
				setState(357);
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
		enterRule(_localctx, 28, RULE_functionList);
		try {
			setState(364);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(360);
				number_functions();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(361);
				char_functions();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(362);
				time_functions();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(363);
				other_functions();
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

	public static class Number_functionsContext extends ParserRuleContext {
		public TerminalNode ABS() { return getToken(uniformSQLParser.ABS, 0); }
		public TerminalNode ACOS() { return getToken(uniformSQLParser.ACOS, 0); }
		public TerminalNode ASIN() { return getToken(uniformSQLParser.ASIN, 0); }
		public TerminalNode ATAN2() { return getToken(uniformSQLParser.ATAN2, 0); }
		public TerminalNode ATAN() { return getToken(uniformSQLParser.ATAN, 0); }
		public TerminalNode CEIL() { return getToken(uniformSQLParser.CEIL, 0); }
		public TerminalNode CEILING() { return getToken(uniformSQLParser.CEILING, 0); }
		public TerminalNode CONV() { return getToken(uniformSQLParser.CONV, 0); }
		public TerminalNode COS() { return getToken(uniformSQLParser.COS, 0); }
		public TerminalNode COT() { return getToken(uniformSQLParser.COT, 0); }
		public TerminalNode CRC32() { return getToken(uniformSQLParser.CRC32, 0); }
		public TerminalNode DEGREES() { return getToken(uniformSQLParser.DEGREES, 0); }
		public TerminalNode EXP() { return getToken(uniformSQLParser.EXP, 0); }
		public TerminalNode FLOOR() { return getToken(uniformSQLParser.FLOOR, 0); }
		public TerminalNode LN() { return getToken(uniformSQLParser.LN, 0); }
		public TerminalNode LOG10() { return getToken(uniformSQLParser.LOG10, 0); }
		public TerminalNode LOG2() { return getToken(uniformSQLParser.LOG2, 0); }
		public TerminalNode LOG() { return getToken(uniformSQLParser.LOG, 0); }
		public TerminalNode MOD() { return getToken(uniformSQLParser.MOD, 0); }
		public TerminalNode PI() { return getToken(uniformSQLParser.PI, 0); }
		public TerminalNode POW() { return getToken(uniformSQLParser.POW, 0); }
		public TerminalNode POWER() { return getToken(uniformSQLParser.POWER, 0); }
		public TerminalNode RADIANS() { return getToken(uniformSQLParser.RADIANS, 0); }
		public TerminalNode RAND() { return getToken(uniformSQLParser.RAND, 0); }
		public TerminalNode ROUND() { return getToken(uniformSQLParser.ROUND, 0); }
		public TerminalNode SIGN() { return getToken(uniformSQLParser.SIGN, 0); }
		public TerminalNode SIN() { return getToken(uniformSQLParser.SIN, 0); }
		public TerminalNode SQRT() { return getToken(uniformSQLParser.SQRT, 0); }
		public TerminalNode TAN() { return getToken(uniformSQLParser.TAN, 0); }
		public TerminalNode TRUNCATE() { return getToken(uniformSQLParser.TRUNCATE, 0); }
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
		enterRule(_localctx, 30, RULE_number_functions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			_la = _input.LA(1);
			if ( !(_la==TRUNCATE || _la==MOD || ((((_la - 336)) & ~0x3f) == 0 && ((1L << (_la - 336)) & ((1L << (ABS - 336)) | (1L << (ACOS - 336)) | (1L << (ASIN - 336)) | (1L << (ATAN2 - 336)) | (1L << (ATAN - 336)) | (1L << (CEIL - 336)) | (1L << (CEILING - 336)) | (1L << (CONV - 336)) | (1L << (COS - 336)) | (1L << (COT - 336)) | (1L << (CRC32 - 336)) | (1L << (DEGREES - 336)) | (1L << (EXP - 336)) | (1L << (FLOOR - 336)) | (1L << (LN - 336)) | (1L << (LOG10 - 336)) | (1L << (LOG2 - 336)) | (1L << (LOG - 336)) | (1L << (PI - 336)) | (1L << (POW - 336)) | (1L << (POWER - 336)) | (1L << (RADIANS - 336)) | (1L << (RAND - 336)) | (1L << (ROUND - 336)) | (1L << (SIGN - 336)) | (1L << (SIN - 336)) | (1L << (SQRT - 336)) | (1L << (TAN - 336)))) != 0)) ) {
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
		public TerminalNode ASCII() { return getToken(uniformSQLParser.ASCII, 0); }
		public TerminalNode BIN() { return getToken(uniformSQLParser.BIN, 0); }
		public TerminalNode BIT_LENGTH() { return getToken(uniformSQLParser.BIT_LENGTH, 0); }
		public TerminalNode CHAR_LENGTH() { return getToken(uniformSQLParser.CHAR_LENGTH, 0); }
		public TerminalNode CHAR() { return getToken(uniformSQLParser.CHAR, 0); }
		public TerminalNode CONCAT_WS() { return getToken(uniformSQLParser.CONCAT_WS, 0); }
		public TerminalNode CONCAT() { return getToken(uniformSQLParser.CONCAT, 0); }
		public TerminalNode ELT() { return getToken(uniformSQLParser.ELT, 0); }
		public TerminalNode EXPORT_SET() { return getToken(uniformSQLParser.EXPORT_SET, 0); }
		public TerminalNode FIELD() { return getToken(uniformSQLParser.FIELD, 0); }
		public TerminalNode FIND_IN_SET() { return getToken(uniformSQLParser.FIND_IN_SET, 0); }
		public TerminalNode FORMAT() { return getToken(uniformSQLParser.FORMAT, 0); }
		public TerminalNode FROM_BASE64() { return getToken(uniformSQLParser.FROM_BASE64, 0); }
		public TerminalNode HEX() { return getToken(uniformSQLParser.HEX, 0); }
		public TerminalNode INSERT() { return getToken(uniformSQLParser.INSERT, 0); }
		public TerminalNode INSTR() { return getToken(uniformSQLParser.INSTR, 0); }
		public TerminalNode LEFT() { return getToken(uniformSQLParser.LEFT, 0); }
		public TerminalNode LENGTH() { return getToken(uniformSQLParser.LENGTH, 0); }
		public TerminalNode LOAD_FILE() { return getToken(uniformSQLParser.LOAD_FILE, 0); }
		public TerminalNode LOCATE() { return getToken(uniformSQLParser.LOCATE, 0); }
		public TerminalNode LOWER() { return getToken(uniformSQLParser.LOWER, 0); }
		public TerminalNode LPAD() { return getToken(uniformSQLParser.LPAD, 0); }
		public TerminalNode LTRIM() { return getToken(uniformSQLParser.LTRIM, 0); }
		public TerminalNode MAKE_SET() { return getToken(uniformSQLParser.MAKE_SET, 0); }
		public TerminalNode MID() { return getToken(uniformSQLParser.MID, 0); }
		public TerminalNode OCT() { return getToken(uniformSQLParser.OCT, 0); }
		public TerminalNode ORD() { return getToken(uniformSQLParser.ORD, 0); }
		public TerminalNode QUOTE() { return getToken(uniformSQLParser.QUOTE, 0); }
		public TerminalNode REPEAT() { return getToken(uniformSQLParser.REPEAT, 0); }
		public TerminalNode REPLACE() { return getToken(uniformSQLParser.REPLACE, 0); }
		public TerminalNode REVERSE() { return getToken(uniformSQLParser.REVERSE, 0); }
		public TerminalNode RIGHT() { return getToken(uniformSQLParser.RIGHT, 0); }
		public TerminalNode RPAD() { return getToken(uniformSQLParser.RPAD, 0); }
		public TerminalNode RTRIM() { return getToken(uniformSQLParser.RTRIM, 0); }
		public TerminalNode SOUNDEX() { return getToken(uniformSQLParser.SOUNDEX, 0); }
		public TerminalNode SPACE() { return getToken(uniformSQLParser.SPACE, 0); }
		public TerminalNode STRCMP() { return getToken(uniformSQLParser.STRCMP, 0); }
		public TerminalNode SUBSTRING_INDEX() { return getToken(uniformSQLParser.SUBSTRING_INDEX, 0); }
		public TerminalNode SUBSTRING() { return getToken(uniformSQLParser.SUBSTRING, 0); }
		public TerminalNode TO_BASE64() { return getToken(uniformSQLParser.TO_BASE64, 0); }
		public TerminalNode TRIM() { return getToken(uniformSQLParser.TRIM, 0); }
		public TerminalNode UNHEX() { return getToken(uniformSQLParser.UNHEX, 0); }
		public TerminalNode UPPER() { return getToken(uniformSQLParser.UPPER, 0); }
		public TerminalNode WEIGHT_STRING() { return getToken(uniformSQLParser.WEIGHT_STRING, 0); }
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
		enterRule(_localctx, 32, RULE_char_functions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INSERT) | (1L << LEFT) | (1L << RIGHT))) != 0) || _la==FORMAT || _la==REPLACE || _la==ASCII || _la==CHAR || ((((_la - 364)) & ~0x3f) == 0 && ((1L << (_la - 364)) & ((1L << (BIN - 364)) | (1L << (BIT_LENGTH - 364)) | (1L << (CHAR_LENGTH - 364)) | (1L << (CONCAT_WS - 364)) | (1L << (CONCAT - 364)) | (1L << (ELT - 364)) | (1L << (EXPORT_SET - 364)) | (1L << (FIELD - 364)) | (1L << (FIND_IN_SET - 364)) | (1L << (FROM_BASE64 - 364)) | (1L << (HEX - 364)) | (1L << (INSTR - 364)) | (1L << (LENGTH - 364)) | (1L << (LOAD_FILE - 364)) | (1L << (LOCATE - 364)) | (1L << (LOWER - 364)) | (1L << (LPAD - 364)) | (1L << (LTRIM - 364)) | (1L << (MAKE_SET - 364)) | (1L << (MID - 364)) | (1L << (OCT - 364)) | (1L << (ORD - 364)) | (1L << (QUOTE - 364)) | (1L << (REPEAT - 364)) | (1L << (REVERSE - 364)) | (1L << (RPAD - 364)) | (1L << (RTRIM - 364)) | (1L << (SOUNDEX - 364)) | (1L << (SPACE - 364)) | (1L << (STRCMP - 364)) | (1L << (SUBSTRING_INDEX - 364)) | (1L << (SUBSTRING - 364)) | (1L << (TO_BASE64 - 364)) | (1L << (TRIM - 364)) | (1L << (UNHEX - 364)) | (1L << (UPPER - 364)) | (1L << (WEIGHT_STRING - 364)))) != 0)) ) {
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
		public TerminalNode ADDDATE() { return getToken(uniformSQLParser.ADDDATE, 0); }
		public TerminalNode ADDTIME() { return getToken(uniformSQLParser.ADDTIME, 0); }
		public TerminalNode CONVERT_TZ() { return getToken(uniformSQLParser.CONVERT_TZ, 0); }
		public TerminalNode CURDATE() { return getToken(uniformSQLParser.CURDATE, 0); }
		public TerminalNode CURTIME() { return getToken(uniformSQLParser.CURTIME, 0); }
		public TerminalNode DATE_ADD() { return getToken(uniformSQLParser.DATE_ADD, 0); }
		public TerminalNode DATE_FORMAT() { return getToken(uniformSQLParser.DATE_FORMAT, 0); }
		public TerminalNode DATE_SUB() { return getToken(uniformSQLParser.DATE_SUB, 0); }
		public TerminalNode DATE() { return getToken(uniformSQLParser.DATE, 0); }
		public TerminalNode DATEDIFF() { return getToken(uniformSQLParser.DATEDIFF, 0); }
		public TerminalNode DAYNAME() { return getToken(uniformSQLParser.DAYNAME, 0); }
		public TerminalNode DAYOFMONTH() { return getToken(uniformSQLParser.DAYOFMONTH, 0); }
		public TerminalNode DAYOFWEEK() { return getToken(uniformSQLParser.DAYOFWEEK, 0); }
		public TerminalNode DAYOFYEAR() { return getToken(uniformSQLParser.DAYOFYEAR, 0); }
		public TerminalNode EXTRACT() { return getToken(uniformSQLParser.EXTRACT, 0); }
		public TerminalNode FROM_DAYS() { return getToken(uniformSQLParser.FROM_DAYS, 0); }
		public TerminalNode FROM_UNIXTIME() { return getToken(uniformSQLParser.FROM_UNIXTIME, 0); }
		public TerminalNode GET_FORMAT() { return getToken(uniformSQLParser.GET_FORMAT, 0); }
		public TerminalNode HOUR() { return getToken(uniformSQLParser.HOUR, 0); }
		public TerminalNode LAST_DAY() { return getToken(uniformSQLParser.LAST_DAY, 0); }
		public TerminalNode MAKEDATE() { return getToken(uniformSQLParser.MAKEDATE, 0); }
		public TerminalNode MAKETIME() { return getToken(uniformSQLParser.MAKETIME, 0); }
		public TerminalNode MICROSECOND() { return getToken(uniformSQLParser.MICROSECOND, 0); }
		public TerminalNode MINUTE() { return getToken(uniformSQLParser.MINUTE, 0); }
		public TerminalNode MONTH() { return getToken(uniformSQLParser.MONTH, 0); }
		public TerminalNode MONTHNAME() { return getToken(uniformSQLParser.MONTHNAME, 0); }
		public TerminalNode NOW() { return getToken(uniformSQLParser.NOW, 0); }
		public TerminalNode PERIOD_ADD() { return getToken(uniformSQLParser.PERIOD_ADD, 0); }
		public TerminalNode PERIOD_DIFF() { return getToken(uniformSQLParser.PERIOD_DIFF, 0); }
		public TerminalNode QUARTER() { return getToken(uniformSQLParser.QUARTER, 0); }
		public TerminalNode SEC_TO_TIME() { return getToken(uniformSQLParser.SEC_TO_TIME, 0); }
		public TerminalNode SECOND() { return getToken(uniformSQLParser.SECOND, 0); }
		public TerminalNode STR_TO_DATE() { return getToken(uniformSQLParser.STR_TO_DATE, 0); }
		public TerminalNode SUBTIME() { return getToken(uniformSQLParser.SUBTIME, 0); }
		public TerminalNode SYSDATE() { return getToken(uniformSQLParser.SYSDATE, 0); }
		public TerminalNode TIME_FORMAT() { return getToken(uniformSQLParser.TIME_FORMAT, 0); }
		public TerminalNode TIME_TO_SEC() { return getToken(uniformSQLParser.TIME_TO_SEC, 0); }
		public TerminalNode TIME() { return getToken(uniformSQLParser.TIME, 0); }
		public TerminalNode TIMEDIFF() { return getToken(uniformSQLParser.TIMEDIFF, 0); }
		public TerminalNode TIMESTAMP() { return getToken(uniformSQLParser.TIMESTAMP, 0); }
		public TerminalNode TIMESTAMPADD() { return getToken(uniformSQLParser.TIMESTAMPADD, 0); }
		public TerminalNode TIMESTAMPDIFF() { return getToken(uniformSQLParser.TIMESTAMPDIFF, 0); }
		public TerminalNode TO_DAYS() { return getToken(uniformSQLParser.TO_DAYS, 0); }
		public TerminalNode TO_SECONDS() { return getToken(uniformSQLParser.TO_SECONDS, 0); }
		public TerminalNode UNIX_TIMESTAMP() { return getToken(uniformSQLParser.UNIX_TIMESTAMP, 0); }
		public TerminalNode UTC_DATE() { return getToken(uniformSQLParser.UTC_DATE, 0); }
		public TerminalNode UTC_TIME() { return getToken(uniformSQLParser.UTC_TIME, 0); }
		public TerminalNode UTC_TIMESTAMP() { return getToken(uniformSQLParser.UTC_TIMESTAMP, 0); }
		public TerminalNode WEEK() { return getToken(uniformSQLParser.WEEK, 0); }
		public TerminalNode WEEKDAY() { return getToken(uniformSQLParser.WEEKDAY, 0); }
		public TerminalNode WEEKOFYEAR() { return getToken(uniformSQLParser.WEEKOFYEAR, 0); }
		public TerminalNode YEAR() { return getToken(uniformSQLParser.YEAR, 0); }
		public TerminalNode YEARWEEK() { return getToken(uniformSQLParser.YEARWEEK, 0); }
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
		enterRule(_localctx, 34, RULE_time_functions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			_la = _input.LA(1);
			if ( !(_la==DATE || _la==TIMESTAMP || ((((_la - 309)) & ~0x3f) == 0 && ((1L << (_la - 309)) & ((1L << (TIME - 309)) | (1L << (SECOND - 309)) | (1L << (MINUTE - 309)) | (1L << (HOUR - 309)) | (1L << (WEEK - 309)) | (1L << (MONTH - 309)) | (1L << (QUARTER - 309)) | (1L << (YEAR - 309)))) != 0) || ((((_la - 401)) & ~0x3f) == 0 && ((1L << (_la - 401)) & ((1L << (ADDDATE - 401)) | (1L << (ADDTIME - 401)) | (1L << (CONVERT_TZ - 401)) | (1L << (CURDATE - 401)) | (1L << (CURTIME - 401)) | (1L << (DATE_ADD - 401)) | (1L << (DATE_FORMAT - 401)) | (1L << (DATE_SUB - 401)) | (1L << (DATEDIFF - 401)) | (1L << (DAYNAME - 401)) | (1L << (DAYOFMONTH - 401)) | (1L << (DAYOFWEEK - 401)) | (1L << (DAYOFYEAR - 401)) | (1L << (EXTRACT - 401)) | (1L << (FROM_DAYS - 401)) | (1L << (FROM_UNIXTIME - 401)) | (1L << (GET_FORMAT - 401)) | (1L << (LAST_DAY - 401)) | (1L << (MAKEDATE - 401)) | (1L << (MAKETIME - 401)) | (1L << (MICROSECOND - 401)) | (1L << (MONTHNAME - 401)) | (1L << (NOW - 401)) | (1L << (PERIOD_ADD - 401)) | (1L << (PERIOD_DIFF - 401)) | (1L << (SEC_TO_TIME - 401)) | (1L << (STR_TO_DATE - 401)) | (1L << (SUBTIME - 401)) | (1L << (SYSDATE - 401)) | (1L << (TIME_FORMAT - 401)) | (1L << (TIME_TO_SEC - 401)) | (1L << (TIMEDIFF - 401)) | (1L << (TIMESTAMPADD - 401)) | (1L << (TIMESTAMPDIFF - 401)) | (1L << (TO_DAYS - 401)) | (1L << (TO_SECONDS - 401)) | (1L << (UNIX_TIMESTAMP - 401)) | (1L << (UTC_DATE - 401)) | (1L << (UTC_TIME - 401)) | (1L << (UTC_TIMESTAMP - 401)) | (1L << (WEEKDAY - 401)) | (1L << (WEEKOFYEAR - 401)) | (1L << (YEARWEEK - 401)))) != 0)) ) {
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
		public TerminalNode MAKE_SET() { return getToken(uniformSQLParser.MAKE_SET, 0); }
		public TerminalNode LOAD_FILE() { return getToken(uniformSQLParser.LOAD_FILE, 0); }
		public TerminalNode IF() { return getToken(uniformSQLParser.IF, 0); }
		public TerminalNode IFNULL() { return getToken(uniformSQLParser.IFNULL, 0); }
		public TerminalNode AES_ENCRYPT() { return getToken(uniformSQLParser.AES_ENCRYPT, 0); }
		public TerminalNode AES_DECRYPT() { return getToken(uniformSQLParser.AES_DECRYPT, 0); }
		public TerminalNode DECODE() { return getToken(uniformSQLParser.DECODE, 0); }
		public TerminalNode ENCODE() { return getToken(uniformSQLParser.ENCODE, 0); }
		public TerminalNode DES_DECRYPT() { return getToken(uniformSQLParser.DES_DECRYPT, 0); }
		public TerminalNode DES_ENCRYPT() { return getToken(uniformSQLParser.DES_ENCRYPT, 0); }
		public TerminalNode ENCRYPT() { return getToken(uniformSQLParser.ENCRYPT, 0); }
		public TerminalNode MD5() { return getToken(uniformSQLParser.MD5, 0); }
		public TerminalNode OLD_PASSWORD() { return getToken(uniformSQLParser.OLD_PASSWORD, 0); }
		public TerminalNode PASSWORD() { return getToken(uniformSQLParser.PASSWORD, 0); }
		public TerminalNode BENCHMARK() { return getToken(uniformSQLParser.BENCHMARK, 0); }
		public TerminalNode CHARSET() { return getToken(uniformSQLParser.CHARSET, 0); }
		public TerminalNode COERCIBILITY() { return getToken(uniformSQLParser.COERCIBILITY, 0); }
		public TerminalNode COLLATION() { return getToken(uniformSQLParser.COLLATION, 0); }
		public TerminalNode CONNECTION_ID() { return getToken(uniformSQLParser.CONNECTION_ID, 0); }
		public TerminalNode CURRENT_USER() { return getToken(uniformSQLParser.CURRENT_USER, 0); }
		public TerminalNode DATABASE() { return getToken(uniformSQLParser.DATABASE, 0); }
		public TerminalNode SCHEMA() { return getToken(uniformSQLParser.SCHEMA, 0); }
		public TerminalNode USER() { return getToken(uniformSQLParser.USER, 0); }
		public TerminalNode SESSION_USER() { return getToken(uniformSQLParser.SESSION_USER, 0); }
		public TerminalNode SYSTEM_USER() { return getToken(uniformSQLParser.SYSTEM_USER, 0); }
		public TerminalNode VERSION() { return getToken(uniformSQLParser.VERSION, 0); }
		public TerminalNode FOUND_ROWS() { return getToken(uniformSQLParser.FOUND_ROWS, 0); }
		public TerminalNode LAST_INSERT_ID() { return getToken(uniformSQLParser.LAST_INSERT_ID, 0); }
		public TerminalNode DEFAULT() { return getToken(uniformSQLParser.DEFAULT, 0); }
		public TerminalNode GET_LOCK() { return getToken(uniformSQLParser.GET_LOCK, 0); }
		public TerminalNode RELEASE_LOCK() { return getToken(uniformSQLParser.RELEASE_LOCK, 0); }
		public TerminalNode IS_FREE_LOCK() { return getToken(uniformSQLParser.IS_FREE_LOCK, 0); }
		public TerminalNode IS_USED_LOCK() { return getToken(uniformSQLParser.IS_USED_LOCK, 0); }
		public TerminalNode MASTER_POS_WAIT() { return getToken(uniformSQLParser.MASTER_POS_WAIT, 0); }
		public TerminalNode INET_ATON() { return getToken(uniformSQLParser.INET_ATON, 0); }
		public TerminalNode INET_NTOA() { return getToken(uniformSQLParser.INET_NTOA, 0); }
		public TerminalNode NAME_CONST() { return getToken(uniformSQLParser.NAME_CONST, 0); }
		public TerminalNode SLEEP() { return getToken(uniformSQLParser.SLEEP, 0); }
		public TerminalNode UUID() { return getToken(uniformSQLParser.UUID, 0); }
		public TerminalNode VALUES() { return getToken(uniformSQLParser.VALUES, 0); }
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
		enterRule(_localctx, 36, RULE_other_functions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			_la = _input.LA(1);
			if ( !(_la==IF || ((((_la - 117)) & ~0x3f) == 0 && ((1L << (_la - 117)) & ((1L << (DEFAULT - 117)) | (1L << (DATABASE - 117)) | (1L << (SCHEMA - 117)))) != 0) || _la==USER || _la==LOAD_FILE || _la==MAKE_SET || ((((_la - 444)) & ~0x3f) == 0 && ((1L << (_la - 444)) & ((1L << (IFNULL - 444)) | (1L << (AES_ENCRYPT - 444)) | (1L << (AES_DECRYPT - 444)) | (1L << (DECODE - 444)) | (1L << (ENCODE - 444)) | (1L << (DES_DECRYPT - 444)) | (1L << (DES_ENCRYPT - 444)) | (1L << (ENCRYPT - 444)) | (1L << (MD5 - 444)) | (1L << (OLD_PASSWORD - 444)) | (1L << (PASSWORD - 444)) | (1L << (BENCHMARK - 444)) | (1L << (CHARSET - 444)) | (1L << (COERCIBILITY - 444)) | (1L << (COLLATION - 444)) | (1L << (CONNECTION_ID - 444)) | (1L << (CURRENT_USER - 444)) | (1L << (SESSION_USER - 444)) | (1L << (SYSTEM_USER - 444)) | (1L << (VERSION - 444)) | (1L << (FOUND_ROWS - 444)) | (1L << (LAST_INSERT_ID - 444)) | (1L << (GET_LOCK - 444)) | (1L << (RELEASE_LOCK - 444)) | (1L << (IS_FREE_LOCK - 444)) | (1L << (IS_USED_LOCK - 444)) | (1L << (MASTER_POS_WAIT - 444)) | (1L << (INET_ATON - 444)) | (1L << (INET_NTOA - 444)) | (1L << (NAME_CONST - 444)) | (1L << (SLEEP - 444)) | (1L << (UUID - 444)) | (1L << (VALUES - 444)))) != 0)) ) {
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
		public TerminalNode BIT_AND() { return getToken(uniformSQLParser.BIT_AND, 0); }
		public TerminalNode BIT_OR() { return getToken(uniformSQLParser.BIT_OR, 0); }
		public TerminalNode BIT_XOR() { return getToken(uniformSQLParser.BIT_XOR, 0); }
		public TerminalNode GROUP_CONCAT() { return getToken(uniformSQLParser.GROUP_CONCAT, 0); }
		public TerminalNode STD() { return getToken(uniformSQLParser.STD, 0); }
		public TerminalNode STDDEV() { return getToken(uniformSQLParser.STDDEV, 0); }
		public TerminalNode STDDEV_POP() { return getToken(uniformSQLParser.STDDEV_POP, 0); }
		public TerminalNode STDDEV_SAMP() { return getToken(uniformSQLParser.STDDEV_SAMP, 0); }
		public TerminalNode VAR_POP() { return getToken(uniformSQLParser.VAR_POP, 0); }
		public TerminalNode VAR_SAMP() { return getToken(uniformSQLParser.VAR_SAMP, 0); }
		public TerminalNode VARIANCE() { return getToken(uniformSQLParser.VARIANCE, 0); }
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
		enterRule(_localctx, 38, RULE_group_functions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			_la = _input.LA(1);
			if ( !(((((_la - 477)) & ~0x3f) == 0 && ((1L << (_la - 477)) & ((1L << (AVG - 477)) | (1L << (COUNT - 477)) | (1L << (MAX - 477)) | (1L << (MIN - 477)) | (1L << (SUM - 477)) | (1L << (BIT_AND - 477)) | (1L << (BIT_OR - 477)) | (1L << (BIT_XOR - 477)) | (1L << (GROUP_CONCAT - 477)) | (1L << (STD - 477)) | (1L << (STDDEV - 477)) | (1L << (STDDEV_POP - 477)) | (1L << (STDDEV_SAMP - 477)) | (1L << (VAR_POP - 477)) | (1L << (VAR_SAMP - 477)) | (1L << (VARIANCE - 477)))) != 0)) ) {
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
		public TerminalNode ID() { return getToken(uniformSQLParser.ID, 0); }
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
		enterRule(_localctx, 40, RULE_schema_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(ID);
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
		public TerminalNode ID() { return getToken(uniformSQLParser.ID, 0); }
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
		enterRule(_localctx, 42, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			match(ID);
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
		public TerminalNode ID() { return getToken(uniformSQLParser.ID, 0); }
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
		enterRule(_localctx, 44, RULE_engine_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(ID);
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
		public TerminalNode ID() { return getToken(uniformSQLParser.ID, 0); }
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
		enterRule(_localctx, 46, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(ID);
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
		public TerminalNode ID() { return getToken(uniformSQLParser.ID, 0); }
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
		enterRule(_localctx, 48, RULE_view_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(ID);
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
		public TerminalNode ID() { return getToken(uniformSQLParser.ID, 0); }
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
		enterRule(_localctx, 50, RULE_parser_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(ID);
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
		public TerminalNode ID() { return getToken(uniformSQLParser.ID, 0); }
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
		enterRule(_localctx, 52, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(ID);
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
		public TerminalNode ID() { return getToken(uniformSQLParser.ID, 0); }
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
		enterRule(_localctx, 54, RULE_partition_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			match(ID);
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
		public TerminalNode ID() { return getToken(uniformSQLParser.ID, 0); }
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
		enterRule(_localctx, 56, RULE_partition_logical_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(ID);
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
		public TerminalNode ID() { return getToken(uniformSQLParser.ID, 0); }
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
		enterRule(_localctx, 58, RULE_constraintbol_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			match(ID);
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
		public TerminalNode ID() { return getToken(uniformSQLParser.ID, 0); }
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
		enterRule(_localctx, 60, RULE_foreign_keybol_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(ID);
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
		public TerminalNode ID() { return getToken(uniformSQLParser.ID, 0); }
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
		enterRule(_localctx, 62, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			match(ID);
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
		public TerminalNode ID() { return getToken(uniformSQLParser.ID, 0); }
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
		enterRule(_localctx, 64, RULE_event_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			match(ID);
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
		public TerminalNode ID() { return getToken(uniformSQLParser.ID, 0); }
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
		enterRule(_localctx, 66, RULE_user_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			match(ID);
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
		public TerminalNode ID() { return getToken(uniformSQLParser.ID, 0); }
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
		enterRule(_localctx, 68, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			match(ID);
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
		public TerminalNode ID() { return getToken(uniformSQLParser.ID, 0); }
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
		enterRule(_localctx, 70, RULE_procedure_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(ID);
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
		public TerminalNode ID() { return getToken(uniformSQLParser.ID, 0); }
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
		enterRule(_localctx, 72, RULE_server_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			match(ID);
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
		public TerminalNode ID() { return getToken(uniformSQLParser.ID, 0); }
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
		enterRule(_localctx, 74, RULE_wrapper_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			match(ID);
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
		public TerminalNode ID() { return getToken(uniformSQLParser.ID, 0); }
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
		enterRule(_localctx, 76, RULE_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(412);
				match(AS);
				}
			}

			setState(415);
			match(ID);
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
		enterRule(_localctx, 78, RULE_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			exp_factor1();
			setState(422);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(418);
					match(OR);
					setState(419);
					exp_factor1();
					}
					} 
				}
				setState(424);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		enterRule(_localctx, 80, RULE_exp_factor1);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			exp_factor2();
			setState(430);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(426);
					match(XOR);
					setState(427);
					exp_factor2();
					}
					} 
				}
				setState(432);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		enterRule(_localctx, 82, RULE_exp_factor2);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			exp_factor3();
			setState(438);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(434);
					match(AND);
					setState(435);
					exp_factor3();
					}
					} 
				}
				setState(440);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
		enterRule(_localctx, 84, RULE_exp_factor3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(441);
				match(NOT);
				}
				break;
			}
			setState(444);
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
		enterRule(_localctx, 86, RULE_exp_factor4);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			bool_primary();
			setState(455);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(447);
				match(IS);
				setState(449);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(448);
					match(NOT);
					}
				}

				setState(453);
				switch (_input.LA(1)) {
				case TRUE:
				case FALSE:
					{
					setState(451);
					boolean_literal();
					}
					break;
				case NULL:
					{
					setState(452);
					match(NULL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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
		public TerminalNode ANY() { return getToken(uniformSQLParser.ANY, 0); }
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
		enterRule(_localctx, 88, RULE_bool_primary);
		int _la;
		try {
			setState(474);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(457);
				predicate();
				setState(458);
				relational_op();
				setState(459);
				predicate();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(461);
				predicate();
				setState(462);
				relational_op();
				setState(464);
				_la = _input.LA(1);
				if (_la==ALL || _la==ANY) {
					{
					setState(463);
					_la = _input.LA(1);
					if ( !(_la==ALL || _la==ANY) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(466);
				subquery();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(469);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(468);
					match(NOT);
					}
				}

				setState(471);
				match(EXISTS);
				setState(472);
				subquery();
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(473);
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
		public TerminalNode SOUNDS() { return getToken(uniformSQLParser.SOUNDS, 0); }
		public TerminalNode LIKE() { return getToken(uniformSQLParser.LIKE, 0); }
		public List<Simple_exprContext> simple_expr() {
			return getRuleContexts(Simple_exprContext.class);
		}
		public Simple_exprContext simple_expr(int i) {
			return getRuleContext(Simple_exprContext.class,i);
		}
		public TerminalNode ESCAPE() { return getToken(uniformSQLParser.ESCAPE, 0); }
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
		enterRule(_localctx, 90, RULE_predicate);
		int _la;
		try {
			setState(517);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(476);
				bit_expr();
				setState(478);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(477);
					match(NOT);
					}
				}

				setState(480);
				match(IN);
				setState(483);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(481);
					subquery();
					}
					break;
				case 2:
					{
					setState(482);
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
				setState(485);
				bit_expr();
				setState(487);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(486);
					match(NOT);
					}
				}

				setState(489);
				match(BETWEEN);
				setState(490);
				bit_expr();
				setState(491);
				match(AND);
				setState(492);
				predicate();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(494);
				bit_expr();
				setState(495);
				match(SOUNDS);
				setState(496);
				match(LIKE);
				setState(497);
				bit_expr();
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(499);
				bit_expr();
				setState(501);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(500);
					match(NOT);
					}
				}

				setState(503);
				match(LIKE);
				setState(504);
				simple_expr();
				setState(507);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(505);
					match(ESCAPE);
					setState(506);
					simple_expr();
					}
					break;
				}
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
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
				match(REGEXP);
				setState(514);
				bit_expr();
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(516);
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
		enterRule(_localctx, 92, RULE_bit_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			factor1();
			setState(522);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(520);
				match(VERTBAR);
				setState(521);
				factor1();
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
		enterRule(_localctx, 94, RULE_factor1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			factor2();
			setState(527);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(525);
				match(BITAND);
				setState(526);
				factor2();
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
		enterRule(_localctx, 96, RULE_factor2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			factor3();
			setState(532);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(530);
				_la = _input.LA(1);
				if ( !(_la==SHIFT_LEFT || _la==SHIFT_RIGHT) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(531);
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
		public TerminalNode PLUS() { return getToken(uniformSQLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(uniformSQLParser.MINUS, 0); }
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
		enterRule(_localctx, 98, RULE_factor3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			factor4();
			setState(537);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(535);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(536);
				factor4();
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

	public static class Factor4Context extends ParserRuleContext {
		public List<Factor5Context> factor5() {
			return getRuleContexts(Factor5Context.class);
		}
		public Factor5Context factor5(int i) {
			return getRuleContext(Factor5Context.class,i);
		}
		public TerminalNode ASTERISK() { return getToken(uniformSQLParser.ASTERISK, 0); }
		public TerminalNode DIVIDE() { return getToken(uniformSQLParser.DIVIDE, 0); }
		public TerminalNode MOD() { return getToken(uniformSQLParser.MOD, 0); }
		public TerminalNode POWER_OP() { return getToken(uniformSQLParser.POWER_OP, 0); }
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
		enterRule(_localctx, 100, RULE_factor4);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			factor5();
			setState(542);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(540);
				_la = _input.LA(1);
				if ( !(((((_la - 232)) & ~0x3f) == 0 && ((1L << (_la - 232)) & ((1L << (DIVIDE - 232)) | (1L << (MOD - 232)) | (1L << (ASTERISK - 232)) | (1L << (POWER_OP - 232)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(541);
				factor5();
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
		enterRule(_localctx, 102, RULE_factor5);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			factor6();
			setState(547);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(545);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(546);
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
		enterRule(_localctx, 104, RULE_factor6);
		int _la;
		try {
			setState(552);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(549);
				_la = _input.LA(1);
				if ( !(_la==BINARY || _la==PLUS || _la==MINUS || _la==NEGATION) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(550);
				simple_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(551);
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
		public TerminalNode COLLATE() { return getToken(uniformSQLParser.COLLATE, 0); }
		public Collation_namesContext collation_names() {
			return getRuleContext(Collation_namesContext.class,0);
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
		enterRule(_localctx, 106, RULE_factor7);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			simple_expr();
			setState(557);
			_la = _input.LA(1);
			if (_la==COLLATE) {
				{
				setState(555);
				match(COLLATE);
				setState(556);
				collation_names();
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
		public TerminalNode USER_VAR() { return getToken(uniformSQLParser.USER_VAR, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public TerminalNode ROW() { return getToken(uniformSQLParser.ROW, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode EXISTS() { return getToken(uniformSQLParser.EXISTS, 0); }
		public Match_against_statementContext match_against_statement() {
			return getRuleContext(Match_against_statementContext.class,0);
		}
		public Case_when_statementContext case_when_statement() {
			return getRuleContext(Case_when_statementContext.class,0);
		}
		public Interval_exprContext interval_expr() {
			return getRuleContext(Interval_exprContext.class,0);
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
		enterRule(_localctx, 108, RULE_simple_expr);
		try {
			setState(572);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(559);
				literal_value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(560);
				column_spec();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(561);
				function_call();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(562);
				match(USER_VAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(563);
				expression_list();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(564);
				match(ROW);
				setState(565);
				expression_list();
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(566);
				subquery();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(567);
				match(EXISTS);
				setState(568);
				subquery();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(569);
				match_against_statement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(570);
				case_when_statement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(571);
				interval_expr();
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
		public TerminalNode CONVERT() { return getToken(uniformSQLParser.CONVERT, 0); }
		public TerminalNode USING() { return getToken(uniformSQLParser.USING, 0); }
		public Transcoding_nameContext transcoding_name() {
			return getRuleContext(Transcoding_nameContext.class,0);
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
		enterRule(_localctx, 110, RULE_function_call);
		int _la;
		try {
			setState(618);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(574);
				functionList();
				setState(587);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(575);
					match(LPAREN);
					setState(584);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NOT) | (1L << IF) | (1L << EXISTS) | (1L << INSERT) | (1L << LEFT) | (1L << RIGHT) | (1L << NULL))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (DATE - 77)) | (1L << (TIMESTAMP - 77)) | (1L << (ROW - 77)) | (1L << (FORMAT - 77)) | (1L << (DEFAULT - 77)) | (1L << (CAST - 77)) | (1L << (REPLACE - 77)))) != 0) || ((((_la - 151)) & ~0x3f) == 0 && ((1L << (_la - 151)) & ((1L << (CASE - 151)) | (1L << (DATABASE - 151)) | (1L << (SCHEMA - 151)) | (1L << (BINARY - 151)))) != 0) || ((((_la - 225)) & ~0x3f) == 0 && ((1L << (_la - 225)) & ((1L << (TRUNCATE - 225)) | (1L << (USER - 225)) | (1L << (MOD - 225)) | (1L << (LPAREN - 225)) | (1L << (PLUS - 225)) | (1L << (MINUS - 225)) | (1L << (NEGATION - 225)) | (1L << (INTEGER_NUM - 225)) | (1L << (HEX_DIGIT - 225)) | (1L << (BIT_NUM - 225)) | (1L << (REAL_NUMBER - 225)) | (1L << (TEXT_STRING - 225)) | (1L << (ID - 225)) | (1L << (USER_VAR - 225)) | (1L << (ASCII - 225)))) != 0) || ((((_la - 306)) & ~0x3f) == 0 && ((1L << (_la - 306)) & ((1L << (CHAR - 306)) | (1L << (TIME - 306)) | (1L << (SECOND - 306)) | (1L << (MINUTE - 306)) | (1L << (HOUR - 306)) | (1L << (WEEK - 306)) | (1L << (MONTH - 306)) | (1L << (QUARTER - 306)) | (1L << (YEAR - 306)) | (1L << (ABS - 306)) | (1L << (ACOS - 306)) | (1L << (ASIN - 306)) | (1L << (ATAN2 - 306)) | (1L << (ATAN - 306)) | (1L << (CEIL - 306)) | (1L << (CEILING - 306)) | (1L << (CONV - 306)) | (1L << (COS - 306)) | (1L << (COT - 306)) | (1L << (CRC32 - 306)) | (1L << (DEGREES - 306)) | (1L << (EXP - 306)) | (1L << (FLOOR - 306)) | (1L << (LN - 306)) | (1L << (LOG10 - 306)) | (1L << (LOG2 - 306)) | (1L << (LOG - 306)) | (1L << (PI - 306)) | (1L << (POW - 306)) | (1L << (POWER - 306)) | (1L << (RADIANS - 306)) | (1L << (RAND - 306)) | (1L << (ROUND - 306)) | (1L << (SIGN - 306)) | (1L << (SIN - 306)) | (1L << (SQRT - 306)) | (1L << (TAN - 306)) | (1L << (BIN - 306)) | (1L << (BIT_LENGTH - 306)) | (1L << (CHAR_LENGTH - 306)) | (1L << (CONCAT_WS - 306)) | (1L << (CONCAT - 306)) | (1L << (ELT - 306)))) != 0) || ((((_la - 370)) & ~0x3f) == 0 && ((1L << (_la - 370)) & ((1L << (EXPORT_SET - 370)) | (1L << (FIELD - 370)) | (1L << (FIND_IN_SET - 370)) | (1L << (FROM_BASE64 - 370)) | (1L << (HEX - 370)) | (1L << (INSTR - 370)) | (1L << (LENGTH - 370)) | (1L << (LOAD_FILE - 370)) | (1L << (LOCATE - 370)) | (1L << (LOWER - 370)) | (1L << (LPAD - 370)) | (1L << (LTRIM - 370)) | (1L << (MAKE_SET - 370)) | (1L << (MID - 370)) | (1L << (OCT - 370)) | (1L << (ORD - 370)) | (1L << (QUOTE - 370)) | (1L << (REPEAT - 370)) | (1L << (REVERSE - 370)) | (1L << (RPAD - 370)) | (1L << (RTRIM - 370)) | (1L << (SOUNDEX - 370)) | (1L << (SPACE - 370)) | (1L << (STRCMP - 370)) | (1L << (SUBSTRING_INDEX - 370)) | (1L << (SUBSTRING - 370)) | (1L << (TO_BASE64 - 370)) | (1L << (TRIM - 370)) | (1L << (UNHEX - 370)) | (1L << (UPPER - 370)) | (1L << (WEIGHT_STRING - 370)) | (1L << (ADDDATE - 370)) | (1L << (ADDTIME - 370)) | (1L << (CONVERT_TZ - 370)) | (1L << (CURDATE - 370)) | (1L << (CURTIME - 370)) | (1L << (DATE_ADD - 370)) | (1L << (DATE_FORMAT - 370)) | (1L << (DATE_SUB - 370)) | (1L << (DATEDIFF - 370)) | (1L << (DAYNAME - 370)) | (1L << (DAYOFMONTH - 370)) | (1L << (DAYOFWEEK - 370)) | (1L << (DAYOFYEAR - 370)) | (1L << (EXTRACT - 370)) | (1L << (FROM_DAYS - 370)) | (1L << (FROM_UNIXTIME - 370)) | (1L << (GET_FORMAT - 370)) | (1L << (LAST_DAY - 370)) | (1L << (MAKEDATE - 370)) | (1L << (MAKETIME - 370)) | (1L << (MICROSECOND - 370)) | (1L << (MONTHNAME - 370)) | (1L << (NOW - 370)) | (1L << (PERIOD_ADD - 370)) | (1L << (PERIOD_DIFF - 370)) | (1L << (SEC_TO_TIME - 370)) | (1L << (STR_TO_DATE - 370)) | (1L << (SUBTIME - 370)) | (1L << (SYSDATE - 370)) | (1L << (TIME_FORMAT - 370)) | (1L << (TIME_TO_SEC - 370)) | (1L << (TIMEDIFF - 370)) | (1L << (TIMESTAMPADD - 370)))) != 0) || ((((_la - 434)) & ~0x3f) == 0 && ((1L << (_la - 434)) & ((1L << (TIMESTAMPDIFF - 434)) | (1L << (TO_DAYS - 434)) | (1L << (TO_SECONDS - 434)) | (1L << (UNIX_TIMESTAMP - 434)) | (1L << (UTC_DATE - 434)) | (1L << (UTC_TIME - 434)) | (1L << (UTC_TIMESTAMP - 434)) | (1L << (WEEKDAY - 434)) | (1L << (WEEKOFYEAR - 434)) | (1L << (YEARWEEK - 434)) | (1L << (IFNULL - 434)) | (1L << (AES_ENCRYPT - 434)) | (1L << (AES_DECRYPT - 434)) | (1L << (DECODE - 434)) | (1L << (ENCODE - 434)) | (1L << (DES_DECRYPT - 434)) | (1L << (DES_ENCRYPT - 434)) | (1L << (ENCRYPT - 434)) | (1L << (MD5 - 434)) | (1L << (OLD_PASSWORD - 434)) | (1L << (PASSWORD - 434)) | (1L << (BENCHMARK - 434)) | (1L << (CHARSET - 434)) | (1L << (COERCIBILITY - 434)) | (1L << (COLLATION - 434)) | (1L << (CONNECTION_ID - 434)) | (1L << (CURRENT_USER - 434)) | (1L << (SESSION_USER - 434)) | (1L << (SYSTEM_USER - 434)) | (1L << (VERSION - 434)) | (1L << (FOUND_ROWS - 434)) | (1L << (LAST_INSERT_ID - 434)) | (1L << (GET_LOCK - 434)) | (1L << (RELEASE_LOCK - 434)) | (1L << (IS_FREE_LOCK - 434)) | (1L << (IS_USED_LOCK - 434)) | (1L << (MASTER_POS_WAIT - 434)) | (1L << (INET_ATON - 434)) | (1L << (INET_NTOA - 434)) | (1L << (NAME_CONST - 434)) | (1L << (SLEEP - 434)) | (1L << (UUID - 434)) | (1L << (VALUES - 434)) | (1L << (AVG - 434)) | (1L << (COUNT - 434)) | (1L << (MAX - 434)) | (1L << (MIN - 434)) | (1L << (SUM - 434)) | (1L << (BIT_AND - 434)) | (1L << (BIT_OR - 434)) | (1L << (BIT_XOR - 434)) | (1L << (GROUP_CONCAT - 434)) | (1L << (STD - 434)) | (1L << (STDDEV - 434)) | (1L << (STDDEV_POP - 434)) | (1L << (STDDEV_SAMP - 434)) | (1L << (VAR_POP - 434)) | (1L << (VAR_SAMP - 434)) | (1L << (VARIANCE - 434)))) != 0) || ((((_la - 498)) & ~0x3f) == 0 && ((1L << (_la - 498)) & ((1L << (CONVERT - 498)) | (1L << (MATCH - 498)) | (1L << (INTERVAL - 498)))) != 0)) {
						{
						setState(576);
						expression();
						setState(581);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(577);
							match(COMMA);
							setState(578);
							expression();
							}
							}
							setState(583);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(586);
					match(RPAREN);
					}
				}

				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(589);
				match(CAST);
				setState(590);
				match(LPAREN);
				setState(591);
				expression();
				setState(592);
				match(AS);
				setState(593);
				cast_data_type();
				setState(594);
				match(RPAREN);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(596);
				match(CONVERT);
				setState(597);
				match(LPAREN);
				setState(598);
				expression();
				setState(599);
				match(COMMA);
				setState(600);
				cast_data_type();
				setState(601);
				match(RPAREN);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(603);
				match(CONVERT);
				setState(604);
				match(LPAREN);
				setState(605);
				expression();
				setState(606);
				match(USING);
				setState(607);
				transcoding_name();
				setState(608);
				match(RPAREN);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(610);
				group_functions();
				setState(611);
				match(LPAREN);
				setState(613);
				_la = _input.LA(1);
				if (_la==ALL || _la==DISTINCT || _la==ASTERISK) {
					{
					setState(612);
					_la = _input.LA(1);
					if ( !(_la==ALL || _la==DISTINCT || _la==ASTERISK) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(615);
				bit_expr();
				setState(616);
				match(RPAREN);
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
		enterRule(_localctx, 112, RULE_case_when_statement);
		try {
			setState(622);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(620);
				case_when_statement1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(621);
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
		enterRule(_localctx, 114, RULE_case_when_statement1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			match(CASE);
			setState(630); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(625);
				match(WHEN);
				setState(626);
				expression();
				setState(627);
				match(THEN);
				setState(628);
				bit_expr();
				}
				}
				setState(632); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
			setState(636);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(634);
				match(ELSE);
				setState(635);
				bit_expr();
				}
			}

			setState(638);
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
		enterRule(_localctx, 116, RULE_case_when_statement2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			match(CASE);
			setState(641);
			bit_expr();
			setState(647); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(642);
				match(WHEN);
				setState(643);
				bit_expr();
				setState(644);
				match(THEN);
				setState(645);
				bit_expr();
				}
				}
				setState(649); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
			setState(653);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(651);
				match(ELSE);
				setState(652);
				bit_expr();
				}
			}

			setState(655);
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

	public static class Match_against_statementContext extends ParserRuleContext {
		public TerminalNode MATCH() { return getToken(uniformSQLParser.MATCH, 0); }
		public TerminalNode AGAINST() { return getToken(uniformSQLParser.AGAINST, 0); }
		public List<Column_specContext> column_spec() {
			return getRuleContexts(Column_specContext.class);
		}
		public Column_specContext column_spec(int i) {
			return getRuleContext(Column_specContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public Search_modifierContext search_modifier() {
			return getRuleContext(Search_modifierContext.class,0);
		}
		public Match_against_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match_against_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterMatch_against_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitMatch_against_statement(this);
		}
	}

	public final Match_against_statementContext match_against_statement() throws RecognitionException {
		Match_against_statementContext _localctx = new Match_against_statementContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_match_against_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(657);
			match(MATCH);
			{
			setState(658);
			column_spec();
			setState(663);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(659);
				match(COMMA);
				setState(660);
				column_spec();
				}
				}
				setState(665);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(666);
			match(AGAINST);
			{
			setState(667);
			expression();
			setState(669);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(668);
				search_modifier();
				}
				break;
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
		enterRule(_localctx, 120, RULE_column_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(674);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(671);
					schema_name();
					setState(672);
					match(DOT);
					}
					break;
				}
				setState(676);
				table_name();
				setState(677);
				match(DOT);
				}
				break;
			}
			setState(681);
			column_name();
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
		enterRule(_localctx, 122, RULE_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
			match(LPAREN);
			setState(684);
			expression();
			setState(689);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(685);
				match(COMMA);
				setState(686);
				expression();
				}
				}
				setState(691);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(692);
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
		enterRule(_localctx, 124, RULE_interval_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(694);
			match(INTERVAL);
			setState(695);
			expression();
			setState(696);
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
		enterRule(_localctx, 126, RULE_table_references);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			table_reference();
			setState(703);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(699);
				match(COMMA);
				setState(700);
				table_reference();
				}
				}
				setState(705);
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
		enterRule(_localctx, 128, RULE_table_reference);
		try {
			setState(708);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(706);
				table_factor1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(707);
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
		public TerminalNode JOIN() { return getToken(uniformSQLParser.JOIN, 0); }
		public Table_atomContext table_atom() {
			return getRuleContext(Table_atomContext.class,0);
		}
		public Join_conditionContext join_condition() {
			return getRuleContext(Join_conditionContext.class,0);
		}
		public TerminalNode INNER() { return getToken(uniformSQLParser.INNER, 0); }
		public TerminalNode CROSS() { return getToken(uniformSQLParser.CROSS, 0); }
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
		enterRule(_localctx, 130, RULE_table_factor1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(710);
			table_factor2();
			setState(719);
			_la = _input.LA(1);
			if (_la==JOIN || _la==CROSS || _la==INNER) {
				{
				setState(712);
				_la = _input.LA(1);
				if (_la==CROSS || _la==INNER) {
					{
					setState(711);
					_la = _input.LA(1);
					if ( !(_la==CROSS || _la==INNER) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(714);
				match(JOIN);
				setState(715);
				table_atom();
				setState(717);
				switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
				case 1:
					{
					setState(716);
					join_condition();
					}
					break;
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

	public static class Table_factor2Context extends ParserRuleContext {
		public Table_factor3Context table_factor3() {
			return getRuleContext(Table_factor3Context.class,0);
		}
		public TerminalNode STRAIGHT_JOIN() { return getToken(uniformSQLParser.STRAIGHT_JOIN, 0); }
		public Table_atomContext table_atom() {
			return getRuleContext(Table_atomContext.class,0);
		}
		public TerminalNode ON() { return getToken(uniformSQLParser.ON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 132, RULE_table_factor2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(721);
			table_factor3();
			setState(728);
			_la = _input.LA(1);
			if (_la==STRAIGHT_JOIN) {
				{
				setState(722);
				match(STRAIGHT_JOIN);
				setState(723);
				table_atom();
				setState(726);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(724);
					match(ON);
					setState(725);
					expression();
					}
					break;
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

	public static class Table_factor3Context extends ParserRuleContext {
		public List<Table_factor4Context> table_factor4() {
			return getRuleContexts(Table_factor4Context.class);
		}
		public Table_factor4Context table_factor4(int i) {
			return getRuleContext(Table_factor4Context.class,i);
		}
		public TerminalNode JOIN() { return getToken(uniformSQLParser.JOIN, 0); }
		public Join_conditionContext join_condition() {
			return getRuleContext(Join_conditionContext.class,0);
		}
		public TerminalNode LEFT() { return getToken(uniformSQLParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(uniformSQLParser.RIGHT, 0); }
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
		enterRule(_localctx, 134, RULE_table_factor3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(730);
			table_factor4();
			setState(739);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(731);
				_la = _input.LA(1);
				if ( !(_la==LEFT || _la==RIGHT) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(733);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(732);
					match(OUTER);
					}
				}

				setState(735);
				match(JOIN);
				setState(736);
				table_factor4();
				setState(737);
				join_condition();
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

	public static class Table_factor4Context extends ParserRuleContext {
		public List<Table_atomContext> table_atom() {
			return getRuleContexts(Table_atomContext.class);
		}
		public Table_atomContext table_atom(int i) {
			return getRuleContext(Table_atomContext.class,i);
		}
		public TerminalNode NATURAL() { return getToken(uniformSQLParser.NATURAL, 0); }
		public TerminalNode JOIN() { return getToken(uniformSQLParser.JOIN, 0); }
		public TerminalNode LEFT() { return getToken(uniformSQLParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(uniformSQLParser.RIGHT, 0); }
		public TerminalNode OUTER() { return getToken(uniformSQLParser.OUTER, 0); }
		public Table_factor4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_factor4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).enterTable_factor4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uniformSQLListener ) ((uniformSQLListener)listener).exitTable_factor4(this);
		}
	}

	public final Table_factor4Context table_factor4() throws RecognitionException {
		Table_factor4Context _localctx = new Table_factor4Context(_ctx, getState());
		enterRule(_localctx, 136, RULE_table_factor4);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(741);
			table_atom();
			setState(751);
			_la = _input.LA(1);
			if (_la==NATURAL) {
				{
				setState(742);
				match(NATURAL);
				setState(747);
				_la = _input.LA(1);
				if (_la==LEFT || _la==RIGHT) {
					{
					setState(743);
					_la = _input.LA(1);
					if ( !(_la==LEFT || _la==RIGHT) ) {
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

					}
				}

				setState(749);
				match(JOIN);
				setState(750);
				table_atom();
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

	public static class Table_atomContext extends ParserRuleContext {
		public Table_specContext table_spec() {
			return getRuleContext(Table_specContext.class,0);
		}
		public Partition_clauseContext partition_clause() {
			return getRuleContext(Partition_clauseContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public Index_hint_listContext index_hint_list() {
			return getRuleContext(Index_hint_listContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(uniformSQLParser.LPAREN, 0); }
		public Table_referencesContext table_references() {
			return getRuleContext(Table_referencesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(uniformSQLParser.RPAREN, 0); }
		public TerminalNode OJ() { return getToken(uniformSQLParser.OJ, 0); }
		public List<Table_referenceContext> table_reference() {
			return getRuleContexts(Table_referenceContext.class);
		}
		public Table_referenceContext table_reference(int i) {
			return getRuleContext(Table_referenceContext.class,i);
		}
		public TerminalNode LEFT() { return getToken(uniformSQLParser.LEFT, 0); }
		public TerminalNode OUTER() { return getToken(uniformSQLParser.OUTER, 0); }
		public TerminalNode JOIN() { return getToken(uniformSQLParser.JOIN, 0); }
		public TerminalNode ON() { return getToken(uniformSQLParser.ON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		enterRule(_localctx, 138, RULE_table_atom);
		int _la;
		try {
			setState(779);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(753);
				table_spec();
				setState(755);
				switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
				case 1:
					{
					setState(754);
					partition_clause();
					}
					break;
				}
				setState(758);
				_la = _input.LA(1);
				if (_la==AS || _la==ID) {
					{
					setState(757);
					alias();
					}
				}

				setState(761);
				_la = _input.LA(1);
				if (_la==IGNORE || _la==USE || _la==FORCE) {
					{
					setState(760);
					index_hint_list();
					}
				}

				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(763);
				subquery();
				setState(764);
				alias();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(766);
				match(LPAREN);
				setState(767);
				table_references();
				setState(768);
				match(RPAREN);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(770);
				match(OJ);
				setState(771);
				table_reference();
				setState(772);
				match(LEFT);
				setState(773);
				match(OUTER);
				setState(774);
				match(JOIN);
				setState(775);
				table_reference();
				setState(776);
				match(ON);
				setState(777);
				expression();
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

	public static class Join_conditionContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(uniformSQLParser.ON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode USING() { return getToken(uniformSQLParser.USING, 0); }
		public Column_listContext column_list() {
			return getRuleContext(Column_listContext.class,0);
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
		enterRule(_localctx, 140, RULE_join_condition);
		try {
			setState(785);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(781);
				match(ON);
				setState(782);
				expression();
				}
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(783);
				match(USING);
				setState(784);
				column_list();
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
		enterRule(_localctx, 142, RULE_index_hint_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(787);
			index_hint();
			setState(792);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(788);
					match(COMMA);
					setState(789);
					index_hint();
					}
					} 
				}
				setState(794);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
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
		enterRule(_localctx, 144, RULE_index_options);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
			_la = _input.LA(1);
			if ( !(_la==INDEX || _la==KEY) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(804);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(796);
				match(FOR);
				setState(802);
				switch (_input.LA(1)) {
				case JOIN:
					{
					{
					setState(797);
					match(JOIN);
					}
					}
					break;
				case ORDER:
					{
					{
					setState(798);
					match(ORDER);
					setState(799);
					match(BY);
					}
					}
					break;
				case GROUP:
					{
					{
					setState(800);
					match(GROUP);
					setState(801);
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
		public TerminalNode FORCE() { return getToken(uniformSQLParser.FORCE, 0); }
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
		enterRule(_localctx, 146, RULE_index_hint);
		int _la;
		try {
			setState(826);
			switch (_input.LA(1)) {
			case USE:
				enterOuterAlt(_localctx, 1);
				{
				setState(806);
				match(USE);
				setState(807);
				index_options();
				setState(808);
				match(LPAREN);
				setState(810);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(809);
					index_list();
					}
				}

				setState(812);
				match(RPAREN);
				}
				break;
			case IGNORE:
				enterOuterAlt(_localctx, 2);
				{
				setState(814);
				match(IGNORE);
				setState(815);
				index_options();
				setState(816);
				match(LPAREN);
				setState(817);
				index_list();
				setState(818);
				match(RPAREN);
				}
				break;
			case FORCE:
				enterOuterAlt(_localctx, 3);
				{
				setState(820);
				match(FORCE);
				setState(821);
				index_options();
				setState(822);
				match(LPAREN);
				setState(823);
				index_list();
				setState(824);
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
		enterRule(_localctx, 148, RULE_index_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(828);
			index_name();
			setState(833);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(829);
				match(COMMA);
				setState(830);
				index_name();
				}
				}
				setState(835);
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
		enterRule(_localctx, 150, RULE_partition_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(836);
			match(PARTITION);
			setState(837);
			match(LPAREN);
			setState(838);
			partition_names();
			setState(839);
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
		enterRule(_localctx, 152, RULE_partition_names);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(841);
			partition_name();
			setState(846);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(842);
					match(COMMA);
					setState(843);
					partition_name();
					}
					} 
				}
				setState(848);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
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
		public TerminalNode SHIFT_LEFT() { return getToken(uniformSQLParser.SHIFT_LEFT, 0); }
		public TerminalNode SHIFT_RIGHT() { return getToken(uniformSQLParser.SHIFT_RIGHT, 0); }
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
		enterRule(_localctx, 154, RULE_root_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(851);
			_la = _input.LA(1);
			if (_la==SHIFT_LEFT) {
				{
				setState(849);
				match(SHIFT_LEFT);
				setState(850);
				match(SHIFT_RIGHT);
				}
			}

			setState(855);
			switch (_input.LA(1)) {
			case SELECT:
				{
				setState(853);
				data_manipulation_statements();
				}
				break;
			case EOF:
			case SEMI:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(858);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(857);
				match(SEMI);
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

	public static class Data_manipulation_statementsContext extends ParserRuleContext {
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
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
		enterRule(_localctx, 156, RULE_data_manipulation_statements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(860);
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

	public static class Data_definition_statementsContext extends ParserRuleContext {
		public Create_database_statementContext create_database_statement() {
			return getRuleContext(Create_database_statementContext.class,0);
		}
		public Drop_database_statementContext drop_database_statement() {
			return getRuleContext(Drop_database_statementContext.class,0);
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
		enterRule(_localctx, 158, RULE_data_definition_statements);
		try {
			setState(864);
			switch (_input.LA(1)) {
			case CREATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(862);
				create_database_statement();
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 2);
				{
				setState(863);
				drop_database_statement();
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
		enterRule(_localctx, 160, RULE_select_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(866);
			select_expression();
			setState(874);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UNION) {
				{
				{
				{
				setState(867);
				match(UNION);
				setState(869);
				_la = _input.LA(1);
				if (_la==ALL) {
					{
					setState(868);
					match(ALL);
					}
				}

				}
				setState(871);
				select_expression();
				}
				}
				setState(876);
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
		public TerminalNode HIGH_PRIORITY() { return getToken(uniformSQLParser.HIGH_PRIORITY, 0); }
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
		public TerminalNode FOR() { return getToken(uniformSQLParser.FOR, 0); }
		public TerminalNode UPDATE() { return getToken(uniformSQLParser.UPDATE, 0); }
		public Partition_clauseContext partition_clause() {
			return getRuleContext(Partition_clauseContext.class,0);
		}
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
		enterRule(_localctx, 162, RULE_select_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(877);
			match(SELECT);
			setState(879);
			_la = _input.LA(1);
			if (_la==ALL || _la==DISTINCT) {
				{
				setState(878);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==DISTINCT) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(882);
			_la = _input.LA(1);
			if (_la==HIGH_PRIORITY) {
				{
				setState(881);
				match(HIGH_PRIORITY);
				}
			}

			setState(884);
			select_list();
			setState(899);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(885);
				match(FROM);
				setState(886);
				table_references();
				setState(888);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(887);
					partition_clause();
					}
				}

				setState(891);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(890);
					where_clause();
					}
				}

				setState(894);
				_la = _input.LA(1);
				if (_la==GROUP) {
					{
					setState(893);
					groupby_clause();
					}
				}

				setState(897);
				_la = _input.LA(1);
				if (_la==HAVING) {
					{
					setState(896);
					having_clause();
					}
				}

				}
			}

			setState(902);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(901);
				orderby_clause();
				}
			}

			setState(905);
			_la = _input.LA(1);
			if (_la==LIMIT || _la==INTEGER_NUM) {
				{
				setState(904);
				limit_clause();
				}
			}

			setState(909);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				{
				setState(907);
				match(FOR);
				setState(908);
				match(UPDATE);
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
		enterRule(_localctx, 164, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(911);
			match(WHERE);
			setState(912);
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
		enterRule(_localctx, 166, RULE_groupby_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(914);
			match(GROUP);
			setState(915);
			match(BY);
			setState(916);
			groupby_item();
			setState(921);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(917);
				match(COMMA);
				setState(918);
				groupby_item();
				}
				}
				setState(923);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(926);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				{
				setState(924);
				match(WITH);
				setState(925);
				match(ROLLUP);
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
		enterRule(_localctx, 168, RULE_groupby_item);
		try {
			setState(931);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(928);
				column_spec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(929);
				match(INTEGER_NUM);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(930);
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
		enterRule(_localctx, 170, RULE_having_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(933);
			match(HAVING);
			setState(934);
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
		enterRule(_localctx, 172, RULE_orderby_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(936);
			match(ORDER);
			setState(937);
			match(BY);
			setState(938);
			orderby_item();
			setState(943);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(939);
				match(COMMA);
				setState(940);
				orderby_item();
				}
				}
				setState(945);
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
		enterRule(_localctx, 174, RULE_orderby_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(946);
			groupby_item();
			setState(948);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(947);
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
		public TerminalNode OFFSET() { return getToken(uniformSQLParser.OFFSET, 0); }
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
		enterRule(_localctx, 176, RULE_limit_clause);
		try {
			setState(961);
			switch (_input.LA(1)) {
			case LIMIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(950);
				match(LIMIT);
				{
				setState(954);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					setState(951);
					offset();
					setState(952);
					match(COMMA);
					}
					break;
				}
				setState(956);
				row_count();
				}
				}
				break;
			case INTEGER_NUM:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(957);
				row_count();
				setState(958);
				match(OFFSET);
				setState(959);
				offset();
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
		enterRule(_localctx, 178, RULE_offset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(963);
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
		enterRule(_localctx, 180, RULE_row_count);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(965);
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
		public TerminalNode ASTERISK() { return getToken(uniformSQLParser.ASTERISK, 0); }
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
		enterRule(_localctx, 182, RULE_select_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(976);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case IF:
			case EXISTS:
			case INSERT:
			case LEFT:
			case RIGHT:
			case NULL:
			case DATE:
			case TIMESTAMP:
			case ROW:
			case FORMAT:
			case DEFAULT:
			case CAST:
			case REPLACE:
			case CASE:
			case DATABASE:
			case SCHEMA:
			case BINARY:
			case TRUNCATE:
			case USER:
			case MOD:
			case LPAREN:
			case PLUS:
			case MINUS:
			case NEGATION:
			case INTEGER_NUM:
			case HEX_DIGIT:
			case BIT_NUM:
			case REAL_NUMBER:
			case TEXT_STRING:
			case ID:
			case USER_VAR:
			case ASCII:
			case CHAR:
			case TIME:
			case SECOND:
			case MINUTE:
			case HOUR:
			case WEEK:
			case MONTH:
			case QUARTER:
			case YEAR:
			case ABS:
			case ACOS:
			case ASIN:
			case ATAN2:
			case ATAN:
			case CEIL:
			case CEILING:
			case CONV:
			case COS:
			case COT:
			case CRC32:
			case DEGREES:
			case EXP:
			case FLOOR:
			case LN:
			case LOG10:
			case LOG2:
			case LOG:
			case PI:
			case POW:
			case POWER:
			case RADIANS:
			case RAND:
			case ROUND:
			case SIGN:
			case SIN:
			case SQRT:
			case TAN:
			case BIN:
			case BIT_LENGTH:
			case CHAR_LENGTH:
			case CONCAT_WS:
			case CONCAT:
			case ELT:
			case EXPORT_SET:
			case FIELD:
			case FIND_IN_SET:
			case FROM_BASE64:
			case HEX:
			case INSTR:
			case LENGTH:
			case LOAD_FILE:
			case LOCATE:
			case LOWER:
			case LPAD:
			case LTRIM:
			case MAKE_SET:
			case MID:
			case OCT:
			case ORD:
			case QUOTE:
			case REPEAT:
			case REVERSE:
			case RPAD:
			case RTRIM:
			case SOUNDEX:
			case SPACE:
			case STRCMP:
			case SUBSTRING_INDEX:
			case SUBSTRING:
			case TO_BASE64:
			case TRIM:
			case UNHEX:
			case UPPER:
			case WEIGHT_STRING:
			case ADDDATE:
			case ADDTIME:
			case CONVERT_TZ:
			case CURDATE:
			case CURTIME:
			case DATE_ADD:
			case DATE_FORMAT:
			case DATE_SUB:
			case DATEDIFF:
			case DAYNAME:
			case DAYOFMONTH:
			case DAYOFWEEK:
			case DAYOFYEAR:
			case EXTRACT:
			case FROM_DAYS:
			case FROM_UNIXTIME:
			case GET_FORMAT:
			case LAST_DAY:
			case MAKEDATE:
			case MAKETIME:
			case MICROSECOND:
			case MONTHNAME:
			case NOW:
			case PERIOD_ADD:
			case PERIOD_DIFF:
			case SEC_TO_TIME:
			case STR_TO_DATE:
			case SUBTIME:
			case SYSDATE:
			case TIME_FORMAT:
			case TIME_TO_SEC:
			case TIMEDIFF:
			case TIMESTAMPADD:
			case TIMESTAMPDIFF:
			case TO_DAYS:
			case TO_SECONDS:
			case UNIX_TIMESTAMP:
			case UTC_DATE:
			case UTC_TIME:
			case UTC_TIMESTAMP:
			case WEEKDAY:
			case WEEKOFYEAR:
			case YEARWEEK:
			case IFNULL:
			case AES_ENCRYPT:
			case AES_DECRYPT:
			case DECODE:
			case ENCODE:
			case DES_DECRYPT:
			case DES_ENCRYPT:
			case ENCRYPT:
			case MD5:
			case OLD_PASSWORD:
			case PASSWORD:
			case BENCHMARK:
			case CHARSET:
			case COERCIBILITY:
			case COLLATION:
			case CONNECTION_ID:
			case CURRENT_USER:
			case SESSION_USER:
			case SYSTEM_USER:
			case VERSION:
			case FOUND_ROWS:
			case LAST_INSERT_ID:
			case GET_LOCK:
			case RELEASE_LOCK:
			case IS_FREE_LOCK:
			case IS_USED_LOCK:
			case MASTER_POS_WAIT:
			case INET_ATON:
			case INET_NTOA:
			case NAME_CONST:
			case SLEEP:
			case UUID:
			case VALUES:
			case AVG:
			case COUNT:
			case MAX:
			case MIN:
			case SUM:
			case BIT_AND:
			case BIT_OR:
			case BIT_XOR:
			case GROUP_CONCAT:
			case STD:
			case STDDEV:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case VAR_POP:
			case VAR_SAMP:
			case VARIANCE:
			case CONVERT:
			case MATCH:
			case INTERVAL:
				{
				{
				setState(967);
				displayed_column();
				setState(972);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(968);
					match(COMMA);
					setState(969);
					displayed_column();
					}
					}
					setState(974);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case ASTERISK:
				{
				setState(975);
				match(ASTERISK);
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
		enterRule(_localctx, 184, RULE_column_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(978);
			match(LPAREN);
			setState(979);
			column_spec();
			setState(984);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(980);
				match(COMMA);
				setState(981);
				column_spec();
				}
				}
				setState(986);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(987);
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
		enterRule(_localctx, 186, RULE_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(989);
			match(LPAREN);
			setState(990);
			select_statement();
			setState(991);
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
		enterRule(_localctx, 188, RULE_table_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(996);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				{
				setState(993);
				schema_name();
				setState(994);
				match(DOT);
				}
				break;
			}
			setState(998);
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
		public Table_specContext table_spec() {
			return getRuleContext(Table_specContext.class,0);
		}
		public TerminalNode DOT() { return getToken(uniformSQLParser.DOT, 0); }
		public TerminalNode ASTERISK() { return getToken(uniformSQLParser.ASTERISK, 0); }
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
		enterRule(_localctx, 190, RULE_displayed_column);
		int _la;
		try {
			setState(1012);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1000);
				table_spec();
				setState(1001);
				match(DOT);
				setState(1002);
				match(ASTERISK);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1004);
				column_spec();
				setState(1006);
				_la = _input.LA(1);
				if (_la==AS || _la==ID) {
					{
					setState(1005);
					alias();
					}
				}

				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(1008);
				bit_expr();
				setState(1010);
				_la = _input.LA(1);
				if (_la==AS || _la==ID) {
					{
					setState(1009);
					alias();
					}
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
		enterRule(_localctx, 192, RULE_insert_statements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1014);
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
		enterRule(_localctx, 194, RULE_insert_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1016);
			match(INSERT);
			setState(1018);
			_la = _input.LA(1);
			if (_la==HIGH_PRIORITY || _la==LOW_PRIORITY) {
				{
				setState(1017);
				_la = _input.LA(1);
				if ( !(_la==HIGH_PRIORITY || _la==LOW_PRIORITY) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(1021);
			_la = _input.LA(1);
			if (_la==IGNORE) {
				{
				setState(1020);
				match(IGNORE);
				}
			}

			setState(1024);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(1023);
				match(INTO);
				}
			}

			setState(1026);
			table_spec();
			setState(1028);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(1027);
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
		enterRule(_localctx, 196, RULE_insert_subfix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1030);
			match(ON);
			setState(1031);
			match(DUPLICATE);
			setState(1032);
			match(KEY);
			setState(1033);
			match(UPDATE);
			setState(1034);
			column_spec();
			setState(1035);
			match(EQ);
			setState(1036);
			expression();
			setState(1044);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1037);
				match(COMMA);
				setState(1038);
				column_spec();
				setState(1039);
				match(EQ);
				setState(1040);
				expression();
				}
				}
				setState(1046);
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
		enterRule(_localctx, 198, RULE_insert_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1047);
			insert_header();
			setState(1049);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1048);
				column_list();
				}
			}

			setState(1051);
			select_expression();
			setState(1053);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(1052);
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
		enterRule(_localctx, 200, RULE_value_list_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1055);
			_la = _input.LA(1);
			if ( !(_la==VALUES || _la==VALUE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1056);
			column_value_list();
			setState(1061);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1057);
				match(COMMA);
				setState(1058);
				column_value_list();
				}
				}
				setState(1063);
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
		enterRule(_localctx, 202, RULE_column_value_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1064);
			match(LPAREN);
			setState(1067);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
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
			setState(1076);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1069);
				match(COMMA);
				setState(1072);
				switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
				case 1:
					{
					setState(1070);
					bit_expr();
					}
					break;
				case 2:
					{
					setState(1071);
					match(DEFAULT);
					}
					break;
				}
				}
				}
				setState(1078);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1079);
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
		enterRule(_localctx, 204, RULE_set_columns_cluase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1081);
			match(SET);
			setState(1082);
			set_column_cluase();
			setState(1087);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1083);
				match(COMMA);
				setState(1084);
				set_column_cluase();
				}
				}
				setState(1089);
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
		enterRule(_localctx, 206, RULE_set_column_cluase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1090);
			column_spec();
			setState(1091);
			match(EQ);
			setState(1094);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				{
				setState(1092);
				expression();
				}
				break;
			case 2:
				{
				setState(1093);
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
		enterRule(_localctx, 208, RULE_create_database_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1096);
			match(CREATE);
			setState(1097);
			_la = _input.LA(1);
			if ( !(_la==DATABASE || _la==SCHEMA) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1101);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1098);
				match(IF);
				setState(1099);
				match(NOT);
				setState(1100);
				match(EXISTS);
				}
			}

			setState(1103);
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
		enterRule(_localctx, 210, RULE_drop_database_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1105);
			match(DROP);
			setState(1106);
			_la = _input.LA(1);
			if ( !(_la==DATABASE || _la==SCHEMA) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1109);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1107);
				match(IF);
				setState(1108);
				match(EXISTS);
				}
			}

			setState(1111);
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
		enterRule(_localctx, 212, RULE_create_table_statement);
		try {
			setState(1116);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1113);
				create_table_statement1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1114);
				create_table_statement2();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1115);
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
		public TerminalNode LPAREN() { return getToken(uniformSQLParser.LPAREN, 0); }
		public List<Create_definitionContext> create_definition() {
			return getRuleContexts(Create_definitionContext.class);
		}
		public Create_definitionContext create_definition(int i) {
			return getRuleContext(Create_definitionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(uniformSQLParser.RPAREN, 0); }
		public TerminalNode TEMPORARY() { return getToken(uniformSQLParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(uniformSQLParser.IF, 0); }
		public TerminalNode NOT() { return getToken(uniformSQLParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(uniformSQLParser.EXISTS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
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
		enterRule(_localctx, 214, RULE_create_table_statement1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1118);
			match(CREATE);
			setState(1120);
			_la = _input.LA(1);
			if (_la==TEMPORARY) {
				{
				setState(1119);
				match(TEMPORARY);
				}
			}

			setState(1122);
			match(TABLE);
			setState(1126);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1123);
				match(IF);
				setState(1124);
				match(NOT);
				setState(1125);
				match(EXISTS);
				}
			}

			setState(1128);
			table_name();
			setState(1129);
			match(LPAREN);
			setState(1130);
			create_definition();
			setState(1135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1131);
				match(COMMA);
				setState(1132);
				create_definition();
				}
				}
				setState(1137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1138);
			match(RPAREN);
			setState(1140);
			_la = _input.LA(1);
			if (_la==SELECT) {
				{
				setState(1139);
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
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(uniformSQLParser.TEMPORARY, 0); }
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
		enterRule(_localctx, 216, RULE_create_table_statement2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1142);
			match(CREATE);
			setState(1144);
			_la = _input.LA(1);
			if (_la==TEMPORARY) {
				{
				setState(1143);
				match(TEMPORARY);
				}
			}

			setState(1146);
			match(TABLE);
			setState(1150);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1147);
				match(IF);
				setState(1148);
				match(NOT);
				setState(1149);
				match(EXISTS);
				}
			}

			setState(1152);
			table_name();
			setState(1153);
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
		enterRule(_localctx, 218, RULE_create_table_statement3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1155);
			match(CREATE);
			setState(1157);
			_la = _input.LA(1);
			if (_la==TEMPORARY) {
				{
				setState(1156);
				match(TEMPORARY);
				}
			}

			setState(1159);
			match(TABLE);
			setState(1163);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1160);
				match(IF);
				setState(1161);
				match(NOT);
				setState(1162);
				match(EXISTS);
				}
			}

			setState(1165);
			table_name();
			setState(1173);
			switch (_input.LA(1)) {
			case LIKE:
				{
				{
				setState(1166);
				match(LIKE);
				setState(1167);
				table_name();
				}
				}
				break;
			case LPAREN:
				{
				{
				setState(1168);
				match(LPAREN);
				setState(1169);
				match(LIKE);
				setState(1170);
				table_name();
				setState(1171);
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
		public TerminalNode PRIMARY() { return getToken(uniformSQLParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(uniformSQLParser.KEY, 0); }
		public TerminalNode LPAREN() { return getToken(uniformSQLParser.LPAREN, 0); }
		public List<Index_column_nameContext> index_column_name() {
			return getRuleContexts(Index_column_nameContext.class);
		}
		public Index_column_nameContext index_column_name(int i) {
			return getRuleContext(Index_column_nameContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(uniformSQLParser.RPAREN, 0); }
		public TerminalNode CONSTRAINT() { return getToken(uniformSQLParser.CONSTRAINT, 0); }
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
		public Constraintbol_nameContext constraintbol_name() {
			return getRuleContext(Constraintbol_nameContext.class,0);
		}
		public TerminalNode INDEX() { return getToken(uniformSQLParser.INDEX, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode UNIQUE() { return getToken(uniformSQLParser.UNIQUE, 0); }
		public TerminalNode FULLTEXT() { return getToken(uniformSQLParser.FULLTEXT, 0); }
		public TerminalNode SPATIAL() { return getToken(uniformSQLParser.SPATIAL, 0); }
		public TerminalNode FOREIGN() { return getToken(uniformSQLParser.FOREIGN, 0); }
		public Reference_definitionContext reference_definition() {
			return getRuleContext(Reference_definitionContext.class,0);
		}
		public TerminalNode CHECK() { return getToken(uniformSQLParser.CHECK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 220, RULE_create_definition);
		int _la;
		try {
			setState(1311);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1175);
				column_name();
				setState(1176);
				column_definition();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1182);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(1178);
					match(CONSTRAINT);
					setState(1180);
					_la = _input.LA(1);
					if (_la==ID) {
						{
						setState(1179);
						constraintbol_name();
						}
					}

					}
				}

				setState(1184);
				match(PRIMARY);
				setState(1185);
				match(KEY);
				setState(1187);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(1186);
					index_type();
					}
				}

				setState(1189);
				match(LPAREN);
				setState(1190);
				index_column_name();
				setState(1195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1191);
					match(COMMA);
					setState(1192);
					index_column_name();
					}
					}
					setState(1197);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1198);
				match(RPAREN);
				setState(1202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==USING || _la==COMMENT || _la==WITH || _la==KEY_BLOCK_SIZE) {
					{
					{
					setState(1199);
					index_option();
					}
					}
					setState(1204);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(1205);
				_la = _input.LA(1);
				if ( !(_la==INDEX || _la==KEY) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1207);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(1206);
					index_name();
					}
				}

				setState(1210);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(1209);
					index_type();
					}
				}

				setState(1212);
				match(LPAREN);
				setState(1213);
				index_column_name();
				setState(1218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1214);
					match(COMMA);
					setState(1215);
					index_column_name();
					}
					}
					setState(1220);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1221);
				match(RPAREN);
				setState(1225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==USING || _la==COMMENT || _la==WITH || _la==KEY_BLOCK_SIZE) {
					{
					{
					setState(1222);
					index_option();
					}
					}
					setState(1227);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(1232);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(1228);
					match(CONSTRAINT);
					setState(1230);
					_la = _input.LA(1);
					if (_la==ID) {
						{
						setState(1229);
						constraintbol_name();
						}
					}

					}
				}

				setState(1234);
				match(UNIQUE);
				setState(1236);
				_la = _input.LA(1);
				if (_la==INDEX || _la==KEY) {
					{
					setState(1235);
					_la = _input.LA(1);
					if ( !(_la==INDEX || _la==KEY) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(1239);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(1238);
					index_name();
					}
				}

				setState(1242);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(1241);
					index_type();
					}
				}

				setState(1244);
				match(LPAREN);
				setState(1245);
				index_column_name();
				setState(1250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1246);
					match(COMMA);
					setState(1247);
					index_column_name();
					}
					}
					setState(1252);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1253);
				match(RPAREN);
				setState(1257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==USING || _la==COMMENT || _la==WITH || _la==KEY_BLOCK_SIZE) {
					{
					{
					setState(1254);
					index_option();
					}
					}
					setState(1259);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(1260);
				_la = _input.LA(1);
				if ( !(_la==FULLTEXT || _la==SPATIAL) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1262);
				_la = _input.LA(1);
				if (_la==INDEX || _la==KEY) {
					{
					setState(1261);
					_la = _input.LA(1);
					if ( !(_la==INDEX || _la==KEY) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(1265);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(1264);
					index_name();
					}
				}

				setState(1267);
				match(LPAREN);
				setState(1268);
				index_column_name();
				setState(1273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1269);
					match(COMMA);
					setState(1270);
					index_column_name();
					}
					}
					setState(1275);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1276);
				match(RPAREN);
				setState(1280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==USING || _la==COMMENT || _la==WITH || _la==KEY_BLOCK_SIZE) {
					{
					{
					setState(1277);
					index_option();
					}
					}
					setState(1282);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(1287);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(1283);
					match(CONSTRAINT);
					setState(1285);
					_la = _input.LA(1);
					if (_la==ID) {
						{
						setState(1284);
						constraintbol_name();
						}
					}

					}
				}

				setState(1289);
				match(FOREIGN);
				setState(1290);
				match(KEY);
				setState(1292);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(1291);
					index_name();
					}
				}

				setState(1294);
				match(LPAREN);
				setState(1295);
				index_column_name();
				setState(1300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1296);
					match(COMMA);
					setState(1297);
					index_column_name();
					}
					}
					setState(1302);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1303);
				match(RPAREN);
				setState(1304);
				reference_definition();
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(1306);
				match(CHECK);
				setState(1307);
				match(LPAREN);
				setState(1308);
				expression();
				setState(1309);
				match(RPAREN);
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
		public TerminalNode AUTO_INCREMENT() { return getToken(uniformSQLParser.AUTO_INCREMENT, 0); }
		public TerminalNode COMMENT() { return getToken(uniformSQLParser.COMMENT, 0); }
		public TerminalNode TEXT_STRING() { return getToken(uniformSQLParser.TEXT_STRING, 0); }
		public TerminalNode COLUMN_FORMAT() { return getToken(uniformSQLParser.COLUMN_FORMAT, 0); }
		public Reference_definitionContext reference_definition() {
			return getRuleContext(Reference_definitionContext.class,0);
		}
		public TerminalNode FIXED() { return getToken(uniformSQLParser.FIXED, 0); }
		public TerminalNode DYNAMIC() { return getToken(uniformSQLParser.DYNAMIC, 0); }
		public TerminalNode DEFAULT() { return getToken(uniformSQLParser.DEFAULT, 0); }
		public TerminalNode UNIQUE() { return getToken(uniformSQLParser.UNIQUE, 0); }
		public TerminalNode PRIMARY() { return getToken(uniformSQLParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(uniformSQLParser.KEY, 0); }
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
		enterRule(_localctx, 222, RULE_column_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1313);
			column_data_type_header();
			setState(1315);
			_la = _input.LA(1);
			if (_la==AUTO_INCREMENT) {
				{
				setState(1314);
				match(AUTO_INCREMENT);
				}
			}

			setState(1325);
			switch (_input.LA(1)) {
			case UNIQUE:
				{
				{
				setState(1317);
				match(UNIQUE);
				setState(1319);
				_la = _input.LA(1);
				if (_la==KEY) {
					{
					setState(1318);
					match(KEY);
					}
				}

				}
				}
				break;
			case PRIMARY:
				{
				{
				setState(1321);
				match(PRIMARY);
				setState(1323);
				_la = _input.LA(1);
				if (_la==KEY) {
					{
					setState(1322);
					match(KEY);
					}
				}

				}
				}
				break;
			case EOF:
			case FIRST:
			case AFTER:
			case COMMENT:
			case COMMA:
			case RPAREN:
			case COLUMN_FORMAT:
			case REFERENCES:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1329);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(1327);
				match(COMMENT);
				setState(1328);
				match(TEXT_STRING);
				}
			}

			setState(1333);
			_la = _input.LA(1);
			if (_la==COLUMN_FORMAT) {
				{
				setState(1331);
				match(COLUMN_FORMAT);
				setState(1332);
				_la = _input.LA(1);
				if ( !(_la==DEFAULT || _la==FIXED || _la==DYNAMIC) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(1336);
			_la = _input.LA(1);
			if (_la==REFERENCES) {
				{
				setState(1335);
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
		enterRule(_localctx, 224, RULE_null_or_notnull);
		try {
			setState(1341);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1338);
				match(NOT);
				setState(1339);
				match(NULL);
				}
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1340);
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
		public TerminalNode BIT() { return getToken(uniformSQLParser.BIT, 0); }
		public TerminalNode LPAREN() { return getToken(uniformSQLParser.LPAREN, 0); }
		public LengthContext length() {
			return getRuleContext(LengthContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(uniformSQLParser.RPAREN, 0); }
		public Null_or_notnullContext null_or_notnull() {
			return getRuleContext(Null_or_notnullContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(uniformSQLParser.DEFAULT, 0); }
		public Bit_literalContext bit_literal() {
			return getRuleContext(Bit_literalContext.class,0);
		}
		public TerminalNode TINYINT() { return getToken(uniformSQLParser.TINYINT, 0); }
		public TerminalNode UNSIGNED() { return getToken(uniformSQLParser.UNSIGNED, 0); }
		public List<Number_literalContext> number_literal() {
			return getRuleContexts(Number_literalContext.class);
		}
		public Number_literalContext number_literal(int i) {
			return getRuleContext(Number_literalContext.class,i);
		}
		public TerminalNode SMALLINT() { return getToken(uniformSQLParser.SMALLINT, 0); }
		public TerminalNode MEDIUMINT() { return getToken(uniformSQLParser.MEDIUMINT, 0); }
		public TerminalNode INT() { return getToken(uniformSQLParser.INT, 0); }
		public TerminalNode INTEGER() { return getToken(uniformSQLParser.INTEGER, 0); }
		public TerminalNode BIGINT() { return getToken(uniformSQLParser.BIGINT, 0); }
		public TerminalNode DOUBLE() { return getToken(uniformSQLParser.DOUBLE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public TerminalNode FLOAT() { return getToken(uniformSQLParser.FLOAT, 0); }
		public TerminalNode DECIMAL() { return getToken(uniformSQLParser.DECIMAL, 0); }
		public TerminalNode DATE() { return getToken(uniformSQLParser.DATE, 0); }
		public List<TerminalNode> TEXT_STRING() { return getTokens(uniformSQLParser.TEXT_STRING); }
		public TerminalNode TEXT_STRING(int i) {
			return getToken(uniformSQLParser.TEXT_STRING, i);
		}
		public TerminalNode TIME() { return getToken(uniformSQLParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(uniformSQLParser.TIMESTAMP, 0); }
		public TerminalNode DATETIME() { return getToken(uniformSQLParser.DATETIME, 0); }
		public TerminalNode CHAR() { return getToken(uniformSQLParser.CHAR, 0); }
		public TerminalNode CHARACTER() { return getToken(uniformSQLParser.CHARACTER, 0); }
		public List<TerminalNode> SET() { return getTokens(uniformSQLParser.SET); }
		public TerminalNode SET(int i) {
			return getToken(uniformSQLParser.SET, i);
		}
		public Charset_nameContext charset_name() {
			return getRuleContext(Charset_nameContext.class,0);
		}
		public TerminalNode VARCHAR() { return getToken(uniformSQLParser.VARCHAR, 0); }
		public TerminalNode BINARY() { return getToken(uniformSQLParser.BINARY, 0); }
		public TerminalNode VARBINARY() { return getToken(uniformSQLParser.VARBINARY, 0); }
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
		enterRule(_localctx, 226, RULE_column_data_type_header);
		int _la;
		try {
			setState(1633);
			switch (_input.LA(1)) {
			case BIT:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1343);
				match(BIT);
				setState(1348);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1344);
					match(LPAREN);
					setState(1345);
					length();
					setState(1346);
					match(RPAREN);
					}
				}

				setState(1351);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1350);
					null_or_notnull();
					}
				}

				setState(1355);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1353);
					match(DEFAULT);
					setState(1354);
					bit_literal();
					}
				}

				}
				}
				break;
			case TINYINT:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1357);
				match(TINYINT);
				setState(1362);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1358);
					match(LPAREN);
					setState(1359);
					length();
					setState(1360);
					match(RPAREN);
					}
				}

				setState(1365);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(1364);
					match(UNSIGNED);
					}
				}

				setState(1368);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1367);
					null_or_notnull();
					}
				}

				setState(1372);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1370);
					match(DEFAULT);
					setState(1371);
					number_literal();
					}
				}

				}
				}
				break;
			case SMALLINT:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(1374);
				match(SMALLINT);
				setState(1379);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1375);
					match(LPAREN);
					setState(1376);
					length();
					setState(1377);
					match(RPAREN);
					}
				}

				setState(1382);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(1381);
					match(UNSIGNED);
					}
				}

				setState(1385);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1384);
					null_or_notnull();
					}
				}

				setState(1389);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1387);
					match(DEFAULT);
					setState(1388);
					number_literal();
					}
				}

				}
				}
				break;
			case MEDIUMINT:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(1391);
				match(MEDIUMINT);
				setState(1396);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1392);
					match(LPAREN);
					setState(1393);
					length();
					setState(1394);
					match(RPAREN);
					}
				}

				setState(1399);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(1398);
					match(UNSIGNED);
					}
				}

				setState(1402);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1401);
					null_or_notnull();
					}
				}

				setState(1406);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1404);
					match(DEFAULT);
					setState(1405);
					number_literal();
					}
				}

				}
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(1408);
				match(INT);
				setState(1413);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1409);
					match(LPAREN);
					setState(1410);
					length();
					setState(1411);
					match(RPAREN);
					}
				}

				setState(1416);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(1415);
					match(UNSIGNED);
					}
				}

				setState(1419);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1418);
					null_or_notnull();
					}
				}

				setState(1423);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1421);
					match(DEFAULT);
					setState(1422);
					number_literal();
					}
				}

				}
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(1425);
				match(INTEGER);
				setState(1430);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1426);
					match(LPAREN);
					setState(1427);
					length();
					setState(1428);
					match(RPAREN);
					}
				}

				setState(1433);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(1432);
					match(UNSIGNED);
					}
				}

				setState(1436);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1435);
					null_or_notnull();
					}
				}

				setState(1440);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1438);
					match(DEFAULT);
					setState(1439);
					number_literal();
					}
				}

				}
				}
				break;
			case BIGINT:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(1442);
				match(BIGINT);
				setState(1447);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1443);
					match(LPAREN);
					setState(1444);
					length();
					setState(1445);
					match(RPAREN);
					}
				}

				setState(1450);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(1449);
					match(UNSIGNED);
					}
				}

				setState(1453);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1452);
					null_or_notnull();
					}
				}

				setState(1457);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1455);
					match(DEFAULT);
					setState(1456);
					number_literal();
					}
				}

				}
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(1459);
				match(DOUBLE);
				setState(1466);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1460);
					match(LPAREN);
					setState(1461);
					length();
					setState(1462);
					match(COMMA);
					setState(1463);
					number_literal();
					setState(1464);
					match(RPAREN);
					}
				}

				setState(1469);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(1468);
					match(UNSIGNED);
					}
				}

				setState(1472);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1471);
					null_or_notnull();
					}
				}

				setState(1476);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1474);
					match(DEFAULT);
					setState(1475);
					number_literal();
					}
				}

				}
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 9);
				{
				{
				setState(1478);
				match(FLOAT);
				setState(1485);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1479);
					match(LPAREN);
					setState(1480);
					length();
					setState(1481);
					match(COMMA);
					setState(1482);
					number_literal();
					setState(1483);
					match(RPAREN);
					}
				}

				setState(1488);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(1487);
					match(UNSIGNED);
					}
				}

				setState(1491);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1490);
					null_or_notnull();
					}
				}

				setState(1495);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1493);
					match(DEFAULT);
					setState(1494);
					number_literal();
					}
				}

				}
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 10);
				{
				{
				setState(1497);
				match(DECIMAL);
				setState(1506);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1498);
					match(LPAREN);
					setState(1499);
					length();
					setState(1502);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(1500);
						match(COMMA);
						setState(1501);
						number_literal();
						}
					}

					setState(1504);
					match(RPAREN);
					}
				}

				setState(1509);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(1508);
					match(UNSIGNED);
					}
				}

				setState(1512);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1511);
					null_or_notnull();
					}
				}

				setState(1516);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1514);
					match(DEFAULT);
					setState(1515);
					number_literal();
					}
				}

				}
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 11);
				{
				{
				setState(1518);
				match(DATE);
				setState(1520);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1519);
					null_or_notnull();
					}
				}

				setState(1524);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1522);
					match(DEFAULT);
					setState(1523);
					match(TEXT_STRING);
					}
				}

				}
				}
				break;
			case TIME:
				enterOuterAlt(_localctx, 12);
				{
				{
				setState(1526);
				match(TIME);
				setState(1528);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1527);
					null_or_notnull();
					}
				}

				setState(1532);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1530);
					match(DEFAULT);
					setState(1531);
					match(TEXT_STRING);
					}
				}

				}
				}
				break;
			case TIMESTAMP:
				enterOuterAlt(_localctx, 13);
				{
				{
				setState(1534);
				match(TIMESTAMP);
				setState(1536);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1535);
					null_or_notnull();
					}
				}

				setState(1540);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1538);
					match(DEFAULT);
					setState(1539);
					match(TEXT_STRING);
					}
				}

				}
				}
				break;
			case DATETIME:
				enterOuterAlt(_localctx, 14);
				{
				{
				setState(1542);
				match(DATETIME);
				setState(1544);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1543);
					null_or_notnull();
					}
				}

				setState(1548);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1546);
					match(DEFAULT);
					setState(1547);
					match(TEXT_STRING);
					}
				}

				}
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 15);
				{
				{
				setState(1550);
				match(CHAR);
				setState(1555);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1551);
					match(LPAREN);
					setState(1552);
					length();
					setState(1553);
					match(RPAREN);
					}
				}

				setState(1560);
				_la = _input.LA(1);
				if (_la==CHARACTER) {
					{
					setState(1557);
					match(CHARACTER);
					setState(1558);
					match(SET);
					setState(1559);
					charset_name();
					}
				}

				setState(1563);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1562);
					null_or_notnull();
					}
				}

				setState(1567);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1565);
					match(DEFAULT);
					setState(1566);
					match(TEXT_STRING);
					}
				}

				}
				}
				break;
			case VARCHAR:
				enterOuterAlt(_localctx, 16);
				{
				{
				setState(1569);
				match(VARCHAR);
				setState(1570);
				match(LPAREN);
				setState(1571);
				length();
				setState(1572);
				match(RPAREN);
				setState(1576);
				_la = _input.LA(1);
				if (_la==CHARACTER) {
					{
					setState(1573);
					match(CHARACTER);
					setState(1574);
					match(SET);
					setState(1575);
					charset_name();
					}
				}

				setState(1579);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1578);
					null_or_notnull();
					}
				}

				setState(1583);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1581);
					match(DEFAULT);
					setState(1582);
					match(TEXT_STRING);
					}
				}

				}
				}
				break;
			case BINARY:
				enterOuterAlt(_localctx, 17);
				{
				{
				setState(1585);
				match(BINARY);
				setState(1590);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1586);
					match(LPAREN);
					setState(1587);
					length();
					setState(1588);
					match(RPAREN);
					}
				}

				setState(1593);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1592);
					null_or_notnull();
					}
				}

				setState(1597);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1595);
					match(DEFAULT);
					setState(1596);
					match(TEXT_STRING);
					}
				}

				}
				}
				break;
			case VARBINARY:
				enterOuterAlt(_localctx, 18);
				{
				{
				setState(1599);
				match(VARBINARY);
				setState(1600);
				match(LPAREN);
				setState(1601);
				length();
				setState(1602);
				match(RPAREN);
				setState(1604);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1603);
					null_or_notnull();
					}
				}

				setState(1608);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1606);
					match(DEFAULT);
					setState(1607);
					match(TEXT_STRING);
					}
				}

				}
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 19);
				{
				{
				setState(1610);
				match(SET);
				setState(1611);
				match(LPAREN);
				setState(1612);
				match(TEXT_STRING);
				setState(1617);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1613);
					match(COMMA);
					setState(1614);
					match(TEXT_STRING);
					}
					}
					setState(1619);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1620);
				match(RPAREN);
				setState(1624);
				_la = _input.LA(1);
				if (_la==CHARACTER) {
					{
					setState(1621);
					match(CHARACTER);
					setState(1622);
					match(SET);
					setState(1623);
					charset_name();
					}
				}

				setState(1627);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1626);
					null_or_notnull();
					}
				}

				setState(1631);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1629);
					match(DEFAULT);
					setState(1630);
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
		enterRule(_localctx, 228, RULE_index_column_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1635);
			column_name();
			setState(1639);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1636);
				match(LPAREN);
				setState(1637);
				match(INTEGER_NUM);
				setState(1638);
				match(RPAREN);
				}
			}

			setState(1642);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1641);
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
		public TerminalNode MATCH() { return getToken(uniformSQLParser.MATCH, 0); }
		public TerminalNode FULL() { return getToken(uniformSQLParser.FULL, 0); }
		public TerminalNode PARTIAL() { return getToken(uniformSQLParser.PARTIAL, 0); }
		public TerminalNode SIMPLE() { return getToken(uniformSQLParser.SIMPLE, 0); }
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
		enterRule(_localctx, 230, RULE_reference_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1644);
			match(REFERENCES);
			setState(1645);
			table_name();
			setState(1646);
			match(LPAREN);
			setState(1647);
			index_column_name();
			setState(1652);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1648);
				match(COMMA);
				setState(1649);
				index_column_name();
				}
				}
				setState(1654);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1655);
			match(RPAREN);
			setState(1662);
			switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
			case 1:
				{
				{
				setState(1656);
				match(MATCH);
				setState(1657);
				match(FULL);
				}
				}
				break;
			case 2:
				{
				{
				setState(1658);
				match(MATCH);
				setState(1659);
				match(PARTIAL);
				}
				}
				break;
			case 3:
				{
				{
				setState(1660);
				match(MATCH);
				setState(1661);
				match(SIMPLE);
				}
				}
				break;
			}
			setState(1667);
			switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
			case 1:
				{
				setState(1664);
				match(ON);
				setState(1665);
				match(DELETE);
				setState(1666);
				reference_option();
				}
				break;
			}
			setState(1672);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(1669);
				match(ON);
				setState(1670);
				match(UPDATE);
				setState(1671);
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
		public TerminalNode NO() { return getToken(uniformSQLParser.NO, 0); }
		public TerminalNode ACTION() { return getToken(uniformSQLParser.ACTION, 0); }
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
		enterRule(_localctx, 232, RULE_reference_option);
		try {
			setState(1680);
			switch (_input.LA(1)) {
			case RESTRICT:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1674);
				match(RESTRICT);
				}
				}
				break;
			case CASCADE:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1675);
				match(CASCADE);
				}
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(1676);
				match(SET);
				setState(1677);
				match(NULL);
				}
				}
				break;
			case NO:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(1678);
				match(NO);
				setState(1679);
				match(ACTION);
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
		enterRule(_localctx, 234, RULE_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1682);
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
		public TerminalNode IGNORE() { return getToken(uniformSQLParser.IGNORE, 0); }
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
		enterRule(_localctx, 236, RULE_alter_table_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1684);
			match(ALTER);
			setState(1686);
			_la = _input.LA(1);
			if (_la==IGNORE) {
				{
				setState(1685);
				match(IGNORE);
				}
			}

			setState(1688);
			match(TABLE);
			setState(1689);
			table_name();
			setState(1698);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ORDER) | (1L << ALTER) | (1L << CHANGE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DROP - 64)) | (1L << (RENAME - 64)) | (1L << (ADD - 64)))) != 0) || _la==TRUNCATE) {
				{
				setState(1690);
				alter_table_specification();
				setState(1695);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1691);
					match(COMMA);
					setState(1692);
					alter_table_specification();
					}
					}
					setState(1697);
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
		public TerminalNode ADD() { return getToken(uniformSQLParser.ADD, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Column_definitionContext column_definition() {
			return getRuleContext(Column_definitionContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(uniformSQLParser.COLUMN, 0); }
		public TerminalNode FIRST() { return getToken(uniformSQLParser.FIRST, 0); }
		public TerminalNode AFTER() { return getToken(uniformSQLParser.AFTER, 0); }
		public TerminalNode LPAREN() { return getToken(uniformSQLParser.LPAREN, 0); }
		public Column_definitionsContext column_definitions() {
			return getRuleContext(Column_definitionsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(uniformSQLParser.RPAREN, 0); }
		public Index_column_namesContext index_column_names() {
			return getRuleContext(Index_column_namesContext.class,0);
		}
		public TerminalNode INDEX() { return getToken(uniformSQLParser.INDEX, 0); }
		public TerminalNode KEY() { return getToken(uniformSQLParser.KEY, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public Index_typeContext index_type() {
			return getRuleContext(Index_typeContext.class,0);
		}
		public List<Index_optionContext> index_option() {
			return getRuleContexts(Index_optionContext.class);
		}
		public Index_optionContext index_option(int i) {
			return getRuleContext(Index_optionContext.class,i);
		}
		public TerminalNode PRIMARY() { return getToken(uniformSQLParser.PRIMARY, 0); }
		public TerminalNode CONSTRAINT() { return getToken(uniformSQLParser.CONSTRAINT, 0); }
		public Constraintbol_nameContext constraintbol_name() {
			return getRuleContext(Constraintbol_nameContext.class,0);
		}
		public TerminalNode UNIQUE() { return getToken(uniformSQLParser.UNIQUE, 0); }
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
		public TerminalNode FOREIGN() { return getToken(uniformSQLParser.FOREIGN, 0); }
		public Reference_definitionContext reference_definition() {
			return getRuleContext(Reference_definitionContext.class,0);
		}
		public TerminalNode ALTER() { return getToken(uniformSQLParser.ALTER, 0); }
		public TerminalNode SET() { return getToken(uniformSQLParser.SET, 0); }
		public TerminalNode DEFAULT() { return getToken(uniformSQLParser.DEFAULT, 0); }
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public TerminalNode DROP() { return getToken(uniformSQLParser.DROP, 0); }
		public TerminalNode CHANGE() { return getToken(uniformSQLParser.CHANGE, 0); }
		public TerminalNode RENAME() { return getToken(uniformSQLParser.RENAME, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode TO() { return getToken(uniformSQLParser.TO, 0); }
		public TerminalNode AS() { return getToken(uniformSQLParser.AS, 0); }
		public TerminalNode ORDER() { return getToken(uniformSQLParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(uniformSQLParser.BY, 0); }
		public TerminalNode PARTITION() { return getToken(uniformSQLParser.PARTITION, 0); }
		public Partition_namesContext partition_names() {
			return getRuleContext(Partition_namesContext.class,0);
		}
		public TerminalNode TRUNCATE() { return getToken(uniformSQLParser.TRUNCATE, 0); }
		public TerminalNode ALL() { return getToken(uniformSQLParser.ALL, 0); }
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
		enterRule(_localctx, 238, RULE_alter_table_specification);
		int _la;
		try {
			int _alt;
			setState(1859);
			switch ( getInterpreter().adaptivePredict(_input,269,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1700);
				match(ADD);
				setState(1702);
				_la = _input.LA(1);
				if (_la==COLUMN) {
					{
					setState(1701);
					match(COLUMN);
					}
				}

				setState(1704);
				column_name();
				setState(1705);
				column_definition();
				setState(1708);
				_la = _input.LA(1);
				if (_la==FIRST || _la==AFTER) {
					{
					setState(1706);
					_la = _input.LA(1);
					if ( !(_la==FIRST || _la==AFTER) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(1707);
					column_name();
					}
				}

				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1710);
				match(ADD);
				setState(1712);
				_la = _input.LA(1);
				if (_la==COLUMN) {
					{
					setState(1711);
					match(COLUMN);
					}
				}

				setState(1714);
				match(LPAREN);
				setState(1715);
				column_definitions();
				setState(1716);
				match(RPAREN);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(1718);
				match(ADD);
				setState(1719);
				_la = _input.LA(1);
				if ( !(_la==INDEX || _la==KEY) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1721);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(1720);
					index_name();
					}
				}

				setState(1724);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(1723);
					index_type();
					}
				}

				setState(1726);
				match(LPAREN);
				setState(1727);
				index_column_names();
				setState(1728);
				match(RPAREN);
				setState(1732);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==USING || _la==COMMENT || _la==WITH || _la==KEY_BLOCK_SIZE) {
					{
					{
					setState(1729);
					index_option();
					}
					}
					setState(1734);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(1735);
				match(ADD);
				setState(1740);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(1736);
					match(CONSTRAINT);
					setState(1738);
					_la = _input.LA(1);
					if (_la==ID) {
						{
						setState(1737);
						constraintbol_name();
						}
					}

					}
				}

				setState(1742);
				match(PRIMARY);
				setState(1743);
				match(KEY);
				setState(1745);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(1744);
					index_type();
					}
				}

				setState(1747);
				match(LPAREN);
				setState(1748);
				index_column_names();
				setState(1749);
				match(RPAREN);
				setState(1753);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==USING || _la==COMMENT || _la==WITH || _la==KEY_BLOCK_SIZE) {
					{
					{
					setState(1750);
					index_option();
					}
					}
					setState(1755);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(1756);
				match(ADD);
				setState(1761);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(1757);
					match(CONSTRAINT);
					setState(1759);
					_la = _input.LA(1);
					if (_la==ID) {
						{
						setState(1758);
						constraintbol_name();
						}
					}

					}
				}

				setState(1763);
				match(UNIQUE);
				setState(1765);
				_la = _input.LA(1);
				if (_la==INDEX || _la==KEY) {
					{
					setState(1764);
					_la = _input.LA(1);
					if ( !(_la==INDEX || _la==KEY) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(1768);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(1767);
					index_name();
					}
				}

				setState(1771);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(1770);
					index_type();
					}
				}

				setState(1773);
				match(LPAREN);
				setState(1774);
				index_column_name();
				setState(1779);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1775);
					match(COMMA);
					setState(1776);
					index_column_name();
					}
					}
					setState(1781);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1782);
				match(RPAREN);
				setState(1786);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==USING || _la==COMMENT || _la==WITH || _la==KEY_BLOCK_SIZE) {
					{
					{
					setState(1783);
					index_option();
					}
					}
					setState(1788);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(1789);
				match(ADD);
				setState(1794);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(1790);
					match(CONSTRAINT);
					setState(1792);
					_la = _input.LA(1);
					if (_la==ID) {
						{
						setState(1791);
						constraintbol_name();
						}
					}

					}
				}

				setState(1796);
				match(FOREIGN);
				setState(1797);
				match(KEY);
				setState(1799);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(1798);
					index_name();
					}
				}

				setState(1801);
				match(LPAREN);
				setState(1802);
				index_column_names();
				setState(1803);
				match(RPAREN);
				setState(1804);
				reference_definition();
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(1806);
				match(ALTER);
				setState(1808);
				_la = _input.LA(1);
				if (_la==COLUMN) {
					{
					setState(1807);
					match(COLUMN);
					}
				}

				setState(1810);
				column_name();
				setState(1816);
				switch (_input.LA(1)) {
				case SET:
					{
					{
					setState(1811);
					match(SET);
					setState(1812);
					match(DEFAULT);
					setState(1813);
					literal_value();
					}
					}
					break;
				case DROP:
					{
					{
					setState(1814);
					match(DROP);
					setState(1815);
					match(DEFAULT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(1818);
				match(CHANGE);
				setState(1820);
				_la = _input.LA(1);
				if (_la==COLUMN) {
					{
					setState(1819);
					match(COLUMN);
					}
				}

				setState(1822);
				column_name();
				setState(1823);
				column_name();
				setState(1824);
				column_definition();
				setState(1828);
				switch (_input.LA(1)) {
				case FIRST:
					{
					setState(1825);
					match(FIRST);
					}
					break;
				case AFTER:
					{
					setState(1826);
					match(AFTER);
					setState(1827);
					column_name();
					}
					break;
				case EOF:
				case COMMA:
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				{
				setState(1830);
				match(DROP);
				setState(1832);
				_la = _input.LA(1);
				if (_la==COLUMN) {
					{
					setState(1831);
					match(COLUMN);
					}
				}

				setState(1834);
				column_name();
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				{
				setState(1835);
				match(RENAME);
				setState(1837);
				_la = _input.LA(1);
				if (_la==AS || _la==TO) {
					{
					setState(1836);
					_la = _input.LA(1);
					if ( !(_la==AS || _la==TO) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(1839);
				table_name();
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				{
				setState(1840);
				match(ORDER);
				setState(1841);
				match(BY);
				setState(1842);
				column_name();
				setState(1847);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,267,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1843);
						match(COMMA);
						setState(1844);
						column_name();
						}
						} 
					}
					setState(1849);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,267,_ctx);
				}
				}
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				{
				setState(1850);
				match(DROP);
				setState(1851);
				match(PARTITION);
				setState(1852);
				partition_names();
				}
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				{
				setState(1853);
				match(TRUNCATE);
				setState(1854);
				match(PARTITION);
				setState(1857);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(1855);
					partition_names();
					}
					break;
				case ALL:
					{
					setState(1856);
					match(ALL);
					}
					break;
				default:
					throw new NoViableAltException(this);
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
		enterRule(_localctx, 240, RULE_index_column_names);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1861);
			index_column_name();
			setState(1866);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1862);
				match(COMMA);
				setState(1863);
				index_column_name();
				}
				}
				setState(1868);
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
		public TerminalNode BTREE() { return getToken(uniformSQLParser.BTREE, 0); }
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
		enterRule(_localctx, 242, RULE_index_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1869);
			match(USING);
			setState(1870);
			_la = _input.LA(1);
			if ( !(_la==BTREE || _la==HASH) ) {
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

	public static class Index_optionContext extends ParserRuleContext {
		public TerminalNode KEY_BLOCK_SIZE() { return getToken(uniformSQLParser.KEY_BLOCK_SIZE, 0); }
		public TerminalNode INTEGER_NUM() { return getToken(uniformSQLParser.INTEGER_NUM, 0); }
		public TerminalNode EQ() { return getToken(uniformSQLParser.EQ, 0); }
		public Index_typeContext index_type() {
			return getRuleContext(Index_typeContext.class,0);
		}
		public TerminalNode WITH() { return getToken(uniformSQLParser.WITH, 0); }
		public TerminalNode PARSER() { return getToken(uniformSQLParser.PARSER, 0); }
		public Parser_nameContext parser_name() {
			return getRuleContext(Parser_nameContext.class,0);
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
		enterRule(_localctx, 244, RULE_index_option);
		int _la;
		try {
			setState(1883);
			switch (_input.LA(1)) {
			case KEY_BLOCK_SIZE:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1872);
				match(KEY_BLOCK_SIZE);
				setState(1874);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(1873);
					match(EQ);
					}
				}

				setState(1876);
				match(INTEGER_NUM);
				}
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1877);
				index_type();
				}
				break;
			case WITH:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(1878);
				match(WITH);
				setState(1879);
				match(PARSER);
				setState(1880);
				parser_name();
				}
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(1881);
				match(COMMENT);
				setState(1882);
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
		enterRule(_localctx, 246, RULE_column_definitions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1885);
			column_name();
			setState(1886);
			column_definition();
			setState(1893);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1887);
				match(COMMA);
				setState(1888);
				column_name();
				setState(1889);
				column_definition();
				}
				}
				setState(1895);
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
		enterRule(_localctx, 248, RULE_rename_table_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1896);
			match(RENAME);
			setState(1897);
			match(TABLE);
			setState(1898);
			table_name();
			setState(1899);
			match(TO);
			setState(1900);
			table_name();
			setState(1908);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1901);
				match(COMMA);
				setState(1902);
				table_name();
				setState(1903);
				match(TO);
				setState(1904);
				table_name();
				}
				}
				setState(1910);
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
		public List<Table_nameContext> table_name() {
			return getRuleContexts(Table_nameContext.class);
		}
		public Table_nameContext table_name(int i) {
			return getRuleContext(Table_nameContext.class,i);
		}
		public TerminalNode TEMPORARY() { return getToken(uniformSQLParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(uniformSQLParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(uniformSQLParser.EXISTS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public TerminalNode RESTRICT() { return getToken(uniformSQLParser.RESTRICT, 0); }
		public TerminalNode CASCADE() { return getToken(uniformSQLParser.CASCADE, 0); }
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
		enterRule(_localctx, 250, RULE_drop_table_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1911);
			match(DROP);
			setState(1913);
			_la = _input.LA(1);
			if (_la==TEMPORARY) {
				{
				setState(1912);
				match(TEMPORARY);
				}
			}

			setState(1915);
			match(TABLE);
			setState(1918);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1916);
				match(IF);
				setState(1917);
				match(EXISTS);
				}
			}

			setState(1920);
			table_name();
			setState(1925);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1921);
				match(COMMA);
				setState(1922);
				table_name();
				}
				}
				setState(1927);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1929);
			_la = _input.LA(1);
			if (_la==RESTRICT || _la==CASCADE) {
				{
				setState(1928);
				_la = _input.LA(1);
				if ( !(_la==RESTRICT || _la==CASCADE) ) {
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
		enterRule(_localctx, 252, RULE_truncate_table_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1931);
			match(TRUNCATE);
			setState(1933);
			_la = _input.LA(1);
			if (_la==TABLE) {
				{
				setState(1932);
				match(TABLE);
				}
			}

			setState(1935);
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
		public TerminalNode OR() { return getToken(uniformSQLParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(uniformSQLParser.REPLACE, 0); }
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
		enterRule(_localctx, 254, RULE_create_view_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1937);
			match(CREATE);
			setState(1940);
			_la = _input.LA(1);
			if (_la==OR) {
				{
				setState(1938);
				match(OR);
				setState(1939);
				match(REPLACE);
				}
			}

			setState(1942);
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
		public TerminalNode LPAREN() { return getToken(uniformSQLParser.LPAREN, 0); }
		public Column_listContext column_list() {
			return getRuleContext(Column_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(uniformSQLParser.RPAREN, 0); }
		public TerminalNode WITH() { return getToken(uniformSQLParser.WITH, 0); }
		public TerminalNode CASCADED() { return getToken(uniformSQLParser.CASCADED, 0); }
		public TerminalNode LOCAL() { return getToken(uniformSQLParser.LOCAL, 0); }
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
		enterRule(_localctx, 256, RULE_create_view_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1944);
			match(VIEW);
			setState(1945);
			view_name();
			setState(1950);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1946);
				match(LPAREN);
				setState(1947);
				column_list();
				setState(1948);
				match(RPAREN);
				}
			}

			setState(1952);
			match(AS);
			setState(1953);
			select_statement();
			setState(1958);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1954);
				match(WITH);
				setState(1956);
				_la = _input.LA(1);
				if (_la==LOCAL || _la==CASCADED) {
					{
					setState(1955);
					_la = _input.LA(1);
					if ( !(_la==LOCAL || _la==CASCADED) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
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
		enterRule(_localctx, 258, RULE_alter_view_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1960);
			match(ALTER);
			setState(1961);
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

	public static class Drop_view_statementContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(uniformSQLParser.DROP, 0); }
		public TerminalNode VIEW() { return getToken(uniformSQLParser.VIEW, 0); }
		public List<View_nameContext> view_name() {
			return getRuleContexts(View_nameContext.class);
		}
		public View_nameContext view_name(int i) {
			return getRuleContext(View_nameContext.class,i);
		}
		public TerminalNode IF() { return getToken(uniformSQLParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(uniformSQLParser.EXISTS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public TerminalNode RESTRICT() { return getToken(uniformSQLParser.RESTRICT, 0); }
		public TerminalNode CASCADE() { return getToken(uniformSQLParser.CASCADE, 0); }
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
		enterRule(_localctx, 260, RULE_drop_view_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1963);
			match(DROP);
			setState(1964);
			match(VIEW);
			setState(1967);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1965);
				match(IF);
				setState(1966);
				match(EXISTS);
				}
			}

			setState(1969);
			view_name();
			setState(1974);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1970);
				match(COMMA);
				setState(1971);
				view_name();
				}
				}
				setState(1976);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1978);
			_la = _input.LA(1);
			if (_la==RESTRICT || _la==CASCADE) {
				{
				setState(1977);
				_la = _input.LA(1);
				if ( !(_la==RESTRICT || _la==CASCADE) ) {
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u0217\u07bf\4\2\t"+
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
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u011a"+
		"\n\2\3\3\3\3\3\4\3\4\3\5\3\5\5\5\u0122\n\5\3\5\3\5\5\5\u0126\n\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\5\5\u012e\n\5\5\5\u0130\n\5\3\5\3\5\5\5\u0134\n\5\3"+
		"\5\3\5\3\5\5\5\u0139\n\5\5\5\u013b\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u014e\n\6\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\13\5\13\u0159\n\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0169\n\17\3\20\3\20\3\20\3\20\5\20"+
		"\u016f\n\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35"+
		"\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3"+
		"\'\3(\5(\u01a0\n(\3(\3(\3)\3)\3)\7)\u01a7\n)\f)\16)\u01aa\13)\3*\3*\3"+
		"*\7*\u01af\n*\f*\16*\u01b2\13*\3+\3+\3+\7+\u01b7\n+\f+\16+\u01ba\13+\3"+
		",\5,\u01bd\n,\3,\3,\3-\3-\3-\5-\u01c4\n-\3-\3-\5-\u01c8\n-\5-\u01ca\n"+
		"-\3.\3.\3.\3.\3.\3.\3.\5.\u01d3\n.\3.\3.\3.\5.\u01d8\n.\3.\3.\3.\5.\u01dd"+
		"\n.\3/\3/\5/\u01e1\n/\3/\3/\3/\5/\u01e6\n/\3/\3/\5/\u01ea\n/\3/\3/\3/"+
		"\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u01f8\n/\3/\3/\3/\3/\5/\u01fe\n/\3/\3/"+
		"\5/\u0202\n/\3/\3/\3/\3/\5/\u0208\n/\3\60\3\60\3\60\5\60\u020d\n\60\3"+
		"\61\3\61\3\61\5\61\u0212\n\61\3\62\3\62\3\62\5\62\u0217\n\62\3\63\3\63"+
		"\3\63\5\63\u021c\n\63\3\64\3\64\3\64\5\64\u0221\n\64\3\65\3\65\3\65\5"+
		"\65\u0226\n\65\3\66\3\66\3\66\5\66\u022b\n\66\3\67\3\67\3\67\5\67\u0230"+
		"\n\67\38\38\38\38\38\38\38\38\38\38\38\38\38\58\u023f\n8\39\39\39\39\3"+
		"9\79\u0246\n9\f9\169\u0249\139\59\u024b\n9\39\59\u024e\n9\39\39\39\39"+
		"\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\59\u0268"+
		"\n9\39\39\39\59\u026d\n9\3:\3:\5:\u0271\n:\3;\3;\3;\3;\3;\3;\6;\u0279"+
		"\n;\r;\16;\u027a\3;\3;\5;\u027f\n;\3;\3;\3<\3<\3<\3<\3<\3<\3<\6<\u028a"+
		"\n<\r<\16<\u028b\3<\3<\5<\u0290\n<\3<\3<\3=\3=\3=\3=\7=\u0298\n=\f=\16"+
		"=\u029b\13=\3=\3=\3=\5=\u02a0\n=\3>\3>\3>\5>\u02a5\n>\3>\3>\3>\5>\u02aa"+
		"\n>\3>\3>\3?\3?\3?\3?\7?\u02b2\n?\f?\16?\u02b5\13?\3?\3?\3@\3@\3@\3@\3"+
		"A\3A\3A\7A\u02c0\nA\fA\16A\u02c3\13A\3B\3B\5B\u02c7\nB\3C\3C\5C\u02cb"+
		"\nC\3C\3C\3C\5C\u02d0\nC\5C\u02d2\nC\3D\3D\3D\3D\3D\5D\u02d9\nD\5D\u02db"+
		"\nD\3E\3E\3E\5E\u02e0\nE\3E\3E\3E\3E\5E\u02e6\nE\3F\3F\3F\3F\5F\u02ec"+
		"\nF\5F\u02ee\nF\3F\3F\5F\u02f2\nF\3G\3G\5G\u02f6\nG\3G\5G\u02f9\nG\3G"+
		"\5G\u02fc\nG\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\5G\u030e"+
		"\nG\3H\3H\3H\3H\5H\u0314\nH\3I\3I\3I\7I\u0319\nI\fI\16I\u031c\13I\3J\3"+
		"J\3J\3J\3J\3J\3J\5J\u0325\nJ\5J\u0327\nJ\3K\3K\3K\3K\5K\u032d\nK\3K\3"+
		"K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\5K\u033d\nK\3L\3L\3L\7L\u0342\n"+
		"L\fL\16L\u0345\13L\3M\3M\3M\3M\3M\3N\3N\3N\7N\u034f\nN\fN\16N\u0352\13"+
		"N\3O\3O\5O\u0356\nO\3O\3O\5O\u035a\nO\3O\5O\u035d\nO\3P\3P\3Q\3Q\5Q\u0363"+
		"\nQ\3R\3R\3R\5R\u0368\nR\3R\7R\u036b\nR\fR\16R\u036e\13R\3S\3S\5S\u0372"+
		"\nS\3S\5S\u0375\nS\3S\3S\3S\3S\5S\u037b\nS\3S\5S\u037e\nS\3S\5S\u0381"+
		"\nS\3S\5S\u0384\nS\5S\u0386\nS\3S\5S\u0389\nS\3S\5S\u038c\nS\3S\3S\5S"+
		"\u0390\nS\3T\3T\3T\3U\3U\3U\3U\3U\7U\u039a\nU\fU\16U\u039d\13U\3U\3U\5"+
		"U\u03a1\nU\3V\3V\3V\5V\u03a6\nV\3W\3W\3W\3X\3X\3X\3X\3X\7X\u03b0\nX\f"+
		"X\16X\u03b3\13X\3Y\3Y\5Y\u03b7\nY\3Z\3Z\3Z\3Z\5Z\u03bd\nZ\3Z\3Z\3Z\3Z"+
		"\3Z\5Z\u03c4\nZ\3[\3[\3\\\3\\\3]\3]\3]\7]\u03cd\n]\f]\16]\u03d0\13]\3"+
		"]\5]\u03d3\n]\3^\3^\3^\3^\7^\u03d9\n^\f^\16^\u03dc\13^\3^\3^\3_\3_\3_"+
		"\3_\3`\3`\3`\5`\u03e7\n`\3`\3`\3a\3a\3a\3a\3a\3a\5a\u03f1\na\3a\3a\5a"+
		"\u03f5\na\5a\u03f7\na\3b\3b\3c\3c\5c\u03fd\nc\3c\5c\u0400\nc\3c\5c\u0403"+
		"\nc\3c\3c\5c\u0407\nc\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\7d\u0415\nd"+
		"\fd\16d\u0418\13d\3e\3e\5e\u041c\ne\3e\3e\5e\u0420\ne\3f\3f\3f\3f\7f\u0426"+
		"\nf\ff\16f\u0429\13f\3g\3g\3g\5g\u042e\ng\3g\3g\3g\5g\u0433\ng\7g\u0435"+
		"\ng\fg\16g\u0438\13g\3g\3g\3h\3h\3h\3h\7h\u0440\nh\fh\16h\u0443\13h\3"+
		"i\3i\3i\3i\5i\u0449\ni\3j\3j\3j\3j\3j\5j\u0450\nj\3j\3j\3k\3k\3k\3k\5"+
		"k\u0458\nk\3k\3k\3l\3l\3l\5l\u045f\nl\3m\3m\5m\u0463\nm\3m\3m\3m\3m\5"+
		"m\u0469\nm\3m\3m\3m\3m\3m\7m\u0470\nm\fm\16m\u0473\13m\3m\3m\5m\u0477"+
		"\nm\3n\3n\5n\u047b\nn\3n\3n\3n\3n\5n\u0481\nn\3n\3n\3n\3o\3o\5o\u0488"+
		"\no\3o\3o\3o\3o\5o\u048e\no\3o\3o\3o\3o\3o\3o\3o\3o\5o\u0498\no\3p\3p"+
		"\3p\3p\3p\5p\u049f\np\5p\u04a1\np\3p\3p\3p\5p\u04a6\np\3p\3p\3p\3p\7p"+
		"\u04ac\np\fp\16p\u04af\13p\3p\3p\7p\u04b3\np\fp\16p\u04b6\13p\3p\3p\5"+
		"p\u04ba\np\3p\5p\u04bd\np\3p\3p\3p\3p\7p\u04c3\np\fp\16p\u04c6\13p\3p"+
		"\3p\7p\u04ca\np\fp\16p\u04cd\13p\3p\3p\5p\u04d1\np\5p\u04d3\np\3p\3p\5"+
		"p\u04d7\np\3p\5p\u04da\np\3p\5p\u04dd\np\3p\3p\3p\3p\7p\u04e3\np\fp\16"+
		"p\u04e6\13p\3p\3p\7p\u04ea\np\fp\16p\u04ed\13p\3p\3p\5p\u04f1\np\3p\5"+
		"p\u04f4\np\3p\3p\3p\3p\7p\u04fa\np\fp\16p\u04fd\13p\3p\3p\7p\u0501\np"+
		"\fp\16p\u0504\13p\3p\3p\5p\u0508\np\5p\u050a\np\3p\3p\3p\5p\u050f\np\3"+
		"p\3p\3p\3p\7p\u0515\np\fp\16p\u0518\13p\3p\3p\3p\3p\3p\3p\3p\3p\5p\u0522"+
		"\np\3q\3q\5q\u0526\nq\3q\3q\5q\u052a\nq\3q\3q\5q\u052e\nq\5q\u0530\nq"+
		"\3q\3q\5q\u0534\nq\3q\3q\5q\u0538\nq\3q\5q\u053b\nq\3r\3r\3r\5r\u0540"+
		"\nr\3s\3s\3s\3s\3s\5s\u0547\ns\3s\5s\u054a\ns\3s\3s\5s\u054e\ns\3s\3s"+
		"\3s\3s\3s\5s\u0555\ns\3s\5s\u0558\ns\3s\5s\u055b\ns\3s\3s\5s\u055f\ns"+
		"\3s\3s\3s\3s\3s\5s\u0566\ns\3s\5s\u0569\ns\3s\5s\u056c\ns\3s\3s\5s\u0570"+
		"\ns\3s\3s\3s\3s\3s\5s\u0577\ns\3s\5s\u057a\ns\3s\5s\u057d\ns\3s\3s\5s"+
		"\u0581\ns\3s\3s\3s\3s\3s\5s\u0588\ns\3s\5s\u058b\ns\3s\5s\u058e\ns\3s"+
		"\3s\5s\u0592\ns\3s\3s\3s\3s\3s\5s\u0599\ns\3s\5s\u059c\ns\3s\5s\u059f"+
		"\ns\3s\3s\5s\u05a3\ns\3s\3s\3s\3s\3s\5s\u05aa\ns\3s\5s\u05ad\ns\3s\5s"+
		"\u05b0\ns\3s\3s\5s\u05b4\ns\3s\3s\3s\3s\3s\3s\3s\5s\u05bd\ns\3s\5s\u05c0"+
		"\ns\3s\5s\u05c3\ns\3s\3s\5s\u05c7\ns\3s\3s\3s\3s\3s\3s\3s\5s\u05d0\ns"+
		"\3s\5s\u05d3\ns\3s\5s\u05d6\ns\3s\3s\5s\u05da\ns\3s\3s\3s\3s\3s\5s\u05e1"+
		"\ns\3s\3s\5s\u05e5\ns\3s\5s\u05e8\ns\3s\5s\u05eb\ns\3s\3s\5s\u05ef\ns"+
		"\3s\3s\5s\u05f3\ns\3s\3s\5s\u05f7\ns\3s\3s\5s\u05fb\ns\3s\3s\5s\u05ff"+
		"\ns\3s\3s\5s\u0603\ns\3s\3s\5s\u0607\ns\3s\3s\5s\u060b\ns\3s\3s\5s\u060f"+
		"\ns\3s\3s\3s\3s\3s\5s\u0616\ns\3s\3s\3s\5s\u061b\ns\3s\5s\u061e\ns\3s"+
		"\3s\5s\u0622\ns\3s\3s\3s\3s\3s\3s\3s\5s\u062b\ns\3s\5s\u062e\ns\3s\3s"+
		"\5s\u0632\ns\3s\3s\3s\3s\3s\5s\u0639\ns\3s\5s\u063c\ns\3s\3s\5s\u0640"+
		"\ns\3s\3s\3s\3s\3s\5s\u0647\ns\3s\3s\5s\u064b\ns\3s\3s\3s\3s\3s\7s\u0652"+
		"\ns\fs\16s\u0655\13s\3s\3s\3s\3s\5s\u065b\ns\3s\5s\u065e\ns\3s\3s\5s\u0662"+
		"\ns\5s\u0664\ns\3t\3t\3t\3t\5t\u066a\nt\3t\5t\u066d\nt\3u\3u\3u\3u\3u"+
		"\3u\7u\u0675\nu\fu\16u\u0678\13u\3u\3u\3u\3u\3u\3u\3u\5u\u0681\nu\3u\3"+
		"u\3u\5u\u0686\nu\3u\3u\3u\5u\u068b\nu\3v\3v\3v\3v\3v\3v\5v\u0693\nv\3"+
		"w\3w\3x\3x\5x\u0699\nx\3x\3x\3x\3x\3x\7x\u06a0\nx\fx\16x\u06a3\13x\5x"+
		"\u06a5\nx\3y\3y\5y\u06a9\ny\3y\3y\3y\3y\5y\u06af\ny\3y\3y\5y\u06b3\ny"+
		"\3y\3y\3y\3y\3y\3y\3y\5y\u06bc\ny\3y\5y\u06bf\ny\3y\3y\3y\3y\7y\u06c5"+
		"\ny\fy\16y\u06c8\13y\3y\3y\3y\5y\u06cd\ny\5y\u06cf\ny\3y\3y\3y\5y\u06d4"+
		"\ny\3y\3y\3y\3y\7y\u06da\ny\fy\16y\u06dd\13y\3y\3y\3y\5y\u06e2\ny\5y\u06e4"+
		"\ny\3y\3y\5y\u06e8\ny\3y\5y\u06eb\ny\3y\5y\u06ee\ny\3y\3y\3y\3y\7y\u06f4"+
		"\ny\fy\16y\u06f7\13y\3y\3y\7y\u06fb\ny\fy\16y\u06fe\13y\3y\3y\3y\5y\u0703"+
		"\ny\5y\u0705\ny\3y\3y\3y\5y\u070a\ny\3y\3y\3y\3y\3y\3y\3y\5y\u0713\ny"+
		"\3y\3y\3y\3y\3y\3y\5y\u071b\ny\3y\3y\5y\u071f\ny\3y\3y\3y\3y\3y\3y\5y"+
		"\u0727\ny\3y\3y\5y\u072b\ny\3y\3y\3y\5y\u0730\ny\3y\3y\3y\3y\3y\3y\7y"+
		"\u0738\ny\fy\16y\u073b\13y\3y\3y\3y\3y\3y\3y\3y\5y\u0744\ny\5y\u0746\n"+
		"y\3z\3z\3z\7z\u074b\nz\fz\16z\u074e\13z\3{\3{\3{\3|\3|\5|\u0755\n|\3|"+
		"\3|\3|\3|\3|\3|\3|\5|\u075e\n|\3}\3}\3}\3}\3}\3}\7}\u0766\n}\f}\16}\u0769"+
		"\13}\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\7~\u0775\n~\f~\16~\u0778\13~\3\177"+
		"\3\177\5\177\u077c\n\177\3\177\3\177\3\177\5\177\u0781\n\177\3\177\3\177"+
		"\3\177\7\177\u0786\n\177\f\177\16\177\u0789\13\177\3\177\5\177\u078c\n"+
		"\177\3\u0080\3\u0080\5\u0080\u0790\n\u0080\3\u0080\3\u0080\3\u0081\3\u0081"+
		"\3\u0081\5\u0081\u0797\n\u0081\3\u0081\3\u0081\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\5\u0082\u07a1\n\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\5\u0082\u07a7\n\u0082\5\u0082\u07a9\n\u0082\3\u0083\3\u0083\3"+
		"\u0083\3\u0084\3\u0084\3\u0084\3\u0084\5\u0084\u07b2\n\u0084\3\u0084\3"+
		"\u0084\3\u0084\7\u0084\u07b7\n\u0084\f\u0084\16\u0084\u07ba\13\u0084\3"+
		"\u0084\5\u0084\u07bd\n\u0084\3\u0084\2\2\u0085\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtv"+
		"xz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac"+
		"\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4"+
		"\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc"+
		"\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4"+
		"\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\2#\4\2\u00ef\u00f2"+
		"\u0106\u0107\4\2\u00c1\u00c1\u0111\u0133\4\2\u0128\u0128\u0133\u0133\3"+
		"\2\u013d\u014f\3\2\u0150\u0151\3\2\u0100\u0101\4\2\u0108\u0108\u010b\u010b"+
		"\3\2\3\4\5\2\u00e3\u00e3\u00eb\u00eb\u0152\u016d\t\2\25\25\33\34aa\u0082"+
		"\u0082\u0112\u0112\u0134\u0134\u016e\u0192\b\2OOQQ\u0137\u0137\u013d\u013f"+
		"\u0141\u0144\u0193\u01bd\n\2\b\bww\u00a8\u00a8\u00ab\u00ab\u00e6\u00e6"+
		"\u017b\u017b\u0180\u0180\u01be\u01de\3\2\u01df\u01ee\4\2\5\5\u01f0\u01f0"+
		"\3\2\u00f4\u00f5\5\2\u00ea\u00eb\u00fb\u00fb\u0105\u0105\4\2\u00c1\u00c1"+
		"\u0100\u0102\5\2\5\5\24\24\u00fb\u00fb\4\2\u00c2\u00c2\u00e8\u00e8\3\2"+
		"\33\34\4\2$$ii\4\2\5\5\24\24\3\2\n\13\4\2\u01fb\u01fb\u01fd\u01fd\4\2"+
		"\u01de\u01de\u01ff\u01ff\4\2\u00a8\u00a8\u00ab\u00ab\3\2\u0203\u0204\4"+
		"\2ww\u0209\u020a\3\2?@\4\2\22\22FF\3\2\u0214\u0215\3\2\u00d2\u00d3\4\2"+
		",,\u0098\u0098\u08b9\2\u0119\3\2\2\2\4\u011b\3\2\2\2\6\u011d\3\2\2\2\b"+
		"\u013a\3\2\2\2\n\u014d\3\2\2\2\f\u014f\3\2\2\2\16\u0151\3\2\2\2\20\u0153"+
		"\3\2\2\2\22\u0155\3\2\2\2\24\u0158\3\2\2\2\26\u015c\3\2\2\2\30\u015e\3"+
		"\2\2\2\32\u0160\3\2\2\2\34\u0168\3\2\2\2\36\u016e\3\2\2\2 \u0170\3\2\2"+
		"\2\"\u0172\3\2\2\2$\u0174\3\2\2\2&\u0176\3\2\2\2(\u0178\3\2\2\2*\u017a"+
		"\3\2\2\2,\u017c\3\2\2\2.\u017e\3\2\2\2\60\u0180\3\2\2\2\62\u0182\3\2\2"+
		"\2\64\u0184\3\2\2\2\66\u0186\3\2\2\28\u0188\3\2\2\2:\u018a\3\2\2\2<\u018c"+
		"\3\2\2\2>\u018e\3\2\2\2@\u0190\3\2\2\2B\u0192\3\2\2\2D\u0194\3\2\2\2F"+
		"\u0196\3\2\2\2H\u0198\3\2\2\2J\u019a\3\2\2\2L\u019c\3\2\2\2N\u019f\3\2"+
		"\2\2P\u01a3\3\2\2\2R\u01ab\3\2\2\2T\u01b3\3\2\2\2V\u01bc\3\2\2\2X\u01c0"+
		"\3\2\2\2Z\u01dc\3\2\2\2\\\u0207\3\2\2\2^\u0209\3\2\2\2`\u020e\3\2\2\2"+
		"b\u0213\3\2\2\2d\u0218\3\2\2\2f\u021d\3\2\2\2h\u0222\3\2\2\2j\u022a\3"+
		"\2\2\2l\u022c\3\2\2\2n\u023e\3\2\2\2p\u026c\3\2\2\2r\u0270\3\2\2\2t\u0272"+
		"\3\2\2\2v\u0282\3\2\2\2x\u0293\3\2\2\2z\u02a9\3\2\2\2|\u02ad\3\2\2\2~"+
		"\u02b8\3\2\2\2\u0080\u02bc\3\2\2\2\u0082\u02c6\3\2\2\2\u0084\u02c8\3\2"+
		"\2\2\u0086\u02d3\3\2\2\2\u0088\u02dc\3\2\2\2\u008a\u02e7\3\2\2\2\u008c"+
		"\u030d\3\2\2\2\u008e\u0313\3\2\2\2\u0090\u0315\3\2\2\2\u0092\u031d\3\2"+
		"\2\2\u0094\u033c\3\2\2\2\u0096\u033e\3\2\2\2\u0098\u0346\3\2\2\2\u009a"+
		"\u034b\3\2\2\2\u009c\u0355\3\2\2\2\u009e\u035e\3\2\2\2\u00a0\u0362\3\2"+
		"\2\2\u00a2\u0364\3\2\2\2\u00a4\u036f\3\2\2\2\u00a6\u0391\3\2\2\2\u00a8"+
		"\u0394\3\2\2\2\u00aa\u03a5\3\2\2\2\u00ac\u03a7\3\2\2\2\u00ae\u03aa\3\2"+
		"\2\2\u00b0\u03b4\3\2\2\2\u00b2\u03c3\3\2\2\2\u00b4\u03c5\3\2\2\2\u00b6"+
		"\u03c7\3\2\2\2\u00b8\u03d2\3\2\2\2\u00ba\u03d4\3\2\2\2\u00bc\u03df\3\2"+
		"\2\2\u00be\u03e6\3\2\2\2\u00c0\u03f6\3\2\2\2\u00c2\u03f8\3\2\2\2\u00c4"+
		"\u03fa\3\2\2\2\u00c6\u0408\3\2\2\2\u00c8\u0419\3\2\2\2\u00ca\u0421\3\2"+
		"\2\2\u00cc\u042a\3\2\2\2\u00ce\u043b\3\2\2\2\u00d0\u0444\3\2\2\2\u00d2"+
		"\u044a\3\2\2\2\u00d4\u0453\3\2\2\2\u00d6\u045e\3\2\2\2\u00d8\u0460\3\2"+
		"\2\2\u00da\u0478\3\2\2\2\u00dc\u0485\3\2\2\2\u00de\u0521\3\2\2\2\u00e0"+
		"\u0523\3\2\2\2\u00e2\u053f\3\2\2\2\u00e4\u0663\3\2\2\2\u00e6\u0665\3\2"+
		"\2\2\u00e8\u066e\3\2\2\2\u00ea\u0692\3\2\2\2\u00ec\u0694\3\2\2\2\u00ee"+
		"\u0696\3\2\2\2\u00f0\u0745\3\2\2\2\u00f2\u0747\3\2\2\2\u00f4\u074f\3\2"+
		"\2\2\u00f6\u075d\3\2\2\2\u00f8\u075f\3\2\2\2\u00fa\u076a\3\2\2\2\u00fc"+
		"\u0779\3\2\2\2\u00fe\u078d\3\2\2\2\u0100\u0793\3\2\2\2\u0102\u079a\3\2"+
		"\2\2\u0104\u07aa\3\2\2\2\u0106\u07ad\3\2\2\2\u0108\u011a\3\2\2\2\u0109"+
		"\u011a\7I\2\2\u010a\u011a\7J\2\2\u010b\u011a\7K\2\2\u010c\u011a\7L\2\2"+
		"\u010d\u011a\7H\2\2\u010e\u011a\7M\2\2\u010f\u011a\7N\2\2\u0110\u011a"+
		"\7O\2\2\u0111\u011a\7P\2\2\u0112\u011a\7Q\2\2\u0113\u011a\7S\2\2\u0114"+
		"\u011a\7T\2\2\u0115\u011a\7\u00c1\2\2\u0116\u011a\7R\2\2\u0117\u011a\7"+
		"V\2\2\u0118\u011a\7W\2\2\u0119\u0108\3\2\2\2\u0119\u0109\3\2\2\2\u0119"+
		"\u010a\3\2\2\2\u0119\u010b\3\2\2\2\u0119\u010c\3\2\2\2\u0119\u010d\3\2"+
		"\2\2\u0119\u010e\3\2\2\2\u0119\u010f\3\2\2\2\u0119\u0110\3\2\2\2\u0119"+
		"\u0111\3\2\2\2\u0119\u0112\3\2\2\2\u0119\u0113\3\2\2\2\u0119\u0114\3\2"+
		"\2\2\u0119\u0115\3\2\2\2\u0119\u0116\3\2\2\2\u0119\u0117\3\2\2\2\u0119"+
		"\u0118\3\2\2\2\u011a\3\3\2\2\2\u011b\u011c\t\2\2\2\u011c\5\3\2\2\2\u011d"+
		"\u011e\t\3\2\2\u011e\7\3\2\2\2\u011f\u0121\7\u00c1\2\2\u0120\u0122\7\u0108"+
		"\2\2\u0121\u0120\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u013b\3\2\2\2\u0123"+
		"\u0125\7\u0134\2\2\u0124\u0126\7\u0108\2\2\u0125\u0124\3\2\2\2\u0125\u0126"+
		"\3\2\2\2\u0126\u013b\3\2\2\2\u0127\u013b\7O\2\2\u0128\u013b\7P\2\2\u0129"+
		"\u012f\7R\2\2\u012a\u012d\7\u0108\2\2\u012b\u012c\7\u00fa\2\2\u012c\u012e"+
		"\7\u0108\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0130\3\2\2"+
		"\2\u012f\u012a\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u013b\3\2\2\2\u0131\u0133"+
		"\7\u0135\2\2\u0132\u0134\7\u0136\2\2\u0133\u0132\3\2\2\2\u0133\u0134\3"+
		"\2\2\2\u0134\u013b\3\2\2\2\u0135\u013b\7\u0137\2\2\u0136\u0138\7\u00b7"+
		"\2\2\u0137\u0139\7\u0136\2\2\u0138\u0137\3\2\2\2\u0138\u0139\3\2\2\2\u0139"+
		"\u013b\3\2\2\2\u013a\u011f\3\2\2\2\u013a\u0123\3\2\2\2\u013a\u0127\3\2"+
		"\2\2\u013a\u0128\3\2\2\2\u013a\u0129\3\2\2\2\u013a\u0131\3\2\2\2\u013a"+
		"\u0135\3\2\2\2\u013a\u0136\3\2\2\2\u013b\t\3\2\2\2\u013c\u013d\7\u00a7"+
		"\2\2\u013d\u013e\7\u0138\2\2\u013e\u013f\7\u0139\2\2\u013f\u014e\7\u013a"+
		"\2\2\u0140\u0141\7\u00a7\2\2\u0141\u0142\7\u0138\2\2\u0142\u0143\7\u0139"+
		"\2\2\u0143\u0144\7\u013a\2\2\u0144\u0145\7\u008f\2\2\u0145\u0146\7\u013b"+
		"\2\2\u0146\u014e\7\u013c\2\2\u0147\u0148\7\u00a7\2\2\u0148\u0149\7H\2"+
		"\2\u0149\u014e\7\u013a\2\2\u014a\u014b\7\u008f\2\2\u014b\u014c\7\u013b"+
		"\2\2\u014c\u014e\7\u013c\2\2\u014d\u013c\3\2\2\2\u014d\u0140\3\2\2\2\u014d"+
		"\u0147\3\2\2\2\u014d\u014a\3\2\2\2\u014e\13\3\2\2\2\u014f\u0150\t\4\2"+
		"\2\u0150\r\3\2\2\2\u0151\u0152\t\5\2\2\u0152\17\3\2\2\2\u0153\u0154\t"+
		"\6\2\2\u0154\21\3\2\2\2\u0155\u0156\7\u010c\2\2\u0156\23\3\2\2\2\u0157"+
		"\u0159\t\7\2\2\u0158\u0157\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a\3\2"+
		"\2\2\u015a\u015b\t\b\2\2\u015b\25\3\2\2\2\u015c\u015d\7\u0109\2\2\u015d"+
		"\27\3\2\2\2\u015e\u015f\t\t\2\2\u015f\31\3\2\2\2\u0160\u0161\7\u010a\2"+
		"\2\u0161\33\3\2\2\2\u0162\u0169\5\22\n\2\u0163\u0169\5\24\13\2\u0164\u0169"+
		"\5\26\f\2\u0165\u0169\5\30\r\2\u0166\u0169\5\32\16\2\u0167\u0169\79\2"+
		"\2\u0168\u0162\3\2\2\2\u0168\u0163\3\2\2\2\u0168\u0164\3\2\2\2\u0168\u0165"+
		"\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0167\3\2\2\2\u0169\35\3\2\2\2\u016a"+
		"\u016f\5 \21\2\u016b\u016f\5\"\22\2\u016c\u016f\5$\23\2\u016d\u016f\5"+
		"&\24\2\u016e\u016a\3\2\2\2\u016e\u016b\3\2\2\2\u016e\u016c\3\2\2\2\u016e"+
		"\u016d\3\2\2\2\u016f\37\3\2\2\2\u0170\u0171\t\n\2\2\u0171!\3\2\2\2\u0172"+
		"\u0173\t\13\2\2\u0173#\3\2\2\2\u0174\u0175\t\f\2\2\u0175%\3\2\2\2\u0176"+
		"\u0177\t\r\2\2\u0177\'\3\2\2\2\u0178\u0179\t\16\2\2\u0179)\3\2\2\2\u017a"+
		"\u017b\7\u010d\2\2\u017b+\3\2\2\2\u017c\u017d\7\u010d\2\2\u017d-\3\2\2"+
		"\2\u017e\u017f\7\u010d\2\2\u017f/\3\2\2\2\u0180\u0181\7\u010d\2\2\u0181"+
		"\61\3\2\2\2\u0182\u0183\7\u010d\2\2\u0183\63\3\2\2\2\u0184\u0185\7\u010d"+
		"\2\2\u0185\65\3\2\2\2\u0186\u0187\7\u010d\2\2\u0187\67\3\2\2\2\u0188\u0189"+
		"\7\u010d\2\2\u01899\3\2\2\2\u018a\u018b\7\u010d\2\2\u018b;\3\2\2\2\u018c"+
		"\u018d\7\u010d\2\2\u018d=\3\2\2\2\u018e\u018f\7\u010d\2\2\u018f?\3\2\2"+
		"\2\u0190\u0191\7\u010d\2\2\u0191A\3\2\2\2\u0192\u0193\7\u010d\2\2\u0193"+
		"C\3\2\2\2\u0194\u0195\7\u010d\2\2\u0195E\3\2\2\2\u0196\u0197\7\u010d\2"+
		"\2\u0197G\3\2\2\2\u0198\u0199\7\u010d\2\2\u0199I\3\2\2\2\u019a\u019b\7"+
		"\u010d\2\2\u019bK\3\2\2\2\u019c\u019d\7\u010d\2\2\u019dM\3\2\2\2\u019e"+
		"\u01a0\7\22\2\2\u019f\u019e\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a1\3"+
		"\2\2\2\u01a1\u01a2\7\u010d\2\2\u01a2O\3\2\2\2\u01a3\u01a8\5R*\2\u01a4"+
		"\u01a5\7\u00ec\2\2\u01a5\u01a7\5R*\2\u01a6\u01a4\3\2\2\2\u01a7\u01aa\3"+
		"\2\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9Q\3\2\2\2\u01aa\u01a8"+
		"\3\2\2\2\u01ab\u01b0\5T+\2\u01ac\u01ad\7\u01ef\2\2\u01ad\u01af\5T+\2\u01ae"+
		"\u01ac\3\2\2\2\u01af\u01b2\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2"+
		"\2\2\u01b1S\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b3\u01b8\5V,\2\u01b4\u01b5"+
		"\7\u00ed\2\2\u01b5\u01b7\5V,\2\u01b6\u01b4\3\2\2\2\u01b7\u01ba\3\2\2\2"+
		"\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9U\3\2\2\2\u01ba\u01b8\3"+
		"\2\2\2\u01bb\u01bd\7\6\2\2\u01bc\u01bb\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd"+
		"\u01be\3\2\2\2\u01be\u01bf\5X-\2\u01bfW\3\2\2\2\u01c0\u01c9\5Z.\2\u01c1"+
		"\u01c3\78\2\2\u01c2\u01c4\7\6\2\2\u01c3\u01c2\3\2\2\2\u01c3\u01c4\3\2"+
		"\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c8\5\30\r\2\u01c6\u01c8\79\2\2\u01c7"+
		"\u01c5\3\2\2\2\u01c7\u01c6\3\2\2\2\u01c8\u01ca\3\2\2\2\u01c9\u01c1\3\2"+
		"\2\2\u01c9\u01ca\3\2\2\2\u01caY\3\2\2\2\u01cb\u01cc\5\\/\2\u01cc\u01cd"+
		"\5\4\3\2\u01cd\u01ce\5\\/\2\u01ce\u01dd\3\2\2\2\u01cf\u01d0\5\\/\2\u01d0"+
		"\u01d2\5\4\3\2\u01d1\u01d3\t\17\2\2\u01d2\u01d1\3\2\2\2\u01d2\u01d3\3"+
		"\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d5\5\u00bc_\2\u01d5\u01dd\3\2\2\2"+
		"\u01d6\u01d8\7\6\2\2\u01d7\u01d6\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01d9"+
		"\3\2\2\2\u01d9\u01da\7\t\2\2\u01da\u01dd\5\u00bc_\2\u01db\u01dd\5\\/\2"+
		"\u01dc\u01cb\3\2\2\2\u01dc\u01cf\3\2\2\2\u01dc\u01d7\3\2\2\2\u01dc\u01db"+
		"\3\2\2\2\u01dd[\3\2\2\2\u01de\u01e0\5^\60\2\u01df\u01e1\7\6\2\2\u01e0"+
		"\u01df\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e5\7\u00a7"+
		"\2\2\u01e3\u01e6\5\u00bc_\2\u01e4\u01e6\5|?\2\u01e5\u01e3\3\2\2\2\u01e5"+
		"\u01e4\3\2\2\2\u01e6\u0208\3\2\2\2\u01e7\u01e9\5^\60\2\u01e8\u01ea\7\6"+
		"\2\2\u01e9\u01e8\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb"+
		"\u01ec\7\u00bf\2\2\u01ec\u01ed\5^\60\2\u01ed\u01ee\7\u00ed\2\2\u01ee\u01ef"+
		"\5\\/\2\u01ef\u0208\3\2\2\2\u01f0\u01f1\5^\60\2\u01f1\u01f2\7\u01f1\2"+
		"\2\u01f2\u01f3\7\7\2\2\u01f3\u01f4\5^\60\2\u01f4\u0208\3\2\2\2\u01f5\u01f7"+
		"\5^\60\2\u01f6\u01f8\7\6\2\2\u01f7\u01f6\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8"+
		"\u01f9\3\2\2\2\u01f9\u01fa\7\7\2\2\u01fa\u01fd\5n8\2\u01fb\u01fc\7\u01f2"+
		"\2\2\u01fc\u01fe\5n8\2\u01fd\u01fb\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u0208"+
		"\3\2\2\2\u01ff\u0201\5^\60\2\u0200\u0202\7\6\2\2\u0201\u0200\3\2\2\2\u0201"+
		"\u0202\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0204\7\u0084\2\2\u0204\u0205"+
		"\5^\60\2\u0205\u0208\3\2\2\2\u0206\u0208\5^\60\2\u0207\u01de\3\2\2\2\u0207"+
		"\u01e7\3\2\2\2\u0207\u01f0\3\2\2\2\u0207\u01f5\3\2\2\2\u0207\u01ff\3\2"+
		"\2\2\u0207\u0206\3\2\2\2\u0208]\3\2\2\2\u0209\u020c\5`\61\2\u020a\u020b"+
		"\7\u0103\2\2\u020b\u020d\5`\61\2\u020c\u020a\3\2\2\2\u020c\u020d\3\2\2"+
		"\2\u020d_\3\2\2\2\u020e\u0211\5b\62\2\u020f\u0210\7\u0104\2\2\u0210\u0212"+
		"\5b\62\2\u0211\u020f\3\2\2\2\u0211\u0212\3\2\2\2\u0212a\3\2\2\2\u0213"+
		"\u0216\5d\63\2\u0214\u0215\t\20\2\2\u0215\u0217\5d\63\2\u0216\u0214\3"+
		"\2\2\2\u0216\u0217\3\2\2\2\u0217c\3\2\2\2\u0218\u021b\5f\64\2\u0219\u021a"+
		"\t\7\2\2\u021a\u021c\5f\64\2\u021b\u0219\3\2\2\2\u021b\u021c\3\2\2\2\u021c"+
		"e\3\2\2\2\u021d\u0220\5h\65\2\u021e\u021f\t\21\2\2\u021f\u0221\5h\65\2"+
		"\u0220\u021e\3\2\2\2\u0220\u0221\3\2\2\2\u0221g\3\2\2\2\u0222\u0225\5"+
		"j\66\2\u0223\u0224\t\7\2\2\u0224\u0226\5~@\2\u0225\u0223\3\2\2\2\u0225"+
		"\u0226\3\2\2\2\u0226i\3\2\2\2\u0227\u0228\t\22\2\2\u0228\u022b\5n8\2\u0229"+
		"\u022b\5n8\2\u022a\u0227\3\2\2\2\u022a\u0229\3\2\2\2\u022bk\3\2\2\2\u022c"+
		"\u022f\5n8\2\u022d\u022e\7\u01f3\2\2\u022e\u0230\5\20\t\2\u022f\u022d"+
		"\3\2\2\2\u022f\u0230\3\2\2\2\u0230m\3\2\2\2\u0231\u023f\5\34\17\2\u0232"+
		"\u023f\5z>\2\u0233\u023f\5p9\2\u0234\u023f\7\u010e\2\2\u0235\u023f\5|"+
		"?\2\u0236\u0237\7_\2\2\u0237\u023f\5|?\2\u0238\u023f\5\u00bc_\2\u0239"+
		"\u023a\7\t\2\2\u023a\u023f\5\u00bc_\2\u023b\u023f\5x=\2\u023c\u023f\5"+
		"r:\2\u023d\u023f\5~@\2\u023e\u0231\3\2\2\2\u023e\u0232\3\2\2\2\u023e\u0233"+
		"\3\2\2\2\u023e\u0234\3\2\2\2\u023e\u0235\3\2\2\2\u023e\u0236\3\2\2\2\u023e"+
		"\u0238\3\2\2\2\u023e\u0239\3\2\2\2\u023e\u023b\3\2\2\2\u023e\u023c\3\2"+
		"\2\2\u023e\u023d\3\2\2\2\u023fo\3\2\2\2\u0240\u024d\5\36\20\2\u0241\u024a"+
		"\7\u00fd\2\2\u0242\u0247\5P)\2\u0243\u0244\7\u00fa\2\2\u0244\u0246\5P"+
		")\2\u0245\u0243\3\2\2\2\u0246\u0249\3\2\2\2\u0247\u0245\3\2\2\2\u0247"+
		"\u0248\3\2\2\2\u0248\u024b\3\2\2\2\u0249\u0247\3\2\2\2\u024a\u0242\3\2"+
		"\2\2\u024a\u024b\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u024e\7\u00fc\2\2\u024d"+
		"\u0241\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u026d\3\2\2\2\u024f\u0250\7\u0080"+
		"\2\2\u0250\u0251\7\u00fd\2\2\u0251\u0252\5P)\2\u0252\u0253\7\22\2\2\u0253"+
		"\u0254\5\b\5\2\u0254\u0255\7\u00fc\2\2\u0255\u026d\3\2\2\2\u0256\u0257"+
		"\7\u01f4\2\2\u0257\u0258\7\u00fd\2\2\u0258\u0259\5P)\2\u0259\u025a\7\u00fa"+
		"\2\2\u025a\u025b\5\b\5\2\u025b\u025c\7\u00fc\2\2\u025c\u026d\3\2\2\2\u025d"+
		"\u025e\7\u01f4\2\2\u025e\u025f\7\u00fd\2\2\u025f\u0260\5P)\2\u0260\u0261"+
		"\7.\2\2\u0261\u0262\5\f\7\2\u0262\u0263\7\u00fc\2\2\u0263\u026d\3\2\2"+
		"\2\u0264\u0265\5(\25\2\u0265\u0267\7\u00fd\2\2\u0266\u0268\t\23\2\2\u0267"+
		"\u0266\3\2\2\2\u0267\u0268\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u026a\5^"+
		"\60\2\u026a\u026b\7\u00fc\2\2\u026b\u026d\3\2\2\2\u026c\u0240\3\2\2\2"+
		"\u026c\u024f\3\2\2\2\u026c\u0256\3\2\2\2\u026c\u025d\3\2\2\2\u026c\u0264"+
		"\3\2\2\2\u026dq\3\2\2\2\u026e\u0271\5t;\2\u026f\u0271\5v<\2\u0270\u026e"+
		"\3\2\2\2\u0270\u026f\3\2\2\2\u0271s\3\2\2\2\u0272\u0278\7\u0099\2\2\u0273"+
		"\u0274\7\u009a\2\2\u0274\u0275\5P)\2\u0275\u0276\7\u009b\2\2\u0276\u0277"+
		"\5^\60\2\u0277\u0279\3\2\2\2\u0278\u0273\3\2\2\2\u0279\u027a\3\2\2\2\u027a"+
		"\u0278\3\2\2\2\u027a\u027b\3\2\2\2\u027b\u027e\3\2\2\2\u027c\u027d\7\u009c"+
		"\2\2\u027d\u027f\5^\60\2\u027e\u027c\3\2\2\2\u027e\u027f\3\2\2\2\u027f"+
		"\u0280\3\2\2\2\u0280\u0281\7\u009d\2\2\u0281u\3\2\2\2\u0282\u0283\7\u0099"+
		"\2\2\u0283\u0289\5^\60\2\u0284\u0285\7\u009a\2\2\u0285\u0286\5^\60\2\u0286"+
		"\u0287\7\u009b\2\2\u0287\u0288\5^\60\2\u0288\u028a\3\2\2\2\u0289\u0284"+
		"\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u0289\3\2\2\2\u028b\u028c\3\2\2\2\u028c"+
		"\u028f\3\2\2\2\u028d\u028e\7\u009c\2\2\u028e\u0290\5^\60\2\u028f\u028d"+
		"\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u0292\7\u009d\2"+
		"\2\u0292w\3\2\2\2\u0293\u0294\7\u01f5\2\2\u0294\u0299\5z>\2\u0295\u0296"+
		"\7\u00fa\2\2\u0296\u0298\5z>\2\u0297\u0295\3\2\2\2\u0298\u029b\3\2\2\2"+
		"\u0299\u0297\3\2\2\2\u0299\u029a\3\2\2\2\u029a\u029c\3\2\2\2\u029b\u0299"+
		"\3\2\2\2\u029c\u029d\7\u01f6\2\2\u029d\u029f\5P)\2\u029e\u02a0\5\n\6\2"+
		"\u029f\u029e\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0y\3\2\2\2\u02a1\u02a2\5"+
		"*\26\2\u02a2\u02a3\7\u00f9\2\2\u02a3\u02a5\3\2\2\2\u02a4\u02a1\3\2\2\2"+
		"\u02a4\u02a5\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\u02a7\5,\27\2\u02a7\u02a8"+
		"\7\u00f9\2\2\u02a8\u02aa\3\2\2\2\u02a9\u02a4\3\2\2\2\u02a9\u02aa\3\2\2"+
		"\2\u02aa\u02ab\3\2\2\2\u02ab\u02ac\5\60\31\2\u02ac{\3\2\2\2\u02ad\u02ae"+
		"\7\u00fd\2\2\u02ae\u02b3\5P)\2\u02af\u02b0\7\u00fa\2\2\u02b0\u02b2\5P"+
		")\2\u02b1\u02af\3\2\2\2\u02b2\u02b5\3\2\2\2\u02b3\u02b1\3\2\2\2\u02b3"+
		"\u02b4\3\2\2\2\u02b4\u02b6\3\2\2\2\u02b5\u02b3\3\2\2\2\u02b6\u02b7\7\u00fc"+
		"\2\2\u02b7}\3\2\2\2\u02b8\u02b9\7\u01f7\2\2\u02b9\u02ba\5P)\2\u02ba\u02bb"+
		"\5\16\b\2\u02bb\177\3\2\2\2\u02bc\u02c1\5\u0082B\2\u02bd\u02be\7\u00fa"+
		"\2\2\u02be\u02c0\5\u0082B\2\u02bf\u02bd\3\2\2\2\u02c0\u02c3\3\2\2\2\u02c1"+
		"\u02bf\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2\u0081\3\2\2\2\u02c3\u02c1\3\2"+
		"\2\2\u02c4\u02c7\5\u0084C\2\u02c5\u02c7\5\u008cG\2\u02c6\u02c4\3\2\2\2"+
		"\u02c6\u02c5\3\2\2\2\u02c7\u0083\3\2\2\2\u02c8\u02d1\5\u0086D\2\u02c9"+
		"\u02cb\t\24\2\2\u02ca\u02c9\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02cc\3"+
		"\2\2\2\u02cc\u02cd\7\32\2\2\u02cd\u02cf\5\u008cG\2\u02ce\u02d0\5\u008e"+
		"H\2\u02cf\u02ce\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02d2\3\2\2\2\u02d1"+
		"\u02ca\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2\u0085\3\2\2\2\u02d3\u02da\5\u0088"+
		"E\2\u02d4\u02d5\7\u01f8\2\2\u02d5\u02d8\5\u008cG\2\u02d6\u02d7\7\36\2"+
		"\2\u02d7\u02d9\5P)\2\u02d8\u02d6\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9\u02db"+
		"\3\2\2\2\u02da\u02d4\3\2\2\2\u02da\u02db\3\2\2\2\u02db\u0087\3\2\2\2\u02dc"+
		"\u02e5\5\u008aF\2\u02dd\u02df\t\25\2\2\u02de\u02e0\7\27\2\2\u02df\u02de"+
		"\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1\u02e2\7\32\2\2"+
		"\u02e2\u02e3\5\u008aF\2\u02e3\u02e4\5\u008eH\2\u02e4\u02e6\3\2\2\2\u02e5"+
		"\u02dd\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6\u0089\3\2\2\2\u02e7\u02f1\5\u008c"+
		"G\2\u02e8\u02ed\7\u0138\2\2\u02e9\u02eb\t\25\2\2\u02ea\u02ec\7\27\2\2"+
		"\u02eb\u02ea\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec\u02ee\3\2\2\2\u02ed\u02e9"+
		"\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef\u02f0\7\32\2\2"+
		"\u02f0\u02f2\5\u008cG\2\u02f1\u02e8\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2"+
		"\u008b\3\2\2\2\u02f3\u02f5\5\u00be`\2\u02f4\u02f6\5\u0098M\2\u02f5\u02f4"+
		"\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6\u02f8\3\2\2\2\u02f7\u02f9\5N(\2\u02f8"+
		"\u02f7\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9\u02fb\3\2\2\2\u02fa\u02fc\5\u0090"+
		"I\2\u02fb\u02fa\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\u030e\3\2\2\2\u02fd"+
		"\u02fe\5\u00bc_\2\u02fe\u02ff\5N(\2\u02ff\u030e\3\2\2\2\u0300\u0301\7"+
		"\u00fd\2\2\u0301\u0302\5\u0080A\2\u0302\u0303\7\u00fc\2\2\u0303\u030e"+
		"\3\2\2\2\u0304\u0305\7\u01f9\2\2\u0305\u0306\5\u0082B\2\u0306\u0307\7"+
		"\33\2\2\u0307\u0308\7\27\2\2\u0308\u0309\7\32\2\2\u0309\u030a\5\u0082"+
		"B\2\u030a\u030b\7\36\2\2\u030b\u030c\5P)\2\u030c\u030e\3\2\2\2\u030d\u02f3"+
		"\3\2\2\2\u030d\u02fd\3\2\2\2\u030d\u0300\3\2\2\2\u030d\u0304\3\2\2\2\u030e"+
		"\u008d\3\2\2\2\u030f\u0310\7\36\2\2\u0310\u0314\5P)\2\u0311\u0312\7.\2"+
		"\2\u0312\u0314\5\u00ba^\2\u0313\u030f\3\2\2\2\u0313\u0311\3\2\2\2\u0314"+
		"\u008f\3\2\2\2\u0315\u031a\5\u0094K\2\u0316\u0317\7\u00fa\2\2\u0317\u0319"+
		"\5\u0094K\2\u0318\u0316\3\2\2\2\u0319\u031c\3\2\2\2\u031a\u0318\3\2\2"+
		"\2\u031a\u031b\3\2\2\2\u031b\u0091\3\2\2\2\u031c\u031a\3\2\2\2\u031d\u0326"+
		"\t\26\2\2\u031e\u0324\7\u00d8\2\2\u031f\u0325\7\32\2\2\u0320\u0321\7\f"+
		"\2\2\u0321\u0325\7\16\2\2\u0322\u0323\7\r\2\2\u0323\u0325\7\16\2\2\u0324"+
		"\u031f\3\2\2\2\u0324\u0320\3\2\2\2\u0324\u0322\3\2\2\2\u0325\u0327\3\2"+
		"\2\2\u0326\u031e\3\2\2\2\u0326\u0327\3\2\2\2\u0327\u0093\3\2\2\2\u0328"+
		"\u0329\7\u00ce\2\2\u0329\u032a\5\u0092J\2\u032a\u032c\7\u00fd\2\2\u032b"+
		"\u032d\5\u0096L\2\u032c\u032b\3\2\2\2\u032c\u032d\3\2\2\2\u032d\u032e"+
		"\3\2\2\2\u032e\u032f\7\u00fc\2\2\u032f\u033d\3\2\2\2\u0330\u0331\7D\2"+
		"\2\u0331\u0332\5\u0092J\2\u0332\u0333\7\u00fd\2\2\u0333\u0334\5\u0096"+
		"L\2\u0334\u0335\7\u00fc\2\2\u0335\u033d\3\2\2\2\u0336\u0337\7\u01fa\2"+
		"\2\u0337\u0338\5\u0092J\2\u0338\u0339\7\u00fd\2\2\u0339\u033a\5\u0096"+
		"L\2\u033a\u033b\7\u00fc\2\2\u033b\u033d\3\2\2\2\u033c\u0328\3\2\2\2\u033c"+
		"\u0330\3\2\2\2\u033c\u0336\3\2\2\2\u033d\u0095\3\2\2\2\u033e\u0343\5\66"+
		"\34\2\u033f\u0340\7\u00fa\2\2\u0340\u0342\5\66\34\2\u0341\u033f\3\2\2"+
		"\2\u0342\u0345\3\2\2\2\u0343\u0341\3\2\2\2\u0343\u0344\3\2\2\2\u0344\u0097"+
		"\3\2\2\2\u0345\u0343\3\2\2\2\u0346\u0347\7\37\2\2\u0347\u0348\7\u00fd"+
		"\2\2\u0348\u0349\5\u009aN\2\u0349\u034a\7\u00fc\2\2\u034a\u0099\3\2\2"+
		"\2\u034b\u0350\58\35\2\u034c\u034d\7\u00fa\2\2\u034d\u034f\58\35\2\u034e"+
		"\u034c\3\2\2\2\u034f\u0352\3\2\2\2\u0350\u034e\3\2\2\2\u0350\u0351\3\2"+
		"\2\2\u0351\u009b\3\2\2\2\u0352\u0350\3\2\2\2\u0353\u0354\7\u00f4\2\2\u0354"+
		"\u0356\7\u00f5\2\2\u0355\u0353\3\2\2\2\u0355\u0356\3\2\2\2\u0356\u0359"+
		"\3\2\2\2\u0357\u035a\5\u009eP\2\u0358\u035a\3\2\2\2\u0359\u0357\3\2\2"+
		"\2\u0359\u0358\3\2\2\2\u035a\u035c\3\2\2\2\u035b\u035d\7\u00f7\2\2\u035c"+
		"\u035b\3\2\2\2\u035c\u035d\3\2\2\2\u035d\u009d\3\2\2\2\u035e\u035f\5\u00a2"+
		"R\2\u035f\u009f\3\2\2\2\u0360\u0363\5\u00d2j\2\u0361\u0363\5\u00d4k\2"+
		"\u0362\u0360\3\2\2\2\u0362\u0361\3\2\2\2\u0363\u00a1\3\2\2\2\u0364\u036c"+
		"\5\u00a4S\2\u0365\u0367\7\62\2\2\u0366\u0368\7\5\2\2\u0367\u0366\3\2\2"+
		"\2\u0367\u0368\3\2\2\2\u0368\u0369\3\2\2\2\u0369\u036b\5\u00a4S\2\u036a"+
		"\u0365\3\2\2\2\u036b\u036e\3\2\2\2\u036c\u036a\3\2\2\2\u036c\u036d\3\2"+
		"\2\2\u036d\u00a3\3\2\2\2\u036e\u036c\3\2\2\2\u036f\u0371\7\23\2\2\u0370"+
		"\u0372\t\27\2\2\u0371\u0370\3\2\2\2\u0371\u0372\3\2\2\2\u0372\u0374\3"+
		"\2\2\2\u0373\u0375\7\u01fb\2\2\u0374\u0373\3\2\2\2\u0374\u0375\3\2\2\2"+
		"\u0375\u0376\3\2\2\2\u0376\u0385\5\u00b8]\2\u0377\u0378\7\21\2\2\u0378"+
		"\u037a\5\u0080A\2\u0379\u037b\5\u0098M\2\u037a\u0379\3\2\2\2\u037a\u037b"+
		"\3\2\2\2\u037b\u037d\3\2\2\2\u037c\u037e\5\u00a6T\2\u037d\u037c\3\2\2"+
		"\2\u037d\u037e\3\2\2\2\u037e\u0380\3\2\2\2\u037f\u0381\5\u00a8U\2\u0380"+
		"\u037f\3\2\2\2\u0380\u0381\3\2\2\2\u0381\u0383\3\2\2\2\u0382\u0384\5\u00ac"+
		"W\2\u0383\u0382\3\2\2\2\u0383\u0384\3\2\2\2\u0384\u0386\3\2\2\2\u0385"+
		"\u0377\3\2\2\2\u0385\u0386\3\2\2\2\u0386\u0388\3\2\2\2\u0387\u0389\5\u00ae"+
		"X\2\u0388\u0387\3\2\2\2\u0388\u0389\3\2\2\2\u0389\u038b\3\2\2\2\u038a"+
		"\u038c\5\u00b2Z\2\u038b\u038a\3\2\2\2\u038b\u038c\3\2\2\2\u038c\u038f"+
		"\3\2\2\2\u038d\u038e\7\u00d8\2\2\u038e\u0390\7\u00d1\2\2\u038f\u038d\3"+
		"\2\2\2\u038f\u0390\3\2\2\2\u0390\u00a5\3\2\2\2\u0391\u0392\7\20\2\2\u0392"+
		"\u0393\5P)\2\u0393\u00a7\3\2\2\2\u0394\u0395\7\r\2\2\u0395\u0396\7\16"+
		"\2\2\u0396\u039b\5\u00aaV\2\u0397\u0398\7\u00fa\2\2\u0398\u039a\5\u00aa"+
		"V\2\u0399\u0397\3\2\2\2\u039a\u039d\3\2\2\2\u039b\u0399\3\2\2\2\u039b"+
		"\u039c\3\2\2\2\u039c\u03a0\3\2\2\2\u039d\u039b\3\2\2\2\u039e\u039f\7\u008f"+
		"\2\2\u039f\u03a1\7\u00d5\2\2\u03a0\u039e\3\2\2\2\u03a0\u03a1\3\2\2\2\u03a1"+
		"\u00a9\3\2\2\2\u03a2\u03a6\5z>\2\u03a3\u03a6\7\u0108\2\2\u03a4\u03a6\5"+
		"^\60\2\u03a5\u03a2\3\2\2\2\u03a5\u03a3\3\2\2\2\u03a5\u03a4\3\2\2\2\u03a6"+
		"\u00ab\3\2\2\2\u03a7\u03a8\7\17\2\2\u03a8\u03a9\5P)\2\u03a9\u00ad\3\2"+
		"\2\2\u03aa\u03ab\7\f\2\2\u03ab\u03ac\7\16\2\2\u03ac\u03b1\5\u00b0Y\2\u03ad"+
		"\u03ae\7\u00fa\2\2\u03ae\u03b0\5\u00b0Y\2\u03af\u03ad\3\2\2\2\u03b0\u03b3"+
		"\3\2\2\2\u03b1\u03af\3\2\2\2\u03b1\u03b2\3\2\2\2\u03b2\u00af\3\2\2\2\u03b3"+
		"\u03b1\3\2\2\2\u03b4\u03b6\5\u00aaV\2\u03b5\u03b7\t\30\2\2\u03b6\u03b5"+
		"\3\2\2\2\u03b6\u03b7\3\2\2\2\u03b7\u00b1\3\2\2\2\u03b8\u03bc\7\u0093\2"+
		"\2\u03b9\u03ba\5\u00b4[\2\u03ba\u03bb\7\u00fa\2\2\u03bb\u03bd\3\2\2\2"+
		"\u03bc\u03b9\3\2\2\2\u03bc\u03bd\3\2\2\2\u03bd\u03be\3\2\2\2\u03be\u03c4"+
		"\5\u00b6\\\2\u03bf\u03c0\5\u00b6\\\2\u03c0\u03c1\7\u01fc\2\2\u03c1\u03c2"+
		"\5\u00b4[\2\u03c2\u03c4\3\2\2\2\u03c3\u03b8\3\2\2\2\u03c3\u03bf\3\2\2"+
		"\2\u03c4\u00b3\3\2\2\2\u03c5\u03c6\7\u0108\2\2\u03c6\u00b5\3\2\2\2\u03c7"+
		"\u03c8\7\u0108\2\2\u03c8\u00b7\3\2\2\2\u03c9\u03ce\5\u00c0a\2\u03ca\u03cb"+
		"\7\u00fa\2\2\u03cb\u03cd\5\u00c0a\2\u03cc\u03ca\3\2\2\2\u03cd\u03d0\3"+
		"\2\2\2\u03ce\u03cc\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cf\u03d3\3\2\2\2\u03d0"+
		"\u03ce\3\2\2\2\u03d1\u03d3\7\u00fb\2\2\u03d2\u03c9\3\2\2\2\u03d2\u03d1"+
		"\3\2\2\2\u03d3\u00b9\3\2\2\2\u03d4\u03d5\7\u00fd\2\2\u03d5\u03da\5z>\2"+
		"\u03d6\u03d7\7\u00fa\2\2\u03d7\u03d9\5z>\2\u03d8\u03d6\3\2\2\2\u03d9\u03dc"+
		"\3\2\2\2\u03da\u03d8\3\2\2\2\u03da\u03db\3\2\2\2\u03db\u03dd\3\2\2\2\u03dc"+
		"\u03da\3\2\2\2\u03dd\u03de\7\u00fc\2\2\u03de\u00bb\3\2\2\2\u03df\u03e0"+
		"\7\u00fd\2\2\u03e0\u03e1\5\u00a2R\2\u03e1\u03e2\7\u00fc\2\2\u03e2\u00bd"+
		"\3\2\2\2\u03e3\u03e4\5*\26\2\u03e4\u03e5\7\u00f9\2\2\u03e5\u03e7\3\2\2"+
		"\2\u03e6\u03e3\3\2\2\2\u03e6\u03e7\3\2\2\2\u03e7\u03e8\3\2\2\2\u03e8\u03e9"+
		"\5,\27\2\u03e9\u00bf\3\2\2\2\u03ea\u03eb\5\u00be`\2\u03eb\u03ec\7\u00f9"+
		"\2\2\u03ec\u03ed\7\u00fb\2\2\u03ed\u03f7\3\2\2\2\u03ee\u03f0\5z>\2\u03ef"+
		"\u03f1\5N(\2\u03f0\u03ef\3\2\2\2\u03f0\u03f1\3\2\2\2\u03f1\u03f7\3\2\2"+
		"\2\u03f2\u03f4\5^\60\2\u03f3\u03f5\5N(\2\u03f4\u03f3\3\2\2\2\u03f4\u03f5"+
		"\3\2\2\2\u03f5\u03f7\3\2\2\2\u03f6\u03ea\3\2\2\2\u03f6\u03ee\3\2\2\2\u03f6"+
		"\u03f2\3\2\2\2\u03f7\u00c1\3\2\2\2\u03f8\u03f9\5\u00c8e\2\u03f9\u00c3"+
		"\3\2\2\2\u03fa\u03fc\7\25\2\2\u03fb\u03fd\t\31\2\2\u03fc\u03fb\3\2\2\2"+
		"\u03fc\u03fd\3\2\2\2\u03fd\u03ff\3\2\2\2\u03fe\u0400\7D\2\2\u03ff\u03fe"+
		"\3\2\2\2\u03ff\u0400\3\2\2\2\u0400\u0402\3\2\2\2\u0401\u0403\7]\2\2\u0402"+
		"\u0401\3\2\2\2\u0402\u0403\3\2\2\2\u0403\u0404\3\2\2\2\u0404\u0406\5\u00be"+
		"`\2\u0405\u0407\5\u0098M\2\u0406\u0405\3\2\2\2\u0406\u0407\3\2\2\2\u0407"+
		"\u00c5\3\2\2\2\u0408\u0409\7\36\2\2\u0409\u040a\7\u01fe\2\2\u040a\u040b"+
		"\7i\2\2\u040b\u040c\7\u00d1\2\2\u040c\u040d\5z>\2\u040d\u040e\7\u00ef"+
		"\2\2\u040e\u0416\5P)\2\u040f\u0410\7\u00fa\2\2\u0410\u0411\5z>\2\u0411"+
		"\u0412\7\u00ef\2\2\u0412\u0413\5P)\2\u0413\u0415\3\2\2\2\u0414\u040f\3"+
		"\2\2\2\u0415\u0418\3\2\2\2\u0416\u0414\3\2\2\2\u0416\u0417\3\2\2\2\u0417"+
		"\u00c7\3\2\2\2\u0418\u0416\3\2\2\2\u0419\u041b\5\u00c4c\2\u041a\u041c"+
		"\5\u00ba^\2\u041b\u041a\3\2\2\2\u041b\u041c\3\2\2\2\u041c\u041d\3\2\2"+
		"\2\u041d\u041f\5\u00a4S\2\u041e\u0420\5\u00c6d\2\u041f\u041e\3\2\2\2\u041f"+
		"\u0420\3\2\2\2\u0420\u00c9\3\2\2\2\u0421\u0422\t\32\2\2\u0422\u0427\5"+
		"\u00ccg\2\u0423\u0424\7\u00fa\2\2\u0424\u0426\5\u00ccg\2\u0425\u0423\3"+
		"\2\2\2\u0426\u0429\3\2\2\2\u0427\u0425\3\2\2\2\u0427\u0428\3\2\2\2\u0428"+
		"\u00cb\3\2\2\2\u0429\u0427\3\2\2\2\u042a\u042d\7\u00fd\2\2\u042b\u042e"+
		"\5^\60\2\u042c\u042e\7w\2\2\u042d\u042b\3\2\2\2\u042d\u042c\3\2\2\2\u042e"+
		"\u0436\3\2\2\2\u042f\u0432\7\u00fa\2\2\u0430\u0433\5^\60\2\u0431\u0433"+
		"\7w\2\2\u0432\u0430\3\2\2\2\u0432\u0431\3\2\2\2\u0433\u0435\3\2\2\2\u0434"+
		"\u042f\3\2\2\2\u0435\u0438\3\2\2\2\u0436\u0434\3\2\2\2\u0436\u0437\3\2"+
		"\2\2\u0437\u0439\3\2\2\2\u0438\u0436\3\2\2\2\u0439\u043a\7\u00fc\2\2\u043a"+
		"\u00cd\3\2\2\2\u043b\u043c\7\u0094\2\2\u043c\u0441\5\u00d0i\2\u043d\u043e"+
		"\7\u00fa\2\2\u043e\u0440\5\u00d0i\2\u043f\u043d\3\2\2\2\u0440\u0443\3"+
		"\2\2\2\u0441\u043f\3\2\2\2\u0441\u0442\3\2\2\2\u0442\u00cf\3\2\2\2\u0443"+
		"\u0441\3\2\2\2\u0444\u0445\5z>\2\u0445\u0448\7\u00ef\2\2\u0446\u0449\5"+
		"P)\2\u0447\u0449\7w\2\2\u0448\u0446\3\2\2\2\u0448\u0447\3\2\2\2\u0449"+
		"\u00d1\3\2\2\2\u044a\u044b\7:\2\2\u044b\u044f\t\33\2\2\u044c\u044d\7\b"+
		"\2\2\u044d\u044e\7\6\2\2\u044e\u0450\7\t\2\2\u044f\u044c\3\2\2\2\u044f"+
		"\u0450\3\2\2\2\u0450\u0451\3\2\2\2\u0451\u0452\5*\26\2\u0452\u00d3\3\2"+
		"\2\2\u0453\u0454\7B\2\2\u0454\u0457\t\33\2\2\u0455\u0456\7\b\2\2\u0456"+
		"\u0458\7\t\2\2\u0457\u0455\3\2\2\2\u0457\u0458\3\2\2\2\u0458\u0459\3\2"+
		"\2\2\u0459\u045a\5*\26\2\u045a\u00d5\3\2\2\2\u045b\u045f\5\u00d8m\2\u045c"+
		"\u045f\5\u00dan\2\u045d\u045f\5\u00dco\2\u045e\u045b\3\2\2\2\u045e\u045c"+
		"\3\2\2\2\u045e\u045d\3\2\2\2\u045f\u00d7\3\2\2\2\u0460\u0462\7:\2\2\u0461"+
		"\u0463\7\u0085\2\2\u0462\u0461\3\2\2\2\u0462\u0463\3\2\2\2\u0463\u0464"+
		"\3\2\2\2\u0464\u0468\7!\2\2\u0465\u0466\7\b\2\2\u0466\u0467\7\6\2\2\u0467"+
		"\u0469\7\t\2\2\u0468\u0465\3\2\2\2\u0468\u0469\3\2\2\2\u0469\u046a\3\2"+
		"\2\2\u046a\u046b\5,\27\2\u046b\u046c\7\u00fd\2\2\u046c\u0471\5\u00dep"+
		"\2\u046d\u046e\7\u00fa\2\2\u046e\u0470\5\u00dep\2\u046f\u046d\3\2\2\2"+
		"\u0470\u0473\3\2\2\2\u0471\u046f\3\2\2\2\u0471\u0472\3\2\2\2\u0472\u0474"+
		"\3\2\2\2\u0473\u0471\3\2\2\2\u0474\u0476\7\u00fc\2\2\u0475\u0477\5\u00a2"+
		"R\2\u0476\u0475\3\2\2\2\u0476\u0477\3\2\2\2\u0477\u00d9\3\2\2\2\u0478"+
		"\u047a\7:\2\2\u0479\u047b\7\u0085\2\2\u047a\u0479\3\2\2\2\u047a\u047b"+
		"\3\2\2\2\u047b\u047c\3\2\2\2\u047c\u0480\7!\2\2\u047d\u047e\7\b\2\2\u047e"+
		"\u047f\7\6\2\2\u047f\u0481\7\t\2\2\u0480\u047d\3\2\2\2\u0480\u0481\3\2"+
		"\2\2\u0481\u0482\3\2\2\2\u0482\u0483\5,\27\2\u0483\u0484\5\u00a2R\2\u0484"+
		"\u00db\3\2\2\2\u0485\u0487\7:\2\2\u0486\u0488\7\u0085\2\2\u0487\u0486"+
		"\3\2\2\2\u0487\u0488\3\2\2\2\u0488\u0489\3\2\2\2\u0489\u048d\7!\2\2\u048a"+
		"\u048b\7\b\2\2\u048b\u048c\7\6\2\2\u048c\u048e\7\t\2\2\u048d\u048a\3\2"+
		"\2\2\u048d\u048e\3\2\2\2\u048e\u048f\3\2\2\2\u048f\u0497\5,\27\2\u0490"+
		"\u0491\7\7\2\2\u0491\u0498\5,\27\2\u0492\u0493\7\u00fd\2\2\u0493\u0494"+
		"\7\7\2\2\u0494\u0495\5,\27\2\u0495\u0496\7\u00fc\2\2\u0496\u0498\3\2\2"+
		"\2\u0497\u0490\3\2\2\2\u0497\u0492\3\2\2\2\u0498\u00dd\3\2\2\2\u0499\u049a"+
		"\5\60\31\2\u049a\u049b\5\u00e0q\2\u049b\u0522\3\2\2\2\u049c\u049e\7\u0200"+
		"\2\2\u049d\u049f\5<\37\2\u049e\u049d\3\2\2\2\u049e\u049f\3\2\2\2\u049f"+
		"\u04a1\3\2\2\2\u04a0\u049c\3\2\2\2\u04a0\u04a1\3\2\2\2\u04a1\u04a2\3\2"+
		"\2\2\u04a2\u04a3\7\u0201\2\2\u04a3\u04a5\7i\2\2\u04a4\u04a6\5\u00f4{\2"+
		"\u04a5\u04a4\3\2\2\2\u04a5\u04a6\3\2\2\2\u04a6\u04a7\3\2\2\2\u04a7\u04a8"+
		"\7\u00fd\2\2\u04a8\u04ad\5\u00e6t\2\u04a9\u04aa\7\u00fa\2\2\u04aa\u04ac"+
		"\5\u00e6t\2\u04ab\u04a9\3\2\2\2\u04ac\u04af\3\2\2\2\u04ad\u04ab\3\2\2"+
		"\2\u04ad\u04ae\3\2\2\2\u04ae\u04b0\3\2\2\2\u04af\u04ad\3\2\2\2\u04b0\u04b4"+
		"\7\u00fc\2\2\u04b1\u04b3\5\u00f6|\2\u04b2\u04b1\3\2\2\2\u04b3\u04b6\3"+
		"\2\2\2\u04b4\u04b2\3\2\2\2\u04b4\u04b5\3\2\2\2\u04b5\u0522\3\2\2\2\u04b6"+
		"\u04b4\3\2\2\2\u04b7\u04b9\t\26\2\2\u04b8\u04ba\5\66\34\2\u04b9\u04b8"+
		"\3\2\2\2\u04b9\u04ba\3\2\2\2\u04ba\u04bc\3\2\2\2\u04bb\u04bd\5\u00f4{"+
		"\2\u04bc\u04bb\3\2\2\2\u04bc\u04bd\3\2\2\2\u04bd\u04be\3\2\2\2\u04be\u04bf"+
		"\7\u00fd\2\2\u04bf\u04c4\5\u00e6t\2\u04c0\u04c1\7\u00fa\2\2\u04c1\u04c3"+
		"\5\u00e6t\2\u04c2\u04c0\3\2\2\2\u04c3\u04c6\3\2\2\2\u04c4\u04c2\3\2\2"+
		"\2\u04c4\u04c5\3\2\2\2\u04c5\u04c7\3\2\2\2\u04c6\u04c4\3\2\2\2\u04c7\u04cb"+
		"\7\u00fc\2\2\u04c8\u04ca\5\u00f6|\2\u04c9\u04c8\3\2\2\2\u04ca\u04cd\3"+
		"\2\2\2\u04cb\u04c9\3\2\2\2\u04cb\u04cc\3\2\2\2\u04cc\u0522\3\2\2\2\u04cd"+
		"\u04cb\3\2\2\2\u04ce\u04d0\7\u0200\2\2\u04cf\u04d1\5<\37\2\u04d0\u04cf"+
		"\3\2\2\2\u04d0\u04d1\3\2\2\2\u04d1\u04d3\3\2\2\2\u04d2\u04ce\3\2\2\2\u04d2"+
		"\u04d3\3\2\2\2\u04d3\u04d4\3\2\2\2\u04d4\u04d6\7\u0202\2\2\u04d5\u04d7"+
		"\t\26\2\2\u04d6\u04d5\3\2\2\2\u04d6\u04d7\3\2\2\2\u04d7\u04d9\3\2\2\2"+
		"\u04d8\u04da\5\66\34\2\u04d9\u04d8\3\2\2\2\u04d9\u04da\3\2\2\2\u04da\u04dc"+
		"\3\2\2\2\u04db\u04dd\5\u00f4{\2\u04dc\u04db\3\2\2\2\u04dc\u04dd\3\2\2"+
		"\2\u04dd\u04de\3\2\2\2\u04de\u04df\7\u00fd\2\2\u04df\u04e4\5\u00e6t\2"+
		"\u04e0\u04e1\7\u00fa\2\2\u04e1\u04e3\5\u00e6t\2\u04e2\u04e0\3\2\2\2\u04e3"+
		"\u04e6\3\2\2\2\u04e4\u04e2\3\2\2\2\u04e4\u04e5\3\2\2\2\u04e5\u04e7\3\2"+
		"\2\2\u04e6\u04e4\3\2\2\2\u04e7\u04eb\7\u00fc\2\2\u04e8\u04ea\5\u00f6|"+
		"\2\u04e9\u04e8\3\2\2\2\u04ea\u04ed\3\2\2\2\u04eb\u04e9\3\2\2\2\u04eb\u04ec"+
		"\3\2\2\2\u04ec\u0522\3\2\2\2\u04ed\u04eb\3\2\2\2\u04ee\u04f0\t\34\2\2"+
		"\u04ef\u04f1\t\26\2\2\u04f0\u04ef\3\2\2\2\u04f0\u04f1\3\2\2\2\u04f1\u04f3"+
		"\3\2\2\2\u04f2\u04f4\5\66\34\2\u04f3\u04f2\3\2\2\2\u04f3\u04f4\3\2\2\2"+
		"\u04f4\u04f5\3\2\2\2\u04f5\u04f6\7\u00fd\2\2\u04f6\u04fb\5\u00e6t\2\u04f7"+
		"\u04f8\7\u00fa\2\2\u04f8\u04fa\5\u00e6t\2\u04f9\u04f7\3\2\2\2\u04fa\u04fd"+
		"\3\2\2\2\u04fb\u04f9\3\2\2\2\u04fb\u04fc\3\2\2\2\u04fc\u04fe\3\2\2\2\u04fd"+
		"\u04fb\3\2\2\2\u04fe\u0502\7\u00fc\2\2\u04ff\u0501\5\u00f6|\2\u0500\u04ff"+
		"\3\2\2\2\u0501\u0504\3\2\2\2\u0502\u0500\3\2\2\2\u0502\u0503\3\2\2\2\u0503"+
		"\u0522\3\2\2\2\u0504\u0502\3\2\2\2\u0505\u0507\7\u0200\2\2\u0506\u0508"+
		"\5<\37\2\u0507\u0506\3\2\2\2\u0507\u0508\3\2\2\2\u0508\u050a\3\2\2\2\u0509"+
		"\u0505\3\2\2\2\u0509\u050a\3\2\2\2\u050a\u050b\3\2\2\2\u050b\u050c\7\u0205"+
		"\2\2\u050c\u050e\7i\2\2\u050d\u050f\5\66\34\2\u050e\u050d\3\2\2\2\u050e"+
		"\u050f\3\2\2\2\u050f\u0510\3\2\2\2\u0510\u0511\7\u00fd\2\2\u0511\u0516"+
		"\5\u00e6t\2\u0512\u0513\7\u00fa\2\2\u0513\u0515\5\u00e6t\2\u0514\u0512"+
		"\3\2\2\2\u0515\u0518\3\2\2\2\u0516\u0514\3\2\2\2\u0516\u0517\3\2\2\2\u0517"+
		"\u0519\3\2\2\2\u0518\u0516\3\2\2\2\u0519\u051a\7\u00fc\2\2\u051a\u051b"+
		"\5\u00e8u\2\u051b\u0522\3\2\2\2\u051c\u051d\7\u0206\2\2\u051d\u051e\7"+
		"\u00fd\2\2\u051e\u051f\5P)\2\u051f\u0520\7\u00fc\2\2\u0520\u0522\3\2\2"+
		"\2\u0521\u0499\3\2\2\2\u0521\u04a0\3\2\2\2\u0521\u04b7\3\2\2\2\u0521\u04d2"+
		"\3\2\2\2\u0521\u04ee\3\2\2\2\u0521\u0509\3\2\2\2\u0521\u051c\3\2\2\2\u0522"+
		"\u00df\3\2\2\2\u0523\u0525\5\u00e4s\2\u0524\u0526\7\u0207\2\2\u0525\u0524"+
		"\3\2\2\2\u0525\u0526\3\2\2\2\u0526\u052f\3\2\2\2\u0527\u0529\7\u0202\2"+
		"\2\u0528\u052a\7i\2\2\u0529\u0528\3\2\2\2\u0529\u052a\3\2\2\2\u052a\u0530"+
		"\3\2\2\2\u052b\u052d\7\u0201\2\2\u052c\u052e\7i\2\2\u052d\u052c\3\2\2"+
		"\2\u052d\u052e\3\2\2\2\u052e\u0530\3\2\2\2\u052f\u0527\3\2\2\2\u052f\u052b"+
		"\3\2\2\2\u052f\u0530\3\2\2\2\u0530\u0533\3\2\2\2\u0531\u0532\7G\2\2\u0532"+
		"\u0534\7\u010c\2\2\u0533\u0531\3\2\2\2\u0533\u0534\3\2\2\2\u0534\u0537"+
		"\3\2\2\2\u0535\u0536\7\u0208\2\2\u0536\u0538\t\35\2\2\u0537\u0535\3\2"+
		"\2\2\u0537\u0538\3\2\2\2\u0538\u053a\3\2\2\2\u0539\u053b\5\u00e8u\2\u053a"+
		"\u0539\3\2\2\2\u053a\u053b\3\2\2\2\u053b\u00e1\3\2\2\2\u053c\u053d\7\6"+
		"\2\2\u053d\u0540\79\2\2\u053e\u0540\79\2\2\u053f\u053c\3\2\2\2\u053f\u053e"+
		"\3\2\2\2\u0540\u00e3\3\2\2\2\u0541\u0546\7\u020b\2\2\u0542\u0543\7\u00fd"+
		"\2\2\u0543\u0544\5\u00ecw\2\u0544\u0545\7\u00fc\2\2\u0545\u0547\3\2\2"+
		"\2\u0546\u0542\3\2\2\2\u0546\u0547\3\2\2\2\u0547\u0549\3\2\2\2\u0548\u054a"+
		"\5\u00e2r\2\u0549\u0548\3\2\2\2\u0549\u054a\3\2\2\2\u054a\u054d\3\2\2"+
		"\2\u054b\u054c\7w\2\2\u054c\u054e\5\32\16\2\u054d\u054b\3\2\2\2\u054d"+
		"\u054e\3\2\2\2\u054e\u0664\3\2\2\2\u054f\u0554\7I\2\2\u0550\u0551\7\u00fd"+
		"\2\2\u0551\u0552\5\u00ecw\2\u0552\u0553\7\u00fc\2\2\u0553\u0555\3\2\2"+
		"\2\u0554\u0550\3\2\2\2\u0554\u0555\3\2\2\2\u0555\u0557\3\2\2\2\u0556\u0558"+
		"\7\u00b7\2\2\u0557\u0556\3\2\2\2\u0557\u0558\3\2\2\2\u0558\u055a\3\2\2"+
		"\2\u0559\u055b\5\u00e2r\2\u055a\u0559\3\2\2\2\u055a\u055b\3\2\2\2\u055b"+
		"\u055e\3\2\2\2\u055c\u055d\7w\2\2\u055d\u055f\5\24\13\2\u055e\u055c\3"+
		"\2\2\2\u055e\u055f\3\2\2\2\u055f\u0664\3\2\2\2\u0560\u0565\7J\2\2\u0561"+
		"\u0562\7\u00fd\2\2\u0562\u0563\5\u00ecw\2\u0563\u0564\7\u00fc\2\2\u0564"+
		"\u0566\3\2\2\2\u0565\u0561\3\2\2\2\u0565\u0566\3\2\2\2\u0566\u0568\3\2"+
		"\2\2\u0567\u0569\7\u00b7\2\2\u0568\u0567\3\2\2\2\u0568\u0569\3\2\2\2\u0569"+
		"\u056b\3\2\2\2\u056a\u056c\5\u00e2r\2\u056b\u056a\3\2\2\2\u056b\u056c"+
		"\3\2\2\2\u056c\u056f\3\2\2\2\u056d\u056e\7w\2\2\u056e\u0570\5\24\13\2"+
		"\u056f\u056d\3\2\2\2\u056f\u0570\3\2\2\2\u0570\u0664\3\2\2\2\u0571\u0576"+
		"\7\u020c\2\2\u0572\u0573\7\u00fd\2\2\u0573\u0574\5\u00ecw\2\u0574\u0575"+
		"\7\u00fc\2\2\u0575\u0577\3\2\2\2\u0576\u0572\3\2\2\2\u0576\u0577\3\2\2"+
		"\2\u0577\u0579\3\2\2\2\u0578\u057a\7\u00b7\2\2\u0579\u0578\3\2\2\2\u0579"+
		"\u057a\3\2\2\2\u057a\u057c\3\2\2\2\u057b\u057d\5\u00e2r\2\u057c\u057b"+
		"\3\2\2\2\u057c\u057d\3\2\2\2\u057d\u0580\3\2\2\2\u057e\u057f\7w\2\2\u057f"+
		"\u0581\5\24\13\2\u0580\u057e\3\2\2\2\u0580\u0581\3\2\2\2\u0581\u0664\3"+
		"\2\2\2\u0582\u0587\7K\2\2\u0583\u0584\7\u00fd\2\2\u0584\u0585\5\u00ec"+
		"w\2\u0585\u0586\7\u00fc\2\2\u0586\u0588\3\2\2\2\u0587\u0583\3\2\2\2\u0587"+
		"\u0588\3\2\2\2\u0588\u058a\3\2\2\2\u0589\u058b\7\u00b7\2\2\u058a\u0589"+
		"\3\2\2\2\u058a\u058b\3\2\2\2\u058b\u058d\3\2\2\2\u058c\u058e\5\u00e2r"+
		"\2\u058d\u058c\3\2\2\2\u058d\u058e\3\2\2\2\u058e\u0591\3\2\2\2\u058f\u0590"+
		"\7w\2\2\u0590\u0592\5\24\13\2\u0591\u058f\3\2\2\2\u0591\u0592\3\2\2\2"+
		"\u0592\u0664\3\2\2\2\u0593\u0598\7\u0136\2\2\u0594\u0595\7\u00fd\2\2\u0595"+
		"\u0596\5\u00ecw\2\u0596\u0597\7\u00fc\2\2\u0597\u0599\3\2\2\2\u0598\u0594"+
		"\3\2\2\2\u0598\u0599\3\2\2\2\u0599\u059b\3\2\2\2\u059a\u059c\7\u00b7\2"+
		"\2\u059b\u059a\3\2\2\2\u059b\u059c\3\2\2\2\u059c\u059e\3\2\2\2\u059d\u059f"+
		"\5\u00e2r\2\u059e\u059d\3\2\2\2\u059e\u059f\3\2\2\2\u059f\u05a2\3\2\2"+
		"\2\u05a0\u05a1\7w\2\2\u05a1\u05a3\5\24\13\2\u05a2\u05a0\3\2\2\2\u05a2"+
		"\u05a3\3\2\2\2\u05a3\u0664\3\2\2\2\u05a4\u05a9\7L\2\2\u05a5\u05a6\7\u00fd"+
		"\2\2\u05a6\u05a7\5\u00ecw\2\u05a7\u05a8\7\u00fc\2\2\u05a8\u05aa\3\2\2"+
		"\2\u05a9\u05a5\3\2\2\2\u05a9\u05aa\3\2\2\2\u05aa\u05ac\3\2\2\2\u05ab\u05ad"+
		"\7\u00b7\2\2\u05ac\u05ab\3\2\2\2\u05ac\u05ad\3\2\2\2\u05ad\u05af\3\2\2"+
		"\2\u05ae\u05b0\5\u00e2r\2\u05af\u05ae\3\2\2\2\u05af\u05b0\3\2\2\2\u05b0"+
		"\u05b3\3\2\2\2\u05b1\u05b2\7w\2\2\u05b2\u05b4\5\24\13\2\u05b3\u05b1\3"+
		"\2\2\2\u05b3\u05b4\3\2\2\2\u05b4\u0664\3\2\2\2\u05b5\u05bc\7N\2\2\u05b6"+
		"\u05b7\7\u00fd\2\2\u05b7\u05b8\5\u00ecw\2\u05b8\u05b9\7\u00fa\2\2\u05b9"+
		"\u05ba\5\24\13\2\u05ba\u05bb\7\u00fc\2\2\u05bb\u05bd\3\2\2\2\u05bc\u05b6"+
		"\3\2\2\2\u05bc\u05bd\3\2\2\2\u05bd\u05bf\3\2\2\2\u05be\u05c0\7\u00b7\2"+
		"\2\u05bf\u05be\3\2\2\2\u05bf\u05c0\3\2\2\2\u05c0\u05c2\3\2\2\2\u05c1\u05c3"+
		"\5\u00e2r\2\u05c2\u05c1\3\2\2\2\u05c2\u05c3\3\2\2\2\u05c3\u05c6\3\2\2"+
		"\2\u05c4\u05c5\7w\2\2\u05c5\u05c7\5\24\13\2\u05c6\u05c4\3\2\2\2\u05c6"+
		"\u05c7\3\2\2\2\u05c7\u0664\3\2\2\2\u05c8\u05cf\7M\2\2\u05c9\u05ca\7\u00fd"+
		"\2\2\u05ca\u05cb\5\u00ecw\2\u05cb\u05cc\7\u00fa\2\2\u05cc\u05cd\5\24\13"+
		"\2\u05cd\u05ce\7\u00fc\2\2\u05ce\u05d0\3\2\2\2\u05cf\u05c9\3\2\2\2\u05cf"+
		"\u05d0\3\2\2\2\u05d0\u05d2\3\2\2\2\u05d1\u05d3\7\u00b7\2\2\u05d2\u05d1"+
		"\3\2\2\2\u05d2\u05d3\3\2\2\2\u05d3\u05d5\3\2\2\2\u05d4\u05d6\5\u00e2r"+
		"\2\u05d5\u05d4\3\2\2\2\u05d5\u05d6\3\2\2\2\u05d6\u05d9\3\2\2\2\u05d7\u05d8"+
		"\7w\2\2\u05d8\u05da\5\24\13\2\u05d9\u05d7\3\2\2\2\u05d9\u05da\3\2\2\2"+
		"\u05da\u0664\3\2\2\2\u05db\u05e4\7R\2\2\u05dc\u05dd\7\u00fd\2\2\u05dd"+
		"\u05e0\5\u00ecw\2\u05de\u05df\7\u00fa\2\2\u05df\u05e1\5\24\13\2\u05e0"+
		"\u05de\3\2\2\2\u05e0\u05e1\3\2\2\2\u05e1\u05e2\3\2\2\2\u05e2\u05e3\7\u00fc"+
		"\2\2\u05e3\u05e5\3\2\2\2\u05e4\u05dc\3\2\2\2\u05e4\u05e5\3\2\2\2\u05e5"+
		"\u05e7\3\2\2\2\u05e6\u05e8\7\u00b7\2\2\u05e7\u05e6\3\2\2\2\u05e7\u05e8"+
		"\3\2\2\2\u05e8\u05ea\3\2\2\2\u05e9\u05eb\5\u00e2r\2\u05ea\u05e9\3\2\2"+
		"\2\u05ea\u05eb\3\2\2\2\u05eb\u05ee\3\2\2\2\u05ec\u05ed\7w\2\2\u05ed\u05ef"+
		"\5\24\13\2\u05ee\u05ec\3\2\2\2\u05ee\u05ef\3\2\2\2\u05ef\u0664\3\2\2\2"+
		"\u05f0\u05f2\7O\2\2\u05f1\u05f3\5\u00e2r\2\u05f2\u05f1\3\2\2\2\u05f2\u05f3"+
		"\3\2\2\2\u05f3\u05f6\3\2\2\2\u05f4\u05f5\7w\2\2\u05f5\u05f7\7\u010c\2"+
		"\2\u05f6\u05f4\3\2\2\2\u05f6\u05f7\3\2\2\2\u05f7\u0664\3\2\2\2\u05f8\u05fa"+
		"\7\u0137\2\2\u05f9\u05fb\5\u00e2r\2\u05fa\u05f9\3\2\2\2\u05fa\u05fb\3"+
		"\2\2\2\u05fb\u05fe\3\2\2\2\u05fc\u05fd\7w\2\2\u05fd\u05ff\7\u010c\2\2"+
		"\u05fe\u05fc\3\2\2\2\u05fe\u05ff\3\2\2\2\u05ff\u0664\3\2\2\2\u0600\u0602"+
		"\7Q\2\2\u0601\u0603\5\u00e2r\2\u0602\u0601\3\2\2\2\u0602\u0603\3\2\2\2"+
		"\u0603\u0606\3\2\2\2\u0604\u0605\7w\2\2\u0605\u0607\7\u010c\2\2\u0606"+
		"\u0604\3\2\2\2\u0606\u0607\3\2\2\2\u0607\u0664\3\2\2\2\u0608\u060a\7P"+
		"\2\2\u0609\u060b\5\u00e2r\2\u060a\u0609\3\2\2\2\u060a\u060b\3\2\2\2\u060b"+
		"\u060e\3\2\2\2\u060c\u060d\7w\2\2\u060d\u060f\7\u010c\2\2\u060e\u060c"+
		"\3\2\2\2\u060e\u060f\3\2\2\2\u060f\u0664\3\2\2\2\u0610\u0615\7\u0134\2"+
		"\2\u0611\u0612\7\u00fd\2\2\u0612\u0613\5\u00ecw\2\u0613\u0614\7\u00fc"+
		"\2\2\u0614\u0616\3\2\2\2\u0615\u0611\3\2\2\2\u0615\u0616\3\2\2\2\u0616"+
		"\u061a\3\2\2\2\u0617\u0618\7\u020d\2\2\u0618\u0619\7\u0094\2\2\u0619\u061b"+
		"\5\6\4\2\u061a\u0617\3\2\2\2\u061a\u061b\3\2\2\2\u061b\u061d\3\2\2\2\u061c"+
		"\u061e\5\u00e2r\2\u061d\u061c\3\2\2\2\u061d\u061e\3\2\2\2\u061e\u0621"+
		"\3\2\2\2\u061f\u0620\7w\2\2\u0620\u0622\7\u010c\2\2\u0621\u061f\3\2\2"+
		"\2\u0621\u0622\3\2\2\2\u0622\u0664\3\2\2\2\u0623\u0624\7T\2\2\u0624\u0625"+
		"\7\u00fd\2\2\u0625\u0626\5\u00ecw\2\u0626\u062a\7\u00fc\2\2\u0627\u0628"+
		"\7\u020d\2\2\u0628\u0629\7\u0094\2\2\u0629\u062b\5\6\4\2\u062a\u0627\3"+
		"\2\2\2\u062a\u062b\3\2\2\2\u062b\u062d\3\2\2\2\u062c\u062e\5\u00e2r\2"+
		"\u062d\u062c\3\2\2\2\u062d\u062e\3\2\2\2\u062e\u0631\3\2\2\2\u062f\u0630"+
		"\7w\2\2\u0630\u0632\7\u010c\2\2\u0631\u062f\3\2\2\2\u0631\u0632\3\2\2"+
		"\2\u0632\u0664\3\2\2\2\u0633\u0638\7\u00c1\2\2\u0634\u0635\7\u00fd\2\2"+
		"\u0635\u0636\5\u00ecw\2\u0636\u0637\7\u00fc\2\2\u0637\u0639\3\2\2\2\u0638"+
		"\u0634\3\2\2\2\u0638\u0639\3\2\2\2\u0639\u063b\3\2\2\2\u063a\u063c\5\u00e2"+
		"r\2\u063b\u063a\3\2\2\2\u063b\u063c\3\2\2\2\u063c\u063f\3\2\2\2\u063d"+
		"\u063e\7w\2\2\u063e\u0640\7\u010c\2\2\u063f\u063d\3\2\2\2\u063f\u0640"+
		"\3\2\2\2\u0640\u0664\3\2\2\2\u0641\u0642\7\u020e\2\2\u0642\u0643\7\u00fd"+
		"\2\2\u0643\u0644\5\u00ecw\2\u0644\u0646\7\u00fc\2\2\u0645\u0647\5\u00e2"+
		"r\2\u0646\u0645\3\2\2\2\u0646\u0647\3\2\2\2\u0647\u064a\3\2\2\2\u0648"+
		"\u0649\7w\2\2\u0649\u064b\7\u010c\2\2\u064a\u0648\3\2\2\2\u064a\u064b"+
		"\3\2\2\2\u064b\u0664\3\2\2\2\u064c\u064d\7\u0094\2\2\u064d\u064e\7\u00fd"+
		"\2\2\u064e\u0653\7\u010c\2\2\u064f\u0650\7\u00fa\2\2\u0650\u0652\7\u010c"+
		"\2\2\u0651\u064f\3\2\2\2\u0652\u0655\3\2\2\2\u0653\u0651\3\2\2\2\u0653"+
		"\u0654\3\2\2\2\u0654\u0656\3\2\2\2\u0655\u0653\3\2\2\2\u0656\u065a\7\u00fc"+
		"\2\2\u0657\u0658\7\u020d\2\2\u0658\u0659\7\u0094\2\2\u0659\u065b\5\6\4"+
		"\2\u065a\u0657\3\2\2\2\u065a\u065b\3\2\2\2\u065b\u065d\3\2\2\2\u065c\u065e"+
		"\5\u00e2r\2\u065d\u065c\3\2\2\2\u065d\u065e\3\2\2\2\u065e\u0661\3\2\2"+
		"\2\u065f\u0660\7w\2\2\u0660\u0662\7\u010c\2\2\u0661\u065f\3\2\2\2\u0661"+
		"\u0662\3\2\2\2\u0662\u0664\3\2\2\2\u0663\u0541\3\2\2\2\u0663\u054f\3\2"+
		"\2\2\u0663\u0560\3\2\2\2\u0663\u0571\3\2\2\2\u0663\u0582\3\2\2\2\u0663"+
		"\u0593\3\2\2\2\u0663\u05a4\3\2\2\2\u0663\u05b5\3\2\2\2\u0663\u05c8\3\2"+
		"\2\2\u0663\u05db\3\2\2\2\u0663\u05f0\3\2\2\2\u0663\u05f8\3\2\2\2\u0663"+
		"\u0600\3\2\2\2\u0663\u0608\3\2\2\2\u0663\u0610\3\2\2\2\u0663\u0623\3\2"+
		"\2\2\u0663\u0633\3\2\2\2\u0663\u0641\3\2\2\2\u0663\u064c\3\2\2\2\u0664"+
		"\u00e5\3\2\2\2\u0665\u0669\5\60\31\2\u0666\u0667\7\u00fd\2\2\u0667\u0668"+
		"\7\u0108\2\2\u0668\u066a\7\u00fc\2\2\u0669\u0666\3\2\2\2\u0669\u066a\3"+
		"\2\2\2\u066a\u066c\3\2\2\2\u066b\u066d\t\30\2\2\u066c\u066b\3\2\2\2\u066c"+
		"\u066d\3\2\2\2\u066d\u00e7\3\2\2\2\u066e\u066f\7\u020f\2\2\u066f\u0670"+
		"\5,\27\2\u0670\u0671\7\u00fd\2\2\u0671\u0676\5\u00e6t\2\u0672\u0673\7"+
		"\u00fa\2\2\u0673\u0675\5\u00e6t\2\u0674\u0672\3\2\2\2\u0675\u0678\3\2"+
		"\2\2\u0676\u0674\3\2\2\2\u0676\u0677\3\2\2\2\u0677\u0679\3\2\2\2\u0678"+
		"\u0676\3\2\2\2\u0679\u0680\7\u00fc\2\2\u067a\u067b\7\u01f5\2\2\u067b\u0681"+
		"\7\35\2\2\u067c\u067d\7\u01f5\2\2\u067d\u0681\7\u0210\2\2\u067e\u067f"+
		"\7\u01f5\2\2\u067f\u0681\7\u0211\2\2\u0680\u067a\3\2\2\2\u0680\u067c\3"+
		"\2\2\2\u0680\u067e\3\2\2\2\u0680\u0681\3\2\2\2\u0681\u0685\3\2\2\2\u0682"+
		"\u0683\7\36\2\2\u0683\u0684\7\u00a3\2\2\u0684\u0686\5\u00eav\2\u0685\u0682"+
		"\3\2\2\2\u0685\u0686\3\2\2\2\u0686\u068a\3\2\2\2\u0687\u0688\7\36\2\2"+
		"\u0688\u0689\7\u00d1\2\2\u0689\u068b\5\u00eav\2\u068a\u0687\3\2\2\2\u068a"+
		"\u068b\3\2\2\2\u068b\u00e9\3\2\2\2\u068c\u0693\7\u00d2\2\2\u068d\u0693"+
		"\7\u00d3\2\2\u068e\u068f\7\u0094\2\2\u068f\u0693\79\2\2\u0690\u0691\7"+
		"\u0212\2\2\u0691\u0693\7\u0213\2\2\u0692\u068c\3\2\2\2\u0692\u068d\3\2"+
		"\2\2\u0692\u068e\3\2\2\2\u0692\u0690\3\2\2\2\u0693\u00eb\3\2\2\2\u0694"+
		"\u0695\7\u0108\2\2\u0695\u00ed\3\2\2\2\u0696\u0698\7<\2\2\u0697\u0699"+
		"\7D\2\2\u0698\u0697\3\2\2\2\u0698\u0699\3\2\2\2\u0699\u069a\3\2\2\2\u069a"+
		"\u069b\7!\2\2\u069b\u06a4\5,\27\2\u069c\u06a1\5\u00f0y\2\u069d\u069e\7"+
		"\u00fa\2\2\u069e\u06a0\5\u00f0y\2\u069f\u069d\3\2\2\2\u06a0\u06a3\3\2"+
		"\2\2\u06a1\u069f\3\2\2\2\u06a1\u06a2\3\2\2\2\u06a2\u06a5\3\2\2\2\u06a3"+
		"\u06a1\3\2\2\2\u06a4\u069c\3\2\2\2\u06a4\u06a5\3\2\2\2\u06a5\u00ef\3\2"+
		"\2\2\u06a6\u06a8\7\u0081\2\2\u06a7\u06a9\7>\2\2\u06a8\u06a7\3\2\2\2\u06a8"+
		"\u06a9\3\2\2\2\u06a9\u06aa\3\2\2\2\u06aa\u06ab\5\60\31\2\u06ab\u06ae\5"+
		"\u00e0q\2\u06ac\u06ad\t\36\2\2\u06ad\u06af\5\60\31\2\u06ae\u06ac\3\2\2"+
		"\2\u06ae\u06af\3\2\2\2\u06af\u0746\3\2\2\2\u06b0\u06b2\7\u0081\2\2\u06b1"+
		"\u06b3\7>\2\2\u06b2\u06b1\3\2\2\2\u06b2\u06b3\3\2\2\2\u06b3\u06b4\3\2"+
		"\2\2\u06b4\u06b5\7\u00fd\2\2\u06b5\u06b6\5\u00f8}\2\u06b6\u06b7\7\u00fc"+
		"\2\2\u06b7\u0746\3\2\2\2\u06b8\u06b9\7\u0081\2\2\u06b9\u06bb\t\26\2\2"+
		"\u06ba\u06bc\5\66\34\2\u06bb\u06ba\3\2\2\2\u06bb\u06bc\3\2\2\2\u06bc\u06be"+
		"\3\2\2\2\u06bd\u06bf\5\u00f4{\2\u06be\u06bd\3\2\2\2\u06be\u06bf\3\2\2"+
		"\2\u06bf\u06c0\3\2\2\2\u06c0\u06c1\7\u00fd\2\2\u06c1\u06c2\5\u00f2z\2"+
		"\u06c2\u06c6\7\u00fc\2\2\u06c3\u06c5\5\u00f6|\2\u06c4\u06c3\3\2\2\2\u06c5"+
		"\u06c8\3\2\2\2\u06c6\u06c4\3\2\2\2\u06c6\u06c7\3\2\2\2\u06c7\u0746\3\2"+
		"\2\2\u06c8\u06c6\3\2\2\2\u06c9\u06ce\7\u0081\2\2\u06ca\u06cc\7\u0200\2"+
		"\2\u06cb\u06cd\5<\37\2\u06cc\u06cb\3\2\2\2\u06cc\u06cd\3\2\2\2\u06cd\u06cf"+
		"\3\2\2\2\u06ce\u06ca\3\2\2\2\u06ce\u06cf\3\2\2\2\u06cf\u06d0\3\2\2\2\u06d0"+
		"\u06d1\7\u0201\2\2\u06d1\u06d3\7i\2\2\u06d2\u06d4\5\u00f4{\2\u06d3\u06d2"+
		"\3\2\2\2\u06d3\u06d4\3\2\2\2\u06d4\u06d5\3\2\2\2\u06d5\u06d6\7\u00fd\2"+
		"\2\u06d6\u06d7\5\u00f2z\2\u06d7\u06db\7\u00fc\2\2\u06d8\u06da\5\u00f6"+
		"|\2\u06d9\u06d8\3\2\2\2\u06da\u06dd\3\2\2\2\u06db\u06d9\3\2\2\2\u06db"+
		"\u06dc\3\2\2\2\u06dc\u0746\3\2\2\2\u06dd\u06db\3\2\2\2\u06de\u06e3\7\u0081"+
		"\2\2\u06df\u06e1\7\u0200\2\2\u06e0\u06e2\5<\37\2\u06e1\u06e0\3\2\2\2\u06e1"+
		"\u06e2\3\2\2\2\u06e2\u06e4\3\2\2\2\u06e3\u06df\3\2\2\2\u06e3\u06e4\3\2"+
		"\2\2\u06e4\u06e5\3\2\2\2\u06e5\u06e7\7\u0202\2\2\u06e6\u06e8\t\26\2\2"+
		"\u06e7\u06e6\3\2\2\2\u06e7\u06e8\3\2\2\2\u06e8\u06ea\3\2\2\2\u06e9\u06eb"+
		"\5\66\34\2\u06ea\u06e9\3\2\2\2\u06ea\u06eb\3\2\2\2\u06eb\u06ed\3\2\2\2"+
		"\u06ec\u06ee\5\u00f4{\2\u06ed\u06ec\3\2\2\2\u06ed\u06ee\3\2\2\2\u06ee"+
		"\u06ef\3\2\2\2\u06ef\u06f0\7\u00fd\2\2\u06f0\u06f5\5\u00e6t\2\u06f1\u06f2"+
		"\7\u00fa\2\2\u06f2\u06f4\5\u00e6t\2\u06f3\u06f1\3\2\2\2\u06f4\u06f7\3"+
		"\2\2\2\u06f5\u06f3\3\2\2\2\u06f5\u06f6\3\2\2\2\u06f6\u06f8\3\2\2\2\u06f7"+
		"\u06f5\3\2\2\2\u06f8\u06fc\7\u00fc\2\2\u06f9\u06fb\5\u00f6|\2\u06fa\u06f9"+
		"\3\2\2\2\u06fb\u06fe\3\2\2\2\u06fc\u06fa\3\2\2\2\u06fc\u06fd\3\2\2\2\u06fd"+
		"\u0746\3\2\2\2\u06fe\u06fc\3\2\2\2\u06ff\u0704\7\u0081\2\2\u0700\u0702"+
		"\7\u0200\2\2\u0701\u0703\5<\37\2\u0702\u0701\3\2\2\2\u0702\u0703\3\2\2"+
		"\2\u0703\u0705\3\2\2\2\u0704\u0700\3\2\2\2\u0704\u0705\3\2\2\2\u0705\u0706"+
		"\3\2\2\2\u0706\u0707\7\u0205\2\2\u0707\u0709\7i\2\2\u0708\u070a\5\66\34"+
		"\2\u0709\u0708\3\2\2\2\u0709\u070a\3\2\2\2\u070a\u070b\3\2\2\2\u070b\u070c"+
		"\7\u00fd\2\2\u070c\u070d\5\u00f2z\2\u070d\u070e\7\u00fc\2\2\u070e\u070f"+
		"\5\u00e8u\2\u070f\u0746\3\2\2\2\u0710\u0712\7<\2\2\u0711\u0713\7>\2\2"+
		"\u0712\u0711\3\2\2\2\u0712\u0713\3\2\2\2\u0713\u0714\3\2\2\2\u0714\u071a"+
		"\5\60\31\2\u0715\u0716\7\u0094\2\2\u0716\u0717\7w\2\2\u0717\u071b\5\34"+
		"\17\2\u0718\u0719\7B\2\2\u0719\u071b\7w\2\2\u071a\u0715\3\2\2\2\u071a"+
		"\u0718\3\2\2\2\u071b\u0746\3\2\2\2\u071c\u071e\7=\2\2\u071d\u071f\7>\2"+
		"\2\u071e\u071d\3\2\2\2\u071e\u071f\3\2\2\2\u071f\u0720\3\2\2\2\u0720\u0721"+
		"\5\60\31\2\u0721\u0722\5\60\31\2\u0722\u0726\5\u00e0q\2\u0723\u0727\7"+
		"?\2\2\u0724\u0725\7@\2\2\u0725\u0727\5\60\31\2\u0726\u0723\3\2\2\2\u0726"+
		"\u0724\3\2\2\2\u0726\u0727\3\2\2\2\u0727\u0746\3\2\2\2\u0728\u072a\7B"+
		"\2\2\u0729\u072b\7>\2\2\u072a\u0729\3\2\2\2\u072a\u072b\3\2\2\2\u072b"+
		"\u072c\3\2\2\2\u072c\u0746\5\60\31\2\u072d\u072f\7C\2\2\u072e\u0730\t"+
		"\37\2\2\u072f\u072e\3\2\2\2\u072f\u0730\3\2\2\2\u0730\u0731\3\2\2\2\u0731"+
		"\u0746\5,\27\2\u0732\u0733\7\f\2\2\u0733\u0734\7\16\2\2\u0734\u0739\5"+
		"\60\31\2\u0735\u0736\7\u00fa\2\2\u0736\u0738\5\60\31\2\u0737\u0735\3\2"+
		"\2\2\u0738\u073b\3\2\2\2\u0739\u0737\3\2\2\2\u0739\u073a\3\2\2\2\u073a"+
		"\u0746\3\2\2\2\u073b\u0739\3\2\2\2\u073c\u073d\7B\2\2\u073d\u073e\7\37"+
		"\2\2\u073e\u0746\5\u009aN\2\u073f\u0740\7\u00e3\2\2\u0740\u0743\7\37\2"+
		"\2\u0741\u0744\5\u009aN\2\u0742\u0744\7\5\2\2\u0743\u0741\3\2\2\2\u0743"+
		"\u0742\3\2\2\2\u0744\u0746\3\2\2\2\u0745\u06a6\3\2\2\2\u0745\u06b0\3\2"+
		"\2\2\u0745\u06b8\3\2\2\2\u0745\u06c9\3\2\2\2\u0745\u06de\3\2\2\2\u0745"+
		"\u06ff\3\2\2\2\u0745\u0710\3\2\2\2\u0745\u071c\3\2\2\2\u0745\u0728\3\2"+
		"\2\2\u0745\u072d\3\2\2\2\u0745\u0732\3\2\2\2\u0745\u073c\3\2\2\2\u0745"+
		"\u073f\3\2\2\2\u0746\u00f1\3\2\2\2\u0747\u074c\5\u00e6t\2\u0748\u0749"+
		"\7\u00fa\2\2\u0749\u074b\5\u00e6t\2\u074a\u0748\3\2\2\2\u074b\u074e\3"+
		"\2\2\2\u074c\u074a\3\2\2\2\u074c\u074d\3\2\2\2\u074d\u00f3\3\2\2\2\u074e"+
		"\u074c\3\2\2\2\u074f\u0750\7.\2\2\u0750\u0751\t \2\2\u0751\u00f5\3\2\2"+
		"\2\u0752\u0754\7\u0216\2\2\u0753\u0755\7\u00ef\2\2\u0754\u0753\3\2\2\2"+
		"\u0754\u0755\3\2\2\2\u0755\u0756\3\2\2\2\u0756\u075e\7\u0108\2\2\u0757"+
		"\u075e\5\u00f4{\2\u0758\u0759\7\u008f\2\2\u0759\u075a\7\u0217\2\2\u075a"+
		"\u075e\5\64\33\2\u075b\u075c\7G\2\2\u075c\u075e\7\u010c\2\2\u075d\u0752"+
		"\3\2\2\2\u075d\u0757\3\2\2\2\u075d\u0758\3\2\2\2\u075d\u075b\3\2\2\2\u075e"+
		"\u00f7\3\2\2\2\u075f\u0760\5\60\31\2\u0760\u0767\5\u00e0q\2\u0761\u0762"+
		"\7\u00fa\2\2\u0762\u0763\5\60\31\2\u0763\u0764\5\u00e0q\2\u0764\u0766"+
		"\3\2\2\2\u0765\u0761\3\2\2\2\u0766\u0769\3\2\2\2\u0767\u0765\3\2\2\2\u0767"+
		"\u0768\3\2\2\2\u0768\u00f9\3\2\2\2\u0769\u0767\3\2\2\2\u076a\u076b\7C"+
		"\2\2\u076b\u076c\7!\2\2\u076c\u076d\5,\27\2\u076d\u076e\7F\2\2\u076e\u0776"+
		"\5,\27\2\u076f\u0770\7\u00fa\2\2\u0770\u0771\5,\27\2\u0771\u0772\7F\2"+
		"\2\u0772\u0773\5,\27\2\u0773\u0775\3\2\2\2\u0774\u076f\3\2\2\2\u0775\u0778"+
		"\3\2\2\2\u0776\u0774\3\2\2\2\u0776\u0777\3\2\2\2\u0777\u00fb\3\2\2\2\u0778"+
		"\u0776\3\2\2\2\u0779\u077b\7B\2\2\u077a\u077c\7\u0085\2\2\u077b\u077a"+
		"\3\2\2\2\u077b\u077c\3\2\2\2\u077c\u077d\3\2\2\2\u077d\u0780\7!\2\2\u077e"+
		"\u077f\7\b\2\2\u077f\u0781\7\t\2\2\u0780\u077e\3\2\2\2\u0780\u0781\3\2"+
		"\2\2\u0781\u0782\3\2\2\2\u0782\u0787\5,\27\2\u0783\u0784\7\u00fa\2\2\u0784"+
		"\u0786\5,\27\2\u0785\u0783\3\2\2\2\u0786\u0789\3\2\2\2\u0787\u0785\3\2"+
		"\2\2\u0787\u0788\3\2\2\2\u0788\u078b\3\2\2\2\u0789\u0787\3\2\2\2\u078a"+
		"\u078c\t!\2\2\u078b\u078a\3\2\2\2\u078b\u078c\3\2\2\2\u078c\u00fd\3\2"+
		"\2\2\u078d\u078f\7\u00e3\2\2\u078e\u0790\7!\2\2\u078f\u078e\3\2\2\2\u078f"+
		"\u0790\3\2\2\2\u0790\u0791\3\2\2\2\u0791\u0792\5,\27\2\u0792\u00ff\3\2"+
		"\2\2\u0793\u0796\7:\2\2\u0794\u0795\7\u00ec\2\2\u0795\u0797\7\u0082\2"+
		"\2\u0796\u0794\3\2\2\2\u0796\u0797\3\2\2\2\u0797\u0798\3\2\2\2\u0798\u0799"+
		"\5\u0102\u0082\2\u0799\u0101\3\2\2\2\u079a\u079b\7\u00a6\2\2\u079b\u07a0"+
		"\5\62\32\2\u079c\u079d\7\u00fd\2\2\u079d\u079e\5\u00ba^\2\u079e\u079f"+
		"\7\u00fc\2\2\u079f\u07a1\3\2\2\2\u07a0\u079c\3\2\2\2\u07a0\u07a1\3\2\2"+
		"\2\u07a1\u07a2\3\2\2\2\u07a2\u07a3\7\22\2\2\u07a3\u07a8\5\u00a2R\2\u07a4"+
		"\u07a6\7\u008f\2\2\u07a5\u07a7\t\"\2\2\u07a6\u07a5\3\2\2\2\u07a6\u07a7"+
		"\3\2\2\2\u07a7\u07a9\3\2\2\2\u07a8\u07a4\3\2\2\2\u07a8\u07a9\3\2\2\2\u07a9"+
		"\u0103\3\2\2\2\u07aa\u07ab\7<\2\2\u07ab\u07ac\5\u0102\u0082\2\u07ac\u0105"+
		"\3\2\2\2\u07ad\u07ae\7B\2\2\u07ae\u07b1\7\u00a6\2\2\u07af\u07b0\7\b\2"+
		"\2\u07b0\u07b2\7\t\2\2\u07b1\u07af\3\2\2\2\u07b1\u07b2\3\2\2\2\u07b2\u07b3"+
		"\3\2\2\2\u07b3\u07b8\5\62\32\2\u07b4\u07b5\7\u00fa\2\2\u07b5\u07b7\5\62"+
		"\32\2\u07b6\u07b4\3\2\2\2\u07b7\u07ba\3\2\2\2\u07b8\u07b6\3\2\2\2\u07b8"+
		"\u07b9\3\2\2\2\u07b9\u07bc\3\2\2\2\u07ba\u07b8\3\2\2\2\u07bb\u07bd\t!"+
		"\2\2\u07bc\u07bb\3\2\2\2\u07bc\u07bd\3\2\2\2\u07bd\u0107\3\2\2\2\u0121"+
		"\u0119\u0121\u0125\u012d\u012f\u0133\u0138\u013a\u014d\u0158\u0168\u016e"+
		"\u019f\u01a8\u01b0\u01b8\u01bc\u01c3\u01c7\u01c9\u01d2\u01d7\u01dc\u01e0"+
		"\u01e5\u01e9\u01f7\u01fd\u0201\u0207\u020c\u0211\u0216\u021b\u0220\u0225"+
		"\u022a\u022f\u023e\u0247\u024a\u024d\u0267\u026c\u0270\u027a\u027e\u028b"+
		"\u028f\u0299\u029f\u02a4\u02a9\u02b3\u02c1\u02c6\u02ca\u02cf\u02d1\u02d8"+
		"\u02da\u02df\u02e5\u02eb\u02ed\u02f1\u02f5\u02f8\u02fb\u030d\u0313\u031a"+
		"\u0324\u0326\u032c\u033c\u0343\u0350\u0355\u0359\u035c\u0362\u0367\u036c"+
		"\u0371\u0374\u037a\u037d\u0380\u0383\u0385\u0388\u038b\u038f\u039b\u03a0"+
		"\u03a5\u03b1\u03b6\u03bc\u03c3\u03ce\u03d2\u03da\u03e6\u03f0\u03f4\u03f6"+
		"\u03fc\u03ff\u0402\u0406\u0416\u041b\u041f\u0427\u042d\u0432\u0436\u0441"+
		"\u0448\u044f\u0457\u045e\u0462\u0468\u0471\u0476\u047a\u0480\u0487\u048d"+
		"\u0497\u049e\u04a0\u04a5\u04ad\u04b4\u04b9\u04bc\u04c4\u04cb\u04d0\u04d2"+
		"\u04d6\u04d9\u04dc\u04e4\u04eb\u04f0\u04f3\u04fb\u0502\u0507\u0509\u050e"+
		"\u0516\u0521\u0525\u0529\u052d\u052f\u0533\u0537\u053a\u053f\u0546\u0549"+
		"\u054d\u0554\u0557\u055a\u055e\u0565\u0568\u056b\u056f\u0576\u0579\u057c"+
		"\u0580\u0587\u058a\u058d\u0591\u0598\u059b\u059e\u05a2\u05a9\u05ac\u05af"+
		"\u05b3\u05bc\u05bf\u05c2\u05c6\u05cf\u05d2\u05d5\u05d9\u05e0\u05e4\u05e7"+
		"\u05ea\u05ee\u05f2\u05f6\u05fa\u05fe\u0602\u0606\u060a\u060e\u0615\u061a"+
		"\u061d\u0621\u062a\u062d\u0631\u0638\u063b\u063f\u0646\u064a\u0653\u065a"+
		"\u065d\u0661\u0663\u0669\u066c\u0676\u0680\u0685\u068a\u0692\u0698\u06a1"+
		"\u06a4\u06a8\u06ae\u06b2\u06bb\u06be\u06c6\u06cc\u06ce\u06d3\u06db\u06e1"+
		"\u06e3\u06e7\u06ea\u06ed\u06f5\u06fc\u0702\u0704\u0709\u0712\u071a\u071e"+
		"\u0726\u072a\u072f\u0739\u0743\u0745\u074c\u0754\u075d\u0767\u0776\u077b"+
		"\u0780\u0787\u078b\u078f\u0796\u07a0\u07a6\u07a8\u07b1\u07b8\u07bc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}