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

    @FindBy(how= How.XPATH, using="//*[@id='quote-termination']/div/div/div/div/[contains(text(),'Every insurer determines its own criteria regarding which potential policyholders to insure.')]")
    public WebElement DUIMessage;

    @FindBy(how= How.XPATH,using="//*[@class='heading darkblue']")
    public WebElement message_TerminationTitle;

    @FindBy(how=How.XPATH,using="//*[@id='quote-termination']/div[1]/div/div")
    public WebElement message_TerminationMessage;

}

