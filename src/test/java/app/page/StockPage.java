package app.page;

import org.openqa.selenium.By;

public class StockPage extends BasePage {
    public StockPage deleteAll(){
        click(By.id("com.xueqiu.android:id/edit_group"));
        click(By.id("com.xueqiu.android:id/check_all"));
        click(By.id("com.xueqiu.android:id/cancel_follow"));
        click(By.id("com.xueqiu.android:id/md_buttonDefaultPositive"));
        click(By.id("com.xueqiu.android:id/action_close"));
        return this;
    }

    public StockPage getAllStocks(){
        driver.findElement(By.id("comxueqiu.android"));
        return new StockPage();
    }
}
