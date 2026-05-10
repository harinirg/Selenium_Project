Feature: Login to DemoBlaze Application
Background:
 Given user launches the application
 And click login link
@ValidCredentials
Scenario: Login with valid credentials
  When user enters valid username
  And user enters valid password
  And the user click the login button
  Then user should see the welcome message
  
 @InvalidUserName
 Scenario: Login with invalid username and valid password
    When user enters invalid username 
    And user enters valid password
    And the user click the login button
    Then user should see the alert message as wrong password
    
 @InvalidPassword
 Scenario: Login with invalid credentials
    When user enters valid username 
    And user enters invalid password 
    Then user should see the alert message as wrong password