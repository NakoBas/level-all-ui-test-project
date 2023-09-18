package script;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_object_models.LevelAllPage;


public class Level_All_Test extends Base {

    /*
    Within this framework, I've built some key components to showcase my skills. I can expand it further, like adding Smoke and Regression tests, and more helpful methods in the Utils package.
    I've organized a Page Object Model (POM) package to keep all locators tidy. This makes our code cleaner, easier to maintain, and promotes code reuse.
    In the Script package, I've created a Base Class that serves as the foundation for all scripts. It includes useful features like @BeforeMethod and @AfterMethod annotations, POM declaration, and WebDriver setup.
    In the Utils package, I've added two essential classes: Driver and ConfigurationReader. They simplify script development and configuration management.
    I've also set up a configuration.properties file, which allows me to run tests with different web browsers, expanding our testing capabilities.
     */


    @BeforeMethod
    public void setup() {

        driver.get("https://www.levelall.com/");
        levelAllPage = new LevelAllPage();

    }


    @Test
        public void validateEmailForm(){

            Assert.assertTrue(levelAllPage.emailInputBox.isEnabled());
            Assert.assertTrue(levelAllPage.emailInputBox.isDisplayed());
            Assert.assertEquals(levelAllPage.emailInputBoxText.getAttribute("placeholder"),"Enter your email address");
            Assert.assertTrue(levelAllPage.startYourFreeTrialButton.isEnabled());
            Assert.assertTrue(levelAllPage.startYourFreeTrialButton.isDisplayed());

        }








}