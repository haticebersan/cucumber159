@param_feature
Feature:search_feature
  Background: user_goes_to_google_home_page
    Given user navigates to "https://google.com"

  Scenario: TC01_iphone_search
    And user accepts cookies
    When user search for "iPhone"
    Then verify the page title contains "iPhone"
    And close the application

  Scenario: TC02_tesla_search
    And user accepts cookies
    When user search for "Tesla"
    Then verify the page title contains "Tesla"
    And close the application

  Scenario: TC02_tesla_search
    And user accepts cookies
    When user search for "Tesla"
    Then verify the page title contains "Tesla"
    And close the application

  Scenario: TC02_bmw_search
    And user accepts cookies
    When user search for "bmw"
    Then verify the page title contains "bmw"
    And close the application

  Scenario: TC02_flower_search
    And user accepts cookies
    When user search for "flower"
    Then verify the page title contains "flower"
    And close the application

  Scenario: TC05_bread_search
    And user accepts cookies
    When user search for "bread"
    Then verify the page title contains "bread"
    And close the application