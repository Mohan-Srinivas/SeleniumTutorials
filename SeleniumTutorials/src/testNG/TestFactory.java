package testNG;


import org.testng.annotations.Factory;


public class TestFactory 
{
	@Factory
	public Object[] factorymethod()
	{
		return new Object[]
		{
				new DataProviderExample(),
				new DataProviderExample()
		};
	}
}
/*If we run the above program, then you will find that the test method,
 *  which is associated with the @DataProvider that was executed
 *  four times that means that it was executed two times for each instance, 
 *  as we are passing two sets of data that’s why the count is 4. 
 *  The other @test method is executed two times for both instances.
 *   So the total test case execution count is 6.
 *

@DataProvider gives you the power to run a test method with 
different sets of data, and 
@Factory gives you the power to run all methods inside a 
test class with different sets of data. 
*/