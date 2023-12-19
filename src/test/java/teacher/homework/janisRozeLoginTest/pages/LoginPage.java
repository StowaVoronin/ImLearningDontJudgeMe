package teacher.homework.janisRozeLoginTest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import teacher.homework.janisRozeLoginTest.models.User;

public class LoginPage {
    private WebDriver driver;

    // Locators for the LoginPage
    private By loginBarLocator = By.id("email");
    private By passwordBarLocator = By.id("pass");
    private By logInButtonLocator = By.id("send2");
    private By notLoggedInMessageLocator = By.id("advice-validate-email-email");


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


    private void assertCondition(boolean condition, String message) {
        if (!condition) {
            throw new AssertionError(message);
        }
    }
}
