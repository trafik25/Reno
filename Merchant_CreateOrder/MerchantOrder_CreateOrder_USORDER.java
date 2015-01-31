package Merchant_CreateOrder;
//This is a crucial POST build test   
//test is complete
//TICKET https://app.asana.com/0/4469896089852/4862265743484

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class MerchantOrder_CreateOrder_USORDER {

	public static void main(String[] args) throws Exception {
        FirefoxDriver wd;
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("https://staging.cashpayment.com/");
        //change URL for live
        //("https://www.cashpayment.com/")
        //merchantdemo
        //qazwsx1234

	
        //**************************************LOGIN***************************
        //Merchant Login Link Click
        WebElement merchantLogin = wd.findElement(By.xpath(".//*[@id='login_link']"));
        merchantLogin.click();
        
        //Username
        WebElement merchantLogin1 = wd.findElement(By.xpath(".//*[@id='UserName']"));
        merchantLogin1.sendKeys("thomas.boston617@gmail.com");
        
        //Password
        WebElement merchantLogin2 = wd.findElement(By.xpath(".//*[@id='password1']"));
        merchantLogin2.sendKeys("chinese45");
        
        //Click Sign In Button
        WebElement signIn = wd.findElement(By.xpath(".//*[@id='signin']/p[3]/button"));
        signIn.click();
        
        
        
        
        //******************************************CREATE ORDER PAGE**************************************
        //Create order link
        WebElement createOrderLink = wd.findElement(By.xpath(".//*[@id='fieldWrapper']/div[1]/ul/li[5]/a"));
        createOrderLink.click();
       
        //auto-filled field change value from $50.00 to $a value
        WebElement delete50 = wd.findElement(By.xpath(".//*[@id='Amount']"));
        delete50.clear();
        delete50.sendKeys("10.00");
        
        
        //*************************OPTIONAL FIELDS*************************
        //Customer First Name
        WebElement customerFirstName = wd.findElement(By.xpath(".//*[@id='CustomerFirstName']"));
        customerFirstName.sendKeys("Thomas");
        
        //Customer Last Name
        WebElement customerLastName = wd.findElement(By.xpath(".//*[@id='CustomerLastName']"));
        customerLastName.sendKeys("Tester");
        
        //Customer Email Address 
        WebElement customerEmailAddress = wd.findElement(By.xpath(".//*[@id='CustomerEmailAddress']"));
        customerEmailAddress.sendKeys("thomashoward313@gmail.com");
        
        //Customer Phone Number  
        WebElement customerPhoneNumber = wd.findElement(By.xpath(".//*[@id='CustomerPhoneNumber']"));
        customerPhoneNumber.sendKeys("2065552222");
        
        //Click the CONTINUE button
         WebElement continueButton = wd.findElement(By.xpath(".//*[@id='createOrder']"));
         continueButton.click();
         
         

         //US ORDER, US orders have a map that appears, if the map appears its a US order
         //*************************CHECKOUT PAGE*************************
         WebElement map = wd.findElement(By.xpath(".//*[@id='address']"));
         map.isDisplayed();
        
         //*************************checkout PAGE*************************
         //Zip Code enter  .//*[@id='address']
         WebElement clearZipCode = wd.findElement(By.xpath(".//*[@id='address']"));
         clearZipCode.clear();
         clearZipCode.sendKeys("48382");
         
         //Click SEARCH button .//*[@id='mainForm']/table/tbody/tr/td[2]/button
         WebElement clickSearch = wd.findElement(By.xpath(".//*[@id='mainForm']/table/tbody/tr/td[2]/button"));
         clickSearch.click();
        
         //CLICK PAY HERE .//*[@id='payment-centers-full']/div[1]/div[1]/a
         WebElement payHere = wd.findElement(By.xpath(".//*[@id='payment-centers-full']/div[1]/div[1]/a"));
         payHere.click();
        
        //CREATE PAYMENT SLIP DISPLAYED .//*[@id='create-payment-slip']
         WebElement paymentSlip = wd.findElement(By.xpath(".//*[@id='create-payment-slip']"));
         paymentSlip.isDisplayed();
        
        //CLICK PAYMENT SLIP DISPLAYED .//*[@id='create-payment-slip']
         WebElement clickpaymentSlip = wd.findElement(By.xpath(".//*[@id='create-payment-slip']"));
         clickpaymentSlip.click();
         
         //Click return to merchant .//*[@id='currentHtml']/div/button[2]
         WebElement returnMerchant = wd.findElement(By.xpath(".//*[@id='currentHtml']/div/button[2]"));
         returnMerchant.click();
        
         
         
         
        
        wd.close();
        
	}
}
        
        
        
        