package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class StockTrackTrakingSignInPage {
	public StockTrackTrakingSignInPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath = "//h2[text()='Please sign in']")
	public WebElement pleaseSingInElem;

	@FindBy(id = "username")
	public WebElement userNameElem;

	@FindBy(id="password")
	public WebElement passwordElem;
	
	
	@FindBy(xpath ="//button[text()='Sign in']")
	public WebElement singInBtn;
	

	
}
