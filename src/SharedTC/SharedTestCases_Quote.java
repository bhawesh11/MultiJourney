package SharedTC;

import ApplicationPages.Quote;
import GenericFunctions.BrowserFactory;
import GenericFunctions.Testing;
import GenericFunctions.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SharedTestCases_Quote {

    public static Class page;

    Logger log = Logger.getLogger("Shared Test Case_Web");

    public void quote(Testing test) {
        page = Quote.class;
        Quote quote = (Quote) PageFactory.initElements(test.driver, page);
        test.webFunctions().click(test,quote.btn_Continue);
        log.info("Quote Page: Success!");
    }

}
