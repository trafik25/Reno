package UI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class UI_Internationalization_test {

	
	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.adobe.com");
		
		
		// drop down lists example
		

		//get the element that shows menu with the mouseOver event
		WebElement menu = driver.findElement(By.xpath(".//*[@id='target']/dt/a"));

		//the element that I want to click (hidden)
		WebElement menuOption = driver.findElement(By.xpath(".//*[@id='shProductsAcrobat']/span/a"));

		//build and perform the mouseOver with Advanced User Interactions API
		Actions builder = new Actions(driver);    
		builder.moveToElement(menu).build().perform();

		//then click when menu option is visible
		menuOption.click();
		
		//driver.quit();
		
		
		
		
	}

}