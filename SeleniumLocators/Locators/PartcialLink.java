package Locators;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class PartcialLink {
    WebDriver driver;
    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void linkTest() {
        driver.get("https://www.hollandandbarrett.com/");
        driver.findElement(By.partialLinkText("Vitamins")).click();
        List<WebElement> links = driver.findElements(By.xpath("//a"));
        int noOfLinks = links.size();
        System.out.println("No. Of links in hollandandbarrett Application: " + noOfLinks);
        for (int i = 0; i < links.size(); i++) {
            System.out.println(links.get(i).getText());
            String linkText = links.get(i).getText();
            String targetText = "Vitamins";
            if (linkText.equals(targetText)) {
                driver.findElement(By.linkText("Vitamins")).click();
                driver.findElement(By.xpath("(//a[contains(@type,'button')])[5]")).click();
            }
        }
    }
}
