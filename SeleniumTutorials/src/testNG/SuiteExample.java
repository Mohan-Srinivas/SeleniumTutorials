package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteExample
{
	WebDriver driver;
	Long StartTime,EndTime;
	@BeforeSuite
	public void openBrowser()
	{
		StartTime=System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srinivasan.a.mohan\\Downloads\\SeleniumDrivers\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	@Test
	public void openGoogle()
	{
		driver.get("https:\\www.google.co.in");
	}
	@Test
	public void openBing()
	{
		driver.get("https:\\www.bing.com");
	}
	@Test
	public void openYahoo()
	{
		driver.get("https:\\www.yahoo.com");
	}
	@AfterSuite
	public void closeBrowser()
	{
		driver.quit();
		EndTime=System.currentTimeMillis();
		System.out.println("Total time Taken : "+(EndTime-StartTime));
	}
}
