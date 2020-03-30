package SharedTC;

import ApplicationPages.VehicleDetails1of2;
import GenericFunctions.BrowserFactory;
import GenericFunctions.TestData;
import GenericFunctions.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class SharedTestCases_VehicleDetails1of2 {

    public static Class page;

    Logger  log = Logger.getLogger("Shared Test Case_Web");


    //TEST ===========================================================
    public void vehicleDetails1of2() {
        page = VehicleDetails1of2.class;
        VehicleDetails1of2 vehicleDetails1of2 = (VehicleDetails1of2) PageFactory.initElements(BrowserFactory.driver, page);
        WebFunctions.type(vehicleDetails1of2.textBox_Year, TestData.testData.get("Year"));
        WebFunctions.dropdown(vehicleDetails1of2.dropDown_Make,TestData.testData.get("Make"));
        WebFunctions.dropdown(vehicleDetails1of2.dropDown_Model,TestData.testData.get("Model"));
        WebFunctions.dropdown(vehicleDetails1of2.dropDown_Style,TestData.testData.get("Style"));
        WebFunctions.click(vehicleDetails1of2.btn_FinanceOrLease,TestData.testData.get("Finance or lease"));
        WebFunctions.click(vehicleDetails1of2.btn_Use,TestData.testData.get("Use"));
        WebFunctions.dropdown(vehicleDetails1of2.dropDown_Mileage,TestData.testData.get("Mileage"));
        WebFunctions.click(vehicleDetails1of2.btn_KeptInZIP,TestData.testData.get("Kept in Zip"));
        WebFunctions.click(vehicleDetails1of2.btn_Next);
        log.info("Vehicle Details 1of2 page: Success!");
    }

    public static void vehicleDetails_1of2(int additionalCar) {
        page = VehicleDetails1of2.class;
        VehicleDetails1of2 vehicleDetails1of2 = (VehicleDetails1of2) PageFactory.initElements(BrowserFactory.driver, page);
        WebFunctions.type(vehicleDetails1of2.textBox_Year, TestData.testData.get(additionalCar+"Year"));
        WebFunctions.dropdown(vehicleDetails1of2.dropDown_Make,TestData.testData.get(additionalCar+"Make"));
        WebFunctions.dropdown(vehicleDetails1of2.dropDown_Model,TestData.testData.get(additionalCar+"Model"));
        WebFunctions.dropdown(vehicleDetails1of2.dropDown_Style,TestData.testData.get(additionalCar+"Style"));
        WebFunctions.click(vehicleDetails1of2.btn_FinanceOrLease,TestData.testData.get("Finance or lease"));
        WebFunctions.click(vehicleDetails1of2.btn_Use,TestData.testData.get("Use"));
        WebFunctions.dropdown(vehicleDetails1of2.dropDown_Mileage,TestData.testData.get("Mileage"));
        WebFunctions.click(vehicleDetails1of2.btn_KeptInZIP,TestData.testData.get("Kept in Zip"));
        WebFunctions.click(vehicleDetails1of2.btn_Next);
        //log.info("Vehicle Details 1of2 page: Success!");
    }

}
