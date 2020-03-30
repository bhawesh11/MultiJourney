package GenericFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import SharedTC.SharedTestCases;

public class GWfunctions {
	
	static Boolean done=false;	
	static int attempt = 0;
	public static WebDriverWait wait = new WebDriverWait(BrowserFactory.driver, 40);
	public static JavascriptExecutor jse = (JavascriptExecutor)BrowserFactory.driver;
	
//	--------------------------------------------------------------------------------------------------	
	
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
				BrowserFactory.driver.findElement(By.id("ext-element-1")).click();
				try{Thread.sleep(2000);}catch(Exception e){};
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
	
//	--------------------------------------------------------------------------------------------------	
	
//	TYPE (JAVASCRIPT)
	public static void typeJS(WebElement element, String value){
		done=false;
		attempt=0;
		while(!done && (attempt<3)){
			try{
				attempt++;
				try{Thread.sleep(2000);}catch(Exception e){};
				wait.until(ExpectedConditions.elementToBeClickable(element));
				jse.executeScript("arguments[0].value='"+value+"';", element);
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
//	--------------------------------------------------------------------------------------------------
	
//	CLICK ONLY
	public static void click(WebElement element) {
		done=false;
		attempt=0;
		while(!done && (attempt<3)){
			try{
				attempt++;
				wait.until(ExpectedConditions.visibilityOf(element));			
				element.click();
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
	
//	--------------------------------------------------------------------------------------------------
	
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

//	--------------------------------------------------------------------------------------------------
	
//	CLICK AND BLUR (JAVASCRIPT)
	public static void clickAndBlurJS(WebElement element) {
		done=false;
		attempt=0;
		while(!done && (attempt<3)){
			try{
				attempt++;
				wait.until(ExpectedConditions.visibilityOf(element));			
				jse.executeScript("arguments[0].click();", element);
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
//	--------------------------------------------------------------------------------------------------
	
//	SELECT GUIDEWIRE'S DROPDOWN
	public static void dropdown(WebElement element, String value) {
		done=false;
		attempt=0;
		while(!done && (attempt<3)){
			try{
				attempt++;
				wait.until(ExpectedConditions.elementToBeClickable(element));
				click(element);
				try{Thread.sleep(1000);}catch(Exception e){};
				BrowserFactory.driver.findElement(By.xpath("//li[contains(.,'"+ value +"')]")).click();
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
//	--------------------------------------------------------------------------------------------------
	
//	READ INFO FROM WEB-ELEMENT
	public static String readInfo(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
		String x=element.getText();
		try{Thread.sleep(1000);}catch(Exception e){};
		Utility.stop();
		return x;
	}
//	--------------------------------------------------------------------------------------------------
	
//	RE-INITIALIZE PAGE ELEMENTS
	public static void reInitPageElements(){
		System.out.println("Stale Element Exception");
		try{Thread.sleep(1000);}catch(Exception e2){};
		BrowserFactory.driver.findElement(By.id("ext-element-1")).click();
		PageFactory.initElements(BrowserFactory.driver, SharedTestCases.page);
	}
	
}
