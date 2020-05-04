package SharedTC;

import ApplicationPages.DriverInfo1of2;
import GenericFunctions.BrowserFactory;
import GenericFunctions.TestData;
import GenericFunctions.Testing;
import GenericFunctions.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class SharedTestCases_DriverInfo1of2 {

    public static Class page;
    Logger log = Logger.getLogger("Shared Test Case_Web");


    //  Additional Driver page // using this method for removedriver script
    public void driverInfo1of2(Testing test) {

        page = DriverInfo1of2.class;
        DriverInfo1of2 driverInfo1of2 = (DriverInfo1of2) PageFactory.initElements(test.driver, page);
        test.webFunctions().type(test,driverInfo1of2.textBox_FirstName, test.getTestData("SecondDriver.Second_FirstName"));
        test.webFunctions().type(test,driverInfo1of2.textBox_LastName, test.getTestData("SecondDriver.Second_LastName"));
        test.webFunctions().type(test,driverInfo1of2.textBox_DOB, test.getTestData("SecondDriver.Second_DOB"));
        test.webFunctions().click(test,driverInfo1of2.btn_Gender,test.getTestData("SecondDriver.Second_Gender"));
        test.webFunctions().click(test,driverInfo1of2.btn_Relationship,test.getTestData("SecondDriver.RelationShip"));
        test.webFunctions().click(test,driverInfo1of2.btn_MaritalStatus,test.getTestData("SecondDriver.Second_MaritalStatus"));
        test.webFunctions().click(test,driverInfo1of2.btn_Continue);
        log.info("Additional Driver 1of2 page: Success!");
    }

    public static void driverInfo_1of2(Testing test,int additionalDriver) {

        page = DriverInfo1of2.class;
        DriverInfo1of2 driverInfo1of2 = (DriverInfo1of2) PageFactory.initElements(test.driver, page);

        test.webFunctions().type(test,driverInfo1of2.textBox_FirstName, test.getTestData("AdditionalDriver."+additionalDriver+"FirstName"));
        test.webFunctions().type(test,driverInfo1of2.textBox_LastName, test.getTestData("AdditionalDriver."+additionalDriver+"LastName"));
        test.webFunctions().type(test,driverInfo1of2.textBox_DOB, test.getTestData("AdditionalDriver."+additionalDriver+"DOB"));
        test.webFunctions().click(test,driverInfo1of2.btn_Gender,test.getTestData("AdditionalDriver."+additionalDriver+"Gender"));
        test.webFunctions().click(test,driverInfo1of2.btn_Relationship,test.getTestData("AdditionalDriver."+additionalDriver+"RelationShip"));
        test.webFunctions().click(test,driverInfo1of2.btn_MaritalStatus,test.getTestData("AdditionalDriver."+additionalDriver+"MaritalStatus"));
        test.webFunctions().click(test,driverInfo1of2.btn_Continue);


    }

    // -------------------------------------------------------------------------------------------

}
