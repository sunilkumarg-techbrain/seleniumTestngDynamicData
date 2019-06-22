package com.google.gmodule.googlesearch.dynamicdata;
import java.util.LinkedHashMap;
import com.google.gmodule.googlesearch.builder.TestDataQueryBuilder;
/**
 * GoogleDynamicData enum class containing IM module dynamic queries 
 * @author G Sunil Kumar
 *
 */
public enum GoogleDynamicData implements AbstractQueries  {
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
	protected LinkedHashMap<String, String> unparsedDbQueryMapObj = new LinkedHashMap<String, String>();
	protected String GOOGLE_KEY_1 = "googleKey1";
	protected String GOOGLE_KEY_2 = "googleKey2";
	protected String GOOGLE_KEY_3 = "googleKey3";
	private String query;
	/**
	 * Constructor for GoogleDynamicData enum class 
	 */
	GoogleDynamicData() {
	}
	/**
	 * Constructor for GoogleDynamicData enum class 
	 * @param q
	 */
	GoogleDynamicData(String q) {
		query = q;
	}
	/**
	 * Method to return query string 
	 * @return String
	 */
	public String query() {
		return this.query;
	}
	/**
	 * Method to return hashMapObj for GoogleDynamicDataTest 
	 * @return LinkedHashMap<String, String>
	 */
	public LinkedHashMap<String, String> googleDynamicDataTestHMObj() {
		unparsedDbQueryMapObj.put(GOOGLE_KEY_1,GOOGLE_QUERY_1.query());
		unparsedDbQueryMapObj.put(GOOGLE_KEY_2,GOOGLE_QUERY_2.query());
		unparsedDbQueryMapObj.put(GOOGLE_KEY_3,GOOGLE_QUERY_3.query());
		return unparsedDbQueryMapObj;
	}
}