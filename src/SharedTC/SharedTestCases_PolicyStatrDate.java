package SharedTC;

import ApplicationPages.PolicyStartDate;
import GenericFunctions.BrowserFactory;
import GenericFunctions.TestData;
import GenericFunctions.Testing;
import GenericFunctions.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;



public class SharedTestCases_PolicyStatrDate {
    public static Class page;
    Logger log = Logger.getLogger("Shared Test Case_Web");

    public void policyStartDate(Testing test) {
        page = PolicyStartDate.class;
        PolicyStartDate policyStartDate = (PolicyStartDate) PageFactory.initElements(test.driver, page);
        test.webFunctions().type(test,policyStartDate.textBox_Email, test.getTestData("Policy-Start-date.Email"));
        test.webFunctions().click(test,policyStartDate.btn_PaperlessDiscount, test.getTestData("Policy-Start-date.PaperlessDiscount"));
        test.webFunctions().click(test,policyStartDate.btn_ESignDiscount, test.getTestData("Policy-Start-date.E-SignatureDiscount"));
      //  test.webFunctions().type(test,policyStartDate.textBox_PolicyStartDate, test.getTestData("Policy Start Date"));
        test.webFunctions().type(test,policyStartDate.textBox_Phone, test.getTestData("Policy-Start-date.PhoneNumber"));
        test.webFunctions().click(test,policyStartDate.btn_SeeMyQuote);
        log.info("Policy Start page: Success!");
    }

}
