package Stepdefs;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.TestBase;
import Base.TestUtil;
import Pages.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PhoneNavigation extends TestBase
{
	HomePage homePage;
	PhoneNavigation phoneNavigation;
	TestUtil testutil = new TestUtil();

	public PhoneNavigation()
	{
		super();
	}
	
	@Before
	public void setup()
	{
		initialize();
		homePage = new HomePage();
		phoneNavigation = new PhoneNavigation();
	}
	
	@Test
	@Given("user has valid URL of website")
	public void user_has_valid_URL_of_website() 
	{
	    System.out.println("User has URL: "+homePage.getURL());
	}

	@Test
	@When("user enters URL of website in Google Chrome browser & press enter")
	public void user_enters_URL_of_website_in_Google_Chrome_browser_press_enter() 
	{
		driver.get(homePage.getURL());
		System.out.println("User has entered URL of website in browser & pressed enter.");
	}

	@Test
	@Then("user should be on home page")
	public void user_should_be_on_home_page() 
	{
		String title = homePage.validatePageTitle();
		System.out.println("Title Of webpage: "+title);
		Assert.assertEquals("Your Store", title);
		System.out.println("User is on home page.");
	}

	@Test
	@When("user clicks on phone icon from header")
	public void user_clicks_on_phone_icon_from_header() 
	{
		homePage.validatePhoneIcon();
	}
	@Test
	@Then("user should be navigated to Contact us webpage after clicking on phone icon from header")
	public void user_should_be_navigated_to_Contact_us_webpage_after_clicking_on_phone_icon_from_header() throws InterruptedException, IOException 
	{
		String title = homePage.validatePageTitle();
		System.out.println("Title Of webpage: "+title);
		Assert.assertEquals("Contact Us", title);
		System.out.println("User is navigated to Contact us webpage.");
		testutil.takeScreenshotAtEndOfTest();
		Thread.sleep(5000);
	}
	
	@When("user clicks on logo of website that is Your Store")
	public void user_clicks_on_logo_of_website_that_is_Your_Store() 
	{
		homePage.clickOnLogo();
		System.out.println("User has clicked on logo of website");
	}

	@Then("user is navigated to Home Page")
	public void user_is_navigated_to_Home_Page() 
	{
		String title = homePage.validatePageTitle();
		Assert.assertEquals("Your Store", title);
		System.out.println("User is on Home Page again.");
	}

	@Test
	@When("user clicks on phone number from header")
	public void user_clicks_on_phone_number_from_header() 
	{
		homePage.validatePhoneNumber();
	}

	@Test
	@Then("user should be navigated to Contact us webpage after clicking on phone number from header")
	public void user_should_be_navigated_to_Contact_us_webpage_after_clicking_on_phone_number_from_header() throws InterruptedException, IOException 
	{
		Assert.assertEquals("Contact Us", driver.getTitle());
		System.out.println("This is not link, therefore user cannot navigate to Contact Us page.");	
		testutil.takeScreenshotAtEndOfTest();
	}
	
	@After
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		try
		{
	        driver.quit();
	    }
		catch(Exception e)
		{
			System.out.println(e.getMessage());
	    }
	}
	
	
	
}
