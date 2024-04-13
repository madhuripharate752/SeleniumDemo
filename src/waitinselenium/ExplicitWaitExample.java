package waitinselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sachi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

       WebElement element =  driver.findElement(By.id("bmwradio"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(23));
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();


        driver.close();
    }
}
