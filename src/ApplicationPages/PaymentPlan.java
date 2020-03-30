package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



public class PaymentPlan {

//	LET THE SEQUENCE ALWAYS REMAIN THE SAME AS THEY APPEAR ON THE WEBPAGE.

public String link_PaymentPlan = "//*[@class='payment-options']/div/label/p[contains(text(),'{0}')]";
    // {0} = Payment Plan Name

    @FindBy(how=How.ID,using="btnContinue")
    public WebElement btn_Next;
}
