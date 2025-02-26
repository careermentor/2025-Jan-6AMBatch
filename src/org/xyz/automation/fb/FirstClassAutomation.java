package org.xyz.automation.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstClassAutomation 
{
	WebDriver driver;
	
	
	@BeforeMethod
	public void launchBrowser()
	{
		
		driver= new ChromeDriver();  //launch a chrome browser
		
		driver.get("https://www.facebook.com/");
		
		
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
	
	
	@Test
	public void tc001_signup_functionality()
	{
		
		
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("John");
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		driver.findElement(By.name("websubmit")).click();
		
		
		
	}
	
	@Test
	public void tc002_login_functionality()
	{
		
		
		driver.findElement(By.id("email")).sendKeys("user1");
		driver.findElement(By.name("pass")).sendKeys("pass1234");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		
		
		
	}
	
}
