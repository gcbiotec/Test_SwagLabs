package Tasks;

import FrameWork.Browser.Waits;
import FrameWork.Report.Report;
import FrameWork.Report.ScreenShot;
import PageObjects.LogoutPage;
import PageObjects.OverviewPage;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class LogoutTask {

    private static WebDriver driver;
    private LogoutPage logoutPage;
    private Waits waits;

    public LogoutTask(WebDriver driver) {
        this.driver = driver;
        logoutPage = new LogoutPage(this.driver);
        waits = new Waits(this.driver);
    }

    public void fazerLogout(){

        logoutPage.getMenuButton().click();
        validaLogout();
        logoutPage.getLogoutButton().click();
    }

    private void validaLogout() {
        try {
            waits.loadElement(logoutPage.getLogoutButton());
            String titulo = logoutPage.getLogoutButton().getText();
            Assertions.assertEquals("LOGOUT", titulo);
            Report.extentTest.log(Status.PASS, "PÁGINA LOGOUT  ACESSADA COM SUCESSO!", ScreenShot.base64(driver));
        } catch (Exception e) {
            Report.extentTest.log(Status.FAIL, "NÃO FOI POSSÍVEL ACESSAR PÁGINA LOGOUT!", ScreenShot.base64(driver));
        }
    }
}
