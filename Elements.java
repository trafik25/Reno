package CheckMyPayment;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class Elements {
    public static void main(String[] args) throws Exception {
        FirefoxDriver wd;
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("https://www.cashpayment.com/");
        //*******account numbers will be different on live. 
        
      //*****************************FIND YOUR PAYMENT*****************************
        
        //Click View My Payments
        WebElement viewMyPayments = wd.findElement(By.xpath(".//*[@id='top-nav']/li[1]/a[1]"));
        viewMyPayments.click();
        
        WebElement enterAccountNumber	= wd.findElement(By.xpath(".//*[@id='payParam']"));
        enterAccountNumber.sendKeys("468677810");
                           	
        // Click FIND button 
        WebElement findButtonClick = wd.findElement(By.xpath(".//*[@id='register']"));
        findButtonClick.click();
        
        //*****************************DATA TEST*****************************

        // Account Number
        WebElement accountNum = wd.findElement(By.xpath(".//*[@id='map-results']/tbody/tr/th"));
        accountNum.isDisplayed();
        
        
        //Date Created
        WebElement date = wd.findElement(By.xpath(".//*[@id='map-results']/tbody/tr/td[1]"));
        date.isDisplayed();
        
        
        //Amount
        WebElement amount = wd.findElement(By.xpath(".//*[@id='map-results']/tbody/tr/td[2]"));
        amount.isDisplayed();
        
        //Fee
        WebElement fee = wd.findElement(By.xpath(".//*[@id='map-results']/tbody/tr/td[3]"));
        fee.isDisplayed();
        
        
        //Total Amount
        WebElement totalAmount = wd.findElement(By.xpath(".//*[@id='map-results']/tbody/tr/td[4]"));
        totalAmount.isDisplayed();

       //ACTION-Verify Status
        WebElement status = wd.findElement(By.xpath(".//*[@id='map-results']/tbody/tr/td[5]"));
        status.isDisplayed();
        
        
       //ACTION-Verify Date Paid
        WebElement datePaid = wd.findElement(By.xpath(".//*[@id='map-results']/tbody/tr/td[6]"));
        datePaid.isDisplayed();
        
        
        //*****************************ELEMENTS TEST*****************************
        //ZipZap Account number info .//*[@id='fieldWrapper']/div/h2[1]
          assertTrue(wd.getPageSource().contains("If you have a ZipZap Account Number from a payment slip or an email, please enter it here."));
	     
          //Payments Found .//*[@id='fieldWrapper']/div/h2[2]
          assertTrue(wd.getPageSource().contains("Payments Found"));
	      
          //ZipZap Logo .//*[@id='copyright']/img
          WebElement copyrightLogo = wd.findElement(By.id("copyright"));
          copyrightLogo.isDisplayed();
       
        
        
        
        
        
        
        
        
        wd.close();
        
   

    	    
    	}

	private static void assertTrue(boolean contains) {
		// TODO Auto-generated method stub
		
	}
}	