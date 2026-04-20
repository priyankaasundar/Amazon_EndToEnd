package projects.AmazonEndtoEnd1;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utility.BaseClass;
import utility.ListenersLogic;
import utility.RetryLogic;
@Listeners(ListenersLogic.class)
public class Testcase10_AddingRemovingQuanities extends BaseClass
{
	@Test(retryAnalyzer = RetryLogic.class)
public void cartItems() throws InterruptedException 
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
	p.cart();
	CartPage c=new CartPage(driver);
	c.quantityIncrease();
	Reporter.log("Item quanity is increased");
	c.quanityDecrease();
	Reporter.log("Item quanity is Decreased");
	c.proceedToBuy();
	Reporter.log("Items moved to checkout");
	
	
}
}
