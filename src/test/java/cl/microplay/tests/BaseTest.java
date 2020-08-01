package cl.microplay.tests;

import cl.microplay.hooks.Hooks;
import cl.microplay.sites.MicroPlaySite;
import cl.microplay.utils.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    private WebDriver driver;
    protected MicroPlaySite microPlaySite;


    @BeforeTest
    public void beforeTest() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Constants.SHORT_WAIT, TimeUnit.SECONDS);
        microPlaySite = new MicroPlaySite(driver);
        driver.get(Constants.URL);
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
