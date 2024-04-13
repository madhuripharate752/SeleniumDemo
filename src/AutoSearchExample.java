import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class AutoSearchExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sachi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");
        driver.manage().window().minimize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

      WebElement element = driver.findElement(By.xpath("//div[@class='a4bIc']"));
             element.sendKeys("Bike");
        List<WebElement>  all = driver.findElements(By.xpath("//div[@class='YacQv']"));
         for(WebElement e : all){
             if(e.getText().equalsIgnoreCase("//div[@class='wM6W7d']"));
             e.click();

         }
     }
}
