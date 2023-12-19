package teacher.homework.janisRozeLoginTest.util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverProvider {

    private DriverProvider() {
    }

    public static WebDriver initializeDriver() {
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }

    public static void quitDriver(WebDriver driver) {
        if (driver != null) {
            driver.quit();
        }
    }
}
