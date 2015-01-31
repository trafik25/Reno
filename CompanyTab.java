package BackOffice_Account;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CompanyTab {

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
        
        //Find Merchantdemo account using filters
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
        //only need to change the tab if its not basic tab
        //Change tab to Company tab
        WebElement changeTab = wd.findElement(By.xpath(".//*[@id='tabs']/ul/li[2]/a"));
        changeTab.click();
        
        //Company Name .//*[@id='CompanyName']
        WebElement password1 = wd.findElement(By.xpath(".//*[@id='CompanyName']"));
        password1.equals("ZipZap Merchant Demo");
        
        //Business DBA Name .//*[@id='BusinessDBAName']
        WebElement dba = wd.findElement(By.xpath(".//*[@id='BusinessDBAName']"));
        dba.equals("MerchantDemo");
        
        //Physical Address .//*[@id='CompanyAddress']
        WebElement address = wd.findElement(By.xpath(".//*[@id='CompanyAddress']"));
        address.equals("182 Howard St., #207 San Francisco CA 94105");
        
        //Country Company is Based .//*[@id='Country']
        WebElement country = wd.findElement(By.xpath(".//*[@id='Country']"));
        country.equals("United States");
        
        //Phone .//*[@id='CompanyPhone']
        WebElement phone = wd.findElement(By.xpath(".//*[@id='CompanyPhone']"));
        phone.equals("218.839.4596");
        
        //URL .//*[@id='CompanyURL']
        WebElement url = wd.findElement(By.xpath(".//*[@id='CompanyURL']"));
        url.equals("http://demo.cashpayment.com/");
        
        //Type of Legal Entity .//*[@id='TypeOfLegalEntity']
        WebElement legal = wd.findElement(By.xpath(".//*[@id='TypeOfLegalEntity']"));
        legal.equals("Limited Liability Company (LLC)");
        
        //Where Incorporated or Formed .//*[@id='WhereIncorporatedOrFormed']
        WebElement inc = wd.findElement(By.xpath(".//*[@id='WhereIncorporatedOrFormed']"));
        inc.equals("CA");
        
        //Don’t Have a Government Registration Number or Tax ID?
        // .//*[@id='Company_DontHaveGovernmentRegistrationNumber']
        WebElement gov = wd.findElement(By.xpath(".//*[@id='Company_DontHaveGovernmentRegistrationNumber']"));
        gov.click();
        
        Thread.sleep(3000);
        
        //Gov reclick Reg Number
        WebElement gov1 = wd.findElement(By.xpath(".//*[@id='Company_DontHaveGovernmentRegistrationNumber']"));
        gov1.click();
        
        wd.close();
        
        
	}
}
