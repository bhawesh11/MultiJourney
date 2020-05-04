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

import java.io.IOException;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import java.io.File;

public class WebFunctions {

	//	======================================================================

	//	TYPE
	public void type(Testing test,WebElement element, String value){
		WebDriverWait wait = new WebDriverWait(test.driver, 40);
		Boolean done = false;
		int attempt = 0;
		done=false;
		attempt=0;
		while(!done && (attempt<3)){
			try{
				attempt++;
				wait.until(ExpectedConditions.elementToBeClickable(element));
				element.clear();
				element.sendKeys(value);
				try{Thread.sleep(3000);}catch(Exception e){};
				Utility.stop(test);
				done=true;
			}// Closing TRY

			catch(StaleElementReferenceException e){
				reInitPageElements(test);
			}//Closing CATCH-1

			catch(WebDriverException e){
				System.out.println("WebDriver Exception");
				try{Thread.sleep(2000);}catch(Exception e2){};
			}//Closing CATCH-2
		}//Closing WHILE
	}//Closing METHOD

//	======================================================================

	//	TYPE DYNAMIC
	public void type(Testing test,String webElement, String var1, String value) {
		WebDriverWait wait = new WebDriverWait(test.driver, 40);
		Boolean done = false;
		int attempt = 0;
		webElement=webElement.replace("{0}", var1);
		try{Thread.sleep(5000);}catch(Exception e){};  // By D
		WebElement element=test.driver.findElement(By.xpath(webElement));
		type(test,element,value);

	}//Closing METHOD

//	-------------------------------------------------------------------------------

	//	TYPE DYNAMIC-2
	public void type(Testing test,String webElement, String var1, String var2, String value) {
		WebDriverWait wait = new WebDriverWait(test.driver, 40);
		Boolean done = false;
		int attempt = 0;
		webElement=webElement.replace("{0}", var1);
		webElement=webElement.replace("{1}", var2);
		WebElement element=test.driver.findElement(By.xpath(webElement));

		type(test,element,value);

	}//Closing METHOD


	//	------------------------------------------------------------------------------
	//	CLICK ONLY WITH WEBELEMENT PARAMETER
	public void click(Testing test,WebElement element) {
		WebDriverWait wait = new WebDriverWait(test.driver, 40);
		Boolean done = false;
		int attempt = 0;
		done=false;
		attempt=0;
		while(!done && (attempt<3)){
			try{
				attempt++;
				wait.until(ExpectedConditions.visibilityOf(element));
				element.click();
				try{Thread.sleep(4000);}catch(Exception e){}; //D previous 2000
				Utility.stop(test);
				done=true;
			}// Closing TRY

			catch(StaleElementReferenceException e){
				reInitPageElements(test);
			}//Closing CATCH-1

			catch(WebDriverException e){
				System.out.println("WebDriver Exception");
				//Screenshot(test);
				try{Thread.sleep(3000);}catch(Exception e2){};
			}//Closing CATCH-2
		}//Closing WHILE
	}//Closing METHOD

	//	------------------------------------------------------------------------------
//	CLICK DYNAMIC
	public void click(Testing test,String webElement, String value) {
		WebDriverWait wait = new WebDriverWait(test.driver, 40);
		Boolean done = false;
		int attempt = 0;

		webElement=webElement.replace("{0}", value);
		WebElement element=test.driver.findElement(By.xpath(webElement));

		click(test,element);

	}//Closing METHOD

//	-------------------------------------------------------------------------------

	//	CLICK DYNAMIC-2
	public void click(Testing test,String webElement, String value1, String value2) {
		WebDriverWait wait = new WebDriverWait(test.driver, 40);
		Boolean done = false;
		int attempt = 0;

		webElement=webElement.replace("{0}", value1);
		webElement=webElement.replace("{1}", value2);
		WebElement element=test.driver.findElement(By.xpath(webElement));

		click(test,element);

	}//Closing METHOD

//	======================================================================


	//	CLICK AND BLUR
	public void clickAndBlur(Testing test,WebElement element) {
		WebDriverWait wait = new WebDriverWait(test.driver, 40);
		Boolean done = false;
		int attempt = 0;
		done=false;
		attempt=0;
		while(!done && (attempt<3)){
			try{
				attempt++;
				wait.until(ExpectedConditions.visibilityOf(element));
				element.click();
				test.driver.findElement(By.id("ext-element-1")).click();
				try{Thread.sleep(1000);}catch(Exception e){};
				Utility.stop(test);
				done=true;
			}// Closing TRY

			catch(StaleElementReferenceException e){
				reInitPageElements(test);
			}//Closing CATCH-1

			catch(WebDriverException e){
				System.out.println("WebDriver Exception");
				try{Thread.sleep(2000);}catch(Exception e2){};
			}//Closing CATCH-2
		}//Closing WHILE
	}//Closing METHOD

//	======================================================================

	//	CLICK AND BLUR (JAVASCRIPT)
	public void clickJS(Testing test,WebElement element) {
		 JavascriptExecutor jse = (JavascriptExecutor)test.driver;
		WebDriverWait wait = new WebDriverWait(test.driver, 40);
		Boolean done = false;
		int attempt = 0;
		done=false;
		attempt=0;
		while(!done && (attempt<3)){
			try{
				attempt++;
				wait.until(ExpectedConditions.visibilityOf(element));
				jse.executeScript("arguments[0].click();", element);
				try{Thread.sleep(2000);}catch(Exception e){};  //D
				Utility.stop(test);
				done=true;
			}// Closing TRY

			catch(StaleElementReferenceException e){
				reInitPageElements(test);
			}//Closing CATCH-1

			catch(WebDriverException e){
				System.out.println("WebDriver Exception");
				try{Thread.sleep(2000);}catch(Exception e2){};
			}//Closing CATCH-2
		}//Closing WHILE
	}//Closing METHOD
//	======================================================================

