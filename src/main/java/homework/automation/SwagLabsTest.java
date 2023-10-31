package homework.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwagLabsTest {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.saucedemo.com/");

        WebElement userNameField = driver.findElement(By.id("user-name"));
        userNameField.sendKeys("standard_user");

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        String currentUrl = driver.getCurrentUrl();

        if (currentUrl.contains("inventory.html")){
            System.out.println("Login successful");
        } else {
            System.out.println("Login failed. Please check your credentials and try again");
        }
        driver.quit();


    }
}
