package source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserEditProfile_TestCase4 {
	
	WebDriver driver;
	
	@FindBy(id="nav-link-accountList")
	WebElement hellosignIn;
	
	@FindBy(xpath="(//span[.='Sign in'])[1]")
	WebElement signIn;
	
	@FindBy(id="ap_email")
	WebElement mobileno;
	
	@FindBy(id="continue")
	WebElement continuebuttonnew;
	
	@FindBy(id="ap_password")
	WebElement password;
	
	@FindBy(id="signInSubmit")
	WebElement signInbutton;

	@FindBy(xpath="//a[@class='nav-a nav-a-2 nav-truncate   nav-progressive-attribute']")
	WebElement accountandlist;
	
	@FindBy(xpath="//button[@class='sc-fqkvVR sc-fTFjTM jZunJN eqmAHp']")
	WebElement manageprofile;
	
	@FindBy(xpath="//a[@class='sc-iGgWBj sc-fHjqPf fErbOa bdPZUm']")
	WebElement view;
	
	@FindBy(xpath="//button[@class='edit-pencil-icon-button']")
	WebElement newedit;
	
	@FindBy(xpath="//input[@id='editProfileNameInputId']")
	WebElement newprofile;

	@FindBy(xpath="(//input[@class='a-button-input'])[2]")
	WebElement continuebutton;
	
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
		continuebuttonnew.click();
	}
	
	public void NewPassword()
	{
		password.sendKeys("Curran@12345");
	}
	
	public void SignInButton()
	{
		signInbutton.click();
	}
	
	public void Accountandlist(WebDriver driver)
	{
		Actions a1 = new Actions(driver);
		a1.moveToElement(accountandlist).perform();		
	}

	public void Newprofile() {
		manageprofile.click();
	}

	public void Newview()
	{
		view.click();		}
	
	public void Neweditbutton() 
	{
		newedit.click();
	}
	
	
	public void Newvariable()
	{
		newprofile.sendKeys("AtaullahKhan123");
	}
	
	public void Continuenew()
	{
		continuebutton.click();
	}
	
	public UserEditProfile_TestCase4(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
}
