Feature: Stock Trade homepage components verification
  User navigated, logged in on Stock Trade website and alredy in home page

@logoTest
  Scenario: User should be stay on home page and see logo
    Given User on the Stock Trade homepage
    Then Logo is displayed
    When User click on logo
    Then User should be stay on home page
    
@homeTabTest
  Scenario: User should be stay on home page and see home tab, located to the right of the logo
    Given User on the Stock Trade homepage
    Then home tab is displayed
    When User click on home tab
    Then User should be stay on home page
    
@finomGroupTabTest
  Scenario: User should be navigate to Finom Group website
    Given User on the Stock Trade homepage
    Then Finom Group tab is displayed
    When User click on Finom Group tab
    Then User should be navigate to Finom Group website
    
@slackChannelTabTest
  Scenario: User should be navigate to  PrimeTech_SDET_Batch1 slack channel.
    Given User on the Stock Trade homepage
    Then Slack Channel tab is displayed
    When User click on Slack Channel tab
    Then User should be navigate to PrimeTech_SDET_Batch1 slack channel
    
@calculatiorTest
  Scenario: User should be navigate to Tools dropdown window
    Given User on the Stock Trade homepage
    Then Tools tab is displayed
    When User click on Tools tab
    Then User should see Tools dropdown window
    And User click on Options Calculator tab
    Then User should be navigate to Options Calculatior page
    
@todaysMarketTest
  Scenario: User should be navigate to Tools dropdown window
    Given User on the Stock Trade homepage
    Then Tools tab is displayed
    When User click on Tools tab
    Then User should see Tools dropdown window
    And User click on Todays Market info tab
    Then User should be navigate to Finviz website
    
@converterTest
  Scenario: User should be navigate to Tools dropdown window
    Given User on the Stock Trade homepage
    Then Tools tab is displayed
    When User click on Tools tab
    Then User should see Tools dropdown window
    And User click on Vol ETF/ETN Price converter tab
    Then User should be navigate to Vol ETF/ETN Price converter page
    
@symbolBoxTest
  Scenario: User should be see Symbol search box, located to the right of Tools tab
    Given User on the Stock Trade homepage
    Then Symbol search box is displayed
    
@dateTest
  Scenario: User should be see textbox mm/dd/yyyy and calender date picker, located to the right of Symbol search box
    Given User on the Stock Trade homepage
    Then textbox mm/dd/yyyy and calender date picker is displayed
    
@searchButtonTest
  Scenario: User should be see Search button, located to the right of textbox mm/dd/yyyy
    Given User on the Stock Trade homepage
    Then Search button is displayed
    
@logoutButtonTest
  Scenario: User should be see Logout button, located to the right of Search button
    Given User on the Stock Trade homepage
    Then Logout button is displayed
    
@addTradeButtonTest
  Scenario: User should be see Add trade button, located underneath the global header.
    Given User on the Stock Trade homepage
    Then Add trade button is displayed
    
@tableTest
  Scenario: User should be see data table with the following columns
    Given User on the Stock Trade homepage
    When Stock Trade data table is displayed
    Then User should see all data table column names
