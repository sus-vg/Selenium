package seleniumpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class Commands {

	
	    public static void main(String[] args) {
	    	System.setProperty("webdriver.edge.driver", "C:\\WebDriver\\msedgedriver.exe");
	        WebDriver driver = new EdgeDriver();
	     
	        driver.get("https://www.hollandandbarrett.com/");
	        System.out.println("Page title is: " + driver.getTitle());
	        System.out.println("Page title is: " + driver.getCurrentUrl());
	        System.out.println("Page title is: " + driver.getPageSource());
	        System.out.println("Page title is: " + driver.getPageSource().length());
	        
	}

}
