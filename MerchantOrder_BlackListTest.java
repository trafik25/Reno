package BugTests_Build2_1_50;
//verify a name is on the blacklist and then try to create an order
//verify that the appropriate error occurs

import java.util.concurrent.TimeUnit;
//THIS TEST NEEDS TO BE COMPLETED***************************

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MerchantOrder_BlackListTest {

	public static void main(String[] args) throws Exception {
        FirefoxDriver wd;
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("https://www.cashpayment.com/BackOffice");
      //change URL for live
        //("https://www.cashpayment.com/")
        //merchantdemo
        //qazwsx1234
        //Staging https://staging.cashpayment.com/
        
        
        
        //Login to Backoffice
        //Username
        WebElement loginUser = wd.findElement(By.xpath(".//*[@id='UserName']"));
        loginUser.sendKeys("tomhoward");
        
        //Password
        WebElement loginPassword = wd.findElement(By.xpath(".//*[@id='Password']"));
        loginPassword.sendKeys("tiesto25");
        
        //click the logon button
        WebElement logon = wd.findElement(By.xpath(".//*[@id='page']/div[3]/form/p[1]/input"));
        logon.click();
        
        //Click Blacklist Link in backoffice
        WebElement blackLink = wd.findElement(By.xpath(".//*[@id='page']/a[3]"));
        blackLink.click();
        
        //Is name present .//*[@id='page']/table/tbody/tr[2]/td[3]
	      assertTrue(wd.getPageSource().contains("kentgza@yahoo.com"));

        
        
        
        //*******************************************OPEN NEW BROWSER*******************************
       
        wd.get("https://www.cashpayment.com");
        
        
        
       //********************LOGIN TO MERCHANT ACCOUNT*******************************
        
       //Merchant Login Link Click
        WebElement merchantLogin = wd.findElement(By.xpath(".//*[@id='login_link']"));
        merchantLogin.click();
        
        //Username
        WebElement username = wd.findElement(By.xpath(".//*[@id='UserName']"));
        username.sendKeys("merchantdemo");
        
        //Password
        WebElement password = wd.findElement(By.xpath(".//*[@id='password1']"));
        password.sendKeys("qazwsx1234");
        
        //Click Sign In Button
        WebElement signIn = wd.findElement(By.xpath(".//*[@id='signin']/p[3]/button"));
        signIn.click();
        
       
      
        //********************CREATE AN ORDER TO TEST
        //Click Create Order
        WebElement createOrder = wd.findElement(By.xpath(".//*[@id='fieldWrapper']/div[1]/ul/li[4]/a"));
        createOrder.click();
              
        //Enter First name
        WebElement firstName = wd.findElement(By.xpath(".//*[@id='CustomerFirstName']"));
        firstName.sendKeys("Kent"); 
        
        
        //Enter Last Name
        WebElement lastName = wd.findElement(By.xpath(".//*[@id='CustomerLastName']"));
        lastName.sendKeys("gza"); 
        
        //Enter Email kentgza@yahoo.com
        WebElement email = wd.findElement(By.xpath(".//*[@id='CustomerLastName']"));
        email.sendKeys("kentgza@yahoo.com");
        
        //Click Create Order (Continue)
        WebElement createOrderClick = wd.findElement(By.xpath(".//*[@id='createOrder']"));
        createOrderClick.click();
        
       //Verify Error  There was an identity error in generating your payment slip. Please contact support@zipzapinc.com to resolve.
	      assertTrue(wd.getPageSource().contains("There was an identity error in generating your payment slip. Please contact support@zipzapinc.com to resolve."));

        
        wd.close();
        
        
        
        
        
        
       
        
   	}

	private static void assertTrue(boolean contains) {
		// TODO Auto-generated method stub
		
	}
   	}
