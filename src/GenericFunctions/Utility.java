package GenericFunctions;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility {
	
//	@FindBy(how=How.XPATH,using="//a[text()='Home']")
	static WebDriverWait wait=new WebDriverWait(BrowserFactory.driver, 40);
	static JavascriptExecutor executor = (JavascriptExecutor)BrowserFactory.driver;
	static String pageLoadStatus = null;
	static Logger log = Logger.getLogger("Navigate");
//	------------------------------------------------------------------------------------------
	public static void acceptAlert() throws InterruptedException{
		Thread.sleep(2000);
		Alert alert = BrowserFactory.driver.switchTo().alert();
		alert.accept();
	}//closing acceptAlert method
//	------------------------------------------------------------------------------------------
	public static String cHandle = null;
		
//	Switching between Windows
	public static void waitForNewWindowAndSwitchToIt() throws InterruptedException {
		WebDriver driver = BrowserFactory.driver;
		cHandle = driver.getWindowHandle();
		String newWindowHandle = null;
		Set<String> allWindowHandles = driver.getWindowHandles();
	        
		//Wait for 20 seconds for the new window and throw exception if not found
	        for (int i = 0; i < 20; i++) {
	            if (allWindowHandles.size() > 1) {
	                for (String allHandlers : allWindowHandles) {
	                    if (!allHandlers.equals(cHandle))
	                    	newWindowHandle = allHandlers;
	                }//closing FOR loop
	                driver.switchTo().window(newWindowHandle);
	                break;
	            } else {
	                Thread.sleep(1000);
	            }//closing IF-ELSE blocks
	        }//closing Outer FOR loop
	        if (cHandle == newWindowHandle) {
	            throw new RuntimeException(
	                    "Time out - No window found");
	        }
	}//closing waitForNewWindowAndSwitchToIt method
//	-----------------------------------------------------------------------------------
	
//	Switching back to main window
	public static void returnToMainWindow(){
		BrowserFactory.driver.switchTo().window(cHandle);
	}
	
	
//	-----------------------------------------------------------------------------------
	
//	Explicit wait
	public static void stop(WebElement webElement) throws InterruptedException{
		try{
			wait.until(ExpectedConditions.visibilityOf(webElement));
		}
		catch(Exception e){
			log.error("Explicit wait failed. Performing static wait.");
			Thread.sleep(7000);
		}
	}

	public static void stop(String titleString) throws InterruptedException{
		try{
			wait.until(ExpectedConditions.titleContains(titleString));
		}
		catch(Exception e){
			log.error("Explicit wait failed. Performing static wait.");
			Thread.sleep(7000);
		}
	}
	
	public static void stop() {
		pageLoadStatus = (String)executor.executeScript("return document.readyState");
		
		double i=0;
		while(!pageLoadStatus.equals("complete")){
			try{
				Thread.sleep(500);
				pageLoadStatus = (String)executor.executeScript("return document.readyState");
				i=i+0.5;
			}
			catch(Exception e){
				System.out.println("WAIT FOR THE PAGE NOT WORKING.");
			}
			
		}
//		log.info("Page active in "+i+" seconds.");
		} 
	
//	----------------------------------------------------------------------------------------
	
	public static void stop(int timer){
		try{Thread.sleep(timer);}catch(Exception e){}
	}
//	----------------------------------------------------------------------------------------
	
	public static void click(WebElement webElement){
		try{
			stop(webElement);
			executor.executeScript("arguments[0].click();", webElement);
			stop();
		}
		catch(Exception e){
			log.error("JS click failed. Performing selenium click.");
			webElement.click();
		}
	}
	
//	----------------------------------------------------------------------------------------
	
	public static void enterText(WebElement webelement, String Value) {
		stop();
		wait.until(ExpectedConditions.elementToBeClickable(webelement));
		webelement.click();
		webelement.sendKeys(Keys.BACK_SPACE);
		webelement.sendKeys(Value);
		BrowserFactory.driver.findElement(By.id("ext-element-1"));
		try{Thread.sleep(3000);}catch(Exception e){}
		stop();
	}
//	----------------------------------------------------------------------------------------
	static Actions actions = new Actions(BrowserFactory.driver);
	public static String selectDropdownGW(WebElement webelement, String value) {
		wait.until(ExpectedConditions.elementToBeClickable(webelement));
		actions.click(webelement)
			    .keyDown(Keys.CONTROL)
			    .sendKeys("a")
			    .keyUp(Keys.CONTROL)
			    .sendKeys(Keys.BACK_SPACE)
			    .build()
			    .perform();
		actions.moveToElement(webelement).click();
		actions.sendKeys(value).sendKeys(Keys.TAB);
		actions.build().perform();
		try{Thread.sleep(3000);}catch(Exception e){}
		stop();
		return webelement.getAttribute("value");
	}
	
	
//	 to be reconsidered____	
	
	
	
	public static String selectDropdown(WebElement webelement, String value) {
//		System.out.println(webelement.getAttribute("value"));
		click(webelement);
		try{Thread.sleep(1000);}catch(Exception e){}
		while(webelement.getAttribute("value").equals(value)){
			webelement.sendKeys(Keys.DOWN);
			webelement.sendKeys(Keys.RETURN);
		}
		
		
//		wait.until(ExpectedConditions.elementToBeClickable(webelement));
//		webelement.clear();
//		webelement.sendKeys(Value);
//		webelement.sendKeys(Keys.TAB);
//		try{Thread.sleep(1000);}catch(Exception e){}
//		stop();
		return webelement.getAttribute("value");
	}
	
//	----------------------------------------------------------------------------------------
	
	public static String dropDownElementCount(WebElement element, String value){
		
		Select select = new Select(element);
		select.deselectAll();
		select.selectByVisibleText(value);
	
		return select.getFirstSelectedOption().getText();
	}
	
	public static String dropDownReturnSelectValue(WebElement element){
		
		Select select = new Select(element);
		
		return select.getFirstSelectedOption().getText();
	}
//	----------------------------------------------------------------------------------------

	
	public static String todayDate(){
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDateTime now = LocalDateTime.now();
		String date = dtf.format(now);
		return date; 
	}
	
	public static void checkBoxSelect(WebElement element){
		if(!element.isSelected())
			element.click();
	}
	
	public static Boolean checkBoxIsSelected(WebElement element){
		return element.isSelected();
	}
	
	public static String radioButtonIsSelected(List<WebElement> button){
		String str="None";
		for(WebElement ele: button){
			str = ele.getAttribute("value");
			if(ele.isSelected())
				return str;
		}
		return str;
	}
	
	public static Boolean radioButtonIsDisabled(List<WebElement> button){
		int count=0;
		for(WebElement ele: button){
			if(!ele.isEnabled()){
				count++;
			}
		}
		if(count==button.size())
			return false;
		return true;
	}
	
	public static Boolean elementIsDisabled(WebElement button){
		if(!button.isEnabled())
			return false;
		return true;
	}
	
	
}//closing class