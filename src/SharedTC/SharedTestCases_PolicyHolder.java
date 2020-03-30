package SharedTC;

import ApplicationPages.Address;
import ApplicationPages.PolicyHolder;
import GenericFunctions.BrowserFactory;
import GenericFunctions.TestData;
import GenericFunctions.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class SharedTestCases_PolicyHolder {

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

}
