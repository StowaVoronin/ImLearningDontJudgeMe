package teacher.classwork.sauceDemoTesting.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryPage {
    WebDriver driver;

    String burgerMenuID = "react-burger-menu-btn";

    public InventoryPage(WebDriver driver){
        this.driver = driver;
    }
    public boolean isOpen(){
        WebElement burgerMenu = driver.findElement(By.id(burgerMenuID));

        if ( burgerMenu.isDisplayed()) return true;
        else  return false;
    }
}
