package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class VehicleDetails2of2 {
	
	@FindBy(how=How.ID,using="yearSelection_ddl")
	public WebElement dropDown_YearBought;
	
	@FindBy(how=How.ID,using="monthSelection_ddl")
	public WebElement dropDown_MonthBought;

	public String btn_OwnedByYou = "//*[@identity='originalOwner']/div/div/label[contains(text(),'{0}')]";
	
//	public String btn_TitledToYou= "";
	
	@FindBy(how=How.XPATH,using="//*[@identity='CustomEquipment']/div/div/label")
	public WebElement checkBox_CustomEquipment;
	
	@FindBy(how=How.ID,using="vehicleEquipmentAmount")
	public WebElement dropDown_EstimatedValue;
	
	@FindBy(how=How.XPATH,using="//*[@id='chkCrashAvoidance']/following-sibling::label")
	public WebElement checkBox_CrashAvoidance;
	
	@FindBy(how=How.XPATH,using="//*[@id='chkHandsFree']/following-sibling::label")
	public WebElement checkBox_HandsFree;

	@FindBy(how=How.XPATH,using="//*[@id=\"lnkBtnAddNewVehicle\"]")
	public WebElement btn_AddAnotherVehicle;

	@FindBy(how=How.ID,using="btnContinue")
	public WebElement btn_Next;
}
