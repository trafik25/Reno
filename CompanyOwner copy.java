package Merchant_Account;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class CompanyOwner {

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
        
        //Click the Company Owner Tab .//*[@id='tabs']/ul/li[3]/a
        WebElement companyTab = wd.findElement(By.xpath(".//*[@id='tabs']/ul/li[3]/a"));
        companyTab.click();
        
        //To clear the value and submit a new one use the code below
        //varName.clear();
        //varName.sendKeys("XXXXXXX");
        
        //****************************Company Legal Name Box****************************
	    //assert that the page source contains the company name in the heading  
        assertTrue(wd.getPageSource().contains("COMPANY NAME HERE"));
        
        //First Name  .//*[@id='FirstName']
        WebElement fn = wd.findElement(By.xpath(".//*[@id='FirstName']"));
        fn.isDisplayed();
        //fn.clear();
        //fn.sendKeys("XXXXXXX");
        
        //Last Name  .//*[@id='LastName']
        WebElement ln = wd.findElement(By.xpath(".//*[@id='LastName']"));
        ln.isDisplayed();
      
        
        //% of ownership .//*[@id='PercentOfOwnership']
        WebElement ownership = wd.findElement(By.xpath(".//*[@id='PercentOfOwnership']"));
        ownership.isDisplayed();
        
        
        //DOB .//*[@id='DateOfBirth']
        WebElement dob = wd.findElement(By.xpath(".//*[@id='DateOfBirth']"));
        dob.isDisplayed();
        
        //Gov ID
        WebElement gov = wd.findElement(By.xpath(".//*[@id='CompanyOwner_DontHaveGovernmentID']"));
        gov.click();
        
        //Address .//*[@id='Address']
        WebElement address = wd.findElement(By.xpath(".//*[@id='Address']"));
        address.isDisplayed();
        
        //Primary Phone .//*[@id='Phone1']
        WebElement phone1 = wd.findElement(By.xpath(".//*[@id='Phone1']"));
        phone1.isDisplayed();
        
        
        //Secondary Phone .//*[@id='Phone2']
        WebElement phone2 = wd.findElement(By.xpath(".//*[@id='Phone2']"));
        phone2.isDisplayed();
        
        
        //save button  .//*[@id='company']/button
        WebElement saveButton1 = wd.findElement(By.xpath(".//*[@id='basic']/button"));
        saveButton1.click();
        
        
        
        
        
        wd.close();
        
        
	}

	private static void assertTrue(boolean contains) {
		// TODO Auto-generated method stub
		
	}
}

		