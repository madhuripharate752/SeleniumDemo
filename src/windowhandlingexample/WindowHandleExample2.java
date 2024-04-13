package windowhandlingexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandleExample2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sachi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().minimize();

        driver.findElement(By.id("openwindow")).click();
        Thread.sleep(3000);
         String parentwindowid = driver.getWindowHandle();
        System.out.println(parentwindowid);

       Set<String> allwindow  = driver.getWindowHandles();
        System.out.println(allwindow);

        for(String s : allwindow){
            if(!s.contentEquals(parentwindowid)){
                driver.switchTo().window(s);
                System.out.println(driver.getTitle());
                driver.close();
            }
        }
        driver.switchTo().window(parentwindowid);
        System.out.println(driver.getTitle());
        driver.close();
    }
}
