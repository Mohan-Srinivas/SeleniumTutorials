package testNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListernersExample implements ITestListener
{
	@Override
	public void onTestStart(ITestResult result)
	{
		System.out.println("Test Case going to Execute");
		
	}

	@Override
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test Case is passed");
	
	}

	@Override
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test Case is Failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		System.out.println("Test Case is Skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
	
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result)
	{
	
	}

	@Override
	public void onStart(ITestContext context) 
	{
		System.out.println("Before Everything");
		
	}

	@Override
	public void onFinish(ITestContext context) 
	{
		System.out.println("After Everything");
	}
}
