package windowhandlingexample;

import jdk.jfr.SettingControl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class SwitchToExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sachi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().minimize();


        driver.findElement(By.id("openwindow")).click();
        Thread.sleep(3000);
        String parentwindowId = driver.getWindowHandle();
        System.out.println(parentwindowId);

        Set<String> handles = driver.getWindowHandles();
        Iterator it = handles.iterator();
        String parentid = (String) it.next();
        String childid = (String) it.next();


        driver.switchTo().window(childid);
        System.out.println(driver.getTitle());
        Thread.sleep(3000);

        driver.findElement(By.xpath("//a[@class='fab fa-facebook-square dynamic-link-icon']")).click();
             String subchild = (String) it.next();
              driver.switchTo().window(subchild);
           System.out.println(driver.getTitle());
    }
}