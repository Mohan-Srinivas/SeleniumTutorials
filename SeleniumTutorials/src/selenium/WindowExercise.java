package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowExercise 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\srinivasan.a.mohan\\Downloads\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Window.html");
		
		//Click button to open home page in New Window
		
		String ParentWindow=driver.getWindowHandle();
		WebElement homeButton=driver.findElement(By.id("home"));
		homeButton.click();
		Thread.sleep(3000);
		
		Set<String> windows=driver.getWindowHandles();
		for (String handle : windows) 
		{
			driver.switchTo().window(handle);
		}
		WebElement editButton=driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a"));
		editButton.click();
		Thread.sleep(3000);
		driver.close();
		
		driver.switchTo().window(ParentWindow);
		//*[@id="contentblock"]/section/div[2]/div/div/button
		
		WebElement multipleWindow=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		multipleWindow.click();
		Thread.sleep(2000);
		
		Set<String> multiplewindows=driver.getWindowHandles();
		int size=multiplewindows.size();
		System.out.println(size);
		
		WebElement dontClose=driver.findElement(By.xpath("//*[@id=\'color\']"));
		dontClose.click();
		Thread.sleep(2000);
		Set<String> windowhandles=driver.getWindowHandles();
		System.out.println(windowhandles.size());
		for (String wind : windowhandles)
		{
			if(!(wind.equals(ParentWindow)))
			{
				driver.switchTo().window(wind);
				driver.close();
			}
		}
	}
}
