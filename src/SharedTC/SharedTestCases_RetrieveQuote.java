package SharedTC;

import GenericFunctions.BrowserFactory;
import GenericFunctions.TestData;
import GenericFunctions.WebFunctions;
import org.apache.log4j.Logger;
import ApplicationPages.RetrieveQuote;
import org.openqa.selenium.support.PageFactory;

public class SharedTestCases_RetrieveQuote {

    public static Class page;

    Logger log = Logger.getLogger("Shared Test Case_Web");

    public void RetrieveQuote()
    {
        page = RetrieveQuote.class;
        RetrieveQuote retrieveQuote = (RetrieveQuote) PageFactory.initElements(BrowserFactory.driver, page);
       // WebFunctions.click(retrieveQuote.btn_RetrieveSavedQuote);
        WebFunctions.type(retrieveQuote.text_Email, TestData.testData.get("Email"));
        WebFunctions.type(retrieveQuote.text_DOB, TestData.testData.get("DOB"));
        WebFunctions.type(retrieveQuote.text_LastName, TestData.testData.get("Last Name"));
        WebFunctions.click(retrieveQuote.btn_RetrieveQuote);
        log.info("RetrieveQuote Page: Success!");
    }
}
