package Actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ActionsClassKeyboard {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sachi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().minimize();

        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.xpath(""));
        actions.moveToElement(element);
        actions.click();
        actions.perform();
        actions.pause(Duration.ofSeconds(3));
        actions.keyDown(Keys.SHIFT);
        actions.sendKeys("Tshirt");
        actions.pause(Duration.ofSeconds(3));
        actions.keyUp(Keys.SHIFT);
        actions.build();
        actions.perform();
    }
}
