package Merchant_CreateOrder;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MerchantWelcomePage_VerifyElements {

	public static void main(String[] args) throws Exception {
        FirefoxDriver wd;
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("https://www.cashpayment.com/");
        //live address is https://www.cashpayment.com/Backoffice
	      //merchantdemo
	      //qazwsx1234
        
        //***********************Merchant Login Information*************************

        
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
        
        
        
        //***************START TEST HERE**********************
      
         //Account Link .//*[@id='fieldWrapper']/div[1]/ul/li[1]/a
        WebElement accountLink = wd.findElement(By.xpath(".//*[@id='fieldWrapper']/div[1]/ul/li[1]/a"));
        accountLink.isDisplayed();
        
        //Order History .//*[@id='fieldWrapper']/div[1]/ul/li[2]/a
        WebElement orderHistoryLink = wd.findElement(By.xpath(".//*[@id='fieldWrapper']/div[1]/ul/li[2]/a"));
        orderHistoryLink.isDisplayed();
        
        //Profile .//*[@id='fieldWrapper']/div[1]/ul/li[3]/a
        WebElement profile = wd.findElement(By.xpath(".//*[@id='fieldWrapper']/div[1]/ul/li[3]/a"));
        profile.isDisplayed();
        
        //Create Order .//*[@id='fieldWrapper']/div[1]/ul/li[4]/a
        WebElement createOrder = wd.findElement(By.xpath(".//*[@id='fieldWrapper']/div[1]/ul/li[4]/a"));
        createOrder.isDisplayed();
        
        //Logoff .//*[@id='fieldWrapper']/div[1]/ul/li[5]/a
        WebElement logOff = wd.findElement(By.xpath(".//*[@id='fieldWrapper']/div[1]/ul/li[5]/a"));
        logOff.isDisplayed();
        
        //ZipZap Logo
        WebElement logo = wd.findElement(By.xpath(".//*[@id='copyright']/img"));
        logo.isDisplayed();
        
        //Verify Merchant Name is Present 
        WebElement merchantName = wd.findElement(By.xpath(".//*[@id='fieldWrapper']/div[2]/h2"));
        merchantName.isDisplayed();
        
        
      
        
        
        wd.close();
        
	}
}