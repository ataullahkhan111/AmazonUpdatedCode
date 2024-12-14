package test;


import org.testng.annotations.Test;

import source.NewRegisterUser_TestCase1;

public class TestCase1 extends LaunchQuit 
{

	@Test
	public void newregisteruser()
	{
		NewRegisterUser_TestCase1 h1 = new NewRegisterUser_TestCase1(driver);
		
		
		h1.HelloSignIn(driver);
		h1.Starthere();
		h1.YourName();
		h1.PhoneNo();
		h1.Password();
		h1.VerifyMobileNo();
	}
	
	
}
