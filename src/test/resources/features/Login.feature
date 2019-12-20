Feature: Login
  As As user, I want to be able to login into Odoo-Brite ERP
  under different roles with username and password

  @inventorymanager
  Scenario: Login as a inventory manager
    Given user is on the landing page
    Then user signIn
    Then user is on the login page
    Then user logs in as a inventory manager
    And user verifies that "#Inbox - Odoo" page subtitle is displayed

  @posmanager
  Scenario: Login as a inventory manager
    Given user is on the landing page
    Then user signIn
    Then user is on the login page
    Then user logs in as a inventory manager
    And user verifies that "#Inbox - Odoo" page subtitle is displayed


  @eventscrmmanager
  Scenario: Login as a inventory manager
    Given user is on the landing page
    Then user signIn
    Then user is on the login page
    Then user logs in as a inventory manager
    And user verifies that "#Inbox - Odoo" page subtitle is displayed


  @negative_test
  Scenario:Verify that warning massage is displayed when password is not correct
    Given user is on the landing page
    Then user signIn
    Then user is on the login page
    Then user enters "imm45@info.com" username and "wrong" password
    And user verifies that "Wrong login/password" message is displayed

  @negative_test
  Scenario:Verify that warning massage is displayed when username is not correct
    Given user is on the landing page
    Then user signIn
    Then user is on the login page
    Then user enters "wrong" username and "inventorymanager" password
    And user verifies that "Invalid user name or password." message is displayed



          # //*[normalize-space()='Wrong login/password'] - warning message