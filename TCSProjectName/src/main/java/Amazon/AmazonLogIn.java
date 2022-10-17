package Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLogIn {
WebDriver driver;
	
@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']")
private WebElement account;

@FindBy(xpath="//input[@class='a-input-text a-span12 auth-autofocus auth-required-field']")
private WebElement username;

@FindBy(xpath="//input[@id='continue']")
private WebElement continuebutton;
	



public AmazonLogIn(WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver,this);

}

public void clickonaccount() {account.click();
	
}
public void enterusername() {username.sendKeys("7523079696");
	
}
public void clickoncontinuebutton() {continuebutton.click();
	
}
	


	
	
	
}
