package BugTests_Build2_1_50_341;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MerchantOrder_IncorrectErrorMessageLimits {

	public static void main(String[] args) throws Exception {
        FirefoxDriver wd;
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("https://staging.cashpayment.com/");
        

        //**************************************LOGIN***************************
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
        
      //******************************************CREATE ORDER PAGE**************************************
        //Create order link
        WebElement createOrderLink = wd.findElement(By.xpath(".//*[@id='fieldWrapper']/div[1]/ul/li[4]/a"));
        createOrderLink.click();
       
        
        //**************************************ORDER PAGE**************************************
       
        //auto-filled field change value from $50.00 to $a value
        WebElement delete50 = wd.findElement(By.xpath(".//*[@id='Amount']"));
        delete50.clear();
        delete50.sendKeys("800.00");
        
        
        //*************************Required FIELDS*************************
        //Customer First Name
        WebElement customerFirstName = wd.findElement(By.xpath(".//*[@id='CustomerFirstName']"));
        customerFirstName.sendKeys("Thomas");
        
        //Customer Last Name
        WebElement customerLastName = wd.findElement(By.xpath(".//*[@id='CustomerLastName']"));
        customerLastName.sendKeys("Tester");
        
        //Customer Email Address 
        WebElement customerEmailAddress = wd.findElement(By.xpath(".//*[@id='CustomerEmailAddress']"));
        customerEmailAddress.sendKeys("jorryjackson8888@gmail.com");
        
        //Customer Phone Number  
        WebElement customerPhoneNumber = wd.findElement(By.xpath(".//*[@id='CustomerPhoneNumber']"));
        customerPhoneNumber.sendKeys("2441221212");
        
        //Click Continue
        WebElement clickCont = wd.findElement(By.xpath(".//*[@id='createOrder']"));
        clickCont.click();
        
        //error message .//*[@id='fieldWrapper']/div/h2
        boolean error = wd.findElement(By.xpath(".//*[@id='fieldWrapper']/div/h2")).getText().contains("750.00"); 
        
        
        
       
        
        
        
        
        
        wd.close();
        
	}
}
        
        
        
        
        
        