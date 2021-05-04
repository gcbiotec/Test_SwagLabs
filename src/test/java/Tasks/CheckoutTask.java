package Tasks;

import FrameWork.Browser.Waits;
import PageObjects.AddToCartPage;
import PageObjects.CheckoutPage;
import org.openqa.selenium.WebDriver;

public class CheckoutTask {

    private static WebDriver driver;
    private CheckoutPage checkoutPage;
    private Waits waits;

    public CheckoutTask(WebDriver driver) {
        this.driver = driver;
        checkoutPage = new CheckoutPage(this.driver);
        waits = new Waits(this.driver);
    }

    public void realizarCheckout(){
        
        checkoutPage.checkoutButton().click();
    }
}