	//	SELECT GUIDEWIRE'S DROPDOWN
	public void dropdown(Testing test,WebElement element, String value) {
		WebDriverWait wait = new WebDriverWait(test.driver, 40);
		Boolean done = false;
		int attempt = 0;
		done=false;
		attempt=0;
		while(!done && (attempt<3)){
			try{
				attempt++;
				wait.until(ExpectedConditions.elementToBeClickable(element));
				Select dropdown= new Select(element);
				dropdown.selectByVisibleText(value);
				try{Thread.sleep(3000);}catch(Exception e){};
				Utility.stop(test);
				done=true;
			}// Closing TRY

			catch(StaleElementReferenceException e){
				reInitPageElements(test);
			}//Closing CATCH-1

//			catch(WebDriverException e){
//				System.out.println("WebDriver Exception");
//				try{Thread.sleep(2000);}catch(Exception e2){};
//			}//Closing CATCH-2
		}//Closing WHILE
	}//Closing METHOD
//	======================================================================

	//	SELECT DROPDOWN - DYNAMIC
	public void dropdown(Testing test,String webElement, String var1, String value) {
		WebDriverWait wait = new WebDriverWait(test.driver, 40);
		Boolean done = false;
		int attempt = 0;

		webElement=webElement.replace("{0}", var1);
		WebElement element=test.driver.findElement(By.xpath(webElement));

		dropdown(test,element,value);

	}//Closing METHOD

//	-------------------------------------------------------------------------------

	//	SELECT DROPDOWN - DYNAMIC-2
	public void dropdown(Testing test,String webElement, String var1, String var2, String value) {
		WebDriverWait wait = new WebDriverWait(test.driver, 40);
		Boolean done = false;
		int attempt = 0;

		webElement=webElement.replace("{0}", var1);
		webElement=webElement.replace("{1}", var2);
		WebElement element=test.driver.findElement(By.xpath(webElement));

		dropdown(test,element,value);

	}//Closing METHOD
	//	======================================================================

	//	READ INFO FROM WEB-ELEMENT
	public String readInfo(Testing test,WebElement element) {
		WebDriverWait wait = new WebDriverWait(test.driver, 40);
		Boolean done = false;
		int attempt = 0;
		wait.until(ExpectedConditions.elementToBeClickable(element));
		String x=element.getText();
		try{Thread.sleep(1000);}catch(Exception e){};
		Utility.stop(test);
		return x;
	}
//	======================================================================

	//	RE-INITIALIZE PAGE ELEMENTS
	public void reInitPageElements(Testing test){
		System.out.println("Stale Element Exception");
		try{Thread.sleep(1000);}catch(Exception e2){};
		test.driver.findElement(By.id("ext-element-1")).click();
		PageFactory.initElements(test.driver, test.getPage());
	}
	//	======================================================================
		public void dropdownMelissaJS(Testing test,WebElement element, String value) {
		Actions action = new Actions(test.driver);
		WebDriverWait wait = new WebDriverWait(test.driver, 40);
		Boolean done = false;
		int attempt = 0;
		done=false;
		attempt=0;
		while(!done && (attempt<3)){
			try{
				attempt++;
				wait.until(ExpectedConditions.visibilityOf(element));
				element.clear();
				action.click(element).build().perform();
				action.sendKeys(value).build().perform();
				WebElement option = test.driver.findElement(By.xpath("(//li/a/strong)[1]"));
				action.moveToElement(option).click().build().perform();


//				jse.executeScript("arguments[0].value='"+value+"';", element);
				try{Thread.sleep(2000);}catch(Exception e){};
//				test.driver.findElement(By.xpath("//li/a/strong")).click();;
				Utility.stop(test);
				done=true;
			}// Closing TRY

			catch(StaleElementReferenceException e){
				reInitPageElements(test);
			}//Closing CATCH-1

			catch(WebDriverException e){
				System.out.println("WebDriver Exception");
				try{Thread.sleep(2000);}catch(Exception e2){};
			}//Closing CATCH-2
		}//Closing WHILE
	}//Closing METHOD

	//	======================================================================

	public void dropdownMelissaJS(Testing test,String webElement, String var1, String value) {
		WebDriverWait wait = new WebDriverWait(test.driver, 40);
		Boolean done = false;
		int attempt = 0;
		webElement=webElement.replace("{0}", var1);
		WebElement element=test.driver.findElement(By.xpath(webElement));

		dropdownMelissaJS(test,element,value);

	}




	public void Screenshot(Testing test)
	{
		WebDriverWait wait = new WebDriverWait(test.driver, 40);
		Boolean done = false;
		int attempt = 0;
		Date date = new Date();

		String FileName = date.toString().replace(":", "_").replace(" ", "_") + ".png";

		File screenshot = ((TakesScreenshot)test.driver).getScreenshotAs(OutputType.FILE);
		try{
			FileHandler.copy(screenshot, new File("C:\\IntelliJ\\WorkSpace\\Screenshot\\Screenshot" + FileName));
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}


	}
}
