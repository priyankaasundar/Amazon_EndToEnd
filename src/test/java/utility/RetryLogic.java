package utility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryLogic implements IRetryAnalyzer
{
int countOfRetry=2;
int initialCount=0;
	@Override
	public boolean retry(ITestResult result)
	{
	if(initialCount<countOfRetry)	
	{
		initialCount++;
		return true;
	}
		
	return false;
	}

}
