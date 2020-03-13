package app.page;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class SearchPage extends BasePage{
    private By inputBox = By.id("com.xueqiu.android:id/search_input_text");

    public SearchPage search(String keyword) {
        App.driver.findElement(inputBox).sendKeys(keyword);
        click(By.id("com.xueqiu.android:name"));
        return this;
    }

    public float getCurrentPrice() {
        MobileElement el4 = (MobileElement) App.driver.findElementById("com.xueqiu.android:id/current_price");
        return Float.valueOf(el4.getText());
    }

    public App cancel(){
        click(By.id("com.xueqiu.android:i/action_close"));
        return new App();
    }

    public  SearchPage select(){
        click(By.id("com.xueqiu.android:id/follow_btn"));
        return this;
    }
}
