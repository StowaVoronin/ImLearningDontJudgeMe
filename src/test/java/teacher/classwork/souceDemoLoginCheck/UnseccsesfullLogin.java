package teacher.classwork.souceDemoLoginCheck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UnseccsesfullLogin extends BaseTest {

    @Test
    public void loginCheck() {

        WebElement userNameField = driver.findElement(By.id("user-name"));
        userNameField.sendKeys("standard_user");

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        Boolean isLogged;

        try {

            WebElement burgerMen = driver.findElement(By.id("react-burger-menu-btn"));
            isLogged = true;
        }
        catch (Exception e) {
            isLogged = false;
        }

        
        Assert.assertFalse( isLogged );
    }
}