package FAPC;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class FAPC_VerifyAccess {
    public static void main(String[] args) throws Exception {
        FirefoxDriver wd;
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("https://staging.cashpayment.com/");
       
        //Click the Link for  FAPC
        WebElement linkClick = wd.findElement(By.xpath(".//*[@id='top-nav']/li[2]/a"));
        linkClick.click();
        
        //Verify Input Box Present
        WebElement inputBox = wd.findElement(By.xpath(".//*[@id='wrapper']/div[4]/div[5]/form/input"));
        
        if (inputBox.isDisplayed()) {
	        System.out.println("Test Passed!");
		} else {
 
            System.out.println("Test Failed");
        }
        
        //Verify Search Address
        WebElement searchAddress = wd.findElement(By.xpath(".//*[@id='wrapper']/div[4]/div[5]/form/button"));
     
        if (searchAddress.isDisplayed()) {
	        System.out.println("Test Passed!");
		} else {
 
            System.out.println("Test Failed");
        }
        
        //Verify Input Box Operational
        WebElement inputBox1 = wd.findElement(By.xpath(".//*[@id='wrapper']/div[4]/div[5]/form/input"));
        inputBox1.sendKeys("48382");
        
        //Verify Search Address is operational
        WebElement searchAddress1 = wd.findElement(By.xpath(".//*[@id='wrapper']/div[4]/div[5]/form/button"));
        searchAddress1.click();
        
        
        //Verify the Agent Location is visible to the customer
        WebElement market = wd.findElement(By.xpath(".//*[@id='map-results']/tbody/tr[1]/th"));
        
    	if (market.isDisplayed()) {
	        System.out.println("Test Passed!");
		} else {
 
            System.out.println("Test Failed");
            
        }
		 wd.close();
        
        
    
    }
        
        public static boolean isAlertPresent(FirefoxDriver wd) {
            try {
                wd.switchTo().alert();
                return true;
            } catch (NoAlertPresentException e) {
                return false;
            }
        }

    	    
    	}