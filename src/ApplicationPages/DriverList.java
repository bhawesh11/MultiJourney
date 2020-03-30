package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DriverList {
//	LET THE SEQUENCE ALWAYS REMAIN THE SAME AS THEY APPEAR ON THE WEBPAGE.
	
	@FindBy(how=How.ID,using="btnContinue")
	public WebElement btn_DoneWithDrivers;

	@FindBy(how=How.XPATH,using="//*[@id=\"lnkBtnAddNewVehicle\"]")
	public WebElement btn_AddAnotherDriver;

}
