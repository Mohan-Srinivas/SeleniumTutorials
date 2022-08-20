package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample
{
	@Test(dataProvider = "DP")
	public void getDP(String value)
	{
		System.out.println("Value of DP is "+value);
	}
	@Test
	public void TestFact()
	{
		System.out.println("Test Factory");
	}
	@DataProvider(name = "DP")
	public String[] data()
	{
		String[] data= 	{ 	"Srini",
							"Vasan",
							"Mohan"
						};
		return data;
	}

}
