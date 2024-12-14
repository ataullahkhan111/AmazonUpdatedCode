package source;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UpdatingRemovingItem_TestCase10 {

//WebDriver driver;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement searchtext;
	
	@FindBy(xpath="(//span[@class='rush-component s-latency-cf-section']/div/div)[3]")
	WebElement product;
	
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	WebElement addtocart;
	
	@FindBy(xpath="(//a[@class='a-button-text'])[3]")
	WebElement gotocart;
	
	@FindBy(xpath="(//button[@class='a-declarative'])[2]")
	WebElement AddtoCart;
	
	@FindBy(xpath="(//button[@class='a-declarative'])[1]")
	WebElement RemovetoCart;
	
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
	
	public void GoToCart()
	{
		gotocart.click();
	}
	
	public void AddingCart(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='a-declarative'])[2]")));

		AddtoCart.click();
	}
	
	
	public void RemoveCart(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='a-declarative'])[1]")));
		
		RemovetoCart.click();
	}
	
	
	public UpdatingRemovingItem_TestCase10(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	
}
