package PageObjects;

import FrameWork.Browser.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckInfoPage {

    private WebDriver driver;
    private Waits waits;

    public CheckInfoPage (WebDriver driver){
        this.driver = driver;
        waits = new Waits(this.driver);
    }

    public WebElement getFirstNameTextField() {

        return this.driver.findElement(By.id("first-name"));
    }

    public WebElement getLAstNameTextField() {

        return this.driver.findElement(By.id("last-name"));
    }

    public WebElement getPostCodeTextField() {

        return this.driver.findElement(By.id("postal-code"));
    }

    public WebElement getContinueButton(){
        return this.driver.findElement(By.id("continue"));
    }
}
