package SharedTC;

import ApplicationPages.DriverList;
import ApplicationPages.InsuranceHistory;
import ApplicationPages.PolicyHolder;
import GenericFunctions.BrowserFactory;
import GenericFunctions.TestData;
import GenericFunctions.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class SharedTestCases_InsuranceHistory {

    public static Class page;
    Logger log = Logger.getLogger("Shared Test Case_Web");

    public void insuranceHistory_Yes() {
        page = InsuranceHistory.class;
        InsuranceHistory insuranceHistory = (InsuranceHistory) PageFactory.initElements(BrowserFactory.driver, page);
        WebFunctions.click(insuranceHistory.btn_CurrentlyInsured,TestData.testData.get("Currently Insured"));
        WebFunctions.dropdown(insuranceHistory.dropdown_InsuranceProvider, TestData.testData.get("Current Insurance Provider"));
        WebFunctions.dropdown(insuranceHistory.dropdown_YearsWithCurrentInsuranceProvider, TestData.testData.get("Years with Current Insurer"));
        WebFunctions.dropdown(insuranceHistory.dropdown_BILimit, TestData.testData.get("BI Limit"));
        WebFunctions.dropdown(insuranceHistory.dropdown_Uninsured, TestData.testData.get("Uninsured in last 3 years"));
        WebFunctions.click(insuranceHistory.btn_Next);
        log.info("Insurance History page: Success!");
    }
    // -------------------------------------------------------------------------------------------


    public void insuranceHistory_No() {
        page = InsuranceHistory.class;
        InsuranceHistory insuranceHistory = (InsuranceHistory) PageFactory.initElements(BrowserFactory.driver, page);
        WebFunctions.click(insuranceHistory.btn_CurrentlyInsured,TestData.testData.get("Currently Insured"));
        WebFunctions.dropdown(insuranceHistory.dropdown_Reason, TestData.testData.get("Reason"));
        WebFunctions.click(insuranceHistory.btn_Next);
        log.info("Insurance History page: Success!");
    }

    // -------------------------------------------------------------------------------------------



}
