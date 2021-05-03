package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement getHomeTitle(){
        return driver.findElement(By.xpath("//div[@class='login_logo']"));
    }
    public WebElement getUsernameTextField() {

        return this.driver.findElement(By.id("user-name"));
    }

    public WebElement getPasswordTextField() {

        return this.driver.findElement(By.id("password"));
    }

    public WebElement getStartButton(){
        return driver.findElement(By.id("login-button"));
    }
}
////div[@id='root']/div[@class='login_wrapper']/div[@class='login_wrapper-inner']/" +
//                "div[@class='login-box']/div[@class='form_group']/input[@class='submit-button btn_action']"));
//