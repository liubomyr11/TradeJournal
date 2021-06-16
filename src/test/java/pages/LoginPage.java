package pages;

import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
