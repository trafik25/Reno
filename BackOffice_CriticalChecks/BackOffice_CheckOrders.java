package BackOffice_CriticalChecks;
//verify that orders are created after a build goes live. 
//this is on staging server, change URL to Live Server for Live orders

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BackOffice_CheckOrders {

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
      
      
      
      //***************************Check Orders****************************
      //Click Orders link
      WebElement logFile = wd.findElement(By.xpath(".//*[@id='page']/a[2]"));
      logFile.click();
      
      //***************************START checking orders every 5 seconds****************************

      //Check to see there is a value in a certain row in a table
      WebElement customerIDPresent = wd.findElement(By.xpath(".//*[@id='page']/table/tbody/tr[1]/td[3]"));
      customerIDPresent.isDisplayed();
      
      
      //uncomment these lines to use on live to check orders every 5 seconds
//      Thread.sleep(5000); //wait 5 seconds, check the table again for a new value
//      
//      //Checks table 
//      WebElement customerIDPresent1 = wd.findElement(By.xpath(".//*[@id='page']/table/tbody/tr[1]/td[3]"));
//      customerIDPresent1.isDisplayed();
//      
//      Thread.sleep(5000); //wait 5 seconds, check the table again for a new value
//      
//      //Checks table 
//      WebElement customerIDPresent2 = wd.findElement(By.xpath(".//*[@id='page']/table/tbody/tr[1]/td[3]"));
//      customerIDPresent2.isDisplayed();
//      
//      
//      //Check to see there is a value in a certain row in a table
//      WebElement customerIDPresent3 = wd.findElement(By.xpath(".//*[@id='page']/table/tbody/tr[1]/td[3]"));
//      customerIDPresent3.isDisplayed();
//      
//      Thread.sleep(5000); //wait 5 seconds, check the table again for a new value
//      
//      //Checks table 
//      WebElement customerIDPresent4 = wd.findElement(By.xpath(".//*[@id='page']/table/tbody/tr[1]/td[3]"));
//      customerIDPresent4.isDisplayed();
//      
//      Thread.sleep(5000); //wait 5 seconds, check the table again for a new value
//      
//      //Checks table 
//      WebElement customerIDPresent5 = wd.findElement(By.xpath(".//*[@id='page']/table/tbody/tr[1]/td[3]"));
//      customerIDPresent5.isDisplayed();
      
      
      
      
      wd.close();
      
	}
}