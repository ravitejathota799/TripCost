@tag
Feature: Calculate Trip Cost in the trip advisor website Regression TestSuite

  @Regression
  Scenario: searching the hotels available in the respective area
    Given user captures all the list of available hotels in the respective area
    Then store it in excel sheet "<SheetName>"

  @Regression
  Scenario: cpaturing the forums from the trip advisor website
    Given user clicks on forums tab in the trip advisor website
    Then stores all the forums in the trip advisor website in the excel sheet

  @Regression
  Scenario: capturing the information about the flights in respective are
    Given user clicks on flights tab in the trip advisor website
    Then stores all the list of available flights information
