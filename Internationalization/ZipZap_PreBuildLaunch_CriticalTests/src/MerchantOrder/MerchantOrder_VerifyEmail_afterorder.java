package MerchantOrder;
//Write an email verification test for when a user creates
//an order, ensure that the ZipZap email is in their inbox. 
//First, create the order, verify the process, then verify 
//the email by creating an automated test to login to gmail 
//and search for the ZipZap email by title. Read the email and then close the browser. 

//this test is not yet complete
//TICKET https://app.asana.com/0/4469896089852/4850645498306

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MerchantOrder_VerifyEmail_afterorder {

	public static void main(String[] args) throws Exception {
        FirefoxDriver wd;
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("https://staging.cashpayment.com/");
        
        
        
        
        
        
        
        
        wd.close();
        
	}
	
}
