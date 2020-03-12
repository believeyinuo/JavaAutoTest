package app.testcase;

import app.page.App;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;

public class TestStock {

    @BeforeAll
    public static void beforeAll() throws MalformedURLException {
        App.start();

    }

    @Test
    public void addDefaultSelectedStocks(){

    }
}
