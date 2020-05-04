package SharedTC;


import ApplicationPages.VehicleList;
import GenericFunctions.BrowserFactory;
import GenericFunctions.Testing;
import GenericFunctions.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import GenericFunctions.TestData;

public class SharedTestCases_VehicleList  {

    public static Class page;
    Logger log = Logger.getLogger("Shared Test Case");


    //	VEHICLE LIST
    public void vehicleList(Testing test)
    {
        page = VehicleList.class;
        VehicleList vehicleList = (VehicleList) PageFactory.initElements(test.driver, page);

        int NoOfVehicle = Integer.parseInt(test.getTestData("Scenario.Vehicle"));
        for (int additionalVehicle = 2; additionalVehicle <= NoOfVehicle; additionalVehicle++) //additionalVehicle resets to '2'
        {
            if (NoOfVehicle != 1)
            {
                test.webFunctions().click(test,vehicleList.btn_AddAnotherVehicle);
                SharedTestCases_VehicleDetails1of2.vehicleDetails_1of2(test,additionalVehicle);
                SharedTestCases_VehicleDetails2of2.vehicleDetails_2of2(test,additionalVehicle);

            }

        }

        test.webFunctions().click(test,vehicleList.btn_Next);
        log.info("VehicleList page: Success!");
    }


}
