package test;

import org.testng.annotations.Test;

import source.ShoppingCartItems_TestCase9;

public class TestCase9 extends LaunchQuit
{
	@Test
	public void newaddtocart()
	{
		ShoppingCartItems_TestCase9 h9 = new ShoppingCartItems_TestCase9(driver);
		h9.searchbox();
		h9.product(driver);
		h9.AddToCart();
	}
	
}
