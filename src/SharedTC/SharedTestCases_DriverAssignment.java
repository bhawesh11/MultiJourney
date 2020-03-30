package SharedTC;

import ApplicationPages.DriverAssignment;
import GenericFunctions.BrowserFactory;
import GenericFunctions.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class SharedTestCases_DriverAssignment {

    public static Class page;
    Logger log = Logger.getLogger("Shared Test Case_Web");

    public void driverAssignment() {
        page = DriverAssignment.class;
        DriverAssignment driverAssignment = (DriverAssignment) PageFactory.initElements(BrowserFactory.driver, page);
        WebFunctions.click(driverAssignment.btn_Next);
        log.info("Driver Assignment page: Success!");
    }

}
