package projects.AmazonEndtoEnd1;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utility.BaseClass;
import utility.ListenersLogic;
import utility.RetryLogic;
@Listeners(ListenersLogic.class)
public class Testcase11_CheckOutProcess extends BaseClass
{
	@Test(retryAnalyzer = RetryLogic.class)
public void checkout() throws InterruptedException
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
	p.searchProductClick();
	p.addToCart();
    CartPage c=new CartPage(driver);
    c.proceedToBuy();

	CheckOutPage check=new CheckOutPage(driver);
	check.paymentSelect();
	check.paymentbuton();
	Reporter.log("Payment method selected");
}
}
