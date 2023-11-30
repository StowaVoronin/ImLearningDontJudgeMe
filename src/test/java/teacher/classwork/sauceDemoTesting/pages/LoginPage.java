package teacher.classwork.sauceDemoTesting.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;

    String loginFieldID = "user-name";
    String passwordFieldID = "password";
    String loginButtonID = "login-button";

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login() {
        WebElement loginField = driver.findElement(By.id(loginFieldID));
        WebElement passwordField = driver.findElement(By.id(passwordFieldID));
        WebElement loginButton = driver.findElement(By.id(loginButtonID));

        loginField.sendKeys("standard_user");
        passwordField.sendKeys("secret_sauce");
        loginButton.click();
    }
}
