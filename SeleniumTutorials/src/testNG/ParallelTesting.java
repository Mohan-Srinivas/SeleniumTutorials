package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
//import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//Executing test cases in parallel fashion
// If u need to test the newly added features in both Google and Firefox
//Here i want to open Google.com and bing.com simultaneously

//C:\Users\srinivasan.a.mohan\Downloads\SeleniumDrivers\chromedriver.exe
public class ParallelTesting 
{
	public WebDriver driver;
	@BeforeSuite
	public void SetUpEnv()
	{
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\srinivasan.a.mohan\\Downloads\\SeleniumDrivers\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	@Test(priority = 1)
	//(groups = {"Google"})
	@Parameters("Name")
	public void openGoogle(String value)
	{
		driver.get("http://www.google.co.in");
		System.out.println("The Name Is "+value);
	}
	@Test(priority = 2)
	//(groups = {"Google"})
	@Parameters("CName")
	public void openCB(String val)
	{
		driver.get("https://www.cricbuzz.com/");
		System.out.println("The Name Is "+val);
	}
	@Test(priority = 3)
	public void openBing()
	{
		driver.get("http://www.bing.com");		
	}
	@AfterSuite
	public void tearDown()
	{
		driver.close();
	}
}
