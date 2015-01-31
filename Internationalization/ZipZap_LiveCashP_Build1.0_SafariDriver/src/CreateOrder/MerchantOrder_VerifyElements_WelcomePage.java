package CreateOrder;
//THIS TEST NEEDS TO BE COMPLETED***************************
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MerchantOrder_VerifyElements_WelcomePage {

	public static void main(String[] args) throws Exception {
        FirefoxDriver wd;
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("https://staging.cashpayment.com/");
        
        
        //Navigate to the Create Order Merchant page***********************
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
        
        
        
        //***************START TEST HERE**********************
        //Language Link
        WebElement langLink = wd.findElement(By.xpath(".//*[@id='language-menu']/ul/li[1]/a"));
        langLink.isDisplayed();
        
        //Account Link
        WebElement accountLink = wd.findElement(By.xpath(".//*[@id='fieldWrapper']/div[1]/ul/li[1]/a"));
        accountLink.isDisplayed();
        
        //Order History
        WebElement orderHistoryLink = wd.findElement(By.xpath(".//*[@id='fieldWrapper']/div[1]/ul/li[2]/a"));
        orderHistoryLink.isDisplayed();
        
        //Profile
        WebElement profile = wd.findElement(By.xpath(".//*[@id='fieldWrapper']/div[1]/ul/li[3]/a"));
        profile.isDisplayed();
        
        //Profile
        WebElement createOrder = wd.findElement(By.xpath(".//*[@id='fieldWrapper']/div[1]/ul/li[4]/a"));
        createOrder.isDisplayed();
        
        //Logoff
        WebElement logOff = wd.findElement(By.xpath(".//*[@id='fieldWrapper']/div[1]/ul/li[5]/a"));
        logOff.isDisplayed();
        
        //ZipZap Logo
        WebElement logo = wd.findElement(By.xpath(".//*[@id='copyright']/img"));
        logo.isDisplayed();
        
        //Verify Merchant Name is Present 
        WebElement merchantName = wd.findElement(By.xpath(".//*[@id='fieldWrapper']/div[2]/h2"));
        merchantName.isDisplayed();
        
        
      
        
        
        wd.close();
        
	}
}