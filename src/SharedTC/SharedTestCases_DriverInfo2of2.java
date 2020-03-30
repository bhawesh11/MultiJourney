package SharedTC;

import ApplicationPages.DriverInfo2of2;
import GenericFunctions.BrowserFactory;
import GenericFunctions.TestData;
import GenericFunctions.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class SharedTestCases_DriverInfo2of2 {


    public static Class page;
    Logger log = Logger.getLogger("Shared Test Case_Web");

    //  Additional Driver page
    public void driverInfo2of2() {
        page = DriverInfo2of2.class;
        DriverInfo2of2 driverInfo2of2 = (DriverInfo2of2) PageFactory.initElements(BrowserFactory.driver, page);
        WebFunctions.click(driverInfo2of2.btn_ValidLicense, TestData.testData.get("Second_Valid License"));
        WebFunctions.click(driverInfo2of2.btn_AgeFirstLicensed,TestData.testData.get("Second_Age first licensed"));
        //WebFunctions.click(driverInfo2of2.btn_vehicleAssignment,TestData.testData.get(""));
        WebFunctions.click(driverInfo2of2.btn_IncidentHistory,TestData.testData.get("Second_Incident"));
        WebFunctions.click(driverInfo2of2.btn_Next);
        log.info("Additional Driver 2of2 page: Success!");
    }

    // -------------------------------------------------------------------------------------------


    public static void driverInfo_2of2(int additionalDriver) {
        page = DriverInfo2of2.class;
        DriverInfo2of2 driverInfo2of2 = (DriverInfo2of2) PageFactory.initElements(BrowserFactory.driver, page);
        int NoOfDriver = Integer.parseInt(TestData.testData.get("Driver"));
        int NoOfVehicle = Integer.parseInt(TestData.testData.get("Vehicle"));
        WebFunctions.click(driverInfo2of2.btn_ValidLicense, TestData.testData.get(additionalDriver+"Valid License"));
        WebFunctions.click(driverInfo2of2.btn_AgeFirstLicensed,TestData.testData.get(additionalDriver+"Age first licensed"));

        if(NoOfDriver >= 2 && NoOfVehicle >= 2 )
        {
            WebFunctions.click(driverInfo2of2.btn_vehicleAssignment,TestData.testData.get(additionalDriver+"Model"));
        }
        WebFunctions.click(driverInfo2of2.btn_IncidentHistory,TestData.testData.get(additionalDriver+"Incident"));
        WebFunctions.click(driverInfo2of2.btn_Next);
    }

}
