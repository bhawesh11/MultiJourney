package SharedTC;

import ApplicationPages.DriverInfo1of2;
import GenericFunctions.BrowserFactory;
import GenericFunctions.TestData;
import GenericFunctions.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class SharedTestCases_DriverInfo1of2 {

    public static Class page;
    Logger log = Logger.getLogger("Shared Test Case_Web");


    //  Additional Driver page
    public void driverInfo1of2() {

        page = DriverInfo1of2.class;
        DriverInfo1of2 driverInfo1of2 = (DriverInfo1of2) PageFactory.initElements(BrowserFactory.driver, page);
        System.out.println(TestData.testData.get("Second_First Name"));
        WebFunctions.type(driverInfo1of2.textBox_FirstName, TestData.testData.get("Second_First Name"));
        WebFunctions.type(driverInfo1of2.textBox_LastName, TestData.testData.get("Second_Last Name"));
        WebFunctions.type(driverInfo1of2.textBox_DOB, TestData.testData.get("Second_DOB"));
        WebFunctions.click(driverInfo1of2.btn_Gender,TestData.testData.get("Second_Gender"));
        WebFunctions.click(driverInfo1of2.btn_Relationship,TestData.testData.get("RelationShip"));
        WebFunctions.click(driverInfo1of2.btn_MaritalStatus,TestData.testData.get("Second_Marital Status"));
        WebFunctions.click(driverInfo1of2.btn_Continue);
        log.info("Additional Driver 1of2 page: Success!");
    }

    public static void driverInfo_1of2(int additionalDriver) {

        page = DriverInfo1of2.class;
        DriverInfo1of2 driverInfo1of2 = (DriverInfo1of2) PageFactory.initElements(BrowserFactory.driver, page);

        WebFunctions.type(driverInfo1of2.textBox_FirstName, TestData.testData.get(additionalDriver+"First Name"));
        WebFunctions.type(driverInfo1of2.textBox_LastName, TestData.testData.get(additionalDriver+"Last Name"));
        WebFunctions.type(driverInfo1of2.textBox_DOB, TestData.testData.get(additionalDriver+"DOB"));
        WebFunctions.click(driverInfo1of2.btn_Gender,TestData.testData.get(additionalDriver+"Gender"));
        WebFunctions.click(driverInfo1of2.btn_Relationship,TestData.testData.get(additionalDriver+"RelationShip"));
        WebFunctions.click(driverInfo1of2.btn_MaritalStatus,TestData.testData.get(additionalDriver+"Marital Status"));
        WebFunctions.click(driverInfo1of2.btn_Continue);

    }

    // -------------------------------------------------------------------------------------------

}
