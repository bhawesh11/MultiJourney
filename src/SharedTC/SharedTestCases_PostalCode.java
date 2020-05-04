package SharedTC;

import ApplicationPages.PostalCode;
import GenericFunctions.BrowserFactory;
import GenericFunctions.Testing;
import GenericFunctions.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class SharedTestCases_PostalCode {
    public static Class page;
    Logger log = Logger.getLogger("Shared Test Case");

    // POSTAL CODE
    public void postalCode(Testing test) {

        page = PostalCode.class;
        PostalCode postalCode = (PostalCode) PageFactory.initElements(test.driver, page);
        test.webFunctions().click(test,postalCode.btn_LetsGetStarted);
        log.info("Beginning to Quote.");
    }

// -------------------------------------------------------------------------------------------

}
