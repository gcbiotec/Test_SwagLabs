package Tasks;

import FrameWork.Browser.Waits;
import FrameWork.Report.Report;
import FrameWork.Report.ScreenShot;
import PageObjects.ProductSelectPage;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class ProductSelectTask {

    private static WebDriver driver;
    private ProductSelectPage productSelectPage;
    private Waits waits;

    public ProductSelectTask(WebDriver driver){
        this.driver = driver;
        productSelectPage = new ProductSelectPage(this.driver);
        waits = new Waits(this.driver);
    }
    public void selecionarProduto() {
        validaProductSelect();
        productSelectPage.getChooseProduct().click();

    }

    private void validaProductSelect(){
        try{waits.loadElement(productSelectPage.getTextTitle());
            String titulo = productSelectPage.getTextTitle().getText();
            Assertions.assertEquals("PRODUCTS", titulo);
            Report.extentTest.log(Status.PASS, "PÁGINA DE SELEÇÃO DE PRODUTOS  ACESSADA COM SUCESSO!", ScreenShot.base64(driver));
        }catch(Exception e) {
            Report.extentTest.log(Status.FAIL, "NÃO FOI POSSÍVEL ACESSAR PÁGINA DE PRODUTOS!", ScreenShot.base64(driver));
        }
    }
}
