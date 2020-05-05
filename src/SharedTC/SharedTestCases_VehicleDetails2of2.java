package SharedTC;

import GenericFunctions.Testing;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import ApplicationPages.VehicleDetails2of2;

public class SharedTestCases_VehicleDetails2of2 {

    public static Class page;

    Logger log = Logger.getLogger("Shared Test Case_Web");
        int check = 1;
    public void vehicleDetails2of2(Testing test) {
        page = VehicleDetails2of2.class;
        VehicleDetails2of2 vehicleDetails2of2 = (VehicleDetails2of2) PageFactory.initElements(test.driver, page);
        test.webFunctions().dropdown(test,vehicleDetails2of2.dropDown_YearBought, test.getTestData("Vehicle.V1.YearBought"));
        test.webFunctions().dropdown(test,vehicleDetails2of2.dropDown_MonthBought, test.getTestData("Vehicle.V1.MonthBought"));
        test.webFunctions().click(test,vehicleDetails2of2.btn_OwnedByYou, test.getTestData("Vehicle.V1.Ownedbyyou"));
        test.webFunctions().click(test,vehicleDetails2of2.checkBox_CustomEquipment);
        test.webFunctions().dropdown(test,vehicleDetails2of2.dropDown_EstimatedValue, test.getTestData("Vehicle.V1.EstimatedValue"));
        test.webFunctions().click(test,vehicleDetails2of2.checkBox_HandsFree);
        test.webFunctions().click(test,vehicleDetails2of2.checkBox_CrashAvoidance);
        test.webFunctions().click(test,vehicleDetails2of2.btn_Next);
        log.info("Vehicle Details 2of2 page: Success!");

    }

//This Method is called when more than 1 vehicle is added
    public static void vehicleDetails_2of2(Testing test,int additionalVehicle)
    {
        page = VehicleDetails2of2.class;
        VehicleDetails2of2 vehicleDetails2of2 = (VehicleDetails2of2) PageFactory.initElements(test.driver, page);
        test.webFunctions().dropdown(test,vehicleDetails2of2.dropDown_YearBought, test.getTestData("Vehicle.V"+additionalVehicle+".YearBought"));
        test.webFunctions().dropdown(test,vehicleDetails2of2.dropDown_MonthBought, test.getTestData("Vehicle.V"+additionalVehicle+".MonthBought"));
        test.webFunctions().click(test,vehicleDetails2of2.btn_OwnedByYou, test.getTestData("Vehicle.V"+additionalVehicle+".Ownedbyyou"));
        test.webFunctions().click(test,vehicleDetails2of2.checkBox_CustomEquipment);
        test.webFunctions().dropdown(test,vehicleDetails2of2.dropDown_EstimatedValue, test.getTestData("Vehicle.V"+additionalVehicle+".EstimatedValue"));
        test.webFunctions().click(test,vehicleDetails2of2.checkBox_HandsFree);
        test.webFunctions().click(test,vehicleDetails2of2.checkBox_CrashAvoidance);
        test.webFunctions().click(test,vehicleDetails2of2.btn_Next);


    }


}
