package datepickerexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class AutoSugestedOptions {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sachi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/bus-tickets/");
        driver.manage().window().minimize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
      List<WebElement> options = driver.findElements(By.xpath("//label[@class='lbl_input makeFlex column latoBold']"));
        for(WebElement e : options){
          if(e.getText().equalsIgnoreCase("//span[@class='sr_city blackText']"));
            e.click();
            break;

        }
         driver.findElement(By.xpath("//span[@class='appendBottom5 textStyle']")).click();
         Thread.sleep(3000);


    }
}