package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PolicyholderDetails1of2 {
	
//	LET THE SEQUENCE ALWAYS REMAIN THE SAME AS THEY APPEAR ON THE WEBPAGE.
//	--------------------------------------------------------------------------------------------------
//	GENDER:
	
	public String btn_Gender="//*[@identity='genderOption']/div/label[contains(text(),'{0}')]";
	
	public String btn_MaritalStatus = "//*[@identity='customerMaritalStatus']/div/label[text()='{0}']";
	
	public String btn_Education = "//*[@identity='driverEducationLevel']/div/label[contains(text(),'{0}')]";
	
//	--------------------------------------------------------------------------------------------------
//	EMPLOYMENT:
	
	public String btn_CurrentlyEmployed = "//*[@identity='driverEmployment']/div/label[text()='{0}']";
	
	public String btn_MoreOption = "//*[@identity='driverEmploymentMore']/div/label[text()='{0}']";
		
	public String btn_Branch="//*[@identity='militaryBranch']/div/label[text()='{0}']";
					
	@FindBy(how=How.XPATH,using="//*[@identity='militaryBranch']/div/label[text()='{0}']")
	public WebElement dropdown_Rank;
			
	@FindBy(how=How.ID,using="driverOccupation")
	public WebElement textBox_Occupation;
	
	@FindBy(how=How.ID,using="btnNext")
	public WebElement btn_Continue;
			
	
	
}
