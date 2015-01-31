package Critical_PostBuild;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class Logoff {

	public static void main(String[] args) throws Exception {
        FirefoxDriver wd;
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        //wd.get("https://staging.cashpayment.com/");
        wd.get("https://www.cashpayment.com/");
      //change URL for live
        //("https://www.cashpayment.com/")
        //merchantdemo
        //qazwsx1234
        //***********************Merchant Login Information*************************

        
        //Merchant Login Link Click
        WebElement merchantLogin = wd.findElement(By.xpath(".//*[@id='login_link']"));
        merchantLogin.click();
        
        //Username
        WebElement merchantLogin1 = wd.findElement(By.xpath(".//*[@id='UserName']"));
        merchantLogin1.sendKeys("merchantdemo");
        
        //Password
        WebElement merchantLogin2 = wd.findElement(By.xpath(".//*[@id='password1']"));
        merchantLogin2.sendKeys("qazwsx1234");
        
        //Click Sign In Button
        WebElement signIn = wd.findElement(By.xpath(".//*[@id='signin']/p[3]/button"));
        signIn.click();
        
        
        //************************************LOGOFF*********************
        
        //Click Logoff Button  .//*[@id='fieldWrapper']/div[1]/ul/li[5]/a
        WebElement logOff = wd.findElement(By.xpath(".//*[@id='fieldWrapper']/div[1]/ul/li[5]/a"));
        logOff.click();
        
        
        
        
        
        
        
        
        
        wd.close();
        
        
        
        
	}
}
        
        
        
        