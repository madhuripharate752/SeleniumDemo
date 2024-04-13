package Actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ActionClassMouseBasedExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sachi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
        driver.manage().window().minimize();


        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//*[text()='F']"));
        actions.clickAndHold();
        actions.pause(Duration.ofSeconds(4));
        actions.release(element);
        actions.pause(Duration.ofSeconds(4));
        actions.perform();

        driver.close();
    }
}
