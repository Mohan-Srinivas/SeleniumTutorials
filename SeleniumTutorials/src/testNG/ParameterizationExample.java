package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

// We need use an input from TestNG file.that time we need to use parameter
public class ParameterizationExample 
{
	@Test
	@Parameters("Name")
	public void printName(String Value)
	{
		System.out.println("Name is "+Value);
	}

}
