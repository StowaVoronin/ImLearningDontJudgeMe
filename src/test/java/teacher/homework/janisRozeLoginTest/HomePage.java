package teacher.homework.janisRozeLoginTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToLoginPage() {
        Actions action = new Actions(driver);

        WebElement profileLink = driver.findElement(By.xpath("//ul[@class='account-dropdown long']"));
        action.moveToElement(profileLink).build().perform();

        WebElement ielogotiesDropDownItem = driver.findElement(By.xpath("//a[@title='Ielogoties']"));
        ielogotiesDropDownItem.click();
    }

    public void clickLogoButton() {
        WebElement logoButton = driver.findElement(By.xpath("//a[@class='logo logo--regular']"));
        logoButton.click();
    }
    public void clickFacebookLink() {
        WebElement facebookLink = driver.findElement(By.xpath("//div[@class='scandi-facebookconnect-facebook-inner']"));
        facebookLink.click();
    }

}
