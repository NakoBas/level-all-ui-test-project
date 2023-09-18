package page_object_models;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class LevelAllPage {


    public LevelAllPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(css = "form>input:nth-child(1)")
    public WebElement emailInputBox;

    @FindBy(id = "email")
    public WebElement emailInputBoxText;

    @FindBy(css = "section > div > a")
    public WebElement startYourFreeTrialButton;

}
