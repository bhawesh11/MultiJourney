package SharedTC;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import test.TC;
import testNGListners.ITestTransform;
import ApplicationPages.Address;
import ApplicationPages.Children;
import ApplicationPages.DriverList;
import ApplicationPages.Family;
import ApplicationPages.InsuranceHistory;
import ApplicationPages.PolicyHolder;
import ApplicationPages.PolicyHolderDetails2of2;
import ApplicationPages.PolicyStartDate;
import ApplicationPages.PolicyholderDetails1of2;
import ApplicationPages.PostalCode;
import ApplicationPages.Quote;
import ApplicationPages.VehicleDetails1of2;
import ApplicationPages.VehicleDetails2of2;
import ApplicationPages.VehicleList;
import GenericFunctions.BrowserFactory;
import GenericFunctions.WebFunctions;
import GenericFunctions.TestData;

public class SharedTestCases {

	public static Class page;
	Logger log = Logger.getLogger("Shared Test Case");

	// POSTAL CODE
	public void postalCode() {
		page = PostalCode.class;
		PostalCode postalCode = (PostalCode) PageFactory.initElements(BrowserFactory.driver, page);
		WebFunctions.click(postalCode.btn_LetsGetStarted);
		log.info("Beginning to Quote.");
	}

// -------------------------------------------------------------------------------------------

//	FAMILY
	public void family() {
		try{Thread.sleep(2000);}catch(Exception e2){};
		if(!BrowserFactory.driver.getCurrentUrl().contains("policyholder")){
			page = Family.class;
			Family family = (Family) PageFactory.initElements(BrowserFactory.driver, page);
			WebFunctions.click(family.aboutFamily, TestData.testData.get("About your family"));
			WebFunctions.click(family.btn_Next);
			log.info("Family page: "+TestData.testData.get("About your family")+" selected. Success!");
		}
	}
	
// -------------------------------------------------------------------------------------------
//	CHILDREN
	public void children(){
		try{Thread.sleep(2000);}catch(Exception e2){};
		if(!BrowserFactory.driver.getCurrentUrl().contains("policyholder")){
			page = Children.class;
			Children children = (Children) PageFactory.initElements(BrowserFactory.driver, page);
			
			WebFunctions.clickJS(children.CheckBox_LittleOnes);
			WebFunctions.click(children.btn_Next);
			log.info("Children page: Success!");
		}
	}
	
// -------------------------------------------------------------------------------------------
//	POLICY HOLDER
	public void policyholder() {
		page = PolicyHolder.class;
		PolicyHolder policyHolder = (PolicyHolder) PageFactory.initElements(BrowserFactory.driver, page);
		WebFunctions.type(policyHolder.textBox_FirstName, TestData.testData.get("First Name"));
//
		WebFunctions.type(policyHolder.textBox_LastName, TestData.testData.get("Last Name"));
		WebFunctions.type(policyHolder.textBox_DOB, TestData.testData.get("DOB"));
		WebFunctions.click(policyHolder.btn_Next);
		log.info("Policy Holder page: Success!");
	}

	//	POLICY HOLDER
	public void policyholder_Ungaraged() {
		page = PolicyHolder.class;
		PolicyHolder policyHolder = (PolicyHolder) PageFactory.initElements(BrowserFactory.driver, page);
		WebFunctions.type(policyHolder.textBox_FirstName, TestData.testData.get("First Name"));
		WebFunctions.type(policyHolder.textBox_LastName, TestData.testData.get("Last Name"));
		WebFunctions.type(policyHolder.textBox_DOB, TestData.testData.get("DOB"));
		WebFunctions.click(policyHolder.btn_Next);
//		Message Validate
		log.info("Policy Holder page: Success!");
	}

// -------------------------------------------------------------------------------------------

//	ADDRESS
	public void address() {
		page = Address.class;
		Address address = (Address) PageFactory.initElements(BrowserFactory.driver, page);
		WebFunctions.dropdownMelissaJS(address.textBox_Address,TestData.testData.get("Street Address"));
//		WebFunctions.type(address.textBox_Apartment,TestData.testData.get("Apartment/Unit"));
		WebFunctions.dropdown(address.MoveInYear,TestData.testData.get("Move in Year"));
		WebFunctions.dropdown(address.MoveInMonth,TestData.testData.get("Move in Month"));
		WebFunctions.click(address.btn_ResidenceType,TestData.testData.get("Type of Residence"));
		WebFunctions.click(address.btn_Next);
		log.info("Address page: Success!");
	}

// -------------------------------------------------------------------------------------------

//	VEHICLE-1
	public void vehicleDetails1of2() {
		page = VehicleDetails1of2.class;
		VehicleDetails1of2 vehicleDetails1of2 = (VehicleDetails1of2) PageFactory.initElements(BrowserFactory.driver, page);
		WebFunctions.type(vehicleDetails1of2.textBox_Year,TestData.testData.get("Year"));
		WebFunctions.dropdown(vehicleDetails1of2.dropDown_Make,TestData.testData.get("Make"));
		WebFunctions.dropdown(vehicleDetails1of2.dropDown_Model,TestData.testData.get("Model"));
		WebFunctions.dropdown(vehicleDetails1of2.dropDown_Style,TestData.testData.get("Style"));
		WebFunctions.click(vehicleDetails1of2.btn_FinanceOrLease,TestData.testData.get("Finance or lease"));
		WebFunctions.click(vehicleDetails1of2.btn_Use,TestData.testData.get("Use"));
		WebFunctions.dropdown(vehicleDetails1of2.dropDown_Mileage,TestData.testData.get("Mileage"));
		WebFunctions.click(vehicleDetails1of2.btn_KeptInZIP,TestData.testData.get("Kept in Zip"));
		WebFunctions.click(vehicleDetails1of2.btn_Next);
		log.info("Vehicle Details 1of2 page: Success!");
	}

