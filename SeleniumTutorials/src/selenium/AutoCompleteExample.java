package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoCompleteExample {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srinivasan.a.mohan\\Downloads\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/autoComplete.html");
		
		//Select the value from the suggestion(Use Actions Class)
		
		WebElement input=driver.findElement(By.id("tags"));
		input.sendKeys("s");
		Thread.sleep(4000);
		
		List<WebElement> optionsList=driver.findElements(By.xpath("//*[@id=\'ui-id-1\']/li"));
		System.out.println(optionsList.size());
		Actions actions=new Actions(driver);
		for (WebElement webElement : optionsList)
		{
			if(webElement.getText().equals("SOAP"))
			{
				String text=webElement.getText();
				//webElement.click();
				actions.click(webElement).build().perform();
				System.out.println("Selected Value is "+text);
				break;
			}
		}
	}

}
