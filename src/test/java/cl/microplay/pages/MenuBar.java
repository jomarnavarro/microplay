package cl.microplay.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenuBar extends BasePage {

    WebElement linkVideoJuegos;
    WebElement linkGamer;


    public MenuBar(WebDriver driver) {
        super(driver);
    }

    public boolean isAt() {
        return this.areVisible(linkVideoJuegos, linkGamer);
    }

    public void navigateMenu(String s) {
    }
}
