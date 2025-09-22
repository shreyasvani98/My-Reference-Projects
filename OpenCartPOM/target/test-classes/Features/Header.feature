@TestTwo
Feature: Links of phone icon, My Account, Wish List, Shopping Cart & Checkout in header
Description: This feature will test whether mentioned elements present or not on home page

Background: User is on home page
Given user has valid URL of website
When user enters URL of website in Google Chrome browser & press enter
Then user should be on home page

Scenario: verify that user should be able to view phone icon, My Account, Wish List, Shopping Cart & Checkout in header
When user looks for phone icon in header
Then user should find phone icon in header

When user looks for My Account dropdown list in header
Then user should find My Account dropdown list in header

When user looks for Wish List option in header
Then user should find Wish List option in header

When user looks for Shopping Cart option in header
Then user should find Shopping Cart option in header

When user looks for Checkout option in header
Then user should find Checkout option in header


















#Scenario Outline: verify that user should be able to view particular element in header
#When user looks for "<element>" in header
#Then user should find "<element1>" in header
#Examples:
#	| element | element1 |
#	| phone icon | phone icon |
#	| My account dropdown list | My account dropdown list |
#	| Wish List option | Wish List option |
#	| Shopping Cart option | Shopping Cart option |
#	| Checkout option | Checkout option |
