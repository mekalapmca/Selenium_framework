#Author: your.email@your.domain.com
@tag
Feature: Facebook scenarios

  #@tag1
  #Scenario: Facebook signup page
  # Given Launch chrome browser and Enter Facebook URL
  #When  Enter Firstname and Lastname
  #When Enter Mobilenumber
  #When Enter Password
  #When Enter DOB
  #When Enter Gender
  #Then Close the Browser
  @signup
  Scenario: Facebook signup page
  Given Launch chrome browser and Enter Facebook URL
  When Verify the facebook user registration
  Then Close the Browser
  
  @newsignup
  Scenario: Facebook signup page
    Given Launch chrome browser and Enter Facebook URL
    When Verify the facebook user registration with "mekala","p","9785643278","mekala@123","21/May/2001","Female"
    Then Close the Browser

  @facebook
  Scenario Outline: Search for product
    Given Launch chrome browser and Enter Facebook URL
    When Verify the facebook user registration with data <firstname>,<lastname>,<phonenumber>,<password>,<DOB>,<Gender>
    Then Close the Browser

    Examples: 
      | firstname    | lastname | phonenumber  | password    | DOB           | Gender   |
      | "automation" | "S"      | "9876543210" | "techone@1" | "23/Aug/1990" | "Female" |
      | "kumar" 		 | "S"      | "9876543909" | "newset@1"  | "23/Jun/1990" | "Male"   |
