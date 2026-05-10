Feature: Login to the TutorialsNinja website
Description: logging in to the website

  @ValidLogin
  Scenario Outline: Login to the tutarialsNinja website
    Given user is on homepage
    When user clicks on MyAccount link and Click Login link
    And user enters mail as "<E-mail>" and Password as "<Password>"
    Then user clicks on login button

  Examples:
    |E-mail			 |Password|
    |shobana@gmail.com|Test@123|