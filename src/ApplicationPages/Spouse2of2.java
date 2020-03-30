package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Spouse2of2 {



    public String btn_ValidLicense="//*[@identity='HasValidUSLicense']/div/div/label[contains(text(),'{0}')]";
    public String btn_AgeFirstLicensed = "//*[@identity='ageLicensedOption']/div/div/label[text()='{0}']";
    public String btn_IncidentHistory = "//*[@identity='HasIncidents']/div/div/label[contains(text(),'{0}')]";

    public String btn_VehicleDriveMostOften = "//label[contains(text(),'{0}')]";
    //{0} : Year + Make + Model

    @FindBy(how= How.ID,using="btnContinue")
    public WebElement btn_Next;

}
