package projects.AmazonEndtoEnd1;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class AccountPage 
{
	WebDriver driver;
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));

@FindBy(xpath = "//span[text()=\"Edit login, name, and mobile number\"]")
private WebElement loginDetails;



public void details()
{
	wait.until(ExpectedConditions.visibilityOf(loginDetails));
	loginDetails.click();
}

public AccountPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

}
