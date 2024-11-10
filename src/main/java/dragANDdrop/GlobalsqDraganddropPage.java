package dragANDdrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class GlobalsqDraganddropPage

{
	static WebDriver driver;
	public GlobalsqDraganddropPage(WebDriver driver)
	{
		this.driver=driver;
	}
   
	static By sourceimg1=By.xpath("//li[1]");
	static By sourceimg2=By.xpath("//li[2]");
	static By Destiimg=By.xpath("//*[@id=\"trash\"]");
	static By frame=By.xpath("//*[@class='demo-frame lazyloaded']");
	
	public static void dropimg() throws Exception
	{
		WebElement Framee=driver.findElement(frame);
		driver.switchTo().frame(Framee);
		Actions drgaction=new Actions(driver);
		WebElement sourceobj=driver.findElement(sourceimg1);
		WebElement sourceobj2=driver.findElement(sourceimg2);
		WebElement destobj=driver.findElement(Destiimg);
		drgaction.dragAndDrop(sourceobj, destobj).build().perform();
		drgaction.dragAndDrop(sourceobj2, destobj).build().perform();
		
		
	}
	
}
