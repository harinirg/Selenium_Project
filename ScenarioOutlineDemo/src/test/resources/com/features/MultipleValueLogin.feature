Feature: Login in DemoBlaze DataTable
@InvalidCredentials
Scenario: Login with invalid credentials
Given User is on Home Page
And User click on Login Link
When User enters username and password
And User clicks Login Button
Then User should be able to see error message
 |username  |password  |errorMessage                             |
 |admin     |ad        |Wrong password.                          | 
 |Admin+    |admin     | User does not exist.                    |
 |          |          |  Please fill out Username and Password. |
