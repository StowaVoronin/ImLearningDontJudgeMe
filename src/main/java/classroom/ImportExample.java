package classroom;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static java.lang.Thread.sleep;

public class ImportExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver dr = new FirefoxDriver();
        dr.get("http://www.google.com");
        sleep(1000);
        dr.quit();
    }
}
