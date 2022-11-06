Feature:saucedemo

  @smoke
  Scenario: Login with valid credentials
    Given User wants to go to saucedemo application
    When User enters valid username
    Then User enters valid password
    And User clicks on the login button
    And User wants to add "sauce labs bike light" to cart
    Then User clicks on shopping cart
    Then User clicks on checkout button
    And User enters name
    Then User enters last name
    And User enters a postalcode
    Then User clicks on continue
    Then User wants to finish the transaction
    And User wants to verify checkout status as "CHECKOUT: COMPLETE!"



