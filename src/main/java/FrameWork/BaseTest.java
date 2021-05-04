package FrameWork;

import FrameWork.Browser.DriverManager;
import FrameWork.Browser.TypeDriver;
import FrameWork.Report.Report;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class BaseTest extends DriverManager {

    private static WebDriver driver;

    private String url = "https://www.saucedemo.com/";

    public WebDriver getDriver(){
        return driver = getDriver(TypeDriver.FIREFOX);

    }
    @BeforeEach
    public void setUp(){
        Report.setExtentReport();
        getDriver().get(url);
    }

    @AfterEach
    public void tearDown(){
        Report.endReport();
        quitDriver();
    }
}
