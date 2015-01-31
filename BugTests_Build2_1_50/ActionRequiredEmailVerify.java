package BugTests_Build2_1_50;
//this test is finished
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//https://app.asana.com/0/4469896089852/4939851296559

//Create 4 orders, on the 4th order, see if an email is created saying action is required
public class ActionRequiredEmailVerify {

		
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
	        //merchantdemo
	        //qazwsx1234
	        
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
	        delete50.sendKeys("500.00");
	        
	        
	        //*************************Create 1st order *************************
	        //Customer First Name
	        WebElement customerFirstName = wd.findElement(By.xpath(".//*[@id='CustomerFirstName']"));
	        customerFirstName.sendKeys("Thomas");
	        
	        //Customer Last Name
	        WebElement customerLastName = wd.findElement(By.xpath(".//*[@id='CustomerLastName']"));
	        customerLastName.sendKeys("Tester");
	        
	        //Customer Email Address 
	        WebElement customerEmailAddress = wd.findElement(By.xpath(".//*[@id='CustomerEmailAddress']"));
	        customerEmailAddress.sendKeys("thomastrafik25@gmail.com");
	        //THIS SHOULD POPULATE AUTOMATICALLY ON ORDER PAGE
	        
	        //Customer Phone Number  
	        WebElement customerPhoneNumber = wd.findElement(By.xpath(".//*[@id='CustomerPhoneNumber']"));
	        customerPhoneNumber.sendKeys("2065552222");
	        //THIS SHOULD POPULATE AUTOMATICALLY ON ORDER PAGE
	        
	        //Click the CONTINUE button 
	         WebElement continueButton = wd.findElement(By.xpath(".//*[@id='createOrder']"));
	         continueButton.click();
	         
	         
	         //*************************1st checkout PAGE*************************
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
	        
	         
	         
	         
	         //*************************2nd order creation*************************
		        //Customer First Name
		        WebElement var1 = wd.findElement(By.xpath(".//*[@id='CustomerFirstName']"));
		        var1.sendKeys("Thomas");
		        
		        //Customer Last Name
		        WebElement var2 = wd.findElement(By.xpath(".//*[@id='CustomerLastName']"));
		        var2.sendKeys("Tester");
		        
		        //Customer Email Address 
		        WebElement var3 = wd.findElement(By.xpath(".//*[@id='CustomerEmailAddress']"));
		        var3.sendKeys("thomastrafik25@gmail.com");
		        //THIS SHOULD POPULATE AUTOMATICALLY ON ORDER PAGE
		        
		        //Customer Phone Number  
		        WebElement var4 = wd.findElement(By.xpath(".//*[@id='CustomerPhoneNumber']"));
		        var4.sendKeys("2065552222");
		        //THIS SHOULD POPULATE AUTOMATICALLY ON ORDER PAGE
		        
		        //Click the CONTINUE button 
		         WebElement var5 = wd.findElement(By.xpath(".//*[@id='createOrder']"));
		         var5.click();
		         
		         
		         //*************************checkout PAGE*************************
		         //Zip Code enter  .//*[@id='address']
		         WebElement var6 = wd.findElement(By.xpath(".//*[@id='address']"));
		         var6.clear();
		         var6.sendKeys("48382");
		         
		         //Click SEARCH button .//*[@id='mainForm']/table/tbody/tr/td[2]/button
		         WebElement var7 = wd.findElement(By.xpath(".//*[@id='mainForm']/table/tbody/tr/td[2]/button"));
		         var7.click();
		        
		         //CLICK PAY HERE .//*[@id='payment-centers-full']/div[1]/div[1]/a
		         WebElement var8 = wd.findElement(By.xpath(".//*[@id='payment-centers-full']/div[1]/div[1]/a"));
		         var8.click();
		        
		        //CREATE PAYMENT SLIP DISPLAYED .//*[@id='create-payment-slip']
		         WebElement var9 = wd.findElement(By.xpath(".//*[@id='create-payment-slip']"));
		         var9.isDisplayed();
		        
		        //CLICK PAYMENT SLIP DISPLAYED .//*[@id='create-payment-slip']
		         WebElement var10 = wd.findElement(By.xpath(".//*[@id='create-payment-slip']"));
		         var10.click();
		         
		         //Click return to merchant .//*[@id='currentHtml']/div/button[2]
		         WebElement var11 = wd.findElement(By.xpath(".//*[@id='currentHtml']/div/button[2]"));
		         var11.click();
	         
	         
		         
		       //*************************3rd order creation*************************
			        //Customer First Name
			        WebElement var111 = wd.findElement(By.xpath(".//*[@id='CustomerFirstName']"));
			        var111.sendKeys("Thomas");
			        
			        //Customer Last Name
			        WebElement var21 = wd.findElement(By.xpath(".//*[@id='CustomerLastName']"));
			        var21.sendKeys("Tester");
			        
			        //Customer Email Address 
			        WebElement var31 = wd.findElement(By.xpath(".//*[@id='CustomerEmailAddress']"));
			        var31.sendKeys("thomastrafik25@gmail.com");
			        //THIS SHOULD POPULATE AUTOMATICALLY ON ORDER PAGE
			        
