package cookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class CookiesExample {
    public static <Cookies, cookies> void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sachi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.infosys.com/");
        driver.manage().window().minimize();
        Thread.sleep(3000);
         Cookie cok = new Cookie("Company", "Eds Services");
         driver.manage().addCookie(cok);
        Set<Cookies> cookies= (Set<Cookies>) driver.manage().getCookies();
        for(Cookies c : cookies )
        System.out.println(c);

        System.out.println("***************************************************");

         driver.manage().deleteCookie(cok);
         Set<Cookies> cookies1= (Set<Cookies>) driver.manage().getCookies();
         for(Cookies c : cookies1)
        System.out.println(c);

         driver.manage().deleteAllCookies();
         Set<Cookies> cookies3 = (Set<Cookies>) driver.manage().getCookies();
         for(Cookies c : cookies3)
        System.out.println(c);


        driver.close();
    }
}
