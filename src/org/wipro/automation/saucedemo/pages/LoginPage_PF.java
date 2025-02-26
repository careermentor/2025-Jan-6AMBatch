package org.wipro.automation.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.wipro.automation.saucedemo.utilitiesPkg.ReadPropFiles;

public class LoginPage_PF 
{

	WebDriver driver;
	
	public LoginPage_PF(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="email")
	public WebElement enter_username;
	
	
	@FindBy(name="pass")
	public WebElement enter_password;
	
	@FindBy(css="[type='submit']")
	public WebElement click_loginbttn;
	

	
}
