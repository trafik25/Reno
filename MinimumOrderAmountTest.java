package Odd_Tests;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class MinimumOrderAmountTest {

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
        
        //Create order link
        WebElement createOrderLink = wd.findElement(By.xpath(".//*[@id='fieldWrapper']/div[1]/ul/li[4]/a"));
        createOrderLink.click();
        
        
        //Specify Amount
        WebElement specifyAmount = wd.findElement(By.xpath(".//*[@id='Amount']"));
        specifyAmount.clear();
        specifyAmount.sendKeys("1.00");    //minimum is $5.00    
        
        //Enter First name
        WebElement firstName = wd.findElement(By.xpath(".//*[@id='CustomerFirstName']"));
        firstName.sendKeys("Thomas"); 
        
        
        //Enter Last Name
        WebElement lastName = wd.findElement(By.xpath(".//*[@id='CustomerLastName']"));
        lastName.sendKeys("Johnson"); 
        
        //Enter Email
        WebElement email = wd.findElement(By.xpath(".//*[@id='CustomerEmailAddress']"));
        email.sendKeys("thomashoward313@gmail.com"); 
        
        //Click Create Order (Continue)
        WebElement createOrder1 = wd.findElement(By.xpath(".//*[@id='createOrder']"));
        createOrder1.click();
        
       
        
	
	
	
	
	
	
	
	
	
	wd.close();

	}

	private static void assertTrue(boolean contains) {
		// TODO Auto-generated method stub
		
	}

}
