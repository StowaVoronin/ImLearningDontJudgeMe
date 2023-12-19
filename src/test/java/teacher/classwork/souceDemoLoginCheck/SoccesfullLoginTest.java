package teacher.classwork.souceDemoLoginCheck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SoccesfullLoginTest extends BaseTest{
    @Test
    public void loginCheck(){

        WebElement userNameField = driver.findElement(By.id("user-name"));
        userNameField.sendKeys("standard_user");

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        WebElement burgerMen = driver.findElement(By.id("react-burger-menu-btn"));
        Assert.assertTrue(burgerMen.isDisplayed());

    }
}
