package BugTests;
//this test is not yet complete
// THIS IS A BACKOFFICE TEST, test the banner on the front end
//TICKET https://app.asana.com/0/4469896089852/4862265743478

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MerchantOrder_FrozenScreenBug {

	public static void main(String[] args) throws Exception {
        FirefoxDriver wd;
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("https://staging.cashpayment.com/");
        
        
        
        
        
        
        
        
        wd.close();
        
	}
	
}