package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersLogic implements ITestListener
{
	
	
	@Override
	public void onTestSuccess(ITestResult result) {
		WebDriver driver = BaseClass.driver;

ITestListener.super.onTestSuccess(result);
		
		TakesScreenshot t= (TakesScreenshot) driver;
		File f=t.getScreenshotAs(OutputType.FILE);
		File destination=new File("D:\\Automation Workspace\\AmazonEndtoEnd1\\test-output\\Screenshots\\Pass\\Pass"+Math.random()+".png");
		System.out.println("running pass");
		try {
			FileHandler.copy(f, destination);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

	@Override
	public void onTestFailure(ITestResult result) {
		WebDriver driver = BaseClass.driver;
		ITestListener.super.onTestFailure(result);
		TakesScreenshot t= (TakesScreenshot) driver;
		File f=t.getScreenshotAs(OutputType.FILE);
		File destination=new File("D:\\Automation Workspace\\AmazonEndtoEnd1\\test-output\\Screenshots\\Fail\\Fail"+Math.random()+".png");
		System.out.println("running pass");
		try {
			FileHandler.copy(f, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
	
}
