package projects.AmazonEndtoEnd1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginAndSecurityPage
{

 WebDriver driver;

WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));

@FindBy(css="#NAME_BUTTON")
private WebElement button;

@FindBy(css="#ap_customer_name")
private WebElement username;

@FindBy(xpath="//input[@class=\"a-button-input\"]")
private WebElement save;

public void profileEdit()
{
	wait.until(ExpectedConditions.visibilityOf(button));
	button.click();
}
public void editUSername()
{
	wait.until(ExpectedConditions.visibilityOf(username));
	username.sendKeys("S.priyankaa");
}
public void savebutton()
{ 
	wait.until(ExpectedConditions.visibilityOf(save));
	save.click();
}
public LoginAndSecurityPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

}
