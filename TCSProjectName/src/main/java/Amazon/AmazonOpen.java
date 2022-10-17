package Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonOpen {
	WebDriver driver;

	@FindBy(xpath="//input[@id='ap_password']")
	private WebElement passward;

	@FindBy(xpath="//input[@id='signInSubmit']")
	private WebElement signin;

	
	public AmazonOpen(WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver,this);
		
	}
	

public void enterpassward() {passward.sendKeys("priya@16");
	
}
public void clickonsignin() {signin.click();

}}
