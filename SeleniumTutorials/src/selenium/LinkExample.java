package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkExample 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srinivasan.a.mohan\\Downloads\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//Navigate to Leafground.com 
		driver.get("http://leafground.com/pages/Link.html");
		//Click Go to Home Page Hyperlink By Link text
		//driver.findElement(By.linkText("Go to Home Page")).click();
		//Click Go to Home Page Hyperlink By PartialLink text
		driver.findElement(By.partialLinkText("Home Page")).click();
		
		// Here there 2 home page(partial link) which one will click first..
		// which Home page identifies first that one will executes first
	}

}


/* Difference B/w Link text and Partial Link Text 
 1. Partial link text can be used for Dynamically changing Text
 
 */