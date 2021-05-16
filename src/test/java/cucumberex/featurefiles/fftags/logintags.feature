@Regression
Feature: Validate Login scenarios
	valid login scenario will be tested
	invalid login scenario will be tested
	
	Background:
		Given The user clicks on the sign in link

  @P0 @Valid
  Scenario: User login to the website with valid credentials
    When The user enters the user name
    And The user enters the password
    And The user clicks on the sign in button
    Then User should be able to login successfully
    And User click on the logout button
    
  @P0 @Invalid
  Scenario: User login to the website with invalid credentials
    When The user enters an invalid user name
    And The user enters an invalid password
    And The user clicks on the sign in button
    Then Appropriate error message must be shown
    
  @P1 
  Scenario: User login to the website with invalid credentials
    When The user enters an invalid user name
    And The user enters an invalid password
    And The user clicks on the sign in button
    Then Appropriate error message must be shown