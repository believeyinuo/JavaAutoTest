package selenium.testcase;

import org.junit.BeforeClass;
import org.junit.Test;
import selenium.page.App;

import java.net.MalformedURLException;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.junit.Assert.assertThat;

public class testGroupMessage {
    public static App app;

    @BeforeClass
    public static void beforeAll() throws MalformedURLException {
        app = new App();
        app.loginWithCookie();
    }

    @Test
    public void send(){
        String title = "快递通知" + System.currentTimeMillis();
        assertThat(app.toGroupMessage().send("李庆春", title, "你的快递已到",
                "快递通知", "shenzhen").getSendedMsg(), hasItem(title));
    }
}
