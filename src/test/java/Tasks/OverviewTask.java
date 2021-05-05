package Tasks;

import FrameWork.Browser.Waits;
import FrameWork.Report.Report;
import FrameWork.Report.ScreenShot;
import PageObjects.CheckInfoPage;
import PageObjects.OverviewPage;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class OverviewTask {

    private static WebDriver driver;
    private OverviewPage overviewPage;
    private Waits waits;

    public OverviewTask(WebDriver driver) {
        this.driver = driver;
        overviewPage = new OverviewPage(this.driver);
        waits = new Waits(this.driver);
    }

    public void finalizar(){

        validaRealizarLogout();
        overviewPage.getFinishButton().click();
    }

    private void validaRealizarLogout() {
        try {
            waits.loadElement(overviewPage.getTextTitle());
            String titulo = overviewPage.getTextTitle().getText();
            Assertions.assertEquals("FINISH", titulo);
            Report.extentTest.log(Status.PASS, "PÁGINA FINAL ACESSADA COM SUCESSO!", ScreenShot.base64(driver));
        } catch (Exception e) {
            Report.extentTest.log(Status.FAIL, "NÃO FOI POSSÍVEL ACESSAR PÁGINA FINAL!", ScreenShot.base64(driver));
        }
    }
}
