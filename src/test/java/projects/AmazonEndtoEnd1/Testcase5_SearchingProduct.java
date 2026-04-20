package projects.AmazonEndtoEnd1;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utility.BaseClass;
import utility.ListenersLogic;
import utility.RetryLogic;
@Listeners(ListenersLogic.class)
public class Testcase5_SearchingProduct extends BaseClass
{
	@Test(retryAnalyzer = RetryLogic.class)
public void SearchList() throws InterruptedException
{
	HomePage home=new HomePage(driver);
	home.hoverOverOnAcoountList(driver);
	home.ClickSignin();
	
LoginPage l=new LoginPage(driver);
l.login();
l.continueClick();
l.enterPassword();
l.SignIn();
home.searchProduct();
Assert.assertEquals(driver.getTitle(), "Amazon.in : Shoes");
Reporter.log("Product searched");
}
}
