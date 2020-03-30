package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RetrieveQuote {


    @FindBy(how= How.XPATH,using="//*[@id=\"email\"]")
    public WebElement text_Email;

    @FindBy(how= How.XPATH,using="//*[@id=\"customerDob\"]")
    public WebElement text_DOB;

    @FindBy(how= How.XPATH,using="//*[@id=\"customerLname\"]")
    public WebElement text_LastName;

    @FindBy(how=How.ID,using="btnContinue")
    public WebElement btn_RetrieveQuote;

}
