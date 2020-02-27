package selenium.page;

import com.apple.eawt.AppEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class App extends BasePage {
    public App loginWithCookie(){
        System.setProperty("webdriver.chrome.driver", "/Users/szdl/Downloads/chromedriver 3");
        String url = "https://work.weixin.qq.com";
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(url);
        driver.manage().window().maximize();
        driver.findElement(By.linkText("企业登录")).click();

        System.out.println(driver.manage().getCookies());

        driver.manage().addCookie(new Cookie("wwrtx.refid", "3412662644230732"));
        driver.manage().addCookie(new Cookie("wwrtx.sid", "TAEG7DsqOTLesy8ZFw7FgWSvYZ-n1sdLYnZpSbW0zIO6Aw1PvHAfFeWh2o7iub-K"));
        driver.navigate().refresh();
        return this;
    }
    public ContactPage toContact(){
        findElement(By.linkText("通讯录")).click();
        return new ContactPage();
    }

    public ContactPage toMemberAdd(){
        findElement(By.linkText("添加成员")).click();
        return new ContactPage();
    }
}
