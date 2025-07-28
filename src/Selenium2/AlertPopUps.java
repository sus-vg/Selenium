package Handelingalerts;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import org.testng.Assert;
import org.testng.annotations.Test;
public class AlertPopUps {
    @Test
    public void TestPopups() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Handle JS Alert
        driver.findElement(By.xpath("//button[contains(text(), 'Click for JS Alert')]")).click();
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();
        String result = driver.findElement(By.cssSelector("#result")).getText();
        System.out.println(result);
        Assert.assertEquals(result, "You successfully clicked an alert");
        Thread.sleep(2000);
        // Handle JS Confirm
        driver.findElement(By.xpath("//button[contains(text(), 'Click for JS Confirm')]")).click();
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert2 = driver.switchTo().alert();
        Thread.sleep(2000);
        alert2.dismiss();
        String result2 = driver.findElement(By.cssSelector("#result")).getText();
        System.out.println(result2);
        Assert.assertEquals(result2, "You clicked: Cancel");
        Thread.sleep(2000);
        // Handle JS Prompt
        driver.findElement(By.xpath("//button[contains(text(), 'Click for JS Prompt')]")).click();
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert3 = driver.switchTo().alert();
        Thread.sleep(2000);  
        alert3.sendKeys("This is a test input");
        alert3.accept();
        String result3 = driver.findElement(By.cssSelector("#result")).getText();
        System.out.println(result3);
        Assert.assertEquals(result3, "You entered: This is a test input");
        Thread.sleep(2000);
        driver.quit();
    }
}
