package windowhandlingexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class SwitchTOExample2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sachi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().minimize();
        
        driver.findElement(By.id("openwindow")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@class='fab fa-facebook-square dynamic-link-icon']")).click();
        Thread.sleep(3000);
        Set<String> handles = driver.getWindowHandles();
        Iterator <String>  it = handles.iterator();
         while(it.hasNext()){
             driver.switchTo().window(it.next());
             System.out.println(driver.getTitle());
         }
    }
}
