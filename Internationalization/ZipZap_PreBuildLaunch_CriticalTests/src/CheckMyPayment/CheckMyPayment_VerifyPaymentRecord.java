package CheckMyPayment;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class CheckMyPayment_VerifyPaymentRecord {
    public static void main(String[] args) throws Exception {
        FirefoxDriver wd;
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("https://staging.cashpayment.com/");
        

        //account numbers will be different on live. 
        
        WebElement viewMyPayments = wd.findElement(By.xpath(".//*[@id='top-nav']/li[1]/a[1]"));
        viewMyPayments.click();
        
        //*********START WRITING HERE NEW TEST HERE
        
        WebElement inputBox = wd.findElement(By.xpath(".//*[@id='payParam']"));
        inputBox.sendKeys("636808362");
       
        
        
        
        
        
        
        
        
        
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
    	