package com.google.gmodule.googlesearch.builder;
/**
 * TestDataQueryBuilder class to build the queries required for the google search test cases
 * 
 * 
 * 
 * @author G Sunil Kumar
 *
 */
public class TestDataQueryBuilder {
	private StringBuilder sqlQuery;
	private static final String AND = "and ";
	private static final String CLOSE_BRACES = ") ";
	private static final String OPEN_BRACES = "( ";
	private static final String FROM = "from ";
	private static final String SELECT = "select ";
	public static final String BASE_COLUMNS = "googleKey1, googleKey2, googleKey3, row_number() ";
	public static final String COLUMNS_TEMP_GOOGLE_KEY_1 = "temp.googleKey1 ";
	public static final String COLUMNS_TEMP_GOOGLE_KEY_2 = "temp.googleKey2 ";
	public static final String COLUMNS_TEMP_GOOGLE_KEY_3 = "temp.googleKey3 ";
	public static final String BASE_CRITERIA_3 = "as temp; ";
	public static final String BASE_CRITERIA_1 = "over (partition by user order by googleKey1 desc) as rnum from ";
	public static final String BASE_CRITERIA_2 = "qualify rnum=NULL where ";
	public static final String CRITERIA_GOOGLE_CRITERIA_1 = "googleCriteria1='A1' ";
	public static final String CRITERIA_GOOGLE_CRITERIA_2 = "googleCriteria2='A2' ";
	public static final String CRITERIA_GOOGLE_CRITERIA_3 = "googleCriteria3='A3'  ";
	public static final String TABLES_GOOGLE_TABLE = "googleTable "; 
	/**
	 * Constructor for TestDataQueryBuilder
	 */
	public TestDataQueryBuilder() {
		sqlQuery = new StringBuilder();
	}
	/**
	 * Method to build the sqlQuery
	 * @return String
	 */
	public String build() {
        return sqlQuery.toString();
    }
	/**
	 * Method to start select
	 * @return TestDataQueryBuilder
	 */
	public TestDataQueryBuilder startSelect() {
		sqlQuery.append(SELECT);
		return this;
	}
	/**
	 * Method to add column 
	 * @param columnName
	 * @return TestDataQueryBuilder
	 */
	public TestDataQueryBuilder addColumn(String columnName) {
		sqlQuery.append(columnName);
		return this;
	}
	/**
	 * Method to add Acct Number column 
	 * @return TestDataQueryBuilder
	 */
	public TestDataQueryBuilder addAcctNrColumn() {
		sqlQuery.append(COLUMNS_TEMP_GOOGLE_KEY_1);
		return this;
	}
	/**
	 * Method to add Bank Number column 
	 * @return TestDataQueryBuilder
	 */
	public TestDataQueryBuilder addBankNrColumn() {
		sqlQuery.append(COLUMNS_TEMP_GOOGLE_KEY_2);
		return this;
	}
	/**
	 * Method to add Branch Number column 
	 * @return TestDataQueryBuilder
	 */
	public TestDataQueryBuilder addBranchNrColumn() {
		sqlQuery.append(COLUMNS_TEMP_GOOGLE_KEY_3);
		return this;
	}
	/**
	 * Method to add From 
	 * @return TestDataQueryBuilder
	 */
	public TestDataQueryBuilder addFrom() {
		sqlQuery.append(FROM);
		return this;
	}
	/**
	 * Method to add select
	 * @return TestDataQueryBuilder
	 */
	public TestDataQueryBuilder addOpenBraces() {
		sqlQuery.append(OPEN_BRACES);
		return this;
	}
	/**
	 * Method to add select
	 * @return TestDataQueryBuilder
	 */
	public TestDataQueryBuilder addSelect() {
		sqlQuery.append(SELECT);
		return this;
	}
	/**
	 * Method to add base columns 
	 * @return TestDataQueryBuilder
	 */
	public TestDataQueryBuilder addBaseColumns() {
		sqlQuery.append(BASE_COLUMNS);
		return this;
	}
	/**
	 * Method to add Base criteria 1 
	 * @return TestDataQueryBuilder
	 */
	public TestDataQueryBuilder addBaseCriteria1() {
		sqlQuery.append(BASE_CRITERIA_1);
		return this;
	}
	/**
	 * Method to add table cfDailyMgcAcct
	 * @return TestDataQueryBuilder
	 */
	public TestDataQueryBuilder addTableCfDailyMgcAcct() {
		sqlQuery.append(TABLES_GOOGLE_TABLE);
		return this;
	}
	/**
	 * Method to add base criteria 2
	 * @return TestDataQueryBuilder
	 */
	public TestDataQueryBuilder addBaseCriteria2() {
		sqlQuery.append(BASE_CRITERIA_2);
		return this;
	}
	/**
	 * Method to add further criterias 
	 * @return TestDataQueryBuilder
	 */
	public TestDataQueryBuilder addThreeCriterias(String googleKey1,String googleKey2, String googleKey3) {
		sqlQuery.append(googleKey1);
		sqlQuery.append(AND);
		sqlQuery.append(googleKey2);
		sqlQuery.append(AND);
		sqlQuery.append(googleKey3);
		sqlQuery.append(CLOSE_BRACES);
		sqlQuery.append(BASE_CRITERIA_3);
		return this;
	}
	/**
	 * Method to add further criterias 
	 * @return TestDataQueryBuilder
	 */
	public TestDataQueryBuilder addFurtherCriterias(String googleKey1,String googleKey2) {
		sqlQuery.append(googleKey1);
		sqlQuery.append(AND);
		sqlQuery.append(googleKey2);
		sqlQuery.append(CLOSE_BRACES);
		sqlQuery.append(BASE_CRITERIA_3);
		return this;
	}
}