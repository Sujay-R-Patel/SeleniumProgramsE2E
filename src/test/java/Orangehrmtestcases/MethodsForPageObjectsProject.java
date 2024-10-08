package Orangehrmtestcases;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import OrangehrmPages.GoogleSearchPage;
import OrangehrmPages.HrmHomepage;
import OrangehrmPages.Pim_Page;
import OrangehrmPages.SignupPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MethodsForPageObjectsProject

{
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().window().maximize();
	}
	@Test(priority = 1)
	
	public void searchorangehrm() throws Exception 
	{
		GoogleSearchPage search=new GoogleSearchPage(driver);
		search.methods("Orangehrm practice");
	}
	
	@Test(priority = 2)
	public void Lginhrm()
	{
		SignupPage login=new SignupPage(driver);
		login.loginmethods("Admin","admin123");
	}
	
	@Test(priority = 3)
	public void homepage()
	{
		
		HrmHomepage home=new HrmHomepage(driver);
		home.homepageconfirmation();	
	}
	
	@Test(priority = 4)
	public void pimpage() throws Exception
	{
		Pim_Page pim=new Pim_Page(driver);
		pim.enterdetails("Ram", "s", "chauhan", "100");
		Thread.sleep(4000);
	}
	
	
	  @AfterTest 
	  public void teardown() throws Exception 
	  { 
		  Thread.sleep(5000);
		  driver.quit(); 
		  }
	 
	
}
