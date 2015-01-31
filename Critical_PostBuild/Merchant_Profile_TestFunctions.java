package Critical_PostBuild;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class Merchant_Profile_TestFunctions {

	public static void main(String[] args) throws Exception {
        FirefoxDriver wd;
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("https://staging.cashpayment.com/");
        //wd.get("https://www.cashpayment.com/");
        //change URL for live
        //("https://www.cashpayment.com/")
        //merchantdemo
        //qazwsx1234

        //***********************Merchant Login Information*************************

        
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
        
        
        //Click the Profile link  .//*[@id='fieldWrapper']/div[1]/ul/li[4]/a
        WebElement profileLink = wd.findElement(By.xpath(".//*[@id='fieldWrapper']/div[1]/ul/li[4]/a"));
        profileLink.click();
	
        
        //Merchant ID
        WebElement merchantID = wd.findElement(By.xpath(".//*[@id='ajaxUploadForm']/fieldset[1]/div/label[1]"));
        merchantID.isDisplayed();
        
        //Account ID
        WebElement accountID = wd.findElement(By.xpath(".//*[@id='ajaxUploadForm']/fieldset[1]/div/label[2]"));
        accountID.isDisplayed();
        
        //Hash Code
        WebElement hashCode = wd.findElement(By.xpath(".//*[@id='ajaxUploadForm']/fieldset[1]/div/label[3]"));
        hashCode.isDisplayed();
        
        //Merchant API Key 
        WebElement apiKey = wd.findElement(By.xpath(".//*[@id='ajaxUploadForm']/fieldset[1]/div/label[4]"));
        apiKey.isDisplayed();
        
        
        
        
        
        //Default Checkbox check uncheck  .//*[@id='defaultdesign']
        WebElement checkbox = wd.findElement(By.xpath(".//*[@id='defaultdesign']"));
        checkbox.click();
        
        
        //*******************click the checkbox and then verify uploads are active********************
       //Header HTML .//*[@id='ajaxUploadForm']/fieldset[2]/div[2]/input
        WebElement headerHtml = wd.findElement(By.xpath(".//*[@id='ajaxUploadForm']/fieldset[2]/div[2]/input"));
        headerHtml.isEnabled();
        
        //Footer HTML  .//*[@id='ajaxUploadForm']/fieldset[2]/div[4]/input
        WebElement footerHtml = wd.findElement(By.xpath(".//*[@id='ajaxUploadForm']/fieldset[3]/div[4]/input"));
        footerHtml.isEnabled();
        
        //Recheck the box
        WebElement checkboxRecheck = wd.findElement(By.xpath(".//*[@id='defaultdesign']"));
        checkboxRecheck.click();
        
        
        //Upload a logo .//*[@id='ajaxUploadForm']/fieldset[3]/div[2]/input
        WebElement logo = wd.findElement(By.xpath(".//*[@id='ajaxUploadForm']/fieldset[3]/div[2]/input"));
        logo.isEnabled();
        
        //Enter in Payment Slip Text  clear it, then reenter then Click Preview
        WebElement enterText = wd.findElement(By.xpath(".//*[@id='PaymentSlipText']"));
        enterText.clear();
        enterText.sendKeys("This is a Payment to Acme Inc Testing THANKS!");

        //Click Preview Payment Slip .//*[@id='ajaxUploadForm']/fieldset[3]/div[5]/a
        WebElement paymentText = wd.findElement(By.xpath(".//*[@id='ajaxUploadForm']/fieldset[3]/div[5]/a"));
        paymentText.click();
        
        
        wd.navigate().back();
        
        //Confirm Auto Payment Notify URL  .//*[@id='autopayment']
        WebElement notifyURL = wd.findElement(By.xpath(".//*[@id='autopayment']"));
        notifyURL.isDisplayed();
        
        
        //Check and uncheck Test Mode .//*[@id='testmode']
        WebElement uncheckTM = wd.findElement(By.xpath(".//*[@id='testmode']"));
        uncheckTM.click();
        uncheckTM.click();
        
        //Click Save .//*[@id='ajaxUploadForm']/p/button
        WebElement saveButton = wd.findElement(By.xpath(".//*[@id='ajaxUploadForm']/p/button"));
        saveButton.click();
        
        
        
        
        
        
        
        
        
        
        
        //****************LOGOFF*********************
        
       
        
        
        
        
        
        
        
        
        
        wd.close();
        
        
        
        
	}
}
        
        
        
        