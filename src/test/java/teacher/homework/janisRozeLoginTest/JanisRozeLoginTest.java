package teacher.homework.janisRozeLoginTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JanisRozeLoginTest extends BaseTest {
    @Test(priority = 1)
    public void loginWithValidCredentials() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("invalid_username", "invalid_password");


        boolean isNotLoggedIn = driver.findElement(By.xpath("//div[@class='block block-account']")).isDisplayed();


        Assert.assertTrue(isNotLoggedIn, "Login with invalid credentials succeeded, but it was expected to fail");
    }


    @Test(priority = 2)
    public void loginWithInvalidCredentials() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("stowa.voronin@gmail.com", "D7600679d");

        boolean isLoggedIn = driver.findElement(By.xpath("//div[@class='block block-account']")).isDisplayed();

        Assert.assertTrue(isLoggedIn, "Login with valid credentials failed");
    }

    @Test(priority = 3)
    public void backToMainPage() {

        WebElement logoButton = driver.findElement(By.xpath("//a[@class='logo logo--regular']"));
        logoButton.click();

        boolean backOnMainPage = driver.findElement(By.id("slideshow-8f83ff4d8eadb852cdc53a308a8ecf00")).isDisplayed();

        Assert.assertTrue(backOnMainPage, "The logo button brings back to the main page");
    }

    @Test(priority = 4)
    public void facebookLink() {

        WebElement logoButton = driver.findElement(By.xpath("//div[@class='scandi-facebookconnect-facebook-inner']"));
        logoButton.click();



        boolean backOnMainPage = driver.findElement(By.xpath("//i[@class='fb_logo img sp_EP9wX8qDDvu sx_d5b062']")).isDisplayed();

        Assert.assertTrue(backOnMainPage, "The facebook link works");
    }


}
