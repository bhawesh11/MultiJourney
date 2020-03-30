package ApplicationPages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Family {

	public String aboutFamily="//*[@identity='familyOption']/div/label[text()='{0}']";
	
	@FindBy(how=How.ID,using="btnContinue")
	public WebElement btn_Next;

}
