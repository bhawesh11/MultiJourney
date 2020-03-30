package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DriverAssignment {

    @FindBy(how= How.ID,using="btnNext")
    public WebElement btn_Next;
}
