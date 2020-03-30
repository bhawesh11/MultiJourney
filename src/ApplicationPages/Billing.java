package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class Billing {

//	LET THE SEQUENCE ALWAYS REMAIN THE SAME AS THEY APPEAR ON THE WEBPAGE.

    @FindBy(how=How.XPATH,using="//*[@id=\"billingCardholderFirstname\"]")
    public WebElement textbox_CreditCardFirstName;

    @FindBy(how=How.XPATH,using="//*[@id=\"billingCardholderLastname\"]")
    public WebElement textbox_CreditCardLastName;

    @FindBy(how=How.XPATH,using="//*[@id=\"billingCardNumber\"]")
    public WebElement textbox_CreditCardNo;

    @FindBy(how=How.XPATH,using="//*[@id=\"billingExpDate\"]")
    public WebElement textbox_CreditCardExpiryDate;

    @FindBy(how=How.XPATH,using="//*[@id=\"addressEdit\"]")
    public WebElement btn_editAddress;

    @FindBy(how=How.XPATH,using="//*[@id=\"phone\"]")
    public WebElement textbox_phoneno;

    @FindBy(how=How.XPATH,using="//*[@id=\"btnContinue\"]")
    public WebElement btn_Purchase;

}
