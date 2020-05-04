package SharedTC;

import ApplicationPages.PolicyHolderDetails2of2;
import GenericFunctions.BrowserFactory;
import GenericFunctions.TestData;
import GenericFunctions.Testing;
import GenericFunctions.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class SharedTestCases_PolicyHolderDetails2of2 {


    public static Class page;
    Logger log = Logger.getLogger("Shared Test Case_Web");

    //	POLICYHOLDER-DETAILS-2
    public void policyHolderDetails2of2(Testing test) {
        page = PolicyHolderDetails2of2.class;
        PolicyHolderDetails2of2 policyholderDetails2of2 = (PolicyHolderDetails2of2) PageFactory.initElements(test.driver, page);
        test.webFunctions().click(test,policyholderDetails2of2.btn_ValidLicense, test.getTestData("Policyholder-details-2.ValidLicense"));
        test.webFunctions().click(test,policyholderDetails2of2.btn_AgeFirstLicensed,test.getTestData("Policyholder-details-2.Agefirstlicensed"));
        test.webFunctions().click(test,policyholderDetails2of2.btn_IncidentHistory,test.getTestData("Policyholder-details-2.IncidentHistory"));
        test.webFunctions().click(test,policyholderDetails2of2.btn_VehicleDriveMostOften,test.getTestData("Vehicle.V1.Model"));//("Vehicle-details.Model"));
        test.webFunctions().click(test,policyholderDetails2of2.btn_Next);
        log.info("Policy Holder Details 2of2 page: Success!");
    }

    // -------------------------------------------------------------------------------------------

    //	POLICYHOLDER-DETAILS-2 _Different License Status
    public void policyHolderDetails2of2_LicenseStatus(Testing test) {
        page = PolicyHolderDetails2of2.class;
        PolicyHolderDetails2of2 policyholderDetails2of2 = (PolicyHolderDetails2of2) PageFactory.initElements(test.driver, page);
        test.webFunctions().click(test,policyholderDetails2of2.btn_ValidLicense, test.getTestData("Policyholder.ValidLicense"));
        test.webFunctions().dropdown(test,policyholderDetails2of2.dropdown_DriverLicenseStatus,test.getTestData("Policyholder.LicenseStatus"));
        test.webFunctions().click(test,policyholderDetails2of2.btn_AgeFirstLicensed,test.getTestData("Policyholder.Agefirstlicensed"));
        test.webFunctions().click(test,policyholderDetails2of2.btn_IncidentHistory,test.getTestData("Policyholder.IncidentHistory"));
        test.webFunctions().click(test,policyholderDetails2of2.btn_VehicleDriveMostOften,test.getTestData("Policyholder.Model"));
        test.webFunctions().click(test,policyholderDetails2of2.btn_Next);
        log.info("Policy Holder Details 2of2 page: Success!");
    }

    // -------------------------------------------------------------------------------------------

}
