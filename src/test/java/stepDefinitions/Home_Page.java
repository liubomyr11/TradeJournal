package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AdditionalPages;
import pages.HomePage;
import utils.BrowserUtils;
import utils.Driver;

public class Home_Page {
    HomePage homepage = new HomePage();

AdditionalPages titles = new AdditionalPages();


//pass
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
        Assert.assertEquals(homepage.pageTitle, Driver.getDriver().getTitle());
    }


//pass
    @Then("home tab is displayed")
    public void home_tab_is_displayed() {
homepage.labelHome.isDisplayed();
    }
    @When("User clicks on home tab")
    public void user_clicks_on_home_tab() {
homepage.labelHome.click();
    }



//fail
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
        BrowserUtils.wait(10);
        System.out.println(Driver.getDriver().getTitle());
      //  Assert.assertEquals(titles.finomTitle, Driver.getDriver().getTitle());
    }



//fail
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
        BrowserUtils.wait(10);
        Assert.assertEquals(titles.slackTitle, Driver.getDriver().getTitle());
    }



//fail
    @Then("Tools tab is displayed")
    public void tools_tab_is_displayed() {
homepage.toolsTab.isDisplayed();
    }
     @When("User click on Tools tab")
     public void user_click_on_tools_tab(){
        homepage.toolsTab.click();
     }
    @Then("User should see Tools dropdown window")
    public void user_should_see_tools_dropdown_window() {
        BrowserUtils.wait(2);
Assert.assertTrue(homepage.toolsDropDown.isDisplayed());
    }
    @Then("User click on Options Calculator tab")
    public void user_click_on_options_calculator_tab() {
homepage.calculatorTab.isDisplayed();
    }
    @Then("User should be able to navigate to Options Calculatior page")
    public void user_should_be_able_to_navigate_to_options_calculatior_page() {
        BrowserUtils.wait(3);
        Assert.assertEquals(titles.calculatorTitle, Driver.getDriver().getTitle());
    }

    //fail
    @When("User clicks on Todays Market info tab")
    public void user_clicks_on_todays_market_info_tab() {
homepage.todaysMarketTab.click();
    }
    @Then("User should be able to navigate to Finviz website")
    public void user_should_be_able_to_navigate_to_finviz_website() {
        Assert.assertEquals(titles.finvizTitle, Driver.getDriver().getTitle());
    }

    @And("User click on Vol ETF/ETN Price converter tab")
    public void user_click_on_vol_etf_etn_price_converter_tab() {
homepage.converterTab.click();
    }
    @Then("User should be able to navigate to Vol ETF/ETN Price converter page")
    public void user_should_be_able_to_navigate_to_vol_etf_etn_price_converter_page() {


//bug
    }
//pass
    @Then("Symbol search box is displayed")
    public void symbol_search_box_is_displayed() {
homepage.symbolInput.isDisplayed();
    }
//pass
    @Then("textbox mm\\/dd\\/yyyy and calender date picker is displayed")
    public void textbox_mm_dd_yyyy_and_calender_date_picker_is_displayed() {
homepage.dateInput.isDisplayed();
    }
//pass
    @Then("Search button is displayed")
    public void search_button_is_displayed() {
homepage.searchButton.isDisplayed();
    }
//pass
    @Then("Logout button is displayed")
    public void logout_button_is_displayed() {
homepage.logoutButton.isDisplayed();
    }
//pass
    @Then("Add trade button is displayed")
    public void add_trade_button_is_displayed() {
homepage.addTradeButton.isDisplayed();
    }
//pass
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
