package steps;

import org.junit.Assert;

import base.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.DemoSitesPage;
import pages.LandingPage;
import pages.PracticeFormPage;



public class StepDefinition{
	
	private DriverFactory driverFactory;
	
	LandingPage      landingPage;
	DemoSitesPage    demoSitePage;
	PracticeFormPage practiceFormPage;
	
	public StepDefinition(DriverFactory driverFactory){
		this.driverFactory = driverFactory;
	}
	

	@Given("^the tester navigates to the selenium framework website$")
	public void the_tester_navigates_to_the_selenium_framework_website() throws Throwable{
		
		landingPage = new LandingPage(driverFactory);
		landingPage.navigatetoSeleniumframeworkPage();
	}
	
	@When("^the tester clicks on the Practice menu and selects demo sites$")
	public void the_tester_clicks_on_the_Practice_menu_and_selects_Demo_sites() throws Throwable {
		LandingPage  toDemoSite = landingPage.navigatetoSeleniumframeworkPage();
		toDemoSite.navigateToDemoSites();
	} 
	
	@Then("^the tester is directed to the Demo Sites Page$")
	public void the_tester_is_directed_to_the_Demo_Sites_Page() throws Throwable{
		Assert.assertEquals(new DemoSitesPage(driverFactory).getPageTitle(), "Selenium Framework | Demo Sites");
	}
	
	@When("^the tester clicks on the Practiceform link$") 
	public void the_tester_clicks_on_the_Practice_form_link()throws Throwable {
		demoSitePage = new DemoSitesPage(driverFactory);
		demoSitePage.navigateToPracticeFormPage();
	}
	
	@And("^the tester clicks on the new browser button$")
	public void the_tester_clicks_on_the_new_browser_button() throws Throwable {
		
		practiceFormPage = new PracticeFormPage(driverFactory);
		practiceFormPage.the_tester_clicks_on_the_new_browser_button();
	}
	
	@And("^a new window is launched$")
	public void a_new_window_is_launched() throws Throwable {
		practiceFormPage.a_new_window_is_launched();
    }
	
	@Then("^the tester verifies the new window appears$")
	public void the_tester_verifies_the_new_window_appears() throws Throwable {
		Assert.assertEquals(new PracticeFormPage(driverFactory).verify_the_new_window_appears()
		,"Selenium Framework | Selenium, Cucumber, Ruby, Java et al.");
	}
	
	@And("^close the new window$")
	public void close_the_new_window() throws Throwable {
		practiceFormPage.close_the_new_window();
	}
	
	@When("^the tester clicks on the new message button$")
	public void the_tester_clicks_on_the_new_message_button() throws Throwable {
		practiceFormPage.the_tester_clicks_on_the_new_message_button();
    }
	
	@When("^a new window appears$")
	public void a_new_window_appears() throws Throwable {
		practiceFormPage.a_new_window_appears();
	}

	@Then("^the tester verifies the text in the new window$")
	public void the_tester_verifies_the_text_in_the_new_window() throws Throwable {
		Assert.assertEquals(new PracticeFormPage(driverFactory).verify_the_text_in_the_new_window(),
		"This message window is only for viewing purposes");
		
		
	}
	@And("^the tester closes the text window$")
	public void the_closes_the_text_window() throws Throwable {
		practiceFormPage.close_the_text_window();
	}
	
	@When("^the tester clicks on the New Browser Tab button$")
	public void the_tester_clicks_on_the_New_Browser_Tab_button() throws Throwable {
		practiceFormPage.I_click_on_the_New_Browser_Tab_button();
		
	}
	
	@And("^a new tab window appears$")
	public void a_new_tab_window_appears() throws Throwable {
		practiceFormPage.a_new_tab_window_appears();
		
	}
	
	@Then("^the tester verifies the page title in the new page$")
	public void the_tester_verifies_the_page_title_in_the_new_page() throws Throwable {
		Assert.assertEquals(new PracticeFormPage(driverFactory).verify_the_new_window_appears()
		,"Selenium Framework | Selenium, Cucumber, Ruby, Java et al.");
	}
	
	@And("^closes the new tab$")
	public void closes_the_new_tab() throws Throwable {
		practiceFormPage.close_the_new_tab();
	}
	
	@When("^the tester clicks on the javascript button$")
	public void the_tester_clicks_on_the_javascript_button() throws Throwable {
		practiceFormPage.i_click_on_the_javascript_button();
	}

	@Then("^verifies the popup javascript text$")
	public void verifies_the_popup_javascript_text() throws Throwable {
		Assert.assertEquals("Please share this website with your friends and in your organization."
		, new PracticeFormPage(driverFactory).I_verify_JavaScript_popup_text());
	}

	
	@And("^the tester closes the javascript popup window$") 
	public void the_tester_closes_the_javascript_popup_window() throws Throwable{
		practiceFormPage.the_tester_closes_the_javascript_popup_window();
	}
	
		
	@And("^the tester closes the browser$")
	public void the_closes_the_browser()throws Throwable{
		driverFactory.closeDriver();
	}
}
