package OrderHistory;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class Merchant_OrderHistory_OrderDetails {

	public static void main(String[] args) throws Exception {
        FirefoxDriver wd;
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("https://staging.cashpayment.com/");
        
        
        
        
        
        
        wd.close();
        
	}
}


//
//Transaction information
//Date: 4/12/2013 6:14:29 PM
//Order ID: 664
//Account ID: 573 751 724
//Amount: $50.00
//Description:
//[[MerchantOrderID]]: 663
//PaymentCode:
//Fee Paid by Customer: 0.00
//Fee Paid by Merchant: 0.00
//Amount Paid to Merchant: 50.00
//Status: Pending
