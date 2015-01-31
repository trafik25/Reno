package Critical_PostBuild;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class FindMyPayment {
    public static void main(String[] args) throws Exception {
        FirefoxDriver wd;
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("https://www.cashpayment.com/");
      //change URL for live
        //("https://www.cashpayment.com/")
        //merchantdemo
        //qazwsx1234
        
        //Click View My Payments
        WebElement viewMyPayments = wd.findElement(By.xpath(".//*[@id='top-nav']/li[1]/a[1]"));
        viewMyPayments.click();
        
        //Enter in account  number to view payments
        WebElement enterAccountNumber	= wd.findElement(By.xpath(".//*[@id='payParam']"));
        enterAccountNumber.sendKeys("319470696");
                    
        //Click Find  .//*[@id='register']
        WebElement clickFind = wd.findElement(By.xpath(".//*[@id='register']"));
        clickFind.click();
        
        wd.close();
    }
}
