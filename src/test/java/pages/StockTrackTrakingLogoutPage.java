package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class StockTrackTrakingLogoutPage {
	public StockTrackTrakingLogoutPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath = "//button[text()='Logout']")
	public WebElement logOutBtn;

	@FindBy(xpath="//h2[text()='Are you sure you want to log out?']")
	public WebElement confirmLogoutText;

	@FindBy(xpath="//button[text()='Log Out']")
	public WebElement logoutPagelogOutElem;
	
	@FindBy(xpath="//div[text()='You have been signed out']")
	public WebElement alertSignedOutText;
	
}
