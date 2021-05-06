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
Feature: User login to the website
 User login to the website with user credentials

  @P0
  Scenario: User login to the website with invalid credentials
    Given The user clicks on the Sign in Link
    And The user enters an invalid user name
    And The user enters the password
    When Click on the Sign in button
   	Then Appropirate Error message must be shown
