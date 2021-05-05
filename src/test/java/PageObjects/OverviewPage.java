package PageObjects;

import FrameWork.Browser.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OverviewPage {

    private WebDriver driver;
    private Waits waits;

    public OverviewPage (WebDriver driver){
        this.driver = driver;
        waits = new Waits(this.driver);
    }


    public WebElement getFinishButton(){
        return this.driver.findElement(By.id("finish"));
    }

    public WebElement getTextTitle() {
        return this.driver.findElement(By.id("finish"));
    }
}
