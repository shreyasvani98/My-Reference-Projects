package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class LoginPage extends TestBase
{
	public LoginPage()
	{
		//initialize WebElements
		PageFactory.initElements(driver, this);
	}
	
	//LoginPage elements
	@FindBy(xpath="//input[@id='input-email']")
	WebElement username;
		
	@FindBy(id="input-password")
	WebElement password;
		
	@FindBy(xpath="//input[@value='Login']")
	WebElement loginbtn;
	
	//LoginPage Methods
	public void enterLoginId(String loginid)
	{
		username.sendKeys(loginid);
	}
		
	public void enterPassword(String pass)
	{
		password.sendKeys(pass);
	}
		
	public void clickOnLoginButton()
	{
		loginbtn.click();
	}
	
}
