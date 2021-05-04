package Tasks;

import FrameWork.Browser.Waits;
import PageObjects.CheckInfoPage;
import PageObjects.CheckoutPage;
import org.openqa.selenium.WebDriver;

public class CheckInfoTask {

    private static WebDriver driver;
    private CheckInfoPage checkInfoPage;
    private Waits waits;

    public CheckInfoTask(WebDriver driver) {
        this.driver = driver;
        checkInfoPage = new CheckInfoPage(this.driver);
        waits = new Waits(this.driver);
    }

    public void preencherDadosCheckInfo(String firstname, String lastname, String postcode){
        checkInfoPage.getFirstNameTextField().sendKeys(firstname);
        checkInfoPage.getLAstNameTextField().sendKeys(lastname);
        checkInfoPage.getPostCodeTextField().sendKeys(postcode);
        checkInfoPage.getContinueButton().click();


    }
}
