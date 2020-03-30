package SharedTC;

import ApplicationPages.Family;
import GenericFunctions.BrowserFactory;
import GenericFunctions.TestData;
import GenericFunctions.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class SharedTestCases_Family {

    public static Class page;
    Logger log = Logger.getLogger("Shared Test Case");

    //	FAMILY
    public void family() {
        try{Thread.sleep(2000);}catch(Exception e2){};
        if(!BrowserFactory.driver.getCurrentUrl().contains("policyholder")){
            page = Family.class;
            Family family = (Family) PageFactory.initElements(BrowserFactory.driver, page);
            WebFunctions.click(family.aboutFamily, TestData.testData.get("About your family"));
            WebFunctions.click(family.btn_Next);
            log.info("Family page: "+TestData.testData.get("About your family")+" selected. Success!");
        }
    }

// -------------------------------------------------------------------------------------------
}
