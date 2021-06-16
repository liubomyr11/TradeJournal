package pages;

import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class LogOutPage {

    public LogOutPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
