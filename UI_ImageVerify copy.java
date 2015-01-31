package UI;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class UI_ImageVerify {
public static void main(String[] args) {
	 FirefoxDriver wd;
    wd = new FirefoxDriver();
    wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    wd.get("https://www.cashpayment.com/");
	      //live site https://www.cashpayment.com
		
		//LOGO 
		WebElement logo = wd.findElement(By.xpath(".//*[@id='header']/a/img"));
		logo.isDisplayed();

		
		//LOCATION MAP 
		WebElement locationMap = wd.findElement(By.id("laptop"));
		locationMap.isDisplayed();
		
		//CREDIT CARD 
		WebElement creditCard = wd.findElement(By.xpath(".//*[@id='home-icons']/ul[1]/li[2]/img"));
		creditCard.isDisplayed();
		
		//ID PROTECTION 
		WebElement idProtection = wd.findElement(By.xpath(".//*[@id='home-icons']/ul[1]/li[3]/img"));
		idProtection.isDisplayed();
		
		//LOCK 
		WebElement lock = wd.findElement(By.xpath(".//*[@id='home-icons']/ul[2]/li[1]/img"));
		lock.isDisplayed();
		
		//LIGHTNING BOLT 
		WebElement lightningBolt = wd.findElement(By.xpath(".//*[@id='home-icons']/ul[2]/li[2]/img"));
		lightningBolt.isDisplayed();		
				
		//FREE ACCOUNT 
		WebElement freeAcct = wd.findElement(By.xpath(".//*[@id='home-icons']/ul[2]/li[3]/img"));
		freeAcct.isDisplayed();		
				
		//SHOPPING CART 
		WebElement shoppingCart = wd.findElement(By.xpath(".//*[@id='wrapper']/div[4]/img[1]"));
		shoppingCart.isDisplayed();		
		
				
		//PIN DROP MAP 
		WebElement pinDropMap = wd.findElement(By.xpath(".//*[@id='wrapper']/div[4]/img[2]"));
		pinDropMap.isDisplayed();		
				
				
		//MONEY PILE 
		WebElement money = wd.findElement(By.xpath(".//*[@id='wrapper']/div[4]/img[3]"));
		money.isDisplayed();	
				
		//SEARCH MAP 
		WebElement searchMap = wd.findElement(By.xpath(".//*[@id='wrapper']/div[4]/div[5]/img"));
		searchMap.isDisplayed();		
				
		
		
		
		
		wd.close();
				

	    
	}
	
}


