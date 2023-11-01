package homework.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BuyTiresTest {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://220.lv");

        WebElement acceptCookie = driver.findElement(By.xpath("//*[@id=\"cookie_block\"]/div/div/div[2]/div[2]/button[3]"));
        acceptCookie.click();

        WebElement autoPrecesMenuItem = driver.findElement(By.xpath("/html/body/div[9]/div/section[1]/div/div[1]/div/div/div/div/div/ul/li[11]/a"));
        autoPrecesMenuItem.click();

        WebElement riepasCategory = driver.findElement(By.xpath("/html/body/div[10]/div/section[2]/div/div/div[2]/div/div[2]/div/div/div[5]/a"));
        riepasCategory.click();

        WebElement vasarasRiepas = driver.findElement(By.xpath("/html/body/div[10]/div/section[2]/div/div/div[2]/div/div[2]/div/div/div[3]/a"));
        vasarasRiepas.click();

        WebElement riepasPlatumsField = driver.findElement(By.xpath("//*[@id=\"dropDownf1502Filter\"]"));
        riepasPlatumsField.sendKeys("215 mm");

        WebElement riepasPlatumsChoose = driver.findElement(By.xpath("//*[@id=\"dropDownf150214073483\"]"));
        riepasPlatumsChoose.click();

        WebElement profilsField = driver.findElement(By.xpath("//*[@id=\"dropDownf1511Filter\"]"));
        profilsField.sendKeys("60");

        WebElement profilsChoose = driver.findElement(By.xpath("//*[@id=\"dropDownf151114836200\"]"));
        profilsChoose.click();

        WebElement bridgestone = driver.findElement(By.xpath("/html/body/div[11]/div/section[2]/div/div/div[1]/ul/div/li[6]/ul/li[1]/div/div[15]/label"));
        bridgestone.click();

        WebElement chooseTires = driver.findElement(By.xpath("/html/body/div[11]/div/section[2]/div/div/div[2]/section/div[7]/div/div[1]/div/div/div[3]/a"));
        chooseTires.click();

        WebElement addToCartButton = driver.findElement(By.xpath("/html/body/div[10]/div/div[2]/section/div/div/div[3]/div[1]/div[4]/div/div[1]"));
        addToCartButton.click();

        driver.quit();
    }
}
