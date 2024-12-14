package source;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchingProduct_TestCase5 {

	WebDriver driver;

	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement searchtext;
	
	
	public void searchbox()
	{
		searchtext.sendKeys("Shoe" +Keys.ENTER);
	}
	
	public SearchingProduct_TestCase5(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
}
