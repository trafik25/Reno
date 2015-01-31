package CheckMyPayment;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class CheckMyPayment_VerifyElements {
    public static void main(String[] args) throws Exception {
        FirefoxDriver wd;
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("https://staging.cashpayment.com/");
        StringBuffer verificationErrors = new StringBuffer();

        //account numbers will be different on live. 
        
        //****VIEW MY PAYMENTS .CLICK
        WebElement viewMyPayments = wd.findElement(By.xpath(".//*[@id='top-nav']/li[1]/a[1]"));
        viewMyPayments.click();
        
        
        
        
        //*********START WRITING HERE NEW TESTS HERE
        //*****PARAGRAPH TEXT HERE
        
        
        //******INPUT BOX HERE
        WebElement inputBox = wd.findElement(By.xpath(".//*[@id='payParam']"));
		if (inputBox.isDisplayed()) {
	        System.out.println("Test Passed!");
		} else {
 
            System.out.println("Test Failed");
        }
        
		
		//*****FIND BUTTON HERE
		WebElement findButton = wd.findElement(By.xpath(".//*[@id='register']"));
		if (findButton.isDisplayed()) {
	        System.out.println("Test Passed!");
		} else {
 
            System.out.println("Test Failed");
        }
		
		
		//LOGO HERE
		WebElement logo = wd.findElement(By.xpath(".//*[@id='copyright']/img"));
		if (logo.isDisplayed()) {
	        System.out.println("Test Passed!");
		} else {
 
            System.out.println("Test Failed");
        }
		
		//LANGUAGE MENU HERE
		WebElement langMen = wd.findElement(By.xpath(".//*[@id='language-menu']/ul/li[1]/a"));
		if (langMen.isDisplayed()) {
	        System.out.println("Test Passed!");
		} else {
 
            System.out.println("Test Failed");
        }
        
		try {
            assertTrue(wd.findElement(By.xpath(".//*[@id='fieldWrapper']/div/h2")).getText().matches("If you have a ZipZap Account Number from a payment slip or an email, please enter it here."));
          } catch (Error e) {
            verificationErrors.append(e.toString());
            System.out.println("Text not Found" +e.getMessage());
          }
		
        //input box .//*[@id='payParam']
       // find .//*[@id='register']
        // logo .//*[@id='copyright']/img
        //lang menu  .//*[@id='language-menu']/ul/li[1]/a
        
//// try catch statement here		
//        try {
//            assertTrue(wd.findElement(By.xpath("xxxxxx")).getText().matches("xxxxxx"));
//          } catch (Error e) {
//            verificationErrors.append(e.toString());
//            System.out.println("Text not Found" +e.getMessage());
//          }
        
        
        
        
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
    	