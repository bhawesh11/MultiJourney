package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class DriverInfo1of2 {

    @FindBy(how=How.ID,using="customerFname")
    public WebElement textBox_FirstName;

    @FindBy(how=How.ID,using="customerLname")
    public WebElement textBox_LastName;

    @FindBy(how=How.ID,using="customerDob")
    public WebElement textBox_DOB;

    public String btn_Gender="//*[@identity='genderOption']/div/label[contains(text(),'{0}')]";

    public String btn_Relationship="//*[@identity='driverRelationship']/div/label[contains(text(),'{0}')]";

    public String btn_MaritalStatus = "//*[@identity='customerMaritalStatus']/div/label[text()='{0}']";

    @FindBy(how=How.XPATH,using="//*[@id=\"btnContinue\"]")
    public WebElement btn_Continue;


}
