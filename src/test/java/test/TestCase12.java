package test;

import java.time.Duration;

import org.testng.annotations.Test;

import source.UserSelectEachPayementMethod_TestCase12;

public class TestCase12 extends LaunchQuit 
{

	@Test
	public void userselectmethod() throws InterruptedException
	{
		UserSelectEachPayementMethod_TestCase12 h12 = new UserSelectEachPayementMethod_TestCase12(driver);
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		h12.HelloSignIn(driver);
		h12.SignIn();
		h12.MobileNo();
		h12.ContinueButton();
		h12.NewPassword();
		h12.SignInButton();
		h12.Cart();
		h12.ProceedBuy();
		h12.CreditDebitPayement();
		h12.NetBankingPayement();
		h12.OtherUPIPayement();
	    h12.CODPayement();
	}
	
}
