package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedLinksExample 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srinivasan.a.mohan\\Downloads\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//Navigate to Leafground.com 
		//driver.get("http://leafground.com/pages/Link.html");
		driver.navigate().to("http://leafground.com/pages/Link.html");
	
		/*Difference b/w get and navigate
		 In Get(),You can't do refresh,forward and backward but in
		  Navigate().to(url) we can perform */
	
		//Click Go to Home Page Hyperlink By Link text
		WebElement homePageLink=driver.findElement(By.linkText("Go to Home Page"));
		homePageLink.click();
		driver.navigate().back();
		
		//Find where am supposed to go without clicking me?
		WebElement WhereToGo=driver.findElement(By.partialLinkText("Find where am supposed"));
		String where=WhereToGo.getAttribute("href");
		System.out.println("The page is Navigated to "+where);
		
		//Verify am I broken?
		WebElement brokenLink=driver.findElement(By.linkText("Verify am I broken?"));
		brokenLink.click();
		String title=driver.getTitle();
		if(title.contains("404"))
		{
			System.out.println("The linke Is broken");
		}
		driver.navigate().back();
		
		//Go to Home Page (Interact with same link name)
		//homePageLink.click(); 
		/* It will throw the StaleElementReferenceException because if u 
		 * navigated to some other page and again navigated to same page 
		 * again means the elements which u have identified earlier 
		 * will not be known by selenium.so u need to find that element and use
		 */
		
		WebElement homePageLink1=driver.findElement(By.linkText("Go to Home Page"));
		homePageLink1.click();
		driver.navigate().back();
		
		//How many links are available in this page?
		List<WebElement> links=driver.findElements(By.tagName("a"));
		int TotalLinks=links.size();
		System.out.println("Total number of links= "+TotalLinks);
	}

}
