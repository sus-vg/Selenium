package radiobutton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.List;

public class EaseMyTrip {
    @Test
    public void testRegistration() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.easemytrip.com/flights.html");

        List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@type='radio']"));
        System.out.println("Number Of Radio Buttons: " + radioButtons.size());

        for (WebElement radio : radioButtons) {
            if (radio.isEnabled() && !radio.isSelected()) {
                radio.click();
                Thread.sleep(500);
            }
        }

        driver.quit();
    }
}
