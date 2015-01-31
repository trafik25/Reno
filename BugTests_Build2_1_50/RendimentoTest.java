package BugTests_Build2_1_50;
//https://app.asana.com/0/2454657366642/2695284387964
//Rendimento Information CPF: 39114406934
//RG: 30614471-8
//Passport: 00
//Name: Bill
//LastName: Gates
//Address: Can be anything
//City: any
//State: any
//Country: Brasil
//Telephone: 76767676767676


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

	public class RendimentoTest {

		public static void main(String[] args) throws Exception {
	        FirefoxDriver wd;
	        wd = new FirefoxDriver();
	        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	        //wd.get("https://www.cashpayment.com/");
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
	        merchantLogin1.sendKeys("thomas.boston617@gmail.com	");
	        
	        //Password
	        WebElement merchantLogin2 = wd.findElement(By.xpath(".//*[@id='password1']"));
	        merchantLogin2.sendKeys("chinese45");
	        
	        //Click Sign In Button
	        WebElement signIn = wd.findElement(By.xpath(".//*[@id='signin']/p[3]/button"));
	        signIn.click();
	        
	        
	        
	        
	        //******************************************CREATE ORDER PAGE**************************************
	        //Create order link
	        WebElement createOrderLink = wd.findElement(By.xpath(".//*[@id='fieldWrapper']/div[1]/ul/li[4]/a"));
	        createOrderLink.click();
	       
	        //auto-filled field change value from $50.00 to $a value
	        WebElement delete50 = wd.findElement(By.xpath(".//*[@id='Amount']"));
	        delete50.clear();
	        delete50.sendKeys("10.00");
	
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
	
		      //*************************Checkout Page*************************
	         //Choose Rendimento .//*[@id='payment-centers']/a[1]
	         WebElement rendimento = wd.findElement(By.xpath(".//*[@id='payment-centers']/a[1]"));
	         rendimento.click();
	         
	         Thread.sleep(4000);
	         
	         //Enter City .//*[@id='City']
	         WebElement enterCity = wd.findElement(By.xpath(".//*[@id='City']"));
		     enterCity.sendKeys("Rio");
	         
	         //Enter State .//*[@id='State']
		     WebElement enterState = wd.findElement(By.xpath(".//*[@id='State']"));
		     enterState.sendKeys("SC");
	         
		     //CPF .//*[@id='CPF']
	         WebElement cpf = wd.findElement(By.xpath(".//*[@id='CPF']"));
	         cpf.sendKeys("39114406934");
	         
	         
	         //Enter in your RG .//*[@id='RG']
	         WebElement rg = wd.findElement(By.xpath(".//*[@id='RG']"));
	         rg.sendKeys("30614471-8");
	         
	         //Click Payment Slip  .//*[@id='create-payment-slip']
	         WebElement paymentSlip = wd.findElement(By.xpath(".//*[@id='create-payment-slip']"));
	         paymentSlip.click();
	         
	        
	wd.close();
	
	
	
	
	}

}
