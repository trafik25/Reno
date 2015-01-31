package CheckMyPayment;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
//THIS TEST NEEDS TO BE COMPLETED***************************


public class CheckMyPayment_VerifyAccountAccess_VerifyData {
    public static void main(String[] args) throws Exception {
        FirefoxDriver wd;
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("https://staging.cashpayment.com/");
        //account numbers will be different on live. 
        
        //Click View My Payments
        WebElement viewMyPayments = wd.findElement(By.xpath(".//*[@id='top-nav']/li[1]/a[1]"));
        viewMyPayments.click();
        
        WebElement enterAccountNumber	= wd.findElement(By.xpath(".//*[@id='payParam']"));
        enterAccountNumber.sendKeys("636808362");
                    
       //*********START WRITING HERE NEW TEST HERE
        	
        //ACTION- Click button 
        WebElement findButtonClick = wd.findElement(By.xpath(".//*[@id='register']"));
        findButtonClick.click();
        
        //ACTION-Verify Text "Payments Found"
        
        
        
        //*****VERIFY DATA FOR ACCOUNT NUMBER 636808362*************
        //ACTION-Verify Account Number

        
        
        //ACTION-Verify Date Created
        
        
        
        //ACTION-Verify Amount
        
        
        //ACTION-Verify Fee
        
        
        
       //ACTION-Verify Total Amount


       //ACTION-Verify Status
         
        
        
       //ACTION-Verify Date Paid
        
        
        
        
        
        
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
    	