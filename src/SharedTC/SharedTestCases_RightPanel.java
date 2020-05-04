package SharedTC;

import GenericFunctions.Testing;
import org.apache.log4j.Logger;
import ApplicationPages.RightPanel;
import GenericFunctions.BrowserFactory;
import GenericFunctions.TestData;
import GenericFunctions.WebFunctions;
import org.openqa.selenium.support.PageFactory;

public class SharedTestCases_RightPanel {

    public static Class page;
    Logger log = Logger.getLogger("Shared Test Case_Web");

    public void AddDriver(Testing test)
    {
        page = RightPanel.class;
        RightPanel rightPanel = (RightPanel) PageFactory.initElements(test.driver, page);
        test.webFunctions().click(test,rightPanel.btn_RightPanelDriverExpand);
        test.webFunctions().click(test,rightPanel.btn_AddDriver);
    }


    }
