package projects.AmazonEndtoEnd1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrdersPage 
{
WebDriver driver;

WebDriverWait wait;
	
@FindBy(xpath="//select[@name=\"timeFilter\"]")
private WebElement orderslist;

@FindBy(id="a-autoid-5-announce")
private WebElement review;

@FindBy(xpath="//span[@class=\"in-context-ryp__form-field--starRating-single\"]")
private List<WebElement> star;

public void listOfOrders()
{
	
	Select s=new Select(orderslist);
	s.selectByIndex(3);
	
}

public void reviewButton()
{
	wait.until(ExpectedConditions.visibilityOf(review));
	review.click();
	
}
public void starRating()
{
star.get(4).click();
}


public OrdersPage(WebDriver driver)
{
	wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	PageFactory.initElements(driver, this);
}
}
