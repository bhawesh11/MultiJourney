package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class InsuranceHistory {
	
//	LET THE SEQUENCE ALWAYS REMAIN THE SAME AS THEY APPEAR ON THE WEBPAGE.
	
	public String btn_CurrentlyInsured = "//*[@identity='rdCurrentlyInsured']/div/div/label[contains(text(),'{0}')]";

	//*[@identity='rdCurrentlyInsured']/div/div/label[contains(text(),'No')]"

	@FindBy(how=How.XPATH,using="//*[@id=\"insuranceProvider\"]")
	public WebElement dropdown_InsuranceProvider;

	@FindBy(how=How.XPATH,using="//*[@id=\"currentinsuranceyear\"]")
	public WebElement dropdown_YearsWithCurrentInsuranceProvider;

	@FindBy(how=How.XPATH,using="//*[@id=\"bodilyinjurylimits\"]")
	public WebElement dropdown_BILimit;

	@FindBy(how=How.XPATH,using="//*[@id=\"previousLapse\"]")
	public WebElement dropdown_Uninsured;

	@FindBy(how=How.ID,using="driverInsuranceReason")
	public WebElement dropdown_Reason;
	
	@FindBy(how=How.ID,using="btnNext")
	public WebElement btn_Next;
	
}
