package BugTests_Build2_1_50_341;

// ticket https://app.asana.com/0/2454657366642/4814333086300


//REMEMBER YOULL NEED MERCHANT DEMO TO TEST ON LIVE***************************

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MerchantOrder_ExceedingDailyLimitBUG {

	public static void main(String[] args) throws Exception {
        FirefoxDriver wd;
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("https://staging.cashpayment.com/");
        
        
        //begin tests here
        
        //******************************LOGIN as MERCHANT******************************
        //Merchant Login Link Click
        WebElement merchantLogin = wd.findElement(By.xpath(".//*[@id='login_link']"));
        merchantLogin.click();
        
        //Enter in Username
        WebElement merchantLogin1 = wd.findElement(By.xpath(".//*[@id='UserName']"));
        merchantLogin1.sendKeys("thomas.boston617@gmail.com");
        
        //Password
        WebElement merchantLogin2 = wd.findElement(By.xpath(".//*[@id='password1']"));
        merchantLogin2.sendKeys("chinese45");
        
        //Click Sign In Button
        WebElement signIn = wd.findElement(By.xpath(".//*[@id='signin']/p[3]/button"));
        signIn.click();
        
        //Create order link
        WebElement createOrderLink = wd.findElement(By.xpath(".//*[@id='fieldWrapper']/div[1]/ul/li[4]/a"));
        createOrderLink.click();
        
      
        
        
        
      //******************************FILL OUT 1st ORDER******************************
        //Change default value from 50 to 500
        WebElement value = wd.findElement(By.xpath(".//*[@id='Amount']"));
        value.clear();
        value.sendKeys("500");
        
        
        //Customer First Name
        WebElement customerFirstName = wd.findElement(By.xpath(".//*[@id='createOrderForm']/fieldset/div/table/tbody/tr[10]/td[1]"));
        customerFirstName.sendKeys("Thomas");
        
        //Customer Last Name
        WebElement customerLastName = wd.findElement(By.xpath(".//*[@id='createOrderForm']/fieldset/div/table/tbody/tr[11]/td[1]"));
        customerLastName.sendKeys("johnson");
        
        //Customer Email Address 
        WebElement customerEmailAddress = wd.findElement(By.xpath(".//*[@id='createOrderForm']/fieldset/div/table/tbody/tr[12]/td[1]"));
        customerEmailAddress.sendKeys("thomashoward313@gmail.com");
        
        //Customer Phone Number  
        WebElement customerPhoneNumber = wd.findElement(By.xpath(".//*[@id='createOrderForm']/fieldset/div/table/tbody/tr[13]/td[1]"));
        customerPhoneNumber.sendKeys("2485551212");
        
        //CLICK CONTINUE BUTTON
        WebElement selectContinueButton = wd.findElement(By.xpath(".//*[@id='createOrder']"));
        selectContinueButton.click();
        
        Thread.sleep(2000);
        
        
        
        //******************************CHECKOUT PAGE******************************
        //Clear the client email address
        WebElement clearEmail = wd.findElement(By.xpath(".//*[@id='form-field-email']"));
        clearEmail.clear();
        clearEmail.sendKeys("thomashoward313@gmail.com");
        
        //Enter in Client phone number
        WebElement enterPhone = wd.findElement(By.xpath(".//*[@id='form-field-mobile']"));
        enterPhone.sendKeys("2485551212");
        
       
        //Zip Code enter AND REPLACE AUTO POPULATED CODE
        WebElement clearZipCode = wd.findElement(By.xpath(".//*[@id='address']"));
        clearZipCode.clear();
        clearZipCode.sendKeys("48382");
        
        //Click SEARCH
        WebElement clickSearch = wd.findElement(By.xpath(".//*[@id='mainForm']/table/tbody/tr/td[2]/button"));
        clickSearch.click();
        
     
        Thread.sleep(3000);  //wait for agent locations to load
        
        //Select a merchant "Pay Here"
        WebElement selectMerchant = wd.findElement(By.xpath(".//*[@id='payment-centers-full']/div[1]/div[1]/a"));
        selectMerchant.click();
        
        Thread.sleep(5000); //wait for payment slip to load
        
        //Click Payment Slip
        WebElement paymentSlip = wd.findElement(By.xpath(".//*[@id='create-payment-slip']"));
        paymentSlip.click();
        
        Thread.sleep(5000); //wait for payment slip to load
        
        //Return to merchant
        WebElement returntoMerchant = wd.findElement(By.xpath(".//*[@id='currentHtml']/div/button[2]"));
        returntoMerchant.click();
        
        
        //******************************2ND ORDER******************************
        //Create order link
        WebElement createOrderLink1 = wd.findElement(By.xpath(".//*[@id='fieldWrapper']/div[1]/ul/li[4]/a"));
        createOrderLink1.click();
        
       //Change default value from 50 to 500
        WebElement value1 = wd.findElement(By.xpath(".//*[@id='Amount']"));
        value1.clear();
        value1.sendKeys("500");
        
        //Customer First Name
         WebElement customerFirstName1 = wd.findElement(By.xpath(".//*[@id='createOrderForm']/fieldset/div/table/tbody/tr[10]/td[1]"));
         customerFirstName1.sendKeys("Thomas");
         
         //Customer Last Name
         WebElement customerLastName1 = wd.findElement(By.xpath(".//*[@id='createOrderForm']/fieldset/div/table/tbody/tr[11]/td[1]"));
         customerLastName1.sendKeys("johnson");
         
         //Customer Email Address 
         WebElement customerEmailAddress1 = wd.findElement(By.xpath(".//*[@id='createOrderForm']/fieldset/div/table/tbody/tr[12]/td[1]"));
         customerEmailAddress1.sendKeys("thomashoward313@gmail.com");
         
         //Customer Phone Number  
         WebElement customerPhoneNumber1 = wd.findElement(By.xpath(".//*[@id='createOrderForm']/fieldset/div/table/tbody/tr[13]/td[1]"));
         customerPhoneNumber1.sendKeys("2485551212");
         
         //CLICK CONTINUE BUTTON
         WebElement selectContinueButton1 = wd.findElement(By.xpath(".//*[@id='createOrder']"));
         selectContinueButton1.click();
         
         Thread.sleep(2000);
     		
         
         //******************************2nd ORDERS CHECKOUT PAGE******************************
         //Clear the client email address
         WebElement clearEmail1 = wd.findElement(By.xpath(".//*[@id='form-field-email']"));
         clearEmail1.clear();
         clearEmail1.sendKeys("thomashoward313@gmail.com");
         
         //Enter in Client phone number
         WebElement enterPhone1 = wd.findElement(By.xpath(".//*[@id='form-field-mobile']"));
         enterPhone1.sendKeys("2485551212");
         
        
         //Zip Code enter AND REPLACE AUTO POPULATED CODE
         WebElement clearZipCode1 = wd.findElement(By.xpath(".//*[@id='address']"));
         clearZipCode1.clear();
         clearZipCode1.sendKeys("48382");
         
         //Click SEARCH
         WebElement clickSearch1 = wd.findElement(By.xpath(".//*[@id='mainForm']/table/tbody/tr/td[2]/button"));
         clickSearch1.click();
         
      
         Thread.sleep(3000);  //wait for agent locations to load
         
         //Select a merchant "Pay Here"
         WebElement selectMerchant1 = wd.findElement(By.xpath(".//*[@id='payment-centers-full']/div[1]/div[1]/a"));
         selectMerchant1.click();
         
         Thread.sleep(5000); //wait for payment slip to load
         
         //Click Payment Slip
         WebElement paymentSlip1 = wd.findElement(By.xpath(".//*[@id='create-payment-slip']"));
         paymentSlip1.click();
         
         Thread.sleep(5000); //wait for payment slip to load
         
         //Return to merchant
         WebElement returntoMerchant1 = wd.findElement(By.xpath(".//*[@id='currentHtml']/div/button[2]"));
         returntoMerchant1.click();
        
         
         
       //******************************3rd ORDER******************************
         //Create order link
         WebElement createOrderLink2 = wd.findElement(By.xpath(".//*[@id='fieldWrapper']/div[1]/ul/li[4]/a"));
         createOrderLink2.click();
         
       //Change default value from 50 to 500
         WebElement value2 = wd.findElement(By.xpath(".//*[@id='Amount']"));
         value2.clear();
         value2.sendKeys("500");
         
         
         //Customer First Name
          WebElement customerFirstName2 = wd.findElement(By.xpath(".//*[@id='createOrderForm']/fieldset/div/table/tbody/tr[10]/td[1]"));
          customerFirstName2.sendKeys("Thomas");
          
          //Customer Last Name
          WebElement customerLastName2 = wd.findElement(By.xpath(".//*[@id='createOrderForm']/fieldset/div/table/tbody/tr[11]/td[1]"));
          customerLastName2.sendKeys("johnson");
          
          //Customer Email Address 
          WebElement customerEmailAddress2 = wd.findElement(By.xpath(".//*[@id='createOrderForm']/fieldset/div/table/tbody/tr[12]/td[1]"));
          customerEmailAddress2.sendKeys("thomashoward313@gmail.com");
          
          //Customer Phone Number  
          WebElement customerPhoneNumber2 = wd.findElement(By.xpath(".//*[@id='createOrderForm']/fieldset/div/table/tbody/tr[13]/td[1]"));
          customerPhoneNumber2.sendKeys("2485551212");
          
          //CLICK CONTINUE BUTTON
          WebElement selectContinueButton2 = wd.findElement(By.xpath(".//*[@id='createOrder']"));
          selectContinueButton2.click();
          
          Thread.sleep(2000);
      		
          
          //******************************3rd ORDERS CHECKOUT PAGE******************************
          //Clear the client email address
          WebElement clearEmail2 = wd.findElement(By.xpath(".//*[@id='form-field-email']"));
          clearEmail2.clear();
          clearEmail2.sendKeys("thomashoward313@gmail.com");
          
          //Enter in Client phone number
          WebElement enterPhone2 = wd.findElement(By.xpath(".//*[@id='form-field-mobile']"));
          enterPhone2.sendKeys("2485551212");
          
         
          //Zip Code enter AND REPLACE AUTO POPULATED CODE
          WebElement clearZipCode2 = wd.findElement(By.xpath(".//*[@id='address']"));
          clearZipCode2.clear();
          clearZipCode2.sendKeys("48382");
          
          //Click SEARCH
          WebElement clickSearch2 = wd.findElement(By.xpath(".//*[@id='mainForm']/table/tbody/tr/td[2]/button"));
          clickSearch2.click();
          
       
          Thread.sleep(3000);  //wait for agent locations to load
          
          //Select a merchant "Pay Here"
          WebElement selectMerchant2 = wd.findElement(By.xpath(".//*[@id='payment-centers-full']/div[1]/div[1]/a"));
          selectMerchant2.click();
          
          Thread.sleep(5000); //wait for payment slip to load
          
          //Click Payment Slip
          WebElement paymentSlip2 = wd.findElement(By.xpath(".//*[@id='create-payment-slip']"));
          paymentSlip2.click();
          
          Thread.sleep(5000); //wait for payment slip to load
          
          //Return to merchant
          WebElement returntoMerchant2 = wd.findElement(By.xpath(".//*[@id='currentHtml']/div/button[2]"));
          returntoMerchant2.click();
         
        
          //******************************4th ORDER******************************
          //Create order link
          WebElement createOrderLink3 = wd.findElement(By.xpath(".//*[@id='fieldWrapper']/div[1]/ul/li[4]/a"));
          createOrderLink3.click();
          
          //Change default value from 50 to 500
          WebElement value3 = wd.findElement(By.xpath(".//*[@id='Amount']"));
          value3.clear();
          value3.sendKeys("500");
          
          //Customer First Name
           WebElement customerFirstName3 = wd.findElement(By.xpath(".//*[@id='createOrderForm']/fieldset/div/table/tbody/tr[10]/td[1]"));
           customerFirstName3.sendKeys("Thomas");
           
           //Customer Last Name
           WebElement customerLastName3 = wd.findElement(By.xpath(".//*[@id='createOrderForm']/fieldset/div/table/tbody/tr[11]/td[1]"));
           customerLastName3.sendKeys("johnson");
           
           //Customer Email Address 
           WebElement customerEmailAddress3 = wd.findElement(By.xpath(".//*[@id='createOrderForm']/fieldset/div/table/tbody/tr[12]/td[1]"));
           customerEmailAddress3.sendKeys("thomashoward313@gmail.com");
           
           //Customer Phone Number  
           WebElement customerPhoneNumber3 = wd.findElement(By.xpath(".//*[@id='createOrderForm']/fieldset/div/table/tbody/tr[13]/td[1]"));
           customerPhoneNumber3.sendKeys("2485551212");
           
           //CLICK CONTINUE BUTTON
           WebElement selectContinueButton3 = wd.findElement(By.xpath(".//*[@id='createOrder']"));
           selectContinueButton3.click();
           
           Thread.sleep(2000);
       		
           
           //******************************4th ORDERS CHECKOUT PAGE******************************
           //Clear the client email address
           WebElement clearEmail4 = wd.findElement(By.xpath(".//*[@id='form-field-email']"));
           clearEmail4.clear();
           clearEmail4.sendKeys("thomashoward313@gmail.com");
           
           //Enter in Client phone number
           WebElement enterPhone4 = wd.findElement(By.xpath(".//*[@id='form-field-mobile']"));
           enterPhone4.sendKeys("2485551212");
           
          
           //Zip Code enter AND REPLACE AUTO POPULATED CODE
           WebElement clearZipCode4 = wd.findElement(By.xpath(".//*[@id='address']"));
           clearZipCode4.clear();
           clearZipCode4.sendKeys("48382");
           
           //Click SEARCH
           WebElement clickSearch4 = wd.findElement(By.xpath(".//*[@id='mainForm']/table/tbody/tr/td[2]/button"));
           clickSearch4.click();
           
        
           Thread.sleep(3000);  //wait for agent locations to load
           
           //Select a merchant "Pay Here"
           WebElement selectMerchant4 = wd.findElement(By.xpath(".//*[@id='payment-centers-full']/div[1]/div[1]/a"));
           selectMerchant4.click();
           
           Thread.sleep(2000); //wait for payment slip to load
           
           
           //back button 
           wd.navigate().back();
           Thread.sleep(3000);
           //back to order page
           wd.navigate().back();
           
          
           
           
           //******************************5th ORDER******************************
             //Create order link
             WebElement createOrderLink4 = wd.findElement(By.xpath(".//*[@id='fieldWrapper']/div[1]/ul/li[4]/a"));
             createOrderLink4.click();
             
             //Customer First Name
              WebElement customerFirstName4 = wd.findElement(By.xpath(".//*[@id='createOrderForm']/fieldset/div/table/tbody/tr[10]/td[1]"));
              customerFirstName4.sendKeys("Thomas");
              
              //Customer Last Name
              WebElement customerLastName4 = wd.findElement(By.xpath(".//*[@id='createOrderForm']/fieldset/div/table/tbody/tr[11]/td[1]"));
              customerLastName4.sendKeys("johnson");
              
              //Customer Email Address 
              WebElement customerEmailAddress4 = wd.findElement(By.xpath(".//*[@id='createOrderForm']/fieldset/div/table/tbody/tr[12]/td[1]"));
              customerEmailAddress4.sendKeys("thomashoward313@gmail.com");
              
              //Customer Phone Number  
              WebElement customerPhoneNumber4 = wd.findElement(By.xpath(".//*[@id='createOrderForm']/fieldset/div/table/tbody/tr[13]/td[1]"));
              customerPhoneNumber4.sendKeys("2485551212");
              
              //CLICK CONTINUE BUTTON
              WebElement selectContinueButton4 = wd.findElement(By.xpath(".//*[@id='createOrder']"));
              selectContinueButton4.click();
              
              Thread.sleep(2000);
              
              //Read error about daily limits
              WebElement dailyLimitError = wd.findElement(By.xpath(".//*[@id='fieldWrapper']/div/h2"));
              dailyLimitError.isDisplayed();
              
              
          		
              
//              //******************************5th ORDERS CHECKOUT PAGE******************************
              //Clear the client email address
              WebElement clearEmail5 = wd.findElement(By.xpath(".//*[@id='form-field-email']"));
              clearEmail5.clear();
              clearEmail5.sendKeys("thomashoward313@gmail.com");
              
              //Enter in Client phone number
              WebElement enterPhone5 = wd.findElement(By.xpath(".//*[@id='form-field-mobile']"));
              enterPhone5.sendKeys("2485551212");
              
             
              //Zip Code enter AND REPLACE AUTO POPULATED CODE
              WebElement clearZipCode5 = wd.findElement(By.xpath(".//*[@id='address']"));
              clearZipCode5.clear();
              clearZipCode5.sendKeys("48382");
              
              //Click SEARCH
              WebElement clickSearch5 = wd.findElement(By.xpath(".//*[@id='mainForm']/table/tbody/tr/td[2]/button"));
              clickSearch5.click();
              
           
              Thread.sleep(3000);  //wait for agent locations to load
              
              //Select a merchant "Pay Here"
              WebElement selectMerchant5 = wd.findElement(By.xpath(".//*[@id='payment-centers-full']/div[1]/div[1]/a"));
              selectMerchant5.click();
              
              Thread.sleep(5000); //wait for payment slip to load
              
              //Click Payment Slip
              WebElement paymentSlip5 = wd.findElement(By.xpath(".//*[@id='create-payment-slip']"));
              paymentSlip5.click();
          
              
              
           
    wd.close();
        
	}
}
        
        



      
        
        
        
        
   