package seleniumpackage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class TestChromeBrowser {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriver driver1= new ChromeDriver();
        WebDriver driver2= new ChromeDriver();
        WebDriver driver3= new ChromeDriver();
        WebDriver driver4= new ChromeDriver();
        WebDriver driver5= new ChromeDriver();
        driver.get("https://www.hollandandbarrett.com/");
        driver1.get("https://opensource-demo.orangehrmlive.com/");
        driver2.get("https://demo.opencart.com/");
        driver3.get("http://www.bing.com/");
        driver4.get("https://www.freecrm.com/");
        driver5.get("http://www.half.ebay.com/");
       
        System.out.println("Page title is: " + driver.getTitle());
    }
}
