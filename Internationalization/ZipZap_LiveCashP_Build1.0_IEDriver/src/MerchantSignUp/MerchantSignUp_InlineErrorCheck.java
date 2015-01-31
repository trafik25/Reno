package MerchantSignUp;
import java.util.concurrent.TimeUnit;
//THIS TEST NEEDS TO BE COMPLETED***************************

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class MerchantSignUp_InlineErrorCheck {

	public static void main(String[] args) throws Exception {
        FirefoxDriver wd;
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("https://staging.cashpayment.com/");
        
      
        
        //Need to rewrite the test to check for inline errors
        
        
        //Click merchant sign up link
        WebElement merchantsignuplink = wd.findElement(By.xpath(".//*[@id='signUp_link']"));
        merchantsignuplink.click();
  
        //start test at merchant signup page***************************
        //MERCHANT ACCOUNT INFORMATION BOX
        WebElement merchantAcctInfo = wd.findElement(By.xpath(".//*[@id='form']/div/fieldset[1]/legend"));
        merchantAcctInfo.isDisplayed();
        
        //**************************FILLING IN USERNAME and REGISTERING
        //Merchant Account Information Box****************************
        //username
        WebElement username = wd.findElement(By.xpath(".//*[@id='Username']"));
        username.sendKeys("trafik25");
        
        //Click the Register Button
        WebElement register = wd.findElement(By.xpath(".//*[@id='register']"));
        register.click();
        
        Thread.sleep(5000);
        
        //Title Bar Error
        WebElement inlineErrorTitle = wd.findElement(By.xpath(".//*[@id='form']/div[1]/ul/li"));
        inlineErrorTitle.isDisplayed();
        
        //Password Error
        WebElement passwordCharsError = wd.findElement(By.xpath(".//*[@id='form']/div[2]/fieldset[1]/div[4]/span"));
        passwordCharsError.isDisplayed();
        
        //Confirm Password Error
        WebElement confirmPassAsterisk = wd.findElement(By.xpath(".//*[@id='form']/div[2]/fieldset[1]/div[6]/span"));
        confirmPassAsterisk.isDisplayed();
       
        //Company Legal Name Error
        WebElement compLegalNameAsterisk = wd.findElement(By.xpath(".//*[@id='form']/div[2]/fieldset[1]/div[8]/span"));
        compLegalNameAsterisk.isDisplayed();
        
        
         //COMPANY CONTACT BOX****************************
        //First Name Error
        WebElement firstNameasterisk = wd.findElement(By.xpath(".//*[@id='form']/div[2]/fieldset[2]/div[2]/span"));
        firstNameasterisk.isDisplayed();
        
        //Last Name Error
        WebElement lastNameasterisk = wd.findElement(By.xpath(".//*[@id='form']/div[2]/fieldset[2]/div[4]/span"));
        lastNameasterisk.isDisplayed();
        
        //Title Error
        WebElement titleAsterisk = wd.findElement(By.xpath(".//*[@id='form']/div[2]/fieldset[2]/div[6]/span"));
        titleAsterisk.isDisplayed();
        
        //Email Error
        WebElement emailAsterisk = wd.findElement(By.xpath(".//*[@id='form']/div[2]/fieldset[2]/div[8]/span"));
        emailAsterisk.isDisplayed();
        
        //Phone Error
        WebElement phoneAsterisk = wd.findElement(By.xpath(".//*[@id='form']/div[2]/fieldset[2]/div[10]/span"));
        phoneAsterisk.isDisplayed();
        
        
        //**************************FILLING IN PASSWORD and REGISTERING
        //Start Typing characters for Inline errors to show up**********************
   
        //Username Enter
        WebElement username1 = wd.findElement(By.xpath(".//*[@id='Username']"));
        username1.sendKeys("trafik25");
        
        //Password Enter
        WebElement password1 = wd.findElement(By.xpath(".//*[@id='Password']"));
        password1.sendKeys("apple220");
        
        //Register Click
        WebElement register1 = wd.findElement(By.xpath(".//*[@id='register']"));
        register1.click();
        
        Thread.sleep(5000);
        
        //Title Bar Error
        WebElement inlineErrorTitle1 = wd.findElement(By.xpath(".//*[@id='form']/div[1]/ul/li"));
        inlineErrorTitle1.isDisplayed();
        
        //Confirm Password Error
        WebElement confirmPassAsterisk1 = wd.findElement(By.xpath(".//*[@id='form']/div[2]/fieldset[1]/div[6]/span"));
        confirmPassAsterisk1.isDisplayed();
       
        //Company Legal Name Error
        WebElement compLegalNameAsterisk1 = wd.findElement(By.xpath(".//*[@id='form']/div[2]/fieldset[1]/div[8]/span"));
        compLegalNameAsterisk1.isDisplayed();
     
        
         //COMPANY CONTACT BOX****************************
        //First Name 
        WebElement firstNameasterisk1 = wd.findElement(By.xpath(".//*[@id='form']/div[2]/fieldset[2]/div[2]/span"));
        firstNameasterisk1.isDisplayed();
        
        //Last Name
        WebElement lastNameasterisk1 = wd.findElement(By.xpath(".//*[@id='form']/div[2]/fieldset[2]/div[4]/span"));
        lastNameasterisk1.isDisplayed();
        
        //Title
        WebElement titleAsterisk1 = wd.findElement(By.xpath(".//*[@id='form']/div[2]/fieldset[2]/div[6]/span"));
        titleAsterisk1.isDisplayed();
        
        //Email
        WebElement emailAsterisk1 = wd.findElement(By.xpath(".//*[@id='form']/div[2]/fieldset[2]/div[8]/span"));
        emailAsterisk1.isDisplayed();
        
        //Phone
        WebElement phoneAsterisk1 = wd.findElement(By.xpath(".//*[@id='form']/div[2]/fieldset[2]/div[10]/span"));
        phoneAsterisk1.isDisplayed();
        
        
        
        
        //**************************FILLING IN Confirm Password and REGISTERING
        //Username
        WebElement username2 = wd.findElement(By.xpath(".//*[@id='Username']"));
        username2.sendKeys("trafik25");
        
        //Password
        WebElement password2 = wd.findElement(By.xpath(".//*[@id='Password']"));
        password2.sendKeys("apple220");
        
        //Confirm Password
        WebElement confirmPassword = wd.findElement(By.xpath(".//*[@id='ConfirmPassword']"));
        confirmPassword.sendKeys("apple220");
        
        WebElement register3 = wd.findElement(By.xpath(".//*[@id='register']"));
        register3.click();
        
        Thread.sleep(5000);
        
        //Title Bar Error
        WebElement inlineErrorTitle2 = wd.findElement(By.xpath(".//*[@id='form']/div[1]/ul/li"));
        inlineErrorTitle2.isDisplayed();
      
       
        //Company Legal Name Error
        WebElement compLegalNameAsterisk2 = wd.findElement(By.xpath(".//*[@id='form']/div[2]/fieldset[1]/div[8]/span"));
        compLegalNameAsterisk2.isDisplayed();
    
        
         //COMPANY CONTACT BOX****************************
        //First Name Error
        WebElement firstNameasterisk2 = wd.findElement(By.xpath(".//*[@id='form']/div[2]/fieldset[2]/div[2]/span"));
        firstNameasterisk2.isDisplayed();
        
        //Last Name Error
        WebElement lastNameasterisk2 = wd.findElement(By.xpath(".//*[@id='form']/div[2]/fieldset[2]/div[4]/span"));
        lastNameasterisk2.isDisplayed();
         
        //Title Error
        WebElement titleAsterisk2 = wd.findElement(By.xpath(".//*[@id='form']/div[2]/fieldset[2]/div[6]/span"));
        titleAsterisk2.isDisplayed();
        
        //Email Error
        WebElement emailAsterisk2 = wd.findElement(By.xpath(".//*[@id='form']/div[2]/fieldset[2]/div[8]/span"));
        emailAsterisk2.isDisplayed();
        
        //Phone Error
        WebElement phoneAsterisk2 = wd.findElement(By.xpath(".//*[@id='form']/div[2]/fieldset[2]/div[10]/span"));
        phoneAsterisk2.isDisplayed();
        
        
        //**************************FILLING IN COMPANY LEGAL NAME and REGISTERING
      //Username Enter
        WebElement username3 = wd.findElement(By.xpath(".//*[@id='Username']"));
        username3.sendKeys("trafik25");
        
        //Password Enter
        WebElement password4 = wd.findElement(By.xpath(".//*[@id='Password']"));
        password4.sendKeys("apple220");
        
        //Confirm Password Enter
        WebElement confirmPassword2 = wd.findElement(By.xpath(".//*[@id='ConfirmPassword']"));
        confirmPassword2.sendKeys("apple220");
        
        //Company Legal Name Enter
        WebElement compLegalName = wd.findElement(By.xpath(".//*[@id='CompanyLegalName']"));
        compLegalName.sendKeys("ABC Company");
        
        //Register Click
        WebElement register2 = wd.findElement(By.xpath(".//*[@id='register']"));
        register2.click();
        
        Thread.sleep(5000);
        
        //Title Bar Error
        WebElement inlineErrorTitle3 = wd.findElement(By.xpath(".//*[@id='form']/div[1]/ul/li"));
        inlineErrorTitle3.isDisplayed();
   
         //COMPANY CONTACT BOX****************************
        //First Name Error
        WebElement firstNameasterisk3 = wd.findElement(By.xpath(".//*[@id='form']/div[2]/fieldset[2]/div[2]/span"));
        firstNameasterisk3.isDisplayed();
        
        //Last Name Error
        WebElement lastNameasterisk3 = wd.findElement(By.xpath(".//*[@id='form']/div[2]/fieldset[2]/div[4]/span"));
        lastNameasterisk3.isDisplayed();
        
        //Title Error
        WebElement titleAsterisk4 = wd.findElement(By.xpath(".//*[@id='form']/div[2]/fieldset[2]/div[6]/span"));
        titleAsterisk4.isDisplayed();
        
        //Email Error
        WebElement emailAsterisk5 = wd.findElement(By.xpath(".//*[@id='form']/div[2]/fieldset[2]/div[8]/span"));
        emailAsterisk5.isDisplayed();
        
        //Phone Error
        WebElement phoneAsterisk5 = wd.findElement(By.xpath(".//*[@id='form']/div[2]/fieldset[2]/div[10]/span"));
        phoneAsterisk5.isDisplayed();
        
        
        //**************************FILLING IN FIRST NAME  and REGISTERING
        //Username Enter
          WebElement username4 = wd.findElement(By.xpath(".//*[@id='Username']"));
          username4.sendKeys("trafik25");
          
          //Password Enter
          WebElement password6 = wd.findElement(By.xpath(".//*[@id='Password']"));
          password6.sendKeys("apple220");
          
          //Confirm Password Enter
          WebElement confirmpassword3 = wd.findElement(By.xpath(".//*[@id='ConfirmPassword']"));
          confirmpassword3.sendKeys("apple220");
          
          //Company Legal Name Enter
          WebElement compLegalName1 = wd.findElement(By.xpath(".//*[@id='CompanyLegalName']"));
          compLegalName1.sendKeys("ABC Company");
          
          //Company First Name Enter
          WebElement firstName = wd.findElement(By.xpath(".//*[@id='ContactFirstName']"));
          firstName.sendKeys("Thomas");
          
          //Register Click
          WebElement register4 = wd.findElement(By.xpath(".//*[@id='register']"));
          register4.click();
          
          Thread.sleep(5000);
          
          //Title Bar Error
          WebElement inlineErrorTitle4 = wd.findElement(By.xpath(".//*[@id='form']/div[1]/ul/li"));
          inlineErrorTitle4.isDisplayed();
     
           //COMPANY CONTACT BOX****************************
        
          //Last Name Error
          WebElement lastNameasterisk4 = wd.findElement(By.xpath(".//*[@id='form']/div[2]/fieldset[2]/div[4]/span"));
          lastNameasterisk4.isDisplayed();
          
          //Title Error
          WebElement titleAsterisk5 = wd.findElement(By.xpath(".//*[@id='form']/div[2]/fieldset[2]/div[6]/span"));
          titleAsterisk5.isDisplayed();
          
          //Email Error
          WebElement emailAsterisk6 = wd.findElement(By.xpath(".//*[@id='form']/div[2]/fieldset[2]/div[8]/span"));
          emailAsterisk6.isDisplayed();
          
          //Phone Error
          WebElement phoneAsterisk6 = wd.findElement(By.xpath(".//*[@id='form']/div[2]/fieldset[2]/div[10]/span"));
          phoneAsterisk6.isDisplayed();
        
        
          //**************************FILLING IN LAST NAME and REGISTERING
          //Username Enter
            WebElement username5 = wd.findElement(By.xpath(".//*[@id='Username']"));
            username5.sendKeys("trafik25");
            
            //Password Enter
            WebElement password7 = wd.findElement(By.xpath(".//*[@id='Password']"));
            password7.sendKeys("apple220");
            
            //Confirm Password Enter
            WebElement confirmpassword4 = wd.findElement(By.xpath(".//*[@id='ConfirmPassword']"));
            confirmpassword4.sendKeys("apple220");
            
            //Company Legal Name Enter
            WebElement compLegalName2 = wd.findElement(By.xpath(".//*[@id='CompanyLegalName']"));
            compLegalName2.sendKeys("ABC Company");
            
            //Company First Name Enter
            WebElement firstName1 = wd.findElement(By.xpath(".//*[@id='ContactFirstName']"));
            firstName1.sendKeys("Thomas");
            
          //Company Last Name Enter
            WebElement lastName = wd.findElement(By.xpath(".//*[@id='ContactLastName']"));
            lastName.sendKeys("Howard");
            
            
            //Register Click
            WebElement register5 = wd.findElement(By.xpath(".//*[@id='register']"));
            register5.click();
            
            Thread.sleep(5000);
            
            //Title Bar Error
            WebElement inlineErrorTitle5 = wd.findElement(By.xpath(".//*[@id='form']/div[1]/ul/li"));
            inlineErrorTitle5.isDisplayed();
       
             //COMPANY CONTACT BOX****************************
           
            //Title Error
            WebElement titleAsterisk6 = wd.findElement(By.xpath(".//*[@id='form']/div[2]/fieldset[2]/div[6]/span"));
            titleAsterisk6.isDisplayed();
            
            //Email Error
            WebElement emailAsterisk7 = wd.findElement(By.xpath(".//*[@id='form']/div[2]/fieldset[2]/div[8]/span"));
            emailAsterisk7.isDisplayed();
            
            //Phone Error
            WebElement phoneAsterisk7 = wd.findElement(By.xpath(".//*[@id='form']/div[2]/fieldset[2]/div[10]/span"));
            phoneAsterisk7.isDisplayed();
        
            
            //**************************FILLING IN TITLE and REGISTERING
            //Username Enter
              WebElement username6 = wd.findElement(By.xpath(".//*[@id='Username']"));
              username6.sendKeys("trafik25");
              
              //Password Enter
              WebElement password8 = wd.findElement(By.xpath(".//*[@id='Password']"));
              password8.sendKeys("apple220");
              
              //Confirm Password Enter
              WebElement confirmpassword5 = wd.findElement(By.xpath(".//*[@id='ConfirmPassword']"));
              confirmpassword5.sendKeys("apple220");
              
              //Company Legal Name Enter
              WebElement compLegalName3 = wd.findElement(By.xpath(".//*[@id='CompanyLegalName']"));
              compLegalName3.sendKeys("ABC Company");
              
              //Company First Name Enter
              WebElement firstName2 = wd.findElement(By.xpath(".//*[@id='ContactFirstName']"));
              firstName2.sendKeys("Thomas");
              
              //Company Last Name Enter
              WebElement lastName1 = wd.findElement(By.xpath(".//*[@id='ContactLastName']"));
              lastName1.sendKeys("Howard");
              
              //Title Enter
              WebElement title = wd.findElement(By.xpath(".//*[@id='ContactTitle']"));
              title.sendKeys("CEO");
              
              //Register Click
              WebElement register6 = wd.findElement(By.xpath(".//*[@id='register']"));
              register6.click();
              
              Thread.sleep(5000);
              
              //Title Bar Error
              WebElement inlineErrorTitle6 = wd.findElement(By.xpath(".//*[@id='form']/div[1]/ul/li"));
              inlineErrorTitle6.isDisplayed();
         
               //COMPANY CONTACT BOX****************************
           
              //Email Error
              WebElement emailAsterisk8 = wd.findElement(By.xpath(".//*[@id='form']/div[2]/fieldset[2]/div[8]/span"));
              emailAsterisk8.isDisplayed();
              
              //Phone Error
              WebElement phoneAsterisk8 = wd.findElement(By.xpath(".//*[@id='form']/div[2]/fieldset[2]/div[10]/span"));
              phoneAsterisk8.isDisplayed();
          
            

              //**************************FILLING IN TITLE and REGISTERING
              //Username Enter
                WebElement username7 = wd.findElement(By.xpath(".//*[@id='Username']"));
                username7.sendKeys("trafik25");
                
                //Password Enter
                WebElement password9 = wd.findElement(By.xpath(".//*[@id='Password']"));
                password9.sendKeys("apple220");
                
                //Confirm Password Enter
                WebElement confirmpassword6 = wd.findElement(By.xpath(".//*[@id='ConfirmPassword']"));
                confirmpassword6.sendKeys("apple220");
                
                //Company Legal Name Enter
                WebElement compLegalName4 = wd.findElement(By.xpath(".//*[@id='CompanyLegalName']"));
                compLegalName4.sendKeys("ABC Company");
                
                //Company First Name Enter
                WebElement firstName3 = wd.findElement(By.xpath(".//*[@id='ContactFirstName']"));
                firstName3.sendKeys("Thomas");
                
                //Company Last Name Enter
                WebElement lastName2 = wd.findElement(By.xpath(".//*[@id='ContactLastName']"));
                lastName2.sendKeys("Howard");
                
                //Title Enter
                WebElement title1 = wd.findElement(By.xpath(".//*[@id='ContactTitle']"));
                title1.sendKeys("CEO");
                
                //Email Enter
                WebElement email = wd.findElement(By.xpath(".//*[@id='ContactEmailAddress']"));
                email.sendKeys("thomashoward206@gmail.com");
                
                //Register Click
                WebElement register7 = wd.findElement(By.xpath(".//*[@id='register']"));
                register7.click();
                
                Thread.sleep(5000);
                
                //Title Bar Error
                WebElement inlineErrorTitle7 = wd.findElement(By.xpath(".//*[@id='form']/div[1]/ul/li"));
                inlineErrorTitle7.isDisplayed();
           
                 //COMPANY CONTACT BOX****************************
             
                //Phone Error
                WebElement phoneAsterisk9 = wd.findElement(By.xpath(".//*[@id='form']/div[2]/fieldset[2]/div[10]/span"));
                phoneAsterisk9.isDisplayed();
            
            
              //**************************FILLING IN TITLE and REGISTERING
                //Username Enter
                  WebElement username8 = wd.findElement(By.xpath(".//*[@id='Username']"));
                  username8.sendKeys("trafik25");
                  
                  //Password Enter
                  WebElement password10 = wd.findElement(By.xpath(".//*[@id='Password']"));
                  password10.sendKeys("apple220");
                  
                  //Confirm Password Enter
                  WebElement confirmpassword7 = wd.findElement(By.xpath(".//*[@id='ConfirmPassword']"));
                  confirmpassword7.sendKeys("apple220");
                  
                  //Company Legal Name Enter
                  WebElement compLegalName5 = wd.findElement(By.xpath(".//*[@id='CompanyLegalName']"));
                  compLegalName5.sendKeys("ABC Company");
                  
                  //Company First Name Enter
                  WebElement firstName4 = wd.findElement(By.xpath(".//*[@id='ContactFirstName']"));
                  firstName4.sendKeys("Thomas");
                  
                  //Company Last Name Enter
                  WebElement lastName3 = wd.findElement(By.xpath(".//*[@id='ContactLastName']"));
                  lastName3.sendKeys("Howard");
                  
                  //Title Enter
                  WebElement title2 = wd.findElement(By.xpath(".//*[@id='ContactTitle']"));
                  title2.sendKeys("CEO");
                  
                  //Email Enter
                  WebElement email1 = wd.findElement(By.xpath(".//*[@id='ContactEmailAddress']"));
                  email1.sendKeys("thomashoward206@gmail.com");
                  
                  //Phone Enter
                  WebElement phone = wd.findElement(By.xpath(".//*[@id='ContactPrimaryPhone']"));
                  phone.sendKeys("2483551212");
                  
                  
               
             
                  Thread.sleep(5000);
                  
                  
        
        wd.close();
        
        //End testing
        
       
        
       }
           
          

       	    
       	}
       	