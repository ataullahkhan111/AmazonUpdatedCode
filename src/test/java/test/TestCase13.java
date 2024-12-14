package test;

import java.time.Duration;

import org.testng.annotations.Test;

import source.CouponCode_TestCase13;

public class TestCase13 extends LaunchQuit 
{

	@Test
	public void newcouponcode()
	{
		CouponCode_TestCase13 h13 = new CouponCode_TestCase13(driver);
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

			h13.HelloSignIn(driver);
			h13.SignIn();
			h13.MobileNo();
			h13.ContinueButton();
			h13.NewPassword();
			h13.SignInButton();
			h13.Cart();
			h13.ProceedBuy();
			h13.newcoupon();
	}
	
	
	
}
