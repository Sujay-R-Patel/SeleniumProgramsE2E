package OrangehrmPages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HrmHomepage 
{
	static WebDriver driver;
	public HrmHomepage(WebDriver driver)
	{
		this.driver=driver;
	}
    
	//Xpaths
	
	static By dashboard=By.xpath("//span[text()='Dashboard']");
	
	//method
	public static  void homepageconfirmation()
	{
		boolean value=driver.findElement(dashboard).isDisplayed();
		System.out.println(value);
		//assertEquals(value, false,"its a false negative");
		
	}
	
}
