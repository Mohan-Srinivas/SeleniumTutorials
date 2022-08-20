package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageExample 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srinivasan.a.mohan\\Downloads\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Image.html");
		
		//Click on this image to go home page
		WebElement FirstImage=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/img"));
		FirstImage.click();
		
		WebElement imageIcon=driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[4]/a/img"));
		imageIcon.click();
		
		//Am I Broken Image?
		//If naturalWidth = 0 means the image is broken otherwise not broken
		WebElement brokenImage=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/img"));
		if(brokenImage.getAttribute("naturalWidth").equals("0"))
		{
			System.out.println("The Image is broken");
		}
		else
		{
			System.out.println("The Image is not broken");
		}
	}

}
