package PageObjects;

import FrameWork.Browser.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToCartPage {

    private WebDriver driver;
    private Waits waits;

    public AddToCartPage(WebDriver driver){
        this.driver = driver;
        waits = new Waits(this.driver);
    }

    public WebElement addToCart(){

        return this.driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)"));
    }

    public WebElement ViewCart(){

        return this.driver.findElement(By.id("shopping_cart_container"));
    }

    public WebElement getTextTitle() {

        return  this.driver.findElement(By.xpath("//div[@class='inventory_details_name large_size']"));
    }
}
