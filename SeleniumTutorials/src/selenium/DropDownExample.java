package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\srinivasan.a.mohan\\Downloads\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Dropdown.html");

		//Select training program using Index
		WebElement Dropdown1=driver.findElement(By.id("dropdown1"));
		Select sel=new Select(Dropdown1);
		sel.selectByIndex(4);

		//Select training program using Text
		sel.selectByValue("2");

		//Select training program using Value
		sel.selectByVisibleText("Selenium");


		//You can also use sendKeys to select
		Dropdown1.sendKeys("UFT/QTP");

		//Get the number of dropdown options
		List<WebElement> listOfOptions= sel.getOptions();
		for (WebElement webElement : listOfOptions) 
		{
			System.out.println(webElement.getText());
		}
		int numberofOptions=listOfOptions.size();
		System.out.println("Number Of Options : "+numberofOptions);

		// Multiselect
		WebElement multiSelectBox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select"));
		Select select=new Select(multiSelectBox);
		select.selectByIndex(1);
		select.selectByIndex(2);
		select.selectByIndex(3);
	}

}
