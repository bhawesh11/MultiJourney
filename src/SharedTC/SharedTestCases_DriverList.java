package SharedTC;

import ApplicationPages.PolicyHolder;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import test.TC;
import testNGListners.ITestTransform;
import ApplicationPages.DriverList;
import GenericFunctions.BrowserFactory;
import GenericFunctions.WebFunctions;
import GenericFunctions.TestData;
import SharedTC.SharedTestCases_DriverInfo1of2;
import SharedTC.SharedTestCases_DriverInfo2of2;


public class SharedTestCases_DriverList {
    public static Class page;
    Logger log = Logger.getLogger("Shared Test Case_Web");

    public void driverList() {
        page = DriverList.class;
        DriverList driverList = (DriverList) PageFactory.initElements(BrowserFactory.driver, page);
        WebFunctions.click(driverList.btn_DoneWithDrivers);
        log.info("DriverList page: Success!");
    }

    public void driverList_RemoveDriver() {
        page = DriverList.class;
        DriverList driverList = (DriverList) PageFactory.initElements(BrowserFactory.driver, page);
        WebFunctions.click(driverList.btn_RemoveDriver,TestData.testData.get("Second_First Name"));
        WebFunctions.click(driverList.btn_RemoveDriverPopup);
        WebFunctions.click(driverList.btn_DoneWithDrivers);
    }


    public void driverList_Extra() {
        page = DriverList.class;
        DriverList driverList = (DriverList) PageFactory.initElements(BrowserFactory.driver, page);

        int NoOfDriver = Integer.parseInt(TestData.testData.get("Driver"));
        for (int additionalDriver = 1; additionalDriver < NoOfDriver; additionalDriver++)
        {
            if (NoOfDriver != 1)
            {
                WebFunctions.click(driverList.btn_AddAnotherDriver);
                SharedTestCases_DriverInfo1of2.driverInfo_1of2(additionalDriver);
                SharedTestCases_DriverInfo2of2.driverInfo_2of2(additionalDriver);

            }

        }

        WebFunctions.click(driverList.btn_DoneWithDrivers);
        log.info("DriverList page: Success!");
    }

}
