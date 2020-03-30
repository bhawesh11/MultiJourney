package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Children {
	
	@FindBy(how=How.ID,using="//*[@identity='childrenOption']/div/input[@id='childrenOptionHasLittleOnes']//following-sibling::label")
	public WebElement CheckBox_LittleOnes;
	
	@FindBy(how=How.ID,using="childrenOptionHasPreTeens")
	public WebElement CheckBox_Tweens;
	
	@FindBy(how=How.ID,using="childrenOptionHasTeens")
	public WebElement CheckBox_Teens;
	
	@FindBy(how=How.ID,using="childrenOptionHasYoungAdults")
	public WebElement CheckBox_YoungAdults;
	
	@FindBy(how=How.ID,using="btnContinue")
	public WebElement btn_Next;
	
}
