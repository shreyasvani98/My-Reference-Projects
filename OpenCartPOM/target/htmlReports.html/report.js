$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/BrowseBanner.feature");
formatter.feature({
  "name": "Browse functionality of product banners",
  "description": "Description: This feature will check whether a user is able to browse product banners in slideshow",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@TestOne"
    }
  ]
});
formatter.background({
  "name": "User is on home page",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user has valid URL of website",
  "keyword": "Given "
});
formatter.match({
  "location": "PhoneNavigation.user_has_valid_URL_of_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters URL of website in Google Chrome browser \u0026 press enter",
  "keyword": "When "
});
formatter.match({
  "location": "PhoneNavigation.user_enters_URL_of_website_in_Google_Chrome_browser_press_enter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "PhoneNavigation.user_should_be_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "verify that user is able to view left \u0026 right arrow icons after hovering mouse over the slideshow of product banners \u0026 browse product banners",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@TestOne"
    }
  ]
});
formatter.step({
  "name": "user hovers mouse over slideshow of product banners",
  "keyword": "When "
});
formatter.match({
  "location": "BrowseBanner.user_hovers_mouse_over_slideshow_of_product_banners()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to view left \u0026 right arrow icons in left \u0026 right sections in slideshow respectively",
  "keyword": "Then "
});
formatter.match({
  "location": "BrowseBanner.user_should_be_able_to_view_left_right_arrow_icons_in_left_right_sections_in_slideshow_respectively()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on left arrow icon in left section in slideshow of product banners",
  "keyword": "When "
});
formatter.match({
  "location": "BrowseBanner.user_clicks_on_left_arrow_icon_in_left_section_in_slideshow_of_product_banners()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to view product banner behind the current product banner in slideshow of product banners",
  "keyword": "Then "
});
formatter.match({
  "location": "BrowseBanner.user_should_be_able_to_view_product_banner_behind_the_current_product_banner_in_slideshow_of_product_banners()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on right arrow icon in right section in slideshow of product banners",
  "keyword": "When "
});
formatter.match({
  "location": "BrowseBanner.user_clicks_on_right_arrow_icon_in_right_section_in_slideshow_of_product_banners()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to view product banner ahead of the current product banner in slideshow of product banners",
  "keyword": "Then "
});
formatter.match({
  "location": "BrowseBanner.user_should_be_able_to_view_product_banner_ahead_of_the_current_product_banner_in_slideshow_of_product_banners()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "User is on home page",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user has valid URL of website",
  "keyword": "Given "
});
formatter.match({
  "location": "PhoneNavigation.user_has_valid_URL_of_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters URL of website in Google Chrome browser \u0026 press enter",
  "keyword": "When "
});
formatter.match({
  "location": "PhoneNavigation.user_enters_URL_of_website_in_Google_Chrome_browser_press_enter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "PhoneNavigation.user_should_be_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "verify that user is able to browse different product banners after clicking on carousel-indicators that is filled circles down the slideshow of product banners",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@TestOne"
    }
  ]
});
formatter.step({
  "name": "user clicks on second carousel-indicator that is second filled circle down the slideshow of product banners",
  "keyword": "When "
});
formatter.match({
  "location": "BrowseBanner.user_clicks_on_second_carousel_indicator_that_is_second_filled_circle_down_the_slideshow_of_product_banners()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to browse second product banner",
  "keyword": "Then "
});
formatter.match({
  "location": "BrowseBanner.user_should_be_able_to_browse_second_product_banner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on first carousel-indicator that is first filled circle down the slideshow of product banners",
  "keyword": "When "
});
formatter.match({
  "location": "BrowseBanner.user_clicks_on_first_carousel_indicator_that_is_first_filled_circle_down_the_slideshow_of_product_banners()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to browse first product banner",
  "keyword": "Then "
});
formatter.match({
  "location": "BrowseBanner.user_should_be_able_to_browse_first_product_banner()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Features/Header.feature");
formatter.feature({
  "name": "Links of phone icon, My Account, Wish List, Shopping Cart \u0026 Checkout in header",
  "description": "Description: This feature will test whether mentioned elements present or not on home page",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@TestTwo"
    }
  ]
});
formatter.background({
  "name": "User is on home page",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user has valid URL of website",
  "keyword": "Given "
});
formatter.match({
  "location": "PhoneNavigation.user_has_valid_URL_of_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters URL of website in Google Chrome browser \u0026 press enter",
  "keyword": "When "
});
formatter.match({
  "location": "PhoneNavigation.user_enters_URL_of_website_in_Google_Chrome_browser_press_enter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "PhoneNavigation.user_should_be_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "verify that user should be able to view phone icon, My Account, Wish List, Shopping Cart \u0026 Checkout in header",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@TestTwo"
    }
  ]
});
formatter.step({
  "name": "user looks for phone icon in header",
  "keyword": "When "
});
formatter.match({
  "location": "Header.user_looks_for_phone_icon_in_header()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should find phone icon in header",
  "keyword": "Then "
});
formatter.match({
  "location": "Header.user_should_find_phone_icon_in_header()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user looks for My Account dropdown list in header",
  "keyword": "When "
});
formatter.match({
  "location": "Header.user_looks_for_My_account_dropdown_list_in_header()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should find My Account dropdown list in header",
  "keyword": "Then "
});
formatter.match({
  "location": "Header.user_should_find_My_Account_dropdown_list_in_header()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user looks for Wish List option in header",
  "keyword": "When "
});
formatter.match({
  "location": "Header.user_looks_for_Wish_List_option_in_header()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should find Wish List option in header",
  "keyword": "Then "
});
formatter.match({
  "location": "Header.user_should_find_Wish_List_option_in_header()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user looks for Shopping Cart option in header",
  "keyword": "When "
});
formatter.match({
  "location": "Header.user_looks_for_Shopping_Cart_option_in_header()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should find Shopping Cart option in header",
  "keyword": "Then "
});
formatter.match({
  "location": "Header.user_should_find_Shopping_Cart_option_in_header()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user looks for Checkout option in header",
  "keyword": "When "
});
formatter.match({
  "location": "Header.user_looks_for_Checkout_option_in_header()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should find Checkout option in header",
  "keyword": "Then "
});
formatter.match({
  "location": "Header.user_should_find_Checkout_option_in_header()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Features/LoginRegisterNavigate.feature");
formatter.feature({
  "name": "Navigation functionality of Login \u0026 Register of My Account dropdown list",
  "description": "Description: This feature will check that whether a user is able to navigate to Login page \u0026 Register page",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@TestThree"
    }
  ]
});
formatter.background({
  "name": "User is not logged in \u0026 have opened My Account dropdown list from header",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user has valid URL of website",
  "keyword": "Given "
});
formatter.match({
  "location": "PhoneNavigation.user_has_valid_URL_of_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters URL of website in Google Chrome browser \u0026 press enter",
  "keyword": "When "
});
formatter.match({
  "location": "PhoneNavigation.user_enters_URL_of_website_in_Google_Chrome_browser_press_enter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be on home page \u0026 user has not logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginRegisterNavigate.user_should_be_on_home_page_user_has_not_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on My Account dropdown list from header",
  "keyword": "When "
});
formatter.match({
  "location": "LoginRegisterNavigate.user_clicks_on_My_Account_dropdown_list_from_header()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should able to see Login \u0026 Register options in dropdown list",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginRegisterNavigate.user_should_able_to_see_Login_Register_options_in_dropdown_list()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "verify that user should be able to navigate to Register page \u0026 Login page after clicking on Register \u0026 Login options from My Account dropdown list respectively",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@TestThree"
    }
  ]
});
formatter.step({
  "name": "user clicks on Register option from My Account dropdown list",
  "keyword": "When "
});
formatter.match({
  "location": "LoginRegisterNavigate.user_clicks_on_Register_option_from_My_Account_dropdown_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be navigated to Register Account page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginRegisterNavigate.user_should_be_navigated_to_Register_Account_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "User is not logged in \u0026 have opened My Account dropdown list from header",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user has valid URL of website",
  "keyword": "Given "
});
formatter.match({
  "location": "PhoneNavigation.user_has_valid_URL_of_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters URL of website in Google Chrome browser \u0026 press enter",
  "keyword": "When "
});
formatter.match({
  "location": "PhoneNavigation.user_enters_URL_of_website_in_Google_Chrome_browser_press_enter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be on home page \u0026 user has not logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginRegisterNavigate.user_should_be_on_home_page_user_has_not_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on My Account dropdown list from header",
  "keyword": "When "
});
formatter.match({
  "location": "LoginRegisterNavigate.user_clicks_on_My_Account_dropdown_list_from_header()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should able to see Login \u0026 Register options in dropdown list",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginRegisterNavigate.user_should_able_to_see_Login_Register_options_in_dropdown_list()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "verify that user should be able to navigate to Account Login webpage after clicking on Login option from My Account dropdown list",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@TestThree"
    }
  ]
});
formatter.step({
  "name": "user clicks on Login option from My Account dropdown list",
  "keyword": "When "
});
formatter.match({
  "location": "LoginRegisterNavigate.user_clicks_on_Login_option_from_My_Account_dropdown_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be navigated to Account Login page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginRegisterNavigate.user_should_be_navigated_to_Account_Login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Features/MyAccountNavigate.feature");
formatter.feature({
  "name": "Navigation funtionality of My Account, Order history, Transations, Downloads, Logout of My Account dropdown list",
  "description": "Description: This feature will check that whether a user is able to navigate to particular webpage",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@TestFour"
    }
  ]
});
formatter.background({
  "name": "User is logged in \u0026 have opened My Account dropdown list from header",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user has valid URL of website",
  "keyword": "Given "
});
formatter.match({
  "location": "PhoneNavigation.user_has_valid_URL_of_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters URL of website in Google Chrome browser \u0026 press enter",
  "keyword": "When "
});
formatter.match({
  "location": "PhoneNavigation.user_enters_URL_of_website_in_Google_Chrome_browser_press_enter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "PhoneNavigation.user_should_be_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on My Account dropdown list from header",
  "keyword": "When "
});
formatter.match({
  "location": "LoginRegisterNavigate.user_clicks_on_My_Account_dropdown_list_from_header()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should able to see Login option in dropdown list",
  "keyword": "Then "
});
formatter.match({
  "location": "MyAccountNavigate.user_should_able_to_see_Login_option_in_dropdown_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Login option from dropdown list",
  "keyword": "And "
});
formatter.match({
  "location": "MyAccountNavigate.user_clicks_on_Login_option_from_dropdown_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters login credentials",
  "rows": [
    {
      "cells": [
        "uname",
        "password"
      ]
    },
    {
      "cells": [
        "suru@gmail30.com",
        "1122334455"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "MyAccountNavigate.user_enters_login_credentials(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "MyAccountNavigate.clicks_on_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "MyAccountNavigate.user_should_be_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on My Account dropdown list from header",
  "keyword": "When "
});
formatter.match({
  "location": "LoginRegisterNavigate.user_clicks_on_My_Account_dropdown_list_from_header()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should able to view My Account, Order history, Transations, Downloads, Logout options in dropdown list",
  "keyword": "Then "
});
formatter.match({
  "location": "MyAccountNavigate.user_should_able_to_view_My_Account_Order_history_Transations_Downloads_Logout_options_in_dropdown_list()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "verify that user should be able to navigate to correct webpage after clicking on that particular option from dropdown list",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@TestFour"
    }
  ]
});
formatter.step({
  "name": "user clicks on My Account option from My Account dropdown list",
  "keyword": "When "
});
formatter.match({
  "location": "MyAccountNavigate.user_clicks_on_My_Account_option_from_My_Account_dropdown_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be navigated to My Account webpage",
  "keyword": "Then "
});
formatter.match({
  "location": "MyAccountNavigate.user_should_be_navigated_to_My_Account_webpage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on My Account dropdown list from header",
  "keyword": "When "
});
formatter.match({
  "location": "LoginRegisterNavigate.user_clicks_on_My_Account_dropdown_list_from_header()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should able to view options in dropdown list",
  "keyword": "Then "
});
formatter.match({
  "location": "MyAccountNavigate.user_should_able_to_view_options_in_dropdown_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Order History option from My Account dropdown list",
  "keyword": "When "
});
formatter.match({
  "location": "MyAccountNavigate.user_clicks_on_Order_History_option_from_My_Account_dropdown_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be navigated to Order History webpage",
  "keyword": "Then "
});
formatter.match({
  "location": "MyAccountNavigate.user_should_be_navigated_to_Order_History_webpage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on My Account dropdown list from header",
  "keyword": "When "
});
formatter.match({
  "location": "LoginRegisterNavigate.user_clicks_on_My_Account_dropdown_list_from_header()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should able to view options in dropdown list",
  "keyword": "Then "
});
formatter.match({
  "location": "MyAccountNavigate.user_should_able_to_view_options_in_dropdown_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Transactions option from My Account dropdown list",
  "keyword": "When "
});
formatter.match({
  "location": "MyAccountNavigate.user_clicks_on_Transactions_option_from_My_Account_dropdown_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be navigated to Your Transactions webpage",
  "keyword": "Then "
});
formatter.match({
  "location": "MyAccountNavigate.user_should_be_navigated_to_Your_Transactions_webpage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on My Account dropdown list from header",
  "keyword": "When "
});
formatter.match({
  "location": "LoginRegisterNavigate.user_clicks_on_My_Account_dropdown_list_from_header()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should able to view options in dropdown list",
  "keyword": "Then "
});
formatter.match({
  "location": "MyAccountNavigate.user_should_able_to_view_options_in_dropdown_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Downloads option from My Account dropdown list",
  "keyword": "When "
});
formatter.match({
  "location": "MyAccountNavigate.user_clicks_on_Downloads_option_from_My_Account_dropdown_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be navigated to Account Downloads webpage",
  "keyword": "Then "
});
formatter.match({
  "location": "MyAccountNavigate.user_should_be_navigated_to_Your_Account_Downloads_webpage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on My Account dropdown list from header",
  "keyword": "When "
});
formatter.match({
  "location": "LoginRegisterNavigate.user_clicks_on_My_Account_dropdown_list_from_header()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should able to view options in dropdown list",
  "keyword": "Then "
});
formatter.match({
  "location": "MyAccountNavigate.user_should_able_to_view_options_in_dropdown_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Logout option from My Account dropdown list",
  "keyword": "When "
});
formatter.match({
  "location": "MyAccountNavigate.user_clicks_on_Logout_option_from_My_Account_dropdown_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be navigated to Account Logout webpage",
  "keyword": "Then "
});
formatter.match({
  "location": "MyAccountNavigate.user_should_be_navigated_to_Account_Logout_webpage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Features/PhoneNavigation.feature");
formatter.feature({
  "name": "Navigation functionality of phone number And phone icon",
  "description": "Description: This feature will check that whether a user is able to navigate to Contact Us webpage",
  "keyword": "Feature"
});
formatter.background({
  "name": "User is on home page",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user has valid URL of website",
  "keyword": "Given "
});
formatter.match({
  "location": "PhoneNavigation.user_has_valid_URL_of_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters URL of website in Google Chrome browser \u0026 press enter",
  "keyword": "When "
});
formatter.match({
  "location": "PhoneNavigation.user_enters_URL_of_website_in_Google_Chrome_browser_press_enter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "PhoneNavigation.user_should_be_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify that user should be able to navigate to Contact Us webpage after clicking on phone icon \u0026 phone number from header of home page",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user clicks on phone icon from header",
  "keyword": "When "
});
formatter.match({
  "location": "PhoneNavigation.user_clicks_on_phone_icon_from_header()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be navigated to Contact us webpage after clicking on phone icon from header",
  "keyword": "Then "
});
formatter.match({
  "location": "PhoneNavigation.user_should_be_navigated_to_Contact_us_webpage_after_clicking_on_phone_icon_from_header()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on logo of website that is Your Store",
  "keyword": "When "
});
formatter.match({
  "location": "PhoneNavigation.user_clicks_on_logo_of_website_that_is_Your_Store()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is navigated to Home Page",
  "keyword": "Then "
});
formatter.match({
  "location": "PhoneNavigation.user_is_navigated_to_Home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on phone number from header",
  "keyword": "When "
});
formatter.match({
  "location": "PhoneNavigation.user_clicks_on_phone_number_from_header()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be navigated to Contact us webpage after clicking on phone number from header",
  "keyword": "Then "
});
formatter.match({
  "location": "PhoneNavigation.user_should_be_navigated_to_Contact_us_webpage_after_clicking_on_phone_number_from_header()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected [Your Store] but found [Contact Us]\r\n\tat org.testng.Assert.fail(Assert.java:99)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:1037)\r\n\tat org.testng.Assert.assertEqualsImpl(Assert.java:140)\r\n\tat org.testng.Assert.assertEquals(Assert.java:122)\r\n\tat org.testng.Assert.assertEquals(Assert.java:629)\r\n\tat org.testng.Assert.assertEquals(Assert.java:639)\r\n\tat Stepdefs.PhoneNavigation.user_should_be_navigated_to_Contact_us_webpage_after_clicking_on_phone_number_from_header(PhoneNavigation.java:105)\r\n\tat ✽.user should be navigated to Contact us webpage after clicking on phone number from header(file:src/test/resources/Features/PhoneNavigation.feature:16)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Features/Slideshow.feature");
formatter.feature({
  "name": "Slideshow of product banners on home page",
  "description": "Description: This feature will confirm whether the slideshow of product banners can be viewed on home page only",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@TestSix"
    }
  ]
});
formatter.background({
  "name": "User is logged in \u0026 user is on home page",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user has valid URL of website",
  "keyword": "Given "
});
formatter.match({
  "location": "PhoneNavigation.user_has_valid_URL_of_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters URL of website in Google Chrome browser \u0026 press enter",
  "keyword": "When "
});
formatter.match({
  "location": "PhoneNavigation.user_enters_URL_of_website_in_Google_Chrome_browser_press_enter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "PhoneNavigation.user_should_be_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on My Account dropdown list from header",
  "keyword": "When "
});
formatter.match({
  "location": "LoginRegisterNavigate.user_clicks_on_My_Account_dropdown_list_from_header()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should able to see Login option in dropdown list",
  "keyword": "Then "
});
formatter.match({
  "location": "MyAccountNavigate.user_should_able_to_see_Login_option_in_dropdown_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Login option from dropdown list",
  "keyword": "And "
});
formatter.match({
  "location": "MyAccountNavigate.user_clicks_on_Login_option_from_dropdown_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters login credentials from excel sheet",
  "keyword": "When "
});
formatter.match({
  "location": "MyAccountNavigate.user_enters_login_credentials_from_excel_sheet()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "MyAccountNavigate.clicks_on_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "MyAccountNavigate.user_should_be_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on logo of website in header",
  "keyword": "When "
});
formatter.match({
  "location": "Slideshow.user_clicks_on_logo_of_website_in_header()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "PhoneNavigation.user_should_be_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "verify that user should be able to view slideshow of product banners on home page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@TestSix"
    }
  ]
});
formatter.step({
  "name": "user looks for slideshow of alternating images of product banners on home page",
  "keyword": "When "
});
formatter.match({
  "location": "Slideshow.user_looks_for_slideshow_of_alternating_images_of_product_banners_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should finds slideshow of alternating images of product banners on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "Slideshow.user_should_finds_slideshow_of_alternating_images_of_product_banners_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "User is logged in \u0026 user is on home page",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user has valid URL of website",
  "keyword": "Given "
});
formatter.match({
  "location": "PhoneNavigation.user_has_valid_URL_of_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters URL of website in Google Chrome browser \u0026 press enter",
  "keyword": "When "
});
formatter.match({
  "location": "PhoneNavigation.user_enters_URL_of_website_in_Google_Chrome_browser_press_enter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "PhoneNavigation.user_should_be_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on My Account dropdown list from header",
  "keyword": "When "
});
formatter.match({
  "location": "LoginRegisterNavigate.user_clicks_on_My_Account_dropdown_list_from_header()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should able to see Login option in dropdown list",
  "keyword": "Then "
});
formatter.match({
  "location": "MyAccountNavigate.user_should_able_to_see_Login_option_in_dropdown_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Login option from dropdown list",
  "keyword": "And "
});
formatter.match({
  "location": "MyAccountNavigate.user_clicks_on_Login_option_from_dropdown_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters login credentials from excel sheet",
  "keyword": "When "
});
formatter.match({
  "location": "MyAccountNavigate.user_enters_login_credentials_from_excel_sheet()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "MyAccountNavigate.clicks_on_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "MyAccountNavigate.user_should_be_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on logo of website in header",
  "keyword": "When "
});
formatter.match({
  "location": "Slideshow.user_clicks_on_logo_of_website_in_header()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "PhoneNavigation.user_should_be_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "verify that user should not be able to view slideshow of product banners on My Account webpage",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@TestSix"
    }
  ]
});
formatter.step({
  "name": "user clicks on My Account dropdown list from header",
  "keyword": "When "
});
formatter.match({
  "location": "LoginRegisterNavigate.user_clicks_on_My_Account_dropdown_list_from_header()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to view My Account option in My Account dropdown list",
  "keyword": "Then "
});
formatter.match({
  "location": "Slideshow.user_should_be_able_to_view_My_Account_option_in_My_Account_dropdown_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on My Account option from My Account dropdown list",
  "keyword": "When "
});
formatter.match({
  "location": "MyAccountNavigate.user_clicks_on_My_Account_option_from_My_Account_dropdown_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be navigated to My Account page",
  "keyword": "Then "
});
formatter.match({
  "location": "Slideshow.user_should_be_navigated_to_My_Account_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user looks for slideshow of alternating images of product banners on My Account page",
  "keyword": "When "
});
formatter.match({
  "location": "Slideshow.user_looks_for_slideshow_of_alternating_images_of_product_banners_on_My_Account_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should unable to find slideshow of product banners on My Account page",
  "keyword": "Then "
});
formatter.match({
  "location": "Slideshow.user_should_unable_to_find_slideshow_of_product_banners_on_My_Account_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Shopping Cart option from header",
  "keyword": "When "
});
formatter.match({
  "location": "Slideshow.user_clicks_on_Shopping_Cart_option_from_header()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be navigated to Shopping Cart page",
  "keyword": "Then "
});
formatter.match({
  "location": "Slideshow.user_should_be_navigated_to_Shopping_Cart_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user looks for slideshow of alternating images of product banners on Shopping Cart page",
  "keyword": "When "
});
formatter.match({
  "location": "Slideshow.user_looks_for_slideshow_of_alternating_images_of_product_banners_on_Shopping_Cart_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should unable to find slideshow of product banners on Shopping Cart page",
  "keyword": "Then "
});
formatter.match({
  "location": "Slideshow.user_should_unable_to_find_slideshow_of_product_banners_on_Shopping_Cart_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Wish List option from header",
  "keyword": "When "
});
formatter.match({
  "location": "Slideshow.user_clicks_on_Wish_List_option_from_header()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be navigated to My Wish List page",
  "keyword": "Then "
});
formatter.match({
  "location": "Slideshow.user_should_be_navigated_to_My_Wish_List_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user looks for slideshow of alternating images of product banners on My Wish List page",
  "keyword": "When "
});
formatter.match({
  "location": "Slideshow.user_looks_for_slideshow_of_alternating_images_of_product_banners_on_My_Wish_List_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should unable to find slideshow of product banners on My Wish list page",
  "keyword": "Then "
});
formatter.match({
  "location": "Slideshow.user_should_unable_to_find_slideshow_of_product_banners_on_My_Wish_list_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on phone icon from header",
  "keyword": "When "
});
formatter.match({
  "location": "PhoneNavigation.user_clicks_on_phone_icon_from_header()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be navigated to Contact Us page",
  "keyword": "Then "
});
formatter.match({
  "location": "Slideshow.user_should_be_navigated_to_Contact_Us_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user looks for slideshow of alternating images of product banners on Contact Us page",
  "keyword": "When "
});
formatter.match({
  "location": "Slideshow.user_looks_for_slideshow_of_alternating_images_of_product_banners_on_Contact_Us_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should unable to find slideshow of product banners on Contact Us page",
  "keyword": "Then "
});
formatter.match({
  "location": "Slideshow.user_should_unable_to_find_slideshow_of_product_banners_on_Contact_Us_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});