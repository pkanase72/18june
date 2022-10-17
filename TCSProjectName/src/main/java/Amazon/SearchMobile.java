package Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchMobile {
	WebDriver driver;

	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	private WebElement search;
	
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	private WebElement search1;
	
	@FindBy(xpath="(//div[text()='Deal of the Day'])[1]")
	private WebElement mobile;

	public SearchMobile(WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver,this);
		
	}
	public void entersearch() { search.sendKeys("mobile");
		
	}
public void clickonsearch1() {search1.click();
	
}
public void clickonmobile() {mobile.click();
	
}



}
