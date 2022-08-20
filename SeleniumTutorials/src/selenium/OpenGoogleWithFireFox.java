package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenGoogleWithFireFox 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\\\Users\\\\srinivasan.a.mohan\\\\Downloads\\\\SeleniumDrivers\\\\geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https:\\google.co.in");
	}

}
