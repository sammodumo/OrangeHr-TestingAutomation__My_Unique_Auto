Feature: Track Time in OrangeHRM

  Scenario: Log work hours
    Given I am logged into the OrangeHRM dashboard
    When I navigate to the Log Work Hours section
    And I enter hours worked for today
    And I click on the save button
    Then the work hours should be logged successfully

  Scenario: View timesheet
    Given I am logged into the OrangeHRM dashboard
    When I navigate to the Timesheet section
    Then I should see my timesheet with logged hours