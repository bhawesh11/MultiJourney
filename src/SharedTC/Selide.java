package SharedTC;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import GenericFunctions.BrowserFactory;
import GenericFunctions.TestData;
import java.util.*;
import java.net.URL;

public class Selide {

	private WebDriver driver;
	  private Map<String, Object> vars;
	  JavascriptExecutor js;
	  @Before
	  public void setUp() {
	    driver = BrowserFactory.startBrowser("Google Chrome", "https://quotes-qa6.dev-elephant.com");
	    js = (JavascriptExecutor) driver;
	    vars = new HashMap<String, Object>();
	  }
	  @After
	  public void tearDown() {
	    driver.quit();
	  }
	  @Test
	  public void TC001() {
	    driver.get("https://quotes-qa4.elephant.dev/");
	    driver.manage().window().setSize(new Dimension(1936, 1056));
	    driver.findElement(By.id("btnPostalCode")).click();
	    driver.findElement(By.cssSelector(".bool-value:nth-child(3) > .bool-value__label")).click();
	    driver.findElement(By.id("btnContinue")).click();
	    driver.findElement(By.cssSelector(".bool-value:nth-child(1) > .bool-value__label")).click();
	    driver.findElement(By.cssSelector(".bool-value:nth-child(4) > .bool-value__label")).click();
	    driver.findElement(By.id("btnContinue")).click();
	    driver.findElement(By.id("customerFname")).click();
	    driver.findElement(By.id("customerFname")).sendKeys("Abc");
	    driver.findElement(By.id("customerLname")).sendKeys("Chaturvedi");
	    driver.findElement(By.id("customerDob")).click();
	    driver.findElement(By.id("customerDob")).sendKeys("01-01-1990");
	    driver.findElement(By.id("customerDob")).sendKeys("01-01-1990");
	    driver.findElement(By.id("btnNext")).click();
	    driver.findElement(By.id("customerAddress")).click();
	    driver.findElement(By.id("customerAddress")).sendKeys("111");
	    driver.findElement(By.id("btnNext")).click();
	    driver.findElement(By.cssSelector(".btn-link")).click();
	    driver.findElement(By.id("customerApt")).click();
	    driver.findElement(By.id("customerApt")).sendKeys("125");
	    driver.findElement(By.id("customerAddress")).click();
	    driver.findElement(By.id("customerAddress")).sendKeys("111 New Mart");
	    driver.findElement(By.id("customerCity")).click();
	    driver.findElement(By.id("customerCity")).sendKeys("Allen");
	    driver.findElement(By.id("customerZip")).sendKeys("75002");
	    driver.findElement(By.cssSelector(".form-group .small")).click();
	    driver.findElement(By.id("yearSelection_ddl")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("yearSelection_ddl"));
	      dropdown.findElement(By.xpath("//option[. = '2019']")).click();
	    }
	    driver.findElement(By.id("yearSelection_ddl")).click();
	    driver.findElement(By.id("monthSelection_ddl")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("monthSelection_ddl"));
	      dropdown.findElement(By.xpath("//option[. = 'July']")).click();
	    }
	    driver.findElement(By.id("monthSelection_ddl")).click();
	    driver.findElement(By.cssSelector(".bool-value:nth-child(2) > .bool-value__label")).click();
	    driver.findElement(By.id("btnNext")).click();
	    driver.findElement(By.id("vehicleYear")).click();
	    driver.findElement(By.id("vehicleYear")).sendKeys("2014");
	    driver.findElement(By.id("vehicleMake")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("vehicleMake"));
	      dropdown.findElement(By.xpath("//option[. = 'Chrysler']")).click();
	    }
	    driver.findElement(By.id("vehicleMake")).click();
	    driver.findElement(By.id("vehicleModel")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("vehicleModel"));
	      dropdown.findElement(By.xpath("//option[. = '200 LIMITED']")).click();
	    }
	    driver.findElement(By.id("vehicleModel")).click();
	    driver.findElement(By.id("vehicleBodyStyle")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("vehicleBodyStyle"));
	      dropdown.findElement(By.xpath("//option[. = 'CONV 2D 6 cyl']")).click();
	    }
	    driver.findElement(By.id("vehicleBodyStyle")).click();
	    driver.findElement(By.cssSelector(".ng-isolate-scope:nth-child(3) .ng-scope:nth-child(2) > .custom-radio-bool-value__label")).click();
	    driver.findElement(By.cssSelector(".bool-value:nth-child(2) > .bool-value__label")).click();
	    driver.findElement(By.id("vehicleEstMileage")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("vehicleEstMileage"));
	      dropdown.findElement(By.xpath("//option[. = '4,000-5,999']")).click();
	    }
	    driver.findElement(By.id("vehicleEstMileage")).click();
	    driver.findElement(By.cssSelector(".ng-empty .ng-scope:nth-child(1) > .custom-radio-bool-value__label")).click();
	    driver.findElement(By.id("btnContinue")).click();
	    driver.findElement(By.id("yearSelection_ddl")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("yearSelection_ddl"));
	      dropdown.findElement(By.xpath("//option[. = 'Prior to 2018']")).click();
	    }
	    driver.findElement(By.id("yearSelection_ddl")).click();
	    driver.findElement(By.cssSelector(".ng-scope:nth-child(1) > .custom-radio-bool-value__label")).click();
	    driver.findElement(By.id("btnContinue")).click();
	    driver.findElement(By.id("btnContinue")).click();
	    driver.findElement(By.cssSelector(".field-gender > .bool-value:nth-child(1) > .bool-value__label")).click();
	    driver.findElement(By.cssSelector(".ng-pristine:nth-child(3) .bool-value:nth-child(1) > .bool-value__label")).click();
	    driver.findElement(By.cssSelector(".form-group > .ng-empty > .bool-value:nth-child(5) > .bool-value__label")).click();
	    driver.findElement(By.cssSelector(".ng-empty > .bool-value:nth-child(4) > .bool-value__label")).click();
	    driver.findElement(By.id("btnNext")).click();
	    driver.findElement(By.cssSelector("fieldset:nth-child(1) .ng-scope:nth-child(1) > .custom-radio-bool-value__label")).click();
	    driver.findElement(By.cssSelector(".ng-scope:nth-child(4) > .custom-radio-bool-value__label")).click();
	    driver.findElement(By.cssSelector(".ng-empty .ng-scope:nth-child(2) > .custom-radio-bool-value__label")).click();
	    driver.findElement(By.id("btnContinue")).click();
	    driver.findElement(By.id("btnContinue")).click();
	    driver.findElement(By.cssSelector(".ng-scope:nth-child(2) > .custom-radio-bool-value__label")).click();
	    driver.findElement(By.id("driverInsuranceReason")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("driverInsuranceReason"));
	      dropdown.findElement(By.xpath("//option[. = 'No Insurance Required']")).click();
	    }
	    driver.findElement(By.id("driverInsuranceReason")).click();
	    driver.findElement(By.id("btnNext")).click();
	    driver.findElement(By.id("discountEmail")).click();
	    driver.findElement(By.id("discountEmail")).sendKeys("POC@apparentinsurance.kom");
	    driver.findElement(By.cssSelector(".ng-scope:nth-child(1) > .custom-radio-bool-value__label")).click();
	    driver.findElement(By.id("phone")).click();
	    driver.findElement(By.id("phone")).sendKeys("(888) 888-8888");
	    driver.findElement(By.id("phone")).sendKeys("(888) 888-8888");
	    driver.findElement(By.id("btnContinue")).click();
	    driver.findElement(By.id("btnContinueQuote")).click();
	    driver.findElement(By.id("driver-AbcXyz")).click();
	    driver.findElement(By.id("driver-AbcXyz")).sendKeys("01478523");
	    driver.findElement(By.id("btnNext")).click();
	    driver.findElement(By.cssSelector(".ng-scope:nth-child(1) > .custom-radio-bool-value__label")).click();
	    driver.findElement(By.id("damageDesc2014CHRYSLER200 LIMITED0")).click();
	    driver.findElement(By.id("damageDesc2014CHRYSLER200 LIMITED0")).sendKeys("Damage");
	    driver.findElement(By.id("vin2014CHRYSLER200LIMITED")).click();
	    driver.findElement(By.id("vin2014Chrysler200LIMITED")).sendKeys("1C3BCBFG2EN138041");
	    driver.findElement(By.id("content")).click();
	    driver.findElement(By.id("primarilyParked")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("primarilyParked"));
	      dropdown.findElement(By.xpath("//option[. = 'Private Garage']")).click();
	    }
	    driver.findElement(By.id("primarilyParked")).click();
	    driver.findElement(By.id("content")).click();
	    driver.findElement(By.id("btnContinue")).click();
	    driver.findElement(By.cssSelector(".bool-value:nth-child(1) .price")).click();
	    driver.findElement(By.id("btnContinue")).click();
	    driver.findElement(By.id("billingCardholderFirstname")).click();
	    driver.findElement(By.id("billingCardholderFirstname")).sendKeys("Admiral");
	    driver.findElement(By.id("billingCardholderLastname")).sendKeys("Technologies");
	    driver.findElement(By.id("billingCardNumber")).click();
	    driver.findElement(By.id("billingCardNumber")).sendKeys("4111111111111111");
	    driver.findElement(By.id("billingExpDate")).click();
	    driver.findElement(By.id("billingExpDate")).sendKeys("02/2022");
	    driver.findElement(By.id("billingExpDate")).sendKeys("02/2022");
	    driver.findElement(By.id("btnContinue")).click();
	    driver.findElement(By.cssSelector(".h5:nth-child(2)")).click();
	    vars.put("PolicyNumber", driver.findElement(By.cssSelector(".h5:nth-child(2)")).getText());
	  }
}
