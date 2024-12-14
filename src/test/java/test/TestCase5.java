package test;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import source.SearchingProduct_TestCase5;

public class TestCase5 extends LaunchQuit {

	@Test
	public void searchproducts()
	{
	SearchingProduct_TestCase5 h5 = new SearchingProduct_TestCase5(driver);
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='twotabsearchtextbox']")));
    
    h5.searchbox();
}	
}