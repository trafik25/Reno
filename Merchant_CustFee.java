package BackOffice_Account;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Merchant_CustFee {

	
	

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
        
        
        //***********************EBANX BOX***********************
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
        
        
        
        
        
        //****************************CLICK ADD FEE TIER************************
        //Add Fee Tier .//*[@id='7']/fieldset/div[1]/div[2]/input[1]
        WebElement addFeeTier = wd.findElement(By.xpath(".//*[@id='7']/fieldset/div[1]/div[2]/input[1]"));
        addFeeTier.click();
        
        //Min Value Present .//*[@id='feeTier.MinAmount']
        WebElement minValPresent = wd.findElement(By.xpath(".//*[@id='feeTier.MinAmount']"));
        minValPresent.isDisplayed();
        
        //Max Value Present .//*[@id='feeTier.MaxAmount']
        WebElement maxValPresent = wd.findElement(By.xpath(".//*[@id='feeTier.MaxAmount']"));
        maxValPresent.isDisplayed();
        
        //Remove Fee Tier .//*[@id='7']/fieldset/div[1]/div[2]/input[2]
        WebElement removeFeeTier = wd.findElement(By.xpath(".//*[@id='7']/fieldset/div[1]/div[2]/input[1]"));
        removeFeeTier.click();
        
        
        //*******************************ADDS A SECOND FEE TIER***************************
        //Add Fee Tier (adds another line, ensure this line appears) 
        WebElement addFeeTier1 = wd.findElement(By.xpath(".//*[@id='7']/fieldset/div[1]/div[2]/input[1]"));
        addFeeTier1.click();
        
        	
        //*******************************WRITE TO THE FEE TIERS***************************
        WebElement minValPresent2 = wd.findElement(By.xpath(".//*[@id='feeTier.MinAmount']"));
        minValPresent2.sendKeys("2.00");
        	
        WebElement maxValPresent2 = wd.findElement(By.xpath(".//*[@id='feeTier.MaxAmount']"));
        maxValPresent2.sendKeys("2.00");
        
        //Save the data
        WebElement save3 = wd.findElement(By.xpath(".//*[@id='7']/fieldset/div[8]/input"));
        save3.click();
        
        //Data is correct
        WebElement minValPresent3 = wd.findElement(By.xpath(".//*[@id='feeTier.MinAmount']"));
        minValPresent3.equals("2.00");
        	
        //Data is correct
        WebElement maxValPresent3 = wd.findElement(By.xpath(".//*[@id='feeTier.MaxAmount']"));
        maxValPresent3.equals("2.00");
        
        Thread.sleep(2000);
        
        //*******************************CHANGE FEES BACK TO ZERO***************************
        WebElement minValPresent4 = wd.findElement(By.xpath(".//*[@id='feeTier.MinAmount']"));
        minValPresent4.sendKeys("0.00");
        	
        WebElement maxValPresent4 = wd.findElement(By.xpath(".//*[@id='feeTier.MaxAmount']"));
        maxValPresent4.sendKeys("0.00");
        
        //Save the data
        WebElement save4 = wd.findElement(By.xpath(".//*[@id='7']/fieldset/div[8]/input"));
        save3.click();
        
        
        

        
        //Customer Fee Scheme (4 choice)
        //****************Drop Down options (select)
        //Flat Fee or Percentage Amount  .//*[@id='CustomerSchemeID']
        WebElement pctAmount = wd.findElement(By.xpath(".//*[@id='CustomerSchemeID']"));
        pctAmount.sendKeys("Flat fee or percentage of amount");
        
        WebElement savepctAmt = wd.findElement(By.xpath(".//*[@id='7']/fieldset/div[8]/input"));
        savepctAmt.click();
        
        WebElement pctAmount1 = wd.findElement(By.xpath(".//*[@id='CustomerSchemeID']"));
        pctAmount1.equals("Flat fee or percentage of amount");
        
        Thread.sleep(2000);
        
        //% + flat fee added to surcharge
        WebElement pctSurcharge = wd.findElement(By.xpath(".//*[@id='CustomerSchemeID']"));
        pctSurcharge.sendKeys("Percentage + flat fee added as a surcharge");
        
        WebElement savepctSur = wd.findElement(By.xpath(".//*[@id='7']/fieldset/div[8]/input"));
        savepctSur.click();
        
        WebElement pctSurcharge1 = wd.findElement(By.xpath(".//*[@id='CustomerSchemeID']"));
        pctSurcharge1.equals("Percentage + flat fee added as a surcharge");
        
        Thread.sleep(2000);
        
        //% with Max
        WebElement pctMax = wd.findElement(By.xpath(".//*[@id='CustomerSchemeID']"));
        pctMax.sendKeys("Percentage with a maximum");
        
        WebElement savepctMax = wd.findElement(By.xpath(".//*[@id='7']/fieldset/div[8]/input"));
        savepctMax.click();
        
        WebElement pctMax1 = wd.findElement(By.xpath(".//*[@id='CustomerSchemeID']"));
        pctMax1.equals("Percentage with a maximum");
        
        Thread.sleep(2000);
        
        //% with Min
        WebElement pctMin = wd.findElement(By.xpath(".//*[@id='CustomerSchemeID']"));
        pctMin.sendKeys("Percentage with a minimum");
        
        WebElement savepctMin = wd.findElement(By.xpath(".//*[@id='7']/fieldset/div[8]/input"));
        savepctMin.click();
        
        WebElement pctMin1 = wd.findElement(By.xpath(".//*[@id='CustomerSchemeID']"));
        pctMin1.equals("Percentage with a minimum");
        
        
        
        
        
        //************Select a currency
        //BRL
        WebElement brazil = wd.findElement(By.xpath(".//*[@id='CustomerSchemeID']"));
        brazil.sendKeys("BRL");
        
        WebElement saveBRL = wd.findElement(By.xpath(".//*[@id='7']/fieldset/div[8]/input"));
        saveBRL.click();
        
        Thread.sleep(2000);
        
        WebElement brazil1 = wd.findElement(By.xpath(".//*[@id='CustomerSchemeID']"));
        brazil1.equals("BRL");
        
      
        
        //RUB
        WebElement russia = wd.findElement(By.xpath(".//*[@id='CustomerSchemeID']"));
        russia.sendKeys("RUB");
        
        WebElement saveRUB = wd.findElement(By.xpath(".//*[@id='7']/fieldset/div[8]/input"));
        saveRUB.click();
        
        Thread.sleep(2000);
        
        WebElement russia1 = wd.findElement(By.xpath(".//*[@id='CustomerSchemeID']"));
        russia1.equals("RUB");
    
        //USD
        WebElement unitedStates = wd.findElement(By.xpath(".//*[@id='CustomerSchemeID']"));
        unitedStates.sendKeys("USD");
        
        WebElement saveUSD = wd.findElement(By.xpath(".//*[@id='7']/fieldset/div[8]/input"));
        saveUSD.click();
        
        Thread.sleep(2000);
        
        WebElement unitedStates1 = wd.findElement(By.xpath(".//*[@id='CustomerSchemeID']"));
        unitedStates1.equals("USD");
        
   
        
        //UAH
        WebElement ukraine = wd.findElement(By.xpath(".//*[@id='CustomerSchemeID']"));
        ukraine.sendKeys("UAH");
        
        WebElement saveUAH = wd.findElement(By.xpath(".//*[@id='7']/fieldset/div[8]/input"));
        saveUAH.click();
        
        Thread.sleep(2000);
        
        WebElement ukraine1 = wd.findElement(By.xpath(".//*[@id='CustomerSchemeID']"));
        ukraine1.equals("UAH");
        
        
        Thread.sleep(2000);
        
        //Merchant Fee Scheme (4 choice)
        //****************Drop Down options (select)
        //Flat Fee or Percentage Amount
        WebElement MF1 = wd.findElement(By.xpath(".//*[@id='MerchSchemeID']"));
        MF1.sendKeys("Flat fee or percentage of amount");
        
        WebElement saveMF = wd.findElement(By.xpath(".//*[@id='7']/fieldset/div[8]/input"));
        saveMF.click();
        
        Thread.sleep(2000);
        
        WebElement MF2 = wd.findElement(By.xpath(".//*[@id='MerchSchemeID']"));
        MF2.equals("Flat fee or percentage of amount");
        
        
        
        //% + flat fee added to surcharge
        WebElement MF3 = wd.findElement(By.xpath(".//*[@id='MerchSchemeID']"));
        MF3.sendKeys("Percentage + flat fee added as a surcharge ");
        
        WebElement saveMF1 = wd.findElement(By.xpath(".//*[@id='7']/fieldset/div[8]/input"));
        saveMF1.click();
        
        Thread.sleep(2000);
        
        WebElement MF4 = wd.findElement(By.xpath(".//*[@id='MerchSchemeID']"));
        MF4.equals("Percentage + flat fee added as a surcharge ");
        
        //% with Max
        WebElement MF5 = wd.findElement(By.xpath(".//*[@id='MerchSchemeID']"));
        MF5.sendKeys("Percentage with a maximum");
        
        WebElement saveMF2 = wd.findElement(By.xpath(".//*[@id='7']/fieldset/div[8]/input"));
        saveMF2.click();
        
        Thread.sleep(2000);
        
        WebElement MF6 = wd.findElement(By.xpath(".//*[@id='MerchSchemeID']"));
        MF6.equals("Percentage with a maximum");
        
        //% with Min
        WebElement MF7 = wd.findElement(By.xpath(".//*[@id='MerchSchemeID']"));
        MF7.sendKeys("Percentage with a minimum");
        
        WebElement saveMF3 = wd.findElement(By.xpath(".//*[@id='7']/fieldset/div[8]/input"));
        saveMF3.click();
        
        Thread.sleep(2000);
        
        WebElement MF8 = wd.findElement(By.xpath(".//*[@id='MerchSchemeID']"));
        MF8.equals("Percentage with a minimum");
        
        

        wd.close();
        
        
	}

	
}
