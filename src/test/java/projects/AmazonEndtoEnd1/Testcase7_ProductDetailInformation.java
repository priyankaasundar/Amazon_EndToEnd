package projects.AmazonEndtoEnd1;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utility.BaseClass;
import utility.ListenersLogic;
import utility.RetryLogic;
@Listeners(ListenersLogic.class)
public class Testcase7_ProductDetailInformation extends BaseClass
{
	@Test(retryAnalyzer = RetryLogic.class)
public void productDetails() throws InterruptedException
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
	ProductList p1=new ProductList(driver);
	p1.productRating();
	Reporter.log("Product Review displayed");
	p1.productPrice();
	Reporter.log("Product price displayed");
	p1.productDescription();
	Reporter.log("Product description displayed");
}
}
