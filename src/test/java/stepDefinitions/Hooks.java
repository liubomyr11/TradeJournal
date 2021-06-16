package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.Driver;
import utils.PropertiesReader;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void before() {
        Driver.getDriver().get(PropertiesReader.getProperty("url"));
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.getDriver().manage().window().maximize();
    }
    @After
    public void after() {
        Driver.getDriver().quit();
    }
}
