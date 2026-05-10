Feature: Login to HRM Application
 
    @ValidCredentials
    Scenario: Login with valid credentials
    
    Given User is on Home PAge
    When User enters username ""
    And User enters password ""
    Then User should be able to login successfully