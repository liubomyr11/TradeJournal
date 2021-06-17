Feature: Login functionality

    Scenario Outline: System should authorize user with VALID credentials

      Given User is on login page
      When User enters valid "<Username>" and "<Password>" and clicks SignIn
      Then User should be directed to home page

      Examples:
        | Username  | Password |
        | Dmitry    | SuperDmitry123! |
        | Abiba     | SuperAbiba123!  |
        | Ulugbek   | SuperUlugbek123!|


  Scenario Outline: System shouldn't authorize user with INVALID credentials

    Given User is on login page
    When User enters invalid "<Username>" and "<Password>" and clicks SignIn
    Then User should see alert message "Bad credentials" and stay on login page

    Examples:
      | Username  | Password       |
      | Dmitry    | Orange         |
      | Orange    | SuperDmitry123!|
      | Ulugbek   | SuperDmitry123!|
      |!@#$%^&*() | !@#$%^&*()     |
      |!@#$%123456| 1234567#$%^&*  |