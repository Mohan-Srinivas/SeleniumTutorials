package selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadExample
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srinivasan.a.mohan\\Downloads\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/download.html");

		// Download Excel
		WebElement excelButton=driver.findElement(By.linkText("Download Excel"));
		excelButton.click();
		Thread.sleep(4000);
		File fileLoc=new File("C:\\Users\\srinivasan.a.mohan\\Downloads");
		File[] totalFiles=fileLoc.listFiles();
		for (File file : totalFiles) 
		{
			if(file.getName().equals("testleaf.xlsx"))
			{
				System.out.println(file.getName());
				System.out.println("File is downloaded");
				break;
			}

		} 
		
		// Download PDF
	/*	WebElement pdfButton=driver.findElement(By.linkText("Download PDF"));
		pdfButton.click();
		
		// For PDF file neeed to be download instead of opening in 
		// Browser Enable Auto PDF Download in Chrome browser(under Site Settings)
		Thread.sleep(4000);
		File pdfFileLoc=new File("C:\\Users\\srinivasan.a.mohan\\Downloads");
		File[] totalPDFFiles=pdfFileLoc.listFiles();
		for (File file : totalPDFFiles) 
		{
			if(file.getName().equals("testleaf.pdf"))
			{
				System.out.println(file.getName());
				System.out.println("PDF File is downloaded");
				break;
			}

		}*/
		
	}
}
