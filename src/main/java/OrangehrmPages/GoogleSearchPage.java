package OrangehrmPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage 

{
	static WebDriver driver;
	public GoogleSearchPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//xpaths Locators
	
	static By seachfield=By.name("q");	
	
	static By button=By.xpath("(//input[@type='submit'])[1]");
	
	static By link=By.xpath("(//h3[text()='OrangeHRM'])[1]");
	
	//METHODS
	
	public static void entersearchitem(String item)
	{
		driver.findElement(seachfield).sendKeys(item);
	}
	
	public static void button()
	{
		driver.findElement(button).click();
		
	}
	public static void link()
	{
		driver.findElement(link).click();
	}
	
	public static void methods(String item) throws Exception 
	{
		entersearchitem(item);
		
		button();
		Thread.sleep(2000);
		link();
	}
	
}
