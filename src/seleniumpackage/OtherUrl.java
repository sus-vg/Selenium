package seleniumpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;



public class OtherUrl {

    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "C:\\WebDriver\\msedgedriver.exe");

        
        WebDriver driver1 = new EdgeDriver();
        driver1.get("https://www.hollandandbarrett.com/");
        System.out.println("Page title is: " + driver1.getTitle());
        System.out.println("Current URL is: " + driver1.getCurrentUrl());
        System.out.println("Page source length is: " + driver1.getPageSource().length());
        System.out.println("Page source length is: " + driver1.getPageSource());
        driver1.quit();

        
        WebDriver driver2 = new EdgeDriver();
        driver2.get("https://opensource-demo.orangehrmlive.com/");
        System.out.println("Page title is: " + driver2.getTitle());
        System.out.println("Current URL is: " + driver2.getCurrentUrl());
        System.out.println("Page source length is: " + driver2.getPageSource().length());
        System.out.println("Page source length is: " + driver2.getPageSource());
        driver2.quit();

        
        WebDriver driver3 = new EdgeDriver();
        driver3.get("https://demo.opencart.com/");
        System.out.println("Page title is: " + driver3.getTitle());
        System.out.println("Current URL is: " + driver3.getCurrentUrl());
        System.out.println("Page source length is: " + driver3.getPageSource().length());
        System.out.println("Page source length is: " + driver3.getPageSource());
        driver3.quit();

        
        WebDriver driver4 = new EdgeDriver();
        driver4.get("http://www.bing.com/");
        System.out.println("Page title is: " + driver4.getTitle());
        System.out.println("Current URL is: " + driver4.getCurrentUrl());
        System.out.println("Page source length is: " + driver4.getPageSource().length());
        System.out.println("Page source length is: " + driver4.getPageSource());
        driver4.quit();

       
        WebDriver driver5 = new EdgeDriver();
        driver5.get("https://www.freecrm.com/");
        System.out.println("Page title is: " + driver5.getTitle());
        System.out.println("Current URL is: " + driver5.getCurrentUrl());
        System.out.println("Page source length is: " + driver5.getPageSource().length());
        System.out.println("Page source length is: " + driver5.getPageSource());
        driver5.quit();

        
        WebDriver driver6 = new EdgeDriver();
        driver6.get("http://www.half.ebay.com/");
        System.out.println("Page title is: " + driver6.getTitle());
        System.out.println("Current URL is: " + driver6.getCurrentUrl());
        System.out.println("Page source length is: " + driver6.getPageSource().length());
        System.out.println("Page source length is: " + driver6.getPageSource());
        driver6.quit();
    }
}
