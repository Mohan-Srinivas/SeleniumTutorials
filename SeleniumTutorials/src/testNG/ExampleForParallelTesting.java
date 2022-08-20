package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExampleForParallelTesting
{
	@Test
	public void openGoogle()
	{
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Elcot\\Desktop\\drivers\\gecko\\geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.quit();
	}

	@Test
	public void openBing()
	{
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Elcot\\Desktop\\drivers\\gecko\\geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.bing.com");
		driver.quit();
	}

}
