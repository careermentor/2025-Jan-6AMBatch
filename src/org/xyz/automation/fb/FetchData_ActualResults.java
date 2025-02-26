package org.xyz.automation.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FetchData_ActualResults 
{
	WebDriver driver;
	
	
	@Test
	public void launchBrowser() throws Exception
	{
		
		driver= new ChromeDriver();  //launch a chrome browser
		
		String Exp_URL= "https://www.facebook.com";
		
		driver.get(Exp_URL);
		
		String Act_URL_= driver.getCurrentUrl();
		System.out.println(Act_URL_);
		
		//Assert.assertEquals(Act_URL_, Exp_URL);  //hard assertion
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(Act_URL_, Exp_URL);  
		
		System.out.println("this url did not match");
		
		
		String Exp_Login_title= "Facebook – log in or sign up";
		String Act_login_title= driver.getTitle();
		System.out.println(Act_login_title);
		
		sa.assertEquals(Act_login_title, Exp_Login_title);
		
		
		String Exp_username_textbox_present = "Email address or phone number";
		String Act_username_textbox_present = driver.findElement(By.id("email")).getAttribute("placeholder");
		System.out.println(Act_username_textbox_present);
		
		sa.assertEquals(Act_username_textbox_present, Exp_username_textbox_present);
		
		String Exp_login_bttn_text = "Login";
		String Act_login_bttn_text = driver.findElement(By.name("login")).getText();
		System.out.println(Act_login_bttn_text);
		
		sa.assertEquals(Act_login_bttn_text, Exp_login_bttn_text);
	
		
		Point loginloc = driver.findElement(By.name("login")).getLocation();
		System.out.println(loginloc);
		
		boolean logindisplayed = driver.findElement(By.name("login")).isDisplayed();
		System.out.println(logindisplayed);
		
		
		boolean loginenabled = driver.findElement(By.name("login")).isEnabled();
		System.out.println(loginenabled);
		
		//System.out.println(driver.getPageSource());
		
		driver.close();
		sa.assertAll();
		
		//System.out.println("this is summary");
	}
		
}
