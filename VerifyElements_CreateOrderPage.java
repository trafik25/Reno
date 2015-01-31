package Merchant_CreateOrder;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class VerifyElements_CreateOrderPage {

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
        WebElement createOrderLink = wd.findElement(By.xpath(".//*[@id='fieldWrapper']/div[1]/ul/li[5]/a"));
        createOrderLink.click();
        
        
        //************************************BEGIN TEST*********************

        //Create Order Heading
        WebElement newOrder = wd.findElement(By.xpath(".//*[@id='createOrderForm']/fieldset/legend"));
        newOrder.isDisplayed();
       
        //Language Drop Down
        WebElement langDD = wd.findElement(By.xpath(".//*[@id='language-menu']/ul/li[1]/a"));
        langDD.isDisplayed();
        
        
        
        
        //REQUIRED FIELDS*************************
        //Amount
        WebElement Amount = wd.findElement(By.xpath(".//*[@id='createOrderForm']/fieldset/div/table/tbody/tr[5]/td[1]"));
        Amount.isDisplayed();
        
        //Currency 
        WebElement currency = wd.findElement(By.xpath(".//*[@id='createOrderForm']/fieldset/div/table/tbody/tr[6]/td[1]"));
        currency.isDisplayed();
        
        
        
        
        //OPTIONAL FIELDS*************************
        //PassThru
        WebElement passThru = wd.findElement(By.xpath(".//*[@id='createOrderForm']/fieldset/div/table/tbody/tr[8]/td[1]"));
        passThru.isDisplayed();
        
        //Item Description
        WebElement itemDescription = wd.findElement(By.xpath(".//*[@id='createOrderForm']/fieldset/div/table/tbody/tr[9]/td[1]"));
        itemDescription.isDisplayed();
        
        //Customer First Name
        WebElement customerFirstName = wd.findElement(By.xpath(".//*[@id='createOrderForm']/fieldset/div/table/tbody/tr[10]/td[1]"));
        customerFirstName.isDisplayed();
        
        //Customer Last Name
        WebElement customerLastName = wd.findElement(By.xpath(".//*[@id='createOrderForm']/fieldset/div/table/tbody/tr[11]/td[1]"));
        customerLastName.isDisplayed();
        
        //Customer Email Address 
        WebElement customerEmailAddress = wd.findElement(By.xpath(".//*[@id='createOrderForm']/fieldset/div/table/tbody/tr[12]/td[1]"));
        customerEmailAddress.isDisplayed();
        
        //Customer Phone Number  
        WebElement customerPhoneNumber = wd.findElement(By.xpath(".//*[@id='createOrderForm']/fieldset/div/table/tbody/tr[13]/td[1]"));
        customerPhoneNumber.isDisplayed();
        
        //Customer  DOB 
        WebElement customerDateOfBirth = wd.findElement(By.xpath(".//*[@id='createOrderForm']/fieldset/div/table/tbody/tr[14]/td[1]"));
        customerDateOfBirth.isDisplayed();
        
        //Customer  Address 
        WebElement customerAddress = wd.findElement(By.xpath(".//*[@id='createOrderForm']/fieldset/div/table/tbody/tr[15]/td[1]"));
        customerAddress.isDisplayed();
        
        //Customer Pay Country  
        WebElement customerPayCountry = wd.findElement(By.xpath(".//*[@id='createOrderForm']/fieldset/div/table/tbody/tr[18]/td[1]"));
        customerPayCountry.isDisplayed();
        
        //Customer Language
        WebElement customerLang = wd.findElement(By.xpath(".//*[@id='createOrderForm']/fieldset/div/table/tbody/tr[19]/td[1]"));
        customerLang.isDisplayed();
        
        //Create order button (Verify Present--no action)
        WebElement createOrder = wd.findElement(By.xpath(".//*[@id='createOrder']"));
        createOrder.isDisplayed();

        //ZZ Logo Present
        WebElement logo = wd.findElement(By.xpath(".//*[@id='copyright']/img"));
        logo.isDisplayed();
        
        
        
        
        wd.close();
        
	}
}
        
        
        
        