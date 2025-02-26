package org.wipro.automation.saucedemo.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.wipro.automation.saucedemo.basePkg.IniatiateBrowser;
import org.wipro.automation.saucedemo.dataGeneratorPkg.TestDataGenerator;
import org.wipro.automation.saucedemo.pages.LoginPage;

public class LoginScenario_PF extends IniatiateBrowser
{

	@Test
	public void tc01__Loginfunc() throws Exception
	{
		LoginPage login = new LoginPage(driver);
		
		login.enter_username("user1");
		login.enter_password("pass1");
		login.click_loginbttn();
		
		//because "this.driver" is null
		
	}
	
	
	
}