			        //Customer Phone Number  
			        WebElement var41 = wd.findElement(By.xpath(".//*[@id='CustomerPhoneNumber']"));
			        var41.sendKeys("2065552222");
			        //THIS SHOULD POPULATE AUTOMATICALLY ON ORDER PAGE
			        
			        //Click the CONTINUE button 
			         WebElement var51 = wd.findElement(By.xpath(".//*[@id='createOrder']"));
			         var51.click();
			         
			         
			         //*************************checkout PAGE*************************
			         //Zip Code enter  .//*[@id='address']
			         WebElement var61 = wd.findElement(By.xpath(".//*[@id='address']"));
			         var61.clear();
			         var61.sendKeys("48382");
			         
			         //Click SEARCH button .//*[@id='mainForm']/table/tbody/tr/td[2]/button
			         WebElement var71 = wd.findElement(By.xpath(".//*[@id='mainForm']/table/tbody/tr/td[2]/button"));
			         var71.click();
			        
			         //CLICK PAY HERE .//*[@id='payment-centers-full']/div[1]/div[1]/a
			         WebElement var81 = wd.findElement(By.xpath(".//*[@id='payment-centers-full']/div[1]/div[1]/a"));
			         var81.click();
			        
			        //CREATE PAYMENT SLIP DISPLAYED .//*[@id='create-payment-slip']
			         WebElement var91 = wd.findElement(By.xpath(".//*[@id='create-payment-slip']"));
			         var91.isDisplayed();
			        
			        //CLICK PAYMENT SLIP DISPLAYED .//*[@id='create-payment-slip']
			         WebElement var101 = wd.findElement(By.xpath(".//*[@id='create-payment-slip']"));
			         var101.click();
			         
			         //Click return to merchant .//*[@id='currentHtml']/div/button[2]
			         WebElement var112 = wd.findElement(By.xpath(".//*[@id='currentHtml']/div/button[2]"));
			         var112.click();
		         
			         
			         
			         
			         //*************************4th order creation*************************
				        //Customer First Name
				        WebElement var1111 = wd.findElement(By.xpath(".//*[@id='CustomerFirstName']"));
				        var1111.sendKeys("Thomas");
				        
				        //Customer Last Name
				        WebElement var211 = wd.findElement(By.xpath(".//*[@id='CustomerLastName']"));
				        var211.sendKeys("Tester");
				        
				        //Customer Email Address 
				        WebElement var311 = wd.findElement(By.xpath(".//*[@id='CustomerEmailAddress']"));
				        var311.sendKeys("thomastrafik25@gmail.com");
				        //THIS SHOULD POPULATE AUTOMATICALLY ON ORDER PAGE
				        
				        //Customer Phone Number  
				        WebElement var411 = wd.findElement(By.xpath(".//*[@id='CustomerPhoneNumber']"));
				        var411.sendKeys("2065552222");
				        //THIS SHOULD POPULATE AUTOMATICALLY ON ORDER PAGE
				        
				        //Click the CONTINUE button 
				         WebElement var511 = wd.findElement(By.xpath(".//*[@id='createOrder']"));
				         var511.click();
				         
				         
				         //*************************checkout PAGE*************************
				         //Zip Code enter  .//*[@id='address']
				         WebElement var611 = wd.findElement(By.xpath(".//*[@id='address']"));
				         var611.clear();
				         var611.sendKeys("48382");
				         
				         //Click SEARCH button .//*[@id='mainForm']/table/tbody/tr/td[2]/button
				         WebElement var711 = wd.findElement(By.xpath(".//*[@id='mainForm']/table/tbody/tr/td[2]/button"));
				         var711.click();
				        
				         //CLICK PAY HERE .//*[@id='payment-centers-full']/div[1]/div[1]/a
				         WebElement var811 = wd.findElement(By.xpath(".//*[@id='payment-centers-full']/div[1]/div[1]/a"));
				         var811.click();
				        
				        //CREATE PAYMENT SLIP DISPLAYED .//*[@id='create-payment-slip']
				         WebElement var911 = wd.findElement(By.xpath(".//*[@id='create-payment-slip']"));
				         var911.isDisplayed();
				        
				        //CLICK PAYMENT SLIP DISPLAYED .//*[@id='create-payment-slip']
				         WebElement var1011 = wd.findElement(By.xpath(".//*[@id='create-payment-slip']"));
				         var1011.click();
				         
				         //Click return to merchant .//*[@id='currentHtml']/div/button[2]
				         WebElement var11111 = wd.findElement(By.xpath(".//*[@id='currentHtml']/div/button[2]"));
				         var11111.click();
		         
		         
		         
		         
		         //You must manually check to see if the email is available. It takes 60 minutes
	         //*************************GMAIL NAVIGATE*************************

	         
	         wd.get("https://www.gmail.com/");
	         
	         //Username Field
	         WebElement username = wd.findElement(By.xpath(".//*[@id='Email']"));
	         username.sendKeys("thomastrafik25");
	         
	         //Password Field
	         WebElement password = wd.findElement(By.xpath(".//*[@id='Passwd']"));
	         password.sendKeys("tiesto25");
	         
	         //Click Signin
	         WebElement signin = wd.findElement(By.xpath(".//*[@id='signIn']"));
	         signin.click();
	         
	         
	 
	         
	         
	         
	        
	        
	        
	        wd.close();
	        
	}

}
