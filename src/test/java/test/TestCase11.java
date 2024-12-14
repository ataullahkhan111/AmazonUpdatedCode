package test;

import java.time.Duration;

import org.testng.annotations.Test;

import source.EntireCheckoutProcess_TestCase11;

public class TestCase11 extends LaunchQuit 
{
   @Test
	public void entirecheckout() throws InterruptedException
	{
		EntireCheckoutProcess_TestCase11 h11 = new EntireCheckoutProcess_TestCase11(driver);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		
		h11.HelloSignIn(driver);
		h11.SignIn();
		h11.MobileNo();
		h11.ContinueButton();
		h11.NewPassword();
		h11.SignInButton();
		h11.Cart();
		h11.ProceedBuy();
		h11.NewPayement(driver);
		h11.EnterCardDetails();
		h11.GivenapxsecureIframe(driver);
		h11.AddCreditCardNumber();
		h11.Newexpirationmonth();
		h11.Newexpirationyear();
		h11.EnterCardDeatilsgiven(driver);
		//h11.newalertpopup(driver);
		h11.NewCVV(driver);
		
		
	}
}