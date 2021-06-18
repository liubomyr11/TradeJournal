Feature: Stock Trade homepage components verification
  User navigated, logged in on Stock Trade website and alredy in home page
@ LogoTest
  Scenario: User should be stay on home page and see logo
    Given User on the Stock Trade homepage
    Then Logo is displayed
    When User click on logo
    Then User should be stay on home page
    
  Scenario: User should be stay on home page and see home tab, located to the right of the logo
    Given User on the Stock Trade homepage
    Then home tab is displayed
    When User click on home tab
    Then User should be stay on home page

  Scenario: User should be see Symbol search box, located to the right of Tools tab.
    Given User on the Stock Trade homepage
    Then Symbol search box is displayed.

  Scenario: User should be see textbox mm/dd/yyyy and calender date picker, located to the right of Symbol search box.
    Given User on the Stock Trade homepage
    Then textbox mm/dd/yyyy and calender date picker is displayed

  Scenario: User should be see Search button, located to the right of textbox mm/dd/yyyy.
    Given User on the Stock Trade homepage
    Then Search button is displayed.

  Scenario: User should be see Logout button, located to the right of Search button.
    Given User on the Stock Trade homepage
    Then Logout button is displayed.

  Scenario: User should be see Add trade button, located underneath the global header.
    Given User on the Stock Trade homepage
    Then Add trade button is displayed.

  Scenario: User should be see data table with the following columns
    Given User on the Stock Trade homepage
    When Stock Trade data table is displayed
    Then User should see all data table column names
    
    
