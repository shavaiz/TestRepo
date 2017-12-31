package Tools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

	static WebDriver driver;
	
	public static WebDriver startBrowser(String browserName, String url)
	
	{
		
		if(browserName.equals("firefox"))
			
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\ShahvaizSafdar\\Desktop\\Selenium 3.4.0\\geckodriver.exe");
			
			driver = new FirefoxDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		
		return driver;
	}
	
}
