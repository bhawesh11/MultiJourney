package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PolicyStartDate {
	
//	LET THE SEQUENCE ALWAYS REMAIN THE SAME AS THEY APPEAR ON THE WEBPAGE.
	
	@FindBy(how=How.ID,using="discountEmail")
	public WebElement textBox_Email;
	
	public String btn_PaperlessDiscount = "//input[@id='rdPaperlessDiscount{0}']/ancestor::div/label";
	public String btn_ESignDiscount = "//input[@id='rdESignatureDiscount{0}']/ancestor::div/label";
	
	@FindBy(how=How.ID,using="policyStartDate")
	public WebElement textBox_PolicyStartDate;
	
	@FindBy(how=How.ID,using="phone")
	public WebElement textBox_Phone;
	
	@FindBy(how=How.ID,using="btnContinue")
	public WebElement btn_SeeMyQuote;
	
}
