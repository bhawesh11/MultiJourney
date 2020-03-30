package GenericFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import SharedTC.SharedTestCases;

public class WebFunctions {

	static Boolean done=false;
	static int attempt = 0;
	public static WebDriverWait wait = new WebDriverWait(BrowserFactory.driver, 40);
	public static JavascriptExecutor jse = (JavascriptExecutor)BrowserFactory.driver;
	public static WebElement element;
	static Select dropdown;

//	======================================================================

//	TYPE
	public static void type(WebElement element, String value){

		done=false;
		attempt=0;
		while(!done && (attempt<3)){
			try{
				attempt++;
				wait.until(ExpectedConditions.elementToBeClickable(element));
				element.clear();
				element.sendKeys(value);
				try{Thread.sleep(1000);}catch(Exception e){};
				Utility.stop();
				done=true;
			}// Closing TRY

			catch(StaleElementReferenceException e){
				reInitPageElements();
			}//Closing CATCH-1

			catch(WebDriverException e){
				System.out.println("WebDriver Exception");
				try{Thread.sleep(1000);}catch(Exception e2){};
			}//Closing CATCH-2
		}//Closing WHILE
	}//Closing METHOD

//	======================================================================

//	TYPE DYNAMIC
public static void type(String webElement, String var1, String value) {

	webElement=webElement.replace("{0}", var1);
	try{Thread.sleep(5000);}catch(Exception e){};  // By D
	element=BrowserFactory.driver.findElement(By.xpath(webElement));
	type(element,value);

}//Closing METHOD

//	-------------------------------------------------------------------------------

	//	TYPE DYNAMIC-2
	public static void type(String webElement, String var1, String var2, String value) {

		webElement=webElement.replace("{0}", var1);
		webElement=webElement.replace("{1}", var2);
		element=BrowserFactory.driver.findElement(By.xpath(webElement));

		type(element,value);

	}//Closing METHOD



	//	CLICK ONLY
	public static void click(WebElement element) {
		done=false;
		attempt=0;
		while(!done && (attempt<3)){
			try{
				attempt++;
				wait.until(ExpectedConditions.visibilityOf(element));
				element.click();
				try{Thread.sleep(3000);}catch(Exception e){}; //D previous 2000
				Utility.stop();
				done=true;
			}// Closing TRY

			catch(StaleElementReferenceException e){
				reInitPageElements();
			}//Closing CATCH-1

			catch(WebDriverException e){
				System.out.println("WebDriver Exception");
				try{Thread.sleep(3000);}catch(Exception e2){};
			}//Closing CATCH-2
		}//Closing WHILE
	}//Closing METHOD

//	------------------------------------------------------------------------------

//	CLICK DYNAMIC
	public static void click(String webElement, String value) {

		webElement=webElement.replace("{0}", value);
//		System.out.println(webElement);
		element=BrowserFactory.driver.findElement(By.xpath(webElement));

		click(element);

	}//Closing METHOD

//	-------------------------------------------------------------------------------

//	CLICK DYNAMIC-2
	public static void click(String webElement, String value1, String value2) {

		webElement=webElement.replace("{0}", value1);
		webElement=webElement.replace("{1}", value2);
		element=BrowserFactory.driver.findElement(By.xpath(webElement));

		click(element);

	}//Closing METHOD

//	======================================================================


