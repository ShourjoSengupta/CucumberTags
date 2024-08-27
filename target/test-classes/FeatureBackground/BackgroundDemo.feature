Feature: Background Demo

Background: Test Demo for Background 
		Given User should login to application
    When User should open chrome browser
    Then User should enter url

  Scenario: Checking with valid inputs
    
    Then User should enter credentials
    Then Log out of the application
    Then Close the application

  Scenario: Checking with invalid credentials

    Then User Should enter invalid credentials
    Then Close the application
