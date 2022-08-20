package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationsHierarchyExample
{
	@Test
	public void f()
	{
		System.out.println("I am in @Test");
	}
	@Test
	public void f2()
	{
		System.out.println("I am in @Test");
	}
	
	@BeforeMethod
	public void beforeMethod() 
	{
		System.out.println("I am in Before method");
	}

	@AfterMethod
	public void afterMethod() 
	{
		System.out.println("I am in after method");
	}
	@BeforeClass
	public void beforeClass() 
	{
		System.out.println("I am in Before Class");
	}

	@AfterClass
	public void afterClass() 
	{
		System.out.println("I am in after Class");
	}

	@BeforeTest
	public void beforeTest() 
	{
		System.out.println("I am in Before test");
	}

	@AfterTest
	public void afterTest() 
	{
		System.out.println("I am in after test");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("I am in Before Suite");
	}

	@AfterSuite
	public void afterSuite() 
	{
		System.out.println("I am in After Suite");
	}

}
