package OrangehrmPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupPage 
{
	static WebDriver driver;
	public SignupPage(WebDriver driver)
	{
		this.driver=driver;
	}
    
	//Xpaths
	
	static By uname=By.xpath("//input[@name='username']");
	
	static By pwd=By.xpath("//input[@name='password']");
	
	static By btn=By.xpath("//button[@type='submit']");
	
	//Methods
	
	public static void Enterusename(String name)
	{
		driver.findElement(uname).sendKeys(name);
	}
	
	public static void Enterpwd(String password)
	{
		driver.findElement(pwd).sendKeys(password);
	}
	
     public static void button()
     {
	   driver.findElement(btn).click();
     }
     
     public static void loginmethods(String name,String password)
     {
    	 Enterusename(name);
    	 Enterpwd(password);
    	 
    	 button();
    	 
     }
}
