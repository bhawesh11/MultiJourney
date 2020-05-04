package testNGListners;
import java.io.CharArrayWriter;
import java.io.PrintWriter;

import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestAnnotation implements ITestListener{
	
	Logger log = Logger.getLogger("Test Suite");
//	------------------------------------------------------------------------------------------
	@Override
	public void onFinish(ITestContext arg0) {	
	}
//	------------------------------------------------------------------------------------------
	@Override
	public void onStart(ITestContext arg0) {
		int x = arg0.getAllTestMethods().length;
	}
//	------------------------------------------------------------------------------------------
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}
//	------------------------------------------------------------------------------------------
	
	@Override				//FAILED
	public void onTestFailure(ITestResult arg0) {
		//Getting Error Message in LOG
		CharArrayWriter cw = new CharArrayWriter();
		PrintWriter w = new PrintWriter(cw);
		arg0.getThrowable().printStackTrace(w);
		w.close();
		String trace = cw.toString();
		log.error(arg0.getName()+" is Failed ! \n EXCEPTION:  --->  " + trace);
		
	/*	System.out.println(
				arg0.getName()+	" | "+					//TestName
				test.getTestData("Brand")+" | "+ 	//Brand
				"FAILED"+ 					" | "+		//Result
				TestData.testData.toString()+ " | "+	//Input
				TC.output.toString()					//Output
			);*/
		
		//Writing Result in Database
	/*	Database.saveOutputInDataBase(
			arg0.getTestName(),					//TestName
			test.getTestData("Brand"), 	//Brand
			"FAILED", 							//Result
			TestData.testData.toString(), 		//Input
			TC.output.toString()				//Output
		);*/
		
	}
	
//	------------------------------------------------------------------------------------------

	@Override				//SKIPPED
	public void onTestSkipped(ITestResult arg0) {
		log.warn(arg0.getName()+" is Skipped or Not Tested.");
		
		/*//Writing Result in Database
		Database.saveOutputInDataBase(
			arg0.getTestName(),					//TestName
			test.getTestData("Brand"), 	//Brand
			"SKIPPED", 							//Result
			TestData.testData.toString(), 		//Input
			TC.output.toString()				//Output
		);*/
	}
	
//	------------------------------------------------------------------------------------------

	@Override
	public void onTestStart(ITestResult arg0) {

		int priority = arg0.getMethod().getPriority();
		String methodName = arg0.getMethod().getMethodName();
		System.out.println("------------------------------------------------------------------------");
		log.info("TEST CASE: " + methodName + " | Priority: " + priority);

		
	}
//	------------------------------------------------------------------------------------------

	@Override				//PASSED
	public void onTestSuccess(ITestResult arg0) {
		log.info(arg0.getName()+" is Passed !");
		
		/*System.out.println(
			arg0.getName()+	" | "+					//TestName
			test.getTestData("Brand")+" | "+ 	//Brand
			"SKIPPED"+ 					" | "+		//Result
			TestData.testData.toString()+ " | "+		//Input
			TC.output.toString()				//Output
		);
		
		//Writing Result in Database
		Database.saveOutputInDataBase(
			arg0.getName(),						//TestName
			test.getTestData("Brand"), 	//Brand
			"PASSED", 							//Result
			TestData.testData.toString(), 		//Input
			TC.output.toString()				//Output
		);*/
	}
}
