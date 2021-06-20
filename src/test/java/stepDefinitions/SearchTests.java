package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.HomePage;
import utils.BrowserUtils;

public class SearchTests {

    //===================================================================================
    //Scenario Outline: RC-30 Verify user see result after searching with valid credential
    HomePage HP = new HomePage();
    @Given("user navigate the Homepage")
    public void user_navigate_the_homepage() {
        //verify if page is display label
        Assert.assertTrue(HP.labelHome.isDisplayed());
    }
    @When("user enters a value ORPR for Symbol and actual date")
    public void user_enters_a_value_orpr_for_symbol_and_actual_date() {
        HP.symbolInput.sendKeys("ORPR");
        HP.dateInput.sendKeys("11112021");
    }
    @And("user click Search,")
    public void user_click_search() {
      HP.searchButton.click();
    }
    @Then("user should be able to filter on the listed trades.")
    public void user_should_be_able_to_filter_on_the_listed_trades() {
    Assert.assertEquals(HP.secondColomFirsRowFromTable.getText(), "ORPR");
    }
   //===========================================================================================================
  // Scenario Outline: RC-34 Verify user see empty page after searching with invalid credential (empty inputs)
    @When("verify if input field symbol and date is empty")
    public void verify_if_input_field_symbol_and_date_is_empty() {
       Assert.assertTrue(HP.symbolInput.getText().isEmpty());
       Assert.assertTrue(HP.dateInput.getText().isEmpty());
    }
    //This step already defined (@And("user click Search,"))

    @Then("user should be able to see all existing stocks")
    public void user_should_be_able_to_see_onle_header_of_table() {
       Assert.assertTrue(HP.headerOfTable.isDisplayed());
        Assert.assertTrue(HP.ListOfAllRowsFromTable.size()!=0);

    }
}
