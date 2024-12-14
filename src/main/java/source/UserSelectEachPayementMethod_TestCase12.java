package source;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserSelectEachPayementMethod_TestCase12 
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
	WebElement password;
	
	@FindBy(id="signInSubmit")
	WebElement signInbutton;
	
	@FindBy(xpath="//a[@id='nav-cart']")
	WebElement cart;
	
	@FindBy(name="proceedToRetailCheckout")
	WebElement proceedbuy;
	
    @FindBy(xpath="(//div[@class='a-box-inner']/div/div)[5]")
    WebElement creditdebitpayement;
    
    @FindBy(xpath="(//div[@class='a-box-inner a-padding-small'])[3]")
    WebElement netbankingpayement;
    
    @FindBy(xpath="(//div[@class='a-box-inner a-padding-small'])[4]")
    WebElement otherUPIPayement; 
    
  @FindBy(xpath="(//div[@class='a-box-inner a-padding-small'])[6]")
    WebElement CODPayement;    
    
	
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

	public void CreditDebitPayement() 
	{
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='a-box-inner a-padding-small'])[3]")));
		creditdebitpayement.click();
	}
	
	public void NetBankingPayement() 
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='a-box-inner']/div/div)[6]")));
		netbankingpayement.click();
	}
	
	public void OtherUPIPayement() 
	{
	
		WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='a-box-inner a-padding-small'])[4]")));
		
		otherUPIPayement.click();
		
	
	}  
	
	
	public void CODPayement() throws InterruptedException
	{
		WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='a-box-inner a-padding-small'])[6]")));
		
		
		CODPayement.click();
	} 
	
	
	public UserSelectEachPayementMethod_TestCase12(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	
}
