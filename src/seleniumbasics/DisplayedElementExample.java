package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisplayedElementExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sachi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();
        WebElement showElement = driver.findElement(By.id("show-textbox"));
        WebElement hideElement = driver.findElement(By.id("hide-textbox"));
        WebElement textbox = driver.findElement(By.id("displayed-text"));

        System.out.println(textbox.isDisplayed());
        showElement.click();
        System.out.println(textbox.isDisplayed());
        hideElement.click();
        System.out.println(textbox.isDisplayed());

        Thread.sleep(3000);
        driver.close();
    }

}
