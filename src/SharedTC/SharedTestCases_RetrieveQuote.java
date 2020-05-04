package SharedTC;

import GenericFunctions.BrowserFactory;
import GenericFunctions.TestData;
import GenericFunctions.Testing;
import GenericFunctions.WebFunctions;
import org.apache.log4j.Logger;
import ApplicationPages.RetrieveQuote;
import org.openqa.selenium.support.PageFactory;

public class SharedTestCases_RetrieveQuote {

    public static Class page;

    Logger log = Logger.getLogger("Shared Test Case_Web");

    public void RetrieveQuote(Testing test)
    {
        page = RetrieveQuote.class;
        RetrieveQuote retrieveQuote = (RetrieveQuote) PageFactory.initElements(test.driver, page);
       // test.webFunctions().click(retrieveQuote.btn_RetrieveSavedQuote);
        test.webFunctions().type(test,retrieveQuote.text_Email, test.getTestData("Policyholder.Email"));
        test.webFunctions().type(test,retrieveQuote.text_DOB, test.getTestData("Policyholder.DOB"));
        test.webFunctions().type(test,retrieveQuote.text_LastName, test.getTestData("Policyholder.LastName"));
        test.webFunctions().click(test,retrieveQuote.btn_RetrieveQuote);
        log.info("RetrieveQuote Page: Success!");
    }
}
