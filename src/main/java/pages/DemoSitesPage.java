package pages;

import base.DriverFactory;
import utils.LocatorElement;

public class DemoSitesPage extends DriverFactory{
	
	private DriverFactory driverFactory;
	LocatorElement locatorElement = new LocatorElement(driverFactory);
	
	public DemoSitesPage(DriverFactory driverFactory) {
		this.driverFactory = driverFactory;
	}
	
	public PracticeFormPage navigateToPracticeFormPage(){
		driver.navigate().to(locatorElement.demoSite_URL);
		return new PracticeFormPage(driverFactory);
	}
	
	public String getPageTitle(){
		return driver.getTitle();
	}
	
	
	
}