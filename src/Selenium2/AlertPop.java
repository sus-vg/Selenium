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

public class AlertPop {

    @Test
    public void handleLoginAlert() {
        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

       
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        
        driver.findElement(By.xpath("//button[@name='proceed']")).click();

        
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String alertText = alert.getText();
        System.out.println("Alert Text: " + alertText);

        
        Assert.assertEquals(alertText, "Please enter a valid user name");

        alert.accept();

        
        driver.quit();
    }
}
