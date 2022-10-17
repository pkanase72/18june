package BasePackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass {
 public static void main(String[] args) throws InterruptedException, IOException {
	 Calendar cal=Calendar.getInstance(); //we should have to type this by self
		Date time=cal.getTime(); //method is available gettime method
		String timestamp=time.toString().replace(":", "-"); // to string method of date class is available
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(3000);
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE) ;

		File Dest=new File ("C:\\Users\\Dell\\Desktop\\testing\\screenshots\\"+timestamp+".jpg");
		FileHandler.copy(source, Dest);
		
	}
 public void fetchDataFromExcel(int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException {

 FileInputStream file = new FileInputStream("C:\\Users\\Dell\\Desktop\\testing\\Manual testing excel\\Fb_login.xlsx");
 
 String data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(15).getCell(1).getStringCellValue();
  
 System.out.println(data);
}
}	

