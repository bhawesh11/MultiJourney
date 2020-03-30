package SharedTC;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import test.TC;
import testNGListners.ITestTransform;
import ApplicationPages.Address;
import ApplicationPages.Children;
import ApplicationPages.DriverList;
import ApplicationPages.Family;
import ApplicationPages.InsuranceHistory;
import ApplicationPages.PolicyHolder;
import ApplicationPages.PolicyHolderDetails2of2;
import ApplicationPages.PolicyStartDate;
import ApplicationPages.PolicyholderDetails1of2;
import ApplicationPages.PostalCode;
import ApplicationPages.Quote;
import ApplicationPages.VehicleDetails1of2;
import ApplicationPages.VehicleDetails2of2;
import ApplicationPages.VehicleList;
import GenericFunctions.BrowserFactory;
import GenericFunctions.WebFunctions;
import GenericFunctions.TestData;
import SharedTC.SharedTestCases_VehicleDetails1of2;

public class SharedTestCases_VehicleDetails2of2 {

    public static Class page;

    Logger log = Logger.getLogger("Shared Test Case_Web");
        int check = 1;
    public void vehicleDetails2of2() {
        page = VehicleDetails2of2.class;
        VehicleDetails2of2 vehicleDetails2of2 = (VehicleDetails2of2) PageFactory.initElements(BrowserFactory.driver, page);
        WebFunctions.dropdown(vehicleDetails2of2.dropDown_YearBought, TestData.testData.get("Year Bought"));
        WebFunctions.dropdown(vehicleDetails2of2.dropDown_MonthBought, TestData.testData.get("Month Bought"));
        WebFunctions.click(vehicleDetails2of2.btn_OwnedByYou, TestData.testData.get("Owned by you"));
        WebFunctions.click(vehicleDetails2of2.checkBox_CustomEquipment);
        WebFunctions.dropdown(vehicleDetails2of2.dropDown_EstimatedValue, TestData.testData.get("Estimated Value"));
        WebFunctions.click(vehicleDetails2of2.checkBox_HandsFree);
        WebFunctions.click(vehicleDetails2of2.checkBox_CrashAvoidance);
        WebFunctions.click(vehicleDetails2of2.btn_Next);
        log.info("Vehicle Details 2of2 page: Success!");

    }


    public void vehicleDetails_2of2() // this method only works for more than 1 vehicle
    {

        page = VehicleDetails2of2.class;
        VehicleDetails2of2 vehicleDetails2of2 = (VehicleDetails2of2) PageFactory.initElements(BrowserFactory.driver, page);


        int NoOfVehicle = Integer.parseInt(TestData.testData.get("Vehicle"));
        for (int additionalCar = 1; additionalCar <= NoOfVehicle; additionalCar++) {
            if (NoOfVehicle != 1)

            {
                WebFunctions.dropdown(vehicleDetails2of2.dropDown_YearBought, TestData.testData.get("Year Bought"));
                WebFunctions.dropdown(vehicleDetails2of2.dropDown_MonthBought, TestData.testData.get("Month Bought"));
                WebFunctions.click(vehicleDetails2of2.btn_OwnedByYou, TestData.testData.get("Owned by you"));
                WebFunctions.click(vehicleDetails2of2.checkBox_CustomEquipment);
                WebFunctions.dropdown(vehicleDetails2of2.dropDown_EstimatedValue, TestData.testData.get("Estimated Value"));
                WebFunctions.click(vehicleDetails2of2.checkBox_HandsFree);
                WebFunctions.click(vehicleDetails2of2.checkBox_CrashAvoidance);


                if(check < NoOfVehicle)
                {
                    WebFunctions.click(vehicleDetails2of2.btn_AddAnotherVehicle);
                    SharedTestCases_VehicleDetails1of2.vehicleDetails_1of2(additionalCar);
                    check ++;

                }
                else
                {
                    WebFunctions.click(vehicleDetails2of2.btn_Next);
                    log.info("Vehicle Details 2of2 page: Success!");
                }


            }

            else {

                WebFunctions.dropdown(vehicleDetails2of2.dropDown_YearBought, TestData.testData.get("Year Bought"));
                WebFunctions.dropdown(vehicleDetails2of2.dropDown_MonthBought, TestData.testData.get("Month Bought"));
                WebFunctions.click(vehicleDetails2of2.btn_OwnedByYou, TestData.testData.get("Owned by you"));
                WebFunctions.click(vehicleDetails2of2.checkBox_CustomEquipment);
                WebFunctions.dropdown(vehicleDetails2of2.dropDown_EstimatedValue, TestData.testData.get("Estimated Value"));
                WebFunctions.click(vehicleDetails2of2.checkBox_HandsFree);
                WebFunctions.click(vehicleDetails2of2.checkBox_CrashAvoidance);
                WebFunctions.click(vehicleDetails2of2.btn_Next);
                log.info("Vehicle Details 2of2 page: Success!");

            }
        }


    }






}
