package source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginSuccessfull_TestCase2 extends DDTConcept
{

	WebDriver driver;

	@FindBy(id="nav-link-accountList")
	WebElement hellosignIn;
	
	@FindBy(xpath="(//span[.='Sign in'])[1]")
	WebElement signIn;
	
	@FindBy(id="ap_email")
	WebElement mobileno;
	
	@FindBy(id="continue")
	WebElement continuebutton;
	
	@FindBy(id="ap_password")
	WebElement givenpassword;
	
	@FindBy(id="signInSubmit")
	WebElement signInbutton;
	
	public void HelloSignIn(WebDriver driver)
	{
		Actions a1 = new Actions(driver);
		a1.moveToElement(hellosignIn).perform();	
	}
	
	
	public void SignIn()
	{
		signIn.click();
	}
	
	public void MobileNo()
	{
		mobileno.sendKeys(username);
	}
	
	public void ContinueButton()
	{
		continuebutton.click();
	}
	
	public void NewPassword()
	{
		givenpassword.sendKeys(password);
	}
	public void SignInButton()
	{
		signInbutton.click();
	}
	
	public LoginSuccessfull_TestCase2(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
}
