package teacher.homework.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class PriceComparisonTest extends BaseTest {

    @Test
    public void comparePricesAndProceedToPayment() {
        WebElement userNameField = driver.findElement(By.id("user-name"));
        userNameField.sendKeys("standard_user");

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        Actions action = new Actions(driver);



        WebElement addToCart = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
        addToCart.click();

        WebElement addToCart2 = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']"));
        addToCart2.click();

        List<WebElement> allPricesProductList = driver.findElements(By.className("inventory_item_price"));
        double priceProduct1 = Double.parseDouble(allPricesProductList.get(0).getText().substring(1));
        double priceProduct2 = Double.parseDouble(allPricesProductList.get(1).getText().substring(1));
        
        WebElement goToCart = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        goToCart.click();

        List<WebElement> allPricesInCartList = driver.findElements(By.className("inventory_item_price"));
        double priceProductInCart1 = Double.parseDouble(allPricesInCartList.get(0).getText().substring(1));
        double priceProductInCart2 = Double.parseDouble(allPricesInCartList.get(1).getText().substring(1));
        
        Assert.assertEquals(priceProductInCart1, priceProduct1);
        Assert.assertEquals(priceProductInCart2, priceProduct2);
        

        WebElement checkoutButton = driver.findElement(By.id("checkout"));
        checkoutButton.click();

        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.sendKeys("Nikita");
        WebElement lastName = driver.findElement(By.id("last-name"));
        lastName.sendKeys("Voronin");
        WebElement postalCode = driver.findElement(By.id("postal-code"));
        postalCode.sendKeys("1045");

        WebElement continueButton = driver.findElement(By.id("continue"));
        continueButton.click();

        WebElement totalAmountElement = driver.findElement(By.xpath("//div[@class='summary_info_label summary_total_label']"));
        String totalAmountString = totalAmountElement.getText().trim().replace("Total: $", "");
        double totalAmount = Double.parseDouble(totalAmountString);

        double expectedTotalAmount = priceProductInCart1 + priceProductInCart2;
        Assert.assertEquals(totalAmount, expectedTotalAmount, "Total amounts do not match.");

    }
}