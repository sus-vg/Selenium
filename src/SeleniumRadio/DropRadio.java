package Dropdown;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
public class DropRadio {
    @Test
    public void FBlaunch() throws Exception {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.facebook.com/campaign/landing.php?");
        WebElement month_Dropdown = driver.findElement(By.id("month"));
        Select month_dd = new Select(month_Dropdown);
        month_dd.selectByIndex(9);
        Thread.sleep(5000);
        month_dd.selectByValue("9");
        Thread.sleep(5000);
        month_dd.selectByVisibleText("Dec");
        Thread.sleep(5000);
        driver.quit();
    }
}






