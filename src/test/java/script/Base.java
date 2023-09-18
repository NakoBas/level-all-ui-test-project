package script;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import page_object_models.LevelAllPage;
import utils.Driver;

public class Base {

    public static WebDriver driver; // declaration



    public static LevelAllPage levelAllPage; //Declaring pages


    @BeforeMethod
    public void setUp() {
        driver = Driver.getDriver();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Driver.quitDriver();
    }
}
