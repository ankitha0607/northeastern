
Feature: Northeastern canvas page
 
  Scenario: Window switch using northeastern page
    Given I open the northeastern university page
    When I click on the log in button
    Then I validate the canvas login page is displayed
