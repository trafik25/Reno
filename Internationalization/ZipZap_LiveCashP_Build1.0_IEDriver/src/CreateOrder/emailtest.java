package CreateOrder;
//This is a crucial POST build test   

//Change emails and phone numbers


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;


public class emailtest {

	public static void main(String[] args) throws Exception {
        FirefoxDriver wd;
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("https://www.gmail.com");

 
 //Supply username
 WebElement username = wd.findElement(By.xpath(".//*[@id='Email']"));
 username.sendKeys("thomashoward206@gmail.com");
 
 //Supply password
 WebElement password = wd.findElement(By.xpath(".//*[@id='Passwd']"));
 password.sendKeys("jordan2013");
 
//Signin
 WebElement signIn1 = wd.findElement(By.xpath(".//*[@id='signIn']"));
 signIn1.click();
 
 
 Thread.sleep(1000);
 
 //Click ZZ email
 WebElement readMessage = wd.findElement(By.xpath(".//*[@id=':6e']/b"));
 readMessage.click();
 
 //View email
 WebElement readMessage1 = wd.findElement(By.xpath(".//*[@id=':61'] "));
 readMessage1.isDisplayed();

 
 wd.close();
 
}
}
 