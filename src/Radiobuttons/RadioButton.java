package radiobutton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class RadioButton {
    @Test
    public void testRegistration() {
    	WebDriver driver;
    	driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://m.facebook.com/reg/");
        int radiobtn = driver.findElements(By.xpath("//input[@type='radio']")).size();
        System.out.println("Number Of Radio Buttons: " + radiobtn);
        WebElement RadioButton = driver.findElement(By.xpath("//label[normalize-space()='Female']"));
        RadioButton.click();
    }
}
