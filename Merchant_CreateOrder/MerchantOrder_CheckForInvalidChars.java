package Merchant_CreateOrder;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class MerchantOrder_CheckForInvalidChars {

	public static void main(String[] args) throws Exception {
        FirefoxDriver wd;
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("https://staging.cashpayment.com/");
        //change URL for live
        //("https://www.cashpayment.com/")
        //merchantdemo
        //qazwsx1234

	
        
        //Merchant Login Link Click
        WebElement merchantLogin = wd.findElement(By.xpath(".//*[@id='login_link']"));
        merchantLogin.click();
        
        //Username
        WebElement merchantLogin1 = wd.findElement(By.xpath(".//*[@id='UserName']"));
        merchantLogin1.sendKeys("thomas.boston617@gmail.com");
        
        //Password
        WebElement merchantLogin2 = wd.findElement(By.xpath(".//*[@id='password1']"));
        merchantLogin2.sendKeys("chinese45");
        
        //Click Sign In Button
        WebElement signIn = wd.findElement(By.xpath(".//*[@id='signin']/p[3]/button"));
        signIn.click();
        
        
        //***********************************CREATE ORDER PAGE***********************************
        //Click Create Order
        WebElement createOrder = wd.findElement(By.xpath(".//*[@id='fieldWrapper']/div[1]/ul/li[5]/a"));
        createOrder.click();
        
        //Specify Amount
        WebElement specifyAmount = wd.findElement(By.xpath(".//*[@id='Amount']"));
        specifyAmount.clear();
        specifyAmount.sendKeys("10.00");        
        
        //Enter First name
        WebElement firstName = wd.findElement(By.xpath(".//*[@id='CustomerFirstName']"));
        firstName.sendKeys("$Thomas"); 
        
        
        //Enter Last Name
        WebElement lastName = wd.findElement(By.xpath(".//*[@id='CustomerLastName']"));
        lastName.sendKeys("!Johnson"); 
        
        //Click Create Order (Continue)
        WebElement createOrder1 = wd.findElement(By.xpath(".//*[@id='createOrder']"));
        createOrder1.click();
        
        assertTrue(wd.getPageSource().contains("Merchant provided incorrect data: An invalid First Name or Last Name was submitted with this order. Go back and try again. Make sure to use your real name."));

       
      
        
        
        
        
        
     wd.close();
     
    
     
	}

	private static void assertTrue(boolean contains) {
		// TODO Auto-generated method stub
		
	}
	}
   
        