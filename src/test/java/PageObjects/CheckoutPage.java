package PageObjects;

import FrameWork.Browser.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {

    private WebDriver driver;
    private Waits waits;

    public CheckoutPage(WebDriver driver){
        this.driver = driver;
        waits = new Waits(this.driver);
    }

    public WebElement checkoutButton(){

        return this.driver.findElement(By.id("checkout_button"));
    }

}
