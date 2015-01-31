package ChromeDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicChrome {


	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "//usr//bin//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		
		
		driver.close();
		
	}

}
