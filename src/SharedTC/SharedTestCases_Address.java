package SharedTC;

import ApplicationPages.Address;
import GenericFunctions.BrowserFactory;
import GenericFunctions.TestData;
import GenericFunctions.Testing;
import GenericFunctions.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class SharedTestCases_Address {

    public static Class page;
    Logger log = Logger.getLogger("Shared Test Case");

    //	ADDRESS
    public void address(Testing test) {
        page = Address.class;
        Address address = (Address) PageFactory.initElements(test.driver, page);
        test.webFunctions().dropdownMelissaJS(test,address.textBox_Address, test.getTestData("Address.StreetAddress"));
//		test.webFunctions().type(address.textBox_Apartment,test.getTestData("Apartment/Unit"));
        test.webFunctions().dropdown(test,address.MoveInYear,test.getTestData("Address.MoveinYear"));
        test.webFunctions().dropdown(test,address.MoveInMonth,test.getTestData("Address.MoveinMonth"));
        test.webFunctions().click(test,address.btn_ResidenceType,test.getTestData("Address.TypeofResidence"));
        test.webFunctions().click(test,address.btn_Next);
        log.info("Address page: Success!");
    }

// -------------------------------------------------------------------------------------------

}
