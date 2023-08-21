@so2
Feature: data_table_creation

  Scenario Outline: Create user and verify user creation


    Given user navigates to "https://editor.datatables.net/"
    When user clicks on new button
    And user enters first name as "<first_name>"
    And user enters last name as "<last_name>"
    And user enters position as "<position>"
    And user enters office as "<office>"
    And user enters extension as "<extension>"
    And user enters start date as "<start_date>"
    And user enters salary as "<salary>"
    And user clicks on create button
    Then close the application
    Examples:
      | first_name | last_name | position | office | extension | start_date | salary |
      | John       | Doe       | QA       | NY     | 123       | 2023-08-15 | 10000  |
      | Mary       | Foe       | Manager  | LA     | 555       | 2021-08-15 | 30000  |