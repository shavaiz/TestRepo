package Tools;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import Pages.InstancePageObjects;
import Pages.LoginPage;

public class BrowserFactory {

	public static WebDriver driver;
	
	@BeforeSuite
	@Parameters({"Browser","url"})
	public static WebDriver startBrowser(String browserName, String url)
	
	{
		
		if(browserName.equals("firefox"))
			
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\ShahvaizSafdar\\Desktop\\Selenium 3.4.0\\geckodriver.exe");
			
			driver = new FirefoxDriver();
			
		}
		else
			if(browserName.equals("chrome"))
				
			{
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\ShahvaizSafdar\\Desktop\\Selenium 3.4.0\\geckodriver.exe");
				
				driver = new FirefoxDriver();
				
			}
		
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	
        
		return driver;
	}
	
	
}
