package CheckMyPayment;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
//check backoffice for a new order ID before running this
public class VerifyAccess {
    public static void main(String[] args) throws Exception {
        FirefoxDriver wd;
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("https://www.cashpayment.com/");
        //account numbers will be different on live. 
        
        //Click View My Payments
        WebElement viewMyPayments = wd.findElement(By.xpath(".//*[@id='top-nav']/li[1]/a[1]"));
        viewMyPayments.click();
        
        //Enter in account  number to view payments
        WebElement enterAccountNumber	= wd.findElement(By.xpath(".//*[@id='payParam']"));
        enterAccountNumber.sendKeys("468677810");
                    
        //Click Find  .//*[@id='register']
        WebElement clickFind = wd.findElement(By.xpath(".//*[@id='register']"));
        clickFind.click();
        
        wd.close();
    }
}
