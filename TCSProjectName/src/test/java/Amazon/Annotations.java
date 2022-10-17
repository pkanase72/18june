package Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations {
WebDriver driver; //declare global reference variables of all pom classes
	AmazonLogIn login;
	AmazonOpen open;
	SearchMobile search;
	Logout AmazonLogout; 
	@BeforeClass
	public void launchbrowser() {
		System.out.println("@BeforeClass");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\browser106\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/your-account");
		
		login=new AmazonLogIn(driver); //create objects of all pom classes and assign to global reference variable
	    open=new AmazonOpen(driver);
	    search=new SearchMobile(driver);
	    AmazonLogout=new Logout(driver);
	}
	@BeforeMethod
	public void loginprereq() {
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
   public void prelogout () {
	   System.out.println("@AfterMethod");
  }
   @BeforeMethod
   public void open() {
	   System.out.println("open");
		open.enterpassward();
		open.clickonsignin();
   }
	@Test
	public void TC02() {
		System.out.println("TC02");
	}
   @AfterMethod
   public void close() {
	   System.out.println("@AfterMethod");
  }
   @BeforeMethod
   public void search() {
	   System.out.println("@BeforeMethod");
	   search.entersearch();
		search.clickonsearch1();
		search.clickonmobile();
   }
	@Test
	public void TC03() {
		System.out.println("TC03");
	}
   @AfterMethod
   public void searchclose() {
	   System.out.println("searchclose");
   }
   
   @AfterClass
   public void closebrowser() {
	   System.out.println("@AfterClass");
	   
   }


	

}
