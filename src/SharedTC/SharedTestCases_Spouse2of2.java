package SharedTC;

import ApplicationPages.Spouse2of2;
import GenericFunctions.BrowserFactory;
import GenericFunctions.TestData;
import GenericFunctions.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class SharedTestCases_Spouse2of2 {

    public static Class page;
    Logger log = Logger.getLogger("Shared Test Case_Web");
    public void Spouse2of2() {
        page = Spouse2of2.class;
        Spouse2of2 spouse = (Spouse2of2) PageFactory.initElements(BrowserFactory.driver, page);

        WebFunctions.click(spouse.btn_ValidLicense, TestData.testData.get("Spouse Valid License"));
        WebFunctions.click(spouse.btn_AgeFirstLicensed, TestData.testData.get("Spouse Age first licensed"));
        WebFunctions.click(spouse.btn_IncidentHistory, TestData.testData.get("Spouse Incident"));
        WebFunctions.click(spouse.btn_Next);
        log.info("Partner page 2of2 : Success!");
    }
}
