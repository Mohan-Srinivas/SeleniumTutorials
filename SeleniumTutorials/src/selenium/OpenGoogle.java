package selenium;

import java.util.LinkedHashMap;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		// Open ChromeBroser
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\srinivasan.a.mohan\\Downloads\\SeleniumDrivers\\chromedriver.exe"
		 * ); WebDriver driver=new ChromeDriver();
		 * driver.get("https://www.google.co.in");
		 * 
		 * //Find the Google Search Bar and Enter Trichy
		 * driver.findElement(By.name("q")).sendKeys("Trichy"+Keys.ENTER); String
		 * tit=driver.getTitle(); System.out.println("Title of the page : "+tit);
		 */
		
		// Click the Wikipedia link
		
		LinkedHashMap<String,Integer> hs=new LinkedHashMap<String,Integer>();
		hs.put("Jack",60);
		hs.put("John",90);
		hs.put("Mark",70);
		hs.put("Lee",50);
		hs.put("Brain",65);
		hs.put("Smith",80);
		LinkedHashMap<String,Integer> hs1=new LinkedHashMap<String,Integer>();
		Set<String> a=hs.keySet();
		String[] str = new String[10];
		int k=0;
		for (String string : a) 
		{
			str[k]=string;
			k++;
		}
		for(int i=0;i<str.length;i++)
		{
			hs1.put(str[i],0);
		  for(int j=0;j<i-1;j++)
		    {
		    
		    		if(hs.get(str[i])<hs.get(str[j]))
		        {
								hs1.put(str[i],hs1.get(str[i])+1);       
		        }
		        	
		    }
		}

		System.out.println(hs1);
		//driver.quit();
		
	}
}
