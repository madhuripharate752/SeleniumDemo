package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefoxdriverExample {
    public static void main(String[] args) {
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setBinary("");
        System.setProperty("webdriver.gecko.driver","C:\\Users\\sachi\\Downloads\\geckodriver-v0.34.0-win32/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.amazon.in");
    }
}
