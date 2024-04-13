package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class IFrameExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sachi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/frames");
        driver.manage().window().minimize();
        List<WebElement> alllist = driver.findElements(By.tagName("iframe"));
        System.out.println(alllist.size());

        driver.switchTo().frame("frame1");

        WebElement element = driver.findElement(By.xpath("//h1[text()='This is a sample page']"));
        System.out.println(element.getText());
        WebElement element1 = driver.findElement(By.xpath(""));

        driver.close();
    }
}
