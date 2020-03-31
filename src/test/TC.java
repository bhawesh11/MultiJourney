package test;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Collections;
import java.util.HashMap;

import SharedTC.*;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import testNGListners.ITestTransform;
import GenericFunctions.BrowserFactory;
import GenericFunctions.Excel;
import GenericFunctions.TestData;
//import SharedTC.QuoteAndBind;

public class TC{
	
	static WebDriver driver=null;
	Logger log = Logger.getLogger("Test Suite");
	SoftAssert softAssert = new SoftAssert();
	String script;
	
	public static HashMap<String, String> output = new HashMap<String, String>();
	
//	==============================================================================================
//										*** ADDITIONAL METHODS ***
	
	@BeforeSuite
	public void openBrowser() throws InterruptedException, IOException{
//		Launch browser and login to BillingCenter
//		setUp();
		PropertyConfigurator.configure("log4j.properties");
		Collections.sort(ITestTransform.disabledTC);
		log.warn("Disabled TestCases: "+ITestTransform.disabledTC);
		driver = BrowserFactory.startBrowser(Excel.readExcelCell("Quick Sanity","C3"),Excel.readExcelCell("Quick Sanity","C4"));


	}
	
	@AfterSuite
	public void closeBrowser(){
//		Close Browser at the end of all TC
		BrowserFactory.closeBrowser();
		log.info("Browser is closed.");
	}
	
	@AfterMethod
	public void goToHomePage() throws InterruptedException{
		Thread.sleep(10000);
	}
	
	@BeforeMethod
	public void beforeMethod() throws InterruptedException{
//		output.clear();
	}
	
//	==============================================================================================
//										***_TEST_CASES_***
	
//	TC001
	@Test(enabled=false, priority=5, description="1D1V-Quote")
	public void TC001() {
		script="1D1V";
        // Use Test.xls
		SharedTestCases stc = new SharedTestCases();
		SharedTestCases_RetrieveQuote stc1 = new SharedTestCases_RetrieveQuote();
		TestData.getTestData();
		stc.postalCode();
		stc.family();
		stc.children();
		stc.policyholder();
		stc.address();
		stc.vehicleDetails1of2();
		stc.vehicleDetails2of2();
		stc.vehicleList();
		stc.policyHolderDetails1of2();
		stc.policyHolderDetails2of2();
		stc.driverList();
		stc.insurnceHistory();
		stc.policyStartDate();
		stc.quote();
		driver.navigate().to("https://quotes-qa6.elephant.dev/#/quote-retrieve");
		stc1.RetrieveQuote();

	}
	//---------------------------------------------------------------------------------------

//	TC002
   @Test(enabled=false, priority=5, description="1D1V-Quote")
	public void TC002() throws InterruptedException, IOException{
	   script="1D1V";

	   // Use Test.xls
	   TestData.getTestData();
	   SharedTestCases_PostalCode PostalCode = new SharedTestCases_PostalCode();
	   SharedTestCases_Family Family = new SharedTestCases_Family();
	   SharedTestCases_Children Children = new SharedTestCases_Children();

	   SharedTestCases_PolicyHolder PolicyHolder = new SharedTestCases_PolicyHolder();
	   SharedTestCases_Address Address = new SharedTestCases_Address();
	   SharedTestCases_VehicleDetails1of2 VehicleDetails1of2 = new SharedTestCases_VehicleDetails1of2();
	   SharedTestCases_VehicleDetails2of2 VehicleDetails2of2 = new SharedTestCases_VehicleDetails2of2();
	   SharedTestCases_VehicleList VehicleList = new SharedTestCases_VehicleList();
	   SharedTestCases_PolicyHolderDetails1of2 PolicyHolderDetails1of2 = new SharedTestCases_PolicyHolderDetails1of2();
	   SharedTestCases_PolicyHolderDetails2of2 PolicyHolderDetails2of2 = new SharedTestCases_PolicyHolderDetails2of2();
	   SharedTestCases_DriverList DriverList = new SharedTestCases_DriverList();
	   SharedTestCases_InsuranceHistory InsuranceHistory = new SharedTestCases_InsuranceHistory();
	   SharedTestCases_PolicyStatrDate PolicyStatrDate = new SharedTestCases_PolicyStatrDate();
	   SharedTestCases_Quote Quote = new SharedTestCases_Quote();
	   SharedTestCases_ConfirmDriver ConfirmDriver = new SharedTestCases_ConfirmDriver();
	   SharedTestCases_ConfirmVehicle ConfirmVehicle = new SharedTestCases_ConfirmVehicle();
	   SharedTestCases_PaymentPlan PaymentPlan = new SharedTestCases_PaymentPlan();
	   SharedTestCases_Billing Billing = new SharedTestCases_Billing();

	   PostalCode.postalCode();
	   Family.family();
	   Children.children();
	   PolicyHolder.policyholder();
	   Address.address();
	   VehicleDetails1of2.vehicleDetails1of2();
	   VehicleDetails2of2.vehicleDetails2of2();
	   VehicleList.vehicleList();
	   PolicyHolderDetails1of2.policyHolderDetails1of2();
	   PolicyHolderDetails2of2.policyHolderDetails2of2();
	   DriverList.driverList();
	   InsuranceHistory.insuranceHistory_No();
	   PolicyStatrDate.policyStartDate();
	   Quote.quote();
	   ConfirmDriver.confirmDriver();
	   ConfirmVehicle.confirmVehicle();
	   PaymentPlan.paymentPlan();
	   Billing.billing();

	}//closing TC002 method
	
//	---------------------------------------------------------------------------------------


