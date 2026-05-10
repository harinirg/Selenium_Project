# Feature: Login in DemoBlaze
# @InvalidCredentials
# Scenario Outline: Login with invalid credentials
# Given User is on Home Page
# And User click on Login Link
# When User enters username as "<username>" and password as "<password>"
# And User clicks Login Button
# Then User should be able to see an "<errorMessage>"

# Examples:

# |username  |password   |errorMessage                           |
# |admin     |ad         |Wrong password.                        |
# |Admin+    |admin      |User does not exist.                   |
# |          |           |Please fill out Username and Password. |