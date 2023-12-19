package teacher.homework.janisRozeLoginTest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
    private WebDriver driver;


    private By profileLinkLocator = By.xpath("//ul[@class='account-dropdown long']");
    private By ielogotiesDropDownItemLocator = By.xpath("//a[@title='Ielogoties']");
    private By logoButtonLocator = By.xpath("//a[@class='logo logo--regular']");
    private By facebookLinkLocator = By.xpath("//div[@class='scandi-facebookconnect-facebook-inner']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToLoginPage() {
        Actions action = new Actions(driver);

        WebElement profileLink = driver.findElement(profileLinkLocator);
        action.moveToElement(profileLink).build().perform();

        WebElement ielogotiesDropDownItem = driver.findElement(ielogotiesDropDownItemLocator);
        ielogotiesDropDownItem.click();
    }

    public void clickLogoButton() {
        WebElement logoButton = driver.findElement(logoButtonLocator);
        logoButton.click();
    }

    public void clickFacebookLink() {
        WebElement facebookLink = driver.findElement(facebookLinkLocator);
        facebookLink.click();
    }
}
