package org.xyz.automation.fb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DifferentWebsiteControl 
{
	WebDriver driver;
	
	@Test(enabled=false)
	public void universalorlando() throws Exception
	{
		
		driver= new ChromeDriver();  //launch a chrome browser
		driver.get("https://www.universalorlando.com/web/en/us");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(180));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//span[text()='Explore Parks']")).click();
		driver.findElement(By.xpath("//span[text()='Universal Studios Florida']")).click();
		
		System.out.println(driver.findElement(By.xpath("//h2[text()='Experience 8 Lands in 1 Park']")).getText());
		
	
	}
		
	@Test(enabled=true)
	public void launchBrowser() throws Exception
	{
		
		driver= new ChromeDriver();  //launch a chrome browser
		
		driver.navigate().to("https://thetestingworld.com/testings/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(180));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		WebElement username_textbox = driver.findElement(By.name("fld_username"));
		username_textbox.sendKeys("selenium");
		
		driver.findElement(By.id("datepicker")).sendKeys("07/18/1981");
		driver.findElement(By.xpath("//a[text()='18']")).click();
		
		driver.findElement(By.cssSelector("[value='home']")).click();
		
		
		Select gen = new Select(driver.findElement(By.name("sex")));
		//gen.selectByIndex(2);
		//gen.selectByValue("1");
		gen.selectByVisibleText("Male");
		
		Select con = new Select(driver.findElement(By.name("country")));
		con.selectByVisibleText("United States");
		
		Select st = new Select(driver.findElement(By.name("state")));
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("stateId")), "Florida"));
		
		st.selectByVisibleText("Arizona");
		
		//gen.deselectAll()
		
		driver.findElement(By.name("terms")).click();
		
		//driver.findElement(By.className("displayPopup")).click();
		
		//Thread.sleep(2000);
		
	//	driver.findElement(By.className("close")).click();
			
	}
		
}
