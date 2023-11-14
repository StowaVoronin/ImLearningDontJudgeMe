package homework.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

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
        WebElement burgeMenu = driver.findElement(By.id("react-burger-menu-btn"));
        burgeMenu.click();

        WebElement allItemsMenuItem = driver.findElement(By.id("inventory_sidebar_link"));

        FluentWait wait= new FluentWait(driver).withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofMillis(250))
                .ignoring(NoSuchElementException.class);

        //wait.until(ExpectedConditions.elementToBeClickable(allItemsMenuItem));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("inventory_sidebar_link")));
        WebElement allItemsMenuItems = driver.findElement(By.id("inventory_sidebar_link"));

        allItemsMenuItem.click();


        driver.quit();


    }
}
