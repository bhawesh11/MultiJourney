package SharedTC;

import ApplicationPages.PolicyStartDate;
import GenericFunctions.BrowserFactory;
import GenericFunctions.TestData;
import GenericFunctions.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;



public class SharedTestCases_PolicyStatrDate {
    public static Class page;
    Logger log = Logger.getLogger("Shared Test Case_Web");

    public void policyStartDate() {
        page = PolicyStartDate.class;
        PolicyStartDate policyStartDate = (PolicyStartDate) PageFactory.initElements(BrowserFactory.driver, page);
        WebFunctions.type(policyStartDate.textBox_Email, TestData.testData.get("Email"));
        WebFunctions.click(policyStartDate.btn_PaperlessDiscount, TestData.testData.get("Paperless Discount"));
        WebFunctions.click(policyStartDate.btn_ESignDiscount, TestData.testData.get("E-Signature Discount"));
      //  WebFunctions.type(policyStartDate.textBox_PolicyStartDate, TestData.testData.get("Policy Start Date"));
        WebFunctions.type(policyStartDate.textBox_Phone, TestData.testData.get("Phone Number"));
        WebFunctions.click(policyStartDate.btn_SeeMyQuote);
        log.info("Policy Start page: Success!");
    }

}
