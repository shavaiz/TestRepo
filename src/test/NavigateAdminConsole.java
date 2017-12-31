package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.AdminConsoleObjects;
import Pages.LoginPage;
import Tools.BrowserFactory;

public class NavigateAdminConsole {

	@Test
	public void OpenTabs() throws InterruptedException
	
	{
		WebDriver driver = BrowserFactory.startBrowser("firefox", "https://login.salesforce.com/");
		
		AdminConsoleObjects Admin = PageFactory.initElements(driver, AdminConsoleObjects.class);
		
		Thread.sleep(6000);
        LoginPage login_page = PageFactory.initElements(driver, LoginPage.class);
		
		login_page.login_salesforce("shahvaiz.safdar@sightlineqa.com", "Syed1434567");
		Thread.sleep(6000);
		Admin.ClickAdminConsole();
		Thread.sleep(3000);
		Admin.ClickInstanceTab();
		Thread.sleep(3000);
		Admin.ClickSprintColumns();
		Thread.sleep(3000);
		Admin.SightlineSettings();
		Thread.sleep(3000);
		Admin.ClickUserManagement();

	}
}
