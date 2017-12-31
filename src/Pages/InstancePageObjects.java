package Pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Tools.GenerateData;

public class InstancePageObjects {

	
	String InstanceName;
	
	String InstanceTypeProd;
	String InstanceTypeSandbox;

	WebDriver driver;

	public InstancePageObjects(WebDriver driver)
	{
		this.driver = driver;
	}
	
	@FindBy(xpath = "//button[@id='instance-add-btn']")
	WebElement ClickNewInstance;
	
	@FindBy(xpath = "//input[@class='instance-add-name-input']")
	WebElement EnterInstanceName;

	@FindBy(xpath = "//button[contains(.,'OK')]")
	WebElement ClickOk;
	
	@FindBy(xpath = "//span[@class='ui-selectmenu-icon ui-icon ui-icon-triangle-1-s']")
	WebElement ClickDropdown;
	
	
	@FindBy(xpath = "//ul[@id='instance-add-type-select-menu']/li[1]/div")
	WebElement SelectTypeProduction;
	
	@FindBy(xpath = "//ul[@id='instance-add-type-select-menu']/li[2]/div")
	WebElement SelectTypeSandbox;
	
	
	@FindBy(xpath = "//button[@id='instance-add-type-btn']")
	WebElement ClickAdd;
	
	@FindBy(xpath = "//span[@id='instance-name-text']")
	WebElement InstanceName1;
	
	@FindBy(xpath = "//a[contains(.,'Click to authorize')]")
	WebElement ClickToAuthorize;
	
	
	@FindBy(xpath = "//input[@class='alm-input custom-domain-input']")
	WebElement CustomDomainTextField;
	
	@FindBy(xpath = "//div[@class='unauthorized-icon']")
	WebElement UnAuthorizedIcon;
	
	
	@FindBy(xpath = "//a[@class='home-link']")
	WebElement BackToInstancePage;
	
	@FindBy(xpath = "//button[contains(.,'Save')]")
	WebElement SaveButton;
	
	@FindBy(xpath = "//span[@id='active-instance-select-button']/span[@class='ui-selectmenu-text']")
	WebElement Type;
	
	@FindBy(xpath = "//span[@id='instance-delete-btn']")
	WebElement DeleteInstance;
	
	@FindBy(xpath = "//button[contains(.,'Yes')]")
	WebElement DeleteYes;
	
	

	public void ClickNewInstance()
	
	{
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.elementToBeClickable(ClickNewInstance));

		ClickNewInstance.click();
	}
	
	public void EnterInstanceName() throws InterruptedException 
	
	{
		GenerateData genData;
		genData=new GenerateData();
		Thread.sleep(4000);
		EnterInstanceName.sendKeys(genData.generateRandomString(10));
		InstanceName = EnterInstanceName.getAttribute("value");
		System.out.println(InstanceName);
			
		
	}
	
	
	public void ClickOk()
	
	{
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.elementToBeClickable(ClickOk));
		ClickOk.click();
	}
	
public void ClickDropdown()
	
	{
	WebDriverWait wait = new WebDriverWait(driver, 50);
	wait.until(ExpectedConditions.elementToBeClickable(ClickDropdown));
	ClickDropdown.click();
	
	}

public void SelectTypeProduction() throws InterruptedException

{
	Actions obj = new Actions(driver);
	obj.sendKeys(Keys.ARROW_UP).build().perform();
    Thread.sleep(2000);
    InstanceTypeProd = SelectTypeProduction.getText();
    System.out.print(SelectTypeProduction.getText());
    SelectTypeProduction.click();
   
}

public void SelectTypeSandbox()

{
	InstanceTypeSandbox = SelectTypeSandbox.getText();
    System.out.print(SelectTypeSandbox.getText());
    SelectTypeSandbox.click();
   
}
public void ClickAdd()

{
	WebDriverWait wait = new WebDriverWait(driver, 50);
	wait.until(ExpectedConditions.elementToBeClickable(ClickAdd));
	ClickAdd.click();
}

public void VerifyInstanceCreationSandbox()

{
	String str = driver.getPageSource();
	
	driver.findElement(By.linkText(InstanceName)).click();
	
	Assert.assertEquals(InstanceName1.getText(), InstanceName );
	
    Assert.assertTrue(str.contains(InstanceName));
    
	Assert.assertEquals(Type.getText(), InstanceTypeSandbox);

    Assert.assertTrue(ClickToAuthorize.isDisplayed());
    
    Assert.assertTrue(CustomDomainTextField.isDisplayed());
    
    Assert.assertTrue(BackToInstancePage.isDisplayed());
    
    Assert.assertTrue(UnAuthorizedIcon.isDisplayed());
    

   // Assert.assertTrue(SaveButton.isEnabled());
    
	
		
}

public void VerifyInstanceCreationProd()

{
	String str = driver.getPageSource();
	
	driver.findElement(By.linkText(InstanceName)).click();
	
	Assert.assertEquals(InstanceName1.getText(), InstanceName );
	
    Assert.assertTrue(str.contains(InstanceName));
    
	Assert.assertEquals(Type.getText(), InstanceTypeProd);

    Assert.assertTrue(ClickToAuthorize.isDisplayed());
    
    Assert.assertTrue(CustomDomainTextField.isDisplayed());
    
    Assert.assertTrue(BackToInstancePage.isDisplayed());
    
    Assert.assertTrue(UnAuthorizedIcon.isDisplayed());
    
    
   // Assert.assertTrue(SaveButton.isEnabled());		
}
public void DeleteInstance() throws InterruptedException

{
	DeleteInstance.click();
	Thread.sleep(2000);
	DeleteYes.click();

}



}


