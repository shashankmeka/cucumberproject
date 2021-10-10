Feature: Test the Free CRM URL
Scenario: Test Regration Free CRM

Given user enter url
When user enter username and password
Then user click on login button
Then user is on homepage
When user click on contact page
Then user is on contact page
And user fillup the contact page details