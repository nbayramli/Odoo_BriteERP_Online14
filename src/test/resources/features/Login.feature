Feature: Login
  As user, I want to to be able to login into Odoo_BriteERP under different roles with username and password

@event_scr_manager
Scenario: Login as Events CRM Manager
Given user is on the login page
Then user logs in as Events CRM Manager
And user verifies that "#Inbox" page subtitle is displayed