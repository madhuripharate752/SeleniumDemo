package dropdownexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BootstrapDropdown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sachi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
        driver.manage().window().minimize();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@id='menu1']")).click();
        List<WebElement> Webelement = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//child::li/a"));
    for(WebElement e : Webelement){
        if(e.getText().trim().equalsIgnoreCase("HTML")){
            e.click();
            break;
        }

    }
    Thread.sleep(3000);
    driver.close();

    }
}
