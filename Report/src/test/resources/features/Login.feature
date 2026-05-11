Feature: Login to orangeHRM Application

@ValidCredentials

Scenario: Login with valid credentials

Given the user is on Homepage "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
When user enter username,password and click login button
Then the user should be able to login successfully and should see Dashboard

@InvalidCredentials

Scenario: Login with invalid credentials

Given the user is on Homepage "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
When user enter username,password and click login button
Then the user should be able to see the error message