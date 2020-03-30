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
import ApplicationPages.DriverInfo1of2;
import ApplicationPages.DriverInfo2of2;
import ApplicationPages.PostalCode;
import ApplicationPages.Quote;
import ApplicationPages.VehicleDetails1of2;
import ApplicationPages.VehicleDetails2of2;
import ApplicationPages.VehicleList;
import GenericFunctions.BrowserFactory;
import GenericFunctions.WebFunctions;
import GenericFunctions.TestData;

public class Dummy_SharedTestCases_Drivers {

    public static Class page;
    Logger log = Logger.getLogger("Shared Test Case_Web");

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
       // WebFunctions.type(policyHolder.textBox_FirstName, TestData.testData.get("First Name"));
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

//  Additional Driver page
public void driverInfo1of2() {
    page = DriverInfo1of2.class;
    DriverInfo1of2 driverInfo1of2 = (DriverInfo1of2) PageFactory.initElements(BrowserFactory.driver, page);
    WebFunctions.type(driverInfo1of2.textBox_FirstName, TestData.testData.get("Second_First Name"));
    WebFunctions.type(driverInfo1of2.textBox_LastName, TestData.testData.get("Second_Last Name"));
    WebFunctions.type(driverInfo1of2.textBox_DOB, TestData.testData.get("Second_DOB"));
    WebFunctions.click(driverInfo1of2.btn_Gender,TestData.testData.get("Second_Gender"));
    WebFunctions.click(driverInfo1of2.btn_Relationship,TestData.testData.get("RelationShip"));
    WebFunctions.click(driverInfo1of2.btn_MaritalStatus,TestData.testData.get("Second_Marital Status"));
    WebFunctions.click(driverInfo1of2.btn_Continue);
    log.info("Additional Driver 1of2 page: Success!");
}

    // -------------------------------------------------------------------------------------------

 //  Additional Driver page
    public void driverInfo2of2() {
        page = DriverInfo2of2.class;
        DriverInfo2of2 driverInfo2of2 = (DriverInfo2of2) PageFactory.initElements(BrowserFactory.driver, page);
        WebFunctions.click(driverInfo2of2.btn_ValidLicense,TestData.testData.get("Second_Valid License"));
        WebFunctions.click(driverInfo2of2.btn_AgeFirstLicensed,TestData.testData.get("Second_Age first licensed"));
        //WebFunctions.click(driverInfo2of2.btn_vehicleAssignment,TestData.testData.get(""));
        WebFunctions.click(driverInfo2of2.btn_IncidentHistory,TestData.testData.get("Second_Incident"));
        WebFunctions.click(driverInfo2of2.btn_Next);

        int NoOfDriver = Integer.parseInt(TestData.testData.get("Driver"));
        for (int i = 0; i < NoOfDriver; i++) {
            if (TestData.testData.get("Driver") != "1") {
                WebFunctions.click(driverInfo2of2.btn_AddAnotherDriver);

            }
        }


        log.info("Additional Driver 2of2 page: Success!");
    }

    // -------------------------------------------------------------------------------------------







}
