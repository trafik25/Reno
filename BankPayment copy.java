package Merchant_Account;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class BankPayment {

	public static void main(String[] args) throws Exception {
        FirefoxDriver wd;
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("https://www.cashpayment.com/");
        
        //merchantdemo
        //qazwsx1234
      
        //****************************LOGIN SCRIPT LIVE SERVER****************************
        //click login link on homepage
        WebElement login = wd.findElement(By.xpath(".//*[@id='login_link']"));
        login.click();
		
        //SendKeys username
        WebElement username = wd.findElement(By.xpath(".//*[@id='UserName']"));
        username.sendKeys("merchantdemo");
		
        //SendKeys password
        WebElement password = wd.findElement(By.xpath(".//*[@id='password1']"));
        password.sendKeys("qazwsx1234");
		
		//Click Signin button  .//*[@id='signin']/p[3]/button
        WebElement signIn = wd.findElement(By.xpath(".//*[@id='signin']/p[3]/button"));
        signIn.click();
        
        //Click the account tab .//*[@id='fieldWrapper']/div[1]/ul/li[1]/a
        WebElement accountTab = wd.findElement(By.xpath(".//*[@id='fieldWrapper']/div[1]/ul/li[1]/a"));
        accountTab.click();
        
        //Click the bank payment tab  .//*[@id='tabs']/ul/li[4]/a
        WebElement basicTab = wd.findElement(By.xpath(".//*[@id='tabs']/ul/li[4]/a"));
        basicTab.click();
		
        //****************************Payment Processor****************************
        //*** not all questions below may be on merchant account
        //the only place to change this info is in the backoffice under "Accounts" for that merchant
        //Heading .//*[@id='tab-bank']/fieldset[1]/legend
        WebElement heading = wd.findElement(By.xpath(".//*[@id='tab-bank']/fieldset[1]/legend"));
        heading.isDisplayed();
        
        //Question 1 .//*[@id='tab-bank']/fieldset[1]/div[1]/label
        WebElement q1 = wd.findElement(By.xpath(".//*[@id='tab-bank']/fieldset[1]/div[1]/label"));
        q1.isDisplayed();
        
        
        //QUESTIONS 2,3,4 ARE NOT DEFAULT QUESTIONS THEY MUST BE ENABLED IN THE BACKOFFICE
//        //Question 2 .//*[@id='tab-bank']/fieldset[1]/div[4]/label
//        WebElement q2 = wd.findElement(By.xpath(".//*[@id='tab-bank']/fieldset[1]/div[4]/label"));
//        q2.isDisplayed();
//        
//        //Question 3 .//*[@id='tab-bank']/fieldset[1]/div[3]/div[3]/label
//        WebElement q3 = wd.findElement(By.xpath(".//*[@id='tab-bank']/fieldset[1]/div[3]/div[3]/label"));
//        q3.isDisplayed();
//        
//        //Question 4 .//*[@id='tab-bank']/fieldset[1]/div[3]/div[5]/label
//        WebElement q4 = wd.findElement(By.xpath(".//*[@id='tab-bank']/fieldset[1]/div[3]/div[5]/label"));
//        q4.isDisplayed();
        
        //Question 5 .//*[@id='tab-bank']/fieldset[1]/div[4]/label
        WebElement q5 = wd.findElement(By.xpath(".//*[@id='tab-bank']/fieldset[1]/div[4]/label"));
        q5.isDisplayed();
        
        //****************************Banking Info****************************
        //Name of financial Institution .//*[@id='tab-bank']/fieldset[2]/div[1]/label
        WebElement name = wd.findElement(By.xpath(".//*[@id='tab-bank']/fieldset[2]/div[1]/label"));
        name.equals("BOA");
        
        //Financial Inst Address 
        WebElement financial = wd.findElement(By.xpath(".//*[@id='tab-bank']/fieldset[2]/div[3]/label"));
        financial.equals("BOA Tower 123 Columbia Way Boston, MA 02133");
        
        //Routing Num
        WebElement routingNum = wd.findElement(By.xpath(".//*[@id='tab-bank']/fieldset[2]/div[5]/label"));
        routingNum.equals("92423343");
        
        //Banking Account Num
        WebElement bankAcct = wd.findElement(By.xpath(".//*[@id='tab-bank']/fieldset[2]/div[7]/label"));
        bankAcct.equals("3434343345453");
        
        //Currency
        WebElement currency = wd.findElement(By.xpath(".//*[@id='tab-bank']/fieldset[2]/div[9]/label"));
        currency.equals("USD");
        
        //Question 1
        WebElement q1b = wd.findElement(By.xpath(".//*[@id='tab-bank']/fieldset[2]/div[11]/label"));
        q1b.equals("No");
        
        //Question 2
        WebElement q2b = wd.findElement(By.xpath(".//*[@id='tab-bank']/fieldset[2]/div[13]/label"));
        q2b.equals("No");
        
        
        wd.close();
        
	}
}
