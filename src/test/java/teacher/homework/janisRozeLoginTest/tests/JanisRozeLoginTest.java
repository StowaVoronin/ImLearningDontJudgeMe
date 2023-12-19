package teacher.homework.janisRozeLoginTest.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import teacher.homework.janisRozeLoginTest.models.User;
import teacher.homework.janisRozeLoginTest.pages.HomePage;
import teacher.homework.janisRozeLoginTest.pages.LoginPage;

public class JanisRozeLoginTest extends BaseTest {

    @Test(priority = 1)
    public void loginWithInvalidCredentials() {
        HomePage homePage = new HomePage(driver);
        homePage.navigateToLoginPage();

        User invalidUser = new User("invalid_username", "invalid_password");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(invalidUser);
        loginPage.assertNotLoggedInMessageDisplayed();
    }

    @Test(priority = 2)
    public void loginWithValidCredentials() {
        HomePage homePage = new HomePage(driver);
        homePage.navigateToLoginPage();

        User validUser = new User("stowa.voronin@gmail.com", "D7600679d");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(validUser);
    }

    @Test(priority = 3)
    public void backToMainPage() {
        HomePage homePage = new HomePage(driver);
        homePage.navigateToLoginPage();
        homePage.clickLogoButton();

        Assert.assertTrue(driver.findElement(By.id("slideshow-8f83ff4d8eadb852cdc53a308a8ecf00")).isDisplayed(),
                "The logo button brings back to the main page");
    }

    @Test(priority = 4)
    public void facebookLink() {
        HomePage homePage = new HomePage(driver);
        homePage.navigateToLoginPage();
        homePage.clickFacebookLink();

        Assert.assertTrue(driver.findElement(By.xpath("//i[@class='fb_logo img sp_EP9wX8qDDvu sx_d5b062']")).isDisplayed(),
                "The Facebook link works");
    }
}
