package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnabledElmentExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sachi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();
        WebElement enabledElement = driver.findElement(By.id("enabled-button"));
        WebElement disabledElement = driver.findElement(By.id("disabled-button"));
        WebElement Textbox = driver.findElement(By.id("enabled-example-input"));

        System.out.println(Textbox.isEnabled());
        disabledElement.click();
        System.out.println(Textbox.isEnabled());
         enabledElement.click();

          Thread.sleep(3000);
          driver.close();
    }
}