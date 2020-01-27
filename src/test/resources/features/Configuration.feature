@Configuration_submodule

Feature:Configuration submodule


  Scenario:User should be able to see and navigate the submodule Configuration
    Given user is on the login page
    Then user logs in as Events CRM Manager
    Then user navigates to "CRM"
    And user verifies that "Configuration" submodule is displayed