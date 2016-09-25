package pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import base.DriverFactory;
import utils.LocatorElement;

public class PracticeFormPage extends DriverFactory{
	
	private DriverFactory driverFactory;
	
	public PracticeFormPage(DriverFactory driverFactory) {
		PageFactory.initElements(driver, this);
		this.driverFactory = driverFactory;
	}
	
	LocatorElement locatorElement = new LocatorElement(driverFactory);
	
	public static String mainWinID;
	public static String newAdwinID;
	public static String jsTxt;
	
			
	public PracticeFormPage the_tester_clicks_on_the_new_browser_button() throws Throwable {
		locatorElement.newBrowserBtn.click();
		return new PracticeFormPage(driverFactory);
	}
	
	
	public LandingPage a_new_window_is_launched() throws Throwable {
		switchToNewWindow(); 
		return new LandingPage(driverFactory);
	}
	
	public String verify_the_new_window_appears() throws Throwable {
	    return driver.getTitle();
	}
	
	public void close_the_new_window() throws Throwable {
		driver.close();
	    driver.switchTo().window(mainWinID);
	    
	}
	
	public void the_tester_clicks_on_the_new_message_button() throws Throwable {
		locatorElement.newMessageBtn.click();
    }
	
	public void a_new_window_appears() throws Throwable {
		switchToNewWindow();
	}
	
	public String verify_the_text_in_the_new_window() throws Throwable {
		return locatorElement.bodyText.getText();
	}
	
	public void close_the_text_window() throws Throwable {
		driver.close();
	    driver.switchTo().window(mainWinID);
	    
	}
	
	
	public void I_click_on_the_New_Browser_Tab_button() throws Throwable {
		locatorElement.newBrowserTabBtn.click();
	}
	
	public void a_new_tab_window_appears() throws Throwable {
		switchToNewWindow();
		
	}
	
	
	public String verify_the_page_title_in_the_new_window() throws Throwable {
		return getDriver().getTitle();
	}
	
	
	public void close_the_new_tab() throws Throwable { 
		driver.close();
		driver.switchTo().window(mainWinID);
		
	}
	
	
	public void i_click_on_the_javascript_button() throws Throwable {
	    driver.findElement(By.cssSelector("#alert")).click();
	}

	
	public String I_verify_JavaScript_popup_text() throws Throwable {
		switchToJavaScriptWindowGetText();
		return switchToJavaScriptWindowGetText();
		
	}
	
	public void the_tester_closes_the_javascript_popup_window() throws Throwable {
		driver.switchTo().alert().accept();
		
		
	}
	
	
	public String switchToJavaScriptWindowGetText() throws InterruptedException{
		Alert alert = driver.switchTo().alert();
		jsTxt = alert.getText();
		return jsTxt;
		//alert.accept();
		//driver.switchTo().window(mainWinID);
		//driver.close();
		
	}
	
	
	public void switchToNewWindow(){
		Set<String> windowId = driver.getWindowHandles();
		Iterator<String> itererator = windowId.iterator();
		mainWinID = itererator.next();
        newAdwinID = itererator.next();
        driver.switchTo().window(newAdwinID);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
