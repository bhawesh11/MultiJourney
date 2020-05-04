package SharedTC;

import GenericFunctions.Testing;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import ApplicationPages.DriverList;


public class SharedTestCases_DriverList {
    public static Class page;
    Logger log = Logger.getLogger("Shared Test Case_Web");

    public void driverList(Testing test) {
        page = DriverList.class;
        DriverList driverList = (DriverList) PageFactory.initElements(test.driver, page);

        int NoOfDriver = Integer.parseInt(test.getTestData("Scenario.Driver"));
        for (int additionalDriver = 2; additionalDriver <= NoOfDriver; additionalDriver++)
        {
            if (NoOfDriver != 1)
            {
                test.webFunctions().click(test,driverList.btn_AddAnotherDriver);
                SharedTestCases_DriverInfo1of2.driverInfo_1of2(test,additionalDriver);
                SharedTestCases_DriverInfo2of2.driverInfo_2of2(test,additionalDriver);

            }

        }

        test.webFunctions().click(test,driverList.btn_DoneWithDrivers);
        log.info("DriverList page: Success!");
    }


    public void driverList_RemoveDriver(Testing test) {
        page = DriverList.class;
        DriverList driverList = (DriverList) PageFactory.initElements(test.driver, page);
        test.webFunctions().click(test,driverList.btn_RemoveDriver,test.getTestData("Policyholder.Second_FirstName"));
        test.webFunctions().click(test,driverList.btn_RemoveDriverPopup);
        test.webFunctions().click(test,driverList.btn_DoneWithDrivers);
    }

}
