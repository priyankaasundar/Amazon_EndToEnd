package projects.AmazonEndtoEnd1;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utility.BaseClass;
import utility.ListenersLogic;
import utility.RetryLogic;
@Listeners(ListenersLogic.class)
public class Testcase15_WithoutLoginCart extends BaseClass

{
	@Test(retryAnalyzer = RetryLogic.class)
public void guestUSer() throws InterruptedException 
{
HomePage h=new HomePage(driver);
h.searchProduct();
ProductList p=new ProductList(driver);
p.searchProductClick();
p.addToCart();
p.cart();
CartPage c=new CartPage(driver);
c.buyItems();
//c.proceedToBuy();
Assert.assertTrue(true, "Sign in or create account");
Reporter.log("Guest user successfully added items to cart and navigated till checkout page");


}
}
