package SharedTC;

import ApplicationPages.Family;
import GenericFunctions.BrowserFactory;
import GenericFunctions.TestData;
import GenericFunctions.Testing;
import GenericFunctions.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class SharedTestCases_Family {

    public static Class page;
    Logger log = Logger.getLogger("Shared Test Case");

    //	FAMILY
    public void family(Testing test) {
        try{Thread.sleep(2000);}catch(Exception e2){};
        if(!test.driver.getCurrentUrl().contains("policyholder")){
            page = Family.class;
            Family family = (Family) PageFactory.initElements(test.driver, page);
            test.webFunctions().click(test,family.aboutFamily, test.getTestData("Family.Aboutyourfamily"));
            test.webFunctions().click(test,family.btn_Next);
            log.info("Family page: "+test.getTestData("Family.Aboutyourfamily")+" selected. Success!");
        }
    }

// -------------------------------------------------------------------------------------------
}
