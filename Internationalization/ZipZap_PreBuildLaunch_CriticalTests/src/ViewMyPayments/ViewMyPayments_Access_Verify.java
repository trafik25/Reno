package ViewMyPayments;
import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class ViewMyPayments_Access_Verify {
    public static void main(String[] args) throws Exception {
        FirefoxDriver wd;
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("https://staging.cashpayment.com/");
        //account numbers will be different on live. 
        
        WebElement viewMyPayments = wd.findElement(By.xpath(".//*[@id='top-nav']/li[1]/a[1]"));
        viewMyPayments.click();
        
        String title = wd.getCurrentUrl();
        System.out.println(title);
        
        
       //Write method here for checking title and verifying it
            
        
        
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
    	