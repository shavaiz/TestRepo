package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
WebDriver driver;
	
public LoginPage(WebDriver driver)

{
	
	this.driver=driver;
}
	@FindBy(xpath = "//input[@id='username']")
	WebElement UserName;
	
	
	@FindBy(xpath = "//input[@id='password']")
	WebElement Password;

	@FindBy(xpath = "//input[@id='Login']")
	WebElement Click_Login;
	
	public void login_salesforce(String user, String pass)

	{
		UserName.sendKeys(user);
		Password.sendKeys(pass);
		Click_Login.click();
		
	}
	}

