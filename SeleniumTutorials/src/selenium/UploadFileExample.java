package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadFileExample 
{
	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srinivasan.a.mohan\\Downloads\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/upload.html");
		Actions actions=new Actions(driver);
		WebElement uploadButton=driver.findElement(By.xpath("//*[@id=\'mydiv\']/input"));
		actions.moveToElement(uploadButton).click().build().perform();
		Thread.sleep(4000);
		
		//Windows controls begin here
		//Below code is for sent the path to the clipboard
		String file="C:\\Users\\srinivasan.a.mohan\\Downloads\\testleaf.xlsx";
		StringSelection selection=new StringSelection(file);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		
		//For pasting the path in filename textbox
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		//After pasting the path in file name 
		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_ENTER);
	}

}
