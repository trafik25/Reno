package UI;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UI_Headings {


public static void main(String[] args) throws Exception {
      FirefoxDriver wd;
      wd = new FirefoxDriver();
      wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
      wd.get("https://www.cashpayment.com/");
    
      //H1  Shop Online, Pay Cash Offlineª
      assertTrue(wd.getPageSource().contains("Shop Online, Pay Cash Offlineª"));
      
      //H1 via xpath
      WebElement h1 = wd.findElement(By.xpath(".//*[@id='header']/a/img"));
	  h1.isDisplayed();
		
	  
	  //H2  Why Cash ?
      assertTrue(wd.getPageSource().contains("Why Cash ?"));
      
      //H2 via xpath
      WebElement h2 = wd.findElement(By.xpath(".//*[@id='wrapper']/h1[1]"));
	  h2.isDisplayed();
		
	  
	  //H3  How it Works
      assertTrue(wd.getPageSource().contains("How it Works"));
      
      //H3 via xpath
      WebElement h3 = wd.findElement(By.xpath(".//*[@id='wrapper']/h1[2]"));
	  h2.isDisplayed();
	  
	  //H4  
      assertTrue(wd.getPageSource().contains("A payment center is just around the corner"));
      
      //H4 via xpath
      WebElement h4 = wd.findElement(By.xpath(".//*[@id='wrapper']/div[4]/h1"));
	  h2.isDisplayed();
	  
      
      wd.close();
      
      
}

private static void assertTrue(boolean contains) {
	// TODO Auto-generated method stub
	
}
}
