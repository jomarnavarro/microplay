package cl.microplay.pages;

import cl.microplay.utils.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Constants.LONG_WAIT);
        PageFactory.initElements(driver, this);
    }

    protected boolean areVisible(WebElement ... elements) {
        for(WebElement elem: elements) {
            try {
                wait.until(ExpectedConditions.visibilityOf(elem));
            } catch(Exception ex) {
                return false;
            }
        }
        return true;
    }
}
