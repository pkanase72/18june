package BasePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	static WebDriver driver;
	public static void launchBrowser(String browser){
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\updates105chrome\\chromedriver.exe");
			driver =new ChromeDriver();  //Browser launch
		}else if(browser.equalsIgnoreCase("firefox")) {
			
			
		}
		
		System.out.println("@BeforeClass");

		driver.manage().window().maximize();
		//implicit wait
		driver.get("https://www.amazon.in/your-account");
	}
		
		
		
		
}
