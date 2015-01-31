package MerchantOrder;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class MerchantOrder_GetLinks_WelcomePage {


	public static void main(String[] args) {

		WebDriver wd = new FirefoxDriver();
		wd.get("https://staging.cashpayment.com/");
		
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
        
		
		List<WebElement> allLinks = wd.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
		
		System.out.println("**********************");


		for (int i=0; i<allLinks.size() ; i++) {
		System.out.println(allLinks.get(i).getText());
		
		
		
		//extracting links for an entire page and printing those link names and number of links to the console
		
		
		


		
		wd.close();
		
		
		
	}
		}
}


