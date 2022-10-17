package pack1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewClass1 {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		/*System.out.println("maven");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href=\"tryit.asp?filename=tryjs_alert\"]")).click();
		Thread.sleep(2000);*/
		
		 FileInputStream file = new FileInputStream("C:\\Users\\Dell\\Desktop\\testing\\Manual testing excel\\Fb_login.xlsx");
		  
	     String data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(15).getCell(1).getStringCellValue();
		  
		 System.out.println(data);
		 
		 
		
	}

}
