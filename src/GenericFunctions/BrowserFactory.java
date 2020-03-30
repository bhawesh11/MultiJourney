package GenericFunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserFactory {
	
	public static WebDriver driver;
	
	public static WebDriver startBrowser(String browser, String url){
		
//		DesiredCapabilities dc = new DesiredCapabilities();
//		dc.setCapability("nativeEvents", false); 
//		dc.setCapability("unexpectedAlertBehaviour", "accept"); 
//		dc.setCapability("ignoreProtectedModeSettings", true); 
//		dc.setCapability("enablePersistentHover", true); 
//		dc.setCapability("ignoreZoomSetting", true); 
//		dc.setCapability("ie.ensureCleanSession", true); 
//		dc.setCapability("silent",true); 
		
		if(browser.equals("Mozilla Firefox")){
			System.setProperty("webdriver.firefox.marionette","D:\\NV00481641\\ATT\\Automation\\browserDrivers\\geckodriver.exe");
			DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			capabilities.setCapability("marionette",true);
			driver= new FirefoxDriver();

//			driver.navigate().to("http://www.google.com");
		}
		
		else if(browser.equals("Internet Explorer")){
			System.setProperty("webdriver.ie.driver", "D:/NV00481641/ATT/Automation/browserDrivers/IEDriverServer.exe");
//			dc.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			driver=new InternetExplorerDriver();
		}
		
		if(browser.equals("Google Chrome")){
			System.setProperty("webdriver.chrome.driver","C:\\IntelliJ\\WorkSpace\\ProjectA\\Drivers\\BrowserDrivers\\chromedriver\\chromedriver.exe");
			driver= new ChromeDriver();

//			driver.navigate().to(url);
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		
		return driver;
		
	}//closing startBrowser method
	
//	------------------------------------------------------------------------------------------
	
	public static void closeBrowser(){
		driver.close();
		driver.quit();
	}//closing closeBrowser method
	
}//closing class
