package SharedTC;

import ApplicationPages.Children;
import GenericFunctions.BrowserFactory;
import GenericFunctions.Testing;
import GenericFunctions.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class SharedTestCases_Children {

    public static Class page;
    Logger log = Logger.getLogger("Shared Test Case");

    //	CHILDREN
    public void children(Testing test){
        try{Thread.sleep(2000);}catch(Exception e2){};
        if(!test.driver.getCurrentUrl().contains("policyholder")){
            page = Children.class;
            Children children = (Children) PageFactory.initElements(test.driver, page);

            test.webFunctions().clickJS(test,children.CheckBox_LittleOnes);
            test.webFunctions().click(test,children.btn_Next);
            log.info("Children page: Success!");
        }
    }

// -------------------------------------------------------------------------------------------
}
