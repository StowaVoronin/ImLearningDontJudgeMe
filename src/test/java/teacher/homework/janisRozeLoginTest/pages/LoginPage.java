package teacher.homework.janisRozeLoginTest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import teacher.homework.janisRozeLoginTest.models.User;

public class LoginPage {
    private WebDriver driver;

    // Locators for the LoginPage
    private By loginBarLocator = By.id("email");
    private By passwordBarLocator = By.id("pass");
    private By logInButtonLocator = By.id("send2");
    private By notLoggedInMessageLocator = By.id("advice-validate-email-email");

    // Locators moved from JanisRozeLoginTest
    private By mainPageLogoLocator = By.id("slideshow-8f83ff4d8eadb852cdc53a308a8ecf00");
    private By facebookLinkIconLocator = By.xpath("//i[@class='fb_logo img sp_EP9wX8qDDvu sx_d5b062']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(User user) {
        WebElement loginBar = driver.findElement(loginBarLocator);
        loginBar.sendKeys(user.getUsername());

        WebElement passwordBar = driver.findElement(passwordBarLocator);
        passwordBar.sendKeys(user.getPassword());

        WebElement logInButton = driver.findElement(logInButtonLocator);
        logInButton.click();
    }

    public boolean isNotLoggedInMessageDisplayed() {
        return driver.findElement(notLoggedInMessageLocator).isDisplayed();
    }

    public void assertNotLoggedInMessageDisplayed() {
        boolean isNotLoggedIn = isNotLoggedInMessageDisplayed() || isNotLoggedInMessageDisplayed();
        assertCondition(isNotLoggedIn, "Login with invalid credentials succeeded, but it was expected to fail");
    }

    public void assertMainPageLogoDisplayed() {
        Assert.assertTrue(driver.findElement(mainPageLogoLocator).isDisplayed(),
                "The logo button brings back to the main page");
    }

    public void assertFacebookLinkIconDisplayed() {
        Assert.assertTrue(driver.findElement(facebookLinkIconLocator).isDisplayed(),
                "The Facebook link works");
    }

    private void assertCondition(boolean condition, String message) {
        if (!condition) {
            throw new AssertionError(message);
        }
    }
}
