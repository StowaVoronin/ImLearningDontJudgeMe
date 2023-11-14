package teacher.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class JaniRozeTest {

    @Test
    public void JanisRozeTest(){


            WebDriverManager.firefoxdriver().setup();
            WebDriver driver = new FirefoxDriver();
            driver.get("https://www.janisroze.lv/");

            Actions action = new Actions(driver);

            WebElement profileLink = driver.findElement(By.xpath("//ul[@class='account-dropdown long']"));
            action.moveToElement(profileLink).build().perform();

            WebElement ielogotiesDropDownItem = driver.findElement(By.xpath("//a[@title='Ielogoties']"));
            ielogotiesDropDownItem.click();


            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            WebElement loginBar =  driver.findElement(By.id("email"));
            wait.until(ExpectedConditions.elementToBeClickable(loginBar));

            loginBar.sendKeys("Stowa.voronin@gmail.com");

            WebElement passwordBar = driver.findElement(By.id("pass"));
            passwordBar.sendKeys("D7600679d");

            WebElement logInButton = driver.findElement(By.id("send2"));
            logInButton.click();


            JavascriptExecutor js = (JavascriptExecutor) driver;
            WebElement footer = driver.findElement(By.xpath("//div[@class='footer-copyright']"));
            js.executeScript("arguments[0].scrollIntoView(true);", footer);


            driver.quit();
    }
}
