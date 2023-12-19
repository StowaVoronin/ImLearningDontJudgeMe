package teacher.classwork.sauceDemoTesting.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import teacher.classwork.sauceDemoTesting.pages.InventoryPage;
import teacher.classwork.sauceDemoTesting.pages.LoginPage;

public class SuccessfulLoginTest extends BaseTest {
    @Test
    public void successfulLogin() {
        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);
        loginPage.login(); // Corrected line

        Assert.assertTrue(inventoryPage.isOpen());
    }
}
