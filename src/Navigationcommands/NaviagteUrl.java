package Navigationcommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NavigateUrl {
    public static void main(String[] args) {

        
        System.setProperty("webdriver.edge.driver", "C:\\WebDriver\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");//navigate to 
        System.out.println("\n OrangeHRM ");
        System.out.println("Title: " + driver.getTitle());
        System.out.println("Current URL: " + driver.getCurrentUrl());
        System.out.println("Page Source Length: " + driver.getPageSource().length());
        driver.navigate().refresh();//refresh 

        
        driver.navigate().to("https://demo.opencart.com/");//navigate to 
        System.out.println("\n OpenCart");
        System.out.println("Title: " + driver.getTitle());
        System.out.println("Current URL: " + driver.getCurrentUrl());
        driver.navigate().back(); // navigate back
        System.out.println("\nBack to: " + driver.getTitle());
        driver.navigate().forward(); // forward
        System.out.println("Forward to: " + driver.getTitle());
        driver.navigate().refresh();//refresh 

        
        driver.navigate().to("http://www.bing.com");//navigate to 
        System.out.println("\n Bing ");
        System.out.println("Title: " + driver.getTitle());
        System.out.println("Current URL: " + driver.getCurrentUrl());
        System.out.println("Page Source Length: " + driver.getPageSource().length());
        driver.navigate().refresh();//refresh 

        
        driver.navigate().to("https://www.freecrm.com/");//navigate to 
        System.out.println("\n FreeCRM ");
        System.out.println("Title: " + driver.getTitle());
        System.out.println("Current URL: " + driver.getCurrentUrl());
        driver.navigate().refresh();//refresh 

        
        driver.navigate().to("http://www.half.ebay.com");//navigate to 
        System.out.println("\n Half eBay ");
        System.out.println("Title: " + driver.getTitle());
        System.out.println("Current URL: " + driver.getCurrentUrl());
        driver.navigate().refresh();//refresh 

        
        driver.quit();
    }
}
