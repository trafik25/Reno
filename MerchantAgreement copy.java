package Merchant_Account;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class MerchantAgreement {

	public static void main(String[] args) throws Exception {
        FirefoxDriver wd;
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("https://www.cashpayment.com/");
        
        //merchantdemo
        //qazwsx1234
      
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
        
        //Click the account tab .//*[@id='fieldWrapper']/div[1]/ul/li[1]/a
        WebElement accountTab = wd.findElement(By.xpath(".//*[@id='fieldWrapper']/div[1]/ul/li[1]/a"));
        accountTab.click();
        
        //Click the Merchant Agreement tab  .//*[@id='tabs']/ul/li[5]/a
        WebElement basicTab = wd.findElement(By.xpath(".//*[@id='tabs']/ul/li[5]/a"));
        basicTab.click();
        
        //Test shows that the text is visible
        WebElement agreement = wd.findElement(By.xpath(".//*[@id='tab-agreement']/div"));
        agreement.isDisplayed();
        
        
        
        
	}
}
