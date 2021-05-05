package Tasks;

import FrameWork.Browser.Waits;
import FrameWork.Report.Report;
import FrameWork.Report.ScreenShot;
import PageObjects.AddToCartPage;
import PageObjects.CheckoutPage;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Assertions;
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
        validaRealizarCheckout();
        checkoutPage.checkoutButton().click();
    }

    private void validaRealizarCheckout() {
        try {
            waits.loadElement(checkoutPage.getTextTitle());
            String titulo = checkoutPage.getTextTitle().getText();
            Assertions.assertEquals("Test.allTheThings() T-Shirt (Red)", titulo);
            Report.extentTest.log(Status.PASS, "PÁGINA DE CHECKOUT  ACESSADA COM SUCESSO!", ScreenShot.base64(driver));
        } catch (Exception e) {
            Report.extentTest.log(Status.FAIL, "NÃO FOI POSSÍVEL ACESSAR PÁGINA DE CHECKOUT!", ScreenShot.base64(driver));
        }
    }
}
