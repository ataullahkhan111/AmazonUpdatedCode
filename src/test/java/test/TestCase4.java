package test;

import java.time.Duration;


import org.testng.annotations.Test;

import source.UserEditProfile_TestCase4;

public class TestCase4 extends LaunchQuit {
	
	@Test
	public void useredit() throws InterruptedException
	{
	UserEditProfile_TestCase4 h4 = new UserEditProfile_TestCase4(driver);
	
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	
	h4.HelloSignIn(driver);
	h4.SignIn();
	h4.MobileNo();
	h4.ContinueButton();
	h4.NewPassword();
	h4.SignInButton();
	h4.Accountandlist(driver);
	h4.Newprofile();
	h4.Newview();
	
	//Thread.sleep(3000);
	
	// WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='edit-pencil-icon-button']")));

	h4.Neweditbutton();
	h4.Newvariable();
	h4.Continuenew();
	 

}
}