	//	---------------------------------------------------------------------------------------

	//	TC003
	@Test(enabled=false, priority=5, description="1D1V-Quote")
	public void TC003() throws InterruptedException, IOException{
		script="1D2V";

		//
		//use sheet Test2V1D.xlsx for this one
		//
		TestData.getTestData();
		SharedTestCases_PostalCode PostalCode = new SharedTestCases_PostalCode();
		SharedTestCases_Family Family = new SharedTestCases_Family();
		SharedTestCases_Children Children = new SharedTestCases_Children();

		SharedTestCases_PolicyHolder PolicyHolder = new SharedTestCases_PolicyHolder();
		SharedTestCases_Address Address = new SharedTestCases_Address();
		SharedTestCases_VehicleDetails1of2 VehicleDetails1of2 = new SharedTestCases_VehicleDetails1of2();
		SharedTestCases_VehicleDetails2of2 VehicleDetails2of2 = new SharedTestCases_VehicleDetails2of2();
		SharedTestCases_VehicleList VehicleList = new SharedTestCases_VehicleList();
		SharedTestCases_PolicyHolderDetails1of2 PolicyHolderDetails1of2 = new SharedTestCases_PolicyHolderDetails1of2();
		SharedTestCases_PolicyHolderDetails2of2 PolicyHolderDetails2of2 = new SharedTestCases_PolicyHolderDetails2of2();
		SharedTestCases_DriverList DriverList = new SharedTestCases_DriverList();

		SharedTestCases_DriverAssignment DriverAssignment = new SharedTestCases_DriverAssignment();
		SharedTestCases_InsuranceHistory InsuranceHistory = new SharedTestCases_InsuranceHistory();
		SharedTestCases_PolicyStatrDate PolicyStatrDate = new SharedTestCases_PolicyStatrDate();
		SharedTestCases_Quote Quote = new SharedTestCases_Quote();
		SharedTestCases_ConfirmDriver ConfirmDriver = new SharedTestCases_ConfirmDriver();
		SharedTestCases_ConfirmVehicle ConfirmVehicle = new SharedTestCases_ConfirmVehicle();
		SharedTestCases_PaymentPlan PaymentPlan = new SharedTestCases_PaymentPlan();
		SharedTestCases_Billing Billing = new SharedTestCases_Billing();

		PostalCode.postalCode();
		Family.family();
		Children.children();
		PolicyHolder.policyholder();
		Address.address();
		VehicleDetails1of2.vehicleDetails1of2();
		VehicleDetails2of2.vehicleDetails_2of2();
		VehicleList.vehicleList();
		PolicyHolderDetails1of2.policyHolderDetails1of2();
		PolicyHolderDetails2of2.policyHolderDetails2of2();
		DriverList.driverList();
		InsuranceHistory.insuranceHistory_No();
		PolicyStatrDate.policyStartDate();
		Quote.quote();
		ConfirmDriver.confirmDriver();
		//a13.confirmVehicle();
		ConfirmVehicle.confirmVehicle_Extra();
		PaymentPlan.paymentPlan();
		Billing.billing();

	}//closing TC003 method

//	---------------------------------------------------------------------------------------

