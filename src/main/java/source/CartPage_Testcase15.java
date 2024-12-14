package source;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage_Testcase15 {

WebDriver driver;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement searchtext;
	
	@FindBy(xpath="(//span[@class='rush-component s-latency-cf-section']/div/div)[3]")
	WebElement product;
	
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	WebElement addtocart;
	
	@FindBy(xpath="(//a[@class='a-button-text'])[3]")
	WebElement gotocart;
	
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
	
	public void AddToCart() throws InterruptedException
	{
		Thread.sleep(3000);
		addtocart.click();
	}
	
	public void GoToCart()
	{
		gotocart.click();
	}
	
	
	public CartPage_Testcase15(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
		
}