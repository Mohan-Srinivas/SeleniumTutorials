package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample 
{

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srinivasan.a.mohan\\Downloads\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Alert.html");
		
		//Click the button to display a alert box.
		WebElement alertBox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
		alertBox.click();
		Alert alert=driver.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();
		
		//Click the button to display a confirm box.
		WebElement confirmAlert=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		confirmAlert.click();
		Alert confirmAlertBox=driver.switchTo().alert();
		Thread.sleep(3000);
		confirmAlertBox.dismiss();
		
		//Click the button to display a prompt box.
		WebElement promptBox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button"));
		promptBox.click();
		Alert promptAlert=driver.switchTo().alert();
		promptAlert.sendKeys("Duckling");
		Thread.sleep(3000);
		promptAlert.accept();
		
		//Click the below button and click OK.
		WebElement SweetButton=driver.findElement(By.id("btn"));
		SweetButton.click();
		WebElement okButton=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/button"));
		Thread.sleep(3000);
		okButton.click();
		
	}
}
