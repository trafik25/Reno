package CheckMyPayment;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class CheckMyPayment_TEMPLATE {
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
    	