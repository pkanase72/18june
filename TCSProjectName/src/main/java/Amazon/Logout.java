package Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	WebDriver driver;
@FindBy(xpath="//span[text()='Account & Lists']")


	 WebElement accountAndList;

	@FindBy(xpath = "//span[text()='Sign Out']")
	private WebElement signout;

	public Logout(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void clickOnAccount() {
		Actions act=new Actions(driver);
act.moveToElement(accountAndList).click().build().perform();
	}

	public void signout() {
		signout.click();
	}

}
