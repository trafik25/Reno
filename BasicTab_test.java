package Merchant_Account;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class BasicTab_test {

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
        
        //Click the basic tab  .//*[@id='tabs']/ul/li[1]/a
        WebElement basicTab = wd.findElement(By.xpath(".//*[@id='tabs']/ul/li[1]/a"));
        basicTab.click();
		
        //****************************Account Screen****************************
//
//        //Account Link  .//*[@id='fieldWrapper']/div[1]/ul/li[1]/a
//        WebElement accountLink = wd.findElement(By.xpath(".//*[@id='fieldWrapper']/div[1]/ul/li[1]/a"));
//        accountLink.click();
//        
//        //FN .//*[@id='ContactFirstName']
//        WebElement firstName = wd.findElement(By.xpath(".//*[@id='ContactFirstName']"));
//        firstName.isDisplayed();
//        
//        //LN .//*[@id='ContactLastName']
//        WebElement lastName = wd.findElement(By.xpath(".//*[@id='ContactLastName']"));
//        lastName.isDisplayed();
//        
//        //Title .//*[@id='ContactTitle'] 
//        WebElement title = wd.findElement(By.xpath(".//*[@id='ContactLastTitle']"));
//        title.isDisplayed();
//        
//        //Email .//*[@id='ContactEmailAddress']
//        WebElement email = wd.findElement(By.xpath(".//*[@id='ContactEmailAddress']"));
//        email.isDisplayed();
//        
//        //Primary phone .//*[@id='ContactPrimaryPhone']
//        WebElement primePhone = wd.findElement(By.xpath(".//*[@id='ContactPrimaryPhone']"));
//        primePhone.isDisplayed();
//        
//        //Secondary phone .//*[@id='ContactSecondaryPhone']
//        WebElement secPhone = wd.findElement(By.xpath(".//*[@id='ContactSecondaryPhone']"));
//        secPhone.isDisplayed();
//        
//       
//        
//        
//        //****************************Change Password****************************
//        //Old password .//*[@id='OldPassword']
//        WebElement oldPassword = wd.findElement(By.xpath(".//*[@id='OldPassword']"));
//        oldPassword.sendKeys("qazwsx1234");
//        
//        //Password .//*[@id='Password']
//        WebElement newPass = wd.findElement(By.xpath(".//*[@id='Password']"));
//        newPass.sendKeys("password123");
//        
//        //Confirm Password .//*[@id='ConfirmPassword']
//        WebElement confirmnewPass = wd.findElement(By.xpath(".//*[@id='ConfirmPassword']"));
//        confirmnewPass.sendKeys("password123");
//        
//        //Confirm SAVE 
//        WebElement saveButton = wd.findElement(By.xpath(".//*[@id='basic']/button"));
//        saveButton.click();
//        
//        Thread.sleep(5000);
//        //change password back to default password
//        //Old password .//*[@id='OldPassword']
//        WebElement oldPassword1 = wd.findElement(By.xpath(".//*[@id='OldPassword']"));
//        oldPassword1.sendKeys("password123");
//        
//        //Password .//*[@id='Password']
//        WebElement newPass1 = wd.findElement(By.xpath(".//*[@id='Password']"));
//        newPass1.sendKeys("qazwsx1234");
//        
//        //Confirm Password .//*[@id='ConfirmPassword']
//        WebElement confirmnewPass1 = wd.findElement(By.xpath(".//*[@id='ConfirmPassword']"));
//        confirmnewPass1.sendKeys("qazwsx1234");
//        
//        //Confirm SAVE 
//        WebElement saveButton1 = wd.findElement(By.xpath(".//*[@id='basic']/button"));
//        saveButton1.click();
//        
//        //Now logout  .//*[@id='fieldWrapper']/div[1]/ul/li[5]/a
//        WebElement logout = wd.findElement(By.xpath(".//*[@id='fieldWrapper']/div[1]/ul/li[5]/a"));
//        logout.click();
//        
//        //login to account again
//        //click login link on homepage
//        WebElement login1 = wd.findElement(By.xpath(".//*[@id='login_link']"));
//        login1.click();
//		
//        //SendKeys username
//        WebElement username1 = wd.findElement(By.xpath(".//*[@id='UserName']"));
//        username1.sendKeys("merchantdemo");
//		
//        //SendKeys password
//        WebElement password1 = wd.findElement(By.xpath(".//*[@id='password1']"));
//        password1.sendKeys("qazwsx1234");
//		
//		//Click Signin button  .//*[@id='signin']/p[3]/button
//        WebElement signIn1 = wd.findElement(By.xpath(".//*[@id='signin']/p[3]/button"));
//        signIn1.click();
//        
        
        
        
        wd.close();
        
	}
}
