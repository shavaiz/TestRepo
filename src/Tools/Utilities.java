package Tools;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utilities {

	public static boolean isElementPresent(WebDriver driver, By selector) {
	       try {
	    	  
	          driver.findElement(selector);    
	          return true;    
	       } catch (Exception e) {
	           return false;
		   }
		}
	
}
