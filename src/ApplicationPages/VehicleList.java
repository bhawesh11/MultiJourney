package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class VehicleList {
	
//	LET THE SEQUENCE ALWAYS REMAIN THE SAME AS THEY APPEAR ON THE WEBPAGE.
		@FindBy(how=How.ID,using="lnkBtnAddNewVehicle")
		public WebElement btn_AddAnotherVehicle;

	@FindBy(how=How.ID,using="btnContinue")
	public WebElement btn_Next;
}
