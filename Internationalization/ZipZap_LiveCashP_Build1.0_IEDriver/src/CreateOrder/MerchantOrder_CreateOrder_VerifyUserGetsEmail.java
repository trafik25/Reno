package CreateOrder;
//This is a crucial POST build test   

//Change emails and phone numbers


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;


public class MerchantOrder_CreateOrder_VerifyUserGetsEmail {

	public static void main(String[] args) throws Exception {
        FirefoxDriver wd;
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("https://staging.cashpayment.com/");
        

	
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
        WebElement createOrderLink = wd.findElement(By.xpath(".//*[@id='fieldWrapper']/div[1]/ul/li[4]/a"));
        createOrderLink.click();
       
        
        //**************************************ORDER PAGE**************************************
        //Currency 
        WebElement currency = wd.findElement(By.xpath(".//*[@id='createOrderForm']/fieldset/div/table/tbody/tr[6]/td[2]"));
        currency.isDisplayed();
        
        //auto-filled field change value from $50.00 to $a value
        WebElement delete50 = wd.findElement(By.xpath(".//*[@id='Amount']"));
        delete50.clear();
        delete50.sendKeys("1.00");
        
        
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
        
        //CLICK CONTINUE BUTTON
        WebElement selectContinueButton = wd.findElement(By.xpath(".//*[@id='createOrder']"));
        selectContinueButton.click();
        
        Thread.sleep(2000);
        
        
      //******************************CHECKOUT PAGE******************************
        //Clear the client email address
        WebElement clearEmail = wd.findElement(By.xpath(".//*[@id='form-field-email']"));
        clearEmail.clear();
        clearEmail.sendKeys("rayjohnson444444ssss@gmail.com");
        
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
        
        
        //******************************Login to Gmail******************************
       //go to gmail.com
        wd.get("https://www.gmail.com");
        
        //Supply username
        WebElement username = wd.findElement(By.xpath(".//*[@id='Email']"));
        username.sendKeys("thomashoward206@gmail.com");
        
        //Supply password
        WebElement password = wd.findElement(By.xpath(".//*[@id='Passwd']"));
        password.sendKeys("jordan2013");
        
       //Signin
        WebElement signIn1 = wd.findElement(By.xpath(".//*[@id='signIn'] signin"));
        signIn1.click();
        
        
        Thread.sleep(3000);
        
        //Click ZZ email
        WebElement readMessage = wd.findElement(By.xpath(".//*[@id=':6e']/b"));
        readMessage.click();
        
        //View email
        WebElement readMessage1 = wd.findElement(By.xpath(".//*[@id=':61'] "));
        readMessage1.isDisplayed();
       
        
        wd.close();
        
	}
}
        
        
        
        
        