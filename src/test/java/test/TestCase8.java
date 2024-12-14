package test;

import org.testng.annotations.Test;

import source.SortedProduct_TestCase8;

public class TestCase8 extends LaunchQuit {

	@Test
	public void newrating()
	{
		SortedProduct_TestCase8 h8 = new SortedProduct_TestCase8(driver);
		h8.searchbox();
		h8.NewFilterMenShoe();
		h8.NewBata();
		h8.Rating();
	}
	
}
