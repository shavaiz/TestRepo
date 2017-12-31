package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InstanceDetailPageObjects {

	
	WebDriver driver;
	public InstanceDetailPageObjects(WebDriver driver)
	{
		this.driver = driver;
	}
	
	@FindBy(xpath = "//span[@id='instance-name-text']")
	WebElement InstanceName;
	
	public void VerifyInstanceName()
	
	{
		
	}
}
