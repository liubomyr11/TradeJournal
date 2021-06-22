@Smoke
Feature: RC-6 Search Functionality
 #at least 1 trade has been entered by the user. ORPR data 06/12/2021.

  Scenario: RC-30 Verify user see result after searching with valid credential

    Given User is on the Homepage after sign in
    When user enters a value ORPR for Symbol and actual date
    And user click Search,
    Then user should be able to filter on the listed trades.

  Scenario: RC-34 Verify user see empty page after searching with invalid credential (empty inputs)
    Given User is on the Homepage after sign in
    When verify if input field symbol and date is empty
    And user click Search,
    Then user should be able to see all existing stocks








