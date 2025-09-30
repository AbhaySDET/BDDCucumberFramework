@HomePageScenario
Feature: Login to CRM Application
Background:
  

   @HompePage
   
  Scenario: verify event creation feature on FreeCrm HomePage
    Given the user is on the CRM login page
  When the user enters valid username "AdminUSEREMAIL" and password "AdminUSERPWD"
  And clicks on the login button
  Then the user should be redirected to the CRM dashboard
  And the page title should be "CRM Dashboard"
    Given the user should be redirected to the CRM dashboard
    When click on home page menu
   Then user Redirected to HomePage Url
   Then verify Home Page available Options
   Then logout from CRM App