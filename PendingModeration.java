//https://app.asana.com/0/4469896089852/5006069054476
// account number 248 405 995 ekaurmana  

//On the live server, a merchant with 'Pending Moderation' status is able to 
//create an order. Merchants should only be able to create orders if their status is 'Active'.
//Merchant in pending moderation was able to process a transaction?
//

package BugTests_Build2_1_50;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PendingModeration {

	public static void main(String[] args) throws Exception {
        FirefoxDriver wd;
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("https://www.cashpayment.com/");
        //change URL for live
        //("https://www.cashpayment.com/")
        //merchantdemo
        //qazwsx1234

        //**************************************LOGIN***************************
        //Merchant Login Link Click
        WebElement merchantLogin = wd.findElement(By.xpath(".//*[@id='login_link']"));
        merchantLogin.click();
        
        //Username
        WebElement merchantLogin1 = wd.findElement(By.xpath(".//*[@id='UserName']"));
        merchantLogin1.sendKeys("trafik255");
        
        //Password
        WebElement merchantLogin2 = wd.findElement(By.xpath(".//*[@id='password1']"));
        merchantLogin2.sendKeys("tiesto25");
        
        //Click Sign In Button
        WebElement signIn = wd.findElement(By.xpath(".//*[@id='signin']/p[3]/button"));
        signIn.click();
        
        
        //******************************************CREATE ORDER PAGE**************************************
        //Create order link
          WebElement createOrderLink = wd.findElement(By.xpath(".//*[@id='fieldWrapper']/div[1]/ul/li[5]/a"));
          createOrderLink.click();
          
          Thread.sleep(3000);
          
        //Read error on page
          assertTrue(wd.getPageSource().contains("Your account is currently being reviewed for approval. If you have any questions, contact us at support@zipzapinc.com."));
	
	
	
	
	
	
	
	
	
	
	
	
	wd.close();

	}

	private static void assertTrue(boolean contains) {
		// TODO Auto-generated method stub
		
	}

}
