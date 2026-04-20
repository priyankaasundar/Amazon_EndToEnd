package projects.AmazonEndtoEnd1;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utility.BaseClass;
import utility.ListenersLogic;
import utility.RetryLogic;
@Listeners(ListenersLogic.class)
public class Testcase1_LogintoAmazon extends BaseClass
{
@Test(retryAnalyzer = RetryLogic.class)
public void validCredentials() throws InterruptedException
{
	HomePage home=new HomePage(driver);
	home.hoverOverOnAcoountList(driver);
	home.ClickSignin();
	Reporter.log("Amazon launched in browser");
LoginPage l=new LoginPage(driver);
l.login();
l.continueClick();
l.enterPassword();
l.SignIn();
Reporter.log("Amazon logged in successfully");
	
}
}
