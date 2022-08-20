package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTestCase 
{
	@Test
	//(retryAnalyzer = ITestListenersExample.class)
	public void firstTestCase()
	{
		//System.out.println("This is first test Case");
		Assert.assertEquals(false, true);
	}
/*
	@Test 
	public void secondTestCase() 
	{
		System.out.println("This is second test Case"); 
	}
	@Test 
	public void thirdTestCase() 
	{
		System.out.println("This is third test Case"); 
	}
	@Test 
	public void fourthTestCase() {
		System.out.println("This is fourth test Case"); }

*/
}
