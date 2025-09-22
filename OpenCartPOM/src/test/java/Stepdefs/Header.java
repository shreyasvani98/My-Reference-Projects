package Stepdefs;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.TestBase;
import Base.TestUtil;
import Pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Header extends TestBase
{
	HomePage homePage = new HomePage();
	TestUtil testutil = new TestUtil();
	String title;
	boolean bool;
	
	@Test
	@When("user looks for phone icon in header")
	public void user_looks_for_phone_icon_in_header() 
	{
		bool = homePage.isDisplayedPhoneIcon();
	}

	@Test
	@Then("user should find phone icon in header")
	public void user_should_find_phone_icon_in_header() 
	{
		Assert.assertTrue(bool);
	    if(bool)
	    	System.out.println("Yes, user has found phone icon in header");
	    else
	    	System.out.println("No, user has not found phone icon in header");
	}

	@Test
	@When("user looks for My Account dropdown list in header")
	public void user_looks_for_My_account_dropdown_list_in_header() 
	{
	    bool = homePage.isDisplayedHeadMyAccountDropdown();
	}

	@Test
	@Then("user should find My Account dropdown list in header")
	public void user_should_find_My_Account_dropdown_list_in_header() 
	{
		 Assert.assertTrue(bool);
		 if(bool)
		    System.out.println("Yes, user has found My Account dropdown list in header");
		 else
		   	System.out.println("No, user has not found My Account dropdown list in header");
	}
	
	@Test
	@When("user looks for Wish List option in header")
	public void user_looks_for_Wish_List_option_in_header() 
	{
		bool = homePage.isDisplayedWishList();
	}

	@Test
	@Then("user should find Wish List option in header")
	public void user_should_find_Wish_List_option_in_header() 
	{
		Assert.assertTrue(bool);
		if(bool)
		    System.out.println("Yes, user has found Wish List option in header");
		else
		   	System.out.println("No, user has not found Wish List option in header");
	}

	@Test
	@When("user looks for Shopping Cart option in header")
	public void user_looks_for_Shopping_Cart_option_in_header() 
	{
		bool = homePage.isDisplayedShopCart();
	}

	@Test
	@Then("user should find Shopping Cart option in header")
	public void user_should_find_Shopping_Cart_option_in_header() 
	{
		Assert.assertTrue(bool);
		if(bool)
		   System.out.println("Yes, user has found Shopping Cart option in header");
	    else
		   System.out.println("No, user has not found Shopping Cart option in header");
	}

	@Test
	@When("user looks for Checkout option in header")
	public void user_looks_for_Checkout_option_in_header() 
	{
		bool = homePage.isDisplayedcheckout();
	}

	@Test
	@Then("user should find Checkout option in header")
	public void user_should_find_Checkout_option_in_header() throws InterruptedException, IOException 
	{
		Assert.assertTrue(bool);
	    if(bool)
	    	System.out.println("Yes, user has found Checkout option in header");
		else
	  	  	System.out.println("No, user has not found Checkout option in header");
	    Thread.sleep(5000);
	    testutil.takeScreenshotAtEndOfTest();
	}

	
}
