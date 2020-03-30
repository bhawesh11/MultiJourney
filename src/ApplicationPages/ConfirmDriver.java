package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class ConfirmDriver {

    //	LET THE SEQUENCE ALWAYS REMAIN THE SAME AS THEY APPEAR ON THE WEBPAGE.

    public String textBox_licenseNumber = "//*[contains(@id,'driver-{0}')]";

    public String dropdown_licenseState = "//*[contains(@id,'driverState-{0}')]";

    @FindBy(how=How.ID,using="btnNext")
    public WebElement btn_Next;

    @FindBy(how=How.NAME,using="driverLicense")
    public WebElement btn_LINO;


}
