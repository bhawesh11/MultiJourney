package SharedTC;

import ApplicationPages.Address;
import GenericFunctions.BrowserFactory;
import GenericFunctions.TestData;
import GenericFunctions.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class SharedTestCases_Address {

    public static Class page;
    Logger log = Logger.getLogger("Shared Test Case");

    //	ADDRESS
    public void address() {
        page = Address.class;
        Address address = (Address) PageFactory.initElements(BrowserFactory.driver, page);
        WebFunctions.dropdownMelissaJS(address.textBox_Address, TestData.testData.get("Street Address"));
//		WebFunctions.type(address.textBox_Apartment,TestData.testData.get("Apartment/Unit"));
        WebFunctions.dropdown(address.MoveInYear,TestData.testData.get("Move in Year"));
        WebFunctions.dropdown(address.MoveInMonth,TestData.testData.get("Move in Month"));
        WebFunctions.click(address.btn_ResidenceType,TestData.testData.get("Type of Residence"));
        WebFunctions.click(address.btn_Next);
        log.info("Address page: Success!");
    }

// -------------------------------------------------------------------------------------------

}
