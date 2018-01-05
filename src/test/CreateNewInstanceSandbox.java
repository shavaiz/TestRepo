package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Pages.AdminConsoleObjects;
import Pages.InstancePageObjects;
import Pages.LoginPage;
import Tools.BrowserFactory;
import Tools.Utilities;

public class CreateNewInstanceSandbox
{
/*@Test
public void CreateNewInstanceSandbox() throws InterruptedException
{
	
	
	WebDriverWait wait = new WebDriverWait(driver, 30);
	AdminConsoleObjects Admin = PageFactory.initElements(driver, AdminConsoleObjects.class);
	
	InstancePageObjects Instance = PageFactory.initElements(driver, InstancePageObjects.class);
	
    LoginPage login_page = PageFactory.initElements(driver, LoginPage.class);
	
	login_page.login_salesforce("shahvaiz.safdar@sightlineqa.com", "Syed1434567");
	Admin.ClickAdminConsole();
	Admin.ClickInstanceTab();
	
	Instance.ClickNewInstance();
	Instance.EnterInstanceName();
	Instance.ClickOk();
	Instance.ClickDropdown();

	Instance.SelectTypeSandbox();
	Instance.ClickAdd();
	Thread.sleep(5000);
	Instance.VerifyInstanceCreationSandbox();
	Instance.DeleteInstance();
}*/
}
