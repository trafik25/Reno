package BugTests_Build2_1_50_341;
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
        wd.get("https://staging.cashpayment.com/BackOffice");
        
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
        
        //Verify First Name of User
        WebElement verifyFN = wd.findElement(By.xpath(".//*[@id='page']/table/tbody/tr[2]/td[4]"));
        verifyFN.isDisplayed();        
        
        //Verify Last Name of User
        WebElement verifyLN = wd.findElement(By.xpath(".//*[@id='page']/table/tbody/tr[2]/td[5]"));
        verifyLN.isDisplayed(); 
    
        
        
        
        //*******************************************OPEN NEW BROWSER
       
        wd.get("https://staging.cashpayment.com/");
        
        
        
       //********************LOGIN TO MERCHANT ACCOUNT
       //Merchant Login Link Click
        WebElement merchantLogin = wd.findElement(By.xpath(".//*[@id='login_link']"));
        merchantLogin.click();
        
        //Username
        WebElement username = wd.findElement(By.xpath(".//*[@id='UserName']"));
        username.sendKeys("thomas.boston617@gmail.com");
        
        //Password
        WebElement password = wd.findElement(By.xpath(".//*[@id='password1']"));
        password.sendKeys("chinese45");
        
        //Click Sign In Button
        WebElement signIn = wd.findElement(By.xpath(".//*[@id='signin']/p[3]/button"));
        signIn.click();
        
        Thread.sleep(3000);
      
        //********************CREATE AN ORDER TO TEST
        //Click Create Order
        WebElement createOrder = wd.findElement(By.xpath(".//*[@id='fieldWrapper']/div[1]/ul/li[4]/a"));
        createOrder.click();
              
        
        //Enter First name
        WebElement firstName = wd.findElement(By.xpath(".//*[@id='CustomerFirstName']"));
        firstName.sendKeys("Fred"); 
        
        
        //Enter Last Name
        WebElement lastName = wd.findElement(By.xpath(".//*[@id='CustomerLastName']"));
        lastName.sendKeys("McGoo"); 
        
        //Click Create Order (Continue)
        WebElement createOrderClick = wd.findElement(By.xpath(".//*[@id='createOrder']"));
        createOrderClick.click();
        
        Thread.sleep(2000);
        
        //Check to see if error is present about ID
        boolean getIDError = wd.findElement(By.xpath(".//*[@id='currentHtml']/h3")).getText().matches("There was an identity error in generating your payment slip. Please contact support@zipzapinc.com to resolve.");
        
       
        
        //*******************************************OPEN NEW BROWSER

        //open new browser
        wd.get("https://staging.cashpayment.com/");
        
       
         
         //********************CREATE AN ORDER TO TEST
         //Click Create Order
         WebElement createOrder1 = wd.findElement(By.xpath(".//*[@id='fieldWrapper']/div[1]/ul/li[4]/a"));
         createOrder1.click();
               
         
         //Enter First name
         WebElement firstName1 = wd.findElement(By.xpath(".//*[@id='CustomerFirstName']"));
         firstName1.sendKeys("Tom"); 
         
         
         //Enter Last Name
         WebElement lastName1 = wd.findElement(By.xpath(".//*[@id='CustomerLastName']"));
         lastName1.sendKeys("McGoo"); 
         
         //Click Create Order (Continue)
         WebElement createOrderClick1 = wd.findElement(By.xpath(".//*[@id='createOrder']"));
         createOrderClick1.click();
         
         //Verify Search for Zip is present
         WebElement agentSearch = wd.findElement(By.xpath(".//*[@id='address']"));
         agentSearch.isDisplayed(); 
         
         
        
         
         

         //*******************************************OPEN NEW BROWSER

         //open new browser
         wd.get("https://staging.cashpayment.com/");
       
          //********************CREATE AN ORDER TO TEST
          //Click Create Order
          WebElement createOrder2 = wd.findElement(By.xpath(".//*[@id='fieldWrapper']/div[1]/ul/li[4]/a"));
          createOrder2.click();
                
          
          //Enter First name
          WebElement firstName2 = wd.findElement(By.xpath(".//*[@id='CustomerFirstName']"));
          firstName2.sendKeys("Fred"); 
          
          
          //Enter Last Name
          WebElement lastName2 = wd.findElement(By.xpath(".//*[@id='CustomerLastName']"));
          lastName2.sendKeys("Thompson"); 
          
          //Click Create Order (Continue)
          WebElement createOrderClick2 = wd.findElement(By.xpath(".//*[@id='createOrder']"));
          createOrderClick2.click();
          
          //Verify Search for Zip is present
          WebElement agentSearch1 = wd.findElement(By.xpath(".//*[@id='address']"));
          agentSearch1.isDisplayed(); 
          
        
        
        wd.close();
        
        
        
        
        
        
        
        //End testing
        
   	}
   	}
