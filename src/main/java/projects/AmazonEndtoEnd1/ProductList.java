package projects.AmazonEndtoEnd1;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ProductList 
{

	WebDriver driver;
	@FindBy(xpath=("//a[@class=\"a-link-normal s-no-outline\"]"))
    private	List<WebElement> li;
	
	@FindBy(xpath="//span[@class=\"a-button-text a-declarative\"]")
	private WebElement sort;
	
	@FindBy(xpath="//a[text()='Avg. Customer Review']")
	private WebElement Rating;
	
	@FindBy(xpath="//a[text()='Best Sellers']")
	private WebElement sellers;

	@FindBy(xpath="//input[@id=\"add-to-cart-button\"]")
	private WebElement CartButton;
	
	@FindBy(xpath="//span[@class=\"a-price-whole\"]")
	private List<WebElement> price;
	
	@FindBy(xpath="//span[@class=\"a-icon-alt\"]")
	private List<WebElement> rating;
	
	@FindBy(xpath="//a[@class=\"a-link-normal s-line-clamp-2 puis-line-clamp-3-for-col-4-and-8 s-link-style a-text-normal\"])")
	private List<WebElement> description;
	
	@FindBy(className = "a-button-text")
	private WebElement gotocart;
	
	
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	public void addToCart()
	{
		wait.until(ExpectedConditions.visibilityOf(sort));			
		CartButton.click(); 	
	}
	public void searchProductClick() throws InterruptedException
	{			
		li.get(1).click();
		//wait.until(ExpectedConditions.titleIs("Buy Cruiser Men’s Sneakers | Cushioned Insole Comfortable Shoes | Trendy & Stylish Modern Sneakers | Durable TPR Sole Casual Walking Footwear 2656 at Amazon.in"));
		Set<String> s=driver.getWindowHandles();
		Iterator<String> s1=s.iterator();
		String pid=s1.next();
		String cid=s1.next();
		driver.switchTo().window(cid);
	}
	public void sorting() 
	{			wait.until(ExpectedConditions.visibilityOf(sort));		
		sort.click();		
	}
	public void Review()
	{
		wait.until(ExpectedConditions.visibilityOf(Rating));	
		Rating.click();
	}	
	public void bestSellers()
	{
		wait.until(ExpectedConditions.visibilityOf(sellers));	
		sellers.click();
	}	
	
	public void productRating()
	{
		wait.until(ExpectedConditions.visibilityOf(Rating));
		Assert.assertTrue(rating.size()>0,"Rating is not empty");
		
	}
	public void productPrice()
	{
		wait.until(ExpectedConditions.visibilityOfAllElements(price));
		Assert.assertTrue(price.size()>0,"Price is not empty");
	}
	public void productDescription()
	{
		wait.until(ExpectedConditions.visibilityOfAllElements(description));
		Assert.assertTrue(description.size()>0,"Description Rating is not empty");
	}
	public void cart()
	{
		wait.until(ExpectedConditions.visibilityOf(gotocart));
		gotocart.click();
	}
	public ProductList(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
}
