Feature: feature to test login

  Scenario Outline: Check login is successful with valid credentials
    Given user is on login page
    When user enters <username> and <password>
    And clicks on login button
    Then user navigated to home page
    
    Examples:
    |username|password|
    |doaa.ismail1089@gmail.com|GOgo12345!!|