package seleniumpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class TestEdgeBrowser {
    public static void main(String[] args) {
    	System.setProperty("webdriver.edge.driver", "C:\\WebDriver\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hollandandbarrett.com/");
        System.out.println("Page title is: " + driver.getTitle());
    }
}


