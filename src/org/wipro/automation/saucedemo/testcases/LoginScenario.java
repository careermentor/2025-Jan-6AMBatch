package org.wipro.automation.saucedemo.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.wipro.automation.saucedemo.basePkg.IniatiateBrowser;
import org.wipro.automation.saucedemo.dataGeneratorPkg.TestDataGenerator;
import org.wipro.automation.saucedemo.pages.LoginPage;

public class LoginScenario extends IniatiateBrowser
{

	@Test(dataProvider="ddf",dataProviderClass=TestDataGenerator.class)
	public void tc01__Loginfunc(String username, String password) throws Exception
	{
		LoginPage login = new LoginPage(driver);
		
		login.enter_username(username);
		login.enter_password(password);
		login.click_loginbttn();
		
		//because "this.driver" is null
		
	}
	
	
	
}
