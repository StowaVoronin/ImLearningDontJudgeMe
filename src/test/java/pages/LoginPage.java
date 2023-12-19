package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utils.DriverProvider.getCurrentDriver;

public class LoginPage{
    String loginID = "user-name";
    String passwordID = "password";
    String loginButtonID = "login-button";

    public void doLogin() {
        WebElement loginField = getCurrentDriver().findElement(By.id(loginID));
        WebElement passwordField = getCurrentDriver().findElement(By.id(passwordID));
        WebElement loginButton = getCurrentDriver().findElement(By.id(loginButtonID));

        //loginField.sendKeys(login);
        //passwordField.sendKeys(password);
        loginButton.click();

    }
}
