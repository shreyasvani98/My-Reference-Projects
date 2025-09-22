Feature: Navigation functionality of phone number And phone icon
Description: This feature will check that whether a user is able to navigate to Contact Us webpage

Background: User is on home page
Given user has valid URL of website
When user enters URL of website in Google Chrome browser & press enter
Then user should be on home page

Scenario: Verify that user should be able to navigate to Contact Us webpage after clicking on phone icon & phone number from header of home page
When user clicks on phone icon from header
Then user should be navigated to Contact us webpage after clicking on phone icon from header

When user clicks on logo of website that is Your Store
Then user is navigated to Home Page
When user clicks on phone number from header
Then user should be navigated to Contact us webpage after clicking on phone number from header



























#Scenario: verify that user should be able to navigate to Contact Us webpage after clicking on phone number from header of home page
#When user clicks on phone number from header
#Then user should be navigated to Contact us webpage after clicking on phone number from header