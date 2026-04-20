package projects.AmazonEndtoEnd1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utility.BaseClass;
import utility.ListenersLogic;
import utility.RetryLogic;
import utility.Testdata;
@Listeners(ListenersLogic.class)
public class Testcase2_LoginandLogout extends BaseClass
{
@Test(retryAnalyzer = RetryLogic.class)
public void LoginLogout() throws EncryptedDocumentException, IOException, InterruptedException
{
	HomePage home=new HomePage(driver);
	home.hoverOverOnAcoountList(driver);
	home.ClickSignin();
LoginPage l=new LoginPage(driver);
l.login();

l.continueClick();
l.enterPassword();
l.SignIn();

home.hoverOverOnAcoountList(driver);
home.loggingOut();
Reporter.log("Logged out successfully");
}
}
