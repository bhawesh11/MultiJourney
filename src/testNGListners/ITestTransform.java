package testNGListners;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import GenericFunctions.Excel;
import GenericFunctions.TestData;

public class ITestTransform implements IAnnotationTransformer {
	
	public static ArrayList<String> disabledTC = new ArrayList<String>();
	public static HashMap<String, String> testData = new HashMap<String, String>();
	int j=1;
	HashMap<String, String> batchFile = new HashMap<String, String>();
	HashMap<String, String> dependency = new HashMap<String, String>();
	@Override
	public void transform(ITestAnnotation annotation, Class TC, Constructor arg2, Method testMethod) {
		
		if(j==1){
			int i=1;
			
//			Storing in HashMap
			while(Excel.readExcelCell("BatchFile", "A"+String.valueOf(i+3))!=null){
				batchFile.put(Excel.readExcelCell("BatchFile", "A"+String.valueOf(i+3)), Excel.readExcelCell("BatchFile", "E"+String.valueOf(i+3)));
				dependency.put(Excel.readExcelCell("BatchFile", "A"+String.valueOf(i+3)), Excel.readExcelCell("BatchFile", "D"+String.valueOf(i+3)));
				i++;
			}//Closing WHILE loop
			
			//Collecting TestData

			
		}//closing IF block
		
		
		//Disabling the TC if "NO"
		String testCase = testMethod.getName();
		String choice=batchFile.get(testCase);
		
		
		if(choice.equals("No")){
			annotation.setEnabled(false);
			System.out.println(testCase+" is Disabled.");
			disabledTC.add(testCase);
		}
		
		
//		for(Map.Entry m : batchFile.entrySet()){
//			if(testMethod.getName().equals(m.getKey())){
//				if(m.getValue().equals("No")){
//					annotation.setEnabled(false);
//					System.out.println(testCase+" is Disabled.");
//					disabledTC.add(testCase);
//				}
//			}
//		}
		

		j++;
		
	}//Closing transform method

}//Closing Class
