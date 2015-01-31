package Merchant_CreateOrder;

//https://app.asana.com/0/4469896089852/4472230362115

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestDailyLimits {

	public static void main(String[] args) throws Exception {
        FirefoxDriver wd;
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("https://staging.cashpayment.com/");
        
        
        //***********************Merchant Login Information*************************

        
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
        WebElement createOrderLink = wd.findElement(By.xpath(".//*[@id='fieldWrapper']/div[1]/ul/li[5]/a"));
        createOrderLink.click();
        
      
        
        
        
      //******************************FILL OUT ORDER******************************
        //Change default value from 50 to 500
        WebElement value = wd.findElement(By.xpath(".//*[@id='Amount']"));
        value.clear();
        value.sendKeys("500");
        
        
        //Customer First Name
        WebElement customerFirstName = wd.findElement(By.xpath(".//*[@id='createOrderForm']/fieldset/div/table/tbody/tr[10]/td[1]"));
        customerFirstName.sendKeys("Thomas");
        
        //Customer Last Name
        WebElement customerLastName = wd.findElement(By.xpath(".//*[@id='createOrderForm']/fieldset/div/table/tbody/tr[11]/td[1]"));
        customerLastName.sendKeys("Chinook");
        
        //Customer Email Address 
        WebElement customerEmailAddress = wd.findElement(By.xpath(".//*[@id='createOrderForm']/fieldset/div/table/tbody/tr[12]/td[1]"));
        customerEmailAddress.sendKeys("tommyxxxxxxx334@gmail.com");
        
        //Customer Phone Number  
        WebElement customerPhoneNumber = wd.findElement(By.xpath(".//*[@id='createOrderForm']/fieldset/div/table/tbody/tr[13]/td[1]"));
        customerPhoneNumber.sendKeys("2221224444");
        
        //CLICK CONTINUE BUTTON
        WebElement selectContinueButton = wd.findElement(By.xpath(".//*[@id='createOrder']"));
        selectContinueButton.click();
        
        Thread.sleep(2000);
        
        
        
        //******************************CHECKOUT PAGE******************************
        //Clear the client email address
        WebElement clearEmail = wd.findElement(By.xpath(".//*[@id='form-field-email']"));
        clearEmail.clear();
        clearEmail.sendKeys("tommyxxxxxxx334@gmail.com");
        
        //Enter in Client phone number
        WebElement enterPhone = wd.findElement(By.xpath(".//*[@id='form-field-mobile']"));
        enterPhone.sendKeys("2221224444");
        
       
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
        WebElement createOrderLink1 = wd.findElement(By.xpath(".//*[@id='fieldWrapper']/div[1]/ul/li[5]/a"));
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
         customerLastName1.sendKeys("Chinook");
         
         //Customer Email Address 
         WebElement customerEmailAddress1 = wd.findElement(By.xpath(".//*[@id='createOrderForm']/fieldset/div/table/tbody/tr[12]/td[1]"));
         customerEmailAddress1.sendKeys("tommyxxxxxxx334@gmail.com");
         
         //Customer Phone Number  
         WebElement customerPhoneNumber1 = wd.findElement(By.xpath(".//*[@id='createOrderForm']/fieldset/div/table/tbody/tr[13]/td[1]"));
         customerPhoneNumber1.sendKeys("2221224444");
         
         //CLICK CONTINUE BUTTON
         WebElement selectContinueButton1 = wd.findElement(By.xpath(".//*[@id='createOrder']"));
         selectContinueButton1.click();
         
         Thread.sleep(2000);
     		
         
         //******************************2nd ORDERS CHECKOUT PAGE******************************
         //Clear the client email address
         WebElement clearEmail1 = wd.findElement(By.xpath(".//*[@id='form-field-email']"));
         clearEmail1.clear();
         clearEmail1.sendKeys("tommyxxxxxxx334@gmail.com");
         
         //Enter in Client phone number
         WebElement enterPhone1 = wd.findElement(By.xpath(".//*[@id='form-field-mobile']"));
         enterPhone1.sendKeys("2221224444");
         
        
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
         WebElement createOrderLink2 = wd.findElement(By.xpath(".//*[@id='fieldWrapper']/div[1]/ul/li[5]/a"));
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
          customerLastName2.sendKeys("Chinook");
          
          //Customer Email Address 
          WebElement customerEmailAddress2 = wd.findElement(By.xpath(".//*[@id='createOrderForm']/fieldset/div/table/tbody/tr[12]/td[1]"));
          customerEmailAddress2.sendKeys("tommyxxxxxxx334@gmail.com");
          
          //Customer Phone Number  
          WebElement customerPhoneNumber2 = wd.findElement(By.xpath(".//*[@id='createOrderForm']/fieldset/div/table/tbody/tr[13]/td[1]"));
          customerPhoneNumber2.sendKeys("2221224444");
          
          //CLICK CONTINUE BUTTON
          WebElement selectContinueButton2 = wd.findElement(By.xpath(".//*[@id='createOrder']"));
          selectContinueButton2.click();
          
          Thread.sleep(2000);
      		
          
          //******************************3rd ORDERS CHECKOUT PAGE******************************
          //Clear the client email address
          WebElement clearEmail2 = wd.findElement(By.xpath(".//*[@id='form-field-email']"));
          clearEmail2.clear();
          clearEmail2.sendKeys("tommyxxxxxxx334@gmail.com");
          
          //Enter in Client phone number
          WebElement enterPhone2 = wd.findElement(By.xpath(".//*[@id='form-field-mobile']"));
          enterPhone2.sendKeys("2221224444");
          
         
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
          WebElement createOrderLink3 = wd.findElement(By.xpath(".//*[@id='fieldWrapper']/div[1]/ul/li[5]/a"));
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
           customerLastName3.sendKeys("Chinook");
           
           //Customer Email Address 
           WebElement customerEmailAddress3 = wd.findElement(By.xpath(".//*[@id='createOrderForm']/fieldset/div/table/tbody/tr[12]/td[1]"));
           customerEmailAddress3.sendKeys("tommyxxxxxxx334@gmail.com");
           
           //Customer Phone Number  
           WebElement customerPhoneNumber3 = wd.findElement(By.xpath(".//*[@id='createOrderForm']/fieldset/div/table/tbody/tr[13]/td[1]"));
           customerPhoneNumber3.sendKeys("2221224444");
           
           //CLICK CONTINUE BUTTON
           WebElement selectContinueButton3 = wd.findElement(By.xpath(".//*[@id='createOrder']"));
           selectContinueButton3.click();
           
           Thread.sleep(2000);
       		
           
           //******************************4th ORDERS CHECKOUT PAGE******************************
           //Clear the client email address
           WebElement clearEmail4 = wd.findElement(By.xpath(".//*[@id='form-field-email']"));
           clearEmail4.clear();
           clearEmail4.sendKeys("tommyxxxxxxx334@gmail.com");
           
           //Enter in Client phone number
           WebElement enterPhone4 = wd.findElement(By.xpath(".//*[@id='form-field-mobile']"));
           enterPhone4.sendKeys("2221224444");
           
          
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
           
           Thread.sleep(5000); //wait for payment slip to load
           
           //Click Payment Slip
           WebElement paymentSlip4 = wd.findElement(By.xpath(".//*[@id='create-payment-slip']"));
           paymentSlip4.click();
           
           Thread.sleep(5000); //wait for payment slip to load
 
           //Read error about daily limits
           WebElement dailyLimitError = wd.findElement(By.xpath(".//*[@id='currentHtml']/h3"));
           dailyLimitError.isDisplayed();
              
              
          
              
           
    wd.close();
        
	}
}
        
        



      
        
        
        
        
   