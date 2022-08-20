package testNG;

import org.testng.annotations.Test;

public class DependenciesManagement 
{
//Problem 1: You have to admit a student to engineering if he did higher sec
//Problem 2: You have to admit a student to Higher Sec if he did high school
	
	@Test(enabled=true)
	public void highSchool()
	{
		System.out.println("High School");
	}
	@Test(dependsOnMethods = "highSchool")
	public void higherSecondary()
	{
		System.out.println("Higher Secondary");
	}
	@Test(dependsOnMethods = "higherSecondary")
	public void engineering()
	{
		System.out.println("College");
	}
	
}
