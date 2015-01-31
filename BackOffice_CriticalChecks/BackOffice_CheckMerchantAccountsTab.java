package BackOffice_CriticalChecks;
//verify that orders are created after a build goes live. 
//this is on staging server, change URL to Live Server for Live orders

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BackOffice_CheckMerchantAccountsTab {

	public static void main(String[] args) throws Exception {
      FirefoxDriver wd;
      wd = new FirefoxDriver();
      wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
      wd.get("https://www.cashpayment.com/Backoffice");
      //live address is https://www.cashpayment.com/Backoffice
      
      //***************************LOGIN to Staging Server****************************
      //supplies your username for login to staging server
      WebElement username = wd.findElement(By.xpath(".//*[@id='UserName']"));
      username.sendKeys("tomhoward");
      
      //supply your password
      WebElement password = wd.findElement(By.xpath(".//*[@id='Password']"));
      password.sendKeys("tiesto25");
      
      //click the login button
      WebElement login = wd.findElement(By.xpath(".//*[@id='page']/div[3]/form/p[1]/input"));
      login.click();
      
      //***************************Check Merchant Accounts****************************
      //Click Accounts link in BO
      WebElement accounts = wd.findElement(By.xpath(".//*[@id='page']/a[1]"));
      accounts.click();
      
      //*****************************Check merchants are present*********************
      //start with trafik25---.//*[@id='page']/table/tbody/tr[2]/td[2]
      WebElement merchant1 = wd.findElement(By.xpath(".//*[@id='page']/table/tbody/tr[2]/td[2]"));
      merchant1.isDisplayed();
      
    //merchant 2   .//*[@id='page']/table/tbody/tr[3]/td[2]
      WebElement merchant2 = wd.findElement(By.xpath(".//*[@id='page']/table/tbody/tr[3]/td[2]"));
      merchant2.isDisplayed();
      
    //merchant 4      .//*[@id='page']/table/tbody/tr[4]/td[2]
      WebElement merchant3 = wd.findElement(By.xpath(".//*[@id='page']/table/tbody/tr[4]/td[2]"));
      merchant3.isDisplayed();
      
    //merchant 5        .//*[@id='page']/table/tbody/tr[5]/td[2]
      WebElement merchant4 = wd.findElement(By.xpath(".//*[@id='page']/table/tbody/tr[5]/td[2]"));
      merchant4.isDisplayed();
      
      wd.close();
      
	}
}
      
      
      
      
      
      
      