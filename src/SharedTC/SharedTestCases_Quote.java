package SharedTC;

import ApplicationPages.Quote;
import GenericFunctions.BrowserFactory;
import GenericFunctions.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class SharedTestCases_Quote {

    public static Class page;

    Logger log = Logger.getLogger("Shared Test Case_Web");

    public void quote()
    {
        page = Quote.class;
        Quote quote = (Quote) PageFactory.initElements(BrowserFactory.driver, page);
        WebFunctions.click(quote.btn_Continue);
        log.info("Quote Page: Success!");


    }

}
