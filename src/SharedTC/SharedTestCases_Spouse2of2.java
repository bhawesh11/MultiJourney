package SharedTC;

import ApplicationPages.Spouse2of2;
import GenericFunctions.BrowserFactory;
import GenericFunctions.TestData;
import GenericFunctions.Testing;
import GenericFunctions.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class SharedTestCases_Spouse2of2 {

    public static Class page;
    Logger log = Logger.getLogger("Shared Test Case_Web");
    public void Spouse2of2(Testing test) {
        page = Spouse2of2.class;
        Spouse2of2 spouse = (Spouse2of2) PageFactory.initElements(test.driver, page);

        test.webFunctions().click(test,spouse.btn_ValidLicense, test.getTestData("Policyholder.SpouseValidLicense"));
        test.webFunctions().click(test,spouse.btn_AgeFirstLicensed, test.getTestData("Policyholder.SpouseAgefirstlicensed"));
        test.webFunctions().click(test,spouse.btn_IncidentHistory, test.getTestData("Policyholder.SpouseIncident"));
        test.webFunctions().click(test,spouse.btn_Next);
        log.info("Partner page 2of2 : Success!");
    }
}