	// -------------------------------------------------------------------------------------------

//	VEHICLE-2
	public void vehicleDetails2of2() {
		page = VehicleDetails2of2.class;
		VehicleDetails2of2 vehicleDetails2of2 = (VehicleDetails2of2) PageFactory.initElements(BrowserFactory.driver, page);
		WebFunctions.dropdown(vehicleDetails2of2.dropDown_YearBought,TestData.testData.get("Year Bought"));
		WebFunctions.dropdown(vehicleDetails2of2.dropDown_MonthBought,TestData.testData.get("Month Bought"));
		WebFunctions.click(vehicleDetails2of2.btn_OwnedByYou,TestData.testData.get("Owned by you"));
		WebFunctions.click(vehicleDetails2of2.checkBox_CustomEquipment);
		WebFunctions.dropdown(vehicleDetails2of2.dropDown_EstimatedValue,TestData.testData.get("Estimated Value"));
		WebFunctions.click(vehicleDetails2of2.checkBox_HandsFree);
		WebFunctions.click(vehicleDetails2of2.checkBox_CrashAvoidance);
		WebFunctions.click(vehicleDetails2of2.btn_Next);
		log.info("Vehicle Details 2of2 page: Success!");
	}

	// -------------------------------------------------------------------------------------------

//	DRIVER LIST
	public void vehicleList() {
		page = VehicleList.class;
		VehicleList vehicleList = (VehicleList) PageFactory.initElements(BrowserFactory.driver, page);
		WebFunctions.click(vehicleList.btn_Next);
		log.info("Vehicle List page: Success!");
	}

	// -------------------------------------------------------------------------------------------

//	POLICYHOLDER-DETAILS-1
	public void policyHolderDetails1of2() {
		page = PolicyholderDetails1of2.class;
		PolicyholderDetails1of2 policyholderDetails1of2 = (PolicyholderDetails1of2) PageFactory.initElements(BrowserFactory.driver, page);
		WebFunctions.click(policyholderDetails1of2.btn_Gender,TestData.testData.get("Gender"));
		WebFunctions.click(policyholderDetails1of2.btn_MaritalStatus,TestData.testData.get("Marital Status"));
		WebFunctions.click(policyholderDetails1of2.btn_Education,TestData.testData.get("Education"));
		WebFunctions.click(policyholderDetails1of2.btn_CurrentlyEmployed,TestData.testData.get("Employment"));
		WebFunctions.click(policyholderDetails1of2.btn_Continue);
		log.info("Policy holder Details 1of2 page: Success!");
	}

	// -------------------------------------------------------------------------------------------

//	POLICYHOLDER-DETAILS-2
	public void policyHolderDetails2of2() {
		page = PolicyHolderDetails2of2.class;
		PolicyHolderDetails2of2 policyholderDetails2of2 = (PolicyHolderDetails2of2) PageFactory.initElements(BrowserFactory.driver, page);
		WebFunctions.click(policyholderDetails2of2.btn_ValidLicense,TestData.testData.get("Valid License"));
		WebFunctions.click(policyholderDetails2of2.btn_AgeFirstLicensed,TestData.testData.get("Age first licensed"));
//		WebFunctions.click(policyholderDetails2of2.btn_vehicleAssignment,TestData.testData.get("Education"));
		WebFunctions.click(policyholderDetails2of2.btn_IncidentHistory,TestData.testData.get("Incident History"));
		WebFunctions.click(policyholderDetails2of2.btn_Next);
		log.info("Policy Holder Details 2of2 page: Success!");
	}

	// -------------------------------------------------------------------------------------------

//	DRIVER LIST
	public void driverList() {
		page = DriverList.class;
		DriverList driverList = (DriverList) PageFactory.initElements(BrowserFactory.driver, page);
		WebFunctions.click(driverList.btn_DoneWithDrivers);
		log.info("Driver List page: Success!");
	}

	// -------------------------------------------------------------------------------------------

//	INSURANCE HISTORY
	public void insurnceHistory() {
		page = InsuranceHistory.class;
		InsuranceHistory insuranceHistory = (InsuranceHistory) PageFactory.initElements(BrowserFactory.driver, page);
		WebFunctions.click(insuranceHistory.btn_CurrentlyInsured, TestData.testData.get("Currently Insured"));
		WebFunctions.dropdown(insuranceHistory.dropdown_Reason,TestData.testData.get("Reason"));
		WebFunctions.click(insuranceHistory.btn_Next);

		log.info("DriverList page: Success!");
	}

	// -------------------------------------------------------------------------------------------

//	POLICY START DATE
	public void policyStartDate() {
		page = PolicyStartDate.class;
		PolicyStartDate policyStartDate = (PolicyStartDate) PageFactory.initElements(BrowserFactory.driver,page);
		WebFunctions.type(policyStartDate.textBox_Email,TestData.testData.get("Email"));
		WebFunctions.click(policyStartDate.btn_PaperlessDiscount,TestData.testData.get("Paperless Discount"));
//		WebFunctions.type(policyStartDate.btn_ESignDiscount,TestData.testData.get("E-Signature Discount"));
		WebFunctions.type(policyStartDate.textBox_Phone,TestData.testData.get("Phone Number"));
		WebFunctions.click(policyStartDate.btn_SeeMyQuote);

		log.info("PolicyStartDate page: Success!");
	}

	// -------------------------------------------------------------------------------------------

//	QUOTE
	public void quote() {
		page = Quote.class;
		Quote quote = (Quote) PageFactory.initElements(BrowserFactory.driver,page);
		System.out.println(WebFunctions.readInfo(quote.text_QuoteValue));
	}

	// -------------------------------------------------------------------------------------------

}// Closing Class
