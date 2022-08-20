package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioExample 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srinivasan.a.mohan\\Downloads\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/radio.html");
	
		//Are you enjoying the classes?
		WebElement EnjoyRadio=driver.findElement(By.id("yes"));
		EnjoyRadio.click();
		
		//Find default selected radio button
		WebElement unChecked=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/label[2]/input"));
		boolean status1=unChecked.isSelected();
		WebElement Checked=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/label[3]/input"));
		boolean status2=Checked.isSelected();
		System.out.println(status1);
		System.out.println(status2);
		
		//Select your age group (Only if choice wasn't selected)
		WebElement below20=driver.findElement(By.name("age"));
		below20.click();
	}

}
