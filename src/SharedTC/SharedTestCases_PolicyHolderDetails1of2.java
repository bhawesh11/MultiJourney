package SharedTC;

import ApplicationPages.PolicyholderDetails1of2;
import GenericFunctions.BrowserFactory;
import GenericFunctions.TestData;
import GenericFunctions.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class SharedTestCases_PolicyHolderDetails1of2 {

    public static Class page;
    Logger log = Logger.getLogger("Shared Test Case_Web");

    //	POLICYHOLDER-DETAILS-1
    public void policyHolderDetails1of2() {
        page = PolicyholderDetails1of2.class;
        PolicyholderDetails1of2 policyholderDetails1of2 = (PolicyholderDetails1of2) PageFactory.initElements(BrowserFactory.driver, page);
        WebFunctions.click(policyholderDetails1of2.btn_Gender, TestData.testData.get("Gender"));
        WebFunctions.click(policyholderDetails1of2.btn_MaritalStatus,TestData.testData.get("Marital Status"));
        WebFunctions.click(policyholderDetails1of2.btn_Education,TestData.testData.get("Education"));
        WebFunctions.click(policyholderDetails1of2.btn_CurrentlyEmployed,TestData.testData.get("Employment"));
        WebFunctions.click(policyholderDetails1of2.btn_Continue);
        log.info("Policy holder Details 1of2 page: Success!");
    }

    // -------------------------------------------------------------------------------------------

}
