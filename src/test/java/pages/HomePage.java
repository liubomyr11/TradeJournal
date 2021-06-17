package pages;

import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    public final String pageTitle = "Transactions";
}
