package teacher.homework.janisRozeLoginTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String username, String password) {
        WebElement loginBar = driver.findElement(By.id("email"));
        loginBar.sendKeys(username);

        WebElement passwordBar = driver.findElement(By.id("pass"));
        passwordBar.sendKeys(password);

        WebElement logInButton = driver.findElement(By.id("send2"));
        logInButton.click();
    }
}
