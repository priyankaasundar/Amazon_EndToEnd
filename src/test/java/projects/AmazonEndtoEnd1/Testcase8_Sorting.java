package projects.AmazonEndtoEnd1;


import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utility.BaseClass;
import utility.ListenersLogic;
import utility.RetryLogic;
@Listeners(ListenersLogic.class)
public class Testcase8_Sorting extends BaseClass
{

	@Test(retryAnalyzer = RetryLogic.class)
	public void productSorting() throws InterruptedException
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
		ProductList p=new ProductList(driver);
		p.sorting();
		
		p.bestSellers();
		Reporter.log("Products sorted by Bestsellers");
		p.sorting();
		p.Review();
		Reporter.log("Products sorted by Review");
	}
	
	
}
