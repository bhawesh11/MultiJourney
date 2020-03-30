package SharedTC;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import java.util.*;

//------------------------------------------------------------------------------------------------------------------------------


public class SCRIPT1D1VTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  
  @BeforeSuite
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @AfterSuite
  public void tearDown() {
    driver.quit();
  }
  public void configuration() {
    driver.manage().window().setSize(new Dimension(1920, 1080));
    System.out.println("`set speed` is a no-op in code export, use `pause` instead");
  }
  @Test
  public void sCRIPT1D1V() {
//    configuration2();
//    TCLoginandCreateAccount();
//    TCSupplementalInfo();
//    TCApplicant();
//    TCPolicyInfo();
//    TCDriversBasicDetails();
//    TCDriversAdditionalDetails();
//    TCDriversLicenseDetails();
//    TCIncidentsStepOver();
//    TCVehicle();
//    TCAssignmentTent();
//    TCQuote();
//    TCPayment();
//    TCQuoteBound();

  }
  
public static void main(String[] args) {
//	QuoteInOneGOTest;
}
}
