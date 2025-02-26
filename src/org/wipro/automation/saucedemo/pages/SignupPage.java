package org.wipro.automation.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.wipro.automation.saucedemo.utilitiesPkg.ReadPropFiles;

public class SignupPage 
{

	WebDriver driver;
	
	public SignupPage(WebDriver driver) 
	{
		this.driver=driver;
	}

	
	public void click_createnewaccountbttn() throws Exception
	{
		driver.findElement(By.xpath(ReadPropFiles.readelement("login_createnewaccount_xpath"))).click();
	}
	
	
	public void enter_firstname(String uname) throws Exception
	{
		driver.findElement(By.name(ReadPropFiles.readelement("signup_firstname_name"))).sendKeys(uname);
	}
	
	public void enter_lastname(String pass) throws Exception
	{
		driver.findElement(By.name(ReadPropFiles.readelement("signup_lastname_name"))).sendKeys(pass);
	}
	
	public void select_dob_day(String day) throws Exception
	{
		Select dob_day = new Select(driver.findElement(By.name(ReadPropFiles.readelement("signup_dob_day_name"))));
		dob_day.selectByVisibleText(day);
	}
	
	public void select_dob_month(String month) throws Exception
	{
		Select dob_month = new Select(driver.findElement(By.name(ReadPropFiles.readelement("signup_dob_month_name"))));
		dob_month.selectByVisibleText(month);
	}
	
	
	
	public void click_signupbttn() throws Exception
	{
		driver.findElement(By.name(ReadPropFiles.readelement("signup_signupbttn_name"))).click();
	}
	
}
