package BackOffice_CriticalChecks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//create an order and then check "orders" in backoffice for correct amount
public class VerifyOrderAmountCorrectinBackoffice {

	

	public static void main(String[] args) throws Exception {
	      FirefoxDriver wd;
	      wd = new FirefoxDriver();
	      wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	      wd.get("https://www.cashpayment.com/Backoffice");
	      //live address is https://www.cashpayment.com/Backoffice
	     
	      
	      
	      
	      //***************************LOGIN to Staging or Live Server****************************
	      //supplies your username for login to staging/live server
	      WebElement username = wd.findElement(By.xpath(".//*[@id='UserName']"));
	      username.sendKeys("tomhoward");
	      
	      //supply your password
	      WebElement password = wd.findElement(By.xpath(".//*[@id='Password']"));
	      password.sendKeys("tiesto25");
	      
	      WebElement login = wd.findElement(By.xpath(".//*[@id='page']/div[3]/form/p[1]/input"));
	      login.click();
	      
	      //***************************Check Orders****************************
	      //Click Orders link
	      WebElement logFile = wd.findElement(By.xpath(".//*[@id='page']/a[2]"));
	      logFile.click();
	      
	      //***************************Start Test****************************

	      
	      //Verify order ID present .//*[@id='page']/table/tbody/tr[1]/td[3]
	      WebElement orderID1 = wd.findElement(By.xpath(".//*[@id='page']/table/tbody/tr[1]/td[3]"));
	      orderID1.isDisplayed();
	      
	      WebElement orderIDa = wd.findElement(By.xpath(".//*[@id='page']/table/tbody/tr[1]/td[3]/a"));
	      orderIDa.isDisplayed();
	      
	      Thread.sleep(2000);
	      
	      WebElement orderID2 = wd.findElement(By.xpath(".//*[@id='page']/table/tbody/tr[2]/td[3]"));
	      orderID2.isDisplayed();
	      
	      WebElement orderID2a = wd.findElement(By.xpath(".//*[@id='page']/table/tbody/tr[2]/td[3]/a"));
	      orderID2a.isDisplayed();
	      
	      Thread.sleep(2000);
	      
	      WebElement orderID3 = wd.findElement(By.xpath(".//*[@id='page']/table/tbody/tr[3]/td[3]"));
	      orderID3.isDisplayed();
	      
	      WebElement orderID3a = wd.findElement(By.xpath(".//*[@id='page']/table/tbody/tr[3]/td[3]/a"));
	      orderID3a.isDisplayed();
	      
	      Thread.sleep(2000);
	      
	      WebElement orderID4 = wd.findElement(By.xpath(".//*[@id='page']/table/tbody/tr[4]/td[3]"));
	      orderID4.isDisplayed();
	      
	      WebElement orderID4a = wd.findElement(By.xpath(".//*[@id='page']/table/tbody/tr[4]/td[3]/a"));
	      orderID4a.isDisplayed();
	      
	      Thread.sleep(2000);
	      
	      WebElement orderID5 = wd.findElement(By.xpath(".//*[@id='page']/table/tbody/tr[4]/td[3]"));
	      orderID5.isDisplayed();
	      
	      WebElement orderID5a = wd.findElement(By.xpath(".//*[@id='page']/table/tbody/tr[4]/td[3]/a"));
	      orderID5a.isDisplayed();
	      
	      
	      
	      wd.close();
	      
	}

}
