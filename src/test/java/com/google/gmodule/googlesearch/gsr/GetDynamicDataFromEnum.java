package com.google.gmodule.googlesearch.gsr;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import com.google.gmodule.googlesearch.dynamicdata.GoogleDynamicData;
/**
 * TestQuery to verify the dynamic generation of the query on passing the method name as a string
 * @author Sunil kumar
 *
 */
public class GetDynamicDataFromEnum {
	Random r = new Random();
	int randomDbRecord = r.nextInt(100) + 1;
	GoogleDynamicData googleDynamicData = GoogleDynamicData.GOOGLE_QUERY_1;
	LinkedHashMap<String, String> unparsedDbQueryMapObj = new LinkedHashMap<String, String>();
	public LinkedHashMap<String, String> getQuery() {
		unparsedDbQueryMapObj.putAll(googleDynamicData.googleDynamicDataTestHMObj());
		return unparsedDbQueryMapObj;
	}
	/**
	 * Method to get db hash map 
	 */
	@SuppressWarnings("unchecked")
	public void getUpdatedDynamicDbQueryMap(String testClass) {
		LinkedHashMap<String, String> parsedDbQueryMapObj = new LinkedHashMap<String, String>();
		LinkedHashMap<String, String> unparsedDbQueryMapObj = new LinkedHashMap<String, String>();
		GoogleDynamicData googleDynamicData = GoogleDynamicData.GOOGLE_QUERY_1;
		String methodName = testClass;
		System.out.println("methodName "+ methodName);
		String parsedMethodName = methodName.substring(0, 1).toLowerCase() + methodName.substring(1) + "HMObj";
		Method queryHashMapObjMethod = null;
		System.out.println("parsedMethodName "+ parsedMethodName);
		try {
			queryHashMapObjMethod = googleDynamicData.getClass().getMethod(parsedMethodName);
		} catch (NoSuchMethodException | SecurityException e2) {
			System.out.println("parsedMethodName "+ parsedMethodName+" not found in IM enum class");
		} 
        try {
        	unparsedDbQueryMapObj.putAll((Map<? extends String, ? extends String>) queryHashMapObjMethod.invoke(googleDynamicData));
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e1) {
			System.out.println("parsedMethodName "+ parsedMethodName+" test not returning hashMapObj from Google Dynamic Data enum class");
		}
		r = new Random();
		randomDbRecord = r.nextInt(100) + 1;
		System.out.println("Creating parsedDbQueryMapObj ");
		for (String singleKey : unparsedDbQueryMapObj.keySet()) {
			String key = singleKey.toString();
			String value = unparsedDbQueryMapObj.get(singleKey).toString();
			String newValue = value.replaceAll("NULL\\b", Integer.toString(randomDbRecord));
			parsedDbQueryMapObj.put(key, newValue);
		}
		System.out.println("Contents of parsedDbQueryMapObj");
		for (String singleKey : parsedDbQueryMapObj.keySet()) {
			String key = singleKey.toString();
			String value = parsedDbQueryMapObj.get(singleKey).toString();
			System.out.println(key + " , " + value);
		}
	}
    /**
     * Main method to validate the parsedDbQueryMapObj returned after passing of the method name as string
     * @param args
     */
	public static void main(String args[]) {
		GetDynamicDataFromEnum testQuery = new GetDynamicDataFromEnum();
		testQuery.getQuery();
		testQuery.getUpdatedDynamicDbQueryMap("GoogleDynamicDataTest");
	}
}
