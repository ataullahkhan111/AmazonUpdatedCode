package source;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EntireCheckoutProcess_TestCase11 
{

	// (//div[@class='a-box-inner']/div/div)[5]
	// (//div[@class='a-box-inner']/div/div)[6]
	// (//div[@class='a-box-inner']/div/div)[7]
	// (//div[@class='a-box-inner']/div/div)[9]
	// WebDriver driver;

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
	
	@FindBy(xpath="(//div[@class='a-box-inner']/div/div)[2]")
	WebElement payement;
	
	@FindBy(xpath="(//a[@class='a-link-emphasis pmts-add-cc-default-trigger-link'])[1]")
	WebElement entercarddetails;
	
	@FindBy(name = "ApxSecureIframe")
	WebElement newApxSecureIframe;
	
	@FindBy(name="addCreditCardNumber")
	WebElement newaddCreditCardNumber;

	@FindBy(name="ppw-expirationDate_month")
	WebElement newppwexpirationDatemonth;
	
	@FindBy(name="ppw-expirationDate_year")
	WebElement newppwexpirationDate_year;
	
	
	@FindBy(name="ppw-widgetEvent:AddCreditCardEvent")
	WebElement newppwwidgetEventAddCreditCardEvent;

	@FindBy(name="addCreditCardVerificationNumber0")
	WebElement newCVV;
	
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
	
	public void NewPayement(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='a-box-inner']/div/div)[2]")));
		payement.click();

	}
	
	public void EnterCardDetails() throws InterruptedException 
	{
       Thread.sleep(3000);
		entercarddetails.click();
	}
	
	public void GivenapxsecureIframe(WebDriver driver) 
	{
		driver.switchTo().frame(newApxSecureIframe);
	
	}
	
	
	public void AddCreditCardNumber()
	{
		
		newaddCreditCardNumber.sendKeys("6083329746093533");
	}
	
	public void Newexpirationmonth()
	{
		Select s1 = new Select(newppwexpirationDatemonth);
		s1.selectByIndex(7);
	}
	
	
	public void Newexpirationyear()
	{
		Select s2 = new Select(newppwexpirationDate_year);
		s2.selectByIndex(5);
	}
	
	public void EnterCardDeatilsgiven(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("ppw-widgetEvent:AddCreditCardEvent")));
		newppwwidgetEventAddCreditCardEvent.click();
	}
	
/*	public void newalertpopup(WebDriver driver)
	{
	
		driver.switchTo().alert().accept();	
	} */
	
	
	
	public void NewCVV(WebDriver driver) throws InterruptedException
	{
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		newCVV.sendKeys("000");
	}
	
	public EntireCheckoutProcess_TestCase11(WebDriver driver)
	{
		//this.driver = driver;
		PageFactory.initElements(driver,this);
	}
		
}