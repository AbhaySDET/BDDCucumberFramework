@LoginScenario
Feature: Login to CRM Application
  As a registered CRM user
  I want to log into the application
  So that I can access my dashboard

  @Smoke @Login
  Scenario: Successful login with valid credentials
    Given the user is on the CRM login page
    When the user enters valid username "testuser" and password "testpass"
    And clicks on the login button
    Then the user should be redirected to the CRM dashboard
    And the page title should be "CRM Dashboard"
    
    @Smoke @Logout
  Scenario: Successful login with valid credentials
    Given the user is on the CRM login page
    When the user enters valid username "testuser" and password "testpass"
    And clicks on the login button
    Then the user should be redirected to the CRM dashboard
    And the page title should be "CRM Dashboard"
    Then logout from CRM App