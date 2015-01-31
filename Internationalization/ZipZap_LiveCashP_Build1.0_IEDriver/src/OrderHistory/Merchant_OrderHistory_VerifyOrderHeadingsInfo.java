package OrderHistory;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class Merchant_OrderHistory_VerifyOrderHeadingsInfo {

	public static void main(String[] args) throws Exception {
        FirefoxDriver wd;
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("https://staging.cashpayment.com/");
        
        
        
        
        
        
        wd.close();
        
	}
}

//Apr 12, 2013 18:14	663	573 751 724	$50.00		$50.00	Pending