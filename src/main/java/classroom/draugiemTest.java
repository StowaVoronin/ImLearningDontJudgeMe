package classroom;

import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.jshell.spi.ExecutionControl;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class draugiemTest {
    public static void main(String[] args) throws ExecutionControl.InternalException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("http//www.draugiem.lv");

        WebElement emailInput = driver.findElement(By.id("email"));
        emailInput.sendKeys("Some BS");

        WebElement passwordInput = driver.findElement(By.id(""));
        passwordInput.sendKeys("Some more BS");

        driver.quit();
    }
}
