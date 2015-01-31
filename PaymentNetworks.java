package BackOffice_Account;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class PaymentNetworks {

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
        //CHANGE TAB (IF NOT BASIC)
        WebElement changeTab = wd.findElement(By.xpath(".//*[@id='tabs']/ul/li[7]/a"));
        changeTab.click();
        
        
      //.//*[@id='tabs']/ul/li[2]/a COMPANY 
        //.//*[@id='tabs']/ul/li[3]/a COMPANY OWNER
        //.//*[@id='tabs']/ul/li[4]/a BANK PAYMENT
        //.//*[@id='tabs']/ul/li[5]/a MERCH AGREEMENT
        //.//*[@id='tabs']/ul/li[6]/a MERCH CUST FEE
        //.//*[@id='tabs']/ul/li[7]/a  PAYMENT NETWORKS
        //.//*[@id='tabs']/ul/li[9]/a  REQ DATA (not used)
        
        
        //***********************START TEST HERE***********************
        //Softgate/IPP
        WebElement softgate = wd.findElement(By.xpath(".//*[@id='tabs']/ul/li[7]/a"));
        softgate.equals("Softgate Systems/IPP");
        
        boolean softgateChk = wd.findElement(By.xpath(".//*[@id='pn']/fieldset/div[2]/input[1]")).isSelected();
        
         //Cyberplat
        WebElement CyberPlat = wd.findElement(By.xpath(".//*[@id='tabs']/ul/li[7]/a"));
        CyberPlat.equals("CyberPlat");
        
        boolean cyberplayChk = wd.findElement(By.xpath(".//*[@id='pn']/fieldset/div[2]/input[2]")).isSelected();
        
        //Rendimento
        WebElement rendimento = wd.findElement(By.xpath(".//*[@id='tabs']/ul/li[7]/a"));
        rendimento.equals("CyberPlat");
        
        boolean rendimentoChk = wd.findElement(By.xpath(".//*[@id='pn']/fieldset/div[2]/input[3]")).isSelected();
        
        
        //Qiwi
        WebElement qiwi = wd.findElement(By.xpath(".//*[@id='tabs']/ul/li[7]/a"));
        qiwi.equals("CyberPlat");
        
        boolean qiwiChk = wd.findElement(By.xpath(".//*[@id='pn']/fieldset/div[2]/input[4]")).isSelected();
        
        
        //MoneyGram
        WebElement moneygram = wd.findElement(By.xpath(".//*[@id='tabs']/ul/li[7]/a"));
        moneygram.equals("CyberPlat");
        
        boolean moneygramChk = wd.findElement(By.xpath(".//*[@id='pn']/fieldset/div[2]/input[5]")).isSelected();
        
        
        //EBANX
        WebElement ebanx = wd.findElement(By.xpath(".//*[@id='tabs']/ul/li[7]/a"));
        ebanx.equals("CyberPlat");
        
        boolean ebanxChk = wd.findElement(By.xpath(".//*[@id='pn']/fieldset/div[2]/input[6]")).isSelected();
        
        
        //Click the Save button
        WebElement save = wd.findElement(By.xpath(".//*[@id='pn']/div/input"));
        save.click();
        
        
        
        
        wd.close();
        
        
	}
}
