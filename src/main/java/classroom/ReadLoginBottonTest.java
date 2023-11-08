package classroom;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadLoginBottonTest {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.draugiem.lv/?login=0");

        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));

        String nameAttributValue = loginButton.getAttribute("name");
        System.out.println(nameAttributValue);

        driver.quit();
    }
}
