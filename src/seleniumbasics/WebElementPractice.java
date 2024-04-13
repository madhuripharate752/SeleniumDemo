package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementPractice {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sachi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().minimize();

        WebElement element  = driver.findElement( By.xpath("//u[text()='Forgot Password?']"));
        System.out.println(element.getText());
       //element.sendKeys("madhuripharate@gmail.com");
        //WebElement element = driver.findElement(By.className("signinbtn"));
       // element.click();
        //element.clear();
          // element.submit();
        Thread.sleep(3000);
    }
}
