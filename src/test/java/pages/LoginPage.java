package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id="username")
    public WebElement usernameInputBox;

    @FindBy(id="password")
    public WebElement passwordInputBox;

    @FindBy(css = "[type=\"submit\"]")
    public WebElement signInButton;

    @FindBy(css = "[class=\"form-signin-heading\"]")
    public WebElement mainLogInHeader;

    @FindBy(css = "[role=\"alert\"]")
    public WebElement alertMessage;


    public final String pageTitle = "Please sign in";
}
