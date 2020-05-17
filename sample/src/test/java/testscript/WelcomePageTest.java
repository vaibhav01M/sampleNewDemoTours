package testscript;

import pageobjects.FindFlightPage;
import pageobjects.WelcomePage;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.base;

public class WelcomePageTest extends base {

    WelcomePage welcomepage= new pageobjects.WelcomePage();
	FindFlightPage findflightpage ;
	
	@BeforeClass
	public void setup() {
		initialization();
	}
	
	@AfterClass
	public void closeBrowser() {
		tearDown();
	}
	
	
	@Test
	public void verifyMercuryLogo() {
		boolean presence = welcomepage.validateMercuryLogo();
		Assert.assertTrue(presence);
	}
	
	@Test
	public void verifyWelcomePage() {
	welcomepage.validateWelcomePageTitle();	
	}
}
