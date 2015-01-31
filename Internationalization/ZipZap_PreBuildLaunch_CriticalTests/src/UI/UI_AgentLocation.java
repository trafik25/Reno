package UI;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class UI_AgentLocation {
    public static void main(String[] args) throws Exception {
        FirefoxDriver wd;
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("https://www.cashpayment.com/");
        wd.findElement(By.name("searchAddress")).click();
        wd.findElement(By.name("searchAddress")).clear();
        wd.findElement(By.name("searchAddress")).sendKeys("48382");
        wd.findElement(By.xpath("//div[@class='how-it-works']//button[.='Search address']")).click();
        WebElement market = wd.findElement(By.xpath(".//*[@id='map-results']/tbody/tr[1]/th"));
        
    	if (market.isDisplayed()) {
	        System.out.println("Test Passed!");
		} else {
 
            System.out.println("Test Failed");
            
        }
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
	