	//	CLICK AND BLUR
	public static void clickAndBlur(WebElement element) {
		done=false;
		attempt=0;
		while(!done && (attempt<3)){
			try{
				attempt++;
				wait.until(ExpectedConditions.visibilityOf(element));
				element.click();
				BrowserFactory.driver.findElement(By.id("ext-element-1")).click();
				try{Thread.sleep(1000);}catch(Exception e){};
				Utility.stop();
				done=true;
			}// Closing TRY

			catch(StaleElementReferenceException e){
				reInitPageElements();
			}//Closing CATCH-1

			catch(WebDriverException e){
				System.out.println("WebDriver Exception");
				try{Thread.sleep(2000);}catch(Exception e2){};
			}//Closing CATCH-2
		}//Closing WHILE
	}//Closing METHOD

//	======================================================================

//	CLICK AND BLUR (JAVASCRIPT)
	public static void clickJS(WebElement element) {
		done=false;
		attempt=0;
		while(!done && (attempt<3)){
			try{
				attempt++;
				wait.until(ExpectedConditions.visibilityOf(element));
				jse.executeScript("arguments[0].click();", element);
				try{Thread.sleep(2000);}catch(Exception e){};  //D
				Utility.stop();
				done=true;
			}// Closing TRY

			catch(StaleElementReferenceException e){
				reInitPageElements();
			}//Closing CATCH-1

			catch(WebDriverException e){
				System.out.println("WebDriver Exception");
				try{Thread.sleep(2000);}catch(Exception e2){};
			}//Closing CATCH-2
		}//Closing WHILE
	}//Closing METHOD
//	======================================================================

//	SELECT GUIDEWIRE'S DROPDOWN
	public static void dropdown(WebElement element, String value) {
		done=false;
		attempt=0;
		while(!done && (attempt<3)){
			try{
				attempt++;
				wait.until(ExpectedConditions.elementToBeClickable(element));
				dropdown= new Select(element);
				dropdown.selectByVisibleText(value);
				try{Thread.sleep(1000);}catch(Exception e){};
				Utility.stop();
				done=true;
			}// Closing TRY

			catch(StaleElementReferenceException e){
				reInitPageElements();
			}//Closing CATCH-1

//			catch(WebDriverException e){
//				System.out.println("WebDriver Exception");
//				try{Thread.sleep(2000);}catch(Exception e2){};
//			}//Closing CATCH-2
		}//Closing WHILE
	}//Closing METHOD
//	======================================================================

	//	SELECT DROPDOWN - DYNAMIC
	public static void dropdown(String webElement, String var1, String value) {

		webElement=webElement.replace("{0}", var1);
		element=BrowserFactory.driver.findElement(By.xpath(webElement));

		dropdown(element,value);

	}//Closing METHOD

//	-------------------------------------------------------------------------------

	//	SELECT DROPDOWN - DYNAMIC-2
	public static void dropdown(String webElement, String var1, String var2, String value) {

		webElement=webElement.replace("{0}", var1);
		webElement=webElement.replace("{1}", var2);
		element=BrowserFactory.driver.findElement(By.xpath(webElement));

		dropdown(element,value);

	}//Closing METHOD
	//	======================================================================

//	READ INFO FROM WEB-ELEMENT
	public static String readInfo(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
		String x=element.getText();
		try{Thread.sleep(1000);}catch(Exception e){};
		Utility.stop();
		return x;
	}
//	======================================================================

//	RE-INITIALIZE PAGE ELEMENTS
	public static void reInitPageElements(){
		System.out.println("Stale Element Exception");
		try{Thread.sleep(1000);}catch(Exception e2){};
		BrowserFactory.driver.findElement(By.id("ext-element-1")).click();
		PageFactory.initElements(BrowserFactory.driver, SharedTestCases.page);
	}
//	======================================================================
	static Actions action = new Actions(BrowserFactory.driver);
	public static void dropdownMelissaJS(WebElement element, String value) {
		done=false;
		attempt=0;
		while(!done && (attempt<3)){
			try{
				attempt++;
				wait.until(ExpectedConditions.visibilityOf(element));
				element.clear();
				action.click(element).build().perform();
				action.sendKeys(value).build().perform();
				WebElement option = BrowserFactory.driver.findElement(By.xpath("(//li/a/strong)[1]"));
				action.moveToElement(option).click().build().perform();


//				jse.executeScript("arguments[0].value='"+value+"';", element);
				try{Thread.sleep(2000);}catch(Exception e){};
//				BrowserFactory.driver.findElement(By.xpath("//li/a/strong")).click();;
				Utility.stop();
				done=true;
			}// Closing TRY

			catch(StaleElementReferenceException e){
				reInitPageElements();
			}//Closing CATCH-1

			catch(WebDriverException e){
				System.out.println("WebDriver Exception");
				try{Thread.sleep(2000);}catch(Exception e2){};
			}//Closing CATCH-2
		}//Closing WHILE
	}//Closing METHOD

	//	======================================================================

	public static void dropdownMelissaJS(String webElement, String var1, String value) {
		webElement=webElement.replace("{0}", var1);
		element=BrowserFactory.driver.findElement(By.xpath(webElement));

		dropdownMelissaJS(element,value);

	}
}
