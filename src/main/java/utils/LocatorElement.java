package utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.DriverFactory;

public class LocatorElement extends DriverFactory{

	public DriverFactory driverFactory;
	
	public LocatorElement(DriverFactory driverFactory){
		this.driverFactory = driverFactory;
		PageFactory.initElements(driver, this);
	}
	
	public final String landing_URL = "http://www.seleniumframework.com/";
	public final String demoSite_URL = "http://seleniumframework/Practiceform";
	
	
	@FindBy(xpath = "//*[@id='button1']")
	public WebElement newBrowserBtn;
	
	@FindBy(xpath = "//button[@onclick='newMsgWin()']")
	public WebElement newMessageBtn;
	
	@FindBy(tagName = "body")
	public WebElement bodyText;
	
	@FindBy(xpath = "//*[@id='content']/div[2]/div[2]/div/div[1]/div/p[4]/button")
	public WebElement newBrowserTabBtn;
	
	@FindBy(css = "#alert")
	public WebElement javaScriptBtn;
	
	@FindBy(linkText = "PRACTICE")
	public WebElement clickOnPracticeFormMenu;
	
	@FindBy(xpath = "//*[@id='main-nav']/li[3]/ul/li[2]/a/span")
	public WebElement clickOnDemoSitesLink;
	
}
