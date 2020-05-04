package SharedTC;

import ApplicationPages.PaymentPlan;
import GenericFunctions.BrowserFactory;
import GenericFunctions.TestData;
import GenericFunctions.Testing;
import GenericFunctions.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class SharedTestCases_PaymentPlan {

    public static Class page;
    Logger log = Logger.getLogger("Shared Test Case_Web");

    public void paymentPlan(Testing test) {
        page = PaymentPlan.class;
        PaymentPlan paymentPlan = (PaymentPlan) PageFactory.initElements(test.driver, page);
        try{Thread.sleep(15000);}catch(Exception e){};
        test.webFunctions().click(test,paymentPlan.link_PaymentPlan, test.getTestData("PaymentPlan.PaymentPlan"));
        test.webFunctions().click(test,paymentPlan.btn_Next);
        log.info("PaymentPlan page: Success!");
    }

}
