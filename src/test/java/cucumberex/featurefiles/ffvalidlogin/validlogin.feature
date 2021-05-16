#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Regression
Feature: Validate Login scenarios
	valid login scenario will be tested

  @P0
  Scenario: User login to the website with valid credentials
    Given The user clicks on the sign in link
    And The user enters the user name
    And The user enters the password
    When The user clicks on the sign in button
    Then User should be able to login successfully
    And User click on the logout button