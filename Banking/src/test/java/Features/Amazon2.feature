@tag
Feature: Amazon scenarios
  

  @tag1
  Scenario: Search the products in amazon
    Given Enter the amazon URL
    When Search the product "iphone 13pro"
    When product detail page open
    Then close the amazon browser
    
    @tag1
  Scenario Outline: Search the products in amazon
    Given Enter the amazon URL
    When Search the product name <value>
    When product detail page open <data>
    Then close the amazon browser
    
    Examples:
|value|data|
 
