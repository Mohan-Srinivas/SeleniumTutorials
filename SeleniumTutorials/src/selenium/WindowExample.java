package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowExample 
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
		System.out.println(ParentWindow);
		WebElement homeButton=driver.findElement(By.id("home"));
		homeButton.click();
		Set<String> ChildWindow=driver.getWindowHandles();
		for (String handles : ChildWindow)
		{
			driver.switchTo().window(handles);
		}
		WebElement editBox=driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a"));
		editBox.click();
		driver.close();
		driver.switchTo().window(ParentWindow);  // Used to Navigate to the Parent Window
		
		//Find the number of opened windows
		
		WebElement MultipleWindowsButton=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		MultipleWindowsButton.click();
		int NumberofWindowsOpened=driver.getWindowHandles().size();
		System.out.println("Number of windows opened : "+NumberofWindowsOpened);
		
		//Close all except this window
		WebElement ColorButton=driver.findElement(By.id("color"));
		ColorButton.click();
		System.out.println(driver.getWindowHandles().size());
		Set<String> windowHandles=driver.getWindowHandles();
		int i=0;
		for (String windows : windowHandles) 
		{
			i++;
			if(!windows.equals(ParentWindow))
			{
				driver.switchTo().window(windows);
				driver.close();
				System.out.println("Window closed "+i);
				Thread.sleep(2000);
			}
		}
	}

}
