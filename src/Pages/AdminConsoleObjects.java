package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminConsoleObjects {
	
	WebDriver driver;
	public AdminConsoleObjects(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	@FindBy(xpath = "//a[@title='Admin Console Tab']")
	WebElement AdminConsole;
	
	@FindBy(xpath = "//a[contains(.,'Instances')]")
	WebElement Instances;
	
	
	@FindBy(xpath = "//a[@href='/apex/AdminSprintColumns']")
	WebElement SprintColumns;
	
	
	@FindBy(xpath = "//a[@href='/apex/AdminRoles']")
	WebElement UserManagement;
	
	
	@FindBy(xpath = "//a[@href='/apex/AdminAlmSettings']")
	WebElement SightlineSettings;
	

	public void ClickInstanceTab()
	
	{
		Instances.click();
	}
	
public void ClickSprintColumns()
	
	{
	
	SprintColumns.click();
	
	}

public void ClickUserManagement()

{

	UserManagement.click();

}

public void ClickAdminConsole()

{


	WebDriverWait wait = new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.elementToBeClickable(AdminConsole));


	AdminConsole.click();

}


public void SightlineSettings()

{

	SightlineSettings.click();

}



	
	
}
