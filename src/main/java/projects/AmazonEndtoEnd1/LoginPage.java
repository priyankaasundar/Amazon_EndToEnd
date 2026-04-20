package projects.AmazonEndtoEnd1;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage
{
	WebDriver driver;
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	@FindBy(xpath="//input[@class=\"a-input-text\"]")

	private WebElement username;
	
	@FindBy(xpath="//input[@class=\"a-button-input\"]")
	private WebElement continuebutton;
	
	@FindBy(xpath="//input[@id='ap_password']")
	private WebElement password;
	
	@FindBy(id="signInSubmit")
	private WebElement signin;
    public void login() 
    {
        username.sendKeys("8883005929");
 
    }
    public void continueClick()
    {
    	continuebutton.click();
    }
    public void enterPassword() throws InterruptedException
    {
    	Thread.sleep(2000);
    	password.sendKeys("Thugil@123");
    }
    public void SignIn()
    {
    	wait.until(ExpectedConditions.visibilityOf(signin));
    	signin.click();
    }
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
}