	//	TC004
		@Test(enabled=true, priority=5, description="1D1V-Quote")
	public void TC004() throws InterruptedException, IOException{
		script="2D1V";
		TestData.getTestData();
		SharedTestCases_PostalCode PostalCode = new SharedTestCases_PostalCode();
		SharedTestCases_Family Family = new SharedTestCases_Family();
		SharedTestCases_Children Children = new SharedTestCases_Children();
		SharedTestCases_PolicyHolder PolicyHolder = new SharedTestCases_PolicyHolder();
		SharedTestCases_Address Address = new SharedTestCases_Address();
		SharedTestCases_VehicleDetails1of2 VehicleDetails1of2 = new SharedTestCases_VehicleDetails1of2();
		SharedTestCases_VehicleDetails2of2 VehicleDetails2of2 = new SharedTestCases_VehicleDetails2of2();
		SharedTestCases_VehicleList VehicleList = new SharedTestCases_VehicleList();
		SharedTestCases_PolicyHolderDetails1of2 PolicyHolderDetails1of2 = new SharedTestCases_PolicyHolderDetails1of2();
		SharedTestCases_PolicyHolderDetails2of2 PolicyHolderDetails2of2 = new SharedTestCases_PolicyHolderDetails2of2();
		SharedTestCases_DriverList DriverList = new SharedTestCases_DriverList();
		SharedTestCases_DriverAssignment DriverAssignment = new SharedTestCases_DriverAssignment();
		SharedTestCases_InsuranceHistory InsuranceHistory = new SharedTestCases_InsuranceHistory();
		SharedTestCases_PolicyStatrDate PolicyStatrDate = new SharedTestCases_PolicyStatrDate();
		SharedTestCases_Quote Quote = new SharedTestCases_Quote();
		SharedTestCases_ConfirmDriver ConfirmDriver = new SharedTestCases_ConfirmDriver();
		SharedTestCases_ConfirmVehicle ConfirmVehicle = new SharedTestCases_ConfirmVehicle();
		SharedTestCases_PaymentPlan PaymentPlan = new SharedTestCases_PaymentPlan();
		SharedTestCases_Billing Billing = new SharedTestCases_Billing();

			PostalCode.postalCode();
			Family.family();
			Children.children();
			PolicyHolder.policyholder();
			Address.address();
			VehicleDetails1of2.vehicleDetails1of2();
			VehicleDetails2of2.vehicleDetails2of2();
			VehicleList.vehicleList();
			PolicyHolderDetails1of2.policyHolderDetails1of2();
			PolicyHolderDetails2of2.policyHolderDetails2of2();
			DriverList.driverList_Extra();
			InsuranceHistory.insuranceHistory_No();
			DriverAssignment.driverAssignment();
			PolicyStatrDate.policyStartDate();
			Quote.quote();
			ConfirmDriver.confirmDriver_Extra();
			ConfirmVehicle.confirmVehicle_Extra();
			PaymentPlan.paymentPlan();
			Billing.billing();

	}//closing TC004 method

//	---------------------------------------------------------------------------------------

	//	TC005
	@Test(enabled=true, priority=5, description="1D1V-Quote")
	public void TC005() throws InterruptedException, IOException{
		script="2D2V";
		TestData.getTestData();
		SharedTestCases_PostalCode PostalCode = new SharedTestCases_PostalCode();
		SharedTestCases_Family Family = new SharedTestCases_Family();
		SharedTestCases_Children Children = new SharedTestCases_Children();

		SharedTestCases_PolicyHolder PolicyHolder = new SharedTestCases_PolicyHolder();
		SharedTestCases_Address Address = new SharedTestCases_Address();
		SharedTestCases_VehicleDetails1of2 VehicleDetails1of2 = new SharedTestCases_VehicleDetails1of2();
		SharedTestCases_VehicleDetails2of2 VehicleDetails2of2 = new SharedTestCases_VehicleDetails2of2();
		SharedTestCases_VehicleList VehicleList = new SharedTestCases_VehicleList();
		SharedTestCases_PolicyHolderDetails1of2 PolicyHolderDetails1of2 = new SharedTestCases_PolicyHolderDetails1of2();
		SharedTestCases_PolicyHolderDetails2of2 PolicyHolderDetails2of2 = new SharedTestCases_PolicyHolderDetails2of2();
		SharedTestCases_DriverList DriverList = new SharedTestCases_DriverList();

		SharedTestCases_DriverAssignment DriverAssignment = new SharedTestCases_DriverAssignment();
		SharedTestCases_InsuranceHistory InsuranceHistory = new SharedTestCases_InsuranceHistory();
		SharedTestCases_PolicyStatrDate PolicyStatrDate = new SharedTestCases_PolicyStatrDate();
		SharedTestCases_Quote Quote = new SharedTestCases_Quote();
		SharedTestCases_ConfirmDriver ConfirmDriver = new SharedTestCases_ConfirmDriver();
		SharedTestCases_ConfirmVehicle ConfirmVehicle = new SharedTestCases_ConfirmVehicle();
		SharedTestCases_PaymentPlan PaymentPlan = new SharedTestCases_PaymentPlan();
		SharedTestCases_Billing Billing = new SharedTestCases_Billing();

		PostalCode.postalCode();
		Family.family();
		Children.children();
		PolicyHolder.policyholder();
		Address.address();
		VehicleDetails1of2.vehicleDetails1of2();
		VehicleDetails2of2.vehicleDetails_2of2();
		VehicleList.vehicleList();
		PolicyHolderDetails1of2.policyHolderDetails1of2();
		PolicyHolderDetails2of2.policyHolderDetails2of2();
		DriverList.driverList_Extra();
		InsuranceHistory.insuranceHistory_No();
		DriverAssignment.driverAssignment();
		PolicyStatrDate.policyStartDate();
		Quote.quote();
		ConfirmDriver.confirmDriver_Extra();
		ConfirmVehicle.confirmVehicle_Extra();
		PaymentPlan.paymentPlan();
		Billing.billing();


	}//closing TC005 method

