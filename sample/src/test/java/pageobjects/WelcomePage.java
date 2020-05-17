package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import base.base;

public class WelcomePage extends base {

	@FindBy(xpath = "//input[@name='userName']")
	public WebElement usernametxtbx;
	
	@FindBy(xpath = "//input[@name='password']")
	public WebElement passwordtxtbx;
	
	@FindBy(xpath = "//input[@name='login']")
	public WebElement signinbtn;

	@FindBy(xpath = "//img[@alt='Mercury Tours']")
	public WebElement mercurylogo;
	
	
	// initializing the Page Objects:
		public WelcomePage() {
			PageFactory.initElements(driver, this);
		}
				
		public String validateWelcomePageTitle() {
			return driver.getTitle();
		}

		public boolean validateMercuryLogo() {
			return mercurylogo.isDisplayed();
		}
		
		public FindFlightPage signIn(String username, String passward) {
			usernametxtbx.sendKeys(username);
			passwordtxtbx.sendKeys(passward);
			signinbtn.click();
			return new FindFlightPage();
		}
}
