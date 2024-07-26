Feature: Manage Leave Requests in OrangeHRM

  Scenario: Apply for leave
    Given I am  logged into the OrangeHRM dashboard
    When I navigate to the Apply Leave section
    And I fill in the leave details for "John Doe"
    And I click on the apply button
#    Then the leave request should be submitted successfully

#  Scenario: Approve leave request
#    Given I am logged into the OrangeHRM dashboard as a manager
#    When I view pending leave requests
#    And I approve the leave request for employee "John Doe"
#    Then the leave request should be marked as approved
#
#  Scenario: Reject leave request
#    Given I am logged into the OrangeHRM dashboard as a manager
#    When I view pending leave requests
#    And I reject the leave request for employee "Jane Smith"
#    Then the leave request should be marked as rejected