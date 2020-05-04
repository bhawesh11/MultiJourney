package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Quote {

//	LET THE SEQUENCE ALWAYS REMAIN THE SAME AS THEY APPEAR ON THE WEBPAGE.
	
	@FindBy(how=How.XPATH,using="//*[@id='step-quote']/div[2]/div[2]/div[1]/span[2]")
	public WebElement text_QuoteValue;

	@FindBy(how=How.ID,using="btnContinueQuote")
	public WebElement btn_Continue;

	@FindBy(how=How.ID,using="//*[@id='btnContinueWithoutCoverage']")
	public WebElement btn_ContinueWithoutCoveragePOPUP;

	//public String btn_ContinueWithoutCoveragePOPUP = "//*[@id='btnContinueWithoutCoverage']";




}
