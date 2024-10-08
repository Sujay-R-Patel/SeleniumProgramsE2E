package frames_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HYRframespage 
{
	static WebDriver driver;
	public HYRframespage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Xpaths
	static By frame2=By.xpath("(//iframe[@id='frm2'])[1]");
	
	static By frame1=By.xpath("(//iframe[@id='frm1'])[1]");
	
	static By dropf1=By.xpath("//*[@id=\"selectnav1\"]");
	
	static By frame3=By.xpath("(//iframe[@id='frm3'])[1]");
	
	
	//static By frame3=By.xpath("(//iframe[@id='frm3'])[1]");)
	
	//methods @frame 1
	
	public static void swithtoframe()
	{
		WebElement frame=driver.findElement(frame1);
		driver.switchTo().frame(frame);
	}
	
	public static void selectdropdown() throws Exception
	{
		WebElement drop=driver.findElement(dropf1);
		Select dd=new Select(drop);
		dd.selectByVisibleText("-- TestNG");
		Thread.sleep(3000);
		
		
		
		  driver.switchTo().defaultContent(); 
		  Thread.sleep(3000);
		 
	}
	public static void Frame2()
	{
		WebElement frme2= driver.findElement(frame2);
		driver.switchTo().frame(frme2);
		
	}
	public static void selectdropdowninframe2() throws Exception
	{
		WebElement drop=driver.findElement(dropf1);
		Select dd=new Select(drop);
		dd.selectByVisibleText("- Java");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
	}
	
	public static void Frame3() {
		WebElement Fr3=driver.findElement(frame3);
		driver.switchTo().frame(Fr3);
	
	}
	public static void selectdropdowninframe3() throws Exception
	{
		WebElement drop=driver.findElement(dropf1);
		Select dd=new Select(drop);
		dd.selectByVisibleText("- Calendars Practice");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
	}

	
	public static void methods() throws Exception
	{
		swithtoframe();
		selectdropdown();
		Frame2();
		selectdropdowninframe2();
		Frame3();
		selectdropdowninframe3();
		
		
	}
	
}
