package TestCases;

import FrameWork.BaseTest;
import FrameWork.Report.Report;
import FrameWork.Report.ScreenShot;
import PageObjects.ProductSelectPage;
import Tasks.AddToCartTask;
import Tasks.CheckoutTask;
import Tasks.HomeTask;
import Tasks.ProductSelectTask;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.openqa.selenium.WebDriver;

public class EnterUserArea extends BaseTest {

    private WebDriver driver = this.getDriver();
    private HomeTask homeTask = new HomeTask(driver);
    private ProductSelectTask productSelectTask = new ProductSelectTask(driver);
    private AddToCartTask addToCartTask = new AddToCartTask(driver);
    private CheckoutTask checkoutTask = new CheckoutTask(driver);

    @ParameterizedTest
    @CsvFileSource(resources = "/CSV/dadosForm.csv",numLinesToSkip = 1)
    public void AcessarCadastroComDadosUsernamePassword(String username,String password){
        try{
            Report.startReport("Acessando área de usuário");
            homeTask.acessarPageAutomacaoWeb();
            homeTask.preencheDadosCSV(username, password);
            productSelectTask.selecionarProduto();
            addToCartTask.adicionarCarrinho();
            checkoutTask.realizarCheckout();

        }catch (Exception e){
            Report.extentTest.log(Status.ERROR, e.getMessage(), ScreenShot.base64(driver));

        }
    }
}
