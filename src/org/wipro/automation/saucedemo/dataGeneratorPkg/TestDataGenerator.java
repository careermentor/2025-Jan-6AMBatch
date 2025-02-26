package org.wipro.automation.saucedemo.dataGeneratorPkg;

import org.testng.annotations.DataProvider;

public class TestDataGenerator 
{

	@DataProvider(name="ddf1")
	public Object[][] testData_login()
	{
		Object[][] data2 = {{"user1","pass1"},{"user2","pass2"},{"user3","pass3"}};
		return data2;
	}
	
	@DataProvider(name="ddf2")
	public Object[][] testData_signup()
	{
		Object[][] data2 = {{"fname1","lname1"},{"fname2","lname2"}};
		return data2;
	}
}
