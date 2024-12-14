package test;

import java.time.Duration;

import org.testng.annotations.Test;

import source.SearchingFilter_TestCase6;

public class TestCase6 extends LaunchQuit {

	@Test
	public void searchingfilter() throws InterruptedException
	{
		SearchingFilter_TestCase6 h6 = new SearchingFilter_TestCase6(driver);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		
		h6.searchbox();
		h6.NewFilterMenShoe();
		
		//Thread.sleep(3000);
		
		h6.NewBata();
		
	}
	
}
