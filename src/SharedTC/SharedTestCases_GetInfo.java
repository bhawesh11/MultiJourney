package SharedTC;

import ApplicationPages.GetInfo;
import GenericFunctions.BrowserFactory;
import GenericFunctions.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class SharedTestCases_GetInfo {


    public static Class page;
    Logger log = Logger.getLogger("Shared Test Case_Web");

    //For Getting the Policy Number
    public static void GetPolicyNumber()
    {
        page = GetInfo .class;
        GetInfo getInfo = (GetInfo) PageFactory.initElements(BrowserFactory.driver, page);
        String PolicyNo = WebFunctions.readInfo(getInfo.PolicyNumber);
        System.out.println("-------------"+ PolicyNo +"=====================");

    }

    //For Getting the Suspended License status Text
    public static void GetLicenseStatus()
    {
        page = GetInfo .class;
        GetInfo getInfo = (GetInfo) PageFactory.initElements(BrowserFactory.driver, page);
        String LicenseTextMsg = WebFunctions.readInfo(getInfo.SuspendedLicenseText);
        System.out.println("-------------"+ LicenseTextMsg +"=====================");

    }
}
