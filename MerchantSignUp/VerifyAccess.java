package MerchantSignUp;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class VerifyAccess {
    public static void main(String[] args) throws Exception {
        FirefoxDriver wd;
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("https://www.cashpayment.com/");
		
		WebElement merchantSignup = wd.findElement(By.xpath(".//*[@id='signUp_link']"));
		merchantSignup.click();
		
		WebElement legend = wd.findElement(By.xpath(".//*[@id='form']/div/fieldset[1]/legend"));
		legend.isDisplayed();
		
		


    	wd.close();

    }

    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

	    
	}