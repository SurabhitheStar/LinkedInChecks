Feature: LinkedIn JobSearch

  Scenario: Login to LinkedIn and Search for jobs with different roles
    Given As a user I login to LinkedIn
    And I Verify user "Surabhi Jaiswal" is logged in
    Then I Navigate to Jobs Section
    And I search for jobs with Roles and Locations
      | Roles   | Locations   |
      | Testing | New Zealand |
      | Automation Testing | New Zealand |
