package Pages;

import Base.TestBase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase
{
	//PageFactory Design Annotations
	//HomePage elements
	@FindBy(xpath="//a[@href='https://demo.opencart.com/index.php?route=information/contact']/i[@class='fa fa-phone']")
	WebElement phoneicon;
	
	@FindBy(xpath="//span[contains(text(), '123456789')]")
	WebElement phonenum;
	
	@FindBy(xpath="/html/body/nav/div/div[2]/ul/li[2]/a")
	WebElement myacdropdown;
	
	@FindBy(xpath="//a[contains(text(), 'Login')]")
	WebElement login;
	
	@FindBy(xpath="//a[contains(text(), 'Register')]")
	WebElement register;
	
	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']/li/a[contains(text(), 'My Account')]")
	WebElement myacdp;
	
	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']/li/a[contains(text(), 'Order History')]")
	WebElement orderhistorydp;
	
	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']/li/a[contains(text(), 'Transactions')]")
	WebElement txnsdp;
	
	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']/li/a[contains(text(), 'Downloads')]")
	WebElement downloadsdp;
	
	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']/li/a[contains(text(), 'Logout')]")
	WebElement logoutdp;
	
	@FindBy(xpath="//span[contains(text(),'Wish List')]")
	WebElement wishlist;
	
	@FindBy(xpath="//span[contains(text(),'Shopping Cart')]")
	WebElement shoppingcart;
	
	@FindBy(xpath="//span[contains(text(),'Checkout')]")
	WebElement checkout;
	
	@FindBy(className="swiper-button-next")
	WebElement swipebtnnxt;
	
	@FindBy(className="swiper-button-prev")
	WebElement swipebtnprev;
	
	@FindBy(xpath="//div[@class='swiper-pagination slideshow0 swiper-pagination-clickable swiper-pagination-bullets']/span[@class='swiper-pagination-bullet']")
	WebElement firstcarouselind;
	
	@FindBy(xpath="//div[@class='swiper-pagination slideshow0 swiper-pagination-clickable swiper-pagination-bullets']/span[@class='swiper-pagination-bullet swiper-pagination-bullet-active']")
	WebElement secondcarouselind;
	
	@FindBy(xpath="//a[contains(text(),'Your Store')]")
	WebElement yourstorelogo;
	
	@FindBy(className="swiper-viewport")
	WebElement slideshowview;
		
	public HomePage()
	{
		//initialize WebElements
		PageFactory.initElements(driver, this);
	}
	
	//HomePage methods
	public void validatePhoneIcon()
	{
		phoneicon.click();
		System.out.println("User has clicked on phone icon from header.");
	}
	
	public boolean isDisplayedPhoneIcon()
	{
		return phoneicon.isDisplayed();
	}
	
	public void validatePhoneNumber()
	{
	//	phonenum.click();
		System.out.println("User has clicked on phone number from header.");
	}
	
	public String validatePageTitle()
	{
		return driver.getTitle();
	}
	
	public String getURL()
	{
		return prop.getProperty("URL");
	}
	
	public void clickMyAccountdropdown()
	{
		myacdropdown.click();
	}
	
	public boolean isDisplayedWishList()
	{
		return wishlist.isDisplayed();
	}
	
	public boolean isDisplayedShopCart()
	{
		return shoppingcart.isDisplayed();
	}
	
	public boolean isDisplayedcheckout()
	{
		return checkout.isDisplayed();
	}
	
	public boolean isDisplayedHeadMyAccountDropdown()
	{
		return myacdropdown.isDisplayed();
	}
	
	public boolean isDisplayedLogin()
	{
		return login.isDisplayed();
	}
	
	public boolean isDisplayedRegister()
	{
		return register.isDisplayed();
	}
	
	public void clickOnRegister()
	{
		register.click();
	}
	
	public void clickOnLogin()
	{
		login.click();
	}
	
	public boolean isDisplayedMyAccountDropdown()
	{
		return myacdp.isDisplayed();
	}
	
	public boolean isDisplayedOrderHistoryDropdown()
	{
		return orderhistorydp.isDisplayed();
	}
	
	public boolean isDisplayedTxnsDropdown()
	{
		return txnsdp.isDisplayed();
	}
	
	public boolean isDisplayedDownloadsDropdown()
	{
		return downloadsdp.isDisplayed();
	}
	
	public boolean isDisplayedlogoutDropDown()
	{
		return logoutdp.isDisplayed();
	}
	
	public void clickOnMyAccountDropdown()
	{
		myacdp.click();
	}
	
	public void clickOnOrderHistoryDropdown()
	{
		orderhistorydp.click();
	}
	
	public void clickOnTxnsDropdown()
	{
		txnsdp.click();
	}
	
	public void clickOnDownloadsDropdown()
	{
		downloadsdp.click();
	}
	
	public void clickOnLogoutDropdown()
	{
		logoutdp.click();
	}
	
	public boolean isDisplayedSwipeBtnPrev()
	{
		return swipebtnprev.isDisplayed();
	}
	
	public boolean isDisplayedSwipeBtnNext()
	{
		return swipebtnnxt.isDisplayed();
	}
	
	public void clickOnSwipeBtnPrev()
	{
		swipebtnprev.click();
	}
	
	public void clickOnSwipeBtnNext()
	{
		swipebtnnxt.click();
	}
	
	public void clickOnSecondCarouselInd()
	{
		secondcarouselind.click();
	}
	
	public void clickInFirstCarouselInd()
	{
		firstcarouselind.click();
	}
	
	public void clickOnLogo()
	{
		yourstorelogo.click();
	}
	
	public boolean isDisplayedSlideshowHome()
	{
		return slideshowview.isDisplayed();
	}
	
	public List<WebElement> isDispOnMyAccountPage()
	{
		return driver.findElements(By.className("swiper-viewport"));
	}
	
	public List<WebElement> isDispOnShoppingCartPage()
	{
		return driver.findElements(By.className("swiper-viewport"));
	}
	
	public List<WebElement> isDispOnWishListPage()
	{
		return driver.findElements(By.className("swiper-viewport"));
	}
	
	public List<WebElement> isDispOnContactUsPage()
	{
		return driver.findElements(By.className("swiper-viewport"));
	}
	
	public void clickOnShoppingCart()
	{
		shoppingcart.click();
	}
	
	public void clickOnWishList()
	{
		wishlist.click();
	}	
}
