package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



public class ConfirmVehicle {

//	LET THE SEQUENCE ALWAYS REMAIN THE SAME AS THEY APPEAR ON THE WEBPAGE.

    public String btn_Damage = "//label[contains(@for,'rdIsDamaged') and contains(@for,'{0}') and contains(@for,'{1}')]";
    // {0} = Year + Make + Model
    // {1} = Yes/No

    public String textBox_DamageDescription = "//*[contains(@id,'damageDesc') and contains(@id,'{0}')]";
    // {0} = Year + Make + Model

    public  String textBox_VIN = "//input[contains(@id,'vin') and contains(@id,'{0}')]";
    // {0} = Year + Make + Model

    public String dropdown_PrimaryGarage = "//h5[contains(text(),'{0}')]/ancestor::div[@ng-repeat='vehicle in confirmVehicleSummary.vehicles']//*[@label='Select Primarily Parking']//select[@id='primarilyParked']";
    // {0} = Year + Make + Model

    public  String textBox_LienHolder = "//input[contains(@id,'lienHolder') and contains(@id,'{0}')]";
    // {0} = Year + Make + Model

    @FindBy(how=How.ID,using="btnContinue")
    public WebElement btn_Next;


}
