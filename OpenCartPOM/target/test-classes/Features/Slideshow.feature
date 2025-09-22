@TestSix
Feature: Slideshow of product banners on home page
Description: This feature will confirm whether the slideshow of product banners can be viewed on home page only

Background: User is logged in & user is on home page
Given user has valid URL of website
When user enters URL of website in Google Chrome browser & press enter
Then user should be on home page
When user clicks on My Account dropdown list from header
Then user should able to see Login option in dropdown list
And user clicks on Login option from dropdown list
When user enters login credentials from excel sheet
And clicks on Login button
Then user should be logged in
When user clicks on logo of website in header
Then user should be on home page

Scenario: verify that user should be able to view slideshow of product banners on home page
When user looks for slideshow of alternating images of product banners on home page
Then user should finds slideshow of alternating images of product banners on home page

Scenario: verify that user should not be able to view slideshow of product banners on My Account webpage
When user clicks on My Account dropdown list from header
Then user should be able to view My Account option in My Account dropdown list
When user clicks on My Account option from My Account dropdown list
Then user should be navigated to My Account page
When user looks for slideshow of alternating images of product banners on My Account page
Then user should unable to find slideshow of product banners on My Account page

When user clicks on Shopping Cart option from header
Then user should be navigated to Shopping Cart page
When user looks for slideshow of alternating images of product banners on Shopping Cart page
Then user should unable to find slideshow of product banners on Shopping Cart page

When user clicks on Wish List option from header
Then user should be navigated to My Wish List page
When user looks for slideshow of alternating images of product banners on My Wish List page
Then user should unable to find slideshow of product banners on My Wish list page

When user clicks on phone icon from header
Then user should be navigated to Contact Us page
When user looks for slideshow of alternating images of product banners on Contact Us page
Then user should unable to find slideshow of product banners on Contact Us page























#Scenario: verify that user should not be able to view slideshow of product banners on My Account webpage
#When user clicks on My Account dropdown list from header
#Then user should be able to view My Account option in My Account dropdown list
#When user clicks on My Account option from My Account dropdown list
#Then user should be navigated to My Account page
#When user looks for slideshow of alternating images of product banners on My Account page
#Then user should unable to find slideshow of product banners on My Account page

#Scenario: verify that user should not be able to view slideshow of product banners on Shopping Cart webpage
#When user clicks on Shopping Cart option from header
#Then user should be navigated to Shopping Cart page
#When user looks for slideshow of alternating images of product banners on Shopping Cart page
#Then user should unable to find slideshow of product banners on Shopping Cart page
#
#Scenario: verify that user should not be able to view slideshow of product banners on Wish List webpage
#When user clicks on Wish List option from header
#Then user should be navigated to My Wish List page
#When user looks for slideshow of alternating images of product banners on My Wish List page
#Then user should unable to find slideshow of product banners on My Wish list page
#
#Scenario: verify that user should not be able to view slideshow of product banners on Contact Us webpage
#When user clicks on phone icon from header
#Then user should be navigated to Contact Us page
#When user looks for slideshow of alternating images of product banners on Contact Us page
#Then user should unable to find slideshow of product banners on Contact Us page





