package SharedTC;

import ApplicationPages.PolicyHolderDetails2of2;
import GenericFunctions.BrowserFactory;
import GenericFunctions.TestData;
import GenericFunctions.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class SharedTestCases_PolicyHolderDetails2of2 {


    public static Class page;
    Logger log = Logger.getLogger("Shared Test Case_Web");

    //	POLICYHOLDER-DETAILS-2
    public void policyHolderDetails2of2() {
        page = PolicyHolderDetails2of2.class;
        PolicyHolderDetails2of2 policyholderDetails2of2 = (PolicyHolderDetails2of2) PageFactory.initElements(BrowserFactory.driver, page);
        // WebFunctions.type(policyHolder.textBox_FirstName, TestData.testData.get("First Name"));
        WebFunctions.click(policyholderDetails2of2.btn_ValidLicense, TestData.testData.get("Valid License"));
        WebFunctions.click(policyholderDetails2of2.btn_AgeFirstLicensed,TestData.testData.get("Age first licensed"));
//		WebFunctions.click(policyholderDetails2of2.btn_vehicleAssignment,TestData.testData.get("Education"));
        WebFunctions.click(policyholderDetails2of2.btn_IncidentHistory,TestData.testData.get("Incident History"));
        //below identifier is created new on 22 march for 2V1D scenario
        WebFunctions.click(policyholderDetails2of2.btn_VehicleDriveMostOften,TestData.testData.get("Model"));

        WebFunctions.click(policyholderDetails2of2.btn_Next);
        log.info("Policy Holder Details 2of2 page: Success!");
    }

    // -------------------------------------------------------------------------------------------


}
