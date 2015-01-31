package FAPC;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class VerifyAccess {
    public static void main(String[] args) throws Exception {
        FirefoxDriver wd;
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("https://staging.cashpayment.com/");
       
        //Click the Link Find a Payment Center
        WebElement linkClick = wd.findElement(By.xpath(".//*[@id='top-nav']/li[2]/a"));
        linkClick.click();
      
        //Enter in Zip Code
        WebElement inputBox1 = wd.findElement(By.xpath(".//*[@id='wrapper']/div[4]/div[5]/form/input"));
        inputBox1.sendKeys("48382");
        
        //Click Search .//*[@id='wrapper']/div[4]/div[5]/form/button
        WebElement search = wd.findElement(By.xpath(".//*[@id='wrapper']/div[4]/div[5]/form/button"));
        search.click();
        
        
        //Map appears .//*[@id='ui-center']/div[1]
        WebElement map = wd.findElement(By.xpath(".//*[@id='wrapper']/div[4]/div[5]/form/input"));
        map.isDisplayed();
        
        //Verify Market info is correct 
         assertTrue(wd.getPageSource().contains("Browns Market"));
	      assertTrue(wd.getPageSource().contains("5802 STORER"));
	      assertTrue(wd.getPageSource().contains("CLEVELAND"));
	      assertTrue(wd.getPageSource().contains("216-631-4923 "));
	      
        
      
       
        
    }

	private static void assertTrue(boolean contains) {
		// TODO Auto-generated method stub
		
	}
}
        
        
        