package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExamaple 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srinivasan.a.mohan\\Downloads\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Button.html");
	
		//Find position of button (x,y)
		WebElement positionButton=driver.findElement(By.id("position"));
		Point xyPosition=positionButton.getLocation();
		int xPos=xyPosition.getX();
		int yPos=xyPosition.getY();
		System.out.println("X Position is : "+xPos+" Y Position is : "+yPos);
		
		//Find button color
		WebElement colorButton=driver.findElement(By.id("color"));
		String color=colorButton.getCssValue("background-color");
		System.out.println("The BG Color of the button is "+color);
		
		//Find the height and width
		WebElement sizeButton=driver.findElement(By.id("size"));
		Dimension size= sizeButton.getSize();
		int height=size.getHeight();
		int width=size.getWidth();
		System.out.println("Height is :"+height+" Width is :"+width);
		
		
		//Click button to travel home page
		WebElement homeButton=driver.findElement(By.id("home"));
		homeButton.click();
	}

}
