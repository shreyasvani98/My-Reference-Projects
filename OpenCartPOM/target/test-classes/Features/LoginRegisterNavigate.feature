@TestThree
Feature: Navigation functionality of Login & Register of My Account dropdown list
Description: This feature will check that whether a user is able to navigate to Login page & Register page

Background: User is not logged in & have opened My Account dropdown list from header
Given user has valid URL of website
When user enters URL of website in Google Chrome browser & press enter
Then user should be on home page & user has not logged in
When user clicks on My Account dropdown list from header
Then user should able to see Login & Register options in dropdown list
				
Scenario: verify that user should be able to navigate to Register page & Login page after clicking on Register & Login options from My Account dropdown list respectively
When user clicks on Register option from My Account dropdown list
Then user should be navigated to Register Account page

Scenario: verify that user should be able to navigate to Account Login webpage after clicking on Login option from My Account dropdown list
When user clicks on Login option from My Account dropdown list
Then user should be navigated to Account Login page       