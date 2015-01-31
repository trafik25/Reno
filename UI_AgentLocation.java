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
        //live site https://www.cashpayment.com/
        
        //Enter in Zip Code  .//*[@id='wrapper']/div[4]/div[5]/form/input
        WebElement zipCode = wd.findElement(By.xpath(".//*[@id='wrapper']/div[4]/div[5]/form/input"));
        zipCode.sendKeys("48382");
        
       //Search Address
		WebElement address = wd.findElement(By.xpath(".//*[@id='wrapper']/div[4]/div[5]/form/button"));
		address.click();
        
        //Find market name is displayed
		assertTrue(wd.getPageSource().contains("BROWNS MARKET"));

        
        //Market Address  Assert Statement
		assertTrue(wd.getPageSource().contains("5802 STORER"));

        
        //Market City  Assert Statement
		assertTrue(wd.getPageSource().contains("CLEVELAND"));

		wd.close();
    }

	private static void assertTrue(boolean contains) {
		// TODO Auto-generated method stub
		
	}
}
	



