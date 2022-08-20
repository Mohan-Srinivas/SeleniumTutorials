package testNG;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ITestListenersExample implements IRetryAnalyzer
{

	int count=10;
	int falseCount=0;

	@Override
	public boolean retry(ITestResult result) 
	{
		// TODO Auto-generated method stub
		if(falseCount<count)
		{
			falseCount++;
			return true;
		}
		return false;
	}

}
