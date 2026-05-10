Feature: Register in tutorial ninja
Description:This feature file is used to register the application
Scenario:
User Register to the tutorial ninja application
Given User shouble on Home page
When User clicks my account button and select the register button
And User fills the required details to register
| First Name | Last Name | E-mail | Telephone | Password | Password confirm |
| Shobana    | V         | shobana@gmail.com | 9876543210 | Test@123 | Test@123 |
And User agree the privacy policy and click continue button
Then User should be able to register successfully and to see the account creation

 