package org.wipro.automation.saucedemo.basePkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.wipro.automation.saucedemo.utilitiesPkg.ReadPropFiles;

public class IniatiateBrowser
{

	public WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() throws Exception
	{
		
		if(ReadPropFiles.readconfig("BrowserName").equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
			
		}
		
		else if(ReadPropFiles.readconfig("BrowserName").equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
			
		}
		
		else if(ReadPropFiles.readconfig("BrowserName").equalsIgnoreCase("safari"))
		{
			driver = new SafariDriver();
			
		}
		
		else
		{
			driver = new ChromeDriver();
		}
		
		driver.get(ReadPropFiles.readconfig("ApplicationURL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(200));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		//driver.quit();
	}
}
