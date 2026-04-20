package projects.AmazonEndtoEnd1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage 
{
	WebDriver driver;

	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	@FindBy(xpath="//span[@class=\"a-icon a-icon-small-add\"]")
	private WebElement increment;
	
	@FindBy(xpath="//span[@class=\"a-icon a-icon-small-remove\"]")
	private WebElement decrement;

	 @FindBy(css = "#sc-buy-box-ptc-button")
	 private WebElement proceed;
	
	 @FindBy(css="input[name='proceedToRetailCheckout']")
	 private WebElement buy;
	 
	 public void buyItems()
	 {
         wait.until(ExpectedConditions.visibilityOf(buy));
		 buy.click();
	 }
	
	public void proceedToBuy()
	{ wait.until(ExpectedConditions.visibilityOf(proceed));
		proceed.click();
	}
	public void quanityDecrease()
	{
		wait.until(ExpectedConditions.visibilityOf(decrement));
		decrement.click();
	}
	public void quantityIncrease()
	{
		wait.until(ExpectedConditions.visibilityOf(increment));
		increment.click();
	}
	
	public CartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}

