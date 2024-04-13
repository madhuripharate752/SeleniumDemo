package Practicepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class PracticeExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sachi\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.letskodeit.com/practice");
        System.out.println(driver.getTitle());

       // WebElement element = driver.findElement(By.xpath("//input[@id='disabled-button']"));
        //System.out.println(element.isDisplayed());
        //System.out.println(element.isEnabled());
        WebElement element = driver.findElement(By.id("carselect"));
        element.click();
        System.out.println(element.isSelected());
        driver.close();
    }
}
