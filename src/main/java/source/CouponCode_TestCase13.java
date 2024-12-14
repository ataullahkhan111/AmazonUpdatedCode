package source;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CouponCode_TestCase13 {
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
	
	@FindBy(xpath="//a[@id='nav-cart']")
	WebElement cart;
	
	@FindBy(name="proceedToRetailCheckout")
	WebElement proceedbuy;
	
	@FindBy(name="ppw-claimCode")
	WebElement promocode;
	
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
		mobileno.sendKeys("8130614096");
	}
	
	public void ContinueButton()
	{
		continuebutton.click();
	}
	
	public void NewPassword()
	{
		password.sendKeys("Curran@12345");
	}
	
	public void SignInButton()
	{
		signInbutton.click();
	}
	
	public void Cart()
	{
		cart.click();
	}
	
	
	public void ProceedBuy()
	{
		proceedbuy.click();
	}

	public void newcoupon()
	{
		promocode.sendKeys("PB500OFF" +Keys.ENTER);
	}
	
		
	public CouponCode_TestCase13(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	

}
