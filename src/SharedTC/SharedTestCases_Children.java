package SharedTC;

import ApplicationPages.Children;
import GenericFunctions.BrowserFactory;
import GenericFunctions.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class SharedTestCases_Children {

    public static Class page;
    Logger log = Logger.getLogger("Shared Test Case");

    //	CHILDREN
    public void children(){
        try{Thread.sleep(2000);}catch(Exception e2){};
        if(!BrowserFactory.driver.getCurrentUrl().contains("policyholder")){
            page = Children.class;
            Children children = (Children) PageFactory.initElements(BrowserFactory.driver, page);

            WebFunctions.clickJS(children.CheckBox_LittleOnes);
            WebFunctions.click(children.btn_Next);
            log.info("Children page: Success!");
        }
    }

// -------------------------------------------------------------------------------------------
}
