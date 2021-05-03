package PageObjects;

import FrameWork.Browser.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductSelectPage {

    private WebDriver driver;
    private Waits waits;

    public ProductSelectPage(WebDriver driver){
        this.driver = driver;
        waits = new Waits(this.driver);
    }

    public WebElement getChooseProduct(){

        return this.driver.findElement(By.id("item_3_img_link"));
    }

    public WebElement getTextTitle(){

        return this.driver.findElement(By.xpath("//div[@class='header_secondary_container']/div[@class='title']"));

    }

}
