package UI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class UI_ImageVerify {

	
	
	
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://staging.cashpayment.com/");

		//LOGO TEST
		WebElement logo = driver.findElement(By.xpath(".//*[@id='header']/a/img"));
		if (logo.isDisplayed()) {
	        System.out.println("Test Passed!");
		} else {
 
            System.out.println("Test Failed");
        }
		
		//LOCATION MAP TEST
		WebElement locationMap = driver.findElement(By.xpath(".//*[@id='home-icons']/ul[1]/li[1]/img"));
		if (locationMap.isDisplayed()) {
	        System.out.println("Test Passed!");
		} else {
 
            System.out.println("Test Failed");
        }
		
		//CREDIT CARD TEST
		WebElement creditCard = driver.findElement(By.xpath(".//*[@id='home-icons']/ul[1]/li[2]/img"));
		if (creditCard.isDisplayed()) {
	        System.out.println("Test Passed!");
		} else {
 
            System.out.println("Test Failed");
        }
		
		//ID PROTECTION TEST
		WebElement idProtection = driver.findElement(By.xpath(".//*[@id='home-icons']/ul[1]/li[3]/img"));
		if (idProtection.isDisplayed()) {
	        System.out.println("Test Passed!");
		} else {
 
            System.out.println("Test Failed");
        }
		
		
		//LOCK TEST
				WebElement lock = driver.findElement(By.xpath(".//*[@id='home-icons']/ul[2]/li[1]/img"));
				if (lock.isDisplayed()) {
			        System.out.println("Test Passed!");
				} else {
		 
		            System.out.println("Test Failed");
		        }
				
		//LIGHTNING BOLT TEST
				WebElement lightningBolt = driver.findElement(By.xpath(".//*[@id='home-icons']/ul[2]/li[2]/img"));
				if (lightningBolt.isDisplayed()) {
			        System.out.println("Test Passed!");
				} else {
		 
		            System.out.println("Test Failed");
		        }
		
				
				//FREE ACCOUNT TEST
				WebElement freeAcct = driver.findElement(By.xpath(".//*[@id='home-icons']/ul[2]/li[3]/img"));
				if (freeAcct.isDisplayed()) {
			        System.out.println("Test Passed!");
				} else {
		 
		            System.out.println("Test Failed");
		        }
				
				//SHOPPING CART TEST
				WebElement shoppingCart = driver.findElement(By.xpath(".//*[@id='wrapper']/div[4]/img[1]"));
				if (shoppingCart.isDisplayed()) {
			        System.out.println("Test Passed!");
				} else {
		 
		            System.out.println("Test Failed");
		        }
		
				
				//PIN DROP MAP TEST
				WebElement pinDropMap = driver.findElement(By.xpath(".//*[@id='wrapper']/div[4]/img[2]"));
				if (pinDropMap.isDisplayed()) {
			        System.out.println("Test Passed!");
				} else {
		 
		            System.out.println("Test Failed");
		        }
				
				
				//MONEY PILE TEST
				WebElement money = driver.findElement(By.xpath(".//*[@id='wrapper']/div[4]/img[3]"));
				if (money.isDisplayed()) {
			        System.out.println("Test Passed!");
				} else {
		 
		            System.out.println("Test Failed");
		        }
				
				//SEARCH MAP TEST
				WebElement searchMap = driver.findElement(By.xpath(".//*[@id='wrapper']/div[4]/div[5]/img"));
				if (searchMap.isDisplayed()) {
			        System.out.println("Test Passed!");
				} else {
		 
		            System.out.println("Test Failed");
		        }
				
				driver.close();
				
				
				
//*********XPATHS OF IMAGES ON THE HOMEPAGE
//		WebElement laptop = driver.findElement(By.xpath(".//*[@id='laptop']"));
//		WebElement locationMap = driver.findElement(By.xpath(".//*[@id='home-icons']/ul[1]/li[1]/img"));
//		WebElement creditCard = driver.findElement(By.xpath(".//*[@id='home-icons']/ul[1]/li[2]/img"));
//		WebElement idProtection = driver.findElement(By.xpath(".//*[@id='home-icons']/ul[1]/li[3]/img"));
//		WebElement lock = driver.findElement(By.xpath(".//*[@id='home-icons']/ul[2]/li[1]/img"));
//		WebElement lightningBolt = driver.findElement(By.xpath(".//*[@id='home-icons']/ul[2]/li[2]/img"));
//		WebElement freeAcct = driver.findElement(By.xpath(".//*[@id='home-icons']/ul[2]/li[3]/img"));
//		WebElement shoppingCart = driver.findElement(By.xpath(".//*[@id='wrapper']/div[4]/img[1]"));
//		WebElement pinDropMap = driver.findElement(By.xpath(".//*[@id='wrapper']/div[4]/img[2]"));
//		WebElement money = driver.findElement(By.xpath(".//*[@id='wrapper']/div[4]/img[3]"));
//		WebElement bigMap = driver.findElement(By.xpath(".//*[@id='wrapper']/div[4]/div[5]/img"));



	    
	    
	}
	
}


