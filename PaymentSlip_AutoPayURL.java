package Merchant_Profile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PaymentSlip_AutoPayURL {

	
	public static void main(String[] args) {
		FirefoxDriver wd;
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("https://www.cashpayment.com/");
        
        
        //****************************LOGIN SCRIPT LIVE SERVER****************************
        //click login link on homepage
        WebElement login = wd.findElement(By.xpath(".//*[@id='login_link']"));
        login.click();
		
        //SendKeys username
        WebElement username = wd.findElement(By.xpath(".//*[@id='UserName']"));
        username.sendKeys("merchantdemo");
		
        //SendKeys password
        WebElement password = wd.findElement(By.xpath(".//*[@id='password1']"));
        password.sendKeys("qazwsx1234");
		
		//Click Signin button  .//*[@id='signin']/p[3]/button
        WebElement signIn = wd.findElement(By.xpath(".//*[@id='signin']/p[3]/button"));
        signIn.click();
		
		//********************PROFILE TAB***************************************
        //Click Profile Link     .//*[@id='fieldWrapper']/div[1]/ul/li[3]/a
        WebElement profileLink = wd.findElement(By.xpath(".//*[@id='fieldWrapper']/div[1]/ul/li[3]/a"));
        profileLink.click();
		
		//********************VERIFY MERCHANT INFORMATION***************************************
        //Search by ID not xpath, xpaths are not available for these dynamic elements
        //merchant ID
        WebElement merchantID = wd.findElement(By.id("MerchantID"));
        merchantID.isDisplayed();
		
        //Account ID  AccountNumber
        WebElement accountID = wd.findElement(By.id("AccountNumber"));
        accountID.isDisplayed();
        
        //Hash Code
        WebElement hashCode = wd.findElement(By.id("HashCode"));
        hashCode.isDisplayed();
        
        //Merchant API Key
        WebElement apiKey = wd.findElement(By.id("MerchantAPIKey"));
        apiKey.isDisplayed();
        
        //Change Boolean value to match merchant ID etc
        boolean apiKey2 = wd.findElement(By.id("MerchantAPIKey")).equals("645");
   
		
	}

}
