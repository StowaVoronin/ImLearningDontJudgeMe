package classroom;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class LightAutoList {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.ss.com/lv/");

        WebElement carLink = driver.findElement(By.id("mtd_97"));
        carLink.click();


        List<WebElement> titleElements = driver.findElements(By.xpath("//a[@id]"));


        System.out.println("The options are ");
        for (WebElement element : titleElements) {
           System.out.println(element.getText());
        }


        Thread.sleep(1000);

        driver.quit();
    }
}
