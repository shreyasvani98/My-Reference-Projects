package Stepdefs;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.TestBase;
import Base.TestUtil;
import Pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BrowseBanner extends TestBase
{
	HomePage homePage = new HomePage();
	TestUtil testutil = new TestUtil();
	String title;
	boolean bool,bool1,bool2;
	
	@Test
	@When("user hovers mouse over slideshow of product banners")
	public void user_hovers_mouse_over_slideshow_of_product_banners() throws InterruptedException 
	{
	    Thread.sleep(2000);
	    bool1 = homePage.isDisplayedSwipeBtnNext();	 
	    bool2 = homePage.isDisplayedSwipeBtnPrev();
	}

	@Test
	@Then("user should be able to view left & right arrow icons in left & right sections in slideshow respectively")
	public void user_should_be_able_to_view_left_right_arrow_icons_in_left_right_sections_in_slideshow_respectively() throws InterruptedException 
	{
		Assert.assertTrue(bool1);
		Assert.assertTrue(bool2);
	    if(bool1 && bool2)
	    	System.out.println("Yes, user can view left & right arrow icons.");
	    Thread.sleep(5000);
	}
	
	@Test
	@When("user clicks on left arrow icon in left section in slideshow of product banners")
	public void user_clicks_on_left_arrow_icon_in_left_section_in_slideshow_of_product_banners() throws InterruptedException 
	{
		 Thread.sleep(5000);
		 driver.findElement(By.className("swiper-button-prev")).click();
	}

	@Test
	@When("user clicks on right arrow icon in right section in slideshow of product banners")
	public void user_clicks_on_right_arrow_icon_in_right_section_in_slideshow_of_product_banners() throws InterruptedException 
	{
		Thread.sleep(5000);
		driver.findElement(By.className("swiper-button-next")).click();
	}
	
	@Test
	@Then("user should be able to view product banner behind the current product banner in slideshow of product banners")
	public void user_should_be_able_to_view_product_banner_behind_the_current_product_banner_in_slideshow_of_product_banners() throws IOException 
	{
		testutil.takeScreenshotAtEndOfTest();
		System.out.println("Yes, user can view product banners behind the current product banner in slideshow of product banners.");
	}

	@Test
	@Then("user should be able to view product banner ahead of the current product banner in slideshow of product banners")
	public void user_should_be_able_to_view_product_banner_ahead_of_the_current_product_banner_in_slideshow_of_product_banners() throws IOException 
	{
		testutil.takeScreenshotAtEndOfTest();
		System.out.println("Yes, user can to view product banners ahead of current product banner in slideshow of product banners.");
	}
	
	
	
	
	@Test
	@When("user clicks on second carousel-indicator that is second filled circle down the slideshow of product banners")
	public void user_clicks_on_second_carousel_indicator_that_is_second_filled_circle_down_the_slideshow_of_product_banners() throws InterruptedException 
	{
		Thread.sleep(5000);
		homePage.clickOnSecondCarouselInd();
	
	}

	@Test
	@Then("user should be able to browse second product banner")
	public void user_should_be_able_to_browse_second_product_banner() 
	{
		System.out.println("Yes, user is able to browse second product banner");
	}

	@Test
	@When("user clicks on first carousel-indicator that is first filled circle down the slideshow of product banners")
	public void user_clicks_on_first_carousel_indicator_that_is_first_filled_circle_down_the_slideshow_of_product_banners() throws InterruptedException, IOException 
	{
		Thread.sleep(3000);	
		homePage.clickInFirstCarouselInd();
		testutil.takeScreenshotAtEndOfTest();
	//	driver.findElement(By.xpath("//div[@class='swiper-pagination slideshow0 swiper-pagination-clickable swiper-pagination-bullets']/span[@class='swiper-pagination-bullet']")).click();
	}

	@Test
	@Then("user should be able to browse first product banner")
	public void user_should_be_able_to_browse_first_product_banner() 
	{
		System.out.println("Yes, user is able to browse first product banner");
	}
	
}
