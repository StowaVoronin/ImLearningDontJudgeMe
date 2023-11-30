package teacher.homework.janisRozeLoginTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://www.janisroze.lv/");

        Actions action = new Actions(driver);

        WebElement profileLink = driver.findElement(By.xpath("//ul[@class='account-dropdown long']"));
        action.moveToElement(profileLink).build().perform();

        WebElement ielogotiesDropDownItem = driver.findElement(By.xpath("//a[@title='Ielogoties']"));
        ielogotiesDropDownItem.click();
    }
    @AfterMethod
    public void tearDown(){
        if(driver!=null){
            driver.quit();
        }

    }

}
