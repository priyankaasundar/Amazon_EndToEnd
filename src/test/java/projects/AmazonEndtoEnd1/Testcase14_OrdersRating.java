package projects.AmazonEndtoEnd1;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utility.BaseClass;
import utility.ListenersLogic;
import utility.RetryLogic;
@Listeners(ListenersLogic.class)
public class Testcase14_OrdersRating extends BaseClass
{
	@Test(retryAnalyzer = RetryLogic.class)
public void ratings() throws InterruptedException
{
	
	HomePage h=new HomePage(driver);
	h.hoverOverOnAcoountList(driver);
	h.ClickSignin();
	LoginPage l=new LoginPage(driver);
	l.login();
	l.continueClick();
	l.enterPassword();
	l.SignIn();
	
	h.ordersPage();
	OrdersPage o=new OrdersPage(driver);
	o.listOfOrders();
	o.reviewButton();
	o.starRating();
	Reporter.log("Order rating done");
	
	
	
}
}
