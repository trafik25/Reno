package BackOffice_Account;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BasicTab {

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
        
        //Verify merchant name
        WebElement verifyName = wd.findElement(By.xpath(".//*[@id='basic']/div[1]/h3/b"));
        verifyName.equals("merchantdemo");
        
        //***********************Company contact Box***********************
        //First Name .//*[@id='ContactFirstName']
        WebElement fn = wd.findElement(By.xpath(".//*[@id='ContactFirstName']"));
        fn.equals("Brian");
        
        
        //Last Name .//*[@id='ContactLastName']
        WebElement ln = wd.findElement(By.xpath(".//*[@id='ContactLastName']"));
        ln.equals("Keller-Heikkila");
        
        
        //Title  .//*[@id='ContactTitle']
        WebElement title = wd.findElement(By.xpath(".//*[@id='ContactTitle']"));
        title.equals("VP Software Development");
        
        
        //Email .//*[@id='ContactEmailAddress']
        WebElement email = wd.findElement(By.xpath(".//*[@id='ContactEmailAddress']"));
        email.equals("brian.keller-heikkila@ezipzap.com");
        
        
        //Prim Phone .//*[@id='ContactPrimaryPhone']
        WebElement primPhone = wd.findElement(By.xpath(".//*[@id='ContactPrimaryPhone']"));
        primPhone.equals("218.839.4596");
        
        
        //Sec Phone .//*[@id='ContactSecondaryPhone']
        //LEAVE EMPTY
        
        
        //Password (to change password)  .//*[@id='Password']
        WebElement password1 = wd.findElement(By.xpath(".//*[@id='Password']"));
        password1.equals("password123");
        
        
        //Confirm Password .//*[@id='ConfirmPassword']
        WebElement confPwd = wd.findElement(By.xpath(".//*[@id='ConfirmPassword']"));
        confPwd.equals("password123");
        
        //Save  .//*[@id='basic']/div[2]/input
        WebElement save1 = wd.findElement(By.xpath(".//*[@id='basic']/div[2]/input"));
        save1.click();
        
        Thread.sleep(4000);
        
        //Password (to change password)  .//*[@id='Password']
        WebElement password2 = wd.findElement(By.xpath(".//*[@id='Password']"));
        password2.equals("qazwsx1234");
        
        //***************************CHANGE PASSWORD BACK***********************
        //Confirm Password .//*[@id='ConfirmPassword']
        WebElement confPwd1 = wd.findElement(By.xpath(".//*[@id='ConfirmPassword']"));
        confPwd1.equals("qazwsx1234");
        
        //Save changed password
        //Save  .//*[@id='basic']/div[2]/input
        WebElement save2 = wd.findElement(By.xpath(".//*[@id='basic']/div[2]/input"));
        save2.click();
        
        
        
        
        
        
        
        wd.close();
        
        
	}
}
