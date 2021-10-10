Feature: Test Orange HRM Application
Scenario: Test Sanity Login Functions

Given user open Orange HRM URL
When user enter valid username and valid password
And User click on login button
Then user is on home page