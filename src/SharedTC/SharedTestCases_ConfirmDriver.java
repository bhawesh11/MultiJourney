package SharedTC;

import ApplicationPages.ConfirmDriver;
import GenericFunctions.BrowserFactory;
import GenericFunctions.TestData;
import GenericFunctions.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class SharedTestCases_ConfirmDriver {

    public static Class page;
    Logger log = Logger.getLogger("Shared Test Case_Web");

    public void confirmDriver() {
        page = ConfirmDriver.class;
        ConfirmDriver confirmDriver = (ConfirmDriver) PageFactory.initElements(BrowserFactory.driver, page);
       WebFunctions.type(confirmDriver.textBox_licenseNumber,TestData.testData.get("First Name"),TestData.testData.get("License no"));
       WebFunctions.click(confirmDriver.btn_Next);
        log.info("Policy Holder page: Success!");

    }

    public void confirmDriver_Extra() {
        page = ConfirmDriver.class;
        ConfirmDriver confirmDriver = (ConfirmDriver) PageFactory.initElements(BrowserFactory.driver, page);
        int NoOfDriver = Integer.parseInt(TestData.testData.get("Driver"));
        int j = 0;

        do{
            WebFunctions.type(confirmDriver.textBox_licenseNumber,TestData.testData.get("First Name"),TestData.testData.get("License no"));
        }
        while(j == NoOfDriver);
        {
            for(int i = 1 ; i < NoOfDriver ;i++) {

                WebFunctions.type(confirmDriver.textBox_licenseNumber,TestData.testData.get(i+"First Name"),TestData.testData.get(i+"License no"));

            }

        }
        WebFunctions.click(confirmDriver.btn_Next);
        log.info("Policy Holder page: Success!");


    }

    public void confirmDriver_withSpouse() {
        page = ConfirmDriver.class;
        ConfirmDriver confirmDriver = (ConfirmDriver) PageFactory.initElements(BrowserFactory.driver, page);
        WebFunctions.type(confirmDriver.textBox_licenseNumber,TestData.testData.get("First Name"),TestData.testData.get("License no"));
        WebFunctions.type(confirmDriver.textBox_licenseNumber,TestData.testData.get("Spouse First Name"),TestData.testData.get("Spouse License no"));
        WebFunctions.click(confirmDriver.btn_Next);

    }

}
