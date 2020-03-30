package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PolicyHolder {
	
//	LET THE SEQUENCE ALWAYS REMAIN THE SAME AS THEY APPEAR ON THE WEBPAGE.
	
	@FindBy(how=How.ID,using="customerDob")
	public WebElement textBox_DOB;
	
	@FindBy(how=How.ID,using="customerFname")
	public WebElement textBox_FirstName;
	
	@FindBy(how=How.ID,using="customerLname")
	public WebElement textBox_LastName;
	
	@FindBy(how=How.ID,using="btnNext")
	public WebElement btn_Next;
}
