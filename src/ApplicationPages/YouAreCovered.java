package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class YouAreCovered {

////*[@id="congratulations-info"]/div[1]/div[1]/div[1]/div[2]


    @FindBy(how= How.XPATH,using="//*[@id=\"btnActivateAccount\"]")
    public WebElement btn_ActivateYourAccount;


}
