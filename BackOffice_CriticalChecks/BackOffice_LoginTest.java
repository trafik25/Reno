package BackOffice_CriticalChecks;
//verify that orders are created after a build goes live. 
//this is on staging server, change URL to Live Server for Live orders

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BackOffice_LoginTest {

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
      
      WebElement login = wd.findElement(By.xpath(".//*[@id='page']/div[3]/form/p[1]/input"));
      login.click();
      
      //Check to see that admin panel is displayed
      WebElement adminPanel = wd.findElement(By.xpath(".//*[@id='page']/div[2]/h1"));
      adminPanel.isDisplayed();
      
      
      wd.close();
      
      
      
	}
}

      