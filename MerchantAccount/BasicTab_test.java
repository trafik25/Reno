package MerchantAccount;
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
		
        //****************************Account Screen****************************

        //Account Link  .//*[@id='fieldWrapper']/div[1]/ul/li[1]/a
        WebElement accountLink = wd.findElement(By.xpath(".//*[@id='fieldWrapper']/div[1]/ul/li[1]/a"));
        accountLink.click();
        
        //FN .//*[@id='ContactFirstName']
        WebElement firstName = wd.findElement(By.xpath(".//*[@id='ContactFirstName']"));
        firstName.isDisplayed();
        
        //LN .//*[@id='ContactLastName']
        WebElement lastName = wd.findElement(By.xpath(".//*[@id='ContactLastName']"));
        lastName.isDisplayed();
        
        //Title 
        
        
        //Email
        
        
        
        //Primary phone
        
        
        
        //Secondary phone
        
        
        //Old password
        
        
        //Password
        
        
        //Confirm Password
        
        
        //****************************Change Password****************************

        //Send Keys Old Password  qazwsx1234
        
        
        //Send Keys Password   password123

        
        //Send Keys Confirm Password  password123
        
        
        

        
        
        
        wd.close();
        
	}
}
