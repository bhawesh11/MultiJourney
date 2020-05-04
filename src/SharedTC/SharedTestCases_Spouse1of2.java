package SharedTC;

import ApplicationPages.Spouse1of2;
import ApplicationPages.Spouse2of2;
import GenericFunctions.BrowserFactory;
import GenericFunctions.TestData;
import GenericFunctions.Testing;
import GenericFunctions.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class SharedTestCases_Spouse1of2 {

    public static Class page;
    Logger log = Logger.getLogger("Shared Test Case_Web");

    public void Spouse1of2(Testing test) {
        page = Spouse1of2.class;
        Spouse1of2 spouse = (Spouse1of2) PageFactory.initElements(test.driver, page);

        test.webFunctions().type(test,spouse.textBox_FirstName, test.getTestData("Policyholder.SpouseFirstName"));
        test.webFunctions().type(test,spouse.textBox_LastName, test.getTestData("Policyholder.SpouseLastName"));
        test.webFunctions().type(test,spouse.textBox_DOB, test.getTestData("Policyholder.SpouseDOB"));
        test.webFunctions().click(test,spouse.btn_Gender, test.getTestData("Policyholder.SpouseGender"));
        test.webFunctions().click(test,spouse.btn_Education, test.getTestData("Policyholder.SpouseEducation"));
        test.webFunctions().click(test,spouse.btn_CurrentlyEmployed, test.getTestData("Policyholder.SpouseEmployment"));
        test.webFunctions().click(test,spouse.btn_Continue);
        log.info("Partner page 1of2 : Success!");
    }


}
