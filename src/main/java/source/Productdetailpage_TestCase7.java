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
import org.testng.Assert;

public class Productdetailpage_TestCase7 {

	
	//WebDriver driver;

	@FindBy(id="twotabsearchtextbox")
	WebElement searchtext;
	
	@FindBy(xpath="(//span[@class='rush-component s-latency-cf-section']/div/div)[3]")
	WebElement product;
	
	@FindBy(xpath="//span[@id='productTitle']")
	WebElement description;
	
	@FindBy(xpath="//span[@class='a-price aok-align-center reinventPricePriceToPayMargin priceToPay']")
	WebElement price;
	
	//@FindBy(xpath="(//a[@class='a-popover-trigger a-declarative mvt-cm-cr-review-stars-small-popover'])[1]")
	@FindBy(xpath="(//div[@id='averageCustomerReviews'])[1]")
	WebElement review;
	

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
	
	
	
	
	public void descriptionpage(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("productTitle")));
	     
		Assert.assertEquals(description.isDisplayed(), true);
	}
	
	public void Price(WebDriver driver)
	{
		 WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(20));
	     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='a-price aok-align-center reinventPricePriceToPayMargin priceToPay']")));
	     
		Assert.assertEquals(price.isDisplayed(), true);
	}
	
	public void Review(WebDriver driver)
	{
		 WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(30));
		 wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@id='averageCustomerReviews'])[1]")));
		 
		Assert.assertEquals(review.isDisplayed(), true);
	}
	

	public Productdetailpage_TestCase7(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
}