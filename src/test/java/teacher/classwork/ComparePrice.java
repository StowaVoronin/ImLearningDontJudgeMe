package teacher.classwork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComparePrice {

    @Test
    public void Compare(){

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.saucedemo.com/");

        WebElement userNameField = driver.findElement(By.id("user-name"));
        userNameField.sendKeys("standard_user");

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        Actions action = new Actions(driver);

        // Capture the price of the product in the inventory
        WebElement inventoryPriceElement = driver.findElement(By.xpath("//div[@id='inventory_container']//div[@class='inventory_item_price']"));
        String inventoryPrice = inventoryPriceElement.getText().trim();

        WebElement addToCart = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']"));
        addToCart.click();

        WebElement goToCart = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        goToCart.click();

        // Capture the price of the product in the cart
        WebElement cartPriceElement = driver.findElement(By.xpath("//div[@class='inventory_item_price']"));
        String cartPrice = cartPriceElement.getText().trim();

        // Assert that the prices are equal
        Assert.assertEquals(cartPrice, inventoryPrice, "Prices do not match.");

        WebElement removeFromCart = driver.findElement(By.xpath("//button[@id='remove-sauce-labs-bike-light']"));
        removeFromCart.click();

        // Close the browser
        driver.quit();
    }
}
