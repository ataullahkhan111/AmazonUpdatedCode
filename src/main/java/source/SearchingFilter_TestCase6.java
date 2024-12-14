package source;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchingFilter_TestCase6 {


	WebDriver driver;

	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement searchtext;
	
	@FindBy(xpath="(//button[@class='a-button-text a-text-center'])[7]")
	WebElement filtermensshoe;
	
	@FindBy(xpath="(//a[@class='a-link-normal s-navigation-item']/div/label)[2]")
	WebElement bata;
	
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
	
	
	public SearchingFilter_TestCase6(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
}
