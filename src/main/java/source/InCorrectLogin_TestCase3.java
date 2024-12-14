package source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InCorrectLogin_TestCase3 {

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
	WebElement password;
	
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
		mobileno.sendKeys("ataullahkhan12wert@gmail.com1234");
	}
	
	public void ContinueButton()
	{
		continuebutton.click();
	}
	
	public void NewPassword()
	{
		password.sendKeys("Curran@1234567");
	}
	
	public void SignInButton()
	{
		signInbutton.click();
	}
	
	public InCorrectLogin_TestCase3(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
}
