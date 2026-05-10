Feature: Add products to cart

  Scenario: Add valid products to cart

    Given User is on TutorialsNinja Application
    When User clicks on Login link
    And User enters the valid username as "shobana@gmail.com" and valid password as "Test@123"

    And User adds valid products to cart
      | iPhone |
      | MacBook |

    Then Products should be successfully added to cart