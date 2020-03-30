package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Spouse1of2 {

    @FindBy(how= How.ID,using="customerFname")
    public WebElement textBox_FirstName;

    @FindBy(how=How.ID,using="customerLname")
    public WebElement textBox_LastName;

    @FindBy(how=How.ID,using="customerDob")
    public WebElement textBox_DOB;

    public String btn_Gender="//*[@identity='genderOption']/div/label[contains(text(),'{0}')]";

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

    @FindBy(how=How.ID,using="btnContinue")
    public WebElement btn_Continue;

}
