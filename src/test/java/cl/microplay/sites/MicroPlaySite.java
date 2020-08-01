package cl.microplay.sites;

import cl.microplay.pages.BannerSection;
import cl.microplay.pages.ConsoleSection;
import cl.microplay.pages.HeaderSection;
import cl.microplay.pages.MenuBar;
import org.openqa.selenium.WebDriver;

public class MicroPlaySite {
    private WebDriver driver;
    private HeaderSection header;
    private MenuBar menu;
    private BannerSection banner;
    private ConsoleSection consoleSection;

    public MicroPlaySite(WebDriver driver) {
        this.driver = driver;
    }

    public HeaderSection getHeader() {
        if(this.header == null) {
            this.header = new HeaderSection(driver);
        }
        return this.header;
    }

    public MenuBar getMenu() {
        if(this.menu == null) {
            this.menu = new MenuBar(driver);
        }
        return this.menu;
    }

    public BannerSection getBanner() {
        return banner;
    }

    public ConsoleSection getConsoleSection() {
        return consoleSection;
    }
}
