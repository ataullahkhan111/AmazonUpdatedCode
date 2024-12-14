package source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewRegisterUser_TestCase1 
{
	WebDriver driver;

	@FindBy(id="nav-link-accountList")
	WebElement hellosignIn;
	
	@FindBy(xpath="(//a[@class='nav-a'])[1]")
	WebElement starthere;
	
	@FindBy(id="ap_customer_name")
	WebElement yourName;
	
	@FindBy(id="ap_phone_number")
	WebElement phonenumber;
	
	@FindBy(id="ap_password")
	WebElement password;
	
	@FindBy(id="continue")
	WebElement verifymobileno;
	
	public void HelloSignIn(WebDriver driver)
	{
		Actions a1 = new Actions(driver);
		a1.moveToElement(hellosignIn).perform();
	
	}
	
	public void Starthere()
	{
		starthere.click();
	}
	
	public void YourName()
	{
		yourName.sendKeys("Ataullah Khan");
	}
	
	public void PhoneNo()
	{
		phonenumber.sendKeys("6391655290");
	}
	
	
	public void Password()
	{
		password.sendKeys("Curran@12345");
	}
	
	public void VerifyMobileNo()
	{
		verifymobileno.click();
	}
	
	
	public NewRegisterUser_TestCase1(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	
	
}
