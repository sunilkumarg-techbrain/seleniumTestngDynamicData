package com.google.gmodule.googlesearch.dynamicdata;
import com.google.gmodule.googlesearch.builder.TestDataQueryBuilder;

/**
 * BaseQueries enum class containing base dynamic queries
 * @author G Sunil Kumar
 *
 */
public enum BaseQueries implements AbstractQueries {
	GOOGLE_QUERY_1(new TestDataQueryBuilder()
			.startSelect()			
			.addColumn(TestDataQueryBuilder.COLUMNS_TEMP_GOOGLE_KEY_1)
			.addFrom()
			.addOpenBraces()
			.addSelect()
            .addBaseColumns()
            .addBaseCriteria1()
			.addTableCfDailyMgcAcct()
			.addBaseCriteria2()
			.addFurtherCriterias(TestDataQueryBuilder.CRITERIA_GOOGLE_CRITERIA_1,TestDataQueryBuilder.CRITERIA_GOOGLE_CRITERIA_2)
			.build()),
	GOOGLE_QUERY_2(new TestDataQueryBuilder()
			.startSelect()			
			.addColumn(TestDataQueryBuilder.COLUMNS_TEMP_GOOGLE_KEY_2)
			.addFrom()
			.addOpenBraces()
			.addSelect()
            .addBaseColumns()
            .addBaseCriteria1()
			.addTableCfDailyMgcAcct()
			.addBaseCriteria2()
			.addFurtherCriterias(TestDataQueryBuilder.CRITERIA_GOOGLE_CRITERIA_1,TestDataQueryBuilder.CRITERIA_GOOGLE_CRITERIA_2)
			.build()),
	GOOGLE_QUERY_3(new TestDataQueryBuilder()
			.startSelect()			
			.addColumn(TestDataQueryBuilder.COLUMNS_TEMP_GOOGLE_KEY_3)
			.addFrom()
			.addOpenBraces()
			.addSelect()
            .addBaseColumns()
            .addBaseCriteria1()
			.addTableCfDailyMgcAcct()
			.addBaseCriteria2()
			.addFurtherCriterias(TestDataQueryBuilder.CRITERIA_GOOGLE_CRITERIA_1,TestDataQueryBuilder.CRITERIA_GOOGLE_CRITERIA_2)
			.build());
	private String query;
	/**
	 * Constructor to initialize BaseQueries
	 * @param q
	 */
	BaseQueries(String q) {
		query = q;
	}
    /**
     * Method to return query 
     * @return String  
     */
	public String query() {
		return this.query;
	}
}