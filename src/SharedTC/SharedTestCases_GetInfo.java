package SharedTC;

import ApplicationPages.GetInfo;
import GenericFunctions.BrowserFactory;
import GenericFunctions.Testing;
import GenericFunctions.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class SharedTestCases_GetInfo {


    public static Class page;
    Logger log = Logger.getLogger("Shared Test Case_Web");

    //For Getting the Policy Number
    public  void GetPolicyNumber(Testing test)
    {
        page = GetInfo.class;
        GetInfo getInfo = (GetInfo) PageFactory.initElements(test.driver, page);
        String PolicyNo = test.webFunctions().readInfo(test,getInfo.PolicyNumber);
        System.out.println("-------------"+ PolicyNo +"=====================");

    }

    //For Getting the Suspended License status Text
    public void GetLicenseStatus(Testing test)
    {
        page = GetInfo.class;
        GetInfo getInfo = (GetInfo) PageFactory.initElements(test.driver, page);
        String LicenseTextMsg = test.webFunctions().readInfo(test,getInfo.SuspendedLicenseText);
        System.out.println("-------------"+ LicenseTextMsg +"=====================");

    }

    public void GetDUIMessage(Testing test)
    {
        page = GetInfo.class;
        GetInfo getInfo = (GetInfo) PageFactory.initElements(test.driver, page);
        String DUIMsg = test.webFunctions().readInfo(test,getInfo.SuspendedLicenseText);
        System.out.println("-------------"+ DUIMsg +"=====================");

    }



}
