Feature: Manage Employee Performance in OrangeHRM

  Scenario: Add performance review
    Given I am logged into the OrangeHRM dashboard
    When I navigate to the Add Performance Review section
    And I select employee "John Doe"
    And I fill in the performance review details
    And I click on the save button
    Then the performance review should be added successfully

  Scenario: View performance report
    Given I am logged into the OrangeHRM dashboard
    When I search for employee "John Doe"
    And I view the performance report
    Then I should see the performance details of employee "John Doe"