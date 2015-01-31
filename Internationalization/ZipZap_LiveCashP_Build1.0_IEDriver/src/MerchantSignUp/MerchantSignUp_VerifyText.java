package MerchantSignUp;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class MerchantSignUp_VerifyText {

	public static void main(String[] args) throws Exception {
        FirefoxDriver wd;
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("https://staging.cashpayment.com/");
        
      
        
        
        
        
        //Click merchant sign up link
        WebElement merchantsignuplink = wd.findElement(By.xpath(".//*[@id='signUp_link']"));
        merchantsignuplink.click();
  
        //start test at merchant signup page
        //MERCHANT ACCOUNT INFORMATION BOX
        WebElement merchantAcctInfo = wd.findElement(By.xpath(".//*[@id='form']/div/fieldset[1]/legend"));
        merchantAcctInfo.isDisplayed();
        
        //username
        WebElement username = wd.findElement(By.xpath(".//*[@id='form']/div/fieldset[1]/div[1]/label"));
        username.isDisplayed();
        
        
        //password
        WebElement password = wd.findElement(By.xpath(".//*[@id='form']/div/fieldset[1]/div[3]/label"));
        password.isDisplayed();
        
        //confirm password
        WebElement confirmPassword = wd.findElement(By.xpath(".//*[@id='form']/div/fieldset[1]/div[5]/label"));
        confirmPassword.isDisplayed();
        
        //Company legal name
        WebElement legalName = wd.findElement(By.xpath(".//*[@id='form']/div/fieldset[1]/div[7]/label"));
        legalName.isDisplayed();
        
        //Business DBA Name
        WebElement dbaName = wd.findElement(By.xpath(".//*[@id='form']/div/fieldset[1]/div[9]/label"));
        dbaName.isDisplayed();
        
        //Country
        WebElement country = wd.findElement(By.xpath(".//*[@id='form']/div/fieldset[1]/div[11]/label"));
        country.isDisplayed();
        
        
        //Referral Code
        WebElement referralCode = wd.findElement(By.xpath(".//*[@id='form']/div/fieldset[1]/div[13]/label"));
        referralCode.isDisplayed();
        
        
        //COMPANY CONTACT BOX
        //Company Contact
        WebElement companyContact = wd.findElement(By.xpath(".//*[@id='form']/div/fieldset[2]/legend"));
        companyContact.isDisplayed();
        
       
        //First Name
        WebElement firstName = wd.findElement(By.xpath(".//*[@id='form']/div/fieldset[2]/div[1]/label"));
        firstName.isDisplayed();
        
        //Last Name
        WebElement lastName = wd.findElement(By.xpath(".//*[@id='form']/div/fieldset[2]/div[3]/label"));
        lastName.isDisplayed();
        
        //Title
        WebElement title = wd.findElement(By.xpath(".//*[@id='form']/div/fieldset[2]/div[5]/label"));
        title.isDisplayed();
        
        //Email
        WebElement email = wd.findElement(By.xpath(".//*[@id='form']/div/fieldset[2]/div[7]/label"));
        email.isDisplayed();
        
        
        //Primary Phone
        WebElement primaryPhone = wd.findElement(By.xpath(".//*[@id='form']/div/fieldset[2]/div[9]/label"));
        primaryPhone.isDisplayed();
        
        
        //Secondary Phone
        WebElement secondaryPhone = wd.findElement(By.xpath(".//*[@id='form']/div/fieldset[2]/div[11]/label"));
        secondaryPhone.isDisplayed();
        
        
        //Register
        WebElement register = wd.findElement(By.xpath(".//*[@id='register']"));
        register.isDisplayed();
        
        
        
        
        //VERIFY ELEMENTS (2)
        
        
        //ZipZap logo
        WebElement logo = wd.findElement(By.xpath(".//*[@id='copyright']/img"));
        logo.isDisplayed();
        
        
        //Language Drop Down
        WebElement languageDD = wd.findElement(By.xpath(".//*[@id='language-menu']/ul/li[1]/a"));
        languageDD.isDisplayed();
        
        wd.close();
        
        //End testing
        
       
        
       }
           
          

       	    
       	}
       	