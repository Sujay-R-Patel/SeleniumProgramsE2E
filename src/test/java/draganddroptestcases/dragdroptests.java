package draganddroptestcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import dragANDdrop.GlobalsqDraganddropPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class dragdroptests 
{
	 WebDriver driver;
	  @BeforeTest
	  public void setup()
	  {
		  WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
		  driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	  }
	  
	  @Test
	  public void draganddrop() throws Exception
	  {
		  GlobalsqDraganddropPage page=new GlobalsqDraganddropPage(driver);
		  page.dropimg();
	  }
}
