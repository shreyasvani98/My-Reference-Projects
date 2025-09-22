package Stepdefs;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.TestBase;
import Base.TestUtil;
import Pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginRegisterNavigate extends TestBase
{
	HomePage homePage = new HomePage();
	TestUtil testutil = new TestUtil();
	String title;
	boolean bool;
	
	@Test
	@Then("user should be on home page & user has not logged in")
	public void user_should_be_on_home_page_user_has_not_logged_in() 
	{
		title = driver.getTitle();
		System.out.println("Title Of webpage: "+title);
		Assert.assertEquals("Your Store", title);
		System.out.println("User is on home page & has not logged in.");
	}
	
	@Test
	@When("user clicks on My Account dropdown list from header")
	public void user_clicks_on_My_Account_dropdown_list_from_header() 
	{
		homePage.clickMyAccountdropdown();
		System.out.println("User has clicked on My Account dropdown list from header");
	}

	@Test
	@Then("user should able to see Login & Register options in dropdown list")
	public void user_should_able_to_see_Login_Register_options_in_dropdown_list() 
	{
		
		bool = homePage.isDisplayedLogin();
		Assert.assertTrue(bool);
		if(bool)
			System.out.println("Yes, user is able see login option in dropdown list");
		else
			System.out.println("No, user is not able see login option");
		
		bool = homePage.isDisplayedRegister();
		Assert.assertTrue(bool);
		if(bool)
			System.out.println("Yes, user is able see Register option in dropdown list");
		else
			System.out.println("No, user is not able see Register option");
		
	}
	
	@Test
	@When("user clicks on Register option from My Account dropdown list")
	public void user_clicks_on_Register_option_from_My_Account_dropdown_list() 
	{
		homePage.clickOnRegister();
		System.out.println("User has clicked on Register option from My Account dropdown list.");
	}

	@Test
	@Then("user should be navigated to Register Account page")
	public void user_should_be_navigated_to_Register_Account_page() throws IOException 
	{
		title = homePage.validatePageTitle();
		Assert.assertEquals("Register Account", title);
		System.out.println("User is navigated to Register Account page.");
		testutil.takeScreenshotAtEndOfTest();
	}

	@Test
	@When("user clicks on Login option from My Account dropdown list")
	public void user_clicks_on_Login_option_from_My_Account_dropdown_list() 
	{
		homePage.clickOnLogin();
		System.out.println("User has clicked on Login option from My Account dropdown list.");
	}

	@Test
	@Then("user should be navigated to Account Login page")
	public void user_should_be_navigated_to_Account_Login_page() throws IOException 
	{
		title = homePage.validatePageTitle();
		Assert.assertEquals("Account Login", title);
		System.out.println("User is navigated to Account Login page.");
		testutil.takeScreenshotAtEndOfTest();
	}
		
}
