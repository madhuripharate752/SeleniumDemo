import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DatePickerExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sachi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().minimize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.switchTo().frame(0);
        WebElement date =  driver.findElement(By.id("datepicker"));
        date.click();
        List<WebElement> allDate = driver.findElements(By.xpath("//a[@data-date='27']"));
        for(WebElement e :allDate){
            if(e.getText().contentEquals("27")) {
                e.click();
                break;
            }
            driver.close();
        }
    }
}


