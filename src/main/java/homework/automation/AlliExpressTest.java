package homework.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class AlliExpressTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.aliexpress.com/");

        Thread.sleep (1000);


        WebElement acceptCookies = driver.findElement(By.xpath("//button[@class ='btn-accept']"));
        acceptCookies.click();

        WebElement closePopUp = driver.findElement(By.xpath("//img[@class ='pop-close-btn']"));
        closePopUp.click();

        WebElement closeSubscribeTable = driver.findElement(By.xpath("//img[@class ='_24EHh']"));
        closeSubscribeTable.click();

        WebElement searchBar = driver.findElement(By.id("search-words"));
        searchBar.sendKeys("tattoo");
        searchBar.sendKeys(Keys.ENTER);

        List<WebElement> titleElements = driver.findElements(By.xpath("//h1[@class]"));

        System.out.println("The number of search results: " + titleElements.size());


        System.out.println("The options are ");
        for (WebElement element : titleElements) {
            System.out.println(element.getText());
            System.out.println("_____________________________________________________________");
        }

        Thread.sleep(1000);

        driver.quit();
    }
}

