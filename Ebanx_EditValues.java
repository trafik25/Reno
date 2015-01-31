package BackOffice_Account;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Ebanx_EditValues {

	
	

	public static void main(String[] args) throws Exception {
        FirefoxDriver wd;
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("https://www.cashpayment.com/BackOffice");
        
        
        //***********************LOGIN to BackOffice***********************
        //SendKeys username
        WebElement username = wd.findElement(By.xpath(".//*[@id='UserName']"));
        username.sendKeys("tomhoward");
		
        //SendKeys password
        WebElement password = wd.findElement(By.xpath(".//*[@id='Password']"));
        password.sendKeys("tiesto25");
		
		//Click Signin button  .//*[@id='signin']/p[3]/button
        WebElement signIn = wd.findElement(By.xpath(".//*[@id='page']/div[3]/form/p[1]/input"));
        signIn.click();
        
        
        //***********************Navigate the Backoffice***********************
        //Filter accountID .//*[@id='fb']
        WebElement filter1 = wd.findElement(By.xpath(".//*[@id='fb']"));
        filter1.sendKeys("Account ID");
        
        //Clear the value  .//*[@id='fv']
        WebElement filter2 = wd.findElement(By.xpath(".//*[@id='fv']"));
        filter2.clear();
        filter2.sendKeys("229863501");
        
        //Click Apply filter .//*[@id='page']/form/input[4]
        WebElement apply = wd.findElement(By.xpath(".//*[@id='page']/form/input[4]"));
        apply.click();
        
        //Click the Account link .//*[@id='page']/table/tbody/tr[2]/td[10]/a
        WebElement accLink = wd.findElement(By.xpath(".//*[@id='page']/table/tbody/tr[2]/td[10]/a"));
        accLink.click();
        
        
        //***********************Navigate Merchant Account Tabs***********************
        //CHANGE TAB
        WebElement changeTab = wd.findElement(By.xpath(".//*[@id='tabs']/ul/li[6]/a"));
        changeTab.click();
        
        //.//*[@id='tabs']/ul/li[2]/a COMPANY 
        //.//*[@id='tabs']/ul/li[3]/a COMPANY OWNER
        //.//*[@id='tabs']/ul/li[4]/a BANK PAYMENT
        //.//*[@id='tabs']/ul/li[5]/a MERCH AGREEMENT
        //.//*[@id='tabs']/ul/li[6]/a MERCH CUST FEE
        //.//*[@id='tabs']/ul/li[7]/a  PAYMENT NETWORKS
        //.//*[@id='tabs']/ul/li[9]/a  REQ DATA

		 
        //**********************************************EBANX BOX/**********************************************
        //CustomerFeeAmount
        WebElement customerFeeAmount = wd.findElement(By.xpath(".//*[@id='CustomerFeeAmount']"));
        customerFeeAmount.sendKeys("3.95");
        
        //CustomerFeePercent
        WebElement customerFeePct = wd.findElement(By.xpath(".//*[@id='CustomerFeePercent']"));
        customerFeePct.sendKeys("3.95");
        
        //Merchant Fee Amount
        WebElement merchFeeAmt = wd.findElement(By.xpath(".//*[@id='PNFeeAmount']"));
        merchFeeAmt.sendKeys("3.95");
        
        //Merchant Fee Percent
        WebElement merchFeePct = wd.findElement(By.xpath(".//*[@id='PNFeePercent']"));
        merchFeePct.sendKeys("3.95");
        
        //Save this data and verify it exists
        WebElement save = wd.findElement(By.xpath(".//*[@id='7']/fieldset/div[8]/input"));
        save.click();
        
        Thread.sleep(2000);
 
        //***********************VERIFY EBANX FEES********************
       //Customer Fee Amount
        WebElement customerFeeAmount1 = wd.findElement(By.xpath(".//*[@id='CustomerFeeAmount']"));
        customerFeeAmount1.equals("3.95");
        
        //CustomerFeePercent
        WebElement customerFeePct1 = wd.findElement(By.xpath(".//*[@id='CustomerFeePercent']"));
        customerFeePct1.equals("3.95");
        
        //Merchant Fee Amount
        WebElement merchFeeAmt1 = wd.findElement(By.xpath(".//*[@id='PNFeeAmount']"));
        merchFeeAmt1.equals("3.95");
        
        //Merchant Fee Percent
        WebElement merchFeePct1 = wd.findElement(By.xpath(".//*[@id='PNFeePercent']"));
        merchFeePct1.equals("3.95");
        
        Thread.sleep(2000);
         
        //***********************CHANGE EBANX FEES TO ZERO********************
        //CustomerFeeAmount
        WebElement customerFeeAmount2 = wd.findElement(By.xpath(".//*[@id='CustomerFeeAmount']"));
        customerFeeAmount2.clear();
        customerFeeAmount2.sendKeys("0");
        
        //CustomerFeePercent
        WebElement customerFeePct2 = wd.findElement(By.xpath(".//*[@id='CustomerFeePercent']"));
        customerFeePct2.clear();
        customerFeePct2.sendKeys("0");
        
        //Merchant Fee Amount
        WebElement merchFeeAmt2 = wd.findElement(By.xpath(".//*[@id='PNFeeAmount']"));
        merchFeeAmt2.clear();
        merchFeeAmt2.sendKeys("0");
        
        //Merchant Fee Percent
        WebElement merchFeePct2 = wd.findElement(By.xpath(".//*[@id='PNFeePercent']"));
        merchFeePct2.clear();
        merchFeePct2.sendKeys("0");
        
        WebElement save1 = wd.findElement(By.xpath(".//*[@id='7']/fieldset/div[8]/input"));
        save1.click();
        
        
        
        
        
        
        wd.close();
        
	}
}