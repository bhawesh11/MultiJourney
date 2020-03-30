package SharedTC;

import ApplicationPages.Spouse1of2;
import ApplicationPages.Spouse2of2;
import GenericFunctions.BrowserFactory;
import GenericFunctions.TestData;
import GenericFunctions.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class SharedTestCases_Spouse1of2 {

    public static Class page;
    Logger log = Logger.getLogger("Shared Test Case_Web");

    public void Spouse1of2() {
        page = Spouse1of2.class;
        Spouse1of2 spouse = (Spouse1of2) PageFactory.initElements(BrowserFactory.driver, page);

        WebFunctions.type(spouse.textBox_FirstName, TestData.testData.get("Spouse First Name"));
        WebFunctions.type(spouse.textBox_LastName, TestData.testData.get("Spouse Last Name"));
        WebFunctions.type(spouse.textBox_DOB, TestData.testData.get("Spouse DOB"));
        WebFunctions.click(spouse.btn_Gender, TestData.testData.get("Spouse Gender"));
        WebFunctions.click(spouse.btn_Education, TestData.testData.get("Spouse Education"));
        WebFunctions.click(spouse.btn_CurrentlyEmployed, TestData.testData.get("Spouse Employment"));
        WebFunctions.click(spouse.btn_Continue);
        log.info("Partner page 1of2 : Success!");
    }


}
