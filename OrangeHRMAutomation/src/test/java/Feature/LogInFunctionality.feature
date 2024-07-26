Feature: User LogIn

  Scenario: Successful Login with Valid Credentials

    Given the user is on the login page
    When the user enters a valid username and password
    And clicks the "Login" button
    Then the user should be redirected to the Dashboard page


  Scenario: Login with invalid credentials
    Given I am on the OrangeHRM login page
    When I enter invalid username "invalidusername" and invalid password "invalidpassword"
    And I click on the login button
    Then I should see an error message indicating invalid credentials
