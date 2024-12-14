package test;


import org.testng.annotations.Test;

import source.InCorrectLogin_TestCase3;


public class TestCase3 extends LaunchQuit {

	@Test(retryAnalyzer=source.IRetryAnalyzerImplement_TestCase3.class)


	public void InCorrectLogin()
	{
		InCorrectLogin_TestCase3 h3 = new InCorrectLogin_TestCase3(driver);
		h3.HelloSignIn(driver);
		h3.SignIn();
		h3.MobileNo();
		h3.ContinueButton();
		h3.NewPassword();
		h3.SignInButton();
		
		
		
	}
}
