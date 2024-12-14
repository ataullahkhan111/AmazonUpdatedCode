package test;

import org.testng.annotations.Test;

import source.CartPage_Testcase15;

public class TestCase15 extends LaunchQuit {

	@Test
	public void cartpage() throws InterruptedException
	{
		CartPage_Testcase15 h15 = new CartPage_Testcase15(driver);
		h15.searchbox();
		h15.product(driver);
		h15.AddToCart();
		h15.GoToCart();
	}
		
}