package Critical_PostBuild;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//create an order and then check "orders" in backoffice for correct amount
public class UI_ClickEachLink {


public static void main(String[] args) throws Exception {
      FirefoxDriver wd;
      wd = new FirefoxDriver();
      wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
      //wd.get("https://staging.www.cashpayment.com/");
      wd.get("https://www.cashpayment.com/");
      //https://www.cashpayment.com/
      
      
    //View My Payments
    WebElement link1 = wd.findElement(By.linkText("View My Payments"));
	link1.click();
	
	wd.navigate().back();
    
	//View My Payments
    WebElement link2 = wd.findElement(By.linkText("Merchant Sign-Up"));
	link2.click();
	
	wd.navigate().back();
	
	//View My Payments
    WebElement link3 = wd.findElement(By.linkText("Merchant Log in"));
	link3.click();
	
	wd.navigate().back();
	
	//View My Payments
    WebElement link4 = wd.findElement(By.linkText("Find Payment Center"));
	link4.click();
	
	
      
      
      wd.close();
      
      
}
}
