Feature: Stock Trade Application functionality
  User navigated, logged in on Stock Trade website and alredy in home page

  Scenario: User should be navigate to Finom Group website
    Given User on the Stock Trade homepage
    Then Finom Group tab is displayed
    When User click on Finom Group tab
    Then User should be navigate to Finom Group website

  Scenario: User should be navigate to  PrimeTech_SDET_Batch1 slack channel.
    Given User on the Stock Trade homepage
    Then Slack Channel tab is displayed
    When User click on Slack Channel tab
    Then User should be navigate to PrimeTech_SDET_Batch1 slack channel

  Scenario: User should be navigate to Tools dropdown window.
    Given User on the Stock Trade homepage
    Then Tools tab is displayed
    When User click on Tools tab
    Then User should see Tools dropdown window
    And User click on Options Calculator tab
    Then User should be navigate to Options Calculatior page

  Scenario: User should be navigate to Tools dropdown window.
    Given User on the Stock Trade homepage
    Then Tools tab is displayed
    When User click on Tools tab
    Then User should see Tools dropdown window
    And User click on Todays Market info tab
    Then User should be navigate to Finviz website

  Scenario: User should be navigate to Tools dropdown window.
    Given User on the Stock Trade homepage
    Then Tools tab is displayed
    When User click on Tools tab
    Then User should see Tools dropdown window
    And User click on Vol ETF/ETN Price converter tab
    Then User should be navigate to Vol ETF/ETN Price converter page
