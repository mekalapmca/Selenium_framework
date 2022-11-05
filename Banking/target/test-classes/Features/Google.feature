#Author: your.email@your.domain.com
@google
Feature: Google Scenarios

  @googletc1 @sanity @regression
  Scenario: Search for product
    Given Launch chrome browser and Enter URL
    When Search for any product in google search box
    Then Close the browser

  @googletc2 @regression
  Scenario: Search for product
    Given Launch chrome browser and Enter URL
    When Search for any "regression" in google search box
    Then Close the browser

  @googletc3 @regression
  Scenario: Search for product
    Given Launch chrome browser and Enter URL
    When Search for any product in google search box
    Then Close the browser

  @googletc4 @sanity @regression
  Scenario: Search for product
    Given Launch chrome browser and Enter URL
    When Search for any "amazon" in google search box
    Then Close the browser

  @googletc5 @regression
  Scenario: Search for product
    Given Launch chrome browser and Enter URL
    When Search for any product in google search box
    Then Close the browser

  @googletc6 @regression
  Scenario: Search for product
    Given Launch chrome browser and Enter URL
    When Search for any "facebook" in google search box
    Then Close the browser

  @googletc7 @regression
  Scenario: Search for product
    Given Launch chrome browser and Enter URL
    When Search for any "facebook" in google search box
    Then Navigate to the latest link
    Then Close the browser

  @googletc8 @regression
  Scenario Outline: Search for product
    Given Launch chrome browser and Enter URL
    When Search for any product <search_data> in google search box
    Then Close the browser

    Examples: 
      | search_data   |
      | "flipkart"    |
      | "googlebooks" |
      | "cartoons"    |
