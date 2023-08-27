@jdbc
Feature: jdbc_feature
  Background: connect_db
    Given user connects to the application database
  @user_login
  Scenario: TC01_read_the_login_information
    When user gets the column "*" from the table "jhi_user"
    Then user reads all column "login" data
    And close the connection
  @user_email
  Scenario: TC02_read_the_login_information
    When user gets the column "*" from the table "jhi_user"
    Then user reads all column "email" data
    And close the connection
  @account_accountType
  Scenario: TC03_read_the_account_type_information
    When user gets the column "*" from the table "tp_account"
    Then user reads all column "account_type" data
    And close the connection
  @validate_account_type
  Scenario Outline: TC04_verfiy_account_types
    When user gets the column "*" from the table "tp_account"
    Then verify table "<table_name>" and column "<column_name>" contains following data "<data_name>"
    And close the connection
    Examples:
      | table_name | column_name  | data_name   |
      | tp_account | account_type | CHECKING    |
      | tp_account | account_type | CREDIT_CARD |
      | tp_account | account_type | SAVING      |
      | tp_account | account_type | INVESTING   |