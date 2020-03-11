package selenium.page;

import com.apple.eawt.AppEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.Command;
import org.openqa.selenium.remote.CommandExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.Response;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class App extends BasePage {
    public App loginWithCookie() throws MalformedURLException {
        System.setProperty("webdriver.chrome.driver", "/Users/szdl/Downloads/chromedriver 3");
        String url = "https://work.weixin.qq.com";

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setCapability("pageLoadStrategy", "eager");

        driver = new ChromeDriver(chromeOptions);

//         driver = new RemoteWebDriver(new URL("http://127.0.0.1:4444/wd/hub"), chromeOptions);;

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(url);
        driver.manage().window().maximize();
        driver.findElement(By.linkText("企业登录")).click();

        System.out.println(driver.manage().getCookies());

        driver.manage().addCookie(new Cookie("wwrtx.refid", "3412662644230732"));
        driver.manage().addCookie(new Cookie("wwrtx.sid", "TAEG7DsqOTLesy8ZFw7FgXbK2atMqQM1sBMgOr-poPYh467MiWj0p4QR_Bg-fTEw"));
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

    public BroadcastPage toGroupMessage(){
        findElement(By.linkText("管理工具")).click();
        findElement(By.cssSelector(".ww_icon_AppGroupMessageBig")).click();
        return new BroadcastPage();
    }
}
