package OrangehrmPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Pim_Page 
{
	static WebDriver driver;
     public Pim_Page(WebDriver driver)
     {
    	 this.driver=driver;
     }
     
    // xpaths
     
  static   By pim_link=By.xpath("//a[@href='/web/index.php/pim/viewPimModule']");
     
  static  By addbutton=By.xpath("//button[@type='button' and @class='oxd-button oxd-button--medium oxd-button--secondary']");
     
    static  By firstname=By.name("firstName");
     
    static By middlename=By.name("middleName");
     
    static By lastname=By.name("lastName");
     
    static By id=By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
     
     
     //methods
     
     public static void pimlink() throws Exception
     {
    	 driver.findElement(pim_link).click();
    	 Thread.sleep(2000);
     }
     public static void addbutton()
     {
    	 driver.findElement(addbutton).click();
     }
     
     public static void firstname(String fname)
     {
    	 
    	 driver.findElement(firstname).clear();
    	 driver.findElement(firstname).sendKeys(fname);
    	  }
     public static  void middlename(String mname)
     {
    	 driver.findElement(middlename).clear();
    	 driver.findElement(middlename).sendKeys(mname);
     }
     public  static void  lastname(String lname)
     {
    	 driver.findElement(lastname).clear();
    	 driver.findElement(lastname).sendKeys(lname);
     }
     public static void idd(String num)
     {
    	 driver.findElement(id).clear();
    	 driver.findElement(id).sendKeys(num);
     }
     
     public static void enterdetails(String fname,String mname,String lname,String id) throws Exception
     {
    	 pimlink();
    	 addbutton();
    	 firstname(fname);
    	 middlename(mname);
    	 lastname( lname);
    	 idd(id);	 
     }
     
}
