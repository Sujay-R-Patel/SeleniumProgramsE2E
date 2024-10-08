package framestestcasess;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import frames_pages.HYRframespage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HyrFramesMethods 
{
	WebDriver driver;
  @BeforeTest
  public void setup()
  {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
  }
  @Test
  public void handleframe1() throws Exception
  {
	  HYRframespage frame1=new HYRframespage(driver);
	  HYRframespage.methods();
	  
  }
  
	
	/* @AfterTest public void teardown() { driver.quit(); } */
	 
}
