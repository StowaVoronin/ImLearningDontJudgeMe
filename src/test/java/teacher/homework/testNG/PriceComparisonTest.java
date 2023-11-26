package teacher.homework.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

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

        WebElement inventoryPriceElement = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']/ancestor::div[@id='inventory_container']//div[@class='inventory_item_price']"));
        String inventoryPrice = inventoryPriceElement.getText().trim();
        System.out.println("The initial price of the first product is " + inventoryPrice);

        WebElement addToCart = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
        addToCart.click();

        WebElement inventoryPriceElement2 = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']/ancestor::div[@id='inventory_container']//div[@class='inventory_item_price']"));
        String inventoryPrice2 = inventoryPriceElement2.getText().trim();
        System.out.println("The initial price of the second product is " + inventoryPrice2);

        WebElement addToCart2 = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']"));
        addToCart2.click();

        WebElement goToCart = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        goToCart.click();

        WebElement cartPriceElement = driver.findElement(By.xpath("//button[@id='remove-sauce-labs-backpack']/ancestor::div[@class='cart_item']//div[@class='inventory_item_price']"));
        String cartPrice = cartPriceElement.getText().trim();

        System.out.println("The actual price of the first product is " + cartPrice);

        Assert.assertEquals(cartPrice, inventoryPrice, "Prices do not match.");

        WebElement cartPriceElement2 = driver.findElement(By.xpath("//button[@id='remove-sauce-labs-bike-light']/ancestor::div[@class='cart_item']//div[@class='inventory_item_price']"));
        String cartPrice2 = cartPriceElement2.getText().trim();

        System.out.println("The actual price of the second product is " + cartPrice2);

        double cartPriceValue = Double.parseDouble(cartPrice.replace("$", ""));
        double cartPrice2Value = Double.parseDouble(cartPrice2.replace("$", ""));
        double expectedTotalAmount = cartPriceValue + cartPrice2Value;

        //Assert.assertEquals(cartPrice2, inventoryPrice2, "Prices do not match.");

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

        Assert.assertEquals(totalAmount, expectedTotalAmount, "Total amounts do not match.");
    }
}