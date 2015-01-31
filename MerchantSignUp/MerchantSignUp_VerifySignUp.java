package MerchantSignUp;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class MerchantSignUp_VerifySignUp {
    public static void main(String[] args) throws Exception {
        FirefoxDriver wd;
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("https://staging.cashpayment.com/");
        //wd.get("https://www.cashpayment.com/");
        
        //merchantdemo
        //qazwsx1234
        
        //*******************************SIGN  UP NEW MERCHANT*****************************
        
        //Click signup link
		WebElement merchantSignup = wd.findElement(By.xpath(".//*[@id='signUp_link']"));
		merchantSignup.click();
		
		
        //*******************************FILL IN MERCHANT INFO*****************************

		
		//Username  .//*[@id='Username']
		WebElement username = wd.findElement(By.xpath(".//*[@id='Username']"));
        username.sendKeys("testtest123");
        
	
		//Password .//*[@id='Password']
        WebElement password = wd.findElement(By.xpath(".//*[@id='Password']"));
        password.sendKeys("tiesto25");
        
	
		//Confirm Password  .//*[@id='ConfirmPassword']
        WebElement confirmPass = wd.findElement(By.xpath(".//*[@id='ConfirmPassword']"));
        confirmPass.sendKeys("tiesto25");
        
		
		
		//Company Legal Name  .//*[@id='CompanyLegalName']
        WebElement legal = wd.findElement(By.xpath(".//*[@id='CompanyLegalName']"));
        legal.sendKeys("TestTestZZ");
        
		
		//Contact FN .//*[@id='ContactFirstName']
        WebElement contactFN = wd.findElement(By.xpath(".//*[@id='ContactFirstName']"));
        contactFN.sendKeys("Test");
        
		
		//Contact LN  .//*[@id='ContactLastName']
        WebElement contactLN = wd.findElement(By.xpath(".//*[@id='ContactLastName']"));
        contactLN.sendKeys("Test");
        

		//Title  .//*[@id='ContactTitle']
        WebElement title = wd.findElement(By.xpath(".//*[@id='ContactTitle']"));
        title.sendKeys("CEO");
        
		
		//Email .//*[@id='ContactEmailAddress']
        WebElement email = wd.findElement(By.xpath(".//*[@id='ContactEmailAddress']"));
        email.sendKeys("testest123xxx@gmail.com");
        
		
		
		//Primary Phone .//*[@id='ContactPrimaryPhone']
        WebElement primaryPhone = wd.findElement(By.xpath(".//*[@id='ContactPrimaryPhone']"));
        primaryPhone.sendKeys("2221244444");
        
		
		//Register 
        WebElement register = wd.findElement(By.xpath(".//*[@id='register']"));
        register.click();
        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

    	wd.close();

    }

	    
	}