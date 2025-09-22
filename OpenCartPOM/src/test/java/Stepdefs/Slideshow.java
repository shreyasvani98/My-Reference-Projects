package Stepdefs;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.TestBase;
import Base.TestUtil;
import Pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Slideshow extends TestBase
{
	HomePage homePage = new HomePage();
	TestUtil testutil = new TestUtil();
	String title;
	boolean bool;
	List<WebElement> m;
	
	@Test
	@When("user clicks on logo of website in header")
	public void user_clicks_on_logo_of_website_in_header() 
	{
		homePage.clickOnLogo();
	}

	@Test
	@When("user looks for slideshow of alternating images of product banners on home page")
	public void user_looks_for_slideshow_of_alternating_images_of_product_banners_on_home_page() 
	{
		bool = homePage.isDisplayedSlideshowHome();
	}

	@Test
	@Then("user should finds slideshow of alternating images of product banners on home page")
	public void user_should_finds_slideshow_of_alternating_images_of_product_banners_on_home_page() throws IOException, InterruptedException 
	{
		Assert.assertTrue(bool);
		if(bool)
			System.out.println("Yes, user has found slideshow of alternating images of product banners on home page.");
		else
			System.out.println("No, user has not found slideshow of alternating images of product banners on home page.");
		testutil.takeScreenshotAtEndOfTest();
		Thread.sleep(3000);
	}

	@Test
	@Then("user should be able to view My Account option in My Account dropdown list")
	public void user_should_be_able_to_view_My_Account_option_in_My_Account_dropdown_list() 
	{
		if(bool=true)
			System.out.println("Yes, user is able to view My Account option in My Account dropdown list.");
		else
			System.out.println("No, user is not able to view My Account option in My Account dropdown list.");
	}

	@Test
	@When("user looks for slideshow of alternating images of product banners on My Account page")
	public void user_looks_for_slideshow_of_alternating_images_of_product_banners_on_My_Account_page() 
	{
		m = homePage.isDispOnMyAccountPage();
	}

	@Test
	@Then("user should unable to find slideshow of product banners on My Account page")
	public void user_should_unable_to_find_slideshow_of_product_banners_on_My_Account_page() throws IOException 
	{
		if(m.size()>0)
		{
			bool=true;
			System.out.println("Yes, user has found slideshow of product banners on My Account page");
		}	
		else
		{
			bool=false;
			System.out.println("No, user has not found slideshow of product banners on My Account page");
		}
		Assert.assertFalse(bool);	
		testutil.takeScreenshotAtEndOfTest();
	}

	@Test
	@When("user clicks on Shopping Cart option from header")
	public void user_clicks_on_Shopping_Cart_option_from_header() 
	{
		homePage.clickOnShoppingCart();
	}

	@Test
	@Then("user should be navigated to Shopping Cart page")
	public void user_should_be_navigated_to_Shopping_Cart_page() 
	{
	   title = homePage.validatePageTitle();
	   Assert.assertEquals("Shopping Cart", title);
	   System.out.println("User is navigated to Shopping Cart page.");
	}
	
	@Test
	@When("user looks for slideshow of alternating images of product banners on Shopping Cart page")
	public void user_looks_for_slideshow_of_alternating_images_of_product_banners_on_Shopping_Cart_page() 
	{
		m = homePage.isDispOnShoppingCartPage();
	}
	
	@Test
	@Then("user should unable to find slideshow of product banners on Shopping Cart page")
	public void user_should_unable_to_find_slideshow_of_product_banners_on_Shopping_Cart_page() throws IOException 
	{
		if(m.size()>0)
		{
			bool=true;
			System.out.println("Yes, user has found slideshow of product banners on Shopping Cart page");
		}	
		else
		{
			bool=false;
			System.out.println("No, user has not found slideshow of product banners on Shopping Cart page");
		}
		Assert.assertFalse(bool);	
		testutil.takeScreenshotAtEndOfTest();
	}

	@Test
	@When("user clicks on Wish List option from header")
	public void user_clicks_on_Wish_List_option_from_header() 
	{
		homePage.clickOnWishList();
	}

	@Test
	@Then("user should be navigated to My Wish List page")
	public void user_should_be_navigated_to_My_Wish_List_page() 
	{
		title = homePage.validatePageTitle();
	    Assert.assertEquals("My Wish List", title);
		System.out.println("User is navigated to My Wish List page.");
	}

	@Test
	@When("user looks for slideshow of alternating images of product banners on My Wish List page")
	public void user_looks_for_slideshow_of_alternating_images_of_product_banners_on_My_Wish_List_page() 
	{
		m = homePage.isDispOnWishListPage();
	}

	@Test
	@Then("user should unable to find slideshow of product banners on My Wish list page")
	public void user_should_unable_to_find_slideshow_of_product_banners_on_My_Wish_list_page() throws IOException 
	{
		if(m.size()>0)
		{
			bool=true;
			System.out.println("Yes, user has found slideshow of product banners on My Wish list page");
		}
			
		else
		{
			bool=false;
			System.out.println("No, user has not found slideshow of product banners on My Wish list page");
		}
		Assert.assertFalse(bool);	
		testutil.takeScreenshotAtEndOfTest();
	}

	@Test
	@Then("user should be navigated to Contact Us page")
	public void user_should_be_navigated_to_Contact_Us_page() 
	{
		title = homePage.validatePageTitle();
	    Assert.assertEquals("Contact Us", title);
		System.out.println("User is navigated to Contact Us page.");
	}

	@Test
	@When("user looks for slideshow of alternating images of product banners on Contact Us page")
	public void user_looks_for_slideshow_of_alternating_images_of_product_banners_on_Contact_Us_page() 
	{
		m = homePage.isDispOnContactUsPage();
	}

	@Test
	@Then("user should unable to find slideshow of product banners on Contact Us page")
	public void user_should_unable_to_find_slideshow_of_product_banners_on_Contact_Us_page() throws IOException 
	{
		if(m.size()>0)
		{
			bool=true;
			System.out.println("Yes, user has found slideshow of product banners on Contact Us page.");
		}
			
		else
		{
			bool=false;
			System.out.println("No, user has not found slideshow of product banners on Contact Us page.");
		}
		Assert.assertFalse(bool);	
		testutil.takeScreenshotAtEndOfTest();
	}
	
	@Test
	@Then("user should be navigated to My Account page")
	public void user_should_be_navigated_to_My_Account_page() 
	{
	
	}
	
}
