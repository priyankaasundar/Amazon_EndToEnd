package projects.AmazonEndtoEnd1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class CheckOutPage 
{
WebDriver driver;
WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
@FindBy(xpath = "//input[@type='radio']")
private WebElement payment;

@FindBy(id = "checkout-secondary-continue-button-id-announce")
private WebElement usepaymentbutton;


public void paymentSelect() throws InterruptedException
{
wait.until(ExpectedConditions.visibilityOf(payment));
	

	payment.click();
}
public void paymentbuton()
{
	wait.until(ExpectedConditions.visibilityOf(usepaymentbutton));
	usepaymentbutton.click();
}

public CheckOutPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
}
