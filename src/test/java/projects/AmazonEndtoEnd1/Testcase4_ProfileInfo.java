package projects.AmazonEndtoEnd1;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utility.BaseClass;
import utility.ListenersLogic;
import utility.RetryLogic;
@Listeners(ListenersLogic.class)
public class Testcase4_ProfileInfo extends BaseClass
{

	@Test(retryAnalyzer = RetryLogic.class)
public void profileInformationUpdate() throws InterruptedException
{
	HomePage h=new HomePage(driver);
	h.hoverOverOnAcoountList(driver);
	h.ClickSignin();
	LoginPage l=new LoginPage(driver);
	l.login();
	l.continueClick();
	l.enterPassword();
	l.SignIn();
	h.hoverOverOnAcoountList(driver);
	h.accountClick();
	
	AccountPage ap=new AccountPage(driver);
	ap.details();

	LoginAndSecurityPage p=new LoginAndSecurityPage(driver);
	p.profileEdit();
	p.editUSername();
	p.savebutton();
	Reporter.log("Profile updated successfully");
	
	
}
}
