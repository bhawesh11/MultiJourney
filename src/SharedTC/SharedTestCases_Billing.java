package SharedTC;

import ApplicationPages.Billing;
import GenericFunctions.BrowserFactory;
import GenericFunctions.TestData;
import GenericFunctions.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class SharedTestCases_Billing {

    public static Class page;
    Logger log = Logger.getLogger("Shared Test Case_Web");

    public void billing() {
        page = Billing.class;
        Billing billing = (Billing) PageFactory.initElements(BrowserFactory.driver, page);
        WebFunctions.type(billing.textbox_CreditCardFirstName, TestData.testData.get("CardHolder FirstName"));
        WebFunctions.type(billing.textbox_CreditCardLastName, TestData.testData.get("CardHolder LastName"));
        WebFunctions.type(billing.textbox_CreditCardNo, TestData.testData.get("Card No"));
        WebFunctions.type(billing.textbox_CreditCardExpiryDate, TestData.testData.get("Expiry Date"));
       // WebFunctions.type(billing.textbox_phoneno, TestData.testData.get(""));
        WebFunctions.click(billing.btn_Purchase);
        log.info("Payment Plan page: Success!");
    }
}
