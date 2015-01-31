package BackOffice_Account;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BankPayment {

	public static void main(String[] args) throws Exception {
        FirefoxDriver wd;
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("https://www.cashpayment.com/BackOffice");
        
        
        //***********************LOGIN to BackOffice***********************
        //SendKeys username
        WebElement username = wd.findElement(By.xpath(".//*[@id='UserName']"));
        username.sendKeys("tomhoward");
		
        //SendKeys password
        WebElement password = wd.findElement(By.xpath(".//*[@id='Password']"));
        password.sendKeys("tiesto25");
		
		//Click Signin button  .//*[@id='signin']/p[3]/button
        WebElement signIn = wd.findElement(By.xpath(".//*[@id='page']/div[3]/form/p[1]/input"));
        signIn.click();
        
        
        //***********************Navigate the Backoffice***********************
        //Filter accountID .//*[@id='fb']
        WebElement filter1 = wd.findElement(By.xpath(".//*[@id='fb']"));
        filter1.sendKeys("Account ID");
        
        //Clear the value  .//*[@id='fv']
        WebElement filter2 = wd.findElement(By.xpath(".//*[@id='fv']"));
        filter2.clear();
        filter2.sendKeys("229863501");
        
        //Click Apply filter .//*[@id='page']/form/input[4]
        WebElement apply = wd.findElement(By.xpath(".//*[@id='page']/form/input[4]"));
        apply.click();
        
        //Click the Account link .//*[@id='page']/table/tbody/tr[2]/td[10]/a
        WebElement accLink = wd.findElement(By.xpath(".//*[@id='page']/table/tbody/tr[2]/td[10]/a"));
        accLink.click();
        
        
        //***********************Navigate Merchant Account Tabs***********************
        //only need to change the tab if its not basic tab
        WebElement changeTab = wd.findElement(By.xpath(".//*[@id='tabs']/ul/li[4]/a"));
        changeTab.click();
        
        //.//*[@id='tabs']/ul/li[2]/a COMPANY 
        //.//*[@id='tabs']/ul/li[3]/a COMPANY OWNER
        //.//*[@id='tabs']/ul/li[4]/a BANK PAYMENT  <<<<*********
        //.//*[@id='tabs']/ul/li[5]/a MERCH AGREEMENT
        //.//*[@id='tabs']/ul/li[6]/a MERCH CUST FEE
        //.//*[@id='tabs']/ul/li[7]/a  PAYMENT NETWORKS
        //.//*[@id='tabs']/ul/li[9]/a  REQ DATA
        
        
        //***********************START TESTING HERE***********************
        //PAYMENT PROCESSOR box
        //Question 1 (CLICK YES)
        WebElement accept = wd.findElement(By.xpath(".//*[@id='PaymentProcessor_IsAcceptCardsForPayment']"));
        accept.click();
        
        //Fill in Question 1A
        WebElement answer1 = wd.findElement(By.xpath(".//*[@id='PaymentProcessor_IsAcceptCardsForPayment']"));
        answer1.sendKeys("Acme Inc");
        
        //Fill in Question 1B
        WebElement answer2 = wd.findElement(By.xpath(".//*[@id='PaymentProcessor_IsAcceptCardsForPayment']"));
        answer2.sendKeys("5 years");
        
        //Fill in Question 1C
        WebElement answer3 = wd.findElement(By.xpath(".//*[@id='PaymentProcessor_IsAcceptCardsForPayment']"));
        answer3.sendKeys("150000");
        
        //Click Save
        WebElement save = wd.findElement(By.xpath(".//*[@id='bank']/div/input"));
        save.click();
        
        Thread.sleep(2000);
        
        //Equals Acme Inc?
        WebElement answer1e = wd.findElement(By.xpath(".//*[@id='PaymentProcessor_IsAcceptCardsForPayment']"));
        answer1e.equals("Acme Inc");
        
        //Eqauls 5 years?
        WebElement answer2e = wd.findElement(By.xpath(".//*[@id='PaymentProcessor_IsAcceptCardsForPayment']"));
        answer2e.equals("5 years");
        
        //Equals 150000?
        WebElement answer3e = wd.findElement(By.xpath(".//*[@id='PaymentProcessor_IsAcceptCardsForPayment']"));
        answer3e.equals("150000");
        
        Thread.sleep(2000);
        
        //Question 2 (CLICK YES)
        WebElement denied = wd.findElement(By.xpath(".//*[@id='PaymentProcessor_HasMerchantAcquirerOrprocessorClosedAccounts']"));
        denied.click();
        
        //Click Save
        WebElement save1 = wd.findElement(By.xpath(".//*[@id='bank']/div/input"));
        save1.click();
        
        WebElement deniedEquals = wd.findElement(By.xpath(".//*[@id='PaymentProcessor_HasMerchantAcquirerOrprocessorClosedAccounts']"));
        deniedEquals.equals("Yes");
        
       
        Thread.sleep(2000);
        
        //***********************CHANGE TO NO AND SAVE***********************
        //Question 1 (CLICK NO)
        WebElement acceptNo = wd.findElement(By.xpath(".//*[@id='PaymentProcessor_IsAcceptCardsForPayment']"));
        acceptNo.click();
        
        //Question 2 (CLICK NO)
        WebElement deniedNo = wd.findElement(By.xpath(".//*[@id='PaymentProcessor_HasMerchantAcquirerOrprocessorClosedAccounts']"));
        deniedNo.click();
        
        //Click Save
        WebElement save2 = wd.findElement(By.xpath(".//*[@id='bank']/div/input"));
        save2.click();
        
      
        
        
        //***********************BANKING INFO BOX***********************

 
        
        
        
        
        
        
        
        wd.close();
        
        
	}
}