package source;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartItems_TestCase9 
{

	WebDriver driver;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement searchtext;
	
	@FindBy(xpath="(//span[@class='rush-component s-latency-cf-section']/div/div)[3]")
	WebElement product;
	
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	WebElement addtocart;
	
	public void searchbox()
	{
		searchtext.sendKeys("Shoe" +Keys.ENTER);
	}

	public void product(WebDriver driver)
	{
		product.click();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		String parentid = i1.next();
		String childid = i1.next();
		
		driver.switchTo().window(childid);
	}
	
	public void AddToCart()
	{
		addtocart.click();
	}
	
	public ShoppingCartItems_TestCase9(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
		
}