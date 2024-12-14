package test;

import java.time.Duration;

import org.testng.annotations.Test;

import source.Productdetailpage_TestCase7;

public class TestCase7 extends LaunchQuit {

	@Test
public void productdetails() throws InterruptedException
{
	
	Productdetailpage_TestCase7 h7 = new Productdetailpage_TestCase7(driver);
	
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
  //  wait.until(ExpectedConditions.elementToBeClickable(By.id("twotabsearchtextbox")));
	

	h7.searchbox();
	
	h7.product(driver);
	    
	h7.descriptionpage(driver);
	
	h7.Price(driver);
	
	h7.Review(driver);
}
	
}
