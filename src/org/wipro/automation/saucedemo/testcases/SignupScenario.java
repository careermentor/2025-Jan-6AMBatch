package org.wipro.automation.saucedemo.testcases;

import org.testng.annotations.Test;
import org.wipro.automation.saucedemo.basePkg.IniatiateBrowser;
import org.wipro.automation.saucedemo.dataGeneratorPkg.TestDataGenerator;
import org.wipro.automation.saucedemo.pages.SignupPage;

public class SignupScenario extends IniatiateBrowser
{

	@Test(dataProvider="ddf2",dataProviderClass=TestDataGenerator.class)
	public void tc01__Signup(String firstname, String lastname) throws Exception
	{
		SignupPage sign = new SignupPage(driver);
		sign.click_createnewaccountbttn();
		sign.enter_firstname(firstname);
		sign.enter_lastname(lastname);
		sign.select_dob_day("15");
		sign.select_dob_month("Jan");
		sign.click_signupbttn();
		
	}
	
	
	
}
