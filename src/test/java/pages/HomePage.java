package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.List;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(),this);
           }

    public final String pageTitle = "Transactions";

<<<<<<< HEAD
    @FindBy(xpath = "//button[text()=\"Logout\"]")
    public WebElement signOutButton;
=======
>>>>>>> Liubomyr

    //Created by Beka
    @FindBy(xpath = "//a[text()='Home ']")
    public WebElement labelHome;

    //Created by Beka
    @FindBy(name= "symbol")
    public WebElement symbolInput;

    //Created by Beka
    @FindBy(name= "date")
    public WebElement dateInput;

    //Created by Beka
    @FindBy(xpath = "//button[text()='Search']")
    public WebElement searchButton;

    //Created by Beka
    @FindBy(xpath = "//td[text()='ORPR']")
    public WebElement secondColomFirsRowFromTable;

    @FindBy(xpath = "//thead")
    public WebElement headerOfTable;

    @FindBy(xpath = "//tr")
    public List<WebElement> ListOfAllRowsFromTable;

    //created by Liubomyr
    @FindBy (xpath= "//img[@src='https://www.pinclipart.com/picdir/middle/11-111719_clipart-arrows-graph-trading-icon-png-download.png']")
    public WebElement logo;
    @FindBy (xpath = "//a[text()='Finom Group']")
    public WebElement finomGroupTab;
    @FindBy (xpath = "//a[text()='Slack Channel']")
    public WebElement slackChannelTab;
    @FindBy (xpath = "//a[@class='nav-link dropdown-toggle']")
    public WebElement toolsTab;
    @FindBy (xpath = "//a[text()='Options Calculator']")
    public WebElement calculatorTab;
    @FindBy(xpath = "//a[@href='https://finviz.com/']")
    public WebElement todaysMarketTab;
    @FindBy(xpath = "//a[text()='Vol ETF/ETN Price Converter']")
    public WebElement converterTab;
    @FindBy(xpath = ("(//button[@class='btn btn-outline-success my-2 my-sm-0'])[2]"))
    public WebElement logoutButton;
    @FindBy(xpath = ("//a[@class='btn btn-primary btn-sm mb-3']"))
    public WebElement addTradeButton;
    @FindBy(xpath = "//div[@class='dropdown-menu show']")
    public WebElement toolsDropDown;
    @FindBy(css = (" thead tr th:nth-child(1)"))
    public WebElement actionCol;
    @FindBy(css = (" thead tr th:nth-child(2)"))
    public WebElement symbolCol;
    @FindBy(css = (" thead tr th:nth-child(3)"))
    public WebElement openDateCol;
    @FindBy(css = (" thead tr th:nth-child(4)"))
    public WebElement entryCol;
    @FindBy(css = (" thead tr th:nth-child(5)"))
    public WebElement closeDateCol;
    @FindBy(css = (" thead tr th:nth-child(6)"))
    public WebElement exitCol;
    @FindBy(css = (" thead tr th:nth-child(7)"))
    public WebElement gainLossCol;
    @FindBy(css = (" thead tr th:nth-child(8)"))
    public WebElement action2Col;
    @FindBy(xpath = ("//title[text()='Home - Finom Group']"))
    public WebElement finomGroupPageLogo;
    @FindBy(xpath = ("//head[@id='head']/title"))
    public WebElement calculatorPageLogo;
    @FindBy(xpath = ("//a[@class='logo']"))
    public WebElement finwizPageLogo;
}




