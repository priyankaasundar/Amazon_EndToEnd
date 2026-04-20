package projects.AmazonEndtoEnd1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage
{
WebDriver driver;
WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']")
private WebElement accountAndList;

@FindBy(xpath="//span[text()='Sign in']")
private WebElement signin;

@FindBy(xpath="//span[text()='Sign Out']")
private WebElement signout;

@FindBy(xpath="//input[@role=\"searchbox\"]")
private WebElement search;

@FindBy(xpath="//span[text()=\"& Orders\"]")
private WebElement orders;

@FindBy(css = "#nav_prefetch_yourorders")
private WebElement Account;

@FindBy(xpath = "//span[text()=\"Your Account\" ]")
private WebElement yourAccount;

@FindBy(linkText = "Start here.")
private WebElement NewUser;

@FindBy(id = "ap_email_login")
private WebElement email;

@FindBy(id="continue-announce")
private WebElement continuebutton;

@FindBy(id="intention-submit-spinner")
private WebElement proceed;

@FindBy(xpath = "//input[@class=\"a-input-text a-span12 auth-required-field\"]")
private WebElement yourNAme;

@FindBy( xpath="//input[@class=\"a-input-text a-form-normal a-span12 auth-required-field auth-require-fields-match auth-require-password-validation\"]")
private WebElement password;

public void enterPassword()
{
	password.sendKeys("Dinesh@123");
}
public void userName()
{
	yourNAme.sendKeys("Dinesh");
}
public void proceedButton()
{
	proceed.click();
}
public void conitnueClick()
{
	continuebutton.click();
}
public void username()
{
	email.sendKeys("9962095660");
}
public void register()
{
	NewUser.click();
}


public void accountClick()
{
	yourAccount.click();
}


public void accImyAccount()
{
	wait.until(ExpectedConditions.visibilityOf(Account));
	Account.click();
}
public HomePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void hoverOverOnAcoountList(WebDriver driver) throws InterruptedException
{
	wait.until(ExpectedConditions.visibilityOf(accountAndList));
	Actions a=new Actions(driver);
	a.moveToElement(accountAndList).perform();
}

public void ClickSignin()
{
	signin.click();
}

public void loggingOut()
{
	signout.click();
}

public void searchProduct()
{
	search.sendKeys("Shoes"+Keys.ENTER);
}

public void ordersPage()
{ wait.until(ExpectedConditions.visibilityOf(orders));
	orders.click();
}



}
