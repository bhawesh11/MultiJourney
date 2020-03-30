package SharedTC;

import ApplicationPages.ConfirmVehicle;
import GenericFunctions.BrowserFactory;
import GenericFunctions.TestData;
import GenericFunctions.WebFunctions;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

public class SharedTestCases_ConfirmVehicle {


    public static Class page;
    Logger log = Logger.getLogger("Shared Test Case_Web");

    public void confirmVehicle() {
        page = ConfirmVehicle.class;
        ConfirmVehicle confirmVehicle = (ConfirmVehicle) PageFactory.initElements(BrowserFactory.driver, page);
        WebFunctions.click(confirmVehicle.btn_Damage,TestData.testData.get("Model"),TestData.testData.get("Damage"));
        WebFunctions.dropdown(confirmVehicle.dropdown_PrimaryGarage,TestData.testData.get("Model"),TestData.testData.get("Parking"));
        WebFunctions.dropdownMelissaJS(confirmVehicle.textBox_LienHolder,TestData.testData.get("Model").replace(" ", ""),
        TestData.testData.get("Lienholder"));
        WebFunctions.type(confirmVehicle.textBox_VIN,TestData.testData.get("Model").replace(" ", ""),
                TestData.testData.get("VIN"));
        WebFunctions.click(confirmVehicle.btn_Next);
        log.info("ConfirmVehicle page: Success!");

    }

    public void confirmVehicle_Extra() {
        page = ConfirmVehicle.class;
        ConfirmVehicle confirmVehicle = (ConfirmVehicle) PageFactory.initElements(BrowserFactory.driver, page);

        int NoOfVehicle = Integer.parseInt(TestData.testData.get("Vehicle"));
        int j =0;
        do {
            WebFunctions.click(confirmVehicle.btn_Damage,TestData.testData.get("Model"),TestData.testData.get("Damage"));
            WebFunctions.dropdown(confirmVehicle.dropdown_PrimaryGarage,TestData.testData.get("Model"),TestData.testData.get("Parking"));
            WebFunctions.dropdownMelissaJS(confirmVehicle.textBox_LienHolder,TestData.testData.get("Model").replace(" ", ""),
                    TestData.testData.get("Lienholder"));
            WebFunctions.type(confirmVehicle.textBox_VIN,TestData.testData.get("Model").replace(" ", ""),
                    TestData.testData.get("VIN"));
        }
        while(j == NoOfVehicle);
        {
            for(int additionalCar = 1 ; additionalCar < NoOfVehicle ;additionalCar++) {
                WebFunctions.click(confirmVehicle.btn_Damage, TestData.testData.get(additionalCar+"Model"), TestData.testData.get("Damage"));
                WebFunctions.dropdown(confirmVehicle.dropdown_PrimaryGarage, TestData.testData.get(additionalCar+"Model"), TestData.testData.get("Parking"));
                WebFunctions.dropdownMelissaJS(confirmVehicle.textBox_LienHolder, TestData.testData.get(additionalCar+"Model").replace(" ", ""),
                        TestData.testData.get("Lienholder"));
                WebFunctions.type(confirmVehicle.textBox_VIN, TestData.testData.get(additionalCar+"Model").replace(" ", ""),
                        TestData.testData.get(additionalCar+"VIN"));
                j++;
            }


        }
        WebFunctions.click(confirmVehicle.btn_Next);
        log.info("ConfirmVehicle page: Success!");

    }

}
