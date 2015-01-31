package BugTests_Build2_1_50;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MerchantOrder_FrozenScreenBug {

	public static void main(String[] args) throws Exception {
        FirefoxDriver wd;
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("https://www.cashpayment.com/");
      //change URL for live
        //("https://www.cashpayment.com/")
        //merchantdemo
        //qazwsx1234
        //Staging https://staging.cashpayment.com/

        //**************************************LOGIN***************************
        //Merchant Login Link Click
        WebElement merchantLogin = wd.findElement(By.xpath(".//*[@id='login_link']"));
        merchantLogin.click();
        
        //Username
        WebElement merchantLogin1 = wd.findElement(By.xpath(".//*[@id='UserName']"));
        merchantLogin1.sendKeys("merchantdemo");
        
        //Password
        WebElement merchantLogin2 = wd.findElement(By.xpath(".//*[@id='password1']"));
        merchantLogin2.sendKeys("qazwsx1234");
        
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
        delete50.sendKeys("1.00");
        
        
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
        
        
        
        //*************************START ACTIONS*************************
        //Refresh the page
        wd.navigate().refresh();
        
        //Wait for page to refresh
        Thread.sleep(3000);
        
        //Check Email and verify email address is present
        WebElement email = wd.findElement(By.xpath(".//*[@id='form-field-email']"));
        email.isDisplayed();
        
        
       //try entering in an email address
        WebElement emailEnter = wd.findElement(By.xpath(".//*[@id='form-field-email']"));
        emailEnter.sendKeys("jorryjackson8888@gmail.com");  
        
        //the test will throw an exception since it wont be able to enter an email
        //this is a negative test for Selenium. If it enters the address it will pass
        
        wd.close();
        
	}
	
}