package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExercise 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srinivasan.a.mohan\\Downloads\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Alert.html");
		
		WebElement AlertBoxButton=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
		AlertBoxButton.click();
		
		Alert alert=driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();
		
		//Click the button to display a confirm box.
		WebElement ConfirmAlert=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		ConfirmAlert.click();
		
		Alert confirmAlert=driver.switchTo().alert();
		Thread.sleep(2000);
		confirmAlert.dismiss();
		
		WebElement PromptAlert=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button"));
		PromptAlert.click();
		
		Alert promptAlertBox=driver.switchTo().alert();
		Thread.sleep(2000);
		promptAlertBox.sendKeys("Duckling");
		promptAlertBox.accept();
	}
}