	//	---------------------------------------------------------------------------------------

	//	TC006
	@Test(enabled=false, priority=5, description="1D1V-Quote")
	public void TC006() throws InterruptedException, IOException{
		script="2D1V_Spouse";
		TestData.getTestData();
		SharedTestCases_PostalCode PostalCode = new SharedTestCases_PostalCode();
		SharedTestCases_Family Family = new SharedTestCases_Family();
		SharedTestCases_Children Children = new SharedTestCases_Children();

		SharedTestCases_PolicyHolder PolicyHolder = new SharedTestCases_PolicyHolder();
		SharedTestCases_Address Address = new SharedTestCases_Address();
		SharedTestCases_VehicleDetails1of2 VehicleDetails1of2 = new SharedTestCases_VehicleDetails1of2();
		SharedTestCases_VehicleDetails2of2 VehicleDetails2of2 = new SharedTestCases_VehicleDetails2of2();
		SharedTestCases_VehicleList VehicleList = new SharedTestCases_VehicleList();
		SharedTestCases_PolicyHolderDetails1of2 PolicyHolderDetails1of2 = new SharedTestCases_PolicyHolderDetails1of2();
		SharedTestCases_PolicyHolderDetails2of2 PolicyHolderDetails2of2 = new SharedTestCases_PolicyHolderDetails2of2();

		SharedTestCases_Spouse1of2 Spouse1of2 = new SharedTestCases_Spouse1of2();
		SharedTestCases_Spouse2of2 Spouse2of2 = new SharedTestCases_Spouse2of2();
		SharedTestCases_DriverList DriverList = new SharedTestCases_DriverList();
		SharedTestCases_DriverAssignment DriverAssignment = new SharedTestCases_DriverAssignment();
		SharedTestCases_InsuranceHistory InsuranceHistory = new SharedTestCases_InsuranceHistory();
		SharedTestCases_PolicyStatrDate PolicyStatrDate = new SharedTestCases_PolicyStatrDate();
		SharedTestCases_Quote Quote = new SharedTestCases_Quote();
		SharedTestCases_ConfirmDriver ConfirmDriver = new SharedTestCases_ConfirmDriver();
		SharedTestCases_ConfirmVehicle ConfirmVehicle = new SharedTestCases_ConfirmVehicle();
		SharedTestCases_PaymentPlan PaymentPlan = new SharedTestCases_PaymentPlan();
		SharedTestCases_Billing Billing = new SharedTestCases_Billing();

		PostalCode.postalCode();
		Family.family();
		Children.children();
		PolicyHolder.policyholder();
		Address.address();
		VehicleDetails1of2.vehicleDetails1of2();
		VehicleDetails2of2.vehicleDetails2of2();
		VehicleList.vehicleList();
		PolicyHolderDetails1of2.policyHolderDetails1of2();
		PolicyHolderDetails2of2.policyHolderDetails2of2();
		Spouse1of2.Spouse1of2();
		Spouse2of2.Spouse2of2();
		DriverList.driverList_Extra();
		InsuranceHistory.insuranceHistory_Yes();
		DriverAssignment.driverAssignment();
		PolicyStatrDate.policyStartDate();
		Quote.quote();
		ConfirmDriver.confirmDriver_withSpouse();
		ConfirmVehicle.confirmVehicle_Extra();
		PaymentPlan.paymentPlan();
		Billing.billing();
//comm
	}//closing TC006 method

//	---------------------------------------------------------------------------------------

//	---------------------------------------------------------------------------------------
}//closing TC class
