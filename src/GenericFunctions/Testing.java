 package GenericFunctions;

import java.util.Map;
import java.util.TreeMap;

import org.json.JSONException;
import org.json.JSONObject;
import org.openqa.selenium.WebDriver;

public class Testing {
	public WebDriver driver;
	private Output output;
	private URL address;
	private Class page;
	//private GWfunctions gwFunctions;
	private Database db;
	private final TestData td;
	private BrowserFactory bf;
	private WebFunctions webFunctions;
	
//	CONSTRUCTOR
	public Testing(String environment, String scriptName){
		
//		1. INITIALIZING ATTRIBUTES:
		db=new Database();
		td = new TestData(db,scriptName);
		output=new Output(td);
		//gwFunctions = new GWfunctions();
		webFunctions = new WebFunctions();
		address = new URL();
				
//		2. INITIALIZING DRIVER
		String url = address.getURL(environment);
		System.out.println("-------test-----"+url);
		//String browser = td.getTestData("Configuration.Browser");
		String browser = "Google Chrome";
		bf= new BrowserFactory(browser, url);
		driver = bf.driver;
		
//		3. INITIALING CURRENT PAGE
		page = null;
		
//		4.ADDING RECORD IN DATABASE:
//		db.insertRecordInDatabase(scriptName, "Elephant");
		
	}
	
//	---------------------------------------------------------------------
	
//	GETTERs and SETTERs FOR PAGE:	
	public Class getPage(){
		return page;
	}
	
	public void setPage(Class page){
		this.page = page;
	}

//	---------------------------------------------------------------------	
//	TEAR DOWN FOR TESTCASE:
	public void tearDown() {
		bf.closeBrowser();
	}
//	---------------------------------------------------------------------
//	GETTERs and SETTERs FOR OUTPUT JSON:
	public String getOutput(String key) {
		return output.getOutput(key);
	}

	public void setOutput(String key, String value) {
		this.output.setOutput(key, value);
	}
//	---------------------------------------------------------------------
	/*public GWfunctions gwFunctions() {
		return gwFunctions;
	}*/
	//	---------------------------------------------------------------------
	public WebFunctions webFunctions() {
		return webFunctions;
	}
//	---------------------------------------------------------------------
	public Database db() {
		return db;
	}
//	---------------------------------------------------------------------
	public String getTestData(String key) {
		return td.getTestData(key);
	}
	
	public String getDate(int offSet) {
		return td.getDate(offSet);
	}
	
	public String getRandomString(int length) {
		return td.createRandomString(length);
	}	
//	---------------------------------------------------------------------

	
	
}


