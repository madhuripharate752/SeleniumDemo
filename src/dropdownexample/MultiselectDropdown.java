package dropdownexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiselectDropdown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sachi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        WebElement multiselectelement = driver.findElement(By.id("multiple-select-example"));
        Select select = new Select(multiselectelement);
        select.selectByValue("apple");
        Thread.sleep(3000);
        select.selectByIndex(1);
        Thread.sleep(3000);
        select.selectByVisibleText("Peach");
        Thread.sleep(3000);
        driver.close();
    }
}
