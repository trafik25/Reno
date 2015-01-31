package BackOffice_Account;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CompanyOwner {

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
        
        
        //***********************Navigate to the Backoffice***********************
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
        //only need to change the tab if its not basic tab
        WebElement changeTab = wd.findElement(By.xpath(".//*[@id='tabs']/ul/li[3]/a"));
        changeTab.click();
        
        //.//*[@id='tabs']/ul/li[2]/a COMPANY 
        //.//*[@id='tabs']/ul/li[3]/a COMPANY OWNER
        //.//*[@id='tabs']/ul/li[4]/a BANK PAYMENT
        //.//*[@id='tabs']/ul/li[5]/a MERCH AGREEMENT
        //.//*[@id='tabs']/ul/li[6]/a MERCH CUST FEE
        //.//*[@id='tabs']/ul/li[7]/a  PAYMENT NETWORKS
        //.//*[@id='tabs']/ul/li[9]/a  REQ DATA
        
        //***********************VERIFY DATA TESTING ***********************
        //FN
        WebElement firstName = wd.findElement(By.xpath(".//*[@id='FirstName']"));
        firstName.equals("Alan");
        
        //LN
        WebElement lastName = wd.findElement(By.xpath(".//*[@id='LastName']"));
        lastName.equals("Safahi");
        
        //% of ownership
        WebElement ownership = wd.findElement(By.xpath(".//*[@id='PercentOfOwnership']"));
        ownership.equals("90");
        
        //DOB
        WebElement dob = wd.findElement(By.xpath(".//*[@id='DateOfBirth']"));
        dob.equals("11/22/2011");
        
        //Dont have Gov Tax ID? (Click)
        WebElement govTaxID = wd.findElement(By.xpath(".//*[@id='CompanyOwner_DontHaveGovernmentID']"));
        govTaxID.click();
        
        Thread.sleep(2000);
        
        //Fill in a Fake Soc number
        WebElement socNum = wd.findElement(By.xpath(".//*[@id='GovernmentIDOrTaxNumber']"));
        socNum.clear();
        socNum.sendKeys("300303000");
        
        //Click Save
        WebElement save = wd.findElement(By.xpath(".//*[@id='company-owner']/div/input"));
        save.click();
        
        Thread.sleep(3000); //wait for page to load
        
       
        //Reclick "Dont have ID" checkbox (this removes the Soc#)
        WebElement removeID = wd.findElement(By.xpath(".//*[@id='CompanyOwner_DontHaveGovernmentID']"));
        removeID.click();
        
        //Physical Address Check
        WebElement address = wd.findElement(By.xpath(".//*[@id='Address']"));
        address.equals("182 Howard St. #207 San Francisco CA 94105");
        
        //Email address
        WebElement email = wd.findElement(By.xpath(".//*[@id='Email']"));
        email.equals("alansafahiccccccc@hotmail.com");
        
        //Primary Phone
        WebElement primPhone = wd.findElement(By.xpath(".//*[@id='Phone1']"));
        primPhone.equals("218.839.4596");
        
        //Second phone
        WebElement secPhone = wd.findElement(By.xpath(".//*[@id='Phone2']"));
        secPhone.equals("218.839.4596");
        
        
        //Save button
        WebElement save1 = wd.findElement(By.xpath(".//*[@id='company-owner']/div/input"));
        save1.click();
        
        
        
        //***********************CHANGE DATA TESTING ***********************
        //FN
        WebElement cfirstName = wd.findElement(By.xpath(".//*[@id='FirstName']"));
        cfirstName.clear();
        cfirstName.sendKeys("Thomas");
        
        //LN
        WebElement clastName = wd.findElement(By.xpath(".//*[@id='LastName']"));
        clastName.clear();
        clastName.sendKeys("Howard");
        
        //% of ownership
        WebElement cownership = wd.findElement(By.xpath(".//*[@id='PercentOfOwnership']"));
        cownership.clear();
        cownership.sendKeys("70");
        
    
       //Physical Address Check
        WebElement caddress = wd.findElement(By.xpath(".//*[@id='Address']"));
        caddress.clear();
        caddress.sendKeys("182 Cle Elum. #555 San Francisco CA 94122");
        
        //Email address
        WebElement cemail = wd.findElement(By.xpath(".//*[@id='Email']"));
        cemail.clear();
        cemail.sendKeys("thomashowardxxxxxxxxx@hotmail.com");
        
        //Primary Phone
        WebElement cprimPhone = wd.findElement(By.xpath(".//*[@id='Phone1']"));
        cprimPhone.clear();
        cprimPhone.sendKeys("6175551212");
        
        //Second phone
        WebElement csecPhone = wd.findElement(By.xpath(".//*[@id='Phone2']"));
        csecPhone.clear();
        csecPhone.sendKeys("6175551212");
        
        //Save button
        WebElement csave1 = wd.findElement(By.xpath(".//*[@id='company-owner']/div/input"));
        csave1.click();
       
        
        //***********************VERIFY CHANGED DATA TESTING ***********************
        //FN
        WebElement vfirstName = wd.findElement(By.xpath(".//*[@id='FirstName']"));
        vfirstName.equals("Thomas");
        
        //LN
        WebElement vlastName = wd.findElement(By.xpath(".//*[@id='LastName']"));
        vlastName.equals("Howard");
        
        //% of ownership
        WebElement vownership = wd.findElement(By.xpath(".//*[@id='PercentOfOwnership']"));
        vownership.equals("70");
        
       
        //Physical Address Check
        WebElement vaddress = wd.findElement(By.xpath(".//*[@id='Address']"));
        vaddress.equals("182 Cle Elum. #555 San Francisco CA 94122");
        
        //Email address
        WebElement vemail = wd.findElement(By.xpath(".//*[@id='Email']"));
        vemail.equals("thomashowardxxxxxxxxx@hotmail.com");
        
        //Primary Phone
        WebElement vprimPhone = wd.findElement(By.xpath(".//*[@id='Phone1']"));
        vprimPhone.equals("6175551212");
        
        //Second phone
        WebElement vsecPhone = wd.findElement(By.xpath(".//*[@id='Phone2']"));
        vsecPhone.equals("6175551212");
        
        //Click Save
        WebElement vsave = wd.findElement(By.xpath(".//*[@id='company-owner']/div/input"));
        vsave.click();
        
        
        Thread.sleep(3000);
        
        //***********************CHANGE DATA BACK TO ORIGINAL VALUES ***********************
        //FN
        WebElement cbfirstName = wd.findElement(By.xpath(".//*[@id='FirstName']"));
        cbfirstName.clear();
        cbfirstName.sendKeys("Alan");
        
        //LN
        WebElement cblastName = wd.findElement(By.xpath(".//*[@id='LastName']"));
        cblastName.clear();
        cblastName.sendKeys("Safahi");
        
        //% of ownership
        WebElement cbownership = wd.findElement(By.xpath(".//*[@id='PercentOfOwnership']"));
        cbownership.clear();
        cbownership.sendKeys("90");
        
       
        //Click Save
        WebElement cbsave = wd.findElement(By.xpath(".//*[@id='company-owner']/div/input"));
        cbsave.click();
       
        //Physical Address Check
        WebElement cbaddress = wd.findElement(By.xpath(".//*[@id='Address']"));
        cbaddress.clear();
        cbaddress.sendKeys("182 Howard St. #207 San Francisco CA 94105");
        
        //Email address
        WebElement cbemail = wd.findElement(By.xpath(".//*[@id='Email']"));
        cbemail.clear();
        cbemail.sendKeys("alansafahiccccccc@hotmail.com");
        
        //Primary Phone
        WebElement cbprimPhone = wd.findElement(By.xpath(".//*[@id='Phone1']"));
        cbprimPhone.clear();
        cbprimPhone.sendKeys("218.839.4596");
        
        //Second phone
        WebElement cbsecPhone = wd.findElement(By.xpath(".//*[@id='Phone2']"));
        cbsecPhone.clear();
        cbsecPhone.sendKeys("218.839.4596");
        
        //Click Save
        WebElement cbsave1 = wd.findElement(By.xpath(".//*[@id='company-owner']/div/input"));
        cbsave1.click();
        
        wd.close();
        
        
	}
}
