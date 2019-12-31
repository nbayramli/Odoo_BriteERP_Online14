Feature: Login

  As As user, I want to be able to login into Odoo-Brite ERP
  under different roles with username and password

@event_scr_manager
Scenario: Login as Events CRM Manager
Given user is on the login page
Then user logs in as Events CRM Manager
And user verifies that "#Inbox" page subtitle is displayed

  @login_with_credentials_ddt
  Scenario Outline: DDT examples with credentials, Login as <username>
    Given user is on the login page
    Then user enters "<username>" username and "<password>" password
    And user verifies that "#Inbox" page subtitle is displayed
    Examples:
      | username                    |  password        |
      | imm45@info.com              | inventorymanager |
      | imm46@info.com              | inventorymanager |
      | imm47@info.com              | inventorymanager |
      | imm48@info.com              | inventorymanager |
      | imm49@info.com              | inventorymanager |
      | posmanager94@info.com       | posmanager       |
      | posmanager95@info.com       | posmanager       |
      | posmanager96@info.com       | posmanager       |
      | posmanager97@info.com       | posmanager       |
      | posmanager98@info.com       | posmanager       |
      | eventscrmmanager50@info.com | eventscrmmanager |
      | eventscrmmanager51@info.com | eventscrmmanager |

  @negative_test
  Scenario:Verify that warning massage is displayed when password is not correct
    Given user is on the login page
    And user enters "imm45@info.com" username and "wrong" password
    And user verifies that "Wrong login/password" message is displayed

  @negative_test
  Scenario:Verify that warning massage is displayed when username is not correct
    Given user is on the login page
    And user enters "wrong" username and "inventorymanager" password
    And user verifies that "Wrong login/password" message is displayed
