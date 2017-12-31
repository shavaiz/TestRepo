package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Pages.LoginPage;
import Tools.BrowserFactory;

public class LoginToSalesforce {
	
	@Test
	public void Login() throws InterruptedException
	{
		
		WebDriver driver = BrowserFactory.startBrowser("firefox", "https://login.salesforce.com/");
		
		Thread.sleep(6000);
		LoginPage login_page = PageFactory.initElements(driver, LoginPage.class);
		
		login_page.login_salesforce("shahvaiz.safdar@sightlineqa.com", "Syed1434567");
		
		
	}

}
