package cl.microplay.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderSection extends BasePage {
    @FindBy(xpath = "")
    WebElement microplayLogo;

    @FindBy(xpath = "")
    WebElement campoBusqueda;

    @FindBy(xpath = "")
    WebElement botonBusqueda;

    @FindBy(xpath = "")
    WebElement iconoTelefono;

    @FindBy(xpath = "")
    WebElement iconoCorre;

    @FindBy(xpath = "")
    WebElement iconoPreguntasFreq;

    @FindBy(xpath = "")
    WebElement iconoSucursales;

    @FindBy(xpath = "")
    WebElement linkMiCuenta;

    @FindBy(xpath = "")
    WebElement carrito;

    public HeaderSection(WebDriver driver) {
        super(driver);
    }

    public boolean isAt() {
        return areVisible(microplayLogo,
                campoBusqueda,
                botonBusqueda,
                iconoTelefono,
                iconoCorre,
                iconoPreguntasFreq,
                iconoSucursales,
                linkMiCuenta,
                carrito);
    }


    public void navegarMiCuenta() {
        linkMiCuenta.click();
    }


}
