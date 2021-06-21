Feature: Logout functionality

  Scenario: User successfully log out from system

    Given User is logged in and on Home Page
    When  User clicks on LogOut button
    Then  User should be directed on LogOut confirmation page
    And   User should see message "Are you sure you want to log out?"
    When  User clicks on log out button
    Then  User should be directed to Log In page
    And   User should see message "You have been signed out"

  Scenario: System should allow user to stay Logged In if user navigates back from Logout confirmation page

    Given User is logged in and on Home Page
    When  User clicks on LogOut button
    Then  User should be directed on LogOut confirmation page
    When  User click navigate back and refreshes page
    Then  User should stay on home page.


