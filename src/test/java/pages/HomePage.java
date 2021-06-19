package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id="username")
    public WebElement usernameInputBox;
    
    @FindBy(id="password")
    public WebElement passwordInputBox;
    
    @FindBy(css = "[type=\"submit\"]")
    public WebElement signInButton;
    
    @FindBy (linkText = "/html/body/nav/a/img")
	public WebElement logo;
    
    @FindBy (xpath ="//*[@id=\"navbarSupportedContent\"]/ul/li[1]/a")
	public WebElement homeTab;
	
	@FindBy (xpath ="//*[@id=\"navbarSupportedContent\"]/ul/li[2]/a")
	public WebElement finomGroupTab;
	
	@FindBy (xpath = "//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a")
	public WebElement slackChannelTab;
	
	@FindBy (xpath = "//*[@id=\"navbarDropdown\"]")
	public WebElement toolsWindow;
	
	@FindBy (xpath = "//*[@id=\"navbarSupportedContent\"]/ul/li[4]/div/a[1]")
	public WebElement calculatorTab;
	
	@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul/li[4]/div/a[2]")
	public WebElement todaysMarketTab;
	
	@FindBy(id = "//*[@id=\"navbarSupportedContent\"]/ul/li[4]/div/a[3]")
	public WebElement converterTab;
}

// This is my HomePage test case
