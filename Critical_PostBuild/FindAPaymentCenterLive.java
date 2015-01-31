package Critical_PostBuild;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class FindAPaymentCenterLive {
    public static void main(String[] args) throws Exception {
        FirefoxDriver wd;
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        //wd.get("https://staging.cashpayment.com/");
        wd.get("https://www.cashpayment.com/");
        //change URL for live
          //("https://www.cashpayment.com/")
          //merchantdemo
          //qazwsx1234
        
        
        //Click the Link Find a Payment Center
        WebElement linkClick = wd.findElement(By.xpath(".//*[@id='top-nav']/li[2]/a"));
        linkClick.click();
      
        //Enter in Zip Code
        WebElement inputBox1 = wd.findElement(By.xpath(".//*[@id='wrapper']/div[5]/div[5]/form/input"));
        inputBox1.sendKeys("48382");
        
        //Click Search .//*[@id='wrapper']/div[4]/div[5]/form/button
        WebElement search = wd.findElement(By.xpath(".//*[@id='wrapper']/div[5]/div[5]/form/button"));
        search.click();
        
        
        
        //Verify Market info is correct   CVS - #8240
//        assertTrue(wd.getPageSource().contains("CVS - #8240"));
//         assertTrue(wd.getPageSource().contains("1325 COMMERCE RD"));
//	      assertTrue(wd.getPageSource().contains("COMMERCE TOWNSHIP"));
//	      assertTrue(wd.getPageSource().contains("2483605461"));
//	      
        
      
       
        
    }

	private static void assertTrue(boolean contains) {
		// TODO Auto-generated method stub
		
	}
}
        
        
        