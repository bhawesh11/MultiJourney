package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Address {
	
//	LET THE SEQUENCE ALWAYS REMAIN THE SAME AS THEY APPEAR ON THE WEBPAGE.
	
	@FindBy(how=How.ID,using="customerAddress")
	public WebElement textBox_Address;
	
	@FindBy(how=How.ID,using="customerApt")
	public WebElement textBox_Apartment;
	
	@FindBy(how=How.ID,using="customerCounty")
	public WebElement dropdown_County;
	
	@FindBy(how=How.ID,using="yearSelection_ddl")
	public WebElement MoveInYear;
	
	@FindBy(how=How.ID,using="monthSelection_ddl")
	public WebElement MoveInMonth;
	
	public String btn_ResidenceType="//*[@identity='driverResidenceOwnership']/div/label[contains(text(),'{0}')]";
	
	@FindBy(how=How.ID,using="btnNext")
	public WebElement btn_Next;

}
