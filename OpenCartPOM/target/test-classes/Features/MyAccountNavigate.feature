@TestFour
Feature: Navigation funtionality of My Account, Order history, Transations, Downloads, Logout of My Account dropdown list
Description: This feature will check that whether a user is able to navigate to particular webpage

Background: User is logged in & have opened My Account dropdown list from header 
Given user has valid URL of website
When user enters URL of website in Google Chrome browser & press enter
Then user should be on home page
When user clicks on My Account dropdown list from header
Then user should able to see Login option in dropdown list
And user clicks on Login option from dropdown list
When user enters login credentials
	| uname | password |
	| suru@gmail30.com | 1122334455 |
And clicks on Login button
Then user should be logged in
When user clicks on My Account dropdown list from header
Then user should able to view My Account, Order history, Transations, Downloads, Logout options in dropdown list

Scenario: verify that user should be able to navigate to correct webpage after clicking on that particular option from dropdown list
When user clicks on My Account option from My Account dropdown list
Then user should be navigated to My Account webpage

When user clicks on My Account dropdown list from header
Then user should able to view options in dropdown list
When user clicks on Order History option from My Account dropdown list
Then user should be navigated to Order History webpage

When user clicks on My Account dropdown list from header
Then user should able to view options in dropdown list
When user clicks on Transactions option from My Account dropdown list
Then user should be navigated to Your Transactions webpage

When user clicks on My Account dropdown list from header
Then user should able to view options in dropdown list
When user clicks on Downloads option from My Account dropdown list
Then user should be navigated to Account Downloads webpage

When user clicks on My Account dropdown list from header
Then user should able to view options in dropdown list
When user clicks on Logout option from My Account dropdown list
Then user should be navigated to Account Logout webpage




















#Scenario Outline: verify that user should be able to navigate to correct webpage after clicking on that particular option from dropdown list
#When user clicks on "<option>" option from My Account dropdown list
#Then user should be navigated to "<option1>" webpage
#Examples:
#	| option | option1 |
#	| My Account | My Account |
#	| Order History | Order History |
#	| Transactions | Your Transactions |
#	| Downloads | Account Downloads |
#	| Logout | Account Logout |

