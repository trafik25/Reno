package BugTests_Build2_1_50;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//https://app.asana.com/0/2454657366642/5099028154995
public class PageNotFoundEbanx {

	
	public static void main(String[] args) throws Exception {
        FirefoxDriver wd;
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("https://www.cashpayment.com/");
        //change URL for live
        //("https://www.cashpayment.com/")
        //merchantdemo
        //qazwsx1234
        //Staging https://staging.cashpayment.com/

        //**************************************LOGIN***************************
        //Merchant Login Link Click
        WebElement merchantLogin = wd.findElement(By.xpath(".//*[@id='login_link']"));
        merchantLogin.click();
        
        //Username
        WebElement merchantLogin1 = wd.findElement(By.xpath(".//*[@id='UserName']"));
        merchantLogin1.sendKeys("merchantdemo");
        //merchantdemo
        //qazwsx1234
        
        //Password
        WebElement merchantLogin2 = wd.findElement(By.xpath(".//*[@id='password1']"));
        merchantLogin2.sendKeys("qazwsx1234");
        
        
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
        delete50.sendKeys("1.00");
        
        
        //*************************Create order fields*************************
        //Customer First Name
        WebElement customerFirstName = wd.findElement(By.xpath(".//*[@id='CustomerFirstName']"));
        customerFirstName.sendKeys("Thomas");
        
        //Customer Last Name
        WebElement customerLastName = wd.findElement(By.xpath(".//*[@id='CustomerLastName']"));
        customerLastName.sendKeys("Tester");
        
        //Customer Email Address 
        WebElement customerEmailAddress = wd.findElement(By.xpath(".//*[@id='CustomerEmailAddress']"));
        customerEmailAddress.sendKeys("thomashoward313@gmail.com");
        //THIS SHOULD POPULATE AUTOMATICALLY ON ORDER PAGE
        
        //Customer Phone Number  
        WebElement customerPhoneNumber = wd.findElement(By.xpath(".//*[@id='CustomerPhoneNumber']"));
        customerPhoneNumber.sendKeys("0003434444");
        //THIS SHOULD POPULATE AUTOMATICALLY ON ORDER PAGE
        
        //Select BRAZIL as country 
        WebElement selectBrazil = wd.findElement(By.xpath(".//*[@id='CustomerPayCountry']"));
        selectBrazil.sendKeys("Brazil");
        //***********Check Country, it came up Russia for some reason
      
        //Click the CONTINUE button 
         WebElement continueButton = wd.findElement(By.xpath(".//*[@id='createOrder']"));
         continueButton.click();	
         
         //*************************Checkout to Ebanx*************************
         //Click Ebanx Payment Center button
         WebElement selectEbanx = wd.findElement(By.xpath(".//*[@id='payment-centers']/a[2]"));
         selectEbanx.click();
         
         
         //CEP .//*[@id='ZipCode']
         WebElement cep = wd.findElement(By.xpath(".//*[@id='ZipCode']"));
         cep.sendKeys("81320-000");
         
         //Address .//*[@id='Address']
         WebElement address = wd.findElement(By.xpath(".//*[@id='Address']"));
         address.sendKeys("Rio Road");
         
         //Street# .//*[@id='StreetNumber']
         WebElement streetNum = wd.findElement(By.xpath(".//*[@id='StreetNumber']"));
         streetNum.sendKeys("1222");
         
         //CPF .//*[@id='CPF']
         WebElement cpf = wd.findElement(By.xpath(".//*[@id='CPF']"));
         cpf.sendKeys("177.384.381-85");
         
         
         //Click Submit .//*[@id='mainForm']/div[2]/input
         WebElement submitForm = wd.findElement(By.xpath(".//*[@id='mainForm']/div[2]/input"));
         submitForm.click();
         
         
		
         //*************************Login to Ebanx*************************
         //Redirected to Ebanx
         //Enter DOB  .//*[@id='sac_birth_date']
         WebElement dob = wd.findElement(By.xpath(".//*[@id='sac_birth_date']"));
         dob.sendKeys("12/12/1979");
         
         //Click Continue .//*[@id='mainBox']/table/tbody/tr[16]/td/button[1]
         WebElement submitButton = wd.findElement(By.xpath(".//*[@id='mainBox']/table/tbody/tr[16]/td/button[1]"));
         submitButton.click();
         
         Thread.sleep(3000);
         
         //Return to merchant  .//*[@id='wrapper']/div[3]/button[2]
         WebElement returntoMerchant = wd.findElement(By.xpath(".//*[@id='wrapper']/div[3]/button[2]"));
         returntoMerchant.click();
         
         //Boleto Visible  .//*[@id='wrapper']/div[3]/img
	      assertTrue(wd.getPageSource().contains("Boleto"));

           
         
         
	}

	private static void assertTrue(boolean contains) {
		// TODO Auto-generated method stub
		
	}

}
