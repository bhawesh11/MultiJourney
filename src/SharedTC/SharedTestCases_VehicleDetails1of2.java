package SharedTC;

import ApplicationPages.VehicleDetails1of2;
import GenericFunctions.BrowserFactory;
import GenericFunctions.TestData;
import GenericFunctions.Testing;
import GenericFunctions.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class SharedTestCases_VehicleDetails1of2 {

    public static Class page;

    Logger  log = Logger.getLogger("Shared Test Case_Web");


    //TEST ===========================================================
    public void vehicleDetails1of2(Testing test) {
        page = VehicleDetails1of2.class;
        VehicleDetails1of2 vehicleDetails1of2 = (VehicleDetails1of2) PageFactory.initElements(test.driver, page);
        test.webFunctions().type(test,vehicleDetails1of2.textBox_Year, test.getTestData("Vehicle-details.Year"));
        test.webFunctions().dropdown(test,vehicleDetails1of2.dropDown_Make,test.getTestData("Vehicle-details.Make"));
        test.webFunctions().dropdown(test,vehicleDetails1of2.dropDown_Model,test.getTestData("Vehicle-details.Model"));
        test.webFunctions().dropdown(test,vehicleDetails1of2.dropDown_Style,test.getTestData("Vehicle-details.Style"));
        test.webFunctions().click(test,vehicleDetails1of2.btn_FinanceOrLease,test.getTestData("Vehicle-details.Financeorlease"));
        test.webFunctions().click(test,vehicleDetails1of2.btn_Use,test.getTestData("Vehicle-details.Use"));
        test.webFunctions().dropdown(test,vehicleDetails1of2.dropDown_Mileage,test.getTestData("Vehicle-details.Mileage"));
        test.webFunctions().click(test,vehicleDetails1of2.btn_KeptInZIP,test.getTestData("Vehicle-details.KeptinZip"));
        test.webFunctions().click(test,vehicleDetails1of2.btn_Next);
        log.info("Vehicle Details 1of2 page: Success!");
    }

    public static void vehicleDetails_1of2(Testing test,int additionalVehicle) {
        page = VehicleDetails1of2.class;
        VehicleDetails1of2 vehicleDetails1of2 = (VehicleDetails1of2) PageFactory.initElements(test.driver, page);
        //System.out.println(test.getTestData("SecondVehicle-details."+additionalVehicle+"Year"));
        test.webFunctions().type(test,vehicleDetails1of2.textBox_Year, test.getTestData("AdditionalVehicle-details."+additionalVehicle+"Year"));
        test.webFunctions().dropdown(test,vehicleDetails1of2.dropDown_Make,test.getTestData("AdditionalVehicle-details."+additionalVehicle+"Make"));
        test.webFunctions().dropdown(test,vehicleDetails1of2.dropDown_Model,test.getTestData("AdditionalVehicle-details."+additionalVehicle+"Model"));
        test.webFunctions().dropdown(test,vehicleDetails1of2.dropDown_Style,test.getTestData("AdditionalVehicle-details."+additionalVehicle+"Style"));
        test.webFunctions().click(test,vehicleDetails1of2.btn_FinanceOrLease,test.getTestData("AdditionalVehicle-details."+additionalVehicle+"Financeorlease"));
        test.webFunctions().click(test,vehicleDetails1of2.btn_Use,test.getTestData("AdditionalVehicle-details."+additionalVehicle+"Use"));
        test.webFunctions().dropdown(test,vehicleDetails1of2.dropDown_Mileage,test.getTestData("AdditionalVehicle-details."+additionalVehicle+"Mileage"));
        test.webFunctions().click(test,vehicleDetails1of2.btn_KeptInZIP,test.getTestData("AdditionalVehicle-details."+additionalVehicle+"KeptinZip"));
        test.webFunctions().click(test,vehicleDetails1of2.btn_Next);
        //log.info("Vehicle Details 1of2 page: Success!");
    }

}
