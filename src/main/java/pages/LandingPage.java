package pages;

import org.openqa.selenium.support.PageFactory;

import base.DriverFactory;
import utils.LocatorElement;

public class LandingPage extends DriverFactory{

	private DriverFactory driverFactory;
	LocatorElement locatorElement = new LocatorElement(driverFactory);
	
	
	public LandingPage(DriverFactory driverFactory) {
		this.driverFactory = driverFactory;
		PageFactory.initElements(driver, this);
	}
	
		
	public LandingPage navigatetoSeleniumframeworkPage(){
		driver.navigate().to(locatorElement.landing_URL);
		return new LandingPage(driverFactory);
	}
	
	// navigate to Selenium Framework web site
	public DemoSitesPage navigateToDemoSites(){
		locatorElement.clickOnPracticeFormMenu.click();
		locatorElement.clickOnDemoSitesLink.click();
		return new DemoSitesPage(driverFactory);
	} 
	
	
}
