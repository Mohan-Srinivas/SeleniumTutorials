package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalandarExample 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srinivasan.a.mohan\\Downloads\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/Calendar.html");

		// Picking Date using Sendkeys method
		WebElement CalendarBox=driver.findElement(By.id("datepicker"));
		//CalendarBox.sendKeys("04/10/2022"+Keys.ENTER);
		CalendarBox.click();
		// Picking date using Jquery Cal
		WebElement NextButton=driver.findElement(By.xpath("//a[@title='Next']"));
		NextButton.click();
		
		WebElement DateToBePicked=driver.findElement(By.xpath("//a[contains(text(),10)]"));
		DateToBePicked.click();
	}
}