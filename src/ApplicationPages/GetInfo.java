package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GetInfo {

    //Suspended License text
    @FindBy(how= How.XPATH,using="//*[@class='large black mt6 text-jstify']")
    public WebElement SuspendedLicenseText;

    //PolicyNumber
    @FindBy(how= How.XPATH,using="//*[@class='h5 success-message__details__policy-info__policy ng-binding']")
    public WebElement PolicyNumber;
}

