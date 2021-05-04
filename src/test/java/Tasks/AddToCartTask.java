package Tasks;

import FrameWork.Browser.Waits;
import PageObjects.AddToCartPage;
import PageObjects.ProductSelectPage;
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
        addToCartPage.addToCart().click();
     }
}
