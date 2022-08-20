package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsExample
{
	String Name="Agni";
	boolean value=false;
	@Test
	public void checkSame()
	{
		/*
		 * if(Name.equals("Agni")) 
		 * { 
		 * 		System.out.println(Name+" is Equal");
		 * }
		 *  else
		 *  {
		 * 		System.out.println(Name+" is not equal"); }
		 */
		Assert.assertEquals(Name, "Agni");
		Assert.assertFalse(false);
		Assert.assertEquals(Name, "Agni");
	}
}
