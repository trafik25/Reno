package OrderHistory;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class Merchant_OrderHistory_Fliter_Suspended {

	public static void main(String[] args) throws Exception {
        FirefoxDriver wd;
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("https://staging.cashpayment.com/");
        
        
        
        
        
        
        wd.close();
        
	}
}
