package BackOffice_CriticalChecks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//create an order and then check "orders" in backoffice for correct amount
public class BackOffice_CheckDailyReports {

	

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
	      WebElement dailyReport = wd.findElement(By.xpath(".//*[@id='page']/a[6]"));
	      dailyReport.click();
	      
	      //Download the file, check the first row
	      
	      wd.navigate().back();
	      
	      //Search an orderID and verify the amount is correct .//*[@id='OrderID']
	      WebElement verifyAmount = wd.findElement(By.xpath(".//*[@id='OrderID']"));
	      verifyAmount.sendKeys("178923");
	      
	      //Click Apply button .//*[@id='page']/form/input[11]
	      WebElement apply = wd.findElement(By.xpath(".//*[@id='page']/form/input[11]"));
	      apply.click();
	     
	      //***************************Verify Customer Info****************************

	      assertTrue(wd.getPageSource().contains("Chantal Langevin"));
	      assertTrue(wd.getPageSource().contains("567 675 863"));
	      assertTrue(wd.getPageSource().contains("Paid"));
	      assertTrue(wd.getPageSource().contains("221.95 USD"));

	      
	      
	      wd.close();
	      
	}

	private static void assertTrue(boolean contains) {
		// TODO Auto-generated method stub
		
	}
}
