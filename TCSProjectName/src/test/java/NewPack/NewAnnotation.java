package NewPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Amazon.AmazonLogIn;
import Amazon.AmazonOpen;
import Amazon.SearchMobile;

public class NewAnnotation {
	WebDriver driver; //declare global reference variables of all pom classes
	AmazonLogIn login;
	AmazonOpen open;
	SearchMobile search;
	
	@BeforeClass
	public void launchbrowser() {
		System.out.println("@BeforeClass");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\updates105chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/your-account");
		
		login=new AmazonLogIn(driver); //create objects of all pom classes and assign to global reference variable
	    open=new AmazonOpen(driver);
	    search=new SearchMobile(driver);
	}
	@BeforeMethod
	public void login() {
	System.out.println("@BeforeMethod");	
	    login.clickonaccount();
		login.enterusername();
		login.clickoncontinuebutton();
	}
	
	@Test
	public void TC01() {
		System.out.println("TC01");
	}

   @AfterMethod
   public void logout() {
	   System.out.println("@AfterMethod");
  }
   @BeforeMethod
   public void open() {
	   open.enterpassward();
	   open.clickonsignin();
	   
   }
   @Test
   public void TC02() {
	   System.out.println("TC02");
	   
   }
   @AfterMethod
   public void log() {
	   System.out.println("close");
   }
   
   
   @AfterClass
   public void closebrowser() {
	   System.out.println("@AfterClass");
	   
   }


}
