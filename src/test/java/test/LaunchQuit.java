package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import source.ITestListeneresImplement;


@Listeners(source.ITestListeneresImplement.class)

public class LaunchQuit extends ITestListeneresImplement {

	
	// public static WebDriver driver;
	 
	//public static WebDriver driver;
	@BeforeMethod
	@Parameters("browser")
	public void launch(@Optional("browser")String nameofbrowsers )
	{
		/*driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();	*/
		
		
		if(nameofbrowsers.equals("Chrome"))
		{
			 driver= new ChromeDriver();
			
			
		}
		if(nameofbrowsers.equals("Firefox"))
		{
			driver= new FirefoxDriver();

			
		}
		if(nameofbrowsers.equals("Edge"))
		{
				driver= new EdgeDriver();

		}
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	
}
