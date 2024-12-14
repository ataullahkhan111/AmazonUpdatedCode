package source;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SortedProduct_TestCase8 {

	
	WebDriver driver;

	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement searchtext;
	
	@FindBy(xpath="(//button[@class='a-button-text a-text-center'])[7]")
	WebElement filtermensshoe;
	
	@FindBy(xpath="(//a[@class='a-link-normal s-navigation-item']/div/label)[2]")
	WebElement bata;
	
	@FindBy(xpath="(//a[@class='a-link-normal s-navigation-item'])[69]")
	WebElement rating;
	
	public void searchbox()
	{
		searchtext.sendKeys("Shoe" +Keys.ENTER);
	}
	
	
	public void NewFilterMenShoe()
	{
		filtermensshoe.click();
	}
	
	public void NewBata()
	{
		bata.click();
	}
	
	public void Rating()
	{
		rating.click();
	}
	
	public SortedProduct_TestCase8(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
		
}
