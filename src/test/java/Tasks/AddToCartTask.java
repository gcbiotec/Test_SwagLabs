package Tasks;

import FrameWork.Browser.Waits;
import FrameWork.Report.Report;
import FrameWork.Report.ScreenShot;
import PageObjects.AddToCartPage;
import PageObjects.ProductSelectPage;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class AddToCartTask {

    private static WebDriver driver;
    private AddToCartPage addToCartPage;
    private Waits waits;

    public AddToCartTask(WebDriver driver) {
        this.driver = driver;
        addToCartPage = new AddToCartPage(this.driver);
        waits = new Waits(this.driver);
    }

     public void adicionarCarrinho(){
        validaAddToCart();
        addToCartPage.addToCart().click();
        addToCartPage.ViewCart().click();
     }

    private void validaAddToCart() {
        try {
            waits.loadElement(addToCartPage.getTextTitle());
            String titulo = addToCartPage.getTextTitle().getText();
            Assertions.assertEquals("Test.allTheThings() T-Shirt (Red)", titulo);
            Report.extentTest.log(Status.PASS, "PÁGINA DE SELEÇÃO  ACESSADA COM SUCESSO!", ScreenShot.base64(driver));
        } catch (Exception e) {
            Report.extentTest.log(Status.FAIL, "NÃO FOI POSSÍVEL ACESSAR PÁGINA DE SELEÇÃO!", ScreenShot.base64(driver));
        }
    }
}
