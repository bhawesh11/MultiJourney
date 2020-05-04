package SharedTC;

import ApplicationPages.DriverList;
import ApplicationPages.InsuranceHistory;
import ApplicationPages.PolicyHolder;
import GenericFunctions.BrowserFactory;
import GenericFunctions.TestData;
import GenericFunctions.Testing;
import GenericFunctions.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class SharedTestCases_InsuranceHistory {

    public static Class page;
    Logger log = Logger.getLogger("Shared Test Case_Web");

    public void insuranceHistory_Yes(Testing test) {
        page = InsuranceHistory.class;
        InsuranceHistory insuranceHistory = (InsuranceHistory) PageFactory.initElements(test.driver, page);
        test.webFunctions().click(test,insuranceHistory.btn_CurrentlyInsured,test.getTestData("InsuranceHistory.CurrentlyInsured"));
        test.webFunctions().dropdown(test,insuranceHistory.dropdown_InsuranceProvider, test.getTestData("InsuranceHistory.CurrentInsuranceProvider"));
        test.webFunctions().dropdown(test,insuranceHistory.dropdown_YearsWithCurrentInsuranceProvider, test.getTestData("InsuranceHistory.YearswithCurrentInsurer"));
        test.webFunctions().dropdown(test,insuranceHistory.dropdown_BILimit, test.getTestData("InsuranceHistory.BILimit"));
        test.webFunctions().dropdown(test,insuranceHistory.dropdown_Uninsured, test.getTestData("InsuranceHistory.Uninsuredinlast3years"));
        test.webFunctions().click(test,insuranceHistory.btn_Next);
        log.info("Insurance History page: Success!");
    }
    // -------------------------------------------------------------------------------------------


    public void insuranceHistory_No(Testing test) {
        page = InsuranceHistory.class;
        InsuranceHistory insuranceHistory = (InsuranceHistory) PageFactory.initElements(test.driver, page);
        test.webFunctions().click(test,insuranceHistory.btn_CurrentlyInsured,test.getTestData("InsuranceHistory.CurrentlyInsured"));
        test.webFunctions().dropdown(test,insuranceHistory.dropdown_Reason, test.getTestData("InsuranceHistory.Reason"));
        test.webFunctions().click(test,insuranceHistory.btn_Next);
        log.info("Insurance History page: Success!");
    }

    // -------------------------------------------------------------------------------------------



}
