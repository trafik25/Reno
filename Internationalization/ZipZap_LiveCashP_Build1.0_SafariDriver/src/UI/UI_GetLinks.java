package UI;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class UI_GetLinks {


	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://staging.cashpayment.com/");
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
		
		System.out.println("**********************");


		for (int i=0; i<allLinks.size() ; i++) {
		System.out.println(allLinks.get(i).getText());
	
		
		WebElement link1 = driver.findElement(By.xpath(".//*[@id='top-nav']/li[1]/a[1]"));
		if (link1.isDisplayed()) {
	        System.out.println("Test Passed!");
		} else {
 
            System.out.println("Test Failed");
        }

		
		
		WebElement link2 = driver.findElement(By.xpath(".//*[@id='signUp_link']"));
		if (link2.isDisplayed()) {
	        System.out.println("Test Passed!");
		} else {
 
            System.out.println("Test Failed");
        }
		
		
		WebElement link3 = driver.findElement(By.xpath(".//*[@id='login_link']"));
		if (link3.isDisplayed()) {
	        System.out.println("Test Passed!");
		} else {
 
            System.out.println("Test Failed");
        }
		
		
		WebElement link4 = driver.findElement(By.xpath(".//*[@id='top-nav']/li[2]/a"));
		if (link4.isDisplayed()) {
	        System.out.println("Test Passed!");
		} else {
 
            System.out.println("Test Failed");
        }
		
//		WebElement link5 = driver.findElement(By.xpath("xxxxx"));
//		if (link5.isDisplayed()) {
//	        System.out.println("Test Passed!");
//		} else {
// 
//            System.out.println("Test Failed");
//        }
		
		//extracting links for an entire page and printing those link names and number of links to the console
		
		
		


		
		//driver.quit();
		
		
		
	}
		}
}


