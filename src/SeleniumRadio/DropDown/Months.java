package Dropdown;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import java.util.List;
public class Months {
    @Test
    public void FaceBookMonth() throws Exception {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.facebook.com/campaign/landing.php");
        
        WebElement month_Dropdown = driver.findElement(By.id("month"));
        Select month_dd = new Select(month_Dropdown);
        
        List<WebElement> month_list = month_dd.getOptions();
       
        int total_month = month_list.size();
        
        System.out.println("Total months count in List: " + total_month);
        
        for (WebElement ele : month_list) {
            String month_name = ele.getText(); 
            System.out.println("Month Names are: " + month_name);
        }
       
        driver.quit();
    }
}
















