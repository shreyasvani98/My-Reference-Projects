@TestOne
Feature: Browse functionality of product banners
Description: This feature will check whether a user is able to browse product banners in slideshow

Background: User is on home page
Given user has valid URL of website
When user enters URL of website in Google Chrome browser & press enter
Then user should be on home page

Scenario: verify that user is able to view left & right arrow icons after hovering mouse over the slideshow of product banners & browse product banners
When user hovers mouse over slideshow of product banners
Then user should be able to view left & right arrow icons in left & right sections in slideshow respectively

When user clicks on left arrow icon in left section in slideshow of product banners
Then user should be able to view product banner behind the current product banner in slideshow of product banners

When user clicks on right arrow icon in right section in slideshow of product banners
Then user should be able to view product banner ahead of the current product banner in slideshow of product banners

Scenario: verify that user is able to browse different product banners after clicking on carousel-indicators that is filled circles down the slideshow of product banners
When user clicks on second carousel-indicator that is second filled circle down the slideshow of product banners
Then user should be able to browse second product banner

When user clicks on first carousel-indicator that is first filled circle down the slideshow of product banners
Then user should be able to browse first product banner

























#Scenario Outline: verify that user is able to browse product banners left & right to the current product banner after clicking on left & right arrow icons in slideshow
#When user clicks on "<dir>" arrow icon in "<dir1>" section in slideshow of product banners
#Then user should be able to view product banner "<option>" the current product banner in slideshow of product banners
#Examples:
#	| dir | dir1 | option |
#	| left | left | behind |
#	| right | right | ahead of | 
