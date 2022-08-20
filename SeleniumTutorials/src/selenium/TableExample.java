package selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExample
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srinivasan.a.mohan\\Downloads\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/table.html");
	
		//Get the count of number of columns
		List<WebElement> columns=driver.findElements(By.tagName("th"));
		int columnCount=columns.size();
		System.out.println("Total Columns is "+columnCount);
		
		//Get the count of number of rows
		List<WebElement> rows=driver.findElements(By.tagName("tr"));
		int rowCount=rows.size();
		System.out.println("Total Rows is "+rowCount);
		
		//Get the progress value of 'Learn to interact with Elements'
	
		WebElement ProgressValue=driver.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements'] //following::td[1]"));
		String progressValue=ProgressValue.getText();
		System.out.println("progress value of Learn to interact with Elements = "+progressValue);
		
		//Check the vital task for the least completed progress.
		List<WebElement> allProgress=driver.findElements(By.xpath("//td[2]"));
		List<Integer> intProgress=new ArrayList<Integer>();
		for (WebElement webElement : allProgress) 
		{
			String temp=webElement.getText().replace("%","");
			intProgress.add(Integer.parseInt(temp));
		}
		System.out.println(intProgress);
		int smallValue=Collections.min(intProgress);
		System.out.println("Small value is "+smallValue);
		String smallProgress=Integer.toString(smallValue);
		smallProgress+="%";
		System.out.println(smallProgress);
		String finalXpath="//td[normalize-space()="+"\""+smallProgress+"\""+"]"+"//following::td[1]";
		//td[normalize-space()='20%']//following::td[1]
		System.out.println("the Final Xpath "+finalXpath);
		WebElement check=driver.findElement(By.xpath(finalXpath));
		check.click();
				
	}

}
