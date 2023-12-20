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

        LoginPage loginPage = new LoginPage(driver);
        loginPage.assertMainPageLogoDisplayed();
    }

    @Test(priority = 4)
    public void facebookLink() {
        HomePage homePage = new HomePage(driver);
        homePage.navigateToLoginPage();
        homePage.clickFacebookLink();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.assertFacebookLinkIconDisplayed();
    }
}
