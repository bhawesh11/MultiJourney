package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PostalCode {
	
//	LET THE SEQUENCE ALWAYS REMAIN THE SAME AS THEY APPEAR ON THE WEBPAGE.

	@FindBy(how=How.ID,using="btnPostalCode")
	public WebElement btn_LetsGetStarted;
	
	@FindBy(how=How.ID,using="")
	public WebElement btn_RetrieveSavedQuote;


}