package UI;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UI_TextVerify {
  private WebDriver driver;
  private String baseUrl;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://staging.cashpayment.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void test1() throws Exception {
    driver.get(baseUrl + "/");
//  System.out.println("****************START MAIN MENU********************");

    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*View My Payments[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Merchant Sign-Up[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Merchant Log in[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Find Payment Center[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    
////  System.out.println("****************START SHOP ONLINE PAY CASH********************");

    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Shop Online, Pay Cash Offlineª[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    
////  System.out.println("****************START WHY PAY CASH********************");

    
    
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Why Cash [\\s\\S][\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Lots of locations[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*With hundreds of thousands of locations around the world, we've got you covered\\.[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }

    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Ditch Your Card[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }

    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*No more late fees or other hidden fees\\. Cash: plain and simple\\.[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }

    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Identity Protection[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    
    //Good to here
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Shop online without concern for privacy\\.[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
        assertTrue(driver.findElement(By.xpath(".//*[@id='home-icons']/ul[2]/li[1]/h2/strong")).getText().matches("Safe & Secure"));
      } catch (Error e) {
        verificationErrors.append(e.toString());
      }
    try {
        assertTrue(driver.findElement(By.xpath(".//*[@id='home-icons']/ul[2]/li[1]/p")).getText().matches("When you pick us, rest-assured that you deal directly with us: no middlemen, no mystery."));
      } catch (Error e) {
        verificationErrors.append(e.toString());
      }
    try {
        assertTrue(driver.findElement(By.xpath(".//*[@id='home-icons']/ul[2]/li[2]/h2/strong")).getText().matches("Instant Payment"));
      } catch (Error e) {
        verificationErrors.append(e.toString());
      }
    try {
        assertTrue(driver.findElement(By.xpath(".//*[@id='home-icons']/ul[2]/li[2]/p")).getText().matches("We notify the merchants of payment immediately, ensuring that you get your goods as quickly as possible."));
      } catch (Error e) {
        verificationErrors.append(e.toString());
      }
    try {
        assertTrue(driver.findElement(By.xpath(".//*[@id='home-icons']/ul[2]/li[3]/h2/strong")).getText().matches("Free Account"));
      } catch (Error e) {
        verificationErrors.append(e.toString());
      }

    try {
        assertTrue(driver.findElement(By.xpath(".//*[@id='wrapper']/h1[2]")).getText().matches("How It Works"));
      } catch (Error e) {
        verificationErrors.append(e.toString());
      }
    try {
        assertTrue(driver.findElement(By.xpath(".//*[@id='wrapper']/div[4]/div[1]/h3/strong")).getText().matches("Shop"));
      } catch (Error e) {
        verificationErrors.append(e.toString());
      }
    try {
        assertTrue(driver.findElement(By.xpath(".//*[@id='wrapper']/div[4]/div[1]/h3")).getText().matches("Shop Online"));
      } catch (Error e) {
        verificationErrors.append(e.toString());
      }
    try {
        assertTrue(driver.findElement(By.xpath(".//*[@id='wrapper']/div[4]/div[1]/p[1]")).getText().matches("Shop at all of your favorite websites: get the hottest gadgets, find that perfect pair of shoes you've had on your wish-list."));
      } catch (Error e) {
        verificationErrors.append(e.toString());
      }
    try {
        assertTrue(driver.findElement(By.xpath(".//*[@id='wrapper']/div[4]/div[1]/p[2]")).getText().matches("Add the items to your cart and proceed to checkout as you normally would, only this time you're paying with cash."));
      } catch (Error e) {
        verificationErrors.append(e.toString());
      }
    
////    System.out.println("****************START SELECT A PAYMENT CENTER********************");

    try {
        assertTrue(driver.findElement(By.xpath(".//*[@id='wrapper']/div[4]/div[2]/h3/strong")).getText().matches("Select"));
      } catch (Error e) {
        verificationErrors.append(e.toString());
      }
    try {
        assertTrue(driver.findElement(By.xpath(".//*[@id='wrapper']/div[4]/div[2]/h3")).getText().matches("Select A Payment Center"));
      } catch (Error e) {
        verificationErrors.append(e.toString());
      }
    try {
        assertTrue(driver.findElement(By.xpath(".//*[@id='wrapper']/div[4]/div[2]/p[1]")).getText().matches("When you choose to pay with cash at check out, you will be given the option of selecting the closest payment center for added convenience and ease."));
      } catch (Error e) {
        verificationErrors.append(e.toString());
      }
    try {
        assertTrue(driver.findElement(By.xpath(".//*[@id='wrapper']/div[4]/div[2]/p[2]")).getText().matches("With hundreds of thousands of payment centers around the world, shopping online with cash has never been more straightforward."));
      } catch (Error e) {
        verificationErrors.append(e.toString());
      }
    
////  System.out.println("****************START PAY WITH CASH********************");
   try {
        assertTrue(driver.findElement(By.xpath(".//*[@id='wrapper']/div[4]/div[3]/h3/strong")).getText().matches("Pay"));
      } catch (Error e) {
        verificationErrors.append(e.toString());
      }
    try {
        assertTrue(driver.findElement(By.xpath(".//*[@id='wrapper']/div[4]/div[3]/h3")).getText().matches("Pay With Cash"));
      } catch (Error e) {
        verificationErrors.append(e.toString());
      }
    try {
        assertTrue(driver.findElement(By.xpath(".//*[@id='wrapper']/div[4]/div[3]/p[1]")).getText().matches("When you visit the payment center, present the payment slip and pay with cash."));
      } catch (Error e) {
        verificationErrors.append(e.toString());
      }
    try {
        assertTrue(driver.findElement(By.xpath(".//*[@id='wrapper']/div[4]/div[3]/p[2]")).getText().matches("We then notify the merchant and your purchase is sent right along. Simple? Easy? Of course it is: it's how we do things."));
      } catch (Error e) {
        verificationErrors.append(e.toString());
      }
     
 
//  System.out.println("****************START A payment center is just around the corner********************");

    
    try {
        assertTrue(driver.findElement(By.xpath(".//*[@id='wrapper']/div[4]/h1")).getText().matches("A payment center is just around the corner"));
      } catch (Error e) {
        verificationErrors.append(e.toString());
      }
    try {
        assertTrue(driver.findElement(By.xpath(".//*[@id='wrapper']/div[4]/div[4]/p[1]")).getText().matches("In our portfolio of payments centers, we have banks, post offices, grocery stores, kiosks, convenience stores, cyber cafes, and more, ensuring that we have a location that will suit your needs."));
      } catch (Error e) {
        verificationErrors.append(e.toString());
      }
    try {
        assertTrue(driver.findElement(By.xpath(".//*[@id='wrapper']/div[4]/div[4]/p[2]")).getText().matches("We currently have coverage in the US, Brazil, Russia and CIS countries with more locations being added everyday which means that you can expect to have convenient access to a payment center near you."));
      } catch (Error e) {
        verificationErrors.append(e.toString());
      }
    try {
        assertTrue(driver.findElement(By.xpath(".//*[@id='wrapper']/div[4]/div[4]/p[3]")).getText().matches("Just input your location to the right and let us find the closest payment center to you."));
      } catch (Error e) {
        verificationErrors.append(e.toString());
      }
//    try {
//        assertTrue(driver.findElement(By.xpath("xxxxxx")).getText().matches("xxxxxx"));
//      } catch (Error e) {
//        verificationErrors.append(e.toString());
//      }
//    
    
    

  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }
}
