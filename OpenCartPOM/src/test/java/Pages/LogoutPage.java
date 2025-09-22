package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class LogoutPage extends TestBase
{
	public LogoutPage()
	{
		//initialize WebElements
		PageFactory.initElements(driver, this);
	}
	
	//LogoutPage elements
	@FindBy(xpath="//p[contains(text(), 'You have been logged off your account. It is now safe to leave the computer.')]")
	WebElement logoutwarn;
	
	//LogoutPage methods
	public boolean isDisplayedLogoutWarn()
	{
		return logoutwarn.isDisplayed();
	}
	
}
