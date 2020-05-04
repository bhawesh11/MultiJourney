package SharedTC;

import ApplicationPages.Billing;
import GenericFunctions.BrowserFactory;
import GenericFunctions.TestData;
import GenericFunctions.Testing;
import GenericFunctions.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class SharedTestCases_Billing {

    public static Class page;
    Logger log = Logger.getLogger("Shared Test Case_Web");

    public void billing(Testing test) {
        page = Billing.class;
        Billing billing = (Billing) PageFactory.initElements(test.driver, page);
        test.webFunctions().type(test,billing.textbox_CreditCardFirstName, test.getTestData("Billing.CardHolderFirstName"));
        test.webFunctions().type(test,billing.textbox_CreditCardLastName, test.getTestData("Billing.CardHolderLastName"));
        test.webFunctions().type(test,billing.textbox_CreditCardNo, test.getTestData("Billing.CardNo"));
        test.webFunctions().type(test,billing.textbox_CreditCardExpiryDate, test.getTestData("Billing.ExpiryDate"));
        test.webFunctions().click(test,billing.btn_Purchase);
        log.info("Payment Plan page: Success!");
    }
}
