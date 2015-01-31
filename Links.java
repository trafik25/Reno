package Merchant_CreateOrder;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Links {


	public static void main(String[] args) {

		WebDriver wd = new FirefoxDriver();
		wd.get("https://staging.cashpayment.com/");
		
		
		//***********************Merchant Login Information*************************

		 //Merchant Login Link Click
       WebElement merchantLogin = wd.findElement(By.xpath(".//*[@id='login_link']"));
       merchantLogin.click();
       
       //Username
       WebElement merchantLogin1 = wd.findElement(By.xpath(".//*[@id='UserName']"));
       merchantLogin1.sendKeys("thomas.boston617@gmail.com");
       
       //Password
       WebElement merchantLogin2 = wd.findElement(By.xpath(".//*[@id='password1']"));
       merchantLogin2.sendKeys("chinese45");
       
       //Click Sign In Button
       WebElement signIn = wd.findElement(By.xpath(".//*[@id='signin']/p[3]/button"));
       signIn.click();
       
       
       
       
		//***********************BEGIN TEST*************************
       	//Language Link is present
		WebElement langLink = wd.findElement(By.linkText("Language"));
		langLink.isDisplayed();
		
		//Account Link is present
		WebElement account = wd.findElement(By.linkText("Account"));
		account.isDisplayed();
		
		//Order History Link is present
		WebElement orderHistory = wd.findElement(By.linkText("Order History"));
		orderHistory.isDisplayed();
		
		//Profile Link is present
		WebElement profile = wd.findElement(By.linkText("Profile"));
		profile.isDisplayed();
		
		//Create order link is present
		WebElement createOrder = wd.findElement(By.linkText("Create Order"));
		createOrder.isDisplayed();

		// Logoff link is present
		WebElement logOff = wd.findElement(By.linkText("Log Off"));
		logOff.isDisplayed();
		
		
		wd.close();
		
		
	}
}
		