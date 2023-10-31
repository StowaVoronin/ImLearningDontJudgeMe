package classroom;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CarTest {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.ss.com/lv/");

        WebElement carLink = driver.findElement(By.id("mtd_97"));
        carLink.click();

        WebElement priceMinField = driver.findElement(By.id("f_o_8_min"));
        priceMinField.sendKeys("6000");

        WebElement priceMaxField = driver.findElement(By.id("f_o_8_max"));
        priceMaxField.sendKeys("10000");

        Select yearDropDown = new Select( driver.findElement(By.id("f_o_18_min")));
        yearDropDown.selectByVisibleText("2001");

        Select enganeDropDown = new Select( driver.findElement(By.id("f_o_15_max")));
        enganeDropDown.selectByVisibleText("3.0");

        Select colorDropDown = new Select( driver.findElement(By.id("f_o_17")));
        colorDropDown.selectByVisibleText("Balta");

        WebElement searchButton = driver.findElement(By.className("s12"));
        searchButton.click();

        driver.quit();
    }
}
