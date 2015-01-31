package Merchant_Profile;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class MerchantInformationBox {

	public static void main(String[] args) throws Exception {
        FirefoxDriver wd;
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("https://www.cashpayment.com/");
        

	
        
        //Merchant ID
        WebElement merchantID = wd.findElement(By.xpath("xxxxxx"));
        merchantID.isDisplayed();
        
        //Account ID
        WebElement accountID = wd.findElement(By.xpath("xxxxxx"));
        accountID.isDisplayed();
        
        //Hash Code
        WebElement hashCode = wd.findElement(By.xpath("xxxxxx"));
        hashCode.isDisplayed();
        
        //Merchant API Key 
        WebElement apiKey = wd.findElement(By.xpath("xxxxxx"));
        apiKey.isDisplayed();
        
        //****************LOGOFF*********************
        
       
        
        
        
        
        
        
        
        
        
        wd.close();
        
        
        
        
	}
}
        
        
        
        