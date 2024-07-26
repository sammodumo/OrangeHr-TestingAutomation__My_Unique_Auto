Feature: Manage Employees in OrangeHRM

  Scenario: Add a new employee
    Given I am logged into the OrangeHRM dashboard
    When I navigate to the Add Employee section
    And I fill in the necessary details for a new employee
    And I click on the save button
#    Then the new employee should be added successfully

  Scenario: Search for an existing employee
    Given I am logged into the OrangeHRM website dashboard
    When I search for employee by name "John Tester Doe"
    Then I should see the details of the employee "John Tester"

  Scenario: Edit employee details
    Given I am logging into the OrangeHRM dashboard
    When I search for employee by ID "0361"
    And I update the employee details
    And I click the save button
#    Then the employee details should be updated successfully

  Scenario: Delete an employee
    Given I am logged in the OrangeHRM dashboard
    When I search for the employee by ID "0295"
    And I delete the employee
#    Then the employee "0295" should be deleted from the system