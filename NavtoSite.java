package UI;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavtoSite {
    public static void main(String[] args) throws Exception {
        FirefoxDriver wd;
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("https://www.cashpayment.com/");

        
        
        
        wd.close();
        
        
    }
}

        