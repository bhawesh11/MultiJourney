package SharedTC;

import ApplicationPages.Address;
import ApplicationPages.PolicyHolder;
import GenericFunctions.BrowserFactory;
import GenericFunctions.TestData;
import GenericFunctions.Testing;
import GenericFunctions.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.apache.commons.lang3.RandomStringUtils;

public class SharedTestCases_PolicyHolder {

    public static Class page;
    Logger log = Logger.getLogger("Shared Test Case_Web");

    public void policyholder(Testing test) {
        page = PolicyHolder.class;

        String randomString = RandomStringUtils.random(5,true,false);
        PolicyHolder policyHolder = (PolicyHolder) PageFactory.initElements(test.driver, page);
        System.out.println(test.getTestData("Policyholder.FirstName"));
        test.webFunctions().type(test,policyHolder.textBox_FirstName, test.getTestData("Policyholder.FirstName"));
       // System.out.print(test.getTestData("Policyholder.LastName"+randomString));
        test.webFunctions().type(test,policyHolder.textBox_LastName, test.getTestData("Policyholder.LastName")+randomString);
        test.webFunctions().type(test,policyHolder.textBox_DOB, test.getTestData("Policyholder.DOB"));
        test.webFunctions().click(test,policyHolder.btn_Next);
        log.info("Policy Holder page: Success!");
    }

    public void address(Testing test) {
        page = Address.class;
        Address address = (Address) PageFactory.initElements(test.driver, page);
        test.webFunctions().dropdownMelissaJS(test,address.textBox_Address,test.getTestData("Policyholder.StreetAddress"));
//		test.webFunctions().type(address.textBox_Apartment,test.getTestData("Apartment/Unit"));
        test.webFunctions().dropdown(test,address.MoveInYear,test.getTestData("Policyholder.MoveinYear"));
        test.webFunctions().dropdown(test,address.MoveInMonth,test.getTestData("Policyholder.MoveinMonth"));
        test.webFunctions().click(test,address.btn_ResidenceType,test.getTestData("Policyholder.TypeofResidence"));
        test.webFunctions().click(test,address.btn_Next);
        log.info("Address page: Success!");
    }

    // -------------------------------------------------------------------------------------------

}
