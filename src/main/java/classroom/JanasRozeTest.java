package classroom;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;

public class JanasRozeTest {
    public static void main(String[] args) {


    WebDriverManager.firefoxdriver().setup();
    WebDriver driver = new FirefoxDriver();
    driver.get("https://www.janisroze.lv/");

    Actions action = new Actions(driver);

    WebElement profileLink = driver.findElement(By.xpath("//ul[@class='account-dropdown long"));
    action.moveToElement(profileLink).build().perform();

    WebElement ielogotiesDropDownItem = driver.findElement(By.xpath("//a[@title='Ielogoties']"));
    ielogotiesDropDownItem.click();


    driver.quit();

    }
}
