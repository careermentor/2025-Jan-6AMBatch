package org.xyz.automation.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowserControl 
{
	WebDriver driver;
	
	
	@Test
	public void launchBrowser() throws Exception
	{
		
		driver= new ChromeDriver();  //launch a chrome browser
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.facebook.com/");
		
		Thread.sleep(5000);
		
		driver.navigate().back();
		
		Thread.sleep(5000);
		
		driver.navigate().forward();
		
		
		
		driver.navigate().refresh();
		
		driver.findElement(By.id("email")).sendKeys("user1");
		
		Thread.sleep(5000);
		driver.findElement(By.id("email")).clear();
		
		driver.findElement(By.id("email")).sendKeys("user2");
		
		
		//driver.close();  //one window
		//driver.quit(); //multiple window
		
	}
		
}
