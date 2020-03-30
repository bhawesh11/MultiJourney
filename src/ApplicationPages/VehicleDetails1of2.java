package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class VehicleDetails1of2 {
//	LET THE SEQUENCE ALWAYS REMAIN THE SAME AS THEY APPEAR ON THE WEBPAGE.
	
	@FindBy(how=How.ID,using="vehicleYear")
	public WebElement textBox_Year;
	
	@FindBy(how=How.ID,using="vehicleMake")
	public WebElement dropDown_Make;
	
	@FindBy(how=How.ID,using="vehicleModel")
	public WebElement dropDown_Model;
	
	@FindBy(how=How.ID,using="vehicleBodyStyle")
	public WebElement dropDown_Style;
	
	public String btn_FinanceOrLease = "//*[@identity='vehicleOwnership']/div/div/label[contains(text(),'{0}')]";
	
	public String btn_Use = "//*[@identity='vehicleUsage']/div/label[contains(text(),'{0}')]";
	
	@FindBy(how=How.ID,using="vehicleEstMileage")
	public WebElement dropDown_Mileage;
	
	public String btn_KeptInZIP = "//*[@identity='rdCurrentZipcode']/div/div/label[contains(text(),'{0}')]";
	
	@FindBy(how=How.ID,using="btnContinue")
	public WebElement btn_Next;
	
}
