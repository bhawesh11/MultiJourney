package GenericFunctions;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

import org.apache.log4j.Logger;

public class TestData {
	public static Map<String, String> testData = new TreeMap<String, String>(String.CASE_INSENSITIVE_ORDER);
	
	public static void getTestData(){
		
		Logger log = Logger.getLogger("Configuration");
		log.info("Loading Test Data.");
		
		int i = 0;
		while(Excel.readExcelCell("Quick Sanity", "B"+String.valueOf(i+3))!=null){
			testData.put(Excel.readExcelCell("Quick Sanity", "B"+String.valueOf(i+3)).trim(), Excel.readExcelCell("Quick Sanity", "C"+String.valueOf(i+3)));
			i++;
		}//Closing WHILE loop
		
		log.info("Test Data loaded successfully.");
		
		for (HashMap.Entry<String,String> entry : testData.entrySet()) {
			  String key = entry.getKey();
			  String value = entry.getValue();
//			  System.out.print(key+"="+value+"; ");
			  System.out.printf("%-30.30s  %-30.30s%n", key, value);
		}//Closing FOR loop
		
	}//Closing getTestData method
	
}//Closing CLASS
