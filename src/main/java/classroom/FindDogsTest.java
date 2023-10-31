package classroom;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindDogsTest {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("http//www.ss.com/lv/");

        WebElement suniKuceniLink = driver.findElement(By.id("mtd_300"));
        suniKuceniLink.click();

        WebElement vecumsNoField = driver.findElement(By.id("f_o_1276_min"));
        vecumsNoField.sendKeys("1");

        WebElement mekletButton = driver.findElement(By.className("s12"));
        mekletButton.submit();


    }
}
