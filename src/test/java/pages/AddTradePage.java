package pages;

import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class AddTradePage {
    public AddTradePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
