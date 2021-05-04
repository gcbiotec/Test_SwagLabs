package PageObjects;

import FrameWork.Browser.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogoutPage {

    private WebDriver driver;
    private Waits waits;

    public LogoutPage (WebDriver driver){
        this.driver = driver;
        waits = new Waits(this.driver);
    }
    public WebElement getMenuButton(){
        return this.driver.findElement(By.id("react-burger-menu-btn"));
    }

    public WebElement getLogoutButton(){

        return this.driver.findElement(By.id("logout_sidebar_link"));
    }
}
