package Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AnazonLoginTestCase {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\browser106\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
Thread.sleep(2000);		
driver.get("https://www.amazon.in/your-account");
Thread.sleep(2000);


AmazonLogIn login=new AmazonLogIn(driver); 
login.clickonaccount();
login.enterusername();
login.clickoncontinuebutton();

AmazonOpen open=new AmazonOpen(driver);
	open.enterpassward();
	open.clickonsignin();
	
	SearchMobile search=new SearchMobile(driver);
	search.entersearch();
	search.clickonsearch1();
	search.clickonmobile();
		
Logout AmazonLogout=new Logout(driver);	
AmazonLogout.clickOnAccount();
AmazonLogout.signout();

	
	
	}

}
