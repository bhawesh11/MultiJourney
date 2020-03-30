package SharedTC;

import ApplicationPages.PaymentPlan;
import GenericFunctions.BrowserFactory;
import GenericFunctions.TestData;
import GenericFunctions.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class SharedTestCases_PaymentPlan {

    public static Class page;
    Logger log = Logger.getLogger("Shared Test Case_Web");

    public void paymentPlan() {
        page = PaymentPlan.class;
        PaymentPlan paymentPlan = (PaymentPlan) PageFactory.initElements(BrowserFactory.driver, page);
        try{Thread.sleep(15000);}catch(Exception e){};
        WebFunctions.click(paymentPlan.link_PaymentPlan, TestData.testData.get("Payment Plan"));
        WebFunctions.click(paymentPlan.btn_Next);
        log.info("PaymentPlan page: Success!");
    }

}
