Feature: google search feature

  Scenario: TC01_iphone_search
    Given user is on the homepage
    And user search for iPhone
    Then verify the page title contains iPhone
  # Feature files are created using Gherkin language
  #
