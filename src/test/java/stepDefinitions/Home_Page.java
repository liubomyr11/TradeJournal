package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import utils.BrowserUtils;

public class Home_Page {
    HomePage homepage = new HomePage();
    LoginPage login = new LoginPage();
    BrowserUtils utils = new BrowserUtils();

    @Then("Logo is displayed")
    public void logo_is_displayed() {
homepage.logo.isDisplayed();
    }
    @When("User clicks on logo")
    public void user_clicks_on_logo() {
        homepage.logo.click();
    }
    @Then("User should be able to be directed to the home page")
    public void user_should_be_able_to_be_directed_to_the_home_page() {
        Assert.assertEquals(homepage.actionCol.getText(), "Action");
    }

    @Then("home tab is displayed")
    public void home_tab_is_displayed() {
homepage.labelHome.isDisplayed();
    }
    @When("User clicks on home tab")
    public void user_clicks_on_home_tab() {
homepage.labelHome.click();
    }

    @Then("Finom Group tab is displayed")
    public void finom_group_tab_is_displayed() {
homepage.finomGroupTab.isDisplayed();
    }
    @When("User click on Finom Group tab")
    public void user_click_on_finom_group_tab() {
        homepage.finomGroupTab.click();
    }
    @Then("User should be able to navigate to Finom Group website")
    public void user_should_be_able_to_navigate_to_finom_group_website() {
        utils.wait(4);
Assert.assertTrue(homepage.finomGroupPageLogo.isDisplayed());
    }

    @Then("Slack Channel tab is displayed")
    public void slack_channel_tab_is_displayed() {
homepage.slackChannelTab.isDisplayed();
    }
    @When("User click on Slack Channel tab")
    public void user_click_on_slack_channel_tab() {
        homepage.slackChannelTab.click();
    }
    @Then("User should be able to navigate to PrimeTech_SDET_Batch1 slack channel")
    public void user_should_be_able_to_navigate_to_prime_tech_sdet_batch1_slack_channel() {
Assert.assertTrue(homepage.slackChannelPage.isDisplayed());
    }

    @Then("Tools tab is displayed")
    public void tools_tab_is_displayed() {
homepage.toolsTab.isDisplayed();
    }
    @Then("User should see Tools dropdown window")
    public void user_should_see_tools_dropdown_window() {
Assert.assertTrue(homepage.calculatorTab.isDisplayed());
    }
    @Then("User click on Options Calculator tab")
    public void user_click_on_options_calculator_tab() {
homepage.calculatorTab.isDisplayed();
    }
    @Then("User should be able to navigate to Options Calculatior page")
    public void user_should_be_able_to_navigate_to_options_calculatior_page() {
Assert.assertTrue(homepage.calculatorPageLogo.isDisplayed());
    }
    @When("User clicks on Todays Market info tab")
    public void user_clicks_on_todays_market_info_tab() {
homepage.todaysMarketTab.click();
    }
    @Then("User should be able to navigate to Finviz website")
    public void user_should_be_able_to_navigate_to_finviz_website() {
Assert.assertTrue(homepage.finwizPageLogo.isDisplayed());
    }

    @And("User click on Vol ETF/ETN Price converter tab")
    public void user_click_on_vol_etf_etn_price_converter_tab() {
homepage.converterTab.click();
    }
    @Then("User should be able to navigate to Vol ETF/ETN Price converter page")
    public void user_should_be_able_to_navigate_to_vol_etf_etn_price_converter_page() {
//bug
    }

    @Then("Symbol search box is displayed")
    public void symbol_search_box_is_displayed() {
homepage.symbolInput.isDisplayed();
    }

    @Then("textbox mm/dd/yyyy and calender date picker is displayed")
    public void textbox_mm_dd_yyyy_and_calender_date_picker_is_displayed() {
homepage.dateInput.isDisplayed();
    }

    @Then("Search button is displayed")
    public void search_button_is_displayed() {
homepage.searchButton.isDisplayed();
    }

    @Then("Logout button is displayed")
    public void logout_button_is_displayed() {
homepage.logoutButton.isDisplayed();
    }

    @Then("Add trade button is displayed")
    public void add_trade_button_is_displayed() {
homepage.addTradeButton.isDisplayed();
    }

    @Then("User should see able to all data table column names")
    public void user_should_see_able_to_all_data_table_column_names() {
Assert.assertEquals(homepage.actionCol.getText(), "Action");
        Assert.assertEquals(homepage.symbolCol.getText(), "Symbol");
        Assert.assertEquals(homepage.openDateCol.getText(), "Open date");
        Assert.assertEquals(homepage.entryCol.getText(), "Entry");
        Assert.assertEquals(homepage.closeDateCol.getText(), "Close date");
        Assert.assertEquals(homepage.exitCol.getText(), "Exit");
        Assert.assertEquals(homepage.gainLossCol.getText(), "Gain/Loss");
        Assert.assertEquals(homepage.action2Col.getText(), "Action");
    }
}
