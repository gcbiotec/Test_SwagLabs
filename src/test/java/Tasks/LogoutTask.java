package Tasks;

import FrameWork.Browser.Waits;
import PageObjects.LogoutPage;
import PageObjects.OverviewPage;
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
        logoutPage.getLogoutButton().click();
    }
}
