package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class DriverFactory{
	
	protected static WebDriver driver;
	//All pages will inherit from this abstract page. Any page inheriting from this page will
	//get access to this class member variables
	
		public DriverFactory(){
			
		initialise();
		}
		
	public void initialise(){
			if(driver == null)
				createNewDriverInstance();
			}
			
		private void createNewDriverInstance(){
			
			ProfilesIni nwprfl = new ProfilesIni();
		    FirefoxProfile profile = nwprfl.getProfile("Selenium");
			driver = new FirefoxDriver(profile);
			driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		}	
		
		public WebDriver getDriver(){
			return driver;
		}
				
		public void closeDriver(){
			driver.quit();
		}
	}		
			

