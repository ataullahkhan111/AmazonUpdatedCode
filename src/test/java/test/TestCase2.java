package test;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import source.DDTConcept;
import source.LoginSuccessfull_TestCase2;

public class TestCase2 extends LaunchQuit
{

	@Test
	public void Loginsuccessfull() throws EncryptedDocumentException, IOException
	{

		DDTConcept ddt = new DDTConcept();
	    ddt.DDTUsernamepassword();
		
		
		
		LoginSuccessfull_TestCase2 h2 = new LoginSuccessfull_TestCase2(driver);
		
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	    
	    
	    
		
				h2.HelloSignIn(driver);
				h2.SignIn();
				
				
				h2.MobileNo();
				h2.ContinueButton();
				h2.NewPassword();
				h2.SignInButton();
	}

	
	
	
}
