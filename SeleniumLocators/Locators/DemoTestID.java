package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class DemoId {
    WebDriver driver;
    @Test
    public void DemoTestID() {
        driver = new ChromeDriver();
        driver.get("https://auth.hollandandbarrett.com/u/login");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("dedako1743@kissgy.com");
        driver.findElement(By.id("password")).sendKeys("@SUSme22");
        driver.findElement(By.xpath("//button[@name='action']")).click();
        driver.quit();
        
        
    }
}









