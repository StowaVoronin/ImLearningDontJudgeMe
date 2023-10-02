// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class SeleniumTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void selenium() {
    driver.get("https://www.google.com/search?q=javaguru&sca_esv=569950492&sxsrf=AM9HkKn2iWOFXXDCVog3zD95UYXrD2_S4g%3A1696233540887&source=hp&ei=RHgaZb7YM76Kxc8PxKypuA0&iflsig=AO6bgOgAAAAAZRqGVNrErPaxJv1NLRtDN0d7tN14NqF2&ved=0ahUKEwi-iqKt8taBAxU-RfEDHURWCtcQ4dUDCAo&uact=5&oq=javaguru&gs_lp=Egdnd3Mtd2l6IghqYXZhZ3VydTIEECMYJzIQEC4YgAQYFBiHAhjHARivATIFEAAYgAQyChAAGMsBGIAEGAoyBBAAGB4yAhAmSLguUABY0iBwAHgAkAEAmAHBAaABngiqAQMwLji4AQPIAQD4AQHCAgcQABiKBRhDwgINEC4YigUYxwEYrwEYQ8ICCxAAGIAEGLEDGIMBwgIXEC4YgAQYsQMYgwEYxwEYrwEYmAUYmQXCAgwQIxiKBRgTGIAEGCfCAg0QABiKBRixAxiDARhDwgIPEAAYgAQYsQMYgwEYChgBwgILEC4YigUYsQMYgwHCAggQLhjLARiABMICCBAAGMsBGIAE&sclient=gws-wiz");
    driver.manage().window().setSize(new Dimension(904, 534));
    driver.findElement(By.cssSelector(".k6WZR > span")).click();
    driver.findElement(By.cssSelector(".single-hero-button > .pulse-button")).click();
    driver.findElement(By.name("form-name")).click();
    driver.findElement(By.name("form-name")).sendKeys("Text");
    driver.findElement(By.name("form-surname")).click();
    driver.findElement(By.name("form-surname")).sendKeys("text");
    driver.findElement(By.name("form-email")).click();
    driver.findElement(By.name("form-email")).sendKeys("ttext@text");
    driver.findElement(By.name("form-phone")).click();
    driver.findElement(By.name("form-phone")).sendKeys("3333344444");
    driver.findElement(By.cssSelector(".submit-button > .default-button")).click();
  }
}
