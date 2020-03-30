package SharedTC;

import ApplicationPages.VehicleList;
import GenericFunctions.BrowserFactory;
import GenericFunctions.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import GenericFunctions.TestData;

public class SharedTestCases_VehicleList {

    public static Class page;
    Logger log = Logger.getLogger("Shared Test Case");


    //	VEHICLE LIST
    public void vehicleList() {
        page = VehicleList.class;
        VehicleList vehicleList = (VehicleList) PageFactory.initElements(BrowserFactory.driver, page);
        WebFunctions.click(vehicleList.btn_Next);

             // -------------------------------------------------------------------------------------------
    }
}
