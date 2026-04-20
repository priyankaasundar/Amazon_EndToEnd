package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
public class BaseClass 

{	
	public static WebDriver driver;
	@Parameters("Browser")
	@BeforeMethod
	public void launchbrowser(String nameofbrowser) throws InterruptedException
	{
		if(nameofbrowser.equals("chrome"))
		{
			driver=	new ChromeDriver();
		}		
		if(nameofbrowser.equals("edge"))
		{
			driver=	new EdgeDriver();
		}
		if(nameofbrowser.equals("firefox"))
		{
			driver=	new FirefoxDriver();
		}
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	@AfterMethod
	public void quitbrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}
}
