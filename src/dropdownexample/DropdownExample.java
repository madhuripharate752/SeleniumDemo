package dropdownexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropdownExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sachi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        WebElement dropdown = driver.findElement(By.id("carselect"));
        Select select = new Select(dropdown);
        select.selectByIndex(2);
        Thread.sleep(3000);
        select.selectByValue("honda");
        Thread.sleep(3000);
        select.selectByVisibleText("Benz");
        Thread.sleep(3000);
     //   List<WebElement> allelement = select.getOptions();
      //  for (WebElement element : allelement) {
      //      System.out.println(element.getText());

            driver.close();
        }
    }

