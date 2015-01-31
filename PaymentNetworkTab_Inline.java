package BackOffice_InlineErrors;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class PaymentNetworkTab_Inline {

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
        
        //***********************Start testing here***********************

        
        
        
        
        
        wd.close();
        
        
        
	}
}