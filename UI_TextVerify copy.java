package UI;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UI_TextVerify {


public static void main(String[] args) throws Exception {
      FirefoxDriver wd;
      wd = new FirefoxDriver();
      wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
      wd.get("https://www.cashpayment.com/");
      //live site https://www.cashpayment.com/
    
      //Lots of Locations
      	assertTrue(wd.getPageSource().contains("Lots of locations"));
		assertTrue(wd.getPageSource().contains("With hundreds of thousands of locations around the world, we've got you covered."));
		
		//Ditch your card
		assertTrue(wd.getPageSource().contains("Ditch Your Card"));
		assertTrue(wd.getPageSource().contains("No more late fees or other hidden fees. Cash: plain and simple."));
		
		//Identity Protection
		assertTrue(wd.getPageSource().contains("Identity Protection"));
		assertTrue(wd.getPageSource().contains("Shop online without concern for privacy."));
		
		//Safe & Secure
		assertTrue(wd.getPageSource().contains("Safe & Secure"));
		assertTrue(wd.getPageSource().contains("When you pick us, rest-assured that you deal directly with us: no middlemen, no mystery."));

		//Instant Payment
		assertTrue(wd.getPageSource().contains("Instant Payment"));
		assertTrue(wd.getPageSource().contains("We notify the merchants of payment immediately, ensuring that you get your goods as quickly as possible."));
		
		//Free Account
		assertTrue(wd.getPageSource().contains("Free Account"));
		assertTrue(wd.getPageSource().contains("You'll love the added features of easy check-out and customizable notifications that come with signing up (optional)."));
		
		//Shop Online 
		assertTrue(wd.getPageSource().contains("Shop"));
		assertTrue(wd.getPageSource().contains("Online"));
		assertTrue(wd.getPageSource().contains("Shop at all of your favorite websites: get the hottest gadgets, find that perfect pair of shoes you've had on your wish-list."));
		assertTrue(wd.getPageSource().contains("Add the items to your cart and proceed to checkout as you normally would, only this time you're paying with cash."));

		//Select a Payment Center
		assertTrue(wd.getPageSource().contains("Select"));
		assertTrue(wd.getPageSource().contains("a Payment Center"));
		assertTrue(wd.getPageSource().contains("When you choose to pay with cash at check out, you will be given the option of selecting the closest payment center for added convenience and ease."));
		assertTrue(wd.getPageSource().contains("With hundreds of thousands of payment centers around the world, shopping online with cash has never been more straightforward."));
		
		//Pay With Cash
		assertTrue(wd.getPageSource().contains("Pay"));
		assertTrue(wd.getPageSource().contains("with Cash"));
		assertTrue(wd.getPageSource().contains("When you visit the payment center, present the payment slip and pay with cash."));
		assertTrue(wd.getPageSource().contains("We then notify the merchant and your purchase is sent right along. Simple? Easy? Of course it is: it's how we do things."));
		
		
		//Select a Payment Center
		assertTrue(wd.getPageSource().contains("In our portfolio of payments centers, we have banks, post offices, grocery stores, kiosks, convenience stores, cyber cafes, and more, ensuring that we have a location that will suit your needs."));
		assertTrue(wd.getPageSource().contains("We currently have coverage in the US, Brazil, Russia and CIS countries with more locations being added everyday which means that you can expect to have convenient access to a payment center near you."));
		assertTrue(wd.getPageSource().contains("Just input your location to the right and let us find the closest payment center to you."));
		
		
		

		wd.close();
  }

private static void assertTrue(boolean contains) {
	// TODO Auto-generated method stub
	
}
}
