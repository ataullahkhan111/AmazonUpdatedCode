package test;

import java.time.Duration;

import org.testng.annotations.Test;

import source.UpdatingRemovingItem_TestCase10;

public class TestCase10 extends LaunchQuit {

	@Test
	public void updatingRemovingItem() throws InterruptedException
	{
		UpdatingRemovingItem_TestCase10 h10 = new UpdatingRemovingItem_TestCase10(driver);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		
		h10.searchbox();
		
		Thread.sleep(2000);		
		h10.product(driver);
		
		
		h10.AddToCart();
		h10.GoToCart();
		h10.AddingCart(driver);
		
		Thread.sleep(2000);		

		
		h10.RemoveCart(driver);
	}
	
}
