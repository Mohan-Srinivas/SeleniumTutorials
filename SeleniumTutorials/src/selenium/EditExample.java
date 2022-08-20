package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditExample 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srinivasan.a.mohan\\Downloads\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Edit.html");
		
		//Enter your email address
		WebElement emailBox=driver.findElement(By.id("email"));
		emailBox.sendKeys("test@gmail.com");
		
		//Append a text and press keyboard tab
		WebElement appendBox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"));
		appendBox.sendKeys("Text");
		
		//Get default text entered
		WebElement getTextBox=driver.findElement(By.name("username"));
		String text=getTextBox.getAttribute("value");
		System.out.println(text);
		
		//Clear the text
		WebElement clearTextBox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/input"));
		clearTextBox.clear();
		
		//Confirm that edit field is disabled
		WebElement disabledBox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/div/div/input"));
		boolean enabled=disabledBox.isEnabled();
		System.out.println(enabled);
	}

}
