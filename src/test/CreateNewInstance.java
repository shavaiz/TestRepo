package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.AdminConsoleObjects;
import Pages.InstancePageObjects;
import Pages.LoginPage;
import Tools.BrowserFactory;
import Tools.Utilities;

public class CreateNewInstance extends BrowserFactory
{
@BeforeMethod
public void Login()
{
	LoginPage login_page = PageFactory.initElements(driver, LoginPage.class);
	login_page.login_salesforce("shahvaiz.safdar@sightlineqa.com", "Syed1434567");
}
@Test
public void CreateNewInstance()  throws InterruptedException
{
	
    try
    {
    	WebDriverWait wait = new WebDriverWait(driver, 30);
    	AdminConsoleObjects Admin = PageFactory.initElements(driver, AdminConsoleObjects.class);
		InstancePageObjects Instance = PageFactory.initElements(driver, InstancePageObjects.class);

    	
    	Admin.ClickAdminConsole();
    	Admin.ClickInstanceTab();
    	
    	Instance.ClickNewInstance();
    	Instance.EnterInstanceName();
    	Instance.ClickOk();
    	Instance.ClickDropdown();

    	Instance.SelectTypeProduction();
    	Instance.ClickAdd();
    	Thread.sleep(5000);
    	Instance.VerifyInstanceCreationProd();
    	Instance.DeleteInstance();
    }
    catch(Exception e)
    {
    Assert.fail("Create New Instance Test Case Failed"+e.getMessage());
    }
	
}

@AfterMethod
public void RefreshBrowser()
{
	System.out.println("test");
	driver.get("https://login.salesforce.com");
}


}
