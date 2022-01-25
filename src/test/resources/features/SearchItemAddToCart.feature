Feature: Search item functionality

  As I user, I should be able to search a men's hat and add my shopping cart

  @wip
  Scenario: User should add a men's hat into the shopping cart and verify added item in the cart
    Given I open the amazon website
    When I search for "hats for men"
    And I click search button
    Then I click the first hat appearing
    When I click add to cart button
    Then I should verify item added cart






