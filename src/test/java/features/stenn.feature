Feature: Practice Form Page button functionality check
  As an automation tester, 
  I want to navigate to the selenium framework website,
  so that I can check that the New Browser Window, New Message Window, New Browser Tab and
  the Alert Box buttons function correctly on the Practice Form Page

  Background: I am on the demo site

  Scenario: Automation tester checks various button functionality on the Practice Form page
    Given the tester navigates to the selenium framework website
    When the tester clicks on the Practice menu and selects demo sites
    Then the tester is directed to the Demo Sites Page
    And the tester clicks on the Practiceform link
    And the tester clicks on the new browser button
    And a new window is launched
    Then the tester verifies the new window appears
    And close the new window
    When the tester clicks on the new message button
    And a new window appears
    Then the tester verifies the text in the new window
    And the tester closes the text window
    When the tester clicks on the New Browser Tab button
    And a new tab window appears
    Then the tester verifies the page title in the new page 
    And closes the new tab 
    And the tester clicks on the javascript button 
    And verifies the popup javascript text
    And the tester closes the javascript popup window
    And the tester closes the browser
 