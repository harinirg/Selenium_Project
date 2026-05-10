Feature: Category selection in DemoBlaze application

Background:
  Given user is on homepage

@ViewPhones
Scenario: User views Phones category
  When user clicks on Phones category
  Then only phone products should be displayed

@ViewLaptops
Scenario: User views Laptops category
  When user clicks on Laptops category
  Then only laptop products should be displayed

@ViewMonitors
Scenario: User views Monitors category
  When user clicks on Monitors category
  Then only monitor products should be displayed