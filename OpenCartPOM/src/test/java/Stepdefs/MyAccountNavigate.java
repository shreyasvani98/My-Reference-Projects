package Stepdefs;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.TestBase;
import Base.TestUtil;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.LogoutPage;
import Pages.UseExcelSheet;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyAccountNavigate extends TestBase
{
	HomePage homePage = new HomePage();
	LoginPage loginPage = new LoginPage();
	LogoutPage logoutPage = new LogoutPage();
	UseExcelSheet useExcelSheet = new UseExcelSheet();
	TestUtil testutil = new TestUtil();
	String title;
	boolean bool;
	
	@Test
	@Then("user should able to see Login option in dropdown list")
	public void user_should_able_to_see_Login_option_in_dropdown_list() 
	{
		bool = homePage.isDisplayedLogin();
		Assert.assertTrue(bool);
		if(bool)
			System.out.println("Yes, user is able see login option in dropdown list");
		else
			System.out.println("No, user is not able see login option");
	}
	
	@Test
	@And("user clicks on Login option from dropdown list")
	public void user_clicks_on_Login_option_from_dropdown_list()
	{
		homePage.clickOnLogin();
		System.out.println("User has clicked on login option.");
	}

	@Test
	@When("user enters login credentials")
	public void user_enters_login_credentials(DataTable dataTable) throws IOException
	{
		List<Map<String, String>> userList = dataTable.asMaps();
		
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(userList.get(0).get("uname"));
		driver.findElement(By.id("input-password")).sendKeys(userList.get(0).get("password"));
		
		testutil.takeScreenshotAtEndOfTest();
	}
	
	@Test
	@When("user enters login credentials from excel sheet")
	public void user_enters_login_credentials_from_excel_sheet() throws IOException
	{
		loginPage.enterLoginId(useExcelSheet.readFromExcel("username"));
		loginPage.enterPassword(useExcelSheet.readFromExcel("password"));
		System.out.println("User has entered login credentials.");
		testutil.takeScreenshotAtEndOfTest();
	}

	@Test
	@When("clicks on Login button")
	public void clicks_on_Login_button() 
	{
		loginPage.clickOnLoginButton();
		System.out.println("User has clicked on Login button.");
	}

	@Test
	@Then("user should be logged in")
	public void user_should_be_logged_in() 
	{
		title = homePage.validatePageTitle();
		Assert.assertEquals("My Account", title);
		System.out.println("User is logged in & on MyAccount page.");
	}

	@Test
	@Then("user should able to view My Account, Order history, Transations, Downloads, Logout options in dropdown list")
	public void user_should_able_to_view_My_Account_Order_history_Transations_Downloads_Logout_options_in_dropdown_list() throws InterruptedException, IOException 
	{
		bool = homePage.isDisplayedMyAccountDropdown();
		Assert.assertTrue(bool);
		bool = homePage.isDisplayedOrderHistoryDropdown();
		Assert.assertTrue(bool);
		bool = homePage.isDisplayedTxnsDropdown();
		Assert.assertTrue(bool);
		bool = homePage.isDisplayedDownloadsDropdown();
		Assert.assertTrue(bool);
		bool = homePage.isDisplayedlogoutDropDown();
		Assert.assertTrue(bool);
		System.out.println("user is able to view My Account, Order history, Transations, Downloads, Logout options in dropdown list");
		testutil.takeScreenshotAtEndOfTest();
		Thread.sleep(5000);
		
	}
	
	@When("user clicks on My Account option from My Account dropdown list")
	public void user_clicks_on_My_Account_option_from_My_Account_dropdown_list() 
	{
		driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']/li/a[contains(text(), 'My Account')]")).click();
		System.out.println("User has clicked on My Account option from My Account dropdown list.");
	}

	@Then("user should be navigated to My Account webpage")
	public void user_should_be_navigated_to_My_Account_webpage() throws IOException, InterruptedException 
	{
		title = driver.getTitle();
		Assert.assertEquals("My Account", title);
		System.out.println("user is navigated to My Account webpage.");
		testutil.takeScreenshotAtEndOfTest();
		Thread.sleep(5000);
	}

	@When("user clicks on Order History option from My Account dropdown list")
	public void user_clicks_on_Order_History_option_from_My_Account_dropdown_list() 
	{
		driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']/li/a[contains(text(), 'Order History')]")).click();
		System.out.println("User has clicked on Order History option from My Account dropdown list.");
	}

	@Then("user should be navigated to Order History webpage")
	public void user_should_be_navigated_to_Order_History_webpage() throws IOException, InterruptedException 
	{
		title = driver.getTitle();
		Assert.assertEquals("Order History", title);
		System.out.println("User is navigated to Order History webpage.");
		testutil.takeScreenshotAtEndOfTest();
		Thread.sleep(5000);
	}

	@When("user clicks on Transactions option from My Account dropdown list")
	public void user_clicks_on_Transactions_option_from_My_Account_dropdown_list() 
	{
		driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']/li/a[contains(text(), 'Transactions')]")).click();
		System.out.println("User has clicked on Transactions option from My Account dropdown list.");
	}

	@Then("user should be navigated to Your Transactions webpage")
	public void user_should_be_navigated_to_Your_Transactions_webpage() throws IOException, InterruptedException 
	{
		title = driver.getTitle();
		Assert.assertEquals("Your Transactions", title);
		System.out.println("User is navigated to Transactions webpage.");
		testutil.takeScreenshotAtEndOfTest();
		Thread.sleep(5000);
	}

	@When("user clicks on Downloads option from My Account dropdown list")
	public void user_clicks_on_Downloads_option_from_My_Account_dropdown_list() 
	{
		driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']/li/a[contains(text(), 'Downloads')]")).click();
		System.out.println("User has clicked on Downloads option from My Account dropdown list.");
	}

	@Then("user should be navigated to Account Downloads webpage")
	public void user_should_be_navigated_to_Your_Account_Downloads_webpage() throws IOException, InterruptedException 
	{
		title = driver.getTitle();
		Assert.assertEquals("Account Downloads", title);
		System.out.println("User is navigated to Downloads page.");
		testutil.takeScreenshotAtEndOfTest();
		Thread.sleep(5000);
	}

	@When("user clicks on Logout option from My Account dropdown list")
	public void user_clicks_on_Logout_option_from_My_Account_dropdown_list() 
	{
		driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']/li/a[contains(text(), 'Logout')]")).click();
		System.out.println("User has clicked on Logout option from My Account dropdown list.");
	}

	@Then("user should be navigated to Account Logout webpage")
	public void user_should_be_navigated_to_Account_Logout_webpage() throws IOException, InterruptedException 
	{
		title = driver.getTitle();
		Assert.assertEquals("Account Logout", title);
		System.out.println("User is navigated to Logout page.");
		testutil.takeScreenshotAtEndOfTest();
		Thread.sleep(5000);
	}
	
	@Then("user should able to view options in dropdown list")
	public void user_should_able_to_view_options_in_dropdown_list() throws IOException, InterruptedException 
	{	
		testutil.takeScreenshotAtEndOfTest();
		Thread.sleep(5000);
	}
	
	
/*	@When("user clicks on My Account option from My Account dropdown list")
	public void user_clicks_on_My_Account_option_from_My_Account_dropdown_list() 
	{
		homePage.clickOnMyAccountDropdown();
		System.out.println("User has clicked on My Account option from My Account dropdown list.");
	}

	@Then("user should be navigated to My Account webpage")
	public void user_should_be_navigated_to_My_Account_webpage() 
	{
		title = homePage.validatePageTitle();
		Assert.assertEquals("My Account", title);
		System.out.println("user is navigated to My Account page.");
	}
*/
	
/*	
	@Test
	@Then("user should be logged out from website")
	public void user_should_be_logged_out_from_website() 
	{
		bool = logoutPage.isDisplayedLogoutWarn();
		Assert.assertTrue(bool);
		System.out.println("User is logged out");
	}
	*/
}
