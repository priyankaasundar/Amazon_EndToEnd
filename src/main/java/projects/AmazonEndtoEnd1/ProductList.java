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
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;


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
	private FluentWait<WebDriver> wait;
	
	
	
	public void addToCart()
	{
		//wait.until(ExpectedConditions.visibilityOf(sort));			
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
	{			//wait.until(ExpectedConditions.visibilityOf(sort));		
		sort.click();		
	}
	public void Review()
	{
		//wait.until(ExpectedConditions.visibilityOf(Rating));	
		Rating.click();
	}	
	public void bestSellers()
	{
		//wait.until(ExpectedConditions.visibilityOf(sellers));	
		sellers.click();
	}	
	
	public boolean productRating()
	{
		//wait.until(ExpectedConditions.visibilityOf(Rating));
		return rating.size()>0;
		
	}
	public boolean productPrice()
	{
		//wait.until(ExpectedConditions.visibilityOfAllElements(price));
		return price.size()>0;
	}
	public boolean productDescription()
	{
		//wait.until(ExpectedConditions.visibilityOfAllElements(description));
		return description.size()>0;
	}
	public void cart()
	{
		//wait.until(ExpectedConditions.visibilityOf(gotocart));
		gotocart.click();
	}
	public ProductList(WebDriver driver)
	{
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
}
