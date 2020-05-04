package SharedTC;

import ApplicationPages.PolicyholderDetails1of2;
import GenericFunctions.BrowserFactory;
import GenericFunctions.TestData;
import GenericFunctions.Testing;
import GenericFunctions.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class SharedTestCases_PolicyHolderDetails1of2 {

    public static Class page;
    Logger log = Logger.getLogger("Shared Test Case_Web");

    //	POLICYHOLDER-DETAILS-1
    public void policyHolderDetails1of2(Testing test) {
        page = PolicyholderDetails1of2.class;
        PolicyholderDetails1of2 policyholderDetails1of2 = (PolicyholderDetails1of2) PageFactory.initElements(test.driver, page);
        test.webFunctions().click(test,policyholderDetails1of2.btn_Gender, test.getTestData("PolicyholderDetails.Gender"));
        test.webFunctions().click(test,policyholderDetails1of2.btn_MaritalStatus,test.getTestData("PolicyholderDetails.MaritalStatus"));
        test.webFunctions().click(test,policyholderDetails1of2.btn_Education,test.getTestData("PolicyholderDetails.Education"));
        test.webFunctions().click(test,policyholderDetails1of2.btn_CurrentlyEmployed,test.getTestData("PolicyholderDetails.Employment"));
        test.webFunctions().click(test,policyholderDetails1of2.btn_Continue);
        log.info("Policy holder Details 1of2 page: Success!");
    }

    // -------------------------------------------------------------------------------------------

}
