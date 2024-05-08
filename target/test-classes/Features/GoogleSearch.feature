Feature: feature to test google search functionality

Scenario: validate google search is working

Given browser is open
And user on google search page
When user enter Text in search box
And hits enter
Then user navigated to search result