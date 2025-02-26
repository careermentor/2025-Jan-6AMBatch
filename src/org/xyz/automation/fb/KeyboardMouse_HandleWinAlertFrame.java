package org.xyz.automation.fb;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.Test;

public class KeyboardMouse_HandleWinAlertFrame 
{
	WebDriver driver;
	
	
	@Test
	public void handlealerts() throws Exception
	{
		
		driver= new ChromeDriver();  //launch a chrome browser
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.className("signinbtn")).click();
		driver.switchTo().alert().accept();
		
		CaptureScreenshot.testresults(driver,"handlealerts");
		
	}
	
	
	@Test(enabled=true)
	public void handlemouse() throws Exception
	{
		
		driver= new ChromeDriver();  //launch a chrome browser
		
		driver.get("https://www.intellectdesign.com/");
		
		Actions act = new Actions(driver);
		//act.click(driver.findElement(By.xpath("//a[text()='eMACH.ai']"))).perform();
		//act.doubleClick(driver.findElement(By.xpath("//a[text()='eMACH.ai']"))).perform();
		//act.contextClick(driver.findElement(By.xpath("//a[text()='eMACH.ai']"))).perform();
		
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Products ']"))).perform();
		//act.click(driver.findElement(By.xpath("//a[text()='Core Banking']"))).perform();
		
		//Control+Click
		
		act.keyDown(Keys.CONTROL).click(driver.findElement(By.xpath("//a[text()='Core Banking']"))).keyUp(Keys.CONTROL).perform();
		
		Set<String> winsid = driver.getWindowHandles();
		System.out.println(winsid);
		
		Iterator<String> itr = winsid.iterator();
		
		String win1 = itr.next();  //window one
		String win2 = itr.next();  //window two
		
		driver.switchTo().window(win2);
	//	driver.switchTo().window(win1);
		
		CaptureScreenshot.testresults(driver,"handlemouse");
		
		driver.quit();

	}
	
	@Test(enabled=false)
	public void handlekeyboard() throws Exception
	{
		
		driver= new ChromeDriver();  //launch a chrome browser

		driver.navigate().to("https://www.facebook.com/");
		
		Actions act = new Actions(driver);
		
		act.sendKeys("user1").perform();
		
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();
		
		//act.sendKeys(Keys.TAB).perform();
		//act.sendKeys("bjhbjh").perform();
		//act.sendKeys(Keys.ENTER).perform();
		
		
	}
		
}
