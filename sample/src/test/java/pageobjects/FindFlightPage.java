package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.base;

public class FindFlightPage extends base {
	
	@FindBy(xpath = "//input[@name='findFlights']")
	public WebElement continuebtn ;

	@FindBy(xpath = "//img[@src='/images/masts/mast_flightfinder.gif']")
	public WebElement flightfinderheading  ;

	
	
	// initializing the Page Objects:
	public FindFlightPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Action methods
	public String validateFlightFindPageTitle() {
		return driver.getTitle();
	}

	public boolean validateFlightFinderHeading() {
		return flightfinderheading.isDisplayed() ;
		
	}
}
