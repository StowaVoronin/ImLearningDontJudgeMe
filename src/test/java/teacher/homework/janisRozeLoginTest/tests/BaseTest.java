package teacher.homework.janisRozeLoginTest.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import teacher.homework.janisRozeLoginTest.util.DriverProvider;

public class BaseTest {
    protected static WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = DriverProvider.initializeDriver();
        driver.get("https://www.janisroze.lv/");
    }

    @AfterMethod
    public void tearDown() {
        DriverProvider.quitDriver(driver);
    }
}
