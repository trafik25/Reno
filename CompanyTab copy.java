package Merchant_Account;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class CompanyTab {

	public static void main(String[] args) throws Exception {
        FirefoxDriver wd;
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("https://www.cashpayment.com/");
        
        //merchantdemo
        //qazwsx1234
        
        
        //To clear the value and submit a new one use the code below
        //varName.clear();
        //varName.sendKeys("XXXXXXX");
      
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
        
        //Click the Company Tab .//*[@id='tabs']/ul/li[2]/a
        WebElement companyTab = wd.findElement(By.xpath(".//*[@id='tabs']/ul/li[2]/a"));
        companyTab.click();
        
        
        
        //****************************Company Legal Name Box****************************
	    //assert that the page source contains the company name in the heading  
        assertTrue(wd.getPageSource().contains("COMPANY NAME HERE"));
        
        //DBA Name is .//*[@id='BusinessDBAName']
        WebElement dba = wd.findElement(By.xpath("is .//*[@id='BusinessDBAName']"));
        dba.isDisplayed();
        
        //address .//*[@id='CompanyAddress']
        WebElement address = wd.findElement(By.xpath(".//*[@id='CompanyAddress']"));
        address.isDisplayed();
        
        //country  .//*[@id='Country']
        WebElement country = wd.findElement(By.xpath(".//*[@id='Country']"));
        country.isDisplayed();
        
        //company phone .//*[@id='CompanyPhone']
        WebElement compPhone = wd.findElement(By.xpath(".//*[@id='CompanyPhone']"));
        compPhone.isDisplayed();
        
        //URL  .//*[@id='CompanyURL']
        WebElement url = wd.findElement(By.xpath(".//*[@id='CompanyURL']"));
        url.isDisplayed();
        
        //legal entity .//*[@id='TypeOfLegalEntity']
        WebElement legal = wd.findElement(By.xpath(".//*[@id='TypeOfLegalEntity']"));
        legal.isDisplayed();
        
        //inc where? .//*[@id='WhereIncorporatedOrFormed']
        WebElement inc = wd.findElement(By.xpath(".//*[@id='WhereIncorporatedOrFormed']"));
        inc.isDisplayed();
        
        //Gov reg number YES, use id,  id="Company_DontHaveGovernmentRegistrationNumber"
        WebElement gov = wd.findElement(By.id("Company_DontHaveGovernmentRegistrationNumber"));
        gov.equals("Yes");        
        
        //Confirm SAVE 
        WebElement saveButton1 = wd.findElement(By.xpath(".//*[@id='basic']/button"));
        saveButton1.click();
        
        
        
        
        
        wd.close();
        
        
	}

	private static void assertTrue(boolean contains) {
		// TODO Auto-generated method stub
		
	}
}

		