package cl.microplay.tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ElementVerificationTests  extends  BaseTest {

    @Test
    public void verifyHomePage() {
        assertTrue(microPlaySite.getHeader().isAt(), "Can't find the elements in the header section.");
        assertTrue(microPlaySite.getMenu().isAt());
    }

    @Test
    public void verifyLoginPage() {
        microPlaySite.getHeader().navegarMiCuenta();
        //microPlaySite.getLogin().isAt()
    }
}
