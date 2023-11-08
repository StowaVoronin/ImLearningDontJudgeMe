package classroom;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ErrorMessageTest {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.draugiem.lv/?login=0");

        WebElement loginValues = driver.findElement(By.id("email"));
        loginValues.sendKeys("E-pasta@macaroni.com");

        WebElement passwordValues = driver.findElement(By.id("password"));
        passwordValues.sendKeys("1234567890");

        WebElement loginButton = driver.findElement(By.id("loginSubmit"));
        loginButton.click();


        WebElement errorBar = driver.findElement(By.xpath("//div[@class='infoMsg errorIcon radius3'"));
        String errorMessageText = errorBar.getText();
        System.out.println(errorMessageText);

        driver.quit();
    }
}
