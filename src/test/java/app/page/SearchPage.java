package app.page;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import java.io.IOException;
import java.util.HashMap;

public class SearchPage extends BasePage{
    private By inputBox = By.id("com.xueqiu.android:id/search_input_text");
    private By name = By.id("com.xueqiu.android:name");

    public SearchPage search(String keyword) throws IOException {
        HashMap<String, Object> data = new HashMap<>();
        data.put("keyword", keyword);
        setParams(data);
        parseSteps("search");
//        App.driver.findElement(inputBox).sendKeys(keyword);
//        click(name);
        return this;
    }

    public float getCurrentPrice() {
        parseSteps("getCurrentPrice");
//        MobileElement el4 = (MobileElement) App.driver.findElementById("com.xueqiu.android:id/current_price");
        return Float.valueOf(getResults().get("price").toString());
    }

    public App cancel(){
//        click(By.id("com.xueqiu.android:i/action_close"));
        parseSteps("cancel");
        return new App();
    }

    public  SearchPage select(){
//        click(By.id("com.xueqiu.android:id/follow_btn"));
        parseSteps("select ");
        return this;
    }
}
