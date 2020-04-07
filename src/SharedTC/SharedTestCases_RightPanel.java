package SharedTC;

import org.apache.log4j.Logger;
import ApplicationPages.RightPanel;
import GenericFunctions.BrowserFactory;
import GenericFunctions.TestData;
import GenericFunctions.WebFunctions;
import org.openqa.selenium.support.PageFactory;

public class SharedTestCases_RightPanel {

    public static Class page;
    Logger log = Logger.getLogger("Shared Test Case_Web");

    public void AddDriver()
    {
        page = RightPanel.class;
        RightPanel rightPanel = (RightPanel) PageFactory.initElements(BrowserFactory.driver, page);
        WebFunctions.click(rightPanel.btn_RightPanelDriverExpand);
        WebFunctions.click(rightPanel.btn_AddDriver);
    }


    }